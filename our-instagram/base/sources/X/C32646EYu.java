package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.EYu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32646EYu extends AbstractC66422zJ {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC37167GZe A03;
    public final C43768JXh A04;
    public final boolean A05;

    public C32646EYu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37167GZe interfaceC37167GZe, boolean z) {
        AbstractC167007dF.A1F(userSession, 2, interfaceC37167GZe);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC37167GZe;
        this.A05 = z;
        this.A04 = new C43768JXh(context);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C31961E2p(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_channel_discovery_row_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Context context;
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        C32099E8x c32099E8x = (C32099E8x) interfaceC66482zP;
        C31961E2p c31961E2p = (C31961E2p) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c32099E8x, c31961E2p);
        boolean z = c32099E8x.A09;
        TextView textView = c31961E2p.A01;
        textView.setText(c32099E8x.A08);
        TextView textView2 = c31961E2p.A00;
        Context A0L = AbstractC166997dE.A0L(textView2);
        Resources resources = A0L.getResources();
        String str = c32099E8x.A04;
        String A0r = AbstractC166997dE.A0r(resources, str, 2131959582);
        C14360o3.A07(A0r);
        textView2.setText(F2G.A00(A0L, A0r, str, c32099E8x.A0A));
        ImageUrl imageUrl = c32099E8x.A02;
        if (imageUrl != null) {
            Integer num = c32099E8x.A03;
            if (num != null && C4GR.A01(num.intValue()) == A1R) {
                gradientSpinnerAvatarView = c31961E2p.A03;
                gradientSpinnerAvatarView.A0G(null, this.A01, imageUrl, c32099E8x.A01);
            } else {
                gradientSpinnerAvatarView = c31961E2p.A03;
                gradientSpinnerAvatarView.A0F(null, this.A01, imageUrl);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(false);
        }
        if (z && this.A05) {
            textView.setTypeface(null, A1R ? 1 : 0);
            context = this.A00;
            AbstractC31177DnL.A0z(textView2, context);
            textView2.setTypeface(null, A1R ? 1 : 0);
        } else {
            textView.setTypeface(null, 0);
            context = this.A00;
            AbstractC31177DnL.A0y(textView2, context);
            textView2.setTypeface(null, 0);
        }
        if (this.A05) {
            AbstractC31448Drs.A00(c31961E2p.A02, this.A04, JS4.A00(context, z, false, false, false, false));
        }
        ViewOnClickListenerC35683FpI.A00(c31961E2p.itemView, 56, c32099E8x, this);
        c31961E2p.itemView.setOnLongClickListener(new LQH(2, c32099E8x, this, c31961E2p));
        this.A03.Dhb(c32099E8x.A07, c32099E8x.A00, c32099E8x.A03);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32099E8x.class;
    }
}
