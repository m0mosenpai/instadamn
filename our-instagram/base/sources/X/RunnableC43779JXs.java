package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JXs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43779JXs implements Runnable {
    public final /* synthetic */ JR2 A00;

    public RunnableC43779JXs(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JR2 jr2 = this.A00;
        if (jr2.A05 != 0) {
            UserSession A0p = jr2.A0p();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A0p, 36328061750819975L) && JR2.A0n(jr2, jr2.A05)) {
                if (C18U.A06(c06090Tz, jr2.A0p(), 36328061751409804L)) {
                    jr2.A1K.postDelayed(new RunnableC49871M0q(jr2), 1000L);
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
        if (!C18U.A06(C06090Tz.A05, AbstractC43592JPx.A0S(jr2, 0), 36328186304478513L)) {
            InterfaceC09390do interfaceC09390do = jr2.A2e;
            if (((AnonymousClass995) interfaceC09390do.getValue()).A00 != null) {
                AnonymousClass995 anonymousClass995 = (AnonymousClass995) interfaceC09390do.getValue();
                List list = anonymousClass995.A00;
                if (list != null) {
                    AbstractC25651Mw.A00(anonymousClass995.A01).E4s(new JYS(list));
                }
            } else {
                JR2.A0R(jr2);
            }
        }
        JR2.A0Z(jr2, C05F.A0Y);
        AbstractC92994Ew.A00(jr2.A0p()).A02(true);
        JR2.A0c(jr2, false);
        C61582rL c61582rL = jr2.A1T;
        if (c61582rL == null) {
            return;
        }
        c61582rL.A02();
    }
}
