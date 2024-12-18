package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity;
import fxcache.model.FxCalAccount;

/* renamed from: X.GJj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36786GJj implements GZY {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C36786GJj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    @Override // X.GZY
    public final void onAuthorizeFail() {
        if (this.A00 != 0) {
            C9GR.A0B(AbstractC31172DnG.A06(this.A01), "authorize_failed");
        } else {
            ((GZY) this.A03).onAuthorizeFail();
        }
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        android.net.Uri uri;
        String str3;
        if (this.A00 != 0) {
            FbProfileLinkUrlHandlerActivity fbProfileLinkUrlHandlerActivity = (FbProfileLinkUrlHandlerActivity) this.A03;
            UserSession userSession = (UserSession) this.A02;
            Object obj = this.A01;
            FxCalAccount A01 = new C2Ne(userSession).A01(CallerContext.A00(FbProfileLinkUrlHandlerActivity.class), "ig_to_fb_sharing_account");
            if (A01 != null && (str3 = A01.A08) != null) {
                uri = AbstractC08820cl.A03(str3);
            } else {
                uri = null;
            }
            View inflate = LayoutInflater.from(fbProfileLinkUrlHandlerActivity).inflate(R.layout.layout_links_fb_dialog, (ViewGroup) null);
            C14360o3.A07(inflate);
            C193328hC A0H = AbstractC31171DnF.A0H(fbProfileLinkUrlHandlerActivity);
            A0H.A0A(2131970082);
            A0H.A09(2131970185);
            A0H.A0J(new DialogInterfaceOnClickListenerC35450Fk7(28, obj, fbProfileLinkUrlHandlerActivity, userSession), 2131970081);
            DialogInterfaceOnClickListenerC35455FkC.A02(A0H, userSession, fbProfileLinkUrlHandlerActivity, 60, 2131968687);
            if (uri != null) {
                AbstractC167007dF.A0T(inflate, R.id.profile_link_facebook_image).setUrl(AbstractC81033jX.A00(uri, -1, -1), fbProfileLinkUrlHandlerActivity);
                A0H.A0l(inflate);
            }
            AbstractC166987dD.A1W(A0H);
            return;
        }
        AbstractC167017dG.A1N(str, str2);
        ((C70806WhM) this.A02).A00(new C69249VkI((Activity) this.A01, (GZY) this.A03, str, str2));
    }
}
