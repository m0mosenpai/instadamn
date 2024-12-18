package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.J1f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43039J1f implements JHX {
    public final /* synthetic */ C38947HCw A00;
    public final /* synthetic */ JHX A01;
    public final /* synthetic */ IMG A02;

    @Override // X.JHX
    public final void Dq7(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        C38947HCw c38947HCw = this.A00;
        C38947HCw.A03(c38947HCw, upcomingEvent);
        this.A02.A00(C38947HCw.A00(c38947HCw), this.A01, (UpcomingEventReminderRepository) c38947HCw.A0L.getValue(), upcomingEvent);
    }

    @Override // X.JHX
    public final void onFailure() {
    }

    public C43039J1f(C38947HCw c38947HCw, JHX jhx, IMG img) {
        this.A00 = c38947HCw;
        this.A02 = img;
        this.A01 = jhx;
    }
}
