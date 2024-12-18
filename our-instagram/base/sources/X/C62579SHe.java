package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

/* renamed from: X.SHe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62579SHe {
    public JsonSerializer A00;
    public MapSerializer A01;
    public final InterfaceC65620ToB A02;
    public final RBL A03;

    public C62579SHe(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, RBL rbl) {
        this.A03 = rbl;
        this.A02 = interfaceC65620ToB;
        this.A00 = jsonSerializer;
        if (jsonSerializer instanceof MapSerializer) {
            this.A01 = (MapSerializer) jsonSerializer;
        }
    }
}
