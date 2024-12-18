package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.5w3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131155w3 {
    public static final void A00(Context context, UserSession userSession, C38321qM c38321qM, String str) {
        AndroidLink A02;
        String Aw8;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(str, 3);
        C131205w8 A00 = AbstractC131165w4.A00().A00(userSession);
        if (c38321qM.CdW() && (A02 = AbstractC905941u.A02(context, userSession, c38321qM, 0, false)) != null && (Aw8 = A02.Aw8()) != null && Aw8.length() != 0 && AbstractC114965Hm.A01(A02) == EnumC906041v.AD_DESTINATION_AR_CAMERA) {
            try {
                String Aw82 = A02.Aw8();
                if (Aw82 != null) {
                    android.net.Uri A03 = AbstractC08820cl.A03(Aw82);
                    String queryParameter = A03.getQueryParameter("effect_id");
                    String queryParameter2 = A03.getQueryParameter("encoded_token");
                    if (queryParameter != null && queryParameter.length() != 0 && queryParameter2 != null && queryParameter2.length() != 0) {
                        A00.A01(queryParameter2).A04(C63973Swz.A00);
                        L91 l91 = new L91(context, new C48239LWo(), C12L.A00, userSession);
                        LS2 ls2 = new LS2();
                        l91.A01(queryParameter, null);
                        l91.A00(ls2);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (SecurityException unused) {
                C0K8.A0C("ArAdPrefetchUtil", "Unable to parse URI");
            }
        }
    }
}
