package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Woy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71163Woy implements InterfaceC58092PpH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C71603Jf A01;
    public final /* synthetic */ String A02;

    public C71163Woy(UserSession userSession, C71603Jf c71603Jf, String str) {
        this.A00 = userSession;
        this.A01 = c71603Jf;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC58092PpH
    public final void DEO(Long l, Long l2, long j, long j2, boolean z) {
        AbstractC25651Mw.A00(this.A00).E4s(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC58092PpH
    public final void DqU(Long l, Long l2, long j, long j2, boolean z) {
        long j3;
        long j4;
        UserSession userSession = this.A00;
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        if (l != null && l2 != null) {
            this.A01.A05(l.longValue(), l2.longValue());
        }
        AbstractC206099Aq.A06(userSession);
        long j5 = 0;
        if (l != null && l2 != null) {
            j3 = l2.longValue() - l.longValue();
        } else {
            j3 = 0;
        }
        C19270xB c19270xB = new C19270xB("quiet_mode");
        AbstractC167017dG.A1N(userSession, c19270xB);
        C65761Ttc c65761Ttc = new C65761Ttc(c19270xB, userSession);
        C69436VnL A03 = this.A01.A03(0L);
        String str = this.A02;
        if (l != null) {
            j4 = l.longValue();
        } else {
            j4 = 0;
        }
        if (l2 != null) {
            j5 = l2.longValue();
        }
        C65761Ttc.A01(c65761Ttc, A03, null, null, true, null, null, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j3), "ig_quiet_mode_pause_toggled", str, null, null);
    }
}
