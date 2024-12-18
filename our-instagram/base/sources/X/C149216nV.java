package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6nV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149216nV {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public Paint A07;
    public View A08;
    public View A09;
    public View A0A;
    public C55982hj A0B;
    public IgImageView A0C;
    public InterfaceC143576dw A0D;
    public C145166gb A0E;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Context A0J;
    public final View A0K;
    public final UserSession A0L;
    public final InterfaceC56392iX A0M;
    public final InterfaceC56392iX A0N;
    public Integer A0F = C05F.A00;
    public long A06 = -1;

    public static final void A00(View view, C48214LVo c48214LVo, C149216nV c149216nV, boolean z) {
        if (view != null) {
            c48214LVo.A01(new C45341K4u(view, c149216nV, z));
        }
    }

    public final void A01(Integer num) {
        View view = this.A09;
        if (view != null) {
            this.A0F = C05F.A01;
            view.animate().setListener(null).withLayer().setDuration(200L).alpha(0.0f).withEndAction(new RunnableC49970M4l(this, num));
        }
    }

    public C149216nV(Context context, View view, UserSession userSession) {
        this.A0L = userSession;
        this.A0J = context;
        this.A0K = view;
        this.A0M = AbstractC56372iV.A01(view.findViewById(R.id.reel_viewer_gestures_nux_stub), false, false);
        this.A0N = AbstractC56372iV.A01(view.findViewById(R.id.reel_viewer_gestures_zoom_nux_stub), false, false);
    }
}
