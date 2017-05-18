package com.woowahan.web;

import com.woowahan.support.AbstractAcceptanceTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomeControllerTest extends AbstractAcceptanceTest {
    private static final Logger log = LoggerFactory.getLogger(HomeControllerTest.class);

    @Test
    public void home() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        log.debug("body: {}", response.getBody());
    }
}
