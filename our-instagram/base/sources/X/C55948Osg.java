package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Osg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55948Osg implements C1NJ {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        AbstractC28415CgL.A00 = null;
        C26727Br8 c26727Br8 = new C26727Br8();
        AbstractC25233BEq.A15(c26727Br8, PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A02);
        try {
            C140966Yy A0r = AbstractC25225BEi.A0r(this.A00, this.A01);
            A0r.A0A(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
            A0r.A0B(null, c26727Br8);
            A0r.A04();
        } catch (IllegalStateException e) {
            if (e.getMessage() != null) {
                e.getMessage();
            }
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        AbstractC28415CgL.A00 = null;
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C55948Osg(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A02 = str;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
