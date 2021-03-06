package com.github.steam.api.adapter;

import com.github.steam.api.enumeration.ETradeOfferState;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Преобразователь чистлового статуса в элемент перечисления ETradeOfferState
 *
 * @author Andrey Marchenkov
 */
public class TradeOfferStateAdapter implements JsonDeserializer<ETradeOfferState> {

    @Override
    public ETradeOfferState deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
        int key = element.getAsInt();
        return ETradeOfferState.valueOf(key);
    }

}
