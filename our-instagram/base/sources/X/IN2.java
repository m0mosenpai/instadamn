package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;

/* loaded from: classes7.dex */
public final class IN2 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.IIb, X.Hax] */
    public final C39416Hb0 A01(String str) {
        C14360o3.A0B(str, 0);
        return new C39416Hb0(new C39417Hb1(new AbstractC41110IIb(this.A00, this.A01, this.A02, this.A03)));
    }

    public final C39415Haz A00(UpcomingEvent upcomingEvent) {
        C39414Hay c39414Hay = new C39414Hay(this.A00, this.A01, this.A02, upcomingEvent, this.A03);
        UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
        if (BNx != null) {
            return new C39415Haz(new NY5(c39414Hay, BNx));
        }
        return null;
    }

    public IN2(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = str;
        this.A04 = str2;
    }
}
