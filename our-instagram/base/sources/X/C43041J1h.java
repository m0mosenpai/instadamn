package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.J1h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43041J1h implements JHX {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ JHX A02;
    public final /* synthetic */ IMG A03;
    public final /* synthetic */ C37502GfK A04;

    @Override // X.JHX
    public final void Dq7(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        C37502GfK c37502GfK = this.A04;
        C38321qM c38321qM = this.A00;
        C37502GfK.A00(c38321qM, this.A01, c37502GfK);
        C37502GfK.A01(c38321qM, c37502GfK);
        this.A03.A00(c38321qM, this.A02, (UpcomingEventReminderRepository) c37502GfK.A08.getValue(), upcomingEvent);
    }

    @Override // X.JHX
    public final void onFailure() {
    }

    public C43041J1h(C38321qM c38321qM, C75113Zb c75113Zb, JHX jhx, IMG img, C37502GfK c37502GfK) {
        this.A04 = c37502GfK;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A03 = img;
        this.A02 = jhx;
    }
}
