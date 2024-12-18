package com.instagram.business.activity;

import X.AbstractC03270Dk;
import X.AbstractC09440dt;
import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC153636vY;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16830sb;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC34027F0g;
import X.AbstractC34248F8u;
import X.AbstractC34250F8w;
import X.AbstractC35046FcJ;
import X.AbstractC35211Fg4;
import X.AbstractC35780FrI;
import X.AbstractC43591JPw;
import X.AbstractC54852fj;
import X.AbstractC59962oe;
import X.C006802i;
import X.C00O;
import X.C023409i;
import X.C05F;
import X.C06090Tz;
import X.C08730cb;
import X.C08V;
import X.C0f9;
import X.C0w9;
import X.C11R;
import X.C14360o3;
import X.C17060sy;
import X.C18C;
import X.C18U;
import X.C192108fB;
import X.C193328hC;
import X.C1GJ;
import X.C1GL;
import X.C1ON;
import X.C1QO;
import X.C25621Ms;
import X.C31500Dsk;
import X.C31505Dsp;
import X.C32312ELa;
import X.C32393EOu;
import X.C32524EUa;
import X.C32548EUy;
import X.C34398FEo;
import X.C34399FEp;
import X.C34404FEu;
import X.C34650FOi;
import X.C35013Fbk;
import X.C35034Fc7;
import X.C35130FeX;
import X.C35220FgD;
import X.C35758Fqv;
import X.C35788FrQ;
import X.C35792FrU;
import X.C35917Ftb;
import X.C35929Ftn;
import X.C36007Fv5;
import X.C36698GFt;
import X.C45126Jxv;
import X.C53Z;
import X.C55551Oll;
import X.C62862tP;
import X.C95P;
import X.DialogInterfaceOnClickListenerC35372Fin;
import X.DialogInterfaceOnClickListenerC35452Fk9;
import X.EIM;
import X.EKF;
import X.ELJ;
import X.ELV;
import X.ELW;
import X.ELZ;
import X.ENu;
import X.EnumC151596s5;
import X.EnumC222416a;
import X.EnumC33376Ep9;
import X.GTR;
import X.GZG;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC37191Ga2;
import X.InterfaceC37222GaX;
import X.InterfaceC53722dB;
import X.RunnableC36806GKf;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class BusinessConversionActivity extends BaseFragmentActivity implements InterfaceC11380iw, C1GL, InterfaceC37222GaX, GZG, CallerContextable, C08V {
    public Bundle A00;
    public C35034Fc7 A01;
    public EnumC151596s5 A02;
    public PageSelectionOverrideData A03;
    public boolean A05;
    public boolean A06;
    public final InterfaceC09390do A0D = AbstractC31180DnO.A0u(this, 30);
    public final InterfaceC09390do A0I = AbstractC31180DnO.A0u(this, 32);
    public final InterfaceC09390do A0H = AbstractC31180DnO.A0u(this, 35);
    public final InterfaceC09390do A0F = AbstractC31180DnO.A0u(this, 33);
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(GTR.A00);
    public final InterfaceC09390do A0G = AbstractC31180DnO.A0u(this, 34);
    public final InterfaceC09390do A0E = AbstractC31180DnO.A0u(this, 31);
    public final InterfaceC09390do A09 = AbstractC31180DnO.A0u(this, 27);
    public final InterfaceC09390do A0A = AbstractC31180DnO.A0u(this, 28);
    public final InterfaceC09390do A0B = AbstractC31180DnO.A0u(this, 29);
    public String A04 = "";
    public boolean A07 = true;
    public final HashSet A08 = AbstractC166987dD.A1H();

    public final void A0o(Context context, InterfaceC37191Ga2 interfaceC37191Ga2, C1GL c1gl, EnumC222416a enumC222416a, String str, boolean z) {
        int i;
        int i2;
        C14360o3.A0B(enumC222416a, 4);
        C08730cb c08730cb = C17060sy.A01;
        AbstractC18680vv session = getSession();
        AbstractC31171DnF.A1Q(session);
        User A01 = c08730cb.A01((UserSession) session);
        if (!A01.A2I() && A01.A0M() == C05F.A0C) {
            if (B77() != EnumC151596s5.A08 && B77() != EnumC151596s5.A0A) {
                i = 2131955034;
                i2 = 2131955032;
                if (AbstractC35211Fg4.A03(this)) {
                    i = 2131955035;
                    i2 = 2131955033;
                }
            } else {
                i = 2131975087;
                i2 = 2131975086;
            }
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(i);
            A0I.A09(i2);
            A0I.A0F(new DialogInterfaceOnClickListenerC35372Fin(context, this, interfaceC37191Ga2, c1gl, enumC222416a, str, z));
            A0I.A06();
            AbstractC166987dD.A1W(A0I);
            return;
        }
        A00(context, this, interfaceC37191Ga2, c1gl, enumC222416a, false, z);
    }

    @Override // X.GZG
    public final boolean CPW() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // X.InterfaceC37222GaX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EUd(X.EnumC151596s5 r8) {
        /*
            r7 = this;
            r4 = 0
            X.C14360o3.A0B(r8, r4)
            X.6s5 r0 = r7.A02
            java.lang.String r6 = "_flowType"
            if (r0 == 0) goto La0
            if (r0 == r8) goto L60
            r7.A02 = r8
            com.instagram.business.controller.datamodel.ConversionStep r1 = r7.A0n()
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A03
            r5 = r6
            if (r1 != r0) goto L73
            X.6s5 r0 = r7.A02
            if (r0 == 0) goto La4
            int r1 = r0.ordinal()
            if (r1 == r4) goto L89
            r0 = 6
            if (r1 == r0) goto L89
            r0 = 1
            if (r1 == r0) goto L61
            r0 = 7
            if (r1 == r0) goto L61
        L2e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L4d
            X.Fc7 r0 = r7.A01
            java.lang.String r5 = "conversionLogic"
            if (r0 == 0) goto La4
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r2 = r0.A00
            X.C14360o3.A07(r2)
            int r1 = r2.A00
            int r0 = r1 + 1
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = X.C35220FgD.A02(r2, r3, r0, r1)
            X.Fc7 r0 = r7.A01
            if (r0 == 0) goto La4
            r0.A00 = r1
        L4d:
            X.0do r0 = r7.A0D
            java.lang.Object r2 = r0.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            X.6s5 r0 = r7.A02
            if (r0 == 0) goto La0
            int r1 = r0.A00
            java.lang.String r0 = "business_account_flow"
            r2.putInt(r0, r1)
        L60:
            return
        L61:
            X.0vv r2 = r7.getSession()
            X.AbstractC31171DnF.A1Q(r2)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            boolean r1 = r7.A07
            java.lang.String r0 = r7.A04
            com.google.common.collect.ImmutableList r3 = X.AbstractC35046FcJ.A02(r2, r0, r4, r1)
            goto L2e
        L73:
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A0G
            if (r1 != r0) goto L2e
            X.6s5 r0 = r7.A02
            if (r0 == 0) goto La4
            int r1 = r0.ordinal()
            if (r1 == r4) goto L89
            r0 = 2
            if (r1 != r0) goto L2e
            com.google.common.collect.ImmutableList r3 = X.AbstractC35046FcJ.A00()
            goto L2e
        L89:
            X.0vv r3 = r7.getSession()
            X.0do r0 = r7.A09
            java.lang.Object r0 = r0.getValue()
            X.FrQ r0 = (X.C35788FrQ) r0
            X.EBH r2 = r0.A01
            boolean r1 = r7.A07
            java.lang.String r0 = r7.A04
            com.google.common.collect.ImmutableList r3 = X.AbstractC35046FcJ.A01(r2, r3, r0, r4, r1)
            goto L2e
        La0:
            X.C14360o3.A0F(r6)
            goto La7
        La4:
            X.C14360o3.A0F(r5)
        La7:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.activity.BusinessConversionActivity.EUd(X.6s5):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "business_conversion_activity";
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C35034Fc7 c35034Fc7 = this.A01;
        if (c35034Fc7 == null) {
            C14360o3.A0F("conversionLogic");
            throw C00O.createAndThrow();
        }
        bundle.putParcelable("conversion_flow_status", c35034Fc7.A00);
        bundle.putParcelable("business_info", ((C35788FrQ) this.A09.getValue()).A02);
        PageSelectionOverrideData pageSelectionOverrideData = this.A03;
        if (pageSelectionOverrideData != null) {
            bundle.putParcelable("EXTRA_FB_OVERRIDE_DATA", pageSelectionOverrideData);
        }
    }

    public static final void A00(Context context, BusinessConversionActivity businessConversionActivity, InterfaceC37191Ga2 interfaceC37191Ga2, C1GL c1gl, EnumC222416a enumC222416a, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        InterfaceC09390do interfaceC09390do = businessConversionActivity.A09;
        BusinessInfo businessInfo = ((C35788FrQ) interfaceC09390do.getValue()).A02;
        if (businessInfo != null) {
            AbstractC18680vv session = businessConversionActivity.getSession();
            AbstractC31171DnF.A1Q(session);
            UserSession userSession = (UserSession) session;
            String str4 = ((C35788FrQ) interfaceC09390do.getValue()).A09;
            C35788FrQ c35788FrQ = (C35788FrQ) interfaceC09390do.getValue();
            interfaceC09390do.getValue();
            interfaceC09390do.getValue();
            EnumC222416a enumC222416a2 = (EnumC222416a) businessConversionActivity.A0B.getValue();
            if (businessConversionActivity.A0n() != null) {
                businessConversionActivity.A0n();
            }
            AbstractC167017dG.A1R(userSession, str4);
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            String str5 = businessInfo.A09;
            C25621Ms A00 = AbstractC35780FrI.A00(userSession, enumC222416a, str4);
            A00.A0R = true;
            A00.A9s("category_id", str5);
            A00.A0I("set_public", z);
            String str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str7 = "0";
            if (z2) {
                str7 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A00.A9s("ignore_conversion_log", str7);
            A00.A9s("should_bypass_contact_check", "true");
            String str8 = businessInfo.A0B;
            if (str8 != null && str8.length() != 0) {
                A00.A9s("public_email", str8);
            }
            Address address = businessInfo.A00;
            if (address != null) {
                try {
                    str = AbstractC34248F8u.A00(address);
                } catch (IOException unused) {
                    C0w9.A03("business_conversion_activity", "Couldn't serialize create business address");
                    str = null;
                }
                A00.A9s("business_address", str);
            }
            if (publicPhoneContact != null && (str2 = publicPhoneContact.A02) != null && str2.length() != 0) {
                try {
                    str3 = AbstractC34250F8w.A00(publicPhoneContact);
                } catch (IOException unused2) {
                    C0w9.A03("business_conversion_activity", "Couldn't serialize create business public phone contact");
                    str3 = null;
                }
                A00.A9s("public_phone_contact", str3);
            }
            EnumC222416a enumC222416a3 = EnumC222416a.A08;
            if (enumC222416a != enumC222416a3) {
                String str9 = "0";
                if (businessInfo.A0S) {
                    str9 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                }
                A00.A9s("should_show_public_contacts", str9);
                if (!businessInfo.A0Q) {
                    str6 = "0";
                }
                A00.A9s("should_show_category", str6);
            }
            if (enumC222416a2 != null && enumC222416a2 != enumC222416a3) {
                A00.A9s("previous_account_type", String.valueOf(enumC222416a2.A00));
            }
            C1ON A0N = A00.A0N();
            A0N.A00 = new C32524EUa(context, c35788FrQ, interfaceC37191Ga2, userSession, c1gl, businessInfo, enumC222416a, str4, AbstractC167007dF.A1X(AbstractC166997dE.A0Y(userSession).A0I(), EnumC222416a.A07));
            c1gl.schedule(A0N);
        }
    }

    public static final void A01(Bundle bundle, BusinessConversionActivity businessConversionActivity) {
        String valueOf;
        if (bundle == null) {
            InterfaceC09390do interfaceC09390do = businessConversionActivity.A09;
            ((C35788FrQ) interfaceC09390do.getValue()).A04 = null;
            ((C35788FrQ) interfaceC09390do.getValue()).A05 = null;
            return;
        }
        RegFlowExtras regFlowExtras = (RegFlowExtras) bundle.getParcelable("RegFlowExtras.EXTRA_KEY");
        InterfaceC09390do interfaceC09390do2 = businessConversionActivity.A09;
        ((C35788FrQ) interfaceC09390do2.getValue()).A04 = regFlowExtras;
        if (regFlowExtras != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            String str = null;
            if (regFlowExtras.A01() == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(regFlowExtras.A01());
            }
            A1G.put("registration_flow", valueOf);
            A1G.put("email", regFlowExtras.A08);
            CountryCodeData countryCodeData = regFlowExtras.A01;
            if (countryCodeData != null) {
                str = countryCodeData.A01;
            }
            A1G.put("area_code", str);
            A1G.put("phone", regFlowExtras.A0R);
            A1G.put("device_nonce", regFlowExtras.A06);
            A1G.put("business_name", regFlowExtras.A0O);
            Bundle A0b = AbstractC166987dD.A0b();
            Iterator A15 = AbstractC166997dE.A15(A1G);
            while (A15.hasNext()) {
                AbstractC31179DnN.A0o(A0b, A15);
            }
            bundle.putBundle("conversion_funnel_log_payload", A0b);
        }
        ((C35788FrQ) interfaceC09390do2.getValue()).A05 = bundle.getString("error_message");
        if (!bundle.containsKey("fb_user_id")) {
            return;
        }
        interfaceC09390do2.getValue();
        bundle.getString("fb_user_id");
    }

    public static final void A02(BusinessConversionActivity businessConversionActivity) {
        ConversionStep conversionStep;
        C35034Fc7 c35034Fc7 = businessConversionActivity.A01;
        if (c35034Fc7 != null) {
            BusinessConversionStep A00 = c35034Fc7.A00.A00();
            if (A00 == null) {
                conversionStep = null;
            } else {
                conversionStep = A00.A01;
            }
            if (conversionStep == ConversionStep.A05) {
                C35034Fc7 c35034Fc72 = businessConversionActivity.A01;
                if (c35034Fc72 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus = c35034Fc72.A00;
                    C14360o3.A07(businessConversionFlowStatus);
                    if (businessConversionFlowStatus.A00() != null) {
                        int i = businessConversionFlowStatus.A00;
                        c35034Fc72.A00 = C35220FgD.A00(businessConversionFlowStatus, i, i - 1);
                        businessConversionActivity.A08.remove(conversionStep);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            } else {
                if (conversionStep != ConversionStep.A0G) {
                    return;
                }
                C35034Fc7 c35034Fc73 = businessConversionActivity.A01;
                if (c35034Fc73 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus2 = c35034Fc73.A00;
                    C14360o3.A07(businessConversionFlowStatus2);
                    if (businessConversionFlowStatus2.A00() != null) {
                        int i2 = businessConversionFlowStatus2.A00;
                        BusinessConversionFlowStatus A002 = C35220FgD.A00(businessConversionFlowStatus2, i2, i2 - 1);
                        C35034Fc7 c35034Fc74 = businessConversionActivity.A01;
                        if (c35034Fc74 != null) {
                            c35034Fc74.A00 = A002;
                            return;
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
        C14360o3.A0F("conversionLogic");
        throw C00O.createAndThrow();
    }

    public final ConversionStep A0n() {
        C35034Fc7 c35034Fc7 = this.A01;
        if (c35034Fc7 == null) {
            C14360o3.A0F("conversionLogic");
            throw C00O.createAndThrow();
        }
        BusinessConversionStep A00 = c35034Fc7.A00.A00();
        if (A00 == null) {
            return null;
        }
        return A00.A01;
    }

    @Override // X.InterfaceC37222GaX
    public final void AGf() {
        C35034Fc7 c35034Fc7 = this.A01;
        if (c35034Fc7 == null) {
            C14360o3.A0F("conversionLogic");
            throw C00O.createAndThrow();
        }
        c35034Fc7.A01();
        finish();
    }

    @Override // X.InterfaceC37222GaX
    public final EnumC151596s5 B77() {
        EnumC151596s5 enumC151596s5 = this.A02;
        if (enumC151596s5 == null) {
            C14360o3.A0F("_flowType");
            throw C00O.createAndThrow();
        }
        return enumC151596s5;
    }

    @Override // X.InterfaceC37222GaX
    public final boolean CJ5() {
        EnumC151596s5 enumC151596s5 = this.A02;
        if (enumC151596s5 == null) {
            C14360o3.A0F("_flowType");
            throw C00O.createAndThrow();
        }
        if (enumC151596s5 != EnumC151596s5.A09 || E3w() == null) {
            return false;
        }
        while (E3w() != null) {
            EL3(null);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37222GaX
    public final ConversionStep E3v() {
        BusinessConversionStep businessConversionStep;
        C35034Fc7 c35034Fc7 = this.A01;
        if (c35034Fc7 == null) {
            C14360o3.A0F("conversionLogic");
            throw C00O.createAndThrow();
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = c35034Fc7.A00;
        int i = businessConversionFlowStatus.A00;
        ImmutableList immutableList = businessConversionFlowStatus.A01;
        if (i < immutableList.size() - 1 && (businessConversionStep = (BusinessConversionStep) immutableList.get(i + 1)) != null) {
            return businessConversionStep.A01;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37222GaX
    public final ConversionStep E3w() {
        BusinessConversionStep businessConversionStep;
        C35034Fc7 c35034Fc7 = this.A01;
        if (c35034Fc7 == null) {
            C14360o3.A0F("conversionLogic");
            throw C00O.createAndThrow();
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = c35034Fc7.A00;
        int i = businessConversionFlowStatus.A00;
        if (i > 0 && (businessConversionStep = (BusinessConversionStep) businessConversionFlowStatus.A01.get(i - 1)) != null) {
            return businessConversionStep.A01;
        }
        return null;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(BusinessConversionActivity businessConversionActivity, boolean z) {
        Bundle bundle;
        FragmentActivity fragmentActivity;
        C31505Dsp c31505Dsp;
        List list;
        ConversionStep A0n = businessConversionActivity.A0n();
        if (A0n == null) {
            businessConversionActivity.finish();
            return;
        }
        int ordinal = A0n.ordinal();
        if (ordinal == 16 && ((c31505Dsp = ((C35788FrQ) businessConversionActivity.A09.getValue()).A00) == null || (list = c31505Dsp.A03) == null || list.isEmpty())) {
            C35034Fc7 c35034Fc7 = businessConversionActivity.A01;
            if (c35034Fc7 == null) {
                C14360o3.A0F("conversionLogic");
                throw C00O.createAndThrow();
            }
            c35034Fc7.A02();
            A03(businessConversionActivity, z);
            return;
        }
        if (A0n == ConversionStep.A08) {
            bundle = AbstractC31174DnI.A0F("fb_account_linked", null);
        } else {
            bundle = null;
        }
        businessConversionActivity.A00 = bundle;
        if (A0n == ConversionStep.A0C || A0n == ConversionStep.A05) {
            InterfaceC09390do interfaceC09390do = businessConversionActivity.A09;
            interfaceC09390do.getValue();
            interfaceC09390do.getValue();
        }
        C35013Fbk c35013Fbk = (C35013Fbk) businessConversionActivity.A0E.getValue();
        switch (ordinal) {
            case 0:
                String name = A0n.name();
                Fragment fragment = c35013Fbk.A09;
                if (fragment == null) {
                    Bundle A00 = C35013Fbk.A00(c35013Fbk);
                    AbstractC31173DnH.A0u();
                    fragment = new ELW();
                    fragment.setArguments(A00);
                    c35013Fbk.A09 = fragment;
                }
                c35013Fbk.A01(fragment, name);
                return;
            case 1:
                String name2 = A0n.name();
                int i = c35013Fbk.A0I.A08;
                boolean z2 = false;
                if (i != -1) {
                    z2 = true;
                }
                C18C.A0F(z2);
                Fragment fragment2 = c35013Fbk.A05;
                if (fragment2 == null) {
                    AbstractC31173DnH.A0u();
                    String str = c35013Fbk.A0F;
                    Bundle A0C = AbstractC31177DnL.A0C(str);
                    AbstractC31171DnF.A13(A0C, str);
                    A0C.putString("edit_profile_entry", null);
                    A0C.putInt(AbstractC111324zv.A00(917), i);
                    fragment2 = new C32312ELa();
                    fragment2.setArguments(A0C);
                    c35013Fbk.A05 = fragment2;
                }
                FragmentActivity fragmentActivity2 = c35013Fbk.A0G;
                if (fragmentActivity2.isDestroyed()) {
                    return;
                }
                c35013Fbk.A0D.A00(fragment2, fragmentActivity2, c35013Fbk.A0J, name2, z);
                return;
            case 2:
                String name3 = A0n.name();
                Fragment fragment3 = c35013Fbk.A00;
                if (fragment3 == null) {
                    Bundle A002 = C35013Fbk.A00(c35013Fbk);
                    AbstractC31173DnH.A0u();
                    fragment3 = new AccountTypeSelectionV2Fragment();
                    fragment3.setArguments(A002);
                    c35013Fbk.A00 = fragment3;
                }
                c35013Fbk.A01(fragment3, name3);
                return;
            case 3:
                String name4 = A0n.name();
                Fragment fragment4 = c35013Fbk.A03;
                if (fragment4 == null) {
                    AbstractC31173DnH.A0u();
                    String str2 = c35013Fbk.A0F;
                    C14360o3.A0B(str2, 1);
                    Bundle A08 = AbstractC31176DnK.A08(str2);
                    A08.putInt("selected_account_type", 3);
                    fragment4 = new AbstractC59962oe();
                    fragment4.setArguments(A08);
                    c35013Fbk.A03 = fragment4;
                }
                c35013Fbk.A01(fragment4, name4);
                return;
            case 4:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                AbstractC31174DnI.A1S(c35013Fbk.A0H);
                return;
            case 5:
                String name5 = A0n.name();
                AbstractC03270Dk.A00(c35013Fbk.A0J.A00);
                Fragment fragment5 = c35013Fbk.A02;
                if (fragment5 == null) {
                    AbstractC31173DnH.A0u();
                    String str3 = c35013Fbk.A0F;
                    Bundle A0C2 = AbstractC31177DnL.A0C(str3);
                    A0C2.putString("edit_profile_entry", null);
                    AbstractC31171DnF.A13(A0C2, str3);
                    fragment5 = new ConnectFBPageFragment();
                    fragment5.setArguments(A0C2);
                    c35013Fbk.A02 = fragment5;
                }
                c35013Fbk.A01(fragment5, name5);
                return;
            case 6:
                UserSession A003 = AbstractC03270Dk.A00(c35013Fbk.A0J.A00);
                FragmentActivity fragmentActivity3 = c35013Fbk.A0G;
                C45126Jxv c45126Jxv = new C45126Jxv(C05F.A01, (String) null, (String) null, (String) null, 7);
                Integer num = C05F.A00;
                C14360o3.A0B(A003, 0);
                EIM eim = new EIM();
                eim.setArguments(AbstractC34027F0g.A00(c45126Jxv, num, "personal_to_business_conversion"));
                AbstractC31177DnL.A0w(null, eim, fragmentActivity3, A003);
                return;
            case 7:
                String name6 = A0n.name();
                Fragment fragment6 = c35013Fbk.A01;
                if (fragment6 == null) {
                    AbstractC31173DnH.A0u();
                    String str4 = c35013Fbk.A0F;
                    Bundle A0C3 = AbstractC31177DnL.A0C(str4);
                    AbstractC31171DnF.A13(A0C3, str4);
                    fragment6 = new CategorySearchFragment();
                    fragment6.setArguments(A0C3);
                    c35013Fbk.A01 = fragment6;
                }
                c35013Fbk.A01(fragment6, name6);
                return;
            case 8:
                String name7 = A0n.name();
                Fragment fragment7 = c35013Fbk.A04;
                if (fragment7 == null) {
                    AbstractC31173DnH.A0u();
                    C35788FrQ c35788FrQ = c35013Fbk.A0I;
                    BusinessInfo businessInfo = c35788FrQ.A02;
                    String str5 = c35013Fbk.A0F;
                    String str6 = c35788FrQ.A05;
                    Bundle A0E = AbstractC31174DnI.A0E(str5, 1);
                    A0E.putParcelable("business_info", businessInfo);
                    AbstractC31171DnF.A13(A0E, str5);
                    A0E.putString("edit_profile_entry", null);
                    A0E.putString("page_access_token", null);
                    A0E.putString("error_message", str6);
                    fragment7 = new ELV();
                    fragment7.setArguments(A0E);
                    c35013Fbk.A04 = fragment7;
                }
                c35013Fbk.A01(fragment7, name7);
                return;
            case 9:
                String name8 = A0n.name();
                Fragment fragment8 = c35013Fbk.A08;
                if (fragment8 == null) {
                    Bundle A004 = C35013Fbk.A00(c35013Fbk);
                    AbstractC31173DnH.A0u();
                    fragment8 = new C53Z();
                    fragment8.setArguments(A004);
                    c35013Fbk.A08 = fragment8;
                }
                c35013Fbk.A01(fragment8, name8);
                return;
            case 10:
                String name9 = A0n.name();
                C95P.A00(C023409i.A0A.A03(new C36698GFt(c35013Fbk)), "business_conversion_flow_navigator").A02();
                Bundle A005 = C35013Fbk.A00(c35013Fbk);
                AbstractC31175DnJ.A0R();
                AbstractC31171DnF.A12(A005, "IgSessionManager.LOGGED_OUT_TOKEN");
                EKF ekf = new EKF();
                ekf.setArguments(A005);
                c35013Fbk.A01(ekf, name9);
                return;
            case 11:
                String name10 = A0n.name();
                Fragment fragment9 = c35013Fbk.A0B;
                if (fragment9 == null) {
                    Bundle A006 = C35013Fbk.A00(c35013Fbk);
                    AbstractC31172DnG.A1A();
                    fragment9 = new ENu();
                    fragment9.setArguments(A006);
                    c35013Fbk.A0B = fragment9;
                }
                c35013Fbk.A01(fragment9, name10);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                String name11 = A0n.name();
                Fragment fragment10 = c35013Fbk.A0C;
                if (fragment10 == null) {
                    Bundle A007 = C35013Fbk.A00(c35013Fbk);
                    AbstractC31173DnH.A0u();
                    fragment10 = new ELJ();
                    fragment10.setArguments(A007);
                    c35013Fbk.A0C = fragment10;
                }
                c35013Fbk.A01(fragment10, name11);
                return;
            case 14:
                String name12 = A0n.name();
                Bundle A008 = C35013Fbk.A00(c35013Fbk);
                AbstractC31173DnH.A0u();
                InterfaceC37222GaX interfaceC37222GaX = c35013Fbk.A0H;
                String str7 = ((BusinessConversionActivity) interfaceC37222GaX).A04;
                boolean contains = AbstractC16830sb.A07(EnumC151596s5.A05, EnumC151596s5.A06).contains(interfaceC37222GaX.B77());
                A008.putString("user_email", str7);
                A008.putBoolean("is_creator", contains);
                ELZ elz = new ELZ();
                elz.setArguments(A008);
                c35013Fbk.A07 = elz;
                c35013Fbk.A01(elz, name12);
                return;
            case Process.SIGTERM /* 15 */:
                String name13 = A0n.name();
                AbstractC12990ll abstractC12990ll = c35013Fbk.A0J.A00;
                boolean A01 = C35792FrU.A01(AbstractC03270Dk.A00(abstractC12990ll), false);
                Fragment fragment11 = c35013Fbk.A0A;
                if (fragment11 == null || A01) {
                    Bundle A009 = C35013Fbk.A00(c35013Fbk);
                    SparseArray sparseArray = new SparseArray();
                    sparseArray.put(R.id.safety_step_handler, new C35917Ftb(c35013Fbk));
                    fragment11 = AbstractC31174DnI.A0P().A00(A009, sparseArray, c35013Fbk.A0H.B77(), AbstractC03270Dk.A00(abstractC12990ll));
                    c35013Fbk.A0A = fragment11;
                }
                c35013Fbk.A01(fragment11, name13);
                return;
            case 16:
                String name14 = A0n.name();
                Fragment fragment12 = c35013Fbk.A06;
                if (fragment12 == null) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "conversion");
                    AbstractC31173DnH.A0u();
                    fragment12 = new OnboardingCheckListFragment();
                    fragment12.setArguments(A0b);
                    c35013Fbk.A06 = fragment12;
                }
                c35013Fbk.A01(fragment12, name14);
                return;
            case 17:
                InterfaceC53722dB A0010 = AbstractC54852fj.A00();
                if (A0010 != 0) {
                    A0010.E4f();
                    A0010.EfI(C1QO.A0E);
                }
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "conversion");
                C34650FOi c34650FOi = c35013Fbk.A0D;
                if (A0010 != 0) {
                    fragmentActivity = (FragmentActivity) A0010;
                } else {
                    fragmentActivity = c35013Fbk.A0G;
                }
                UserSession A0011 = AbstractC03270Dk.A00(c35013Fbk.A0J.A00);
                InterfaceC37222GaX interfaceC37222GaX2 = c35013Fbk.A0H;
                InterfaceC11380iw interfaceC11380iw = new InterfaceC11380iw() { // from class: X.Fty
                    public static final String __redex_internal_original_name = "BusinessConversionFlowNavigator$$ExternalSyntheticLambda0";

                    @Override // X.InterfaceC11380iw
                    public final String getModuleName() {
                        return "professional_dashboard";
                    }
                };
                C14360o3.A0B(A0011, 0);
                C006802i.A0p.markerStart(962537714);
                AbstractC167007dF.A0J().postDelayed(new RunnableC36806GKf(A0011), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                C62862tP A0O = AbstractC31172DnG.A0O(fragmentActivity, interfaceC11380iw, A0011);
                AbstractC192798gL A04 = C192108fB.A04(A0011, "com.instagram.pro_home.action", A1G);
                C32393EOu.A00(A04, c34650FOi, interfaceC37222GaX2, A0O, 0);
                C1GJ.A03(A04);
                FragmentActivity fragmentActivity4 = c35013Fbk.A0G;
                if (A0010 != 0) {
                    fragmentActivity4.finish();
                    return;
                } else {
                    AbstractC10360h2 supportFragmentManager = fragmentActivity4.getSupportFragmentManager();
                    supportFragmentManager.A0r(new C55551Oll(0, c35013Fbk, supportFragmentManager));
                    return;
                }
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        if (A0n() == null) {
            CnD(null);
            AbstractC18680vv session = getSession();
            if ((session instanceof UserSession) && C17060sy.A01.A01((UserSession) session).CQw()) {
                EnumC151596s5 enumC151596s5 = this.A02;
                if (enumC151596s5 == null) {
                    C14360o3.A0F("_flowType");
                    throw C00O.createAndThrow();
                }
                if (enumC151596s5 == EnumC151596s5.A04) {
                    C193328hC A0H = AbstractC31171DnF.A0H(this);
                    A0H.A0s(false);
                    A0H.A0t(false);
                    A0H.A0A(2131952944);
                    A0H.A09(2131952943);
                    AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35452Fk9.A00(this, 16), A0H);
                }
            }
        }
    }

    public final void A0p(Bundle bundle, boolean z) {
        ConversionStep conversionStep;
        A01(bundle, this);
        A02(this);
        EnumC151596s5 enumC151596s5 = this.A02;
        if (enumC151596s5 == null) {
            C14360o3.A0F("_flowType");
        } else if ((enumC151596s5 == EnumC151596s5.A04 || enumC151596s5 == EnumC151596s5.A03) && A0n() == ConversionStep.A08) {
            C35034Fc7 c35034Fc7 = this.A01;
            if (c35034Fc7 != null) {
                AbstractC18680vv session = getSession();
                C14360o3.A0B(session, 0);
                ImmutableList.Builder builder = new ImmutableList.Builder();
                if (C18U.A06(C06090Tz.A05, session, 36316684381852267L)) {
                    conversionStep = ConversionStep.A0E;
                } else {
                    conversionStep = ConversionStep.A0A;
                }
                AbstractC31180DnO.A1P(builder, conversionStep);
                c35034Fc7.A03(AbstractC31172DnG.A0K(builder));
                A03(this, z);
                return;
            }
            C14360o3.A0F("conversionLogic");
        } else {
            C35034Fc7 c35034Fc72 = this.A01;
            if (c35034Fc72 != null) {
                c35034Fc72.A02();
                A03(this, z);
                return;
            }
            C14360o3.A0F("conversionLogic");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.GZG
    public final String BLC() {
        String A02 = AbstractC03270Dk.A02(getSession());
        if (A02 == null) {
            return "";
        }
        return A02;
    }

    @Override // X.InterfaceC37222GaX
    public final void CnD(Bundle bundle) {
        A01(bundle, this);
        A02(this);
        C35034Fc7 c35034Fc7 = this.A01;
        if (c35034Fc7 == null) {
            C14360o3.A0F("conversionLogic");
            throw C00O.createAndThrow();
        }
        c35034Fc7.A02();
        A03(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    @Override // X.InterfaceC37222GaX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EL3(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.activity.BusinessConversionActivity.EL3(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (AbstractC167007dF.A1Z(this.A0G)) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0154. Please report as an issue. */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ImmutableList.Builder builder;
        EnumC33376Ep9 enumC33376Ep9;
        ConversionStep conversionStep;
        BusinessConversionStep businessConversionStep;
        ConversionStep conversionStep2;
        ConversionStep conversionStep3;
        ImmutableList A00;
        BusinessConversionFlowStatus businessConversionFlowStatus;
        String str;
        C35130FeX c35130FeX;
        PageSelectionOverrideData pageSelectionOverrideData;
        BusinessInfo businessInfo;
        int A002 = C0f9.A00(-2126359644);
        InterfaceC09390do interfaceC09390do = this.A0D;
        int i = ((BaseBundle) interfaceC09390do.getValue()).getInt("business_account_flow");
        for (EnumC151596s5 enumC151596s5 : EnumC151596s5.values()) {
            if (enumC151596s5.A00 == i) {
                this.A02 = enumC151596s5;
                boolean z = ((BaseBundle) interfaceC09390do.getValue()).getBoolean("only_show_nux_screens", false);
                boolean z2 = ((BaseBundle) interfaceC09390do.getValue()).getBoolean(AbstractC43591JPw.A00(470), false);
                if (bundle != null) {
                    businessConversionFlowStatus = (BusinessConversionFlowStatus) AbstractC153636vY.A00(bundle, BusinessConversionFlowStatus.class, "conversion_flow_status");
                } else {
                    EnumC151596s5 enumC151596s52 = this.A02;
                    if (enumC151596s52 == null) {
                        str = "_flowType";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    boolean A1P = AbstractC167007dF.A1P(((C35788FrQ) this.A09.getValue()).A08, -1);
                    C14360o3.A0B(getSession(), 5);
                    switch (enumC151596s52.ordinal()) {
                        case 0:
                            builder = new ImmutableList.Builder();
                            if (!A1P) {
                                conversionStep2 = ConversionStep.A09;
                                AbstractC31180DnO.A1P(builder, conversionStep2);
                            }
                            conversionStep3 = ConversionStep.A04;
                            businessConversionStep = new BusinessConversionStep(EnumC33376Ep9.A03, conversionStep3);
                            builder.add((Object) businessConversionStep);
                            A00 = AbstractC31172DnG.A0K(builder);
                            businessConversionFlowStatus = new BusinessConversionFlowStatus(A00);
                            break;
                        case 1:
                            builder = new ImmutableList.Builder();
                            if (!A1P) {
                                conversionStep2 = ConversionStep.A06;
                                AbstractC31180DnO.A1P(builder, conversionStep2);
                            }
                            conversionStep3 = ConversionStep.A04;
                            businessConversionStep = new BusinessConversionStep(EnumC33376Ep9.A03, conversionStep3);
                            builder.add((Object) businessConversionStep);
                            A00 = AbstractC31172DnG.A0K(builder);
                            businessConversionFlowStatus = new BusinessConversionFlowStatus(A00);
                            break;
                        case 2:
                            A00 = AbstractC35046FcJ.A00();
                            businessConversionFlowStatus = new BusinessConversionFlowStatus(A00);
                            break;
                        case 3:
                        case 8:
                            builder = new ImmutableList.Builder();
                            conversionStep3 = ConversionStep.A0C;
                            businessConversionStep = new BusinessConversionStep(EnumC33376Ep9.A03, conversionStep3);
                            builder.add((Object) businessConversionStep);
                            A00 = AbstractC31172DnG.A0K(builder);
                            businessConversionFlowStatus = new BusinessConversionFlowStatus(A00);
                            break;
                        case 4:
                        case 6:
                        case 7:
                        default:
                            throw new UnsupportedOperationException();
                        case 5:
                            if (z) {
                                builder = new ImmutableList.Builder();
                                ConversionStep conversionStep4 = ConversionStep.A0I;
                                enumC33376Ep9 = EnumC33376Ep9.A03;
                                builder.add((Object) new BusinessConversionStep(enumC33376Ep9, conversionStep4));
                                conversionStep = ConversionStep.A03;
                            } else {
                                builder = new ImmutableList.Builder();
                                if (z2) {
                                    AbstractC31180DnO.A1P(builder, ConversionStep.A0D);
                                }
                                ConversionStep conversionStep5 = ConversionStep.A09;
                                enumC33376Ep9 = EnumC33376Ep9.A03;
                                builder.add((Object) new BusinessConversionStep(enumC33376Ep9, conversionStep5));
                                builder.add((Object) new BusinessConversionStep(enumC33376Ep9, ConversionStep.A04));
                                conversionStep = ConversionStep.A0F;
                            }
                            businessConversionStep = new BusinessConversionStep(enumC33376Ep9, conversionStep);
                            builder.add((Object) businessConversionStep);
                            A00 = AbstractC31172DnG.A0K(builder);
                            businessConversionFlowStatus = new BusinessConversionFlowStatus(A00);
                            break;
                        case 9:
                            builder = new ImmutableList.Builder();
                            conversionStep3 = ConversionStep.A0G;
                            businessConversionStep = new BusinessConversionStep(EnumC33376Ep9.A03, conversionStep3);
                            builder.add((Object) businessConversionStep);
                            A00 = AbstractC31172DnG.A0K(builder);
                            businessConversionFlowStatus = new BusinessConversionFlowStatus(A00);
                            break;
                    }
                }
                InterfaceC09390do interfaceC09390do2 = this.A0F;
                interfaceC09390do2.getValue();
                C35034Fc7 c35034Fc7 = new C35034Fc7(businessConversionFlowStatus);
                this.A01 = c35034Fc7;
                str = "conversionLogic";
                c35034Fc7.A01.add(new C34398FEo(this));
                C35034Fc7 c35034Fc72 = this.A01;
                if (c35034Fc72 != null) {
                    c35034Fc72.A02.add(new C34399FEp(this));
                    if (z && B77() == EnumC151596s5.A09) {
                        new C31500Dsk(AbstractC03270Dk.A00(getSession()), this).A02(new C32548EUy(this, 4), "conversion");
                    }
                    BaseBundle baseBundle = (BaseBundle) interfaceC09390do.getValue();
                    if (bundle != null && (businessInfo = (BusinessInfo) bundle.getParcelable("business_info")) != null) {
                        c35130FeX = new C35130FeX(businessInfo);
                    } else {
                        c35130FeX = new C35130FeX();
                    }
                    String string = baseBundle.getString("account_id");
                    String string2 = baseBundle.getString("user_type");
                    String string3 = baseBundle.getString("upsell_page_id");
                    C35788FrQ c35788FrQ = (C35788FrQ) this.A09.getValue();
                    c35130FeX.A0G = string;
                    c35130FeX.A0I = string2;
                    c35130FeX.A0H = string3;
                    c35788FrQ.A02 = new BusinessInfo(c35130FeX);
                    if (bundle == null || (pageSelectionOverrideData = (PageSelectionOverrideData) bundle.getParcelable("EXTRA_FB_OVERRIDE_DATA")) == null) {
                        pageSelectionOverrideData = (PageSelectionOverrideData) getIntent().getParcelableExtra("EXTRA_FB_OVERRIDE_DATA");
                    }
                    this.A03 = pageSelectionOverrideData;
                    ((C35013Fbk) this.A0E.getValue()).A0E = this.A03;
                    super.onCreate(bundle);
                    C14360o3.A0B(AbstractC03270Dk.A00(((C34404FEu) interfaceC09390do2.getValue()).A00), 0);
                    getSupportFragmentManager().A0u(new C35758Fqv(new C35929Ftn(this, 0), 3), this, "page_linking_request");
                    C0f9.A07(-1954870128, A002);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        throw AbstractC166987dD.A12("Unsupported BusinessAccountFlowType");
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(780452469);
        super.onResume();
        C36007Fv5.A00().A03(getSession(), null);
        if (this.A06) {
            CnD(null);
            this.A06 = false;
        } else if (this.A05) {
            A0p(null, true);
            this.A05 = false;
        }
        C0f9.A07(-51052771, A00);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
