package X;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.Pxy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58580Pxy extends AbstractC47852Ht {
    public final Gson A00;
    public final InterfaceC47612Gm A01;
    public final TypeToken A02;
    public final InterfaceC65440TkC A03;
    public final InterfaceC65441TkD A04;
    public final C58581Pxz A05 = new C58581Pxz(this);
    public final boolean A06;
    public volatile TypeAdapter A07;

    @Override // X.AbstractC47852Ht
    public final TypeAdapter A00() {
        if (this.A04 != null) {
            return this;
        }
        TypeAdapter typeAdapter = this.A07;
        if (typeAdapter == null) {
            TypeAdapter A02 = this.A00.A02(this.A01, this.A02);
            this.A07 = A02;
            return A02;
        }
        return typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        InterfaceC65440TkC interfaceC65440TkC = this.A03;
        if (interfaceC65440TkC == null) {
            TypeAdapter typeAdapter = this.A07;
            if (typeAdapter == null) {
                typeAdapter = this.A00.A02(this.A01, this.A02);
                this.A07 = typeAdapter;
            }
            return typeAdapter.read(jsonReader);
        }
        JsonElement A00 = S3Z.A00(jsonReader);
        if (this.A06 && (A00 instanceof RVZ)) {
            return null;
        }
        return interfaceC65440TkC.deserialize(A00, this.A02.type, this.A05);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        InterfaceC65441TkD interfaceC65441TkD = this.A04;
        if (interfaceC65441TkD == null) {
            TypeAdapter typeAdapter = this.A07;
            if (typeAdapter == null) {
                typeAdapter = this.A00.A02(this.A01, this.A02);
                this.A07 = typeAdapter;
            }
            typeAdapter.write(jsonWriter, obj);
            return;
        }
        if (this.A06 && obj == null) {
            jsonWriter.A0A();
        } else {
            AbstractC47652Gq.A0F.write(jsonWriter, interfaceC65441TkD.serialize(obj, this.A02.type, this.A05));
        }
    }

    public C58580Pxy(Gson gson, InterfaceC65440TkC interfaceC65440TkC, InterfaceC65441TkD interfaceC65441TkD, InterfaceC47612Gm interfaceC47612Gm, TypeToken typeToken, boolean z) {
        this.A04 = interfaceC65441TkD;
        this.A03 = interfaceC65440TkC;
        this.A00 = gson;
        this.A02 = typeToken;
        this.A01 = interfaceC47612Gm;
        this.A06 = z;
    }
}
