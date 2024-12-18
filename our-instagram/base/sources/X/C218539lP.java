package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.9lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218539lP extends C9UT {
    public TextView A00;
    public IgSimpleImageView A01;
    public final View A02;
    public final UserSession A03;
    public final C3PF A04;
    public final InterfaceC16660sJ A05;

    public C218539lP(View view, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        this.A05 = interfaceC16660sJ;
        this.A03 = userSession;
        this.A02 = AbstractC166997dE.A0S(view, R.id.invite_upsell_view);
        this.A01 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.invite_upsell_icon);
        this.A00 = AbstractC167007dF.A0N(view, R.id.invite_upsell_title);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A07 = true;
        this.A04 = C216559iC.A00(A0s, this, 17);
    }
}
