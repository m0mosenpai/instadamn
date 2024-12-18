package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LcD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48460LcD implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C133255zr A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C47616L1b A04;

    public C48460LcD(C133255zr c133255zr, UserSession userSession, C47616L1b c47616L1b, int i, long j) {
        this.A04 = c47616L1b;
        this.A02 = c133255zr;
        this.A01 = j;
        this.A00 = i;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C128145qj c128145qj = this.A04.A02;
        C133255zr c133255zr = this.A02;
        C14360o3.A0A(c133255zr);
        long j = this.A01;
        c128145qj.A00(c133255zr, this.A03, C50367MLu.A01(c1346766r, 23), this.A00, j);
    }
}
