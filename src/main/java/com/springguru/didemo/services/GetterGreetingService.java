/* Created by Irshad Shaikh
 *  Created on: 1/1/2019
 */
package com.springguru.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Getter Greeting Service";
    }
}
