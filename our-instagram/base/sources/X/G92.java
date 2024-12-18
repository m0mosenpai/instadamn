package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class G92 implements InterfaceC58152PqH {
    public final /* synthetic */ AbstractC10360h2 A00;
    public final /* synthetic */ C35029Fc2 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InstagramMainActivity A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C15370ps A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G92(AbstractC10360h2 abstractC10360h2, C35029Fc2 c35029Fc2, UserSession userSession, InstagramMainActivity instagramMainActivity, String str, C15370ps c15370ps, boolean z) {
        this.A06 = z;
        this.A01 = c35029Fc2;
        this.A02 = userSession;
        this.A05 = c15370ps;
        this.A04 = str;
        this.A03 = instagramMainActivity;
        this.A00 = abstractC10360h2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        boolean z = this.A06;
        UserSession userSession = this.A02;
        Object obj = this.A05.A00;
        String id = AbstractC166987dD.A10(userSession).getId();
        if (z) {
            String str = this.A04;
            HashMap A11 = AbstractC31174DnI.A11(obj, 1);
            A11.put("profile_uid", id);
            A11.put("credential_type", obj);
            C35029Fc2.A00(userSession, C05F.A01, "auto_login_learn_more", str, "autologin", A11);
            C12260kU.A0G(this.A03, AbstractC25227BEk.A0B("https://www.meta.com/help/connected-experiences/switch-between-profiles/"));
            return;
        }
        HashMap A112 = AbstractC31174DnI.A11(obj, 1);
        A112.put("profile_uid", id);
        A112.put("credential_type", obj);
        C35029Fc2.A00(userSession, C05F.A01, "auto_login_cancel", "autologin", "autologin", A112);
        InstagramMainActivity.A0J(this.A00, userSession, this.A03);
    }
}
