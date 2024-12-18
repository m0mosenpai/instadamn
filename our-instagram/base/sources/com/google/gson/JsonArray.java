package com.google.gson;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC31175DnJ;
import X.RVZ;
import X.TZD;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class JsonArray extends JsonElement implements Iterable {
    public final ArrayList elements;

    private JsonElement getAsSingleElement() {
        ArrayList arrayList = this.elements;
        int size = arrayList.size();
        if (size == 1) {
            return (JsonElement) arrayList.get(0);
        }
        throw AbstractC31175DnJ.A0U("Array must have size 1, but has size ", size);
    }

    public void add(Boolean bool) {
        JsonElement jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (bool == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(bool);
        }
        arrayList.add(jsonPrimitive);
    }

    public void addAll(JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public List asList() {
        return new TZD(this.elements);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        ArrayList arrayList = this.elements;
        if (!arrayList.isEmpty()) {
            JsonArray jsonArray = new JsonArray(arrayList.size());
            Iterator it = this.elements.iterator();
            while (it.hasNext()) {
                jsonArray.add(((JsonElement) it.next()).deepCopy());
            }
            return jsonArray;
        }
        return new JsonArray();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public JsonElement get(int i) {
        return (JsonElement) this.elements.get(i);
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.elements.iterator();
    }

    public JsonElement remove(int i) {
        return (JsonElement) this.elements.remove(i);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        ArrayList arrayList = this.elements;
        if (jsonElement == null) {
            jsonElement = RVZ.A00;
        }
        return (JsonElement) arrayList.set(i, jsonElement);
    }

    public int size() {
        return this.elements.size();
    }

    public JsonArray(int i) {
        this.elements = AbstractC25225BEi.A17(i);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return getAsSingleElement().getAsBigDecimal();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return getAsSingleElement().getAsBigInteger();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return getAsSingleElement().getAsBoolean();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return getAsSingleElement().getAsByte();
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        return getAsSingleElement().getAsCharacter();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return getAsSingleElement().getAsDouble();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return getAsSingleElement().getAsFloat();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return getAsSingleElement().getAsInt();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return getAsSingleElement().getAsLong();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        return getAsSingleElement().getAsNumber();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return getAsSingleElement().getAsShort();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        return getAsSingleElement().getAsString();
    }

    public JsonArray() {
        this.elements = AbstractC166987dD.A1E();
    }

    public void add(Character ch) {
        JsonElement jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (ch == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(ch);
        }
        arrayList.add(jsonPrimitive);
    }

    public boolean remove(JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public void add(Number number) {
        JsonElement jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (number == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(number);
        }
        arrayList.add(jsonPrimitive);
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = RVZ.A00;
        }
        this.elements.add(jsonElement);
    }

    public void add(String str) {
        JsonElement jsonPrimitive;
        ArrayList arrayList = this.elements;
        if (str == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(str);
        }
        arrayList.add(jsonPrimitive);
    }
}
