package com.instagram.wellbeing.limitedprofile.fragment;

import X.AbstractC12220kQ;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC2044893h;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC57052jg;
import X.AbstractC59962oe;
import X.AbstractC65908TwF;
import X.C05F;
import X.C0f9;
import X.C114795Gm;
import X.C14360o3;
import X.C166467cF;
import X.C1DW;
import X.C1I7;
import X.C1ON;
import X.C24943B1r;
import X.C37091o7;
import X.C38321qM;
import X.C3CO;
import X.C3FN;
import X.C3FQ;
import X.C3LO;
import X.C3LY;
import X.C56352iT;
import X.C57112jm;
import X.C57352kA;
import X.C61372qz;
import X.C66081TzI;
import X.C675432t;
import X.C67923V2n;
import X.C68860VdG;
import X.C68861VdH;
import X.C70083W2b;
import X.C70947Wkt;
import X.C71075WnX;
import X.C71161Wow;
import X.C71163Hc;
import X.C84923qg;
import X.C9GR;
import X.CST;
import X.Eg5;
import X.EnumC53178Nfa;
import X.GRN;
import X.InterfaceC56362iU;
import X.InterfaceC58140Pq5;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC60682pr;
import X.InterfaceC71986XDx;
import X.OKY;
import X.RunnableC36962GQf;
import X.WD6;
import X.WNS;
import X.Wk4;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableSet;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/* loaded from: classes11.dex */
public class LimitedCommentsFragment extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60682pr, InterfaceC58140Pq5, InterfaceC71986XDx, InterfaceC60122ou {
    public UserSession A00;
    public C38321qM A01;
    public C1I7 A02;
    public C67923V2n A03;
    public C166467cF A04;
    public WD6 A05;
    public C70947Wkt A06;
    public boolean A07;
    public C675432t A08;
    public C57112jm A09;
    public C71161Wow A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public View mRootView;
    public C3FQ mScrollingViewProxy;
    public final C61372qz A0F = new C61372qz();
    public final C68861VdH A0H = new C68861VdH(this);
    public final C68860VdG A0G = new C68860VdG(this);

    @Override // X.InterfaceC71986XDx
    public final void Cx9(C84923qg c84923qg) {
        this.A0A.Cx9(c84923qg);
    }

    @Override // X.InterfaceC71986XDx
    public final void D6C(C84923qg c84923qg) {
        this.A0A.D6C(c84923qg);
        FragmentActivity activity = getActivity();
        C56352iT A03 = C56352iT.A0t.A03(activity);
        if (activity instanceof BaseFragmentActivity) {
            A03.A0T();
        }
    }

    @Override // X.InterfaceC71986XDx
    public final void D9f(C84923qg c84923qg) {
        this.A0A.D9f(c84923qg);
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dex() {
        this.A03.A01(this.A01);
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dez() {
        this.A03.A01(this.A01);
    }

    @Override // X.InterfaceC58140Pq5
    public final void Df0(EnumC53178Nfa enumC53178Nfa, String str, List list, List list2, Set set) {
        Context context;
        if (enumC53178Nfa == EnumC53178Nfa.A02 && (context = getContext()) != null) {
            C37091o7.A00().Coe(context, this, this.A00, list, (Set) set.stream().map(new GRN(1)).filter(new C24943B1r(2)).collect(Collectors.toSet()), 0);
        }
        if (isAdded()) {
            this.A06.A00 = null;
            this.A03.A06.A03.clear();
            this.A03.A01(this.A01);
        }
    }

    @Override // X.InterfaceC71986XDx
    public final void Dxk(User user, String str) {
        this.A0A.Dxk(user, str);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0k;
        if (isAdded()) {
            ImmutableSet A03 = ImmutableSet.A03(this.A03.A06.A00);
            C14360o3.A07(A03);
            int size = A03.size();
            if (size == 0) {
                boolean z = this.A07;
                Context requireContext = requireContext();
                int i = 2131965141;
                if (z) {
                    i = 2131965154;
                }
                A0k = requireContext.getString(i);
            } else {
                A0k = AbstractC167017dG.A0k(AbstractC166997dE.A0N(this), size, R.plurals.x_selected);
            }
            AbstractC31175DnJ.A1I(interfaceC56362iU, A0k);
            ImmutableSet A032 = ImmutableSet.A03(this.A03.A06.A00);
            C14360o3.A07(A032);
            int size2 = A032.size();
            if (size2 > 0) {
                Context context = getContext();
                context.getClass();
                int color = context.getColor(R.color.design_dark_default_color_on_background);
                if (size2 <= 25) {
                    C3LO c3lo = new C3LO();
                    c3lo.A06 = R.drawable.instagram_circle_x_pano_outline_24;
                    c3lo.A05 = 2131965140;
                    AbstractC31176DnK.A1B(new WNS(this, 31), c3lo, interfaceC56362iU);
                    RunnableC36962GQf runnableC36962GQf = this.A06.A00;
                    if (runnableC36962GQf == null || runnableC36962GQf.A00) {
                        C3LO c3lo2 = new C3LO();
                        c3lo2.A02(C05F.A0u);
                        c3lo2.A0G = new WNS(this, 32);
                        c3lo2.A02 = color;
                        interfaceC56362iU.AA9(new C3LY(c3lo2));
                    }
                    C3LO c3lo3 = new C3LO();
                    c3lo3.A06 = R.drawable.instagram_circle_check_pano_outline_24;
                    int i2 = 2131965139;
                    if (this.A07) {
                        i2 = 2131965153;
                    }
                    c3lo3.A05 = i2;
                    c3lo3.A0G = new WNS(this, 33);
                    c3lo3.A02 = color;
                    interfaceC56362iU.AA9(new C3LY(c3lo3));
                    WNS wns = new WNS(this, 34);
                    Integer num = C05F.A0C;
                    ColorDrawable colorDrawable = new ColorDrawable(getContext().getColor(R.color.badge_color));
                    int color2 = getContext().getColor(R.color.blue_6);
                    Color.colorToHSV(getContext().getColor(R.color.badge_color), r4);
                    float[] fArr = {0.0f, 0.0f, fArr[2] * 0.9f};
                    interfaceC56362iU.Ehg(new C114795Gm(null, null, null, colorDrawable, null, wns, num, color, Color.HSVToColor(fArr), color2, -2, R.drawable.instagram_x_pano_outline_24, -2, -2, false));
                }
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A07) {
            return "igbc_limited_comments_view";
        }
        return "limited_comments_view";
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        View view = this.mView;
        if (view != null) {
            C3FQ c3fq = this.mScrollingViewProxy;
            if (c3fq == null) {
                C3FQ A00 = C3FN.A00((ViewGroup) view.requireViewById(android.R.id.list));
                this.mScrollingViewProxy = A00;
                return A00;
            }
            return c3fq;
        }
        throw new IllegalStateException("Cannot call getScrollingViewProxy before view is initialized");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A0D;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A0E;
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dey() {
        if (isAdded()) {
            C9GR.A03(getContext(), "Failed deleting message", "Failed deleting", 0);
            this.A06.A00 = null;
            C70083W2b c70083W2b = this.A03.A06;
            Set set = c70083W2b.A03;
            ImmutableSet A03 = ImmutableSet.A03(set);
            C14360o3.A07(A03);
            c70083W2b.A00.addAll(A03);
            set.clear();
            this.A03.A01(this.A01);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-952328769);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("LimitedCommentsFragment.MEDIA_ID");
        string.getClass();
        this.A0B = string;
        this.A0C = requireArguments.getString("LimitedComments.SESSION_ID");
        this.A0E = requireArguments.getBoolean("LimitedCommentsFragment.IS_SPONSORED");
        this.A0D = requireArguments.getBoolean("LimitedCommentsFragment.IS_ORGANIC");
        this.A07 = requireArguments.getBoolean("LimitedCommentsFragment.IS_LIMITED_REPLY");
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A00 = A0S;
        this.A01 = C1DW.A00(A0S).A02(this.A0B);
        String string2 = requireArguments().getString("LimitedCommentsFragment.MEDIA_ID");
        string2.getClass();
        C1ON A04 = AbstractC2044893h.A04(this.A00, string2);
        A04.A00 = new C66081TzI(this, 40);
        schedule(A04);
        this.A04 = new C166467cF(this.A00, this.A01);
        C71075WnX c71075WnX = new C71075WnX(this);
        this.A08 = new C675432t(this.A00, this, null);
        this.A09 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        Context requireContext = requireContext();
        C57352kA A05 = C57352kA.A05(this.A00);
        C68861VdH c68861VdH = this.A0H;
        Context requireContext2 = requireContext();
        UserSession userSession = this.A00;
        this.A03 = new C67923V2n(requireContext, new CST(requireContext2, this.A08, AbstractC12220kQ.A01(this, userSession), userSession, this.A09, this), this, A05, c71075WnX, this, c68861VdH);
        this.A06 = new C70947Wkt(requireContext(), this, this, this.A00, this.A01, this.A03, this.A0C, this.A07);
        this.A05 = new WD6(requireContext(), this, this.A00, this.A01, this.A03, this, this.A0C, this.A07);
        UserSession userSession2 = this.A00;
        this.A0A = new C71161Wow(requireContext(), this, this, userSession2, this.A03, this.A05, this.A06);
        this.A02 = AbstractC65908TwF.A00(this.A00, c71075WnX, this.A03, null, C05F.A01, 3, true);
        registerLifecycleListener(new C3CO(this.A00, new Wk4(this, 2)));
        C0f9.A09(-65444505, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2778579);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.limited_comment_thread);
        C0f9.A09(-1455406982, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.layout_comment_thread_parent);
        this.mRootView = requireViewById;
        ((RecyclerView) requireViewById.requireViewById(android.R.id.list)).setLayoutManager(new LinearLayoutManagerCompat(requireContext()));
        getScrollingViewProxy().EPJ(this.A03);
        getScrollingViewProxy().AAJ(new Eg5(this, 2));
        this.A09.A06(getScrollingViewProxy().CFj(), C71163Hc.A00(this));
        OKY oky = new OKY(this, this.A00, this.A0C);
        if (this.A07) {
            num = C05F.A0N;
        } else {
            num = C05F.A00;
        }
        oky.A00(num);
    }
}
