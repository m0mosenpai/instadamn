package com.instagram.nux.impl.dynamicflow.onboarding;

import X.AbstractC016706m;
import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC32319ELj;
import X.AbstractC34718FRf;
import X.AbstractC35067Fce;
import X.AbstractC35275FhA;
import X.AbstractC36003Fv1;
import X.AbstractC59962oe;
import X.C00O;
import X.C04070Jy;
import X.C05F;
import X.C0f9;
import X.C121295eS;
import X.C140966Yy;
import X.C14360o3;
import X.C18C;
import X.C19280xC;
import X.C19T;
import X.C25020B4x;
import X.C25621Ms;
import X.C26725Br6;
import X.C32202ECx;
import X.C32251EIk;
import X.C32252EIl;
import X.C32255EIp;
import X.C32260EIu;
import X.C32269EJe;
import X.C32275EJk;
import X.C32321ELp;
import X.C32323ELr;
import X.C32510ETl;
import X.C33002Egp;
import X.C33009Egw;
import X.C35036Fc9;
import X.C35080Fcr;
import X.C35233FgQ;
import X.C35781FrJ;
import X.C35787FrP;
import X.C35790FrS;
import X.C36007Fv5;
import X.C36710GGf;
import X.C41451vu;
import X.C42270Inu;
import X.C53Z;
import X.C57510Pfk;
import X.ELT;
import X.ELU;
import X.EMR;
import X.EMT;
import X.ENJ;
import X.ENu;
import X.EOI;
import X.EnumC33445EqI;
import X.EnumC33522Erv;
import X.F7G;
import X.FEB;
import X.FEZ;
import X.FH8;
import X.FJR;
import X.FYK;
import X.GB4;
import X.InterfaceC11380iw;
import X.InterfaceC37107GWs;
import X.InterfaceC37264GbH;
import X.InterfaceC41501vz;
import X.InterfaceC53202c2;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discoverpeople.model.FindPeopleButtonOverride;
import com.instagram.nux.cal.model.DpActionContent;
import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class OnboardingActivity extends BaseFragmentActivity implements InterfaceC11380iw, InterfaceC37264GbH, InterfaceC53202c2 {
    public UserSession A00;
    public AbstractC36003Fv1 A01;
    public C35787FrP A02;
    public FH8 A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "onboarding_activity";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0038. Please report as an issue. */
    private final void A00() {
        InterfaceC37264GbH interfaceC37264GbH;
        int i;
        Bundle A0b;
        Fragment A00;
        String str;
        C140966Yy A0N;
        Bundle A002;
        Fragment elu;
        String str2;
        String str3;
        AbstractC36003Fv1 abstractC36003Fv1 = this.A01;
        if (abstractC36003Fv1 == null) {
            C14360o3.A0F("businessLogic");
            throw C00O.createAndThrow();
        }
        AbstractC34718FRf abstractC34718FRf = abstractC36003Fv1.A00;
        if (abstractC34718FRf == null) {
            finish();
            return;
        }
        C35787FrP c35787FrP = this.A02;
        if (c35787FrP == null) {
            C14360o3.A0F("stepNavigator");
            throw C00O.createAndThrow();
        }
        C35781FrJ c35781FrJ = (C35781FrJ) abstractC36003Fv1.A03;
        C14360o3.A0B(c35781FrJ, 2);
        EnumC33522Erv enumC33522Erv = (EnumC33522Erv) abstractC34718FRf.A00;
        switch (FEB.A00[enumC33522Erv.ordinal()]) {
            case 1:
                UserSession userSession = c35781FrJ.A00;
                if (userSession == null) {
                    return;
                }
                if (C35080Fcr.A00(userSession) == null) {
                    C32510ETl c32510ETl = new C32510ETl(userSession);
                    String A02 = C36007Fv5.A00().A02(userSession, "ig_android_growth_fx_access_contact_point_nux", "AdditionalContactUtil");
                    AbstractC31172DnG.A0P(userSession).A02(C19T.A1E);
                    String A10 = AbstractC31172DnG.A10(this);
                    C14360o3.A07(A10);
                    C18C.A0E(true);
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                    A0c.A0B("accounts/contact_point_prefill/");
                    A0c.A9s("usage", "auto_confirmation");
                    if (A02 != null) {
                        A0c.A9s("big_blue_token", A02);
                    }
                    AbstractC31173DnH.A1O(A0c, A10);
                    A0c.A0S(C32202ECx.class, FYK.class);
                    A0c.A0R = true;
                    AbstractC31175DnJ.A1K(A0c, c32510ETl);
                }
                interfaceC37264GbH = c35787FrP.A00;
                i = 1;
                interfaceC37264GbH.CnE(i);
                return;
            case 2:
                UserSession userSession2 = c35781FrJ.A00;
                if (userSession2 == null) {
                    return;
                }
                FJR A003 = C35080Fcr.A00(userSession2);
                if (A003 != null) {
                    C35080Fcr.A01(this, userSession2, A003.A01, A003.A00);
                    return;
                }
                interfaceC37264GbH = c35787FrP.A00;
                i = -1;
                interfaceC37264GbH.CnE(i);
                return;
            case 3:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new ELU();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 4:
            case 5:
                A002 = C35787FrP.A00(c35781FrJ);
                if (enumC33522Erv == EnumC33522Erv.A0M) {
                    str2 = "ig_nux_after_linking_upsell";
                } else {
                    str2 = "ig_nux";
                }
                A002.putString("ONBOARDING_STEP", str2);
                AbstractC31172DnG.A1A();
                elu = new AbstractC59962oe();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 6:
                UserSession userSession3 = c35781FrJ.A00;
                if (userSession3 == null) {
                    return;
                }
                C57510Pfk c57510Pfk = new C57510Pfk(c35787FrP, 14);
                C35790FrS c35790FrS = C35790FrS.A04;
                if (c35790FrS == null) {
                    c35790FrS = new C35790FrS(userSession3);
                    C35790FrS.A04 = c35790FrS;
                }
                Fragment A004 = c35790FrS.A03.A00(this, new C36710GGf(userSession3, c57510Pfk));
                A004.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(A004, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                A002 = C35787FrP.A00(c35781FrJ);
                A002.putBoolean("should_remove_nux_ci_skip_button", AbstractC25229BEm.A1a(enumC33522Erv, EnumC33522Erv.A06));
                if (enumC33522Erv == EnumC33522Erv.A0A) {
                    A002.putBoolean("should_redesign_nux_contact_import", true);
                    str3 = "A";
                } else if (enumC33522Erv == EnumC33522Erv.A08) {
                    A002.putBoolean("should_redesign_nux_contact_import", true);
                    str3 = "B";
                } else {
                    if (enumC33522Erv == EnumC33522Erv.A09) {
                        A002.putBoolean("should_redesign_nux_contact_import", true);
                        str3 = "C";
                    }
                    A002.putString("NUX_FLOW_TYPE", String.valueOf(c35781FrJ.A01));
                    if (c35781FrJ.A04 && c35787FrP.A00.CUt()) {
                        A002.putBoolean("should_show_close_button", true);
                    }
                    AbstractC31172DnG.A1A();
                    elu = new C32275EJk();
                    elu.setArguments(A002);
                    elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                    A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                    A0N.A0G = true;
                    A0N.A04();
                    return;
                }
                A002.putString("redesign_ci_variant", str3);
                A002.putString("NUX_FLOW_TYPE", String.valueOf(c35781FrJ.A01));
                if (c35781FrJ.A04) {
                    A002.putBoolean("should_show_close_button", true);
                }
                AbstractC31172DnG.A1A();
                elu = new C32275EJk();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Bundle A005 = C35787FrP.A00(c35781FrJ);
                A005.putString("NUX_FLOW_TYPE", String.valueOf(c35781FrJ.A01));
                AbstractC31172DnG.A1A();
                A00 = new C32323ELr();
                A00.setArguments(A005);
                str = "PARTIAL_CONTACT_IMPORT";
                A00.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(A00, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A0A = str;
                A0N.A04();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new ENu();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 14:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new EMR();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case Process.SIGTERM /* 15 */:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new ELT();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 16:
            case 17:
                UserSession userSession4 = c35781FrJ.A00;
                if (userSession4 == null) {
                    return;
                }
                String A006 = AbstractC111324zv.A00(1152);
                if (userSession4.A00(DpActionContent.class) != null) {
                    DpActionContent dpActionContent = (DpActionContent) userSession4.A00(DpActionContent.class);
                    if (dpActionContent != null && dpActionContent.A02 != null && dpActionContent.A00 != null && dpActionContent.A01 != null) {
                        Bundle A0b2 = AbstractC166987dD.A0b();
                        String str4 = dpActionContent.A02;
                        if (str4 != null) {
                            String str5 = dpActionContent.A00;
                            if (str5 != null) {
                                String str6 = dpActionContent.A01;
                                if (str6 != null) {
                                    A0b2.putParcelable("FACEBOOK", new FindPeopleButtonOverride(str4, str5, str6));
                                    AbstractC35067Fce.A01();
                                    A0b = AbstractC166987dD.A0b();
                                    A0b.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", "nux");
                                    A0b.putString("ExplorePeopleFragment.ARGUMENT_TYPE", A006);
                                    A0b.putBundle(AbstractC111324zv.A00(631), A0b2);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    interfaceC37264GbH = c35787FrP.A00;
                    i = -1;
                    interfaceC37264GbH.CnE(i);
                    return;
                }
                AbstractC35067Fce.A01();
                A0b = AbstractC166987dD.A0b();
                A0b.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", "nux");
                A0b.putString("ExplorePeopleFragment.ARGUMENT_TYPE", A006);
                A00 = F7G.A00(A0b);
                str = "DISCOVER_PEOPLE";
                A00.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(A00, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A0A = str;
                A0N.A04();
                return;
            case 18:
            case Process.SIGSTOP /* 19 */:
                A002 = C35787FrP.A00(c35781FrJ);
                if (c35781FrJ.A04 && c35787FrP.A00.CUt()) {
                    A002.putBoolean("should_show_close_button", true);
                }
                AbstractC31172DnG.A1A();
                elu = new EOI();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 20:
                A002 = AbstractC166987dD.A0b();
                A002.putBoolean("IS_SIGN_UP_FLOW", true);
                AbstractC31172DnG.A1A();
                elu = new C32269EJe();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 21:
                A002 = AbstractC166987dD.A0b();
                A002.putBoolean("IS_SIGN_UP_FLOW", true);
                AbstractC31172DnG.A1A();
                elu = new C26725Br6();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 22:
                AbstractC31172DnG.A1A();
                Bundle A0b3 = AbstractC166987dD.A0b();
                A00 = new C32260EIu();
                A00.setArguments(A0b3);
                str = "DISCOVER_ACCOUNTS";
                A00.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(A00, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A0A = str;
                A0N.A04();
                return;
            case 23:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new C53Z();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 24:
                UserSession userSession5 = c35781FrJ.A00;
                if (userSession5 != null && userSession5.userId != null) {
                    AbstractC31172DnG.A1A();
                    Bundle A007 = C35787FrP.A00(c35781FrJ);
                    A00 = new ENJ();
                    A007.putString("ARG_ENTRY_POINT", "nux");
                    A00.setArguments(A007);
                    str = "FOLLOW_FROM_LOGGED_IN_ACCOUNTS";
                    A00.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                    A0N = AbstractC31174DnI.A0N(A00, this, c35781FrJ.A00);
                    A0N.A0G = true;
                    A0N.A0A = str;
                    A0N.A04();
                    return;
                }
                interfaceC37264GbH = c35787FrP.A00;
                i = -1;
                interfaceC37264GbH.CnE(i);
                return;
            case 25:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new AbstractC32319ELj();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 26:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                A002.putString("ShareProfileFragment.NavControlVariant", "NUX");
                elu = new C32255EIp();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 27:
                AbstractC31172DnG.A1A();
                Bundle A0b4 = AbstractC166987dD.A0b();
                A00 = new C32321ELp();
                A00.setArguments(A0b4);
                str = "PUSH_OPT_IN";
                A00.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(A00, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A0A = str;
                A0N.A04();
                return;
            case 28:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new C32251EIk();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new EMT();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            case 30:
                AbstractC31172DnG.A1A();
                A002 = C35787FrP.A00(c35781FrJ);
                elu = new C32252EIl();
                elu.setArguments(A002);
                elu.requireArguments().putAll(C35787FrP.A00(c35781FrJ));
                A0N = AbstractC31174DnI.A0N(elu, this, c35781FrJ.A00);
                A0N.A0G = true;
                A0N.A04();
                return;
            default:
                interfaceC37264GbH = c35787FrP.A00;
                i = -2;
                interfaceC37264GbH.CnE(i);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [X.FrJ, java.lang.Object] */
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        C35036Fc9 c35036Fc9 = C33002Egp.A03;
        UserSession userSession = this.A00;
        String str = "userSession";
        EnumC33445EqI enumC33445EqI = null;
        if (userSession != null) {
            C33002Egp A04 = c35036Fc9.A04(userSession.userId);
            this.A02 = new C35787FrP(this);
            if (A04 == null) {
                A04 = c35036Fc9.A04(null);
                if (A04 == null) {
                    ?? obj = new Object();
                    obj.A01 = EnumC33445EqI.A03;
                    obj.A02 = C05F.A00;
                    UserSession userSession2 = this.A00;
                    if (userSession2 != null) {
                        obj.A00 = userSession2;
                        A04 = new C33002Egp(this, userSession2, obj, new C33009Egw());
                        ((AbstractC36003Fv1) A04).A02.add(new GB4(this));
                    }
                }
                C19280xC A00 = C19280xC.A00(this, "ig_dynamic_onboarding_missing_business_logic");
                A00.A09("found", AbstractC166997dE.A0b());
                UserSession userSession3 = this.A00;
                if (userSession3 != null) {
                    AbstractC31173DnH.A1S(A00, userSession3);
                }
            }
            this.A01 = A04;
            String str2 = "businessLogic";
            if (((AbstractC36003Fv1) A04).A01.A01(EnumC33522Erv.A04)) {
                AbstractC36003Fv1 abstractC36003Fv1 = this.A01;
                if (abstractC36003Fv1 != null) {
                    if (abstractC36003Fv1 instanceof C33002Egp) {
                        enumC33445EqI = ((C35781FrJ) abstractC36003Fv1.A03).A01;
                    }
                    UserSession userSession4 = this.A00;
                    if (userSession4 == null) {
                        str2 = "userSession";
                    } else {
                        C35790FrS c35790FrS = C35790FrS.A04;
                        if (c35790FrS == null) {
                            c35790FrS = new C35790FrS(userSession4);
                            C35790FrS.A04 = c35790FrS;
                        }
                        if (enumC33445EqI == null) {
                            enumC33445EqI = EnumC33445EqI.A05;
                        }
                        synchronized (c35790FrS) {
                            if (!C35790FrS.A00(this, c35790FrS, enumC33445EqI)) {
                                C42270Inu c42270Inu = new C42270Inu(3, this, c35790FrS, enumC33445EqI);
                                AbstractC25651Mw.A00(c35790FrS.A02).A01(c42270Inu, C121295eS.class);
                                c35790FrS.A00 = c42270Inu;
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            AbstractC36003Fv1 abstractC36003Fv12 = this.A01;
            if (abstractC36003Fv12 == null) {
                str = "businessLogic";
            } else {
                if (abstractC36003Fv12.A00 == null) {
                    CnE(1);
                } else {
                    A00();
                }
                UserSession userSession5 = this.A00;
                if (userSession5 != null) {
                    AbstractC35275FhA.A0D(this, this, userSession5, AbstractC111324zv.A00(367), "ONBOARDING_ACTIVITY", new C25020B4x(1));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37264GbH
    public final boolean CUt() {
        AbstractC36003Fv1 abstractC36003Fv1 = this.A01;
        if (abstractC36003Fv1 == null) {
            C14360o3.A0F("businessLogic");
            throw C00O.createAndThrow();
        }
        return abstractC36003Fv1.CUt();
    }

    @Override // X.InterfaceC37264GbH
    public final void CnE(int i) {
        AbstractC36003Fv1 abstractC36003Fv1 = this.A01;
        if (abstractC36003Fv1 == null) {
            C14360o3.A0F("businessLogic");
            throw C00O.createAndThrow();
        }
        abstractC36003Fv1.CnE(i);
        A00();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC37107GWs interfaceC37107GWs;
        InterfaceC37107GWs interfaceC37107GWs2;
        InterfaceC37107GWs interfaceC37107GWs3;
        InterfaceC37107GWs interfaceC37107GWs4;
        AbstractC36003Fv1 abstractC36003Fv1 = this.A01;
        InterfaceC37107GWs interfaceC37107GWs5 = null;
        if (abstractC36003Fv1 != null) {
            AbstractC34718FRf abstractC34718FRf = abstractC36003Fv1.A00;
            if (abstractC34718FRf != null) {
                InterfaceC37107GWs interfaceC37107GWs6 = abstractC34718FRf.A00;
                EnumC33522Erv enumC33522Erv = EnumC33522Erv.A0K;
                if (interfaceC37107GWs6 != enumC33522Erv || A01(enumC33522Erv)) {
                    AbstractC36003Fv1 abstractC36003Fv12 = this.A01;
                    if (abstractC36003Fv12 != null) {
                        AbstractC34718FRf abstractC34718FRf2 = abstractC36003Fv12.A00;
                        if (abstractC34718FRf2 != null) {
                            interfaceC37107GWs = abstractC34718FRf2.A00;
                        } else {
                            interfaceC37107GWs = null;
                        }
                        EnumC33522Erv enumC33522Erv2 = EnumC33522Erv.A0F;
                        if (interfaceC37107GWs != enumC33522Erv2 || A01(enumC33522Erv2)) {
                            AbstractC36003Fv1 abstractC36003Fv13 = this.A01;
                            if (abstractC36003Fv13 != null) {
                                AbstractC34718FRf abstractC34718FRf3 = abstractC36003Fv13.A00;
                                if (abstractC34718FRf3 != null) {
                                    interfaceC37107GWs2 = abstractC34718FRf3.A00;
                                } else {
                                    interfaceC37107GWs2 = null;
                                }
                                EnumC33522Erv enumC33522Erv3 = EnumC33522Erv.A0P;
                                if (interfaceC37107GWs2 != enumC33522Erv3 || A01(enumC33522Erv3)) {
                                    AbstractC36003Fv1 abstractC36003Fv14 = this.A01;
                                    if (abstractC36003Fv14 != null) {
                                        AbstractC34718FRf abstractC34718FRf4 = abstractC36003Fv14.A00;
                                        if (abstractC34718FRf4 != null) {
                                            interfaceC37107GWs3 = abstractC34718FRf4.A00;
                                        } else {
                                            interfaceC37107GWs3 = null;
                                        }
                                        EnumC33522Erv enumC33522Erv4 = EnumC33522Erv.A0E;
                                        if (interfaceC37107GWs3 != enumC33522Erv4 || A01(enumC33522Erv4)) {
                                            AbstractC36003Fv1 abstractC36003Fv15 = this.A01;
                                            if (abstractC36003Fv15 != null) {
                                                AbstractC34718FRf abstractC34718FRf5 = abstractC36003Fv15.A00;
                                                if (abstractC34718FRf5 != null) {
                                                    interfaceC37107GWs4 = abstractC34718FRf5.A00;
                                                } else {
                                                    interfaceC37107GWs4 = null;
                                                }
                                                EnumC33522Erv enumC33522Erv5 = EnumC33522Erv.A0B;
                                                if (interfaceC37107GWs4 != enumC33522Erv5 || A01(enumC33522Erv5)) {
                                                    AbstractC36003Fv1 abstractC36003Fv16 = this.A01;
                                                    if (abstractC36003Fv16 != null) {
                                                        AbstractC34718FRf abstractC34718FRf6 = abstractC36003Fv16.A00;
                                                        if (abstractC34718FRf6 != null) {
                                                            interfaceC37107GWs5 = abstractC34718FRf6.A00;
                                                        }
                                                        EnumC33522Erv enumC33522Erv6 = EnumC33522Erv.A0C;
                                                        if (interfaceC37107GWs5 != enumC33522Erv6 || A01(enumC33522Erv6)) {
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                super.onBackPressed();
                return;
            }
            return;
        }
        C14360o3.A0F("businessLogic");
        throw C00O.createAndThrow();
    }

    private final boolean A01(EnumC33522Erv enumC33522Erv) {
        AbstractC10360h2 A0D = AbstractC31172DnG.A0D(this);
        int A0L = A0D.A0L();
        if (A0L == 0) {
            return true;
        }
        Object A0S = A0D.A0S(A0L - 1);
        C14360o3.A07(A0S);
        return C14360o3.A0K(enumC33522Erv.name(), ((AbstractC016706m) A0S).A09);
    }

    @Override // X.InterfaceC37264GbH
    public final void ATj() {
        finish();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        WeakReference weakReference;
        InterfaceC37264GbH interfaceC37264GbH;
        super.onActivityResult(i, i2, intent);
        if (i == 11228576) {
            InterfaceC11380iw interfaceC11380iw = FEZ.A02;
            if (interfaceC11380iw != null && (weakReference = FEZ.A07) != null && (interfaceC37264GbH = FEZ.A04) != null && weakReference.get() != null) {
                UserSession userSession = this.A00;
                if (userSession == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                Object obj = weakReference.get();
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                C35233FgQ c35233FgQ = new C35233FgQ((Fragment) obj, interfaceC11380iw, userSession, interfaceC37264GbH, FEZ.A05);
                boolean z = FEZ.A08;
                c35233FgQ.A06(FEZ.A03, FEZ.A00, FEZ.A06, FEZ.A01, z, FEZ.A09, FEZ.A0A);
            }
            FEZ.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r0.A01.A01(X.EnumC33522Erv.A0I) != false) goto L17;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.FH8] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1361493835(0x5126bf4b, float:4.476087E10)
            int r2 = X.C0f9.A00(r0)
            X.09Y r1 = X.C023409i.A0A
            android.os.Bundle r0 = X.AbstractC31173DnH.A0A(r5)
            if (r0 == 0) goto L7c
            com.instagram.common.session.UserSession r0 = r1.A06(r0)
            r5.A00 = r0
            super.onCreate(r6)
            X.FH8 r4 = new X.FH8
            r4.<init>()
            r5.A03 = r4
            com.instagram.common.session.UserSession r1 = r5.A00
            if (r1 != 0) goto L2d
            java.lang.String r3 = "userSession"
        L25:
            X.C14360o3.A0F(r3)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L2d:
            r0 = 8
            X.FxV r3 = new X.FxV
            r3.<init>(r0, r5, r1)
            r4.A00 = r3
            X.1vu r1 = X.C41451vu.A01
            java.lang.Class<X.0Jy> r0 = X.C04070Jy.class
            r1.A02(r3, r0)
            X.Fv1 r0 = r5.A01
            java.lang.String r3 = "businessLogic"
            if (r0 == 0) goto L25
            X.FQz r1 = r0.A01
            X.Erv r0 = X.EnumC33522Erv.A0H
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L5b
            X.Fv1 r0 = r5.A01
            if (r0 == 0) goto L25
            X.FQz r1 = r0.A01
            X.Erv r0 = X.EnumC33522Erv.A0I
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L6e
        L5b:
            X.2bb r1 = new X.2bb
            r1.<init>(r5)
            java.lang.Class<X.Dyh> r0 = X.C31823Dyh.class
            X.2bZ r0 = r1.A00(r0)
            X.Dyh r0 = (X.C31823Dyh) r0
            X.05A r1 = r0.A01
            r0 = 1
            X.AbstractC166997dE.A1Y(r1, r0)
        L6e:
            X.Fbq r0 = X.C35017Fbq.A00()
            r0.A01()
            r0 = -1393943449(0xffffffffacea1c67, float:-6.6538333E-12)
            X.C0f9.A07(r0, r2)
            return
        L7c:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = 246807973(0xeb5fda5, float:4.4864196E-30)
            X.C0f9.A07(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(1741122087);
        super.onDestroy();
        FH8 fh8 = this.A03;
        if (fh8 != null) {
            C41451vu c41451vu = C41451vu.A01;
            InterfaceC41501vz interfaceC41501vz = fh8.A00;
            if (interfaceC41501vz == null) {
                C14360o3.A0F("logoutEventListener");
                throw C00O.createAndThrow();
            }
            c41451vu.A03(interfaceC41501vz, C04070Jy.class);
            this.A03 = null;
        }
        C0f9.A07(960124643, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }
}
