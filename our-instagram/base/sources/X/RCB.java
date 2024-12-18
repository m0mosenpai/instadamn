package X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public final class RCB extends SZV {
    public final JsonSerializer A00;
    public final Class A01;

    public RCB(JsonSerializer jsonSerializer, SZV szv, Class cls) {
        super(szv);
        this.A01 = cls;
        this.A00 = jsonSerializer;
    }
}
