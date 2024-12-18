package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.newsfeed.model.PillsFilterCategory;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes9.dex */
public final class MUI extends AbstractC59962oe implements InterfaceC60092or, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "NewsfeedYouComposeFragment";
    public Runnable A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC74953Yl A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC16620sF A0M;
    public final InterfaceC16610sE A0N;
    public final InterfaceC16600sD A0O;
    public final InterfaceC16600sD A0P;
    public final InterfaceC16600sD A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0A = AbstractC25229BEm.A0p(this, 43);
    public final InterfaceC09390do A0E = C1XM.A00(new C57518Pfs(this, 2));

    @Override // X.InterfaceC60092or
    public final void EMT() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity;
        AbstractC10360h2 supportFragmentManager;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        MSY.A1Q(this.A0E);
        C50580MUo A00 = AbstractC50574MUf.A00(getSession());
        InterfaceC09390do interfaceC09390do = this.A0H;
        String A01 = MUT.A01(interfaceC09390do);
        String A002 = MUT.A00(interfaceC09390do);
        AbstractC167017dG.A1N(A01, A002);
        A00.A02.set(A01);
        A00.A03.set(A002);
        AbstractC50522MSa.A1O(AbstractC12220kQ.A01(A00.A00, A00.A01), "notification_feed_session_start", A01, A002);
        if (this.A0J.getValue() == null && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.A0u(new C55552Olm(this, 2), getViewLifecycleOwner(), "KEY_FRAGMENT_RESULT_REFRESH_AFTER_OPT_IN");
        }
    }

    public static final Object A00(C114205Dh c114205Dh, Reel reel, MUI mui, List list, InterfaceC23621Ds interfaceC23621Ds) {
        OI5 oi5 = (OI5) mui.A0I.getValue();
        C3G2 c3g2 = C3G2.A03;
        C57240PbO c57240PbO = new C57240PbO(mui, 39);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        UserSession userSession = oi5.A01;
        AbstractC59962oe abstractC59962oe = oi5.A00;
        C38E c38e = new C38E(abstractC59962oe, userSession, new C38C(abstractC59962oe));
        c38e.A0C = AbstractC166997dE.A0n();
        c38e.A06 = new C56538P8k(oi5, c24891Jo);
        c38e.A05 = new C31559Dtj(abstractC59962oe.requireActivity(), new C56531P8d(c57240PbO, 1), new C56534P8g(c114205Dh), C05F.A00);
        c38e.A06(reel, c3g2, null, list, list, list);
        Object A0E = c24891Jo.A0E();
        C1JX c1jx = C1JX.A02;
        if (A0E != c1jx) {
            A0E = C0eB.A00;
        }
        if (A0E != c1jx) {
            return C0eB.A00;
        }
        return A0E;
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A0R.getValue();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return ((C19270xB) this.A05.getValue()).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r5.A00 = new X.RunnableC57039PSe(r5, r2, r1);
        r3 = X.C1VN.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r2 = getRootActivity();
        r1 = A02();
        r0 = "582322155560177";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001e, code lost:
    
        if (r8 != null) goto L12;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabController"
            r2 = -1
            r0 = 11
            if (r6 == r0) goto L88
            r0 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r6 != r0) goto L59
            if (r7 != r2) goto L4a
            if (r8 == 0) goto L1c
            r0 = 330(0x14a, float:4.62E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.util.ArrayList r2 = r8.getParcelableArrayListExtra(r0)
            if (r2 != 0) goto L20
        L1c:
            X.0sl r2 = X.C16930sl.A00
            if (r8 == 0) goto L2c
        L20:
            r0 = 678(0x2a6, float:9.5E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.util.ArrayList r1 = r8.getParcelableArrayListExtra(r0)
            if (r1 != 0) goto L2e
        L2c:
            X.0sl r1 = X.C16930sl.A00
        L2e:
            X.PSe r0 = new X.PSe
            r0.<init>(r5, r2, r1)
            r5.A00 = r0
            X.1VN r3 = X.C1VN.A00
            if (r3 == 0) goto L46
            android.app.Activity r2 = r5.getRootActivity()
            com.instagram.common.session.UserSession r1 = r5.getSession()
            java.lang.String r0 = "582322155560177"
        L43:
            r3.A02(r1, r2, r0)
        L46:
            super.onActivityResult(r6, r7, r8)
            return
        L4a:
            X.1VN r3 = X.C1VN.A00
            if (r3 == 0) goto L46
            android.app.Activity r2 = X.AbstractC31172DnG.A04(r5)
            com.instagram.common.session.UserSession r1 = r5.getSession()
            java.lang.String r0 = "494058741106429"
            goto L43
        L59:
            r0 = 14
            if (r6 == r0) goto L88
            r0 = 18
            if (r6 != r0) goto L46
            if (r7 != r2) goto L46
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
            if (r8 == 0) goto L6f
            java.lang.String r0 = "selected_product"
            android.os.Parcelable r1 = r8.getParcelableExtra(r0)
        L6f:
            java.lang.String r0 = "ReelCreatorFanEngagementShareConstants.ARGUMENTS_KEY_PRODUCT"
            r4.putParcelable(r0, r1)
            com.instagram.common.session.UserSession r3 = r5.getSession()
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            android.app.Activity r1 = X.AbstractC31172DnG.A04(r5)
            java.lang.String r0 = "reel_creator_fan_engagement_share"
            X.6XJ r0 = X.C6XJ.A02(r1, r4, r3, r2, r0)
            X.AbstractC31173DnH.A1I(r5, r0)
            goto L46
        L88:
            if (r2 != r7) goto L46
            android.app.Activity r1 = r5.getRootActivity()
            X.C14360o3.A0C(r1, r3)
            X.2dI r1 = (X.InterfaceC53792dI) r1
            X.1QO r0 = X.C1QO.A0E
            java.lang.String r0 = r0.toString()
            r1.ESi(r0)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public MUI() {
        C57518Pfs c57518Pfs = new C57518Pfs(this, 11);
        C57518Pfs c57518Pfs2 = new C57518Pfs(this, 6);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57518Pfs(c57518Pfs2, 7));
        this.A0L = AbstractC25225BEi.A0a(new C57518Pfs(A00, 8), c57518Pfs, C57531Pg5.A00(null, A00, 44), AbstractC25225BEi.A1D(Object.class));
        this.A0F = C1XM.A00(new C57518Pfs(this, 3));
        this.A06 = AbstractC25229BEm.A0p(this, 37);
        this.A08 = AbstractC25229BEm.A0p(this, 40);
        this.A0B = AbstractC25229BEm.A0p(this, 44);
        this.A0G = C1XM.A00(new C57518Pfs(this, 4));
        this.A0C = AbstractC25229BEm.A0p(this, 45);
        this.A09 = AbstractC25229BEm.A0p(this, 41);
        this.A07 = AbstractC25229BEm.A0p(this, 38);
        this.A0I = C1XM.A00(new C57518Pfs(this, 9));
        this.A0R = AbstractC60492pY.A02(this);
        this.A0H = C1XM.A00(new C57518Pfs(this, 5));
        this.A0K = C1XM.A00(new C57518Pfs(this, 10));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new C25322BIr(this));
        this.A0J = AbstractC09440dt.A00(enumC09460dv, new C25343BJm(this));
        this.A05 = AbstractC09440dt.A01(new C57240PbO(this, 36));
        this.A03 = AbstractC25230BEn.A0U(null);
        this.A04 = AbstractC25229BEm.A0R(null);
        this.A0O = new C30750Dfn(this, 19);
        this.A0N = new C30715DfD(this, 48);
        this.A0P = new C30750Dfn(this, 20);
        this.A0Q = new C30750Dfn(this, 21);
        this.A0M = new C30496Dbf(this, 39);
    }

    public static final void A01(MUI mui) {
        if (MUH.A01(mui).A01().isEmpty() && !mui.A01) {
            ActivityFeedViewModel A0S = MSX.A0S(mui);
            C25621Ms A0c = AbstractC167017dG.A0c(A0S.A08.A03.A00);
            A0c.A0B("news/inbox_seen/");
            C1GJ.A06(AbstractC25227BEk.A0e(A0c, C40781ul.class, C55702hA.class), 354374109, 3, true, true);
            UserSession userSession = A0S.A04;
            if (AbstractC166987dD.A0x(userSession).getInt("num_unseen_activities", 0) > 0 && !C18U.A06(C06090Tz.A05, userSession, 36310662838157539L)) {
                AbstractC23021Ah.A01(userSession, 0);
                C1Z6.A00(userSession).A01();
            }
            mui.A01 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1vN] */
    public final void A03() {
        if (isAdded() && getContext() != null) {
            ActivityFeedViewModel A0S = MSX.A0S(this);
            A0S.A0B.A02(EnumC54222eY.A09);
            A0S.A06.A00 = false;
            AbstractC25651Mw.A00(getSession()).E4s(new Object());
            return;
        }
        C0w9.A01.EHD(__redex_internal_original_name, C05F.A00, "onVisible called on orphan fragment");
    }

    public final void A04(boolean z) {
        String A00;
        AbstractC129825tm c129815tl;
        if (isResumed()) {
            PillsFilterCategory pillsFilterCategory = (PillsFilterCategory) this.A0D.getValue();
            if (pillsFilterCategory == null || (A00 = pillsFilterCategory.A01) == null) {
                A00 = MUH.A01(this).A00();
            }
            String A15 = AbstractC25225BEi.A15(this.A0J);
            if (A15 != null) {
                c129815tl = new NQW(A15);
            } else {
                c129815tl = new C129815tl(A00);
            }
            ((InterfaceC74953Yl) this.A0K.getValue()).Egh(MSX.A0S(this).A0E(c129815tl, true, !z));
            this.A01 = false;
            MSY.A1Q(this.A0E);
            return;
        }
        this.A02 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(89590670);
        super.onCreate(bundle);
        ((JQS) this.A08.getValue()).A0Q(requireContext(), C55772hI.A00(getSession()), this);
        C0f9.A09(190784462, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1872708704);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30496Dbf(this, 38), -1162503524);
        C0f9.A09(530520569, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(474966640);
        AbstractC50574MUf.A00(getSession()).A00();
        super.onDestroy();
        C0f9.A09(885706580, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, X.1vN] */
    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-274212580);
        ActivityFeedViewModel A0S = MSX.A0S(this);
        C50579MUm c50579MUm = A0S.A05;
        Object value = A0S.A0E.getValue();
        C14360o3.A0B(value, 0);
        c50579MUm.A01.set(System.currentTimeMillis());
        c50579MUm.A02.set(value);
        InterfaceC09390do interfaceC09390do = this.A0H;
        MUT mut = (MUT) interfaceC09390do.getValue();
        mut.A01.set(System.currentTimeMillis());
        C50580MUo A00 = AbstractC50574MUf.A00(getSession());
        String A01 = MUT.A01(interfaceC09390do);
        String A002 = MUT.A00(interfaceC09390do);
        AbstractC167007dF.A1K(A01, A002);
        A00.A02.set(A01);
        A00.A03.set(A002);
        AbstractC50522MSa.A1O(AbstractC12220kQ.A01(A00.A00, A00.A01), "notification_feed_disappear", A01, A002);
        ((C31253Dob) this.A0F.getValue()).A02.clear();
        ((AbstractC60592pi) this.A09.getValue()).onPause();
        AbstractC25651Mw.A00(getSession()).E4s(new Object());
        MUH.A01(this).A00 = System.currentTimeMillis();
        super.onPause();
        C0f9.A09(558793427, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C3G2 c3g2;
        int A02 = C0f9.A02(-1200579805);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A0H;
        MUT mut = (MUT) interfaceC09390do.getValue();
        long currentTimeMillis = System.currentTimeMillis();
        mut.A03.set(AbstractC166997dE.A0n());
        if (currentTimeMillis - mut.A01.get() > mut.A00) {
            mut.A02.set(AbstractC166997dE.A0n());
            C50580MUo A00 = AbstractC50574MUf.A00(getSession());
            String A01 = MUT.A01(interfaceC09390do);
            String A002 = MUT.A00(interfaceC09390do);
            AbstractC167017dG.A1N(A01, A002);
            A00.A02.set(A01);
            A00.A03.set(A002);
            AbstractC50522MSa.A1O(AbstractC12220kQ.A01(A00.A00, A00.A01), "notification_feed_session_start", A01, A002);
        }
        C50580MUo A003 = AbstractC50574MUf.A00(getSession());
        String A012 = MUT.A01(interfaceC09390do);
        String A004 = MUT.A00(interfaceC09390do);
        boolean A1R = AbstractC167007dF.A1R(0, A012, A004);
        A003.A02.set(A012);
        A003.A03.set(A004);
        AbstractC50522MSa.A1O(AbstractC12220kQ.A01(A003.A00, A003.A01), "notification_feed_appear", A012, A004);
        if (this.A02) {
            A04(false);
            this.A02 = false;
        } else {
            MUR A013 = MUH.A01(this);
            Map map = A013.A02;
            Collection values = map.values();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                AnonymousClass016.A16(AbstractC001800i.A0a((Iterable) it.next()), A1E);
            }
            if (A1E.size() != 0) {
                if (AbstractC166987dD.A0L(System.currentTimeMillis() - A013.A00) > 300 && A013.A04) {
                    map.clear();
                    A013.A04 = false;
                    C50581MUp c50581MUp = A013.A05;
                    List A03 = A013.A03();
                    List A014 = A013.A01();
                    List A022 = A013.A02();
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c50581MUp.A00, c50581MUp.A01), "instagram_af_filter_events_v2");
                    A0f.AAP("event_name", "filters_cleared_timer");
                    if (A014 == null) {
                        A014 = C16930sl.A00;
                    }
                    A0f.AAk("current_filters", A014);
                    if (A03 == null) {
                        A03 = C16930sl.A00;
                    }
                    A0f.AAk("clicked_filters", A03);
                    if (A022 == null) {
                        A022 = C16930sl.A00;
                    }
                    A0f.AAk("filters", A022);
                    A0f.Cht();
                    A04(A1R);
                } else {
                    A013.A04 = false;
                }
            }
        }
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
        C3M4 A05 = C1OU.A05(AbstractC31172DnG.A04(this));
        if (A05 != null && A05.A0a() && ((c3g2 = A05.A0G) == C3G2.A03 || c3g2 == C3G2.A05)) {
            A05.A0X(null, ((C31250DoY) this.A0B.getValue()).A00, this, null);
        }
        A03();
        C0f9.A09(1910262444, A02);
    }
}
