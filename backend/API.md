# API notes

Trying to design the API a bit, so I can get enough working.

## Meeting details

| method| path | notes |
| --:| -- | -- |
GET | `/meetings` | List Meetings (open and closed)
GET | `/meetings/#id` | meeting details
GET | `/meetings/#id/attendees` | list people imported from meetup
POST | `/meetings/#id/attendees` | add an attendee
PUT | `/meetings/#id/attendees/#id` | update an attendee (mostly not-present, or data correction)
  

## import meeting

| method| path | notes |
| --:| -- | -- |
POST | `/importMeeting` | import a meeting from meetup

## giveaway

| method| path | notes |
| --:| -- | -- |
POST | `/meetings/#id/giveaway` | create the giveaway, can no longer add attendees
GET | `/meetings/#id/giveaway` | current state of this meeting's giveaway
PUT | `/meetings/#id/giveaway` | update the giveaway (mostly to complete)

## prizes in a giveaway

| method| path | notes |
| --:| -- | -- |
GET | `/meetings/#id/giveaway/prizes` | list all prizes
POST | `/meetings/#id/giveaway/prizes` | add another prize (only for this giveaway)
PUT | `/meetings/#id/giveaway/prizes/#id` | update a prize, only for this giveaway
DELETE | `/meetings/#id/giveaway/prizes/#id` | remove a prize, only for this giveaway

## winners of prizes in a giveaway
| method| path | notes |
| --:| -- | -- |
PUT | `/meetings/#id/giveaway/prizes/#id/attendees/#id` | update prize winner (not necessary?) Did not want?
GET | `/meetings/#id/giveaway/prizes/#id/attendees` | list attendees of this meeting that can win this prize
DELETE | `/meetings/#id/giveaway/prizes/#id/attendees` | remove winner from prize (maybe with did-not-want?) (not present?)
POST | `/meetings/#id/giveaway/prizes/#id/attendees` | put a winner on that prize (might overload to also mark as did not want, and not present)

