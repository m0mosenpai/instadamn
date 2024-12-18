package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJ2 {
    public final Activity A00;
    public final C55177Odh A01;
    public final View A02;
    public final UserSession A03;

    public final C189448aO A00(InterfaceC16820sZ interfaceC16820sZ, float f, float f2, boolean z, boolean z2, boolean z3) {
        C02I c02i;
        C14360o3.A0B(interfaceC16820sZ, 9);
        C011504d A00 = AbstractC009003e.A00(this.A02);
        if (A00 != null) {
            c02i = A00.A00.A03();
        } else {
            c02i = C02I.A04;
            C14360o3.A08(c02i);
        }
        Rect A0U = AbstractC166987dD.A0U();
        A0U.bottom = c02i.A00;
        A0U.right = c02i.A02;
        A0U.left = c02i.A01;
        C189448aO A0X = AbstractC31177DnL.A0X(this.A03, z2);
        A0X.A03 = f;
        A0X.A04 = f2;
        A0X.A0G = A0U;
        A0X.A1O = z;
        A0X.A11 = true;
        A0X.A0A = R.color.igds_transparent_navigation_bar;
        A0X.A1I = true;
        A0X.A0U = new PHY(this, interfaceC16820sZ);
        A0X.A1G = z3;
        A0X.A0g = null;
        A0X.A0v = false;
        A0X.A1J = false;
        A0X.A0K = null;
        return A0X;
    }

    public OJ2(Activity activity, View view, UserSession userSession, C55177Odh c55177Odh) {
        this.A00 = activity;
        this.A02 = view;
        this.A03 = userSession;
        this.A01 = c55177Odh;
    }
}
