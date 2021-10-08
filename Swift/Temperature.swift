//
//  Temperature.swift
//  
//
//  Created by Alfin on 08/10/21.
//

enum TemperatureType { case celcius, fahrenheit, kelvin }

struct Temperature {
    var value: Double
    var temperatureType: TemperatureType
}

extension Temperature {
    func convert(to: TemperatureType) -> Double {
        var output: Double = 0;
        
        switch temperatureType {
        case .celcius:
            switch to {
            case .celcius:
                output = value
            case .fahrenheit:
                output = value * 1.8 + 32
            case .kelvin:
                output = value + 273.15
            }
        case .fahrenheit:
            switch to {
            case .celcius:
                output = (value - 32) / 1.8
            case .fahrenheit:
                output = value
            case .kelvin:
                output = (value + 459.67) / 1.8
            }
        case .kelvin:
            switch to {
            case .celcius:
                output = value - 273.15
            case .fahrenheit:
                output = value * 1.8 - 459.67
            case .kelvin:
                output = value
            }
        }
        
        return output
    }
}
