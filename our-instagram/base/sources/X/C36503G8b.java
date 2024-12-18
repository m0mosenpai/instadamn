package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.G8b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36503G8b implements GZC {
    public final /* synthetic */ UserSession A00;

    @Override // X.GZC
    public final void DB6() {
    }

    public C36503G8b(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.GZC
    public final void Dm8() {
        UserSession userSession = this.A00;
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        AbstractC167017dG.A1L(A0x.ARD(), A0x, "ig_live_num_times_good_time_for_live_ignored_in_a_row", 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C3KX.A08, userSession), "live_production_in_app_notification");
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "good_time_for_live");
        AbstractC31171DnF.A1B(A0f, "impression");
        A0f.Cht();
    }
}
