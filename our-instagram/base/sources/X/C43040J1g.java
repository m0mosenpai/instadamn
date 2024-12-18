package X;

import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.J1g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43040J1g implements JHX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C43040J1g(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.JHX
    public final void Dq7(UpcomingEvent upcomingEvent) {
        int i = this.A00;
        C14360o3.A0B(upcomingEvent, 0);
        if (i != 0) {
            C37502GfK c37502GfK = (C37502GfK) this.A04;
            C38321qM c38321qM = (C38321qM) this.A01;
            C37502GfK.A00(c38321qM, (C75113Zb) this.A03, c37502GfK);
            C37502GfK.A01(c38321qM, c37502GfK);
            ((IMG) this.A02).A00(c38321qM, null, (UpcomingEventReminderRepository) c37502GfK.A08.getValue(), upcomingEvent);
            return;
        }
        ((C146096i7) ((IMT) this.A04).A06.getValue()).A00((C38321qM) this.A01, (Hj4) this.A02, (UpcomingEvent) this.A03, null).A01(upcomingEvent.getReminderEnabled());
    }

    @Override // X.JHX
    public final void onFailure() {
    }
}
