package X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public final class RCC extends SZV {
    public final JsonSerializer A00;
    public final JsonSerializer A01;
    public final Class A02;
    public final Class A03;

    public RCC(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, SZV szv, Class cls, Class cls2) {
        super(szv);
        this.A02 = cls;
        this.A00 = jsonSerializer;
        this.A03 = cls2;
        this.A01 = jsonSerializer2;
    }
}
