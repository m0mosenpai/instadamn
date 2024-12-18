package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class U27 extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final U26 A02;
    public final InterfaceC72020XFi A03;
    public final Activity A04;

    public U27(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, U26 u26, InterfaceC72020XFi interfaceC72020XFi) {
        C14360o3.A0B(userSession, 2);
        this.A04 = activity;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = u26;
        this.A03 = interfaceC72020XFi;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(context), viewGroup, R.layout.avatar_search_user, false);
        if (context != null) {
            WmE wmE = new WmE(viewGroup2);
            wmE.A06.A00 = true;
            viewGroup2.setTag(wmE);
            return new C66173U2o(viewGroup2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        FrameLayout frameLayout;
        String string;
        Reel reel;
        boolean z;
        C109054vU c109054vU;
        InterfaceC108984vN interfaceC108984vN;
        C109054vU c109054vU2;
        InterfaceC108984vN interfaceC108984vN2;
        C50622MWj c50622MWj = (C50622MWj) interfaceC66482zP;
        AbstractC167017dG.A1N(c50622MWj, c3oo);
        Context A03 = AbstractC37301Gc2.A03(c3oo);
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C65741TtG c65741TtG = c50622MWj.A00;
        Tx0 tx0 = ((AbstractC50621MWi) c50622MWj).A00;
        U26 u26 = this.A02;
        InterfaceC72020XFi interfaceC72020XFi = this.A03;
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.UserSearchAvatarViewBinder.Holder");
        WmE wmE = (WmE) tag;
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        AbstractC167017dG.A1U(u26, interfaceC72020XFi);
        C14360o3.A0B(wmE, 8);
        User A06 = c65741TtG.A06();
        interfaceC72020XFi.EDz(wmE.A04, c65741TtG, tx0);
        CircularImageView circularImageView = wmE.A07;
        circularImageView.setVisibility(0);
        AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, A06);
        AbstractC66174U2p.A03(circularImageView);
        WNR wnr = new WNR(24, interfaceC11380iw, c65741TtG, u26, tx0);
        boolean z2 = true;
        boolean A1W = AbstractC167007dF.A1W(A06.A03.BNu());
        if (A06.A03.BNu() == null || !tx0.A0F || !C18U.A06(C06090Tz.A05, userSession, 36313128148928301L)) {
            z2 = false;
        }
        if (A06.A03.BNu() != null && A1W && !z2) {
            Boolean bool = null;
            if (A06.A03.BNu() != null) {
                C1OU c1ou = C1OU.$redex_init_class;
                ReelStore A032 = ReelStore.A03(userSession);
                C14360o3.A07(A032);
                reel = A032.A0M(A06.A03.BNu());
            } else {
                reel = null;
            }
            GradientSpinner gradientSpinner = wmE.A0B;
            gradientSpinner.setVisibility(0);
            gradientSpinner.A02();
            InterfaceC56392iX interfaceC56392iX = wmE.A08;
            interfaceC56392iX.setVisibility(0);
            if (wmE.A00 == null) {
                wmE.A00 = interfaceC56392iX.getView().requireViewById(R.id.badge_background);
            }
            if (wmE.A02 == null) {
                wmE.A02 = (IgImageView) interfaceC56392iX.getView().requireViewById(R.id.badge_icon);
            }
            if (wmE.A01 == null) {
                wmE.A01 = (IgTextView) interfaceC56392iX.getView().requireViewById(R.id.badge_label);
            }
            if (reel != null) {
                C3PO A0E = reel.A0E();
                C105824pt c105824pt = reel.A0H;
                if (c105824pt != null && (c109054vU2 = c105824pt.A02) != null && (interfaceC108984vN2 = c109054vU2.A0A) != null) {
                    z = interfaceC108984vN2.CX2();
                } else {
                    z = false;
                }
                C3PP.A03(gradientSpinner, A0E, z);
                C3PO A0E2 = reel.A0E();
                Boolean valueOf = Boolean.valueOf(reel.A0j());
                C105824pt c105824pt2 = reel.A0H;
                if (c105824pt2 != null && (c109054vU = c105824pt2.A02) != null && (interfaceC108984vN = c109054vU.A0A) != null) {
                    bool = Boolean.valueOf(interfaceC108984vN.CX2());
                }
                AbstractC109174vh.A00(wmE.A00, wmE.A02, wmE.A01, A0E2, valueOf, bool);
            }
            InterfaceC56392iX interfaceC56392iX2 = wmE.A09;
            interfaceC56392iX2.setVisibility(0);
            ((PulseEmitter) interfaceC56392iX2.getView()).A01();
            InterfaceC56392iX interfaceC56392iX3 = wmE.A0A;
            interfaceC56392iX3.setVisibility(0);
            ((PulsingMultiImageView) interfaceC56392iX3.getView()).setAnimatingImageUrl(A06.Bhu(), interfaceC11380iw);
            circularImageView.setVisibility(8);
            frameLayout = wmE.A05;
            C0fQ.A00(new WMm(4, u26, A06, c65741TtG, userSession, wmE, tx0), frameLayout);
            string = A03.getString(2131976571);
        } else {
            C1OU c1ou2 = C1OU.$redex_init_class;
            Reel A02 = C75653aW.A02(userSession, A06);
            wmE.A08.setVisibility(8);
            wmE.A09.setVisibility(8);
            InterfaceC56392iX interfaceC56392iX4 = wmE.A0A;
            if (A02 != null) {
                interfaceC56392iX4.setVisibility(8);
                GradientSpinner gradientSpinner2 = wmE.A0B;
                gradientSpinner2.setVisibility(0);
                FrameLayout frameLayout2 = wmE.A05;
                C0fQ.A00(new WMm(3, u26, A06, c65741TtG, userSession, wmE, tx0), frameLayout2);
                frameLayout2.setContentDescription(A03.getResources().getString(2131974708));
                gradientSpinner2.A02();
                Reel A022 = C75653aW.A02(userSession, A06);
                if (A022 != null) {
                    C3PP.A02(userSession, A022, gradientSpinner2);
                }
                ViewGroup viewGroup = wmE.A03;
                C0fQ.A00(wnr, viewGroup);
                viewGroup.setOnLongClickListener(new ViewOnLongClickListenerC44303Jhu(5, A03, u26, A06, userSession));
                IgTextView igTextView = wmE.A06;
                AbstractC31173DnH.A1F(igTextView, A06);
                C85963sQ.A0C(igTextView, A06.isVerified());
            }
            interfaceC56392iX4.setVisibility(8);
            frameLayout = wmE.A05;
            C0fQ.A00(wnr, frameLayout);
            wmE.A0B.setVisibility(4);
            string = A03.getResources().getString(2131974112);
        }
        frameLayout.setContentDescription(string);
        ViewGroup viewGroup2 = wmE.A03;
        C0fQ.A00(wnr, viewGroup2);
        viewGroup2.setOnLongClickListener(new ViewOnLongClickListenerC44303Jhu(5, A03, u26, A06, userSession));
        IgTextView igTextView2 = wmE.A06;
        AbstractC31173DnH.A1F(igTextView2, A06);
        C85963sQ.A0C(igTextView2, A06.isVerified());
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C50622MWj.class;
    }
}
