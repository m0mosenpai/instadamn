package com.instagram.direct.inbox.fragment;

import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC18680vv;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC59962oe;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0w9;
import X.C18920wW;
import X.C22P;
import X.C31446Drq;
import X.C31650DvG;
import X.C32608EXi;
import X.C32620EXu;
import X.C32873EdF;
import X.C32889EdW;
import X.C36065Fw1;
import X.C36216FyV;
import X.C36303Fzy;
import X.C36305G0a;
import X.C36395G3w;
import X.C36443G5s;
import X.C36445G5u;
import X.C41951wl;
import X.C57112jm;
import X.C66362zD;
import X.C66392zG;
import X.C71163Hc;
import X.C7NH;
import X.F3Q;
import X.FPJ;
import X.FUO;
import X.InterfaceC132405yL;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.InterfaceC83713oG;
import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* loaded from: classes6.dex */
public class DirectSearchInboxEditHistoryFragment extends AbstractC59962oe implements InterfaceC132405yL, InterfaceC60122ou {
    public Activity A00;
    public UserSession A01;
    public C36303Fzy A02;
    public C7NH A03;
    public DirectShareTarget A04;
    public String A05;
    public C18920wW A06;
    public C66362zD A07;
    public C57112jm A08;
    public C32873EdF A09;
    public C36305G0a A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public final FPJ A0F = new Object();
    public final InterfaceC41501vz A0G = C31650DvG.A00(this, 35);
    public RecyclerView mRecyclerView;

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkK(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkL(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void DAs(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dle(RectF rectF, View view, C31446Drq c31446Drq, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dqk(View view, C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        C32873EdF c32873EdF = this.A09;
        if (c32873EdF != null && (directSearchResult instanceof DirectShareTarget)) {
            C36443G5s A00 = A00((DirectShareTarget) directSearchResult, i, i2, i3, i4);
            C36305G0a c36305G0a = this.A0A;
            if (c36305G0a == null) {
                c36305G0a = new C36305G0a(new C36445G5u(0, c32873EdF, this));
                this.A0A = c36305G0a;
            }
            this.A08.A05(view, C36443G5s.A00(c36305G0a, A00));
        }
    }

    @Override // X.InterfaceC132405yL
    public final void Dql(RectF rectF, C22P c22p, DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.setTitle(getString(2131964442));
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DirectSearchInboxEditHistoryFragment";
    }

    private C36443G5s A00(DirectShareTarget directShareTarget, int i, int i2, int i3, int i4) {
        String str;
        String A09 = directShareTarget.A09();
        InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
        List A18 = AbstractC31172DnG.A18(directShareTarget);
        boolean A0E = directShareTarget.A0E();
        Integer A04 = directShareTarget.A04(this.A01.userId, false);
        String str2 = this.A0C;
        C32873EdF c32873EdF = this.A09;
        if (c32873EdF != null) {
            str = c32873EdF.A01;
        } else {
            str = null;
        }
        return new C36443G5s(null, directShareTarget.A08, A0O, A04, A09, str2, str, this.A0B, null, A18, i2, i3, i4, i, A0E, false);
    }

    @Override // X.InterfaceC132405yL
    public final void D9q(DirectShareTarget directShareTarget) {
        this.A03.A03(directShareTarget);
        A01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC132405yL
    public final void Dld(C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        DirectShareTarget directShareTarget = directSearchResult;
        if (directShareTarget instanceof DirectShareTarget) {
            directShareTarget = directShareTarget;
            C36443G5s A00 = A00(directShareTarget, i5, i, i2, i4);
            directShareTarget.A01();
            String A07 = directShareTarget.A07();
            this.A05 = A07;
            if (A07 == null) {
                this.A03.A02(directShareTarget);
            }
            C36303Fzy c36303Fzy = this.A02;
            if (c36303Fzy != null) {
                long j = i;
                long j2 = i2;
                long j3 = i3;
                c36303Fzy.A0A(directShareTarget, this.A0C, i5, j, j2);
                if (i5 == 18) {
                    j = -1;
                }
                c36303Fzy.A08(A00, directShareTarget, i5, j, j2, j3);
                C32873EdF c32873EdF = this.A09;
                if (c32873EdF != null) {
                    c32873EdF.A03(A00(directShareTarget, i5, i, i2, i4));
                    c32873EdF.A02();
                }
            }
            FragmentActivity requireActivity = requireActivity();
            this.A00 = requireActivity;
            String str2 = this.A05;
            if (str2 != null) {
                this.A04 = directShareTarget;
                this.A0F.A00(requireActivity, this, this.A01, this.A02, this.A03, directShareTarget, str2, true);
                return;
            }
            FUO.A01(requireActivity, this, this, this.A06, this.A01, new C36395G3w(this, 11), null, directShareTarget, this.A0D, str, null);
        }
        C36303Fzy c36303Fzy2 = this.A02;
        if (c36303Fzy2 == null) {
            return;
        }
        c36303Fzy2.A09(directShareTarget);
    }

    @Override // X.InterfaceC132405yL
    public final void DpP(C31446Drq c31446Drq, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        C0w9.A01.EmN("DirectSearchInboxEditHistoryFragment", "Story ring should not be accessible here.");
    }

    @Override // X.InterfaceC132405yL
    public final void Dqm(View view) {
        if (view != null) {
            this.A08.A04(view);
        }
    }

    public static void A01(DirectSearchInboxEditHistoryFragment directSearchInboxEditHistoryFragment) {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        ImmutableList A01 = directSearchInboxEditHistoryFragment.A03.A01();
        if (!A01.isEmpty()) {
            A0E.A00(new C36216FyV(new C32889EdW(directSearchInboxEditHistoryFragment, 2), C05F.A05, C05F.A01, null));
            UserSession userSession = directSearchInboxEditHistoryFragment.A01;
            A0E.A01(F3Q.A00(userSession, C41951wl.A00(userSession), A01, 18, 0, -1, 0, true, false, false));
        } else {
            A0E.A00(new C32620EXu(directSearchInboxEditHistoryFragment.getString(2131968590)));
        }
        directSearchInboxEditHistoryFragment.A07.A05(A0E);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-668620990);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A0D = bundle2.getString(AbstractC111324zv.A00(147));
        C36303Fzy A00 = C36303Fzy.A00(this.A01);
        this.A02 = A00;
        this.A09 = C32873EdF.A00(this.A01, A00);
        this.A03 = C7NH.A00(this.A01);
        this.A0E = AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36314790302124857L);
        this.A06 = AbstractC12220kQ.A01(this, this.A01);
        this.A0C = AbstractC31172DnG.A13(bundle2, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY");
        this.A0B = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID");
        AbstractC25651Mw.A00(this.A01).A01(this.A0G, C36065Fw1.class);
        C0f9.A09(1721145842, A02);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1004690580);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.inbox_search_see_all_fragment);
        this.mRecyclerView = AbstractC31176DnK.A0F(A0A);
        C66392zG A00 = C66362zD.A00(requireActivity());
        AbstractC31177DnL.A1I(A00, new C32608EXi(this, this.A01, this, "inbox_search", this.A0E));
        this.A07 = AbstractC31173DnH.A0R(A00, new Object());
        AbstractC31177DnL.A17(this, this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.A07);
        this.mRecyclerView.setItemAnimator(null);
        A01(this);
        C57112jm A002 = C57112jm.A00();
        this.A08 = A002;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            A002.A06(recyclerView, C71163Hc.A00(this));
        }
        C0f9.A09(1197107570, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-59985368);
        super.onDestroy();
        this.A05 = null;
        this.A04 = null;
        AbstractC25651Mw.A00(this.A01).A02(this.A0G, C36065Fw1.class);
        C0f9.A09(-1325528534, A02);
    }
}
