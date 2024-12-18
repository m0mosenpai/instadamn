package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GDi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36636GDi implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    public C36636GDi(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        HashMap A1G = AbstractC166987dD.A1G();
        UserSession userSession = this.A01;
        A1G.put("target_user_id", userSession.userId);
        A1G.put("referer_type", "QuickPromotion");
        C66277U6x A01 = C66277U6x.A01(MSV.A00(20), A1G);
        Fragment fragment = this.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A17(fragment, A0C, 2131952060);
        A0C.A0R = "account_transparency_bloks";
        AbstractC31173DnH.A14(requireActivity, A0C, A01);
    }
}
