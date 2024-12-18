package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.VyL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69945VyL {
    public static final void A01(C1338462s c1338462s, C120445cn c120445cn) {
        C6T7.A00(c120445cn.A00, c1338462s, c120445cn.A03).A00().A07(c120445cn.A02);
        c120445cn.A01.setVisibility(0);
    }

    public static final C120445cn A00(LayoutInflater layoutInflater, ViewGroup viewGroup, C62862tP c62862tP, UserSession userSession) {
        boolean A1a = AbstractC167017dG.A1a(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.bloks_inform_overlay, viewGroup, A1a);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
        return new C120445cn((FrameLayout) inflate, c62862tP, userSession);
    }
}
