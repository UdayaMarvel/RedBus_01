@Train
Feature: TrainBooking

Background: Application Launch
Given Launch the browser and application "https://www.redbus.in"

@Smoke @Sanity
Scenario Outline: Book a Train in RedBus application
When User enters the value in from place "<FromPlace>"
And User enters the value in to place "<ToPlace>"
And User clicks on date
And User selects a date in the Date Dropdown
And User clicks on search button
And Validate the buses displayed as per given value

Examples:
|FromPlace					|ToPlace							|
|Chennai						|Tiruchchirapali			|
