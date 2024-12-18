package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.2Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47842Hs extends AbstractC47852Ht {
    public TypeAdapter A00 = null;

    @Override // X.AbstractC47852Ht
    public final TypeAdapter A00() {
        TypeAdapter typeAdapter = this.A00;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        TypeAdapter typeAdapter = this.A00;
        if (typeAdapter != null) {
            return typeAdapter.read(jsonReader);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        TypeAdapter typeAdapter = this.A00;
        if (typeAdapter != null) {
            typeAdapter.write(jsonWriter, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
