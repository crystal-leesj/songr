# songr

## Feature Tasks
As you work on these feature tasks, remember to consider your basic application setup. What classes should you create? How should they be related?

- Ensure that you can run the Spring app.
- Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
- Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
- Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
- Create an Album class to act as a model in our app.
- An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
- Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

## How to run application
Run the application in SongApplication.
Then visit http://localhost:8080/hello to see the welcome message.
Then visit http://localhost:8080/capitalize/{this is Kinda Capitalized} to see the calpitalized words.
Then visit http://localhost:8080/albums to see the list of album information.

### Add an album to database
From http://localhost:8080/albums, add these example inputs in the form.
Title = Any Song
Artist = Zico
Song Count = 12
Length = 215000
Image URL = https://1409791524.rsc.cdn77.org/data/thumbs/full/540454/650/0/0/0/zico-unveils-new-concept-concept-photo.jpg
Then the album will be displayed on top of the page.
