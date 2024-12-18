package X;

import java.util.ArrayList;

/* renamed from: X.8Q4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Q4 {
    public final /* synthetic */ C183688Ct A00;

    public C8Q4(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }

    public final C55U A00() {
        return (C55U) this.A00.A0x.A08.A00;
    }

    public final boolean A01() {
        C183688Ct c183688Ct = this.A00;
        boolean z = c183688Ct.A0x.A08.A00 instanceof C81V;
        C1815483h c1815483h = c183688Ct.A15.A01;
        Integer num = c1815483h.A0B;
        C14360o3.A07(num);
        if (num != C05F.A0C) {
            if (c1815483h.A0Y == null || !z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A02() {
        ArrayList A16 = ((C8NW) this.A00.A1h.get()).A16();
        C14360o3.A0B(A16, 0);
        if (C48r.A00(EnumC75383a5.A0g, A16) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (X.AbstractC185298Jv.A01(r3.A0w) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r4 = this;
            X.8Ct r3 = r4.A00
            boolean r0 = X.C183688Ct.A0O(r3)
            r2 = 1
            if (r0 != 0) goto L12
            com.instagram.common.session.UserSession r0 = r3.A0w
            boolean r0 = X.AbstractC185298Jv.A01(r0)
            r1 = 1
            if (r0 != 0) goto L13
        L12:
            r1 = 0
        L13:
            boolean r0 = X.C183688Ct.A0N(r3)
            if (r0 == 0) goto L1b
            if (r1 == 0) goto L22
        L1b:
            boolean r0 = X.C183688Ct.A0O(r3)
            if (r0 != 0) goto L22
            r2 = 0
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Q4.A03():boolean");
    }
}
