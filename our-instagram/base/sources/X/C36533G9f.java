package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.G9f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36533G9f implements InterfaceC37133GXu {
    public final int A00;
    public final Object A01;

    public C36533G9f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC37133GXu
    public final void E3R(android.net.Uri uri, UserSession userSession, C54132eL c54132eL, C34972Fax c34972Fax) {
        Bundle bundle;
        String str;
        Bundle bundle2;
        String str2;
        String str3;
        C1QO c1qo;
        switch (this.A00) {
            case 0:
                C35277FhC.A0H(userSession, c34972Fax);
                Bundle bundle3 = c34972Fax.A0P;
                AbstractC31173DnH.A1A(uri, bundle3, "business_id");
                AbstractC31173DnH.A1A(uri, bundle3, "business_name");
                AbstractC31173DnH.A1A(uri, bundle3, "banhammer_state");
                AbstractC31173DnH.A1A(uri, bundle3, "banhammer_action_date");
                AbstractC31175DnJ.A0q(uri, bundle3);
                AbstractC31173DnH.A1C(bundle3, userSession);
                return;
            case 1:
                c34972Fax.A05 = C1QO.A0E;
                bundle = c34972Fax.A0P;
                AbstractC31175DnJ.A0q(uri, bundle);
                AbstractC31173DnH.A1C(bundle, userSession);
                AbstractC31173DnH.A1A(uri, bundle, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                str = "merchant_igid";
                AbstractC31173DnH.A1A(uri, bundle, str);
                return;
            case 2:
                bundle = C34972Fax.A00(c34972Fax);
                AbstractC31175DnJ.A0q(uri, bundle);
                AbstractC31173DnH.A1C(bundle, userSession);
                AbstractC31173DnH.A1A(uri, bundle, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                AbstractC31173DnH.A1A(uri, bundle, AbstractC111324zv.A00(1006));
                AbstractC31173DnH.A1A(uri, bundle, "merchant_id");
                str = "merchant_username";
                AbstractC31173DnH.A1A(uri, bundle, str);
                return;
            case 3:
                bundle2 = c34972Fax.A0P;
                AbstractC31175DnJ.A0q(uri, bundle2);
                String queryParameter = uri.getQueryParameter("order_id");
                String A04 = AbstractC31182DnR.A04();
                String queryParameter2 = uri.getQueryParameter(A04);
                String queryParameter3 = uri.getQueryParameter("transaction_source");
                bundle2.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, queryParameter);
                bundle2.putString(A04, queryParameter2);
                bundle2.putString("transaction_source", queryParameter3);
                str2 = userSession.token;
                str3 = "IgSessionManager.SESSION_TOKEN_KEY";
                bundle2.putString(str3, str2);
                c1qo = C1QO.A0E;
                c34972Fax.A05 = c1qo;
                return;
            case 4:
            case 5:
            default:
                bundle2 = c34972Fax.A0P;
                str2 = uri.getHost();
                str3 = "screen";
                bundle2.putString(str3, str2);
                c1qo = C1QO.A0E;
                c34972Fax.A05 = c1qo;
                return;
            case 6:
                Bundle bundle4 = c34972Fax.A0P;
                AbstractC31175DnJ.A0q(uri, bundle4);
                AbstractC31173DnH.A1A(uri, bundle4, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String queryParameter4 = uri.getQueryParameter("source_application");
                if (queryParameter4 != null && queryParameter4.equals("com.instagram.barcelona")) {
                    bundle4.putString("source_application", queryParameter4);
                    if (!C2TN.A05(userSession, uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID))) {
                        c1qo = C1QO.A0C;
                        c34972Fax.A05 = c1qo;
                        return;
                    }
                    c1qo = C1QO.A0E;
                    c34972Fax.A05 = c1qo;
                    return;
                }
                C35277FhC.A0H(userSession, c34972Fax);
                return;
            case 7:
                Bundle bundle5 = c34972Fax.A0P;
                bundle5.putString("screen", uri.getHost());
                bundle5.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, uri.getQueryParameter("audio_id"));
                bundle5.putString("reason", uri.getQueryParameter("reason"));
                ((InterfaceC16600sD) this.A01).invoke(uri, c54132eL, c34972Fax, userSession);
                return;
        }
    }
}
