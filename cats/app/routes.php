<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It's a breeze. Simply tell Laravel the URIs it should respond to
| and give it the Closure to execute when that URI is requested.
|
*/

Route::get('/', function() {
	return "All cats";
});

/*
In the pattern of the second route, {id} currently matches any string or number.
To restrict it so that it only matches numbers, we can chain a where method to our
route.
The where method takes two arguments: the first one is the name of the parameter
and the second one is the regular expression pattern that it needs to match.
*/
Route::get('cats/{id}', function($id) {
	return "Cat #$id";
})->where('id', '[0-9]+');

/*
It is also possible to redirect visitors by returning a Redirect object from your
routes. If for example, we wanted everyone to be redirected to /cats when they
visit the application for the first time, we would write the following lines of code:
*/
Route::get('/', function() {
	return Redirect::to('cats');
});

Route::get('cats', function() {
	return "All cats";
});


/*
Return the view using the View::make method with a variable, $number_of_cats:
(p.36)
*/
Route::get('about', function() {
	return View::make('about')->with('number_of_cats', 9000);
});