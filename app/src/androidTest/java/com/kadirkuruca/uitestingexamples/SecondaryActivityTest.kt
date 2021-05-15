package com.kadirkuruca.uitestingexamples

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest{

    @get: Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivityInView(){
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibilty_title_backButton() {
        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))
        onView(withId(R.id.button_back)).check(matches(isDisplayed()))

        //onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE))) //Method 2
    }

    @Test
    fun test_isTitleTextDisplayed(){
        onView(withId(R.id.activity_secondary_title)).check(matches(withText(R.string.text_secondaryactivity)) )
    }
}