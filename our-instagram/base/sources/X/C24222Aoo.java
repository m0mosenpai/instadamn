package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aoo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24222Aoo implements BE4 {
    public C203858zu A00;
    public final BCV A03 = new AXA(this);
    public final InterfaceC25157BBb A02 = new AX8(this);
    public final InterfaceC25156BBa A01 = new AX6(this);
    public final List A04 = AbstractC166987dD.A1E();

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    @Override // X.BE4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FB5(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24222Aoo.FB5(android.os.Bundle):void");
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A08(58);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        C203858zu c203858zu;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C8zr.A02;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                C8zr c8zr = (C8zr) anonymousClass904.A02(c203848zt);
                if (c8zr != null) {
                    c203858zu = c8zr.A00;
                } else {
                    c203858zu = null;
                }
                this.A00 = c203858zu;
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A04;
        ArrayList A0U = AbstractC001800i.A0U(list);
        if (A0U.isEmpty()) {
            A0U.add(AbstractC167027dH.A08(58));
        }
        list.clear();
        return A0U;
    }
}
