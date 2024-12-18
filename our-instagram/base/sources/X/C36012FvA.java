package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FvA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36012FvA implements InterfaceC11380iw, InterfaceC37185GZw {
    public static final String __redex_internal_original_name = "ArAdsEffectTestLinkUrlHandler";

    @Override // X.InterfaceC37185GZw
    public final Bundle AFg(AbstractC18680vv abstractC18680vv, String str) {
        return null;
    }

    @Override // X.InterfaceC37185GZw
    public final void CJ9(Bundle bundle, FragmentActivity fragmentActivity, AbstractC18680vv abstractC18680vv) {
        Integer num;
        AbstractC167027dH.A12(bundle, fragmentActivity, abstractC18680vv);
        UserSession A00 = AbstractC03270Dk.A00(abstractC18680vv);
        String A0a = AbstractC31171DnF.A0a(bundle);
        if (A0a != null && A0a.length() != 0) {
            android.net.Uri A0B = AbstractC25227BEk.A0B(A0a);
            if (C14360o3.A0K(A0B.getHost(), "ar_commerce")) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            String string = bundle.getString("effect_id_key");
            String queryParameter = A0B.getQueryParameter("encoded_token");
            String string2 = bundle.getString("ch_key");
            if (string != null && string.length() != 0 && queryParameter != null && queryParameter.length() != 0) {
                C69662Vt3 A01 = AbstractC131165w4.A00().A01(fragmentActivity, C22P.A0P, A00, num, string, string2, queryParameter);
                A01.A02 = "back";
                A01.A00();
                return;
            }
        }
        fragmentActivity.finish();
    }

    @Override // X.InterfaceC37185GZw
    public final boolean EJT() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }
}
