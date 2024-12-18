package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GEn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36667GEn implements GYB {
    public final Activity A00;
    public final Fragment A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("target");
        for (EnumC33374Ep7 enumC33374Ep7 : EnumC33374Ep7.A01) {
            if (AbstractC002300n.A0g(enumC33374Ep7.A00, queryParameter, true)) {
                if (enumC33374Ep7.ordinal() == 0) {
                    Activity activity = this.A00;
                    Fragment fragment = this.A01;
                    AbstractC10360h2 parentFragmentManager = fragment.getParentFragmentManager();
                    C08730cb c08730cb = C17060sy.A01;
                    UserSession userSession = this.A03;
                    User A01 = c08730cb.A01(userSession);
                    AbstractC31510Dsu.A04(activity, null, parentFragmentManager, AbstractC018607g.A00(fragment), this.A02, userSession, A01, null, MSV.A00(549), null, null, null, false);
                    return;
                }
                return;
            }
        }
    }

    public C36667GEn(Activity activity, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }
}
