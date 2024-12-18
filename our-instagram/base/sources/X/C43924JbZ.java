package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JbZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43924JbZ implements InterfaceC70493Ek {
    public final /* synthetic */ JR2 A00;

    public C43924JbZ(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC70493Ek
    public final void DeM() {
        JR2 jr2 = this.A00;
        if (jr2.A05 != 0) {
            UserSession A0p = jr2.A0p();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A0p, 36328061750819975L) && JR2.A0n(jr2, jr2.A05)) {
                if (C18U.A06(c06090Tz, jr2.A0p(), 36328061751409804L)) {
                    jr2.A1K.postDelayed(new RunnableC49872M0r(jr2), 1000L);
                    return;
                } else {
                    ((InterfaceC70513Em) jr2.A10.getValue()).setIsLoading(false);
                    return;
                }
            }
        }
        jr2.A05 = System.currentTimeMillis();
        if (JR2.A0k(jr2)) {
            AbstractC43594JPz.A1I(jr2);
        } else {
            jr2.A06 = System.currentTimeMillis();
            ((MSH) jr2.A26.getValue()).ECn();
        }
        JR2.A0R(jr2);
        JR2.A0Z(jr2, C05F.A0Y);
        AbstractC92994Ew.A00(jr2.A0p()).A02(true);
        JR2.A0c(jr2, false);
        C43777JXq c43777JXq = jr2.A0m;
        if (c43777JXq == null) {
            return;
        }
        c43777JXq.A01(true);
    }
}
