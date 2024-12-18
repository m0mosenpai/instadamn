package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.J1e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43038J1e implements JHX {
    public final /* synthetic */ C38947HCw A00;
    public final /* synthetic */ IMG A01;

    @Override // X.JHX
    public final void Dq7(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        C38947HCw c38947HCw = this.A00;
        C38947HCw.A03(c38947HCw, upcomingEvent);
        this.A01.A00(C38947HCw.A00(c38947HCw), null, (UpcomingEventReminderRepository) c38947HCw.A0L.getValue(), upcomingEvent);
    }

    @Override // X.JHX
    public final void onFailure() {
    }

    public C43038J1e(C38947HCw c38947HCw, IMG img) {
        this.A00 = c38947HCw;
        this.A01 = img;
    }
}
