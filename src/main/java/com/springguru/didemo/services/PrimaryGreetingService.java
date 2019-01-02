/* Created by Irshad Shaikh
 *  Created on: 1/2/2019
 */
package com.springguru.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service!";
    }
}
