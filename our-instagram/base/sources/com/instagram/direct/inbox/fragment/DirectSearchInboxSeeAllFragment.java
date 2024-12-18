package com.instagram.direct.inbox.fragment;

import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31268Doq;
import X.AbstractC31674Dvf;
import X.AbstractC43591JPw;
import X.AbstractC59962oe;
import X.C06090Tz;
import X.C0B1;
import X.C0f9;
import X.C11T;
import X.C14360o3;
import X.C169337h7;
import X.C18920wW;
import X.C18U;
import X.C22P;
import X.C31226Do9;
import X.C31446Drq;
import X.C31650DvG;
import X.C32608EXi;
import X.C32873EdF;
import X.C36065Fw1;
import X.C36303Fzy;
import X.C36305G0a;
import X.C36395G3w;
import X.C36443G5s;
import X.C36445G5u;
import X.C36681GFb;
import X.C36688GFj;
import X.C36693GFo;
import X.C36694GFp;
import X.C3G2;
import X.C41951wl;
import X.C57112jm;
import X.C61972ry;
import X.C66362zD;
import X.C66392zG;
import X.C71163Hc;
import X.C7NH;
import X.EXO;
import X.FGO;
import X.FPJ;
import X.FUO;
import X.GRD;
import X.GYT;
import X.InterfaceC132405yL;
import X.InterfaceC169327h6;
import X.InterfaceC169507hQ;
import X.InterfaceC169517hR;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.InterfaceC83713oG;
import X.LKW;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class DirectSearchInboxSeeAllFragment extends AbstractC59962oe implements InterfaceC132405yL, InterfaceC60122ou, GYT {
    public int A00;
    public int A01;
    public int A02;
    public Activity A03;
    public Context A04;
    public C66362zD A05;
    public UserSession A06;
    public C36303Fzy A07;
    public C7NH A08;
    public C41951wl A09;
    public InterfaceC169507hQ A0A;
    public InterfaceC169517hR A0B;
    public String A0C;
    public String A0D;
    public ArrayList A0E;
    public ArrayList A0F;
    public ArrayList A0G;
    public ArrayList A0H;
    public ArrayList A0I;
    public ArrayList A0J;
    public ArrayList A0K;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public int A0V;
    public int A0W;
    public RectF A0Y;
    public C18920wW A0Z;
    public C57112jm A0a;
    public C32873EdF A0b;
    public C31226Do9 A0c;
    public C36305G0a A0d;
    public DirectThreadKey A0e;
    public Integer A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public boolean A0k;
    public boolean A0m;
    public RecyclerView mRecyclerView;
    public Set A0M = AbstractC166987dD.A1H();
    public Set A0N = AbstractC166987dD.A1H();
    public Set A0Q = AbstractC166987dD.A1H();
    public Set A0P = AbstractC166987dD.A1H();
    public Set A0O = AbstractC166987dD.A1H();
    public Set A0L = AbstractC166987dD.A1H();
    public int A0X = 0;
    public boolean A0l = false;
    public final FPJ A0n = new Object();
    public final InterfaceC41501vz A0o = C31650DvG.A00(this, 37);

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkK(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkL(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC132405yL
    public final void D9q(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void DAs(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dle(RectF rectF, View view, C31446Drq c31446Drq, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dqk(View view, C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        C32873EdF c32873EdF = this.A0b;
        if (c32873EdF != null && (directSearchResult instanceof DirectShareTarget)) {
            C36443G5s A00 = A00((DirectShareTarget) directSearchResult, i, i2, i3, i4, z);
            C36305G0a c36305G0a = this.A0d;
            if (c36305G0a == null) {
                c36305G0a = new C36305G0a(new C36445G5u(1, c32873EdF, this));
                this.A0d = c36305G0a;
            }
            this.A0a.A05(view, C36443G5s.A00(c36305G0a, A00));
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.setTitle(this.A0i);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_SELL_ALL_FRAGMENT";
    }

    private C36443G5s A00(DirectShareTarget directShareTarget, int i, int i2, int i3, int i4, boolean z) {
        String A09 = directShareTarget.A09();
        InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
        List A18 = AbstractC31172DnG.A18(directShareTarget);
        boolean A0E = directShareTarget.A0E();
        return new C36443G5s(null, directShareTarget.A08, A0O, directShareTarget.A04(this.A06.userId, this.A0S), A09, this.A0D, this.A0b.A01, this.A0g, null, A18, i2, i3, i4, i, A0E, z);
    }

    @Override // X.GYT
    public final void DjF() {
        InterfaceC169517hR interfaceC169517hR = this.A0B;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.EKu();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC132405yL
    public final void Dld(C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        DirectShareTarget directShareTarget = directSearchResult;
        if (directShareTarget instanceof DirectShareTarget) {
            directShareTarget = directShareTarget;
            if (directShareTarget.A0B == null) {
                C36443G5s A00 = A00(directShareTarget, i5, i, i2, i4, false);
                directShareTarget.A01();
                String A07 = directShareTarget.A07();
                this.A0C = A07;
                C7NH c7nh = this.A08;
                if (c7nh != null && A07 == null) {
                    c7nh.A02(directShareTarget);
                }
                C36303Fzy c36303Fzy = this.A07;
                if (c36303Fzy != null) {
                    long j = i;
                    long j2 = i2;
                    c36303Fzy.A0A(directShareTarget, this.A0D, i5, j, j2);
                    c36303Fzy.A08(A00, directShareTarget, i5, j, j2, i3);
                    C32873EdF c32873EdF = this.A0b;
                    if (c32873EdF != null) {
                        c32873EdF.A03(A00(directShareTarget, i5, i, i2, i4, false));
                        c32873EdF.A02();
                    }
                }
                FragmentActivity requireActivity = requireActivity();
                this.A03 = requireActivity;
                String str2 = this.A0C;
                if (str2 != null) {
                    this.A0n.A00(requireActivity, this, this.A06, this.A07, this.A08, directShareTarget, str2, this.A0D.isEmpty());
                    return;
                }
                FUO.A01(requireActivity, this, this, this.A0Z, this.A06, new C36395G3w(this, 14), null, directShareTarget, this.A0j, str, null);
            } else {
                return;
            }
        }
        this.A07.A09(directShareTarget);
    }

    @Override // X.InterfaceC132405yL
    public final void DpP(C31446Drq c31446Drq, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        this.A0c.A02(reel, C3G2.A0d, gradientSpinnerAvatarView);
        C36303Fzy c36303Fzy = this.A07;
        if (c36303Fzy != null) {
            c36303Fzy.A08(A00((DirectShareTarget) directSearchResult, i5, i, i2, i4, true), directSearchResult, i5, i, i2, i3);
            c36303Fzy.A09(directSearchResult);
        }
        this.A0f = Integer.valueOf(i + 1);
    }

    @Override // X.InterfaceC132405yL
    public final void Dqm(View view) {
        if (view != null) {
            this.A0a.A04(view);
        }
    }

    @Override // X.InterfaceC132405yL
    public final void Dql(RectF rectF, C22P c22p, DirectShareTarget directShareTarget) {
        Context requireContext = requireContext();
        boolean isResumed = isResumed();
        UserSession userSession = this.A06;
        FragmentActivity requireActivity = requireActivity();
        DirectCameraViewModel A04 = LKW.A04(this.A06, directShareTarget);
        FUO.A00(requireActivity, requireContext, rectF, this.A0Y, c22p, userSession, null, this.A0e, A04, this.A0j, isResumed);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A06;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, X.FOr] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Number A0i;
        int i;
        InterfaceC169517hR A01;
        InterfaceC169327h6 c36693GFo;
        Number A0i2;
        int A02 = C0f9.A02(-1766147028);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A06 = AbstractC31176DnK.A0S(this);
        Context requireContext = requireContext();
        this.A04 = requireContext;
        this.A00 = requireContext.getColor(R.color.grey_5);
        this.A0i = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE");
        this.A0D = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        this.A0g = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID");
        this.A02 = bundle2.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX");
        this.A01 = bundle2.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION");
        this.A0G = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_FRIENDS");
        this.A0H = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_NON_FRIENDS");
        this.A0K = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_INSTAGRAM_NON_CONTACTS");
        this.A0J = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_INSTAGRAM_BUSINESSES_ONLY_NON_CONTACTS");
        this.A0I = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CHANNELS");
        this.A0E = bundle2.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AI_AGENTS");
        this.A0j = bundle2.getString(AbstractC111324zv.A00(147));
        this.A0e = (DirectThreadKey) C0B1.A01(DirectThreadKey.CREATOR, bundle2.getParcelable(AbstractC43591JPw.A00(111)), DirectThreadKey.class);
        this.A0Y = (RectF) C0B1.A01(RectF.CREATOR, bundle2.getParcelable(AbstractC43591JPw.A00(25)), RectF.class);
        this.A0R = bundle2.getBoolean("direct_is_creating_social_channel", false);
        this.A0h = bundle2.getString("direct_channel_preset_type", "");
        this.A0l = bundle2.getBoolean(AbstractC43591JPw.A00(109));
        this.A0Z = AbstractC12220kQ.A01(this, this.A06);
        C36303Fzy A00 = C36303Fzy.A00(this.A06);
        this.A07 = A00;
        this.A0b = C32873EdF.A00(this.A06, A00);
        this.A08 = C7NH.A00(this.A06);
        UserSession userSession = this.A06;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0S = AbstractC31178DnM.A1X(c06090Tz, userSession, 36313931308075333L);
        this.A0m = AbstractC31178DnM.A1X(c06090Tz, this.A06, 36317496130671888L);
        UserSession userSession2 = this.A06;
        C14360o3.A0B(userSession2, 0);
        this.A0T = C18U.A06(c06090Tz, userSession2, 36320382349287840L);
        UserSession userSession3 = this.A06;
        C14360o3.A0B(userSession3, 0);
        this.A0U = C18U.A06(c06090Tz, userSession3, 36320382349156766L);
        this.A0c = new C31226Do9(this, this.A06, null);
        if (this.A0R) {
            this.A0F = AbstractC166987dD.A1E();
        }
        ArrayList arrayList = this.A0G;
        if (arrayList != null) {
            this.A0M = AbstractC31171DnF.A0k(arrayList);
        }
        ArrayList arrayList2 = this.A0K;
        if (arrayList2 != null) {
            this.A0Q = AbstractC31171DnF.A0k(arrayList2);
        }
        ArrayList arrayList3 = this.A0J;
        if (arrayList3 != null) {
            this.A0P = AbstractC31171DnF.A0k(arrayList3);
        }
        ArrayList arrayList4 = this.A0H;
        if (arrayList4 != null) {
            this.A0N = AbstractC31171DnF.A0k(arrayList4);
        }
        ArrayList arrayList5 = this.A0I;
        if (arrayList5 != null) {
            this.A0O = AbstractC31171DnF.A0k(arrayList5);
        }
        ArrayList arrayList6 = this.A0E;
        if (arrayList6 != null) {
            this.A0L = AbstractC31171DnF.A0k(arrayList6);
        }
        if (this.A0I == null) {
            if (this.A0S) {
                A0i2 = AbstractC166997dE.A0i(C06090Tz.A06, this.A06, 36595406284720274L);
            } else {
                A0i2 = AbstractC31176DnK.A0i(36595406284720274L);
            }
            this.A0X = A0i2.intValue();
        }
        if (this.A0m) {
            A0i = AbstractC166997dE.A0i(c06090Tz, this.A06, 36598971107511649L);
        } else {
            A0i = AbstractC31176DnK.A0i(36598971107446112L);
        }
        this.A0W = A0i.intValue();
        UserSession userSession4 = this.A06;
        if (AbstractC31268Doq.A01(userSession4)) {
            i = AbstractC25225BEi.A07(c06090Tz, userSession4, 36601286095147154L);
        } else {
            i = 0;
        }
        this.A0V = i;
        this.A0k = AbstractC31178DnM.A1X(c06090Tz, this.A06, 36314790302124857L);
        new FGO(this.A06).A00.getBoolean("debug_overlay_enabled", false);
        if (this.A0R) {
            UserSession userSession5 = this.A06;
            C61972ry A0L = AbstractC31178DnM.A0L(this);
            String str = this.A0h;
            AbstractC167007dF.A1K(userSession5, A0L);
            if (str == null) {
                c36693GFo = new C36694GFp(userSession5, null, null, false);
            } else {
                c36693GFo = new C36693GFo(userSession5, null, str, 0);
            }
            A01 = new C36688GFj(A0L, new Object(), new C169337h7(A0L, c36693GFo));
        } else {
            Context requireContext2 = requireContext();
            UserSession userSession6 = this.A06;
            C61972ry A0L2 = AbstractC31178DnM.A0L(this);
            boolean z = this.A0l;
            int i2 = this.A0X;
            int i3 = this.A0W;
            int i4 = this.A0V;
            AbstractC167017dG.A1P(userSession6, A0L2);
            A01 = AbstractC31674Dvf.A01(requireContext2, null, userSession6, A0L2, null, null, "universal", "direct_user_search_nullstate", "direct_user_search_keypressed", null, null, null, 20, i2, i3, i4, false, z, false, false, false, false, false, false, false, false);
        }
        this.A0B = A01;
        AbstractC25651Mw.A00(this.A06).A01(this.A0o, C36065Fw1.class);
        this.A09 = C41951wl.A00(this.A06);
        C0f9.A09(1399014554, A02);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1795662520);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.inbox_search_see_all_fragment);
        this.mRecyclerView = AbstractC31176DnK.A0F(A0A);
        C66392zG A00 = C66362zD.A00(requireActivity());
        A00.A01(new C32608EXi(this, this.A06, this, "inbox_search", this.A0k));
        AbstractC31177DnL.A1I(A00, new EXO(this.A04, this));
        this.A05 = AbstractC31173DnH.A0R(A00, new Object());
        AbstractC31177DnL.A17(this, this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.A05);
        InterfaceC169517hR interfaceC169517hR = this.A0B;
        if (interfaceC169517hR != null) {
            InterfaceC169507hQ interfaceC169507hQ = this.A0A;
            if (interfaceC169507hQ == null) {
                interfaceC169507hQ = new C36681GFb(this, 3);
                this.A0A = interfaceC169507hQ;
            }
            interfaceC169517hR.EYJ(interfaceC169507hQ);
            interfaceC169517hR.Eby(this.A0D);
        }
        C11T.A02(new GRD(this));
        C57112jm A002 = C57112jm.A00();
        this.A0a = A002;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            A002.A06(recyclerView, C71163Hc.A00(this));
        }
        AbstractC31179DnN.A0t(this);
        C0f9.A09(-1659185192, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-2013262766);
        super.onDestroy();
        this.A0C = null;
        this.A0f = null;
        AbstractC25651Mw.A00(this.A06).A02(this.A0o, C36065Fw1.class);
        InterfaceC169517hR interfaceC169517hR = this.A0B;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.DEw();
        }
        C0f9.A09(1125921899, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1062315630);
        super.onResume();
        Integer num = this.A0f;
        if (num != null) {
            this.A05.notifyItemChanged(num.intValue());
            this.A0f = null;
        }
        C0f9.A09(-1904823336, A02);
    }
}
