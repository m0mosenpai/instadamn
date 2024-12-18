package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36648GDu implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        C1XJ c1xj = C1XJ.A00;
        UserSession userSession = this.A01;
        C36284Fzb A0E = c1xj.A0E(userSession);
        C14360o3.A07(A0E);
        if (EnumC55212gM.A2K.A00(userSession, uri.toString())) {
            String queryParameter = uri.getQueryParameter(CacheBehaviorLogger.SOURCE);
            if (queryParameter != null) {
                boolean booleanQueryParameter = uri.getBooleanQueryParameter("show_product_row_tooltip", false);
                EnumC33447EqK enumC33447EqK = (EnumC33447EqK) EnumC33447EqK.A01.get(queryParameter);
                Fragment fragment = this.A00;
                if (enumC33447EqK == null) {
                    enumC33447EqK = EnumC33447EqK.A0X;
                }
                AbstractC1566271k.A0B(fragment, userSession, enumC33447EqK, uri.getQueryParameter("product_row_tooltip_string_override"), booleanQueryParameter);
                return;
            }
            if (AbstractC199308rX.A01(userSession)) {
                AbstractC1566271k.A0B(this.A00, userSession, EnumC33447EqK.A0X, null, true);
                return;
            }
            Fragment fragment2 = this.A00;
            FragmentActivity activity = fragment2.getActivity();
            if (activity != null) {
                A0E.A00(fragment2, activity);
            }
            C17060sy.A01.A01(userSession);
            FragmentActivity activity2 = fragment2.getActivity();
            if (activity2 != null) {
                AbstractC1566271k.A0P(activity2, userSession, "product_tagging_dialog", "qp_product_shopping_dialog", true);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public C36648GDu(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
