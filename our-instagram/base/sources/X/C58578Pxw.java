package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.Pxw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58578Pxw implements InterfaceC47612Gm {
    public final InterfaceC65440TkC A00;
    public final InterfaceC65441TkD A01;
    public final TypeToken A02;
    public final Class A03;
    public final boolean A04;

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        TypeToken typeToken2 = this.A02;
        if (typeToken2 != null) {
            if (!typeToken2.equals(typeToken) && (!this.A04 || typeToken2.type != typeToken.rawType)) {
                return null;
            }
        } else if (!this.A03.isAssignableFrom(typeToken.rawType)) {
            return null;
        }
        return new C58580Pxy(gson, this.A00, this.A01, this, typeToken, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r2 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C58578Pxw(com.google.gson.reflect.TypeToken r4, java.lang.Class r5, java.lang.Object r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            boolean r0 = r6 instanceof X.InterfaceC65441TkD
            r2 = 0
            if (r0 == 0) goto L26
            r1 = r6
            X.TkD r1 = (X.InterfaceC65441TkD) r1
        Lb:
            r3.A01 = r1
            boolean r0 = r6 instanceof X.InterfaceC65440TkC
            if (r0 == 0) goto L14
            r2 = r6
            X.TkC r2 = (X.InterfaceC65440TkC) r2
        L14:
            r3.A00 = r2
            if (r1 != 0) goto L1b
            r0 = 0
            if (r2 == 0) goto L1c
        L1b:
            r0 = 1
        L1c:
            X.C2I6.A00(r0)
            r3.A02 = r4
            r3.A04 = r7
            r3.A03 = r5
            return
        L26:
            r1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58578Pxw.<init>(com.google.gson.reflect.TypeToken, java.lang.Class, java.lang.Object, boolean):void");
    }
}
