package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G8N implements GZB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8N(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        UserSession userSession = this.A01;
        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
        A0e.E7D("ig_live_num_times_good_time_for_live_ignored_in_a_row", 0);
        A0e.apply();
        AbstractC31176DnK.A0w(this.A00, AbstractC166987dD.A0b(), userSession, "universal_creation_live_camera");
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C3KX.A08, userSession), "live_production_in_app_notification");
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "good_time_for_live");
        AbstractC31171DnF.A1B(A0f, "click");
        A0f.Cht();
    }
}
