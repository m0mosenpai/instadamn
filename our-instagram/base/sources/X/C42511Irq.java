package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Irq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42511Irq implements InterfaceC153186um {
    public final boolean A00;
    public final /* synthetic */ C38P A01;

    public C42511Irq(C38P c38p) {
        this.A01 = c38p;
        boolean z = C23051Ak.A05;
        this.A00 = C23061Al.A00(c38p.getSession()).A00(EnumC23071Am.A0E);
    }

    @Override // X.InterfaceC153186um
    public final int Bkn() {
        long j;
        boolean z = this.A00;
        UserSession session = this.A01.getSession();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            j = 36598880913722687L;
        } else {
            j = 36598880913657150L;
        }
        return AbstractC25225BEi.A07(c06090Tz, session, j);
    }
}
