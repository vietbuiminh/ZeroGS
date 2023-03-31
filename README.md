# Zero: A Project for Solution Challenge 2023

![zero.PNG](Zero%20Problem%20Statement%20c4766c2a307c4826a6372a0ae614d716/zero.png)

![Untitled](Zero%20Problem%20Statement%20c4766c2a307c4826a6372a0ae614d716/screenshot.png)

Zero is a community based supporting app where people come to find the latest donation in their local area. They can also notifying everyone with their donation through this app. This is targeting the Zero Hunger and Zero Waste of the United Nation 17 Development Goal in particularly with the problem of food insecurity, and fast fashion with waste in old clothings. 

## How to run the app
- Clone or fork the project to your local environment (Android Studio).
- You'll need a billing account. Create one here [Google Cloud](https://console.cloud.google.com/billing).
- Create a new project in cloud console [Google Cloud](https://console.cloud.google.com/). Once its created switch to that project.
- Go to marketplace and enable google maps SDK for the new project [Market place](https://console.cloud.google.com/marketplace).
-- "Maps SDK for Android"
-- Enable billing through the billing account your created
-- Enable google maps in cloud console
- Specify "Android apps" and generate a SHA1 to restrict the Maps API only for the app.
- Navigate to Gradle Scripts in inside ZeroGS, and make sure to add your API key to `local.properties`.
```
MAPS_API_KEY = [YOUR_API_KEY]
```
- Be sure that your Android Studio is the latest version


## About Zero
Zero is a community-based support app where people come to find the latest donations in their local area. They can also notify everyone about their donation through this app. This is targeting the Zero Hunger and Zero Waste goals of the United Nations 17 Development Goals, in particular with the problems of food insecurity and fast fashion with waste in old clothing.
On the homepage, users can look up information about different local neighborhoods that provide donations. The details will show the name, address, and contact information of the donors, as well as the time to expect donations. When the donor-recipient hits save, the item will be saved in the history to keep track, and the donors will receive notifications. On the donate page, we have a form where donors can upload information and images of products they want to give out. Next, we have the map page, where users can find nearby charities that receive or give donations, such as churches or colleges. The profile page is where we receive notifications, do ratings, and set up our information.

Zero offers a user-friendly and effective solution for reducing food and clothing waste while helping those in need. We believe that our app has the potential to make a positive impact on communities and the environment.
