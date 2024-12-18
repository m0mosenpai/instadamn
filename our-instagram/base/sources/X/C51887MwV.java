package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;

/* renamed from: X.MwV */
/* loaded from: classes9.dex */
public final class C51887MwV extends C0T6 implements InterfaceC57855PlL {
    public boolean A00;
    public final float A01;
    public final EffectAttribution A02;
    public final PickerConfiguration A03;
    public final CameraAREffect A04;
    public final CameraAREffect A05;
    public final CameraAREffect A06;
    public final EnumC53279NhH A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static /* synthetic */ C51887MwV A01(EffectAttribution effectAttribution, C51887MwV c51887MwV, List list, List list2, List list3, int i, boolean z) {
        return A00(effectAttribution, null, null, null, null, null, c51887MwV, null, null, null, null, null, null, null, list, null, list2, null, list3, 0.0f, i, false, false, false, false, false, false, false, false, false, z, false, false, false);
    }

    public static /* synthetic */ C51887MwV A05(EnumC53279NhH enumC53279NhH, C51887MwV c51887MwV, Integer num, String str, int i) {
        return A00(null, null, null, null, null, enumC53279NhH, c51887MwV, null, null, num, null, null, str, null, null, null, null, null, null, 0.0f, i, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public static /* synthetic */ C51887MwV A08(C51887MwV c51887MwV, String str) {
        return A00(null, null, null, null, null, null, c51887MwV, null, null, null, null, null, str, null, null, null, null, null, null, 0.0f, -4097, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51887MwV) {
                C51887MwV c51887MwV = (C51887MwV) obj;
                if (!C14360o3.A0K(this.A0G, c51887MwV.A0G) || !C14360o3.A0K(this.A0I, c51887MwV.A0I) || !C14360o3.A0K(this.A04, c51887MwV.A04) || this.A09 != c51887MwV.A09 || this.A0B != c51887MwV.A0B || !C14360o3.A0K(this.A0H, c51887MwV.A0H) || !C14360o3.A0K(this.A0F, c51887MwV.A0F) || this.A00 != c51887MwV.A00 || !C14360o3.A0K(this.A0J, c51887MwV.A0J) || !C14360o3.A0K(this.A05, c51887MwV.A05) || !C14360o3.A0K(this.A06, c51887MwV.A06) || !C14360o3.A0K(this.A0D, c51887MwV.A0D) || !C14360o3.A0K(this.A0C, c51887MwV.A0C) || this.A0L != c51887MwV.A0L || this.A0M != c51887MwV.A0M || this.A07 != c51887MwV.A07 || !C14360o3.A0K(this.A03, c51887MwV.A03) || this.A0U != c51887MwV.A0U || !C14360o3.A0K(this.A02, c51887MwV.A02) || Float.compare(this.A01, c51887MwV.A01) != 0 || this.A0K != c51887MwV.A0K || this.A0T != c51887MwV.A0T || this.A0S != c51887MwV.A0S || !C14360o3.A0K(this.A0E, c51887MwV.A0E) || this.A0R != c51887MwV.A0R || this.A0Q != c51887MwV.A0Q || this.A0A != c51887MwV.A0A || this.A0N != c51887MwV.A0N || this.A0V != c51887MwV.A0V || this.A0P != c51887MwV.A0P || !C14360o3.A0K(this.A08, c51887MwV.A08) || this.A0O != c51887MwV.A0O) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = (AbstractC166997dE.A0J(this.A0I, AbstractC166987dD.A0G(this.A0G)) + AbstractC167017dG.A0M(this.A04)) * 31;
        Integer num = this.A09;
        int A0L = AbstractC167017dG.A0L(num, AbstractC54168Nx4.A00(num), A0J);
        Integer num2 = this.A0B;
        int A0D = AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0R, (AbstractC167007dF.A0D(this.A0S, AbstractC167007dF.A0D(this.A0T, AbstractC167007dF.A0D(this.A0K, AbstractC166997dE.A00((AbstractC167007dF.A0D(this.A0U, (AbstractC166997dE.A0J(this.A07, AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0L, AbstractC166997dE.A0K(this.A0C, (((((AbstractC166997dE.A0J(this.A0J, AbstractC167007dF.A0D(this.A00, AbstractC166997dE.A0J(this.A0F, AbstractC166997dE.A0J(this.A0H, AbstractC167017dG.A0L(num2, AbstractC54169Nx5.A00(num2), A0L))))) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31)))) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31, this.A01)))) + AbstractC167017dG.A0O(this.A0E)) * 31));
        Integer num3 = this.A0A;
        return AbstractC166987dD.A0K(this.A0O, (AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0V, AbstractC167007dF.A0D(this.A0N, AbstractC167017dG.A0L(num3, AbstractC54167Nx3.A00(num3), A0D)))) + AbstractC166997dE.A0I(this.A08)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallArEffectsModel(effects=");
        A1C.append(this.A0G);
        A1C.append(", presetAvatarEffects=");
        A1C.append(this.A0I);
        A1C.append(", avatarEffect=");
        A1C.append(this.A04);
        A1C.append(", avatarQueryState=");
        Integer num = this.A09;
        if (num != null) {
            str = AbstractC54168Nx4.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", effectLoadingState=");
        Integer num2 = this.A0B;
        if (num2 != null) {
            str2 = AbstractC54169Nx5.A00(num2);
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", multipeerEffects=");
        A1C.append(this.A0H);
        A1C.append(", avatarBackgrounds=");
        A1C.append(this.A0F);
        A1C.append(", isSoloBackgroundsApplied=");
        A1C.append(this.A00);
        A1C.append(", soloBackgroundEffects=");
        A1C.append(this.A0J);
        A1C.append(", currentEffect=");
        A1C.append(this.A05);
        A1C.append(", selectedEffect=");
        A1C.append(this.A06);
        A1C.append(", currentFilter=");
        A1C.append(this.A0D);
        A1C.append(", currentAvatarBackground=");
        A1C.append(this.A0C);
        A1C.append(", isAvatarMode=");
        A1C.append(this.A0L);
        A1C.append(", isAvatarModeAllowed=");
        A1C.append(this.A0M);
        A1C.append(", currentTab=");
        A1C.append(this.A07);
        A1C.append(", pickerConfiguration=");
        A1C.append(this.A03);
        A1C.append(", showConfigurationPicker=");
        A1C.append(this.A0U);
        A1C.append(", licensing=");
        A1C.append(this.A02);
        A1C.append(", arSliderProgress=");
        A1C.append(this.A01);
        A1C.append(", inSliderMode=");
        A1C.append(this.A0K);
        A1C.append(", requireTestLinkConsent=");
        A1C.append(this.A0T);
        A1C.append(", requirePeerConsent=");
        A1C.append(this.A0S);
        A1C.append(", peerConsentText=");
        A1C.append(this.A0E);
        A1C.append(", requireFlmConsentForEffect=");
        A1C.append(this.A0R);
        A1C.append(", multiPeerCapabilityEnabled=");
        A1C.append(this.A0Q);
        A1C.append(", currentEffectMenu=");
        Integer num3 = this.A0A;
        if (num3 != null) {
            str3 = AbstractC54167Nx3.A00(num3);
        } else {
            str3 = "null";
        }
        A1C.append(str3);
        A1C.append(", isCameraOn=");
        A1C.append(this.A0N);
        A1C.append(", showEffectGalleryEntryPoint=");
        A1C.append(this.A0V);
        A1C.append(", isFlmDenied=");
        A1C.append(this.A0P);
        A1C.append(", avatarLoaderProgress=");
        A1C.append(this.A08);
        A1C.append(", isE2eeMandated=");
        return AbstractC25236BEt.A0a(A1C, this.A0O);
    }

    public C51887MwV(EffectAttribution effectAttribution, PickerConfiguration pickerConfiguration, CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2, CameraAREffect cameraAREffect3, EnumC53279NhH enumC53279NhH, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A0G = list;
        this.A0I = list2;
        this.A04 = cameraAREffect;
        this.A09 = num;
        this.A0B = num2;
        this.A0H = list3;
        this.A0F = list4;
        this.A00 = z;
        this.A0J = list5;
        this.A05 = cameraAREffect2;
        this.A06 = cameraAREffect3;
        this.A0D = str;
        this.A0C = str2;
        this.A0L = z2;
        this.A0M = z3;
        this.A07 = enumC53279NhH;
        this.A03 = pickerConfiguration;
        this.A0U = z4;
        this.A02 = effectAttribution;
        this.A01 = f;
        this.A0K = z5;
        this.A0T = z6;
        this.A0S = z7;
        this.A0E = str3;
        this.A0R = z8;
        this.A0Q = z9;
        this.A0A = num3;
        this.A0N = z10;
        this.A0V = z11;
        this.A0P = z12;
        this.A08 = num4;
        this.A0O = z13;
    }

    public static /* synthetic */ C51887MwV A00(EffectAttribution effectAttribution, PickerConfiguration pickerConfiguration, CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2, CameraAREffect cameraAREffect3, EnumC53279NhH enumC53279NhH, C51887MwV c51887MwV, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, float f, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = z13;
        Integer num5 = num4;
        boolean z15 = z12;
        String str4 = str2;
        String str5 = str;
        List list6 = list5;
        CameraAREffect cameraAREffect4 = cameraAREffect3;
        List list7 = list4;
        CameraAREffect cameraAREffect5 = cameraAREffect2;
        boolean z16 = z4;
        List list8 = list3;
        boolean z17 = z;
        Integer num6 = num2;
        Integer num7 = num;
        boolean z18 = z7;
        boolean z19 = z2;
        CameraAREffect cameraAREffect6 = cameraAREffect;
        boolean z20 = z6;
        boolean z21 = z11;
        List list9 = list2;
        List list10 = list;
        boolean z22 = z8;
        boolean z23 = z3;
        PickerConfiguration pickerConfiguration2 = pickerConfiguration;
        boolean z24 = z10;
        boolean z25 = z9;
        float f2 = f;
        boolean z26 = z5;
        String str6 = str3;
        EnumC53279NhH enumC53279NhH2 = enumC53279NhH;
        Integer num8 = num3;
        if ((i & 1) != 0) {
            list10 = c51887MwV.A0G;
        }
        if ((i & 2) != 0) {
            list9 = c51887MwV.A0I;
        }
        if ((i & 4) != 0) {
            cameraAREffect6 = c51887MwV.A04;
        }
        if ((i & 8) != 0) {
            num7 = c51887MwV.A09;
        }
        if ((i & 16) != 0) {
            num6 = c51887MwV.A0B;
        }
        if ((i & 32) != 0) {
            list8 = c51887MwV.A0H;
        }
        if ((i & 64) != 0) {
            list7 = c51887MwV.A0F;
        }
        if ((i & 128) != 0) {
            z17 = c51887MwV.A00;
        }
        if ((i & 256) != 0) {
            list6 = c51887MwV.A0J;
        }
        if ((i & 512) != 0) {
            cameraAREffect5 = c51887MwV.A05;
        }
        if ((i & 1024) != 0) {
            cameraAREffect4 = c51887MwV.A06;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            str5 = c51887MwV.A0D;
        }
        if ((i & 4096) != 0) {
            str4 = c51887MwV.A0C;
        }
        if ((i & 8192) != 0) {
            z19 = c51887MwV.A0L;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z23 = c51887MwV.A0M;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            enumC53279NhH2 = c51887MwV.A07;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            pickerConfiguration2 = c51887MwV.A03;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z16 = c51887MwV.A0U;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            effectAttribution = c51887MwV.A02;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            f2 = c51887MwV.A01;
        }
        if ((i & 1048576) != 0) {
            z26 = c51887MwV.A0K;
        }
        if ((i & 2097152) != 0) {
            z20 = c51887MwV.A0T;
        }
        if ((i & 4194304) != 0) {
            z18 = c51887MwV.A0S;
        }
        if ((i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            str6 = c51887MwV.A0E;
        }
        if ((i & 16777216) != 0) {
            z22 = c51887MwV.A0R;
        }
        if ((i & 33554432) != 0) {
            z25 = c51887MwV.A0Q;
        }
        if ((i & 67108864) != 0) {
            num8 = c51887MwV.A0A;
        }
        if ((i & 134217728) != 0) {
            z24 = c51887MwV.A0N;
        }
        if ((i & 268435456) != 0) {
            z21 = c51887MwV.A0V;
        }
        if ((i & 536870912) != 0) {
            z15 = c51887MwV.A0P;
        }
        if ((i & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0) {
            num5 = c51887MwV.A08;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            z14 = c51887MwV.A0O;
        }
        C14360o3.A0B(list10, 0);
        AbstractC25234BEr.A0j(1, list9, num7, num6, list8);
        AbstractC167007dF.A1I(list7, 6, list6);
        AbstractC25229BEm.A1O(str4, 12, enumC53279NhH2);
        C14360o3.A0B(num8, 26);
        boolean z27 = z25;
        boolean z28 = z24;
        boolean z29 = z21;
        boolean z30 = z15;
        boolean z31 = z14;
        return new C51887MwV(effectAttribution, pickerConfiguration2, cameraAREffect6, cameraAREffect5, cameraAREffect4, enumC53279NhH2, num7, num6, num8, num5, str5, str4, str6, list10, list9, list8, list7, list6, f2, z17, z19, z23, z16, z26, z20, z18, z22, z27, z28, z29, z30, z31);
    }
}
