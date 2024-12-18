package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OIj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54770OIj {
    public View A00;
    public C189478aR A01;
    public final UserSession A02;

    public C54770OIj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A00(Context context, View view, Fragment fragment) {
        C52834NZr c52834NZr;
        boolean A1R = AbstractC167007dF.A1R(0, context, fragment);
        C14360o3.A0B(view, 2);
        UserSession userSession = this.A02;
        boolean z = !AbstractC109224vo.A03(userSession);
        this.A00 = view;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        View view2 = this.A00;
        if (view2 != null) {
            view2.setPivotX(AbstractC13880nE.A0A(context) / 2.0f);
            view2.setPivotY(dimensionPixelSize);
        }
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25226BEj.A1M(context, A0y, 2131965351);
        A0y.A0k = A1R;
        A0y.A03 = 0.6f;
        A0y.A0q = A1R;
        A0y.A0k = false;
        A0y.A1O = A1R;
        A0y.A04 = 1.0f;
        AbstractC25225BEi.A1Q(A0y, A1R);
        A0y.A0x = A1R;
        A0y.A0T = new PHR(this, dimensionPixelSize2, z);
        C189478aR A00 = A0y.A00();
        this.A01 = A00;
        if ((fragment instanceof C52834NZr) && (c52834NZr = (C52834NZr) fragment) != null) {
            c52834NZr.A01 = A00;
        }
        C3DN A01 = C3DN.A00.A01(context);
        if (A01 != null) {
            C3DP c3dp = (C3DP) A01;
            if (c3dp.A0h) {
                c3dp.A0H = new C56771PHo(2, context, fragment, this);
                A01.A0B();
                return;
            }
        }
        C189478aR c189478aR = this.A01;
        if (c189478aR == null) {
            return;
        }
        c189478aR.A03(context, fragment);
    }
}
