package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ENb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32354ENb extends AbstractC60672pq implements C38M, InterfaceC60122ou, C38O, GYM {
    public static final String __redex_internal_original_name = "AccountDiscoveryFragment";
    public EQK A00;
    public EVZ A01;
    public String A02;
    public FNJ A03;
    public C57112jm A04;
    public C34609FMs A05;
    public FNE A06;
    public GZY A07;
    public final InterfaceC41501vz A0A = C31650DvG.A00(this, 41);
    public final C31728DwZ A09 = C31728DwZ.A00(this, 9);
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0n(this);
        return c193328hC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        r3 = X.AbstractC25231BEo.A0c(requireActivity(), r9.A08);
        X.AbstractC35067Fce.A01();
        r2 = r9.A02;
        r1 = X.AbstractC31174DnI.A0E(r7, 1);
        r1.putString("AccountDiscoveryFragment.title", r7);
        r1.putString("AccountDiscoveryFragment.category", r6);
        X.AbstractC31171DnF.A13(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r4.length() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r1.putString("AccountDiscoveryFragment.forcedUserIds", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r0 = new X.ENT();
        r0.setArguments(r1);
        X.AbstractC31175DnJ.A0s(null, r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        return;
     */
    @Override // X.C38M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D4P(android.util.SparseArray r10, java.lang.Integer r11) {
        /*
            r9 = this;
            r1 = 0
            X.C14360o3.A0B(r11, r1)
            X.1nx r0 = X.C37001nx.A02
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            if (r0 == 0) goto Lce
            java.lang.Integer r0 = X.C05F.A0N
            if (r11 != r0) goto Lce
            if (r10 == 0) goto L84
            java.lang.Object r7 = r10.get(r1)
            java.lang.String r0 = X.AbstractC31171DnF.A0f(r7)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 1
            java.lang.Object r6 = r10.get(r8)
            X.C14360o3.A0C(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            X.EQK r0 = r9.A00
            r5 = 0
            if (r0 != 0) goto L35
            java.lang.String r0 = "accountDiscoveryAdapter"
        L2d:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L35:
            X.C14360o3.A0B(r6, r1)
            java.util.ArrayList r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L3e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r1 = r2.next()
            X.FPs r1 = (X.FPs) r1
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L7a
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L3e
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r0 = r1.A00()
            java.util.Iterator r1 = r0.iterator()
        L60:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r1.next()
            X.47L r0 = (X.C47L) r0
            X.47O r0 = r0.A00()
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.getId()
            r2.add(r0)
            goto L60
        L7a:
            java.lang.String r0 = "name"
            goto L2d
        L7d:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L82:
            r4 = r5
            goto L96
        L84:
            java.lang.String r0 = "The arguments param in onClickSeeAll() for Account Discovery must not be null."
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L8b:
            java.lang.String r1 = ","
            X.3Il r0 = new X.3Il
            r0.<init>(r1)
            java.lang.String r4 = r0.A02(r2)
        L96:
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            X.0do r0 = r9.A08
            X.6Yy r3 = X.AbstractC25231BEo.A0c(r1, r0)
            X.AbstractC35067Fce.A01()
            java.lang.String r2 = r9.A02
            android.os.Bundle r1 = X.AbstractC31174DnI.A0E(r7, r8)
            java.lang.String r0 = "AccountDiscoveryFragment.title"
            r1.putString(r0, r7)
            java.lang.String r0 = "AccountDiscoveryFragment.category"
            r1.putString(r0, r6)
            X.AbstractC31171DnF.A13(r1, r2)
            if (r4 == 0) goto Lc3
            int r0 = r4.length()
            if (r0 == 0) goto Lc3
            java.lang.String r0 = "AccountDiscoveryFragment.forcedUserIds"
            r1.putString(r0, r4)
        Lc3:
            X.ENT r0 = new X.ENT
            r0.<init>()
            r0.setArguments(r1)
            X.AbstractC31175DnJ.A0s(r5, r0, r3)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32354ENb.D4P(android.util.SparseArray, java.lang.Integer):void");
    }

    @Override // X.C38M
    public final void D4Q() {
    }

    @Override // X.C38M
    public final void D4R() {
    }

    @Override // X.C38M
    public final void D4S() {
    }

    @Override // X.C38M
    public final void D4T(SparseArray sparseArray) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC35666Fp0(this, 64), AbstractC31174DnI.A0K(), interfaceC56362iU);
        interfaceC56362iU.Efu(2131960982);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_discovery";
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        EVZ evz = this.A01;
        if (evz == null) {
            C14360o3.A0F("accountDiscoveryController");
            throw C00O.createAndThrow();
        }
        AbstractC31174DnI.A16(evz.A06.requireContext(), recyclerView, 1, false);
        recyclerView.A0S = true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EQK eqk = this.A00;
        if (eqk == null) {
            str = "accountDiscoveryAdapter";
        } else {
            setAdapter(eqk);
            C57112jm c57112jm = this.A04;
            if (c57112jm == null) {
                str = "viewPointManager";
            } else {
                c57112jm.A08(((C3FR) getScrollingViewProxy()).CGT(), C71163Hc.A00(this), new InterfaceC57142jp[0]);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.GYM
    public final void CK9() {
        C28301Yr A00 = AbstractC34213F7l.A00();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A08);
        GZY gzy = this.A07;
        if (gzy == null) {
            C14360o3.A0F("linkingCallback");
            throw C00O.createAndThrow();
        }
        Ef3 A01 = A00.A01(this, A0o, gzy);
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        A01.A06(AbstractC31172DnG.A16(locale, "IG_FB_DISCOVER_ACCOUNTS"), null);
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(798477590);
        super.onCreate(bundle);
        this.A02 = AbstractC31180DnO.A0b(this);
        InterfaceC09390do interfaceC09390do = this.A08;
        C32903Edk c32903Edk = new C32903Edk(AbstractC166987dD.A0r(interfaceC09390do), this);
        AbstractC34217F7p.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00();
        this.A07 = new C36780GJd(0);
        this.A04 = AbstractC31180DnO.A0N();
        FQ3 fq3 = new FQ3(this, AbstractC166987dD.A0r(interfaceC09390do), this.A02);
        C57112jm c57112jm = this.A04;
        String str = "viewPointManager";
        if (c57112jm != null) {
            this.A05 = new C34609FMs(c57112jm, fq3);
            this.A06 = new FNE(c57112jm, fq3);
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C57112jm c57112jm2 = this.A04;
            if (c57112jm2 != null) {
                this.A03 = new FNJ(this, A0r, c57112jm2);
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                Context requireContext = requireContext();
                FragmentActivity requireActivity = requireActivity();
                C34609FMs c34609FMs = this.A05;
                if (c34609FMs == null) {
                    str = "recommendedUserCardsViewpointHelper";
                } else {
                    FNE fne = this.A06;
                    if (fne == null) {
                        str = "seeAllViewpointHelper";
                    } else {
                        FNJ fnj = this.A03;
                        if (fnj == null) {
                            str = "nametagEntrypointViewpointUtil";
                        } else {
                            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                            EnumC72412Xd8 enumC72412Xd8 = EnumC72412Xd8.A0C;
                            GZY gzy = this.A07;
                            if (gzy == null) {
                                str = "linkingCallback";
                            } else {
                                this.A00 = new EQK(requireActivity, requireContext, fnj, this, A0r2, c34609FMs, this, c32903Edk, new C33282End(A0r3, this, enumC72412Xd8, gzy), this, fne);
                                this.A01 = new EVZ(this, AbstractC166987dD.A0r(interfaceC09390do), new G7C(this));
                                AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A09, C151746sK.class);
                                C0f9.A09(-1911706464, A02);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1476840447);
        C14360o3.A0B(layoutInflater, 0);
        EVZ evz = this.A01;
        if (evz == null) {
            C14360o3.A0F("accountDiscoveryController");
            throw C00O.createAndThrow();
        }
        View A01 = evz.A01(layoutInflater, viewGroup);
        AbstractC31176DnK.A0Q(this.A08).A01(this.A0A, C36073Fw9.class);
        C0f9.A09(1540229651, A02);
        return A01;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(863202452);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A08).A02(this.A09, C151746sK.class);
        C0f9.A09(-926187252, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1854385690);
        super.onDestroyView();
        AbstractC31176DnK.A0Q(this.A08).A02(this.A0A, C36073Fw9.class);
        C0f9.A09(728033466, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-791023184);
        super.onResume();
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A08;
        if (C54P.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do))) {
            C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
            InterfaceC19630xq interfaceC19630xq = A0l.A01;
            String A00 = AbstractC111324zv.A00(489);
            int i = interfaceC19630xq.getInt(A00, 0);
            long millis = TimeUnit.HOURS.toMillis(24L);
            if (i < 6) {
                long currentTimeMillis = System.currentTimeMillis();
                String A002 = AbstractC111324zv.A00(464);
                if (currentTimeMillis - AbstractC31175DnJ.A03(interfaceC19630xq, A002) >= millis) {
                    A0l.A1R(true);
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7G(A002, currentTimeMillis);
                    ARD.apply();
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    ARD2.E7G("last_time_seen_contact_import_weekly_upsell", currentTimeMillis);
                    ARD2.apply();
                    AbstractC167007dF.A18(interfaceC19630xq, A00, i + 1);
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    Fragment fragment = this.mParentFragment;
                    if (fragment == null) {
                        fragment = this;
                    }
                    C35233FgQ c35233FgQ = new C35233FgQ(fragment, this, A0r, null, null);
                    EnumC33444EqG enumC33444EqG = EnumC33444EqG.A05;
                    c35233FgQ.A05(null, enumC33444EqG, false, true, false);
                    new C147036jf(this, AbstractC166987dD.A0r(interfaceC09390do)).A01(false, null, enumC33444EqG.toString());
                }
            }
        }
        C0f9.A09(-2091477268, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        int A02 = C0f9.A02(-321734374);
        super.onStop();
        C34609FMs c34609FMs = this.A05;
        if (c34609FMs == null) {
            str = "recommendedUserCardsViewpointHelper";
        } else {
            c34609FMs.A04.clear();
            FNE fne = this.A06;
            if (fne == null) {
                str = "seeAllViewpointHelper";
            } else {
                fne.A04.clear();
                FNJ fnj = this.A03;
                if (fnj == null) {
                    str = "nametagEntrypointViewpointUtil";
                } else {
                    fnj.A05.clear();
                    C0f9.A09(-746591627, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
