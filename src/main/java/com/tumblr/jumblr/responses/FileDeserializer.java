package com.tumblr.jumblr.responses;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.io.File;
import java.lang.reflect.Type;

/**
 * Do not even try to deserialize json to file. 
 * 1. It makes no sense in our case
 * 2. It might be unsafe
 * 3. From the box Gson can not deserialize internal java classes since java 15 https://github.com/google/gson/issues/1979
 */
public class FileDeserializer  implements JsonDeserializer<File> {
	@Override
	public File deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		return null;
	}
}
