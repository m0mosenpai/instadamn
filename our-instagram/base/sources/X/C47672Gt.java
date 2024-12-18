package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.2Gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47672Gt extends TypeAdapter {
    public final /* synthetic */ TypeAdapter A00;

    public C47672Gt(TypeAdapter typeAdapter) {
        this.A00 = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.A0A();
        } else {
            this.A00.write(jsonWriter, obj);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        if (jsonReader.A0G() == C05F.A1F) {
            jsonReader.A0Q();
            return null;
        }
        return this.A00.read(jsonReader);
    }
}
