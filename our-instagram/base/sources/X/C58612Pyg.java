package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Pyg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58612Pyg implements InterfaceC65527Tlw {
    public final byte[] A00;

    @Override // X.InterfaceC65527Tlw
    public final long Ch9() {
        return this.A00.length;
    }

    @Override // X.InterfaceC65527Tlw
    public final InputStream E2i() {
        return new ByteArrayInputStream(this.A00);
    }

    public C58612Pyg(String... strArr) {
        C71473Il c71473Il = new C71473Il("");
        Iterator it = Arrays.asList(strArr).iterator();
        StringBuilder A1C = AbstractC166987dD.A1C();
        c71473Il.A03(A1C, it);
        String obj = A1C.toString();
        if (obj != null) {
            this.A00 = MSY.A1a(obj);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
