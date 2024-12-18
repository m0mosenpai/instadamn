package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.RVb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60841RVb extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.A0A();
        } else {
            jsonWriter.A0H(obj.toString());
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        if (jsonReader.A0G() == C05F.A1F) {
            jsonReader.A0Q();
            return null;
        }
        return Long.valueOf(jsonReader.A0F());
    }
}
