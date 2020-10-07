# Fremtind, oppgave: Smartbil
 
## oppgve 1 :rocket: ##

![alt text](https://github.com/Fridthoy/Fremtind/blob/master/pictures/klassediagram.png)


Diagrammet over viser min løsning på hvilke klasser jeg ville laget for å å kunne vise 
dataene til denne applikasjonen.

### om koden: ### 
Programmet er programmert i java, dette fordi at det er oversiktlig for OOP
(samt at jeg har hørt at fremtind bruker dette programerinsspråket). 

Jeg tar utgangspunkt i at jeg får denne informasjonen fra API-er (som jeg vet er en mulighet for IOS og android): 

* fart
* retning
* posisjon
* fartsgrense
* vær
* mobilbruk

Car objektet vil lagre informasjon når fart > 10(km/t), når Car objektet har stått stille (fart = 0)
i en periode vil Ride objektet bli oppdatert på dette ved hjelp av grensesnittet "EventListener". 
Deretter vil Ride objektet kjøre en analyse ved hjelp av informasjon fra car objectet, men også 
informasjon fra Enviroment objektet. 

Detaljert beskrivelse er kommentert i koden. 


 
## oppgve 2 :traffic_light: ##

For å ivareta universiell utfoming er det viktig at appen er brukervennlig for hele 
befolkningen, dette inkluderer folk med funksjonshemninger. 

Kort så vil det være viktig å ha tydlige kontraster som skiller tekst og bakgrunn. 
Det vil også være viktig å ha en plattform som er brukervennlig og lett å bruke 
for en effektiv og behagelig opplevelse. 

Man kan se på 4 grupper for å skape en universiell utformet applikasjon 

* oppfatning
    - informasjon om hvordan appliksjonen fungerer må være lett 
    tilgjengelig for brukeren. Det burde også være en tydelig kontrast mellom 
    tekst og bakgrunn.
* funksjonalitet 
    - Enkelt å navigere gjennom apliksjonen, ikke for mye effekter, 
    lett adgang til informasjon om "Rides". 
* forståelighet
    - Elementene i appliksjonen er ikke misledende, feil ved appliksjonen kommer 
    tydlig fram 
* pålitlighet
    - Ulike plattformen må ha samme kvalitet (IOS/Android). 
    

## oppgve 3 :car: ##

Funkjsonene som mobil-appliksjon hadde vil naturligvis ikke være nødvending å ha i en web-appliksjon.
(Ikke veldig normalt å kjøre bil med PC-en sin). Derfor kan man fjerne mange funsjoneliteter 
på en webapliksjon. Webapliksjonen kan være dedikert til å vise hvilke turer man har gjort og "score"
til dedikerte turer, samt en overordnet "score" til din profil. 

Generelt må det bli programmert en ny applikasjon som må tilegne seg til å være på PC. 
Kan eventuelt også kunne åpnes på telefonen sin nettleser, uansett så må det programmeres slik at appliksjonen 
tilpasser seg hvilken plattform som blir brukt. 
