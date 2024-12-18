package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.ELg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32317ELg extends AbstractC59962oe implements InterfaceC60072op, GY6, InterfaceC60122ou, InterfaceC37125GXm {
    public static final String __redex_internal_original_name = "BaseConsentFragment";
    public AbstractC18680vv A00;
    public RegFlowExtras A01;
    public boolean A02;
    public final InterfaceC41501vz A03 = C31650DvG.A00(this, 45);
    public final InterfaceC41501vz A04 = C31650DvG.A00(this, 46);

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01() {
        Context context;
        Integer num;
        Integer num2;
        String str;
        AbstractC18680vv abstractC18680vv;
        C25621Ms c25621Ms;
        EVF evf;
        EfA efA;
        if (this instanceof Ef8) {
            Ef8 ef8 = (Ef8) this;
            C35208Fg0 A00 = C35208Fg0.A00();
            AbstractC12990ll abstractC12990ll = ((AbstractC32317ELg) ef8).A00;
            Integer num3 = C05F.A0N;
            C14360o3.A0B(abstractC12990ll, 0);
            A00.A02(ef8, abstractC12990ll, num3, ef8.B9K(), null);
            EVF evf2 = ef8.A01;
            if (evf2 != null) {
                evf2.A00();
            }
            context = ef8.requireContext();
            num = C35154Few.A00().A04;
            num2 = C35154Few.A00().A02;
            str = C35154Few.A00().A07;
            abstractC18680vv = ((AbstractC32317ELg) ef8).A00;
            c25621Ms = new C25621Ms(abstractC18680vv);
            A00(c25621Ms, ef8.A00);
            evf = ef8.A01;
            efA = ef8;
        } else if (this instanceof Ef9) {
            Ef9 ef9 = (Ef9) this;
            EVF evf3 = ef9.A01;
            evf3.getClass();
            evf3.A00();
            Context context2 = ef9.getContext();
            if (C35154Few.A00().A04 == C05F.A00 && context2 == null) {
                throw AbstractC166987dD.A14("Context cannot be null if UserState is NEW_USER");
            }
            context = ef9.getContext();
            num = C35154Few.A00().A04;
            num2 = C35154Few.A00().A02;
            str = C35154Few.A00().A07;
            abstractC18680vv = ((AbstractC32317ELg) ef9).A00;
            c25621Ms = new C25621Ms(abstractC18680vv);
            A00(c25621Ms, ef9.A00);
            evf = ef9.A01;
            efA = ef9;
        } else {
            EfA efA2 = (EfA) this;
            C35208Fg0 A002 = C35208Fg0.A00();
            AbstractC18680vv abstractC18680vv2 = ((AbstractC32317ELg) efA2).A00;
            Integer num4 = C05F.A0N;
            C14360o3.A0B(abstractC18680vv2, 0);
            A002.A02(efA2, abstractC18680vv2, num4, efA2.B9K(), null);
            efA2.A04.A00();
            Context context3 = efA2.getContext();
            if (C35154Few.A00().A04 == C05F.A00 && context3 == null) {
                throw AbstractC166987dD.A14("Context cannot be null if UserState is NEW_USER");
            }
            context = efA2.getContext();
            num = C35154Few.A00().A04;
            num2 = C35154Few.A00().A02;
            str = C35154Few.A00().A07;
            abstractC18680vv = ((AbstractC32317ELg) efA2).A00;
            c25621Ms = new C25621Ms(abstractC18680vv);
            A00(c25621Ms, C35154Few.A00().A00.A02);
            evf = efA2.A04;
            efA = efA2;
        }
        EUK euk = new EUK(efA, evf);
        C1ON A003 = FVR.A00(context, c25621Ms, abstractC18680vv, num2, num, str);
        A003.A00 = euk;
        C1GJ.A03(A003);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.FOM, java.lang.Object] */
    public final void A02() {
        synchronized (C35154Few.class) {
            C35154Few.A00().A02(new Object(), C05F.A1F, "", "");
            C35154Few A00 = C35154Few.A00();
            EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0z;
            synchronized (A00) {
                C35154Few c35154Few = C35154Few.A0B;
                c35154Few.A0A = "";
                c35154Few.A09 = "";
                c35154Few.A01 = enumC31713DwI;
            }
        }
        AbstractC18680vv abstractC18680vv = this.A00;
        String str = C35154Few.A00().A06;
        boolean A1R = AbstractC167007dF.A1R(0, abstractC18680vv, str);
        if ("blocking".equals(str) || "direct_blocking".equals(str)) {
            G06 A002 = FTX.A00(abstractC18680vv);
            synchronized (A002) {
                A002.A05 = false;
            }
        }
        if (this.A02) {
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            if (abstractC10360h2 != null) {
                abstractC10360h2.A0x("GDPR.Fragment.Entrance", A1R ? 1 : 0);
                abstractC10360h2.A0Z();
                return;
            }
            return;
        }
        AbstractC25227BEk.A1B(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.1vw, java.lang.Object] */
    public final void A03() {
        String str;
        if (isResumed()) {
            C35208Fg0 A00 = C35208Fg0.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, this.A00, 0), "instagram_gdpr_consent_flow_finished");
            if (A0f.isSampled()) {
                String str2 = A00.A02;
                if (str2 != null) {
                    A0f.AAP(AbstractC31187DnW.A00(), str2);
                    Integer num = A00.A00;
                    if (num != null) {
                        A0f.AAP("user_state", FVT.A01(num));
                        if (C35154Few.A00().A04 == C05F.A00) {
                            str = AbstractC31174DnI.A0s();
                        } else {
                            str = null;
                        }
                        A0f.AAP("guid", str);
                        AbstractC31175DnJ.A14(A0f, this);
                        A0f.AAP("waterfall_id", C35154Few.A01());
                        A0f.Cht();
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            if (C35154Few.A00().A04 == C05F.A00) {
                RegFlowExtras regFlowExtras = this.A01;
                if (regFlowExtras != null) {
                    C35154Few.A00();
                    C07270a1 c07270a1 = (C07270a1) this.A00;
                    String str3 = C35154Few.A00().A0A;
                    regFlowExtras.A0C = C35154Few.A00().A07;
                    AbstractC35794FrW.A02(new Handler(), this, this, c07270a1, null, this, regFlowExtras, null, C35154Few.A00().A01, str3, C35154Few.A00().A09, false);
                    return;
                }
                C0w9.A03("GDPR consent flow", "No reg extra found");
                return;
            }
            C41451vu c41451vu = C41451vu.A01;
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC31172DnG.A1H(AbstractC166997dE.A0N(this), A0K, 2131975638);
            A0K.A04 = requireContext().getDrawable(R.drawable.circle_checked);
            A0K.A04();
            AbstractC31178DnM.A1N(c41451vu, A0K);
            c41451vu.A01(new Object());
            A02();
        }
    }

    public final boolean A04() {
        Fragment efA;
        C140966Yy A0r;
        if (isResumed()) {
            Integer num = C35154Few.A00().A04;
            Integer num2 = C05F.A00;
            if (num == num2 && C35154Few.A00().A02 == C05F.A15) {
                Context requireContext = requireContext();
                AbstractC18680vv abstractC18680vv = this.A00;
                AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
                RegFlowExtras regFlowExtras = this.A01;
                FragmentActivity activity = getActivity();
                C14360o3.A0B(abstractC18680vv, 1);
                C35154Few A00 = C35154Few.A00();
                synchronized (A00) {
                    Integer num3 = A00.A05;
                    if (num3 == num2) {
                        A00.A05 = C05F.A01;
                    } else if (num3 == C05F.A01) {
                        A00.A05 = C05F.A0C;
                    }
                }
                Integer num4 = C35154Few.A00().A05;
                C14360o3.A07(num4);
                int intValue = num4.intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        Bundle A0b = AbstractC166987dD.A0b();
                        if (regFlowExtras != null) {
                            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        }
                        C14360o3.A0A(A0b);
                        AbstractC03240Dh.A00(A0b, abstractC18680vv);
                        if (activity != null) {
                            A0r = AbstractC31177DnL.A0N(activity, abstractC18680vv);
                            AbstractC31175DnJ.A0r(A0b, abstractC18680vv);
                            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                            abstractC59962oe.setArguments(A0b);
                            A0r.A0D(abstractC59962oe);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    return true;
                }
                C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                AbstractC31172DnG.A1C(requireContext, A0I, 2131953945);
                AbstractC31173DnH.A16(requireContext, A0I, 2131953944);
                A0I.A0F(new DialogInterfaceOnClickListenerC35448Fk5(2, activity, abstractC18680vv, parentFragmentManager, this));
                A0I.A0s(false);
                AbstractC166987dD.A1W(A0I);
                C35208Fg0 A002 = C35208Fg0.A04.A00();
                Integer num5 = C05F.A1I;
                C14360o3.A0B(num5, 1);
                C35208Fg0.A01(this, abstractC18680vv, A002, num5, null);
                return true;
            }
            if (C35154Few.A00().A04 == num2 && C35154Few.A00().A02 == C05F.A0N) {
                RegFlowExtras regFlowExtras2 = this.A01;
                if (regFlowExtras2 != null) {
                    C35154Few.A00();
                    C07270a1 c07270a1 = (C07270a1) this.A00;
                    String str = C35154Few.A00().A0A;
                    regFlowExtras2.A0C = C35154Few.A00().A07;
                    AbstractC35794FrW.A02(new Handler(), this, this, c07270a1, null, null, regFlowExtras2, null, C35154Few.A00().A01, str, C35154Few.A00().A09, true);
                    return true;
                }
                C0w9.A03("GDPR consent flow", "No reg extra found");
                return true;
            }
            Integer num6 = C35154Few.A00().A02;
            Bundle bundle = this.mArguments;
            if (num6 != null) {
                int intValue2 = num6.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        if (intValue2 == 4) {
                            FVS.A01();
                            efA = new Ef9();
                        }
                    } else {
                        FVS.A01();
                        efA = new AbstractC32317ELg();
                    }
                } else {
                    FVS.A01();
                    efA = new EfA();
                }
                A0r = AbstractC25225BEi.A0r(AbstractC31173DnH.A0J(bundle, efA, this), this.A00);
                A0r.A0B(null, efA);
            }
            A0r.A04();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37125GXm
    public final Integer B9K() {
        if (this instanceof Ef8) {
            return C05F.A01;
        }
        if (this instanceof EfA) {
            return C05F.A00;
        }
        return C05F.A09;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (this instanceof Ef9) {
            interfaceC56362iU.Ehk(AbstractC166997dE.A0N(this).getString(2131972586));
            return;
        }
        if (C35154Few.A00().A04 != C05F.A00 && !"blocking".equals(C35154Few.A00().A06) && !"direct_blocking".equals(C35154Few.A00().A06)) {
            interfaceC56362iU.Efu(2131972586);
            C3LO A0I = AbstractC31176DnK.A0I();
            A0I.A0G = ViewOnClickListenerC35685FpK.A00(this, 27);
            A0I.A05 = 2131954755;
            interfaceC56362iU.Ehd(new C3LY(A0I));
            return;
        }
        interfaceC56362iU.EkF(false);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!"blocking".equals(C35154Few.A00().A06)) {
            AbstractC35175FfS.A01(requireContext(), DialogInterfaceOnClickListenerC35453FkA.A00(this, 31), new DialogInterfaceOnClickListenerC35450Fk7(17, this, this, this));
            return true;
        }
        return true;
    }

    public static void A00(AbstractC23721Ec abstractC23721Ec, FRA fra) {
        abstractC23721Ec.A9s("updates", FVR.A01(Arrays.asList(fra), Arrays.asList(EnumC33394EpR.A03)));
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        C193328hC A0P = AbstractC31180DnO.A0P(this);
        A0P.A0r(str);
        AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC35453FkA.A00(this, 32), A0P, 2131972108);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        EVD evd;
        int A02 = C0f9.A02(1108862559);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        C18C.A07(bundle2, "Fragment arguments cannot be null in GDPR flow!");
        this.A00 = AbstractC31176DnK.A0R(this);
        this.A01 = (RegFlowExtras) bundle2.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A02 = requireArguments().getBoolean("GDPR.Fragment.Entrance.Enabled");
        registerLifecycleListener(new EVO(getActivity()));
        FragmentActivity activity = getActivity();
        C31650DvG A00 = C31650DvG.A00(this, 47);
        AtomicBoolean atomicBoolean = AbstractC71193Hg.A00;
        if (activity == null) {
            evd = null;
        } else {
            evd = new EVD(new C36156FxV(7, activity.getSupportFragmentManager(), A00));
        }
        registerLifecycleListener(evd);
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(this.A03, C36047Fvj.class);
        c41451vu.A02(this.A04, C36045Fvh.class);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC31180DnO.A0f(c06090Tz).contains(__redex_internal_original_name)) {
            if (C1AD.A06(c06090Tz, 2324147236411677036L)) {
                FBE.A00().A00(requireContext(), this.A00, null);
            }
            if (C1AD.A06(c06090Tz, 2324147236411742573L)) {
                FBE.A00().A01(requireContext(), this.A00, null);
            }
        }
        C0f9.A09(-1407679633, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(700874526);
        super.onDestroy();
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A03, C36047Fvj.class);
        c41451vu.A03(this.A04, C36045Fvh.class);
        C0f9.A09(754691089, A02);
    }
}
