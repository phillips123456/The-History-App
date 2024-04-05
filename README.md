# The-History-App
1.	REPORT 

The purpose of this application (App) is for students to match peoples ages to the ages of different people in History that have passed away, and to make sure the application is running and working on GitHub when you have implemented GitHub actions for automated testing and building.  

With such a bright and classy design with that background showing a compass, a big heading with such a bright colour, two buttons with bright colours too, it is not designed only fun for students but also for educational purposes. The application is easy to use and designed to inspire young minds. 

 

 

2		CREATING THE APP & UI 

I firstly logged onto my Virtual Machine on Azure Lab Services and opened Android Studio. 

 

. 

 

 

 

 Upon opening it, I created a New Project by clicking Empty Views Activity then, Finish. 

 

It then showed me and empty UI. Then I started with my project by going to Google and searching for History Images for my background on the App so it can look interesting 

 I found the image then I saved it on my files, after that I went back to Android Studio and I inserted in on the UI background by copying it to the Drawables folder and named it background, after doing that I went to activity_main.xml and just under (layout height: “match parent) I entered background and the name of the image, and from the Drawables folder I clicked the image then it appeared on the UI background.  

 

I then created the Header of my Application by dragging the TextView onto the UI, Then I gave it a good id (tvHeader) then refactored, changed the text from TextView to The History App. I then put constraints on the Layout Attributes folder, changed the font by typing fontfamily on the Attributes, changed the colour and text size of the text, Changed the theme of the text, and I centered the text on the UI at the top by clicking ‘center’ when you type gravity on the Attributes. 

 

Secondly I dragged the Number (Numeric) onto the UI and gave a good id(etEnterAge) then refactored, inserted the ‘Enter Age’ hint, changed the colour and text size of the text hint to make it visible, placed it on the center, put constraints on it, changed the font, and lastly centered the text hint. 

 

Thirdly I dragged the two buttons onto the UI and gave them good ids(btnGenerate & btnClear) and refactored the IDs, put constraints on them, changed the font, changed the button colours, then changed the texts inside of the buttons from ‘Button’ to ‘Generate History’ and ‘Clear’. 

 

 

Lastly I dragged the TextView text onto the bottom of the UI under the two buttons to display the results and made it larger so that the results could be clear and visible and also change the font and colour of the text, and also gave it an ID(tvResults) too. 

After doing all that I went back to my code in the activity_main.xml and I extracted my strings on every highlighted code in the UI. 

 

 

 

After that I moved to activity.main.xml and started with my declarations. I started by declaring the Enter Age EditText, then I declared the two buttons Generate History and Clear, and lastly I declared the results as tvResults to display the results. 

I then made an action on the clear button so it can clear the Age entered by setting On the Click Listener, when a student or anyone clicks the button. Then I made an action on the Generate History button so it can generate the ages and the history people who died and matches them with the ages of the users, under it I then declared my message variable and equated it to a string, after that I started with the WHEN statement where I converted my age to a String. Then after that I started entering the Age messages of the History people which are Ten people from history who died. After the Age messages I did my ELSE statement message where the invalid text will be displayed when a user enters the ages that are not in the age range from 20 to 100 that have been chosen. 

In another scoop I concluded by entering the tvResults to display the message. 

 

 

THE TEN HISTORY PEOPLE WHO DIED. 

Referencing. 

1. MICHAEL JACKSON was an American singer, songwriter, dancer, and philanthropist. Known as the "King of Pop", he is regarded as one of the most significant cultural figures of the 20th century(Wikipedia, 2024) 
![image](https://github.com/phillips123456/The-History-App/assets/163407311/db46958b-c882-4a8c-aa41-336796a29372)

Figure 1: Michael Jackson. (fanpop, 2024) 

 

2. OLIVER TAMBO was a South African anti-apartheid politician and activist who served as President of the African National Congress (ANC) from 1967 to 1991 (Wikipedia, 2024).  
![image](https://github.com/phillips123456/The-History-App/assets/163407311/ee66dc17-91c3-4f68-989b-bd7c3ef27408)

Figure 2: Oliver Tambo. (Wikipedia, 2024) 

3. LEBO MATHOSA was a South African kwaito singer. Mathosa started her career as a founding member of the popular South African band Boom Shaka in 1994 at the age of 17, after she caught the eye of music producer Don Laka at a club in Johannesburg (Wikipedia, 2024). 
![image](https://github.com/phillips123456/The-History-App/assets/163407311/f57942db-016f-4599-b9b5-93d6e4be6865)

Figure 3: Lebo Mathosa. (Drum, 2017) 

 

4. BRENDA FASSIE was a South African singer, songwriter, dancer and activist. Affectionately called MaBrrr by her fans, she is also known as the "Queen of African Pop", the "Madonna of The Townships" or simply as The Black Madonna (Wikipedia, 2024)[Text Wrapping Break] 
![image](https://github.com/phillips123456/The-History-App/assets/163407311/73715ec5-4a04-4cf8-bd08-fc50de7bb7a4)

Figure 4: Brenda Fassie (Legacy Project Chicago, 2014) 

 

5. BULELWA, known by her stage name ZAHARA, was a South African singer, songwriter and guitarist. Her music was classified loosely as "Afro-soul", and she sang in Xhosa, her native language, as well as in English(Wikipedia, 2024) 
![image](https://github.com/phillips123456/The-History-App/assets/163407311/a6b2c419-eb72-43cd-bc89-b19d803157c2)

Figure 5: Zahara(Wikipedia, 2024) 

 

6. CHADWICK BOSEMAN was an American actor During his two-decade career, Boseman received several accolades, including two Screen Actors Guild Awards, a Golden Globe Award, and a Primetime Emmy Award, along with an Academy Award nomination(Wikipedia, 2024) 
![image](https://github.com/phillips123456/The-History-App/assets/163407311/638a67b8-b005-4c70-8e1f-a099383448e6)

Figure 6: Chadwick Boseman(Wikipedia, 2024) 

 

7. KILLER KAU  was a South African singer, dancer and record producer best known for his hit songs "Tholukuthi Hey" and "Amaneighbour". He grew up singing in church before he joined the Stay PC church choir, singing baritone. He also went on to join the African Heavenly Soul Singers male choir(Wikipedia, 2024)  
![image](https://github.com/phillips123456/The-History-App/assets/163407311/b5bfba77-e34c-4460-b920-702baf56ca64)

Figure 7: Killer Kau(Ubetoo, 2019) 

 

8. DAVID BOWIE was an English singer, songwriter, musician, and actor. He is regarded as one of the most influential musicians of the 20th century. Bowie was acclaimed by critics and musicians, particularly for his innovative work during the 1970s. His career was marked by reinvention and visual presentation(Wikipedia, 2024) 
![image](https://github.com/phillips123456/The-History-App/assets/163407311/5df3eba2-a8ae-4e25-9ec8-1a82afb9f39b)

 Figure 8: David Bowie(Wikipedia, 2024) 

 

9. DESMOND TUTU was a South African Anglican bishop and theologian, known for his work as an anti-apartheid and human rights activist. He was Bishop of Johannesburg from 1985 to 1986 and then Archbishop of Cape Town from 1986 to 1996(Wikipedia, 2024) 
![image](https://github.com/phillips123456/The-History-App/assets/163407311/60ee598c-271f-43d9-a367-542af65b56a4)

Figure 9: Desmond Tutu(Wikipedia, 2024) 

 

10. WINNIE MANDELA  was a South African anti-apartheid activist and politician, and the second wife of Nelson Mandela. She served as a Member of Parliament from 1994 to 2003,[3] and from 2009 until her death,[4] and was a deputy minister of arts and culture from 1994 to 1996(Wikipedia, 2024
       
![image](https://github.com/phillips123456/The-History-App/assets/163407311/3a9c4c44-ca40-40cc-9091-56d7d9cf85d4)

Figure 10: Winnie Mandela(Wikipedia, 2024) 
