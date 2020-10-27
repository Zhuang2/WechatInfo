package com.example.ninepatchdemo

import java.lang.Error
import java.security.cert.Extension

sealed class Result
class Success(val msg:String):Result()
class Failure(val error: Extension):Result()
class Unknown(val unknownError: String) :Result()
fun getResultMsg(result: Result) = when(result){
        is Success ->result.msg
        is Failure ->result.error
    else ->throw IllegalAccessError()
}