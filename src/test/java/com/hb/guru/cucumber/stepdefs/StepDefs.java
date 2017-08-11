package com.hb.guru.cucumber.stepdefs;

import com.hb.guru.Nflguru2017App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Nflguru2017App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
