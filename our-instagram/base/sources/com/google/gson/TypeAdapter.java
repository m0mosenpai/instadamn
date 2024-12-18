package com.google.gson;

import X.C177847vJ;
import X.C47672Gt;
import X.C5MW;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TypeAdapter {
    public abstract Object read(JsonReader jsonReader);

    public abstract void write(JsonWriter jsonWriter, Object obj);

    public final Object fromJson(Reader reader) {
        return read(new JsonReader(reader));
    }

    public final Object fromJsonTree(JsonElement jsonElement) {
        try {
            return read(new C5MW(jsonElement));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final TypeAdapter nullSafe() {
        return new C47672Gt(this);
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final JsonElement toJsonTree(Object obj) {
        try {
            C177847vJ c177847vJ = new C177847vJ();
            write(c177847vJ, obj);
            List list = c177847vJ.A02;
            if (list.isEmpty()) {
                return c177847vJ.A00;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected one JSON element but was ");
            sb.append(list);
            throw new IllegalStateException(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, Object obj) {
        write(new JsonWriter(writer), obj);
    }
}
