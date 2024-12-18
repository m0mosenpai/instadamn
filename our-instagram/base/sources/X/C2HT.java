package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.2HT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HT extends TypeAdapter {
    public static final InterfaceC47612Gm A01 = new C2HU(new C2HT(EnumC47562Gh.A01));
    public final InterfaceC47572Gi A00;

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        jsonWriter.A0E((Number) obj);
    }

    public C2HT(InterfaceC47572Gi interfaceC47572Gi) {
        this.A00 = interfaceC47572Gi;
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        Integer A0G = jsonReader.A0G();
        int intValue = A0G.intValue();
        if (intValue != 8) {
            if (intValue != 6 && intValue != 5) {
                throw new RuntimeException(AnonymousClass001.A0u("Expecting number, got: ", SSW.A01(A0G), "; at path ", jsonReader.A0H()));
            }
            return this.A00.E8H(jsonReader);
        }
        jsonReader.A0Q();
        return null;
    }
}
