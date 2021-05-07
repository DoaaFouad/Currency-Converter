# Currency-Converter
Demonstrative project for a hiring process challenge.

Currency-Converter; android application written in Kotlin that consumes data from the fixer.io API https://fixer.io/ . 

<img src="https://serving.photos.photobox.com/02455981fbf5721e3fc0faab879baed2069e5fa728f0240282afa3ccb56fc17460323255.jpg" width="200" height="400" /> <img src="https://serving.photos.photobox.com/22687403ca7c3a386453d7adebd738377ac230cd8696bd73a2651b7698911ab18373b5f2.jpg" width="200" height="400" />

## Features
- Displaying currency rates (Base Currency is EUR).
- User can tap on any rate to calculate and convert amounts against the base currency.

## App Architecture
MVI Clean Architecture

<img src="https://miro.medium.com/max/841/1*u6DY_91Uu6RhwPfaeftggQ.png" width="600" height="400" />
** Above diagram demonstrates Model-View-Intent flow **

## Project modules
- remote => For handling remote data source.
- repository => For handling data operations.
- presentation => For ViewModels and Contracts
- ui => For UI related classes, Activies/fragment/bottomsheets.


## Libraries references
#### Dependency Injection
- Koin: [https://github.com/InsertKoinIO/koin](https://github.com/InsertKoinIO/koin)
#### Asynchronous programming
- Kotlin Coroutines and Flow : 
https://developer.android.com/kotlin/coroutines 

https://developer.android.com/kotlin/flow
#### Networking
- Retrofit:  [https://github.com/square/retrofit](https://github.com/square/retrofit)
- Gson:  [https://github.com/google/gson](https://github.com/google/gson)
- OKhttp:  [https://github.com/square/okhttp](https://github.com/square/okhttp)

## Future work
- UI tests
