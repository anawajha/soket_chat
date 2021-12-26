package com.anawajha.babble.logic.model

import com.anawajha.babble.shared.Constants
import org.json.JSONObject

data class Message(var source_id:String, var destination_id:String ,var message:Any){

    fun encode():JSONObject{
        var message= JSONObject()
        message.put(Constants.SOURCE_ID,this.source_id)
        message.put(Constants.DESTINATION_ID,this.destination_id)
        message.put(Constants.MESSAGE,this.message)
        return message
    }// encode

companion object{
    fun decode(obj:JSONObject):Message{
        return Message(obj.getString(Constants.SOURCE_ID),obj.getString(Constants.DESTINATION_ID).toString(),obj.get(Constants.MESSAGE))
    }// decode
}// companion object

}// Message class