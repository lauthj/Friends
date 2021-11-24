FriendsApplication.java run as Java Application

set up a mysql database

login to Postman laXXXj account

Use JSON to post

http://localhost:8080/friend

{
	"firstName": "My first Name",
	"lastName": "My last name",
	"age": 59,
	"addresses":[{
		"street": "My street address",
		"city": "my current city"
	},
	{	"street": "My previous street address",
		"city": "previous city"
	}
   ]
}


	delete friend
	http://localhost:8080/friend/5
	
	get friend
	http://localhost:8080/friend
	
	get findBySearch first and last name
	http://localhost:8080/friend/search?first=firstname&last=lastname
	
	get Find by either first or last name
	http://localhost:8080/friend/search/Either?last=lastname
	
	get findByFirstName
    http://localhost:8080/friend/search/Either?first=some first name in the database	
	