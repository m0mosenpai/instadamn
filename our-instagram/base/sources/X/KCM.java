package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class KCM extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EncryptedBackupsBaseFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    public static void A05(Fragment fragment, C35228FgL c35228FgL, int i) {
        c35228FgL.A04(null, fragment.getString(i), R.drawable.instagram_app_imessage_pano_outline_24);
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!LLQ.A08(this)) {
            interfaceC56362iU.ETp(true);
            interfaceC56362iU.EkS(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EVa, X.KFH] */
    public static KFH A01(C07X c07x, int i) {
        return new C32550EVa(c07x, new MHT(c07x, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EVa, X.KFH] */
    public static KFH A02(C07X c07x, int i) {
        return new C32550EVa(c07x, new MHP(c07x, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EVa, X.KFH] */
    public static KFH A03(C07X c07x, int i) {
        return new C32550EVa(c07x, new MHK(c07x, i));
    }

    public static void A06(C64P c64p, Object obj, int i) {
        c64p.setSecondaryActionOnClickListener(new ViewOnClickListenerC48071LPw(obj, i));
    }

    public static void A07(C64P c64p, Object obj, int i) {
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC48071LPw(obj, i));
    }

    public static C0YR[] A0A(Class cls) {
        return new C0YR[]{new AnonymousClass019(cls, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)};
    }

    public final UserSession A0C() {
        return AbstractC166987dD.A0r(this.A00);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        KPI kpi;
        String str2;
        AbstractC2056898s abstractC2056898s;
        String str3;
        InterfaceC09390do interfaceC09390do;
        KP1 kp1;
        String str4;
        if (this instanceof C45817KPw) {
            C45817KPw c45817KPw = (C45817KPw) this;
            LLQ.A02(c45817KPw);
            C44464JlW c44464JlW = (C44464JlW) c45817KPw.A08.getValue();
            LLQ.A02(c45817KPw);
            C05A c05a = c44464JlW.A0M;
            int ordinal = ((EnumC46139Kbd) c05a.getValue()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str4 = "CONFIRM_PIN_NAVIGATE_BACK";
                } else {
                    throw B4Z.A00();
                }
            } else {
                str4 = "CREATE_PIN_NAVIGATE_BACK";
            }
            c44464JlW.A08.A05(str4);
            int ordinal2 = ((EnumC46139Kbd) c05a.getValue()).ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    c05a.Egh(EnumC46139Kbd.A03);
                    c44464JlW.A0K.Egh("");
                    return true;
                }
                throw B4Z.A00();
            }
            return false;
        }
        if (this instanceof C45807KPm) {
            abstractC2056898s = ((C44469Jlb) ((C45807KPm) this).A01.getValue()).A00;
            str3 = "SOFT_BLOCK_PIN_LEADING_SCREEN_NAVIGATE_BACK";
        } else {
            if (this instanceof C45815KPu) {
                ((C44460JlS) ((C45815KPu) this).A0E.getValue()).A00 = true;
                return false;
            }
            if (this instanceof C45800KPf) {
                abstractC2056898s = ((C44468Jla) ((C45800KPf) this).A00.getValue()).A00;
                str3 = "SOFT_BLOCK_PIN_LEADING_SCREEN_NAVIGATE_BACK";
            } else {
                if (this instanceof C45810KPp) {
                    C45810KPp c45810KPp = (C45810KPp) this;
                    kpi = ((C44501Jm7) c45810KPp.A03.getValue()).A03;
                    kpi.A07("END_REASON", "HARD_BLOCK_CLOSED");
                    str2 = "HARD_BLOCK_PIN_LEADING_SCREEN_CLOSED";
                    kp1 = c45810KPp;
                } else if (this instanceof C45814KPt) {
                    abstractC2056898s = ((C44457JlP) ((C45814KPt) this).A07.getValue()).A07;
                    str3 = "OTC_RESTORE_WAIT_BACK_BUTTON_TAP";
                } else {
                    if (this instanceof C45808KPn) {
                        C45808KPn c45808KPn = (C45808KPn) this;
                        AbstractC43592JPx.A0b(c45808KPn.A02).A05("OTC_LANDING_NUX_BACK_BUTTON_TAP");
                        C193328hC A0P = AbstractC31180DnO.A0P(c45808KPn);
                        AbstractC43592JPx.A1D(c45808KPn.requireContext(), A0P, R.drawable.ig_illustrations_illo_message_warning_refresh);
                        A0P.A0A(2131961826);
                        A0P.A09(2131961823);
                        A0P.A0S(DialogInterfaceOnClickListenerC48023LMs.A00(c45808KPn, 27), EnumC193348hE.A04, 2131961824);
                        A0P.A0H(DialogInterfaceOnClickListenerC48023LMs.A00(c45808KPn, 28), 2131961825);
                        A0P.A0h(new DialogInterfaceOnShowListenerC48027LMw(c45808KPn, 5));
                        A0P.A0s(true);
                        AbstractC166987dD.A1W(A0P);
                        return true;
                    }
                    if (this instanceof C45816KPv) {
                        C45816KPv c45816KPv = (C45816KPv) this;
                        C06C.A00(AbstractC166987dD.A0b(), c45816KPv, "back_press_key");
                        abstractC2056898s = ((C44458JlQ) c45816KPv.A08.getValue()).A06;
                        if (!abstractC2056898s.A0A()) {
                            return false;
                        }
                        str3 = "OTC_ENTER_PIN_VIEW_BACK_BUTTON_TAP";
                    } else {
                        if (this instanceof C45812KPr) {
                            C45812KPr c45812KPr = (C45812KPr) this;
                            if (c45812KPr.A00) {
                                return false;
                            }
                            abstractC2056898s = C44541Jml.A00(c45812KPr.A05);
                            if (!abstractC2056898s.A0A()) {
                                return false;
                            }
                        } else if (this instanceof C45811KPq) {
                            C45811KPq c45811KPq = (C45811KPq) this;
                            if (c45811KPq.A01) {
                                return false;
                            }
                            abstractC2056898s = C44541Jml.A00(c45811KPq.A05);
                            if (!abstractC2056898s.A0A()) {
                                return false;
                            }
                        } else {
                            if (this instanceof C45813KPs) {
                                C44478Jlk c44478Jlk = (C44478Jlk) ((C45813KPs) this).A0B.getValue();
                                KPI kpi2 = c44478Jlk.A00;
                                kpi2.A05("MORE_OPTIONS_NAVIGATE_BACK");
                                Integer num = c44478Jlk.A02;
                                Integer num2 = C05F.A0C;
                                if (num != num2) {
                                    return false;
                                }
                                kpi2.A07("END_REASON", "SETTINGS_ONBOARDING_CLOSED");
                                kpi2.A04(num2);
                                return false;
                            }
                            if (this instanceof C45794KOz) {
                                interfaceC09390do = ((C45794KOz) this).A06;
                            } else if (this instanceof C45793KOy) {
                                interfaceC09390do = ((C45793KOy) this).A05;
                            } else if (this instanceof KP0) {
                                abstractC2056898s = ((C44472Jle) ((KP0) this).A04.getValue()).A01;
                                str3 = "SOFT_BLOCK_3P_LEADING_SCREEN_NAVIGATE_BACK";
                            } else {
                                if (!(this instanceof KP1)) {
                                    return false;
                                }
                                KP1 kp12 = (KP1) this;
                                C44477Jlj c44477Jlj = (C44477Jlj) kp12.A03.getValue();
                                if (c44477Jlj.A02.intValue() == 2) {
                                    str = "SETTINGS_TOGGLE_CLOSED";
                                } else {
                                    str = "HARD_BLOCK_CLOSED";
                                }
                                kpi = c44477Jlj.A01;
                                kpi.A07("END_REASON", str);
                                str2 = "HARD_BLOCK_3P_LEADING_SCREEN_CLOSED";
                                kp1 = kp12;
                            }
                            ((C44462JlU) interfaceC09390do.getValue()).A0E();
                            return false;
                        }
                        str3 = "OTC_DEVICE_LIST_BACK_BUTTON_TAP";
                    }
                }
                kpi.A05(str2);
                kpi.A01();
                kp1.requireActivity().setResult(106183331);
                return false;
            }
        }
        abstractC2056898s.A05(str3);
        return false;
    }

    public static double A00(InterfaceC09390do interfaceC09390do) {
        if (C6CB.A02(((C6CF) interfaceC09390do.getValue()).A00, 36315928477437765L)) {
            return 0.85d;
        }
        return 0.75d;
    }

    public static void A04(View view, Fragment fragment) {
        View requireViewById = view.requireViewById(R.id.container);
        C14360o3.A07(requireViewById);
        LLQ.A04((ViewGroup) requireViewById, fragment);
    }

    public static boolean A08(AbstractC31469DsD abstractC31469DsD) {
        View view = (View) abstractC31469DsD.A02();
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public static boolean A09(AbstractC31469DsD abstractC31469DsD) {
        return !((View) abstractC31469DsD.A02()).canScrollVertically(-1);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        C3DN A0m;
        int A02 = C0f9.A02(-1179745109);
        super.onResume();
        if (LLQ.A08(this) && (A0m = AbstractC25230BEn.A0m(this)) != null) {
            ((C3DP) A0m).A0H = new C49624LwH(this, 1);
        }
        C0f9.A09(462476095, A02);
    }
}
