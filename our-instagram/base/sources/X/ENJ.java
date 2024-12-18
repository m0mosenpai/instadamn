package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class ENJ extends C38K implements InterfaceC60072op, AbsListView.OnScrollListener, GZS, InterfaceC37297Gby, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FollowAccountsYouKnowFragment";
    public View A00;
    public View A01;
    public View A02;
    public InterfaceC56362iU A03;
    public BusinessFlowAnalyticsLogger A04;
    public UserSession A05;
    public C31768DxP A06;
    public String A07;
    public List A09;
    public Map A0A;
    public java.util.Set A0B;
    public View A0C;
    public EVH A0D;
    public TypeaheadHeader A0E;
    public String A0F;
    public boolean A0G;
    public final java.util.Set A0H = AbstractC166987dD.A1H();
    public final AtomicInteger A0I = new AtomicInteger(0);
    public String A08 = "";
    public final C61372qz A0K = new C61372qz();
    public final InterfaceC41501vz A0J = C31728DwZ.A00(this, 11);

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC37297Gby
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.InterfaceC37297Gby
    public final void DTn(View view, User user, boolean z) {
    }

    @Override // X.GYZ
    public final void Des(User user) {
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
    }

    private void A01() {
        int i;
        View.OnClickListener viewOnClickListenerC31724DwT;
        int i2;
        if (this.A03 != null) {
            AbstractC167007dF.A0x(this.A00);
            boolean z = this.A0G;
            boolean isEmpty = this.A0H.isEmpty();
            InterfaceC56362iU interfaceC56362iU = this.A03;
            C3LO A0B = AbstractC31171DnF.A0B();
            if (z) {
                if (isEmpty) {
                    A0B.A0K = getString(2131974123);
                    i2 = 69;
                } else {
                    A0B.A0K = getString(2131961124);
                    i2 = 70;
                }
                viewOnClickListenerC31724DwT = new ViewOnClickListenerC35667Fp2(this, i2);
            } else {
                if (isEmpty) {
                    A0B.A0K = getString(2131974123);
                    i = 0;
                } else {
                    A0B.A0K = getString(2131961124);
                    i = 1;
                }
                viewOnClickListenerC31724DwT = new ViewOnClickListenerC31724DwT(this, i);
            }
            this.A00 = AbstractC31177DnL.A0F(viewOnClickListenerC31724DwT, A0B, interfaceC56362iU);
        }
    }

    public static void A02(ENJ enj) {
        String str = enj.A08;
        if (!str.isEmpty()) {
            enj.A0E.A04(str);
            enj.A0E.A02();
        }
    }

    public static void A03(ENJ enj, User user, String str, boolean z) {
        C1ON A04 = AbstractC35238FgX.A04(enj.A05, AbstractC13670mt.A06("friendships/%s/following/", user.getId()), null, "nux_follow_from_logged_in_accounts", str);
        A04.A00 = new C32517ETt(enj, user, z);
        enj.schedule(A04);
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C35037FcA A01;
        String id;
        String str;
        C0fA.A00(this.A06, -984921008);
        if (user.B7L() != FollowStatus.A05 && user.B7L() != FollowStatus.A07) {
            this.A0H.remove(user);
            A01 = C35230FgN.A01(this, C1Q9.A1U);
            A01.A04("actor_id", this.A05.userId);
            id = user.getId();
            str = "unfollowing_user_id";
        } else {
            this.A0H.add(user);
            A01 = C35230FgN.A01(this, C1Q9.A1S);
            A01.A04("actor_id", this.A05.userId);
            id = user.getId();
            str = "following_user_id";
        }
        A01.A04(str, id);
        A01.A02();
        A01();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        this.A03 = interfaceC56362iU;
        A01();
        Context context = getContext();
        if (context != null) {
            this.A03.EPD(new ColorDrawable(AbstractC167007dF.A09(context, R.attr.igds_color_primary_background)));
        }
        if (this.A0G) {
            InterfaceC56362iU interfaceC56362iU2 = this.A03;
            AbstractC31176DnK.A1C(new ViewOnClickListenerC35667Fp2(this, 68), AbstractC31176DnK.A0I(), interfaceC56362iU2);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (!TextUtils.isEmpty(this.A0F)) {
            return this.A0F;
        }
        return "follow_accounts_you_know_sac_nux";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC13880nE.A0O(this.A02);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("invite_followers_via_suma_followings", this.A07, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        if (!this.A08.equals(str)) {
            this.A0B.clear();
            this.A08 = str;
            this.A06.A01.clear();
            A02(this);
            if (!TextUtils.isEmpty(this.A08)) {
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(0);
                }
                C31768DxP c31768DxP = this.A06;
                c31768DxP.A02 = true;
                c31768DxP.A03 = false;
                C0fA.A00(c31768DxP, 1772264809);
                EVH evh = this.A0D;
                String str2 = this.A08;
                Deque deque = evh.A05;
                synchronized (deque) {
                    if (!evh.A06.containsKey(str2) && !deque.contains(str2)) {
                        deque.add(str2);
                        Handler handler = evh.A03;
                        if (!handler.hasMessages(1)) {
                            handler.sendEmptyMessageDelayed(1, 300L);
                        }
                    }
                }
                return;
            }
            C31768DxP c31768DxP2 = this.A06;
            c31768DxP2.A02 = false;
            c31768DxP2.A03 = false;
            C0fA.A00(c31768DxP2, 1772264809);
        }
    }

    public static void A04(ENJ enj, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (AbstractC31174DnI.A0j(enj.A05, A15) == FollowStatus.A08) {
                A15.A0k(FollowStatus.A06);
            }
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A02 = C0f9.A02(139368887);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && getContext() != null) {
            this.A07 = bundle2.getString("ARG_ENTRY_POINT");
            this.A0G = bundle2.getBoolean("ARG_FROM_PRO_ONBOARDING_CHECKLIST");
            if (!TextUtils.isEmpty(bundle2.getString("ARG_MODULE_NAME"))) {
                str = bundle2.getString("ARG_MODULE_NAME");
            } else {
                str = "follow_accounts_you_know_sac_nux";
            }
            this.A0F = str;
            this.A05 = AbstractC31176DnK.A0S(this);
            this.A06 = new C31768DxP(getContext(), this, this.A05, this, this, new C31538DtO(requireArguments(), this.A05, null));
            List BOe = C0BQ.A00(this.A05).BOe();
            this.A09 = BOe;
            Iterator it = BOe.iterator();
            while (it.hasNext()) {
                A03(this, AbstractC25226BEj.A15(it), null, true);
            }
            EVH evh = new EVH(this.A05, this, this.A09);
            this.A0D = evh;
            evh.A01 = this;
            if (this.A0G) {
                this.A04 = AbstractC151606s6.A01(EnumC151596s5.A07, this.A05, this.A0F, AbstractC166997dE.A0n());
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Clo(new Y7A("invite_followers_via_suma_followings", this.A07, null, null, null, null, null, null));
            }
            i = 1509241957;
        } else {
            i = 1693339268;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-837791278);
        this.A0A = AbstractC166987dD.A1G();
        this.A0B = AbstractC166987dD.A1H();
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        this.A02 = A0A;
        ViewGroup A05 = AbstractC31180DnO.A05(A0A);
        layoutInflater.inflate(R.layout.sac_nux_follow_accounts_you_know_fragment, A05, true);
        View A0A2 = AbstractC31172DnG.A0A(layoutInflater, A05, R.layout.sac_nux_follow_accounts_search_bar_row);
        this.A0C = A0A2;
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) A0A2.requireViewById(R.id.typeahead_header);
        this.A0E = typeaheadHeader;
        typeaheadHeader.setOnSearchEditTextFocusChangeListener(new ViewOnFocusChangeListenerC35694FpU(this, 13));
        this.A06.A00 = this.A0C;
        ((AbsListView) this.A02.requireViewById(android.R.id.list)).setAdapter((ListAdapter) this.A06);
        this.A01 = this.A02.findViewById(R.id.loading_spinner);
        C35203Ffv.A00(this.A05, null, null, null, "follow_from_logged_in_accounts", this.A07);
        View view = this.A02;
        C0f9.A09(768793190, A02);
        return view;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1765381440);
        AbstractC25651Mw.A00(this.A05).A02(this.A0J, C70073Cr.class);
        super.onDestroy();
        C0f9.A09(485123731, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-520437212);
        this.A0D.onDestroyView();
        AbstractC13880nE.A0O(this.A02);
        this.A02 = null;
        this.A0E = null;
        this.A0C = null;
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(-1868107495, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-445731919);
        super.onPause();
        AbstractC13880nE.A0O(this.A02);
        C0f9.A09(2115152319, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(87840914);
        super.onResume();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        AbstractC31180DnO.A1B(this);
        C0f9.A09(-1778918413, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int A03 = C0f9.A03(1251915912);
        InterfaceC56362iU interfaceC56362iU = this.A03;
        if (interfaceC56362iU == null) {
            i4 = -1965092284;
        } else {
            if (i >= 1) {
                interfaceC56362iU.Efu(2131962681);
                this.A03.C94().setSingleLine(false);
            } else {
                interfaceC56362iU.setTitle("");
            }
            this.A0K.onScroll(absListView, i, i2, i3);
            i4 = -1531563379;
        }
        C0f9.A0A(i4, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-522083398);
        this.A0K.onScrollStateChanged(absListView, i);
        C0f9.A0A(-1851961640, A03);
    }

    @Override // X.InterfaceC37297Gby
    public final void onUserRowClick(User user) {
        if (getActivity() != null) {
            C31368DqX A01 = AbstractC31402Dr6.A01(this.A05, user.getId(), "follow_list_user_row", getModuleName());
            C31368DqX.A01(AbstractC31173DnH.A0P(requireActivity(), this.A05), this.A05, AbstractC31364DqT.A02(), A01);
            C35037FcA A012 = C35230FgN.A01(this, C1Q9.A1V);
            A012.A04("actor_id", this.A05.userId);
            A012.A04("following_user_id", user.getId());
            A012.A02();
        }
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A02(this);
        TypeaheadHeader typeaheadHeader = this.A0E;
        typeaheadHeader.A01 = this;
        typeaheadHeader.A03(requireContext().getString(2131972993));
        this.A0K.A03(this.A0E.A04);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setOnScrollListener(this);
        AbstractC25651Mw.A00(this.A05).A01(this.A0J, C70073Cr.class);
    }
}
