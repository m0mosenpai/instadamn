package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.RVc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60842RVc extends TypeAdapter {
    public final /* synthetic */ C2HG A00;
    public final /* synthetic */ Class A01;

    public C60842RVc(C2HG c2hg, Class cls) {
        this.A00 = c2hg;
        this.A01 = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        Object read = this.A00.A00.read(jsonReader);
        if (read != null) {
            Class cls = this.A01;
            if (!cls.isInstance(read)) {
                throw new RuntimeException(AnonymousClass001.A13("Expected a ", cls.getName(), AbstractC111324zv.A00(1384), MSY.A0h(read), "; at path ", jsonReader.A0I()));
            }
        }
        return read;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        this.A00.A00.write(jsonWriter, obj);
    }
}
