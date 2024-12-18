package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public abstract class N6G extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ProductSettingsFragmentBase";
    public C56473P5n A00;
    public C51043Mgu A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0C = C57526Pg0.A00(this, 28);
    public final InterfaceC09390do A05 = C57526Pg0.A00(this, 20);
    public final InterfaceC09390do A0B = C57526Pg0.A00(this, 24);
    public boolean A02 = true;
    public final InterfaceC09390do A04 = C57526Pg0.A00(this, 19);
    public final InterfaceC09390do A0A = C57526Pg0.A00(this, 23);

    public static final void A03(N6G n6g) {
        n6g.A02 = false;
        C56136Ovw c56136Ovw = (C56136Ovw) n6g.A03.getValue();
        String A01 = AbstractC35078Fcp.A01(n6g.A05());
        String A02 = AbstractC35078Fcp.A02(n6g.A05());
        String moduleName = n6g.getModuleName();
        C51043Mgu c51043Mgu = n6g.A01;
        if (c51043Mgu != null) {
            String A05 = c51043Mgu.A05();
            C51043Mgu c51043Mgu2 = n6g.A01;
            if (c51043Mgu2 != null) {
                String A012 = C51043Mgu.A01(c51043Mgu2);
                C14360o3.A0B(moduleName, 3);
                InterfaceC02590Ai A052 = AbstractC50524MSc.A05(c56136Ovw.A00, "ig_creator_monetization_product_settings_flow", A01, A02, moduleName);
                AbstractC31171DnF.A1C(A052, "impression");
                EnumC33479ErE enumC33479ErE = null;
                if (A05 != null) {
                    try {
                        enumC33479ErE = EnumC33479ErE.valueOf(A05);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                A052.A8R(enumC33479ErE, "origin");
                A052.AAP("client_extra", A012);
                A052.Cht();
                View view = n6g.mView;
                if (view != null) {
                    n6g.A01(view);
                }
                n6g.A0B();
                n6g.A0E(false);
                return;
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    public String A08() {
        return null;
    }

    public void A0D(String str) {
    }

    public boolean A0F() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 8888) {
            if (intent != null && intent.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
                String moduleName = getModuleName();
                C56136Ovw c56136Ovw = (C56136Ovw) this.A03.getValue();
                String A01 = AbstractC35078Fcp.A01(A05());
                String A02 = AbstractC35078Fcp.A02(A05());
                C51043Mgu c51043Mgu = this.A01;
                if (c51043Mgu == null) {
                    str = "productOnboardingViewModel";
                } else {
                    c56136Ovw.A01(A01, A02, "finished", "payouts_onboarding", moduleName, c51043Mgu.A05(), null);
                    AbstractC53500NlR A07 = A07();
                    if (A07 instanceof NQ5) {
                        A04(this, (NQ5) A07);
                        return;
                    }
                    C51043Mgu c51043Mgu2 = this.A01;
                    str = "productOnboardingViewModel";
                    if (c51043Mgu2 != null) {
                        FragmentActivity requireActivity = requireActivity();
                        UserSession A0r = AbstractC166987dD.A0r(this.A0C);
                        C51043Mgu c51043Mgu3 = this.A01;
                        if (c51043Mgu3 != null) {
                            C14360o3.A07(getString(c51043Mgu3.A03()));
                            c51043Mgu2.A07(this, requireActivity, A0r, getModuleName(), __redex_internal_original_name);
                            OY3.A01(requireContext());
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            onBackPressed();
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC37304Gc5.A10(AbstractC43592JPx.A0B(view, R.id.product_settings_recycle_view), this.A0B);
        C51043Mgu c51043Mgu = this.A01;
        if (c51043Mgu == null) {
            C14360o3.A0F("productOnboardingViewModel");
            throw C00O.createAndThrow();
        }
        PZM.A01(this, c51043Mgu, AbstractC25235BEs.A0S(this), 35);
        InterfaceC09390do interfaceC09390do = this.A0C;
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01((InterfaceC41501vz) this.A08.getValue(), C56012Otj.class);
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01((InterfaceC41501vz) this.A09.getValue(), C56013Otk.class);
        A0A();
        if (!this.A02) {
            A01(view);
        }
    }

    private final void A01(View view) {
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(this.A0C), 36317655044462027L)) {
            AbstractC37304Gc5.A10(AbstractC31172DnG.A0G(view, R.id.notification_banner), this.A06);
            InterfaceC09390do interfaceC09390do = this.A07;
            UFY ufy = (UFY) interfaceC09390do.getValue();
            String A08 = A08();
            if (A08 == null) {
                A08 = AbstractC58442PvL.A02();
            }
            ufy.A03(AbstractC61636Rr0.A00(AbstractC167007dF.A1b("payout_subtypes_to_filter", AbstractC166987dD.A1F(AbstractC166987dD.A1J(OY3.A00(A05(), false).A00)), AbstractC166987dD.A1L(AbstractC111324zv.A00(1083), new LoggingData(A08)), AbstractC166987dD.A1L("parent_view_name", "ig_product_settings_subpage"))));
            this.mLifecycleRegistry.A09((UFY) interfaceC09390do.getValue());
            AbstractC31174DnI.A1E(this, ((UFY) interfaceC09390do.getValue()).A06, C57745PjY.A00(this, 29), 57);
            AbstractC31174DnI.A1E(this, ((UFY) interfaceC09390do.getValue()).A08, C57745PjY.A00(this, 30), 57);
            ((UFY) interfaceC09390do.getValue()).A04(new C2GT(null));
        }
    }

    public static final void A02(N6G n6g) {
        C56136Ovw c56136Ovw = (C56136Ovw) n6g.A03.getValue();
        String A01 = AbstractC35078Fcp.A01(n6g.A05());
        String A02 = AbstractC35078Fcp.A02(n6g.A05());
        String moduleName = n6g.getModuleName();
        C51043Mgu c51043Mgu = n6g.A01;
        if (c51043Mgu != null) {
            String A05 = c51043Mgu.A05();
            C51043Mgu c51043Mgu2 = n6g.A01;
            if (c51043Mgu2 != null) {
                c56136Ovw.A01(A01, A02, "start", "onboarding_flow", moduleName, A05, C51043Mgu.A01(c51043Mgu2));
                return;
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    public UserMonetizationProductType A05() {
        if (this instanceof NQ4) {
            return MSY.A0T((NQ4) this).A01;
        }
        return UserMonetizationProductType.A0E;
    }

    public final UserSession A06() {
        return AbstractC166987dD.A0r(this.A0C);
    }

    public AbstractC53500NlR A07() {
        if (this instanceof NQ3) {
            return new NQ5("com.instagram.incentive_platform.screens.onboarding.onboarding_navigation_handler");
        }
        return NQ6.A00;
    }

    public final String A09() {
        return AbstractC25225BEi.A15(this.A05);
    }

    public void A0A() {
        if (!(this instanceof NQ4)) {
            NQ3 nq3 = (NQ3) this;
            C51007MgE c51007MgE = (C51007MgE) nq3.A00.getValue();
            AbstractC31174DnI.A1E(nq3.getViewLifecycleOwner(), c51007MgE.A01, new C57561PgZ(nq3, 45), 35);
            AbstractC166987dD.A1Z(new MCG(c51007MgE, nq3, (InterfaceC23621Ds) null, 44), AbstractC25235BEs.A0S(nq3));
        }
    }

    public void A0B() {
        Object value;
        String str;
        String str2;
        boolean z;
        if (this instanceof NQ4) {
            C50977Mfk A0T = MSY.A0T((NQ4) this);
            C05A c05a = A0T.A08;
            do {
                value = c05a.getValue();
                C51722Msz c51722Msz = (C51722Msz) value;
                str = c51722Msz.A01;
                str2 = c51722Msz.A02;
                z = c51722Msz.A03;
                AbstractC167017dG.A1N(str, str2);
            } while (!c05a.AIi(value, new C51722Msz(str, str2, true, z)));
            A0T.A04.A01(A0T.A01, new C57748Pjb(A0T, 6));
            return;
        }
        InterfaceC09390do interfaceC09390do = ((NQ3) this).A00;
        C51007MgE c51007MgE = (C51007MgE) interfaceC09390do.getValue();
        C141796aw A00 = AbstractC141776au.A00(c51007MgE);
        PYZ pyz = new PYZ(c51007MgE, null, 20);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pyz, A00);
        OY3.A02(EnumC53330NiA.A03, c51007MgE.A03, new C30715DfD(c51007MgE, 44));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
        AbstractC23641Du.A05(anonymousClass191, new PYZ(A0Z, null, 19), AbstractC141776au.A00(A0Z));
    }

    public final void A0C() {
        C51043Mgu c51043Mgu = this.A01;
        if (c51043Mgu != null) {
            Activity A04 = AbstractC31172DnG.A04(this);
            C51043Mgu c51043Mgu2 = this.A01;
            if (c51043Mgu2 != null) {
                String A0p = AbstractC166997dE.A0p(A04, c51043Mgu2.A03());
                AbstractC53500NlR A07 = A07();
                C57745PjY A00 = C57745PjY.A00(this, 28);
                AbstractC166987dD.A1Z(new MVR(A07, c51043Mgu, A00, A0p, (InterfaceC23621Ds) null, 15), AbstractC141776au.A00(c51043Mgu));
                return;
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r1.A04 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0E(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.NQ4
            if (r0 == 0) goto L31
            r0 = r7
            X.NQ4 r0 = (X.NQ4) r0
            X.Mfk r0 = X.MSY.A0T(r0)
            X.05A r6 = r0.A08
        Ld:
            java.lang.Object r5 = r6.getValue()
            r1 = r5
            X.Msz r1 = (X.C51722Msz) r1
            if (r8 != 0) goto L1b
            boolean r0 = r1.A04
            r4 = 0
            if (r0 == 0) goto L1c
        L1b:
            r4 = 1
        L1c:
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r1.A02
            boolean r1 = r1.A03
            X.AbstractC167017dG.A1N(r3, r2)
            X.Msz r0 = new X.Msz
            r0.<init>(r3, r2, r4, r1)
            boolean r0 = r6.AIi(r5, r0)
            if (r0 == 0) goto Ld
            return
        L31:
            r0 = r7
            X.NQ3 r0 = (X.NQ3) r0
            X.0do r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.MgE r0 = (X.C51007MgE) r0
            X.05A r0 = r0.A09
            X.AbstractC166997dE.A1Y(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6G.A0E(boolean):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0C);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C51043Mgu c51043Mgu = this.A01;
        if (c51043Mgu == null) {
            C14360o3.A0F("productOnboardingViewModel");
            throw C00O.createAndThrow();
        }
        F9C.A00(this, c51043Mgu);
        return true;
    }

    public N6G() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57526Pg0(new C57526Pg0(this, 25), 26));
        C0YZ A1D = AbstractC25225BEi.A1D(UFY.class);
        this.A07 = AbstractC25225BEi.A0a(new C57526Pg0(A00, 27), C57531Pg5.A00(A00, this, 5), C57531Pg5.A00(null, A00, 4), A1D);
        this.A06 = C1XM.A00(C71777X4e.A00);
        this.A03 = C57526Pg0.A00(this, 18);
        this.A08 = AbstractC09440dt.A01(new C57526Pg0(this, 21));
        this.A09 = AbstractC09440dt.A01(new C57526Pg0(this, 22));
    }

    public static final void A04(N6G n6g, NQ5 nq5) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C51043Mgu c51043Mgu = n6g.A01;
        if (c51043Mgu != null) {
            A1I.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c51043Mgu.A05());
            C51043Mgu c51043Mgu2 = n6g.A01;
            if (c51043Mgu2 != null) {
                C51571MqP c51571MqP = (C51571MqP) c51043Mgu2.A02.A02();
                if (c51571MqP == null || (str = c51571MqP.A04) == null) {
                    str = "";
                }
                A1I.put("program_type", str);
                String A08 = n6g.A08();
                if (A08 != null) {
                    A1I.put(AbstractC31189DnY.A03(21, 10, 42), A08);
                }
                AbstractC192798gL A05 = C192108fB.A05(AbstractC166987dD.A0r(n6g.A0C), nq5.A00, A1I);
                A05.A00(new C32392EOt(n6g, 5));
                C1GJ.A03(A05);
                return;
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.MqP, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        OTV otv;
        int A02 = C0f9.A02(-92013027);
        super.onCreate(bundle);
        ((C51157Mj0) this.A0B.getValue()).A00 = this;
        C51043Mgu c51043Mgu = (C51043Mgu) MSW.A0F(new C52332NDw(AbstractC166987dD.A0r(this.A0C)), requireActivity()).A00(C51043Mgu.class);
        this.A01 = c51043Mgu;
        if (c51043Mgu == null) {
            C14360o3.A0F("productOnboardingViewModel");
            throw C00O.createAndThrow();
        }
        UserMonetizationProductType A05 = A05();
        String A15 = AbstractC25225BEi.A15(this.A05);
        String A152 = AbstractC25225BEi.A15(this.A04);
        String A153 = AbstractC25225BEi.A15(this.A0A);
        AbstractC167007dF.A1K(A05, A15);
        c51043Mgu.A00 = A05;
        C54068NvS c54068NvS = OTV.A02;
        UserSession userSession = c51043Mgu.A04;
        synchronized (c54068NvS) {
            C14360o3.A0B(userSession, 0);
            otv = new OTV(userSession);
        }
        c51043Mgu.A01 = otv;
        C2GS c2gs = c51043Mgu.A02;
        ?? obj = new Object();
        obj.A00 = A05;
        obj.A02 = A15;
        obj.A01 = A152;
        obj.A04 = A153;
        obj.A05 = false;
        obj.A03 = null;
        c2gs.A0B(obj);
        if (A0F()) {
            A0C();
        }
        C0f9.A09(663603077, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1808352647);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        C0f9.A09(-207034075, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-914213433);
        InterfaceC09390do interfaceC09390do = this.A0C;
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02((InterfaceC41501vz) this.A08.getValue(), C56012Otj.class);
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02((InterfaceC41501vz) this.A09.getValue(), C56013Otk.class);
        super.onDestroy();
        C0f9.A09(-1538694829, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1532296315);
        super.onResume();
        if (!A0F()) {
            this.A02 = false;
            A0E(false);
        }
        if (!this.A02) {
            A0B();
        }
        C0f9.A09(-928431541, A02);
    }
}
