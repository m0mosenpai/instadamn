package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.RVd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60843RVd extends TypeAdapter {
    public final /* synthetic */ Gson A00;
    public final /* synthetic */ C47602Gl A01;
    public final /* synthetic */ TypeToken A02;

    public C60843RVd(Gson gson, C47602Gl c47602Gl, TypeToken typeToken) {
        this.A01 = c47602Gl;
        this.A00 = gson;
        this.A02 = typeToken;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        jsonReader.A0R();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        jsonWriter.A0A();
    }
}
