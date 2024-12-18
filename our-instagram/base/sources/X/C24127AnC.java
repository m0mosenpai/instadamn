package X;

import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

/* renamed from: X.AnC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24127AnC implements C7XU {
    public final /* synthetic */ C72q A00;
    public final /* synthetic */ UpcomingEvent A01;
    public final /* synthetic */ User A02;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C24127AnC(C72q c72q, UpcomingEvent upcomingEvent, User user) {
        this.A00 = c72q;
        this.A02 = user;
        this.A01 = upcomingEvent;
    }

    @Override // X.C7XU
    public final void DAy() {
        ((C1572073z) this.A00.A06.A0Z.getValue()).A00(this.A01, this.A02);
    }
}
