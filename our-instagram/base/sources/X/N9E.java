package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class N9E extends AbstractC65632xz {
    public final Context A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final ENZ A03;

    public N9E(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, ENZ enz) {
        C14360o3.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = enz;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        View view2;
        IgdsButton igdsButton;
        IgdsButton igdsButton2;
        View.OnClickListener viewOnClickListenerC55417OjS;
        LinearLayout linearLayout;
        int A03 = C0f9.A03(1026181936);
        boolean z = obj instanceof C54472O5a;
        Object obj3 = null;
        if (z || (obj instanceof C54563O8p) || (obj instanceof C54564O8q)) {
            if (view != null) {
                obj3 = view.getTag();
            }
            C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.share.facebook.upsell.crosspost.ReelsShareToFbRowViewBinder.Holder");
            C54722OEz c54722OEz = (C54722OEz) obj3;
            Context context = this.A00;
            AbstractC59962oe abstractC59962oe = this.A01;
            UserSession userSession = this.A02;
            ENZ enz = this.A03;
            C14360o3.A0B(c54722OEz, 0);
            JQ0.A1O(obj, context, abstractC59962oe, userSession, enz);
            C46552Bt A00 = AbstractC46542Bs.A00(userSession);
            if (z) {
                c54722OEz.A07.setVisibility(8);
                c54722OEz.A04.setVisibility(0);
                IgTextView igTextView = c54722OEz.A03;
                igTextView.setVisibility(0);
                igTextView.setText(2131972025);
                c54722OEz.A02.setVisibility(8);
                c54722OEz.A05.setVisibility(8);
                IgdsButton igdsButton3 = c54722OEz.A06;
                igdsButton3.setVisibility(0);
                igdsButton3.setText(2131973639);
                C0fQ.A00(new ViewOnClickListenerC55425Oja(4, context, userSession, enz, obj, abstractC59962oe, c54722OEz), igdsButton3);
                if (C200108tF.A08(userSession) && C55202OeD.A00 == null) {
                    C56033Ou5 c56033Ou5 = new C56033Ou5(2, context, abstractC59962oe, userSession, obj, c54722OEz, enz);
                    C55202OeD.A00 = c56033Ou5;
                    AbstractC25651Mw.A00(userSession).A01(c56033Ou5, C211849aB.class);
                }
            } else if (obj instanceof C54563O8p) {
                C55202OeD.A01(context, abstractC59962oe, userSession, (C54563O8p) obj, c54722OEz, enz);
            } else if (obj instanceof C54564O8q) {
                C54564O8q c54564O8q = (C54564O8q) obj;
                C196058lv.A08.A04(C55202OeD.A01, userSession);
                c54564O8q.A00 = A00.A0C();
                C38321qM c38321qM = c54564O8q.A01;
                EnumC76753cN A1m = c38321qM.A1m();
                EnumC76753cN enumC76753cN = EnumC76753cN.A04;
                if (!AbstractC167007dF.A1X(A1m, enumC76753cN) && c38321qM.A1m() != EnumC76753cN.A06) {
                    view2 = c54722OEz.A04;
                } else {
                    c54722OEz.A04.setVisibility(0);
                    view2 = c54722OEz.A07;
                }
                view2.setVisibility(8);
                if (!AbstractC167007dF.A1X(c38321qM.A1m(), enumC76753cN) && c38321qM.A1m() != EnumC76753cN.A06) {
                    c54722OEz.A03.setVisibility(8);
                } else {
                    IgTextView igTextView2 = c54722OEz.A03;
                    igTextView2.setVisibility(0);
                    igTextView2.setText(2131972087);
                }
                if (!AbstractC167007dF.A1X(c38321qM.A1m(), enumC76753cN) && c38321qM.A1m() != EnumC76753cN.A06) {
                    c54722OEz.A02.setVisibility(8);
                } else {
                    IgTextView igTextView3 = c54722OEz.A02;
                    igTextView3.setVisibility(0);
                    AbstractC31173DnH.A1F(igTextView3, AbstractC166997dE.A0Y(userSession));
                }
                if (AbstractC167007dF.A1X(c38321qM.A1m(), enumC76753cN)) {
                    C55202OeD.A02(EnumC201098ur.VIEW, userSession, c38321qM.getId());
                }
                if (c54564O8q.A00) {
                    if (AbstractC167007dF.A1X(c38321qM.A1m(), enumC76753cN)) {
                        c54722OEz.A05.setVisibility(8);
                        IgdsButton igdsButton4 = c54722OEz.A06;
                        igdsButton4.setVisibility(0);
                        igdsButton4.setText(2131971967);
                        viewOnClickListenerC55417OjS = new ViewOnClickListenerC55422OjX(4, enz, c54722OEz, abstractC59962oe, userSession, c54564O8q);
                        linearLayout = igdsButton4;
                        C0fQ.A00(viewOnClickListenerC55417OjS, linearLayout);
                    } else if (c38321qM.A1m() == EnumC76753cN.A06) {
                        c54722OEz.A05.setVisibility(8);
                        igdsButton2 = c54722OEz.A06;
                        igdsButton2.setVisibility(0);
                        igdsButton2.setText(2131971967);
                        MSY.A1E(igdsButton2);
                    } else {
                        igdsButton = c54722OEz.A06;
                        igdsButton.setVisibility(8);
                        enz.A04();
                    }
                } else {
                    c54722OEz.A06.setVisibility(8);
                    if (AbstractC167007dF.A1X(c38321qM.A1m(), enumC76753cN)) {
                        IgdsButton igdsButton5 = c54722OEz.A05;
                        igdsButton5.setVisibility(0);
                        igdsButton5.A02(EnumC99774dy.A02, R.drawable.instagram_chevron_right_pano_outline_16);
                        LinearLayout linearLayout2 = c54722OEz.A00;
                        viewOnClickListenerC55417OjS = new ViewOnClickListenerC55417OjS(6, abstractC59962oe, c54722OEz, c54564O8q, userSession);
                        linearLayout = linearLayout2;
                        C0fQ.A00(viewOnClickListenerC55417OjS, linearLayout);
                    } else if (c38321qM.A1m() == EnumC76753cN.A06) {
                        c54722OEz.A00.setEnabled(false);
                        igdsButton2 = c54722OEz.A05;
                        igdsButton2.setVisibility(0);
                        igdsButton2.A02(EnumC99774dy.A02, R.drawable.instagram_chevron_right_pano_outline_16);
                        MSY.A1E(igdsButton2);
                    } else {
                        igdsButton = c54722OEz.A05;
                        igdsButton.setVisibility(8);
                        enz.A04();
                    }
                }
            }
        }
        C0f9.A0A(561880925, A03);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        if (C55202OeD.A00 != null) {
            AbstractC25651Mw.A00(userSession).A02(C55202OeD.A00, C211849aB.class);
            C55202OeD.A00 = null;
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(5526017);
        Context context = this.A00;
        UserSession userSession = this.A02;
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(userSession, 2), userSession, 36329762557280783L);
        int i2 = R.layout.reels_row_share_to_fb_layout;
        if (A06) {
            i2 = R.layout.reels_row_share_to_fb_large_icon_layout;
        }
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, i2);
        C14360o3.A0A(A0A);
        A0A.setTag(new C54722OEz(A0A));
        C0f9.A0A(519078393, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
