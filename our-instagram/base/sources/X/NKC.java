package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class NKC extends OX6 {
    public final UserSession A00;
    public final AbstractC55082Oac A01;
    public final C05A A02;
    public final C0UO A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKC(UserSession userSession, AbstractC55082Oac abstractC55082Oac) {
        super(abstractC55082Oac);
        AbstractC167017dG.A1P(abstractC55082Oac, userSession);
        this.A01 = abstractC55082Oac;
        this.A00 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H(new E72((UpcomingEvent) null, (DefaultConstructorMarker) null, 7, 3, false, false));
        this.A02 = A1H;
        this.A03 = A1H;
    }

    public final void A08(UpcomingEvent upcomingEvent) {
        String str;
        String id = upcomingEvent.getId();
        UpcomingEvent upcomingEvent2 = (UpcomingEvent) ((E72) this.A02.getValue()).A00;
        if (upcomingEvent2 != null) {
            str = upcomingEvent2.getId();
        } else {
            str = null;
        }
        if (C14360o3.A0K(id, str)) {
            A09(null);
        }
    }

    public final void A09(UpcomingEvent upcomingEvent) {
        C51754Mtd A00;
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04(), null, null, null, null, null, upcomingEvent, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A07(A00);
    }
}
