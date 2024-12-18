package X;

import java.util.Map;

/* renamed from: X.UMa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66545UMa extends AbstractC53638Nnj {
    public final XCB A00;

    @Override // X.AbstractC53638Nnj
    public final void A01(Exception exc, Map map, int i, boolean z) {
        AbstractC167007dF.A1E(exc, 0, map);
        this.A00.DGA(exc, map, i, z);
    }

    @Override // X.AbstractC53638Nnj
    public final void A02(String str, int i, Map map) {
        AbstractC167017dG.A1O(str, map);
        this.A00.D6j(str, 0, map);
    }

    public C66545UMa(XCB xcb) {
        this.A00 = xcb;
    }
}
