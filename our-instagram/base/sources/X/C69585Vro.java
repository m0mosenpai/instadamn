package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vro, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69585Vro {
    public final InterfaceC58682mR A00;
    public final C68909Ve9 A01;
    public final C69685VtV A02;
    public final Map A03;

    public final void A00(String str) {
        Vh4 vh4 = (Vh4) this.A03.get(str);
        if (vh4 != null && !vh4.A00) {
            vh4.A00 = true;
            vh4.A01.A02.A01.add(vh4);
        }
    }

    public C69585Vro(InterfaceC58682mR interfaceC58682mR) {
        this.A00 = interfaceC58682mR;
        C68909Ve9 c68909Ve9 = new C68909Ve9();
        this.A01 = c68909Ve9;
        C69685VtV c69685VtV = new C69685VtV();
        this.A02 = c69685VtV;
        c68909Ve9.A00.add(c69685VtV);
        this.A03 = new HashMap();
    }
}
