package com.google.gson;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.C5MT;
import X.RVZ;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class JsonObject extends JsonElement {
    public final C5MT members = new C5MT(false);

    public void add(String str, JsonElement jsonElement) {
        C5MT c5mt = this.members;
        if (jsonElement == null) {
            jsonElement = RVZ.A00;
        }
        c5mt.put(str, jsonElement);
    }

    public void addProperty(String str, Boolean bool) {
        JsonElement jsonPrimitive;
        if (bool == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(bool);
        }
        add(str, jsonPrimitive);
    }

    public Map asMap() {
        return this.members;
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        Iterator A14 = AbstractC166997dE.A14(this.members);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            jsonObject.add(AbstractC31172DnG.A17(A1K), ((JsonElement) A1K.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public Set entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonElement get(String str) {
        return (JsonElement) this.members.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.members.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.members.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.members.get(str);
    }

    public boolean has(String str) {
        return this.members.containsKey(str);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public boolean isEmpty() {
        return AbstractC167007dF.A1N(this.members.size());
    }

    public Set keySet() {
        return this.members.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonElement remove(String str) {
        return (JsonElement) this.members.remove(str);
    }

    public int size() {
        return this.members.size();
    }

    public void addProperty(String str, String str2) {
        JsonElement jsonPrimitive;
        if (str2 == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(str2);
        }
        add(str, jsonPrimitive);
    }

    public void addProperty(String str, Character ch) {
        JsonElement jsonPrimitive;
        if (ch == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(ch);
        }
        add(str, jsonPrimitive);
    }

    public void addProperty(String str, Number number) {
        JsonElement jsonPrimitive;
        if (number == null) {
            jsonPrimitive = RVZ.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(number);
        }
        add(str, jsonPrimitive);
    }
}
