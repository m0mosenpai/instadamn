package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.53I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53I extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60092or, InterfaceC11480j6, InterfaceC60112ot, InterfaceC60702pu, C53J {
    public static final /* synthetic */ C0YR[] A09 = {new AnonymousClass019(C53I.class, "mainActivity", "getMainActivity()Lcom/instagram/mainactivity/delegate/IgMainActivityLegacy;", 0)};
    public static final String __redex_internal_original_name = "ProfileWithMenuFragment";
    public List A00;
    public UserDetailFragment A01;
    public final C32550EVa A02 = new C32550EVa(this, new C9EY(this, 19));
    public final InterfaceC09390do A03 = C1XM.A00(new C9EY(this, 20));
    public final C31242DoQ A07 = new C31242DoQ(this);
    public final C54442O3w A06 = new C54442O3w(this);
    public final InterfaceC41501vz A05 = new C36146FxK(this);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final boolean A08 = true;

    @Override // X.C53J
    public final void AVB(boolean z) {
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            userDetailFragment.AVB(false);
        }
    }

    @Override // X.InterfaceC60702pu
    public final void Drr() {
        A01(null, false);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            userDetailFragment.configureActionBar(interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        A01(Integer.valueOf(configuration.screenWidthDp), false);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.user_detail_fragment).setLayoutDirection(3);
        AbstractC155756z4.A00();
        UserSession userSession = (UserSession) this.A04.getValue();
        requireContext();
        C14360o3.A0B(userSession, 0);
        User A00 = C08730cb.A00(userSession).A00();
        if (C4K3.A00(userSession) && A00.A2J() && !C18U.A06(C06090Tz.A06, userSession, 36314592732777192L)) {
            FTV.A01(null, userSession, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (X.C18U.A06(r1, r0, 36315778143751730L) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (X.C151366re.A02(r0) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        if (X.C18U.A06(r1, r0, 36322297904638070L) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (X.AbstractC151756sL.A00().A05(r0) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C53I r26) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53I.A00(X.53I):void");
    }

    public final void A02() {
        InterfaceC09390do interfaceC09390do = this.A03;
        if (interfaceC09390do.CWa()) {
            InterfaceC74953Yl interfaceC74953Yl = ((C52129N5d) interfaceC09390do.getValue()).A02;
            interfaceC74953Yl.Egh(Integer.valueOf(((Number) interfaceC74953Yl.getValue()).intValue() + 1));
        }
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return this.A08;
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        User A01 = C17060sy.A01.A01((UserSession) this.A04.getValue());
        c11520jB.A0A(AbstractC58410Puo.A01(43, 8, 117), A01.getUsername());
        c11520jB.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A01.getId());
        return c11520jB;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            userDetailFragment.EMT();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "self_profile";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (X.AbstractC13180m4.A02(requireContext()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(java.lang.Integer r5, boolean r6) {
        /*
            r4 = this;
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L5a
            if (r5 == 0) goto L77
            int r0 = r5.intValue()
        Lc:
            boolean r0 = X.AbstractC52812bN.A01(r0)
            r3 = 1
            r1 = r0 ^ 1
            r2 = 0
            X.EVa r0 = r4.A02
            java.lang.Object r0 = r0.A02()
            X.2dC r0 = (X.InterfaceC53732dC) r0
            if (r1 == 0) goto L5f
            if (r0 == 0) goto L23
            r0.EkV(r6)
        L23:
            if (r6 != 0) goto L5d
            int r0 = X.C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.0do r0 = r4.A04
            r0.getValue()
            android.content.Context r0 = r4.requireContext()
            boolean r0 = X.AbstractC13180m4.A02(r0)
            if (r0 != 0) goto L5d
        L36:
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L5a
            r0 = 2131443612(0x7f0b3f9c, float:1.8509297E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L5a
            if (r3 == 0) goto L5b
            X.0do r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            int r0 = X.AbstractC57322k7.A01(r0)
            int r0 = X.AbstractC53242c7.A0G(r2, r0)
        L57:
            X.AbstractC13880nE.A0Y(r1, r0)
        L5a:
            return
        L5b:
            r0 = 0
            goto L57
        L5d:
            r3 = 0
            goto L36
        L5f:
            if (r0 == 0) goto L64
            r0.EkV(r2)
        L64:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L5a
            r0 = 2131443612(0x7f0b3f9c, float:1.8509297E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L5a
            X.AbstractC13880nE.A0Y(r0, r2)
            return
        L77:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenWidthDp
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53I.A01(java.lang.Integer, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-428999667);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        C25671My A00 = AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue());
        A00.A01(this.A05, C36060Fvw.class);
        A00.A01(this.A07, C2AS.class);
        Fragment A0O = getChildFragmentManager().A0O(R.id.user_detail_fragment);
        if (A0O instanceof UserDetailFragment) {
            this.A01 = (UserDetailFragment) A0O;
        } else {
            C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
            UserSession userSession = (UserSession) interfaceC09390do.getValue();
            C31368DqX A01 = AbstractC31402Dr6.A01((UserSession) interfaceC09390do.getValue(), ((UserSession) interfaceC09390do.getValue()).userId, "profile_with_menu", "self_profile");
            A01.A0a = true;
            Fragment A022 = c28431Ze.A02(userSession, A01.A03());
            C14360o3.A0C(A022, "null cannot be cast to non-null type com.instagram.profile.fragment.UserDetailFragment");
            UserDetailFragment userDetailFragment = (UserDetailFragment) A022;
            this.A01 = userDetailFragment;
            C14240no c14240no = new C14240no(getChildFragmentManager());
            c14240no.A0D(userDetailFragment, userDetailFragment.getClass().getCanonicalName(), R.id.user_detail_fragment);
            c14240no.A00();
        }
        new C196348mQ((UserSession) interfaceC09390do.getValue()).A00("profile_switch");
        MWN A002 = MWN.A00((UserSession) interfaceC09390do.getValue());
        A002.A04();
        A002.A0B.add(this.A06);
        if (!A002.A0C) {
            A002.A0C = true;
            O5U o5u = A002.A03;
            O5V o5v = new O5V(A002);
            C907442n c907442n = new C907442n(new C2JM(), C9J2.class, "IGFBPayExperienceEnabled", false);
            UserSession userSession2 = o5u.A00;
            C14360o3.A0B(userSession2, 0);
            C907542o c907542o = new C907542o(userSession2);
            c907542o.A08(c907442n);
            C1ON A07 = c907542o.A07(C05F.A01);
            A07.A00 = new MWS(o5u, o5v);
            C1GJ.A06(A07, 665, 3, C18U.A06(C06090Tz.A05, userSession2, 36328117586246853L), false);
        }
        C0f9.A09(-1479342998, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A02 = C0f9.A02(-596459766);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getActivity() != null && viewGroup != null) {
            inflate = C50802Vb.A00(layoutInflater, null, viewGroup, R.layout.fragment_profile_without_slideout_menu, 0, false, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.fragment_profile_without_slideout_menu, viewGroup, false);
        }
        C0f9.A09(1649180525, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1939827913);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A04;
        C25671My A00 = AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue());
        A00.A02(this.A05, C36060Fvw.class);
        A00.A02(this.A07, C2AS.class);
        MWN A002 = MWN.A00((UserSession) interfaceC09390do.getValue());
        A002.A0B.remove(this.A06);
        C0f9.A09(1620915604, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1102003465);
        super.onResume();
        A01(null, false);
        C0f9.A09(1750552015, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(513392378);
        super.onStart();
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment != null) {
            C152336tJ c152336tJ = userDetailFragment.A0m;
            if (c152336tJ != null) {
                c152336tJ.A06 = this;
            }
            C152326tI c152326tI = userDetailFragment.A0o;
            if (c152326tI != null) {
                c152326tI.A00 = this;
            }
            C70P c70p = userDetailFragment.A18;
            if (c70p != null) {
                c70p.A01 = this;
            }
            userDetailFragment.A0x.A00 = this;
        }
        A00(this);
        C0f9.A09(1593188513, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1298948175);
        super.onStop();
        A01(null, true);
        C0f9.A09(-507087507, A02);
    }
}
