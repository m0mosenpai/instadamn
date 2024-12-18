package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes9.dex */
public final class OET {
    public final InterfaceC11380iw A00;
    public final PIR A01;
    public final OD9 A02;
    public final OMP A03;
    public final UpcomingEvent A04;
    public final InterfaceC09390do A05;
    public final UserSession A06;

    public OET(ViewStub viewStub, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, PIR pir, UpcomingEvent upcomingEvent) {
        AbstractC167027dH.A0a(1, viewStub, fragmentActivity, userSession, interfaceC11380iw);
        C14360o3.A0B(pir, 6);
        this.A06 = userSession;
        this.A00 = interfaceC11380iw;
        this.A04 = upcomingEvent;
        this.A01 = pir;
        this.A03 = AbstractC54244NyP.A00(userSession, C13920nI.A00, upcomingEvent);
        this.A05 = C1XM.A00(new C57251PbZ(40, fragmentActivity, this));
        View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.ig_reminder_ads_footer);
        C14360o3.A0A(A0E);
        this.A02 = new OD9(A0E);
    }
}
