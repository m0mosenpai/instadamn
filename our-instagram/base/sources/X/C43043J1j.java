package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.J1j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43043J1j implements JHY {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ C37502GfK A02;

    public C43043J1j(C38321qM c38321qM, C75113Zb c75113Zb, C37502GfK c37502GfK) {
        this.A02 = c37502GfK;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
    }

    @Override // X.JHY
    public final void DG1(UpcomingEvent upcomingEvent) {
        C37502GfK.A00(this.A00, this.A01, this.A02);
    }

    @Override // X.JHY
    public final void Dq7(UpcomingEvent upcomingEvent) {
        C37502GfK c37502GfK = this.A02;
        C38321qM c38321qM = this.A00;
        C37502GfK.A00(c38321qM, this.A01, c37502GfK);
        C37502GfK.A01(c38321qM, c37502GfK);
    }
}
