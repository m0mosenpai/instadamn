package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GCk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36612GCk implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        HashMap A1G;
        int i;
        if (bundle == null) {
            bundle = AbstractC166987dD.A0b();
        }
        bundle.putString(MSV.A00(1151), "quick_promotion");
        Fragment fragment = this.A00;
        bundle.putString(DialogModule.KEY_TITLE, fragment.getString(2131963151));
        UserSession userSession = this.A01;
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        if (AbstractC166987dD.A10(userSession).CQw() && C18U.A06(C06090Tz.A05, userSession, 36316405208977777L)) {
            A1G = AbstractC166987dD.A1G();
            i = 191;
        } else {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315653589700054L);
            A1G = AbstractC166987dD.A1G();
            if (A06) {
                i = 809;
            } else {
                i = 370;
            }
        }
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(i), A1G);
        C14360o3.A0A(A01);
        AbstractC31181DnP.A0S(W6d.A00(A0C, A01), fragment, userSession);
    }

    public C36612GCk(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
