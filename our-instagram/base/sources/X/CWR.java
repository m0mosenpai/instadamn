package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;

/* loaded from: classes5.dex */
public final class CWR {
    public final int A00;
    public final C7N A01;
    public final EnumC53326Ni5 A02;
    public final CWH A03;
    public final C28270CdF A04;
    public final CVW A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWR) {
                CWR cwr = (CWR) obj;
                if (this.A02 != cwr.A02 || !C14360o3.A0K(this.A04, cwr.A04) || this.A0G != cwr.A0G || this.A0I != cwr.A0I || this.A0E != cwr.A0E || this.A0K != cwr.A0K || this.A0J != cwr.A0J || this.A0Q != cwr.A0Q || this.A0R != cwr.A0R || this.A0F != cwr.A0F || this.A06 != cwr.A06 || this.A01 != cwr.A01 || this.A08 != cwr.A08 || this.A07 != cwr.A07 || !C14360o3.A0K(this.A0C, cwr.A0C) || !C14360o3.A0K(this.A0B, cwr.A0B) || !C14360o3.A0K(this.A05, cwr.A05) || this.A0H != cwr.A0H || this.A0M != cwr.A0M || this.A00 != cwr.A00 || !C14360o3.A0K(this.A03, cwr.A03) || this.A0N != cwr.A0N || this.A0O != cwr.A0O || this.A0L != cwr.A0L || this.A0A != cwr.A0A || this.A0D != cwr.A0D || this.A09 != cwr.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        String str4;
        int A0D = AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0G, ((AbstractC166987dD.A0G(this.A02) * 31) + AbstractC167017dG.A0M(this.A04)) * 31))))))));
        Integer num = this.A06;
        switch (num.intValue()) {
            case 0:
                str = "APPLY";
                break;
            case 1:
                str = "DONE";
                break;
            default:
                str = "SEND";
                break;
        }
        int A0J = AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0L(num, str, A0D));
        int intValue = this.A08.intValue();
        switch (intValue) {
            case 1:
                str2 = "EDIT";
                break;
            case 2:
                str2 = "EMU_EDIT";
                break;
            default:
                str2 = "CREATION";
                break;
        }
        int A0H = AbstractC25231BEo.A0H(str2, intValue, A0J);
        Integer num2 = this.A07;
        int A0K = AbstractC166997dE.A0K(this.A0B, ((AbstractC167017dG.A0L(num2, AbstractC27728CKv.A00(num2), A0H) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31);
        int A00 = AbstractC53644Nnp.A00();
        int A05 = AbstractC25225BEi.A05(AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0N, ((((AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0H, AbstractC166997dE.A0J(this.A05, (A0K + A00) * 31))) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31))), A00);
        int intValue2 = this.A0A.intValue();
        if (1 != intValue2) {
            str3 = "None";
        } else {
            str3 = "MEmuPregen";
        }
        int A0D2 = (AbstractC167007dF.A0D(this.A0D, AbstractC25231BEo.A0H(str3, intValue2, A05) * 31) + A00) * 31;
        int intValue3 = this.A09.intValue();
        switch (intValue3) {
            case 1:
                str4 = "MEmu";
                break;
            case 2:
                str4 = "MEmuCleared";
                break;
            default:
                str4 = "Never";
                break;
        }
        return A0D2 + AbstractC25226BEj.A02(str4, intValue3);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineCreateParams(source=");
        A1C.append(this.A02);
        AbstractC25235BEs.A1N(A1C, ", sourceStringOverride=");
        A1C.append(", promptParams=");
        A1C.append(this.A04);
        A1C.append(", isEditingEnabled=");
        A1C.append(this.A0G);
        A1C.append(", isFlashEnabled=");
        A1C.append(this.A0I);
        A1C.append(", isAnimateEnabled=");
        A1C.append(this.A0E);
        A1C.append(", isMEmuEnabled=");
        A1C.append(this.A0K);
        A1C.append(", isIgPersonalizationEnabled=");
        A1C.append(this.A0J);
        A1C.append(", useGridForResults=");
        A1C.append(this.A0Q);
        A1C.append(", useVScrollGridForSuggestions=");
        A1C.append(this.A0R);
        A1C.append(", isDarkModeForced=");
        A1C.append(this.A0F);
        A1C.append(", actionButtonText=");
        switch (this.A06.intValue()) {
            case 0:
                str = "APPLY";
                break;
            case 1:
                str = "DONE";
                break;
            default:
                str = "SEND";
                break;
        }
        A1C.append(str);
        A1C.append(", imageAspectRatio=");
        A1C.append(this.A01);
        A1C.append(", launchWithFeature=");
        switch (this.A08.intValue()) {
            case 1:
                str2 = "EDIT";
                break;
            case 2:
                str2 = "EMU_EDIT";
                break;
            default:
                str2 = "CREATION";
                break;
        }
        A1C.append(str2);
        A1C.append(", imagineIceBreakerType=");
        A1C.append(AbstractC27728CKv.A00(this.A07));
        AbstractC25235BEs.A1N(A1C, ", appSessionId=");
        A1C.append(", surfaceSessionId=");
        A1C.append(this.A0C);
        A1C.append(", bottomSheetSessionId=");
        A1C.append(this.A0B);
        AbstractC25235BEs.A1M(A1C, ", isE2EE=");
        A1C.append(", loggingParams=");
        A1C.append(this.A05);
        A1C.append(", isEmuEditEnabled=");
        A1C.append(this.A0H);
        A1C.append(", isTapToSelectEnabled=");
        A1C.append(this.A0M);
        AbstractC25235BEs.A1L(A1C, ", popoverParams=");
        A1C.append(", numberOfImagesToGenerate=");
        A1C.append(this.A00);
        A1C.append(", mediaEditParams=");
        A1C.append(this.A03);
        A1C.append(", persistSession=");
        A1C.append(this.A0N);
        A1C.append(", restoreSession=");
        A1C.append(this.A0O);
        A1C.append(", isMEmuOnlyCreation=");
        A1C.append(this.A0L);
        AbstractC25235BEs.A1M(A1C, ", keepBottomSheetOpenOnSuccess=");
        AbstractC25235BEs.A1N(A1C, ", textInputPlaceholderText=");
        A1C.append(", suggestionToResultPassthrough=");
        if (1 - this.A0A.intValue() != 0) {
            str3 = "None";
        } else {
            str3 = "MEmuPregen";
        }
        A1C.append(str3);
        AbstractC25235BEs.A1L(A1C, ", headerSubtitleText=");
        A1C.append(", enableMEmuSpotlight=");
        A1C.append(this.A0D);
        AbstractC25235BEs.A1M(A1C, ", allowBackNavWhenResultsIsInitialScreen=");
        A1C.append(", promptSummarizationStrategy=");
        switch (this.A09.intValue()) {
            case 1:
                str4 = "MEmu";
                break;
            case 2:
                str4 = "MEmuCleared";
                break;
            default:
                str4 = "Never";
                break;
        }
        return AbstractC25236BEt.A0Y(str4, A1C);
    }

    public /* synthetic */ CWR(C7N c7n, EnumC53326Ni5 enumC53326Ni5, CWH cwh, C28270CdF c28270CdF, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        String str2;
        Integer num6 = num;
        C7N c7n2 = c7n;
        Integer num7 = num2;
        Integer num8 = num3;
        String str3 = str;
        int i4 = i;
        CWH cwh2 = cwh;
        Integer num9 = num4;
        Integer num10 = num5;
        C28270CdF c28270CdF2 = (i2 & 4) != 0 ? null : c28270CdF;
        boolean A1U = AbstractC25226BEj.A1U(i2 & 8, z);
        boolean A1U2 = AbstractC25226BEj.A1U(i2 & 16, z2);
        boolean A1U3 = AbstractC25226BEj.A1U(i2 & 32, z3);
        boolean A1U4 = AbstractC25226BEj.A1U(i2 & 64, z4);
        boolean A1U5 = AbstractC25226BEj.A1U(i2 & 128, z5);
        boolean A1U6 = AbstractC25226BEj.A1U(i2 & 256, z6);
        boolean A1U7 = AbstractC25226BEj.A1U(i2 & 512, z7);
        boolean A1U8 = AbstractC25226BEj.A1U(i2 & 1024, z8);
        num6 = (i2 & C3OO.FLAG_MOVED) != 0 ? C05F.A01 : num6;
        c7n2 = (i2 & 4096) != 0 ? C7N.A03 : c7n2;
        num7 = (i2 & 8192) != 0 ? C05F.A00 : num7;
        num8 = (i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? C05F.A00 : num8;
        str3 = (i2 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? null : str3;
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            str2 = AbstractC166997dE.A0o();
        } else {
            str2 = null;
        }
        CVW cvw = (i2 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? new CVW(str2, str3) : null;
        boolean A1V = AbstractC25226BEj.A1V(i2 & 1048576, z9);
        boolean z15 = (i2 & 2097152) == 0 ? z10 : true;
        i4 = (i2 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? 4 : i4;
        cwh2 = (i2 & 16777216) != 0 ? null : cwh2;
        boolean A1U9 = AbstractC25226BEj.A1U(i2 & 33554432, z11);
        boolean A1U10 = AbstractC25226BEj.A1U(i2 & 67108864, z12);
        boolean A1U11 = AbstractC25226BEj.A1U(i2 & 134217728, z13);
        num9 = (i2 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) != 0 ? C05F.A00 : num9;
        boolean A1U12 = AbstractC25226BEj.A1U(i3 & 1, z14);
        num10 = (i3 & 4) != 0 ? C05F.A00 : num10;
        AbstractC25234BEr.A1Q(num6, c7n2, num7);
        C14360o3.A0B(num8, 15);
        C14360o3.A0B(str2, 18);
        C14360o3.A0B(cvw, 20);
        C14360o3.A0B(num9, 31);
        C14360o3.A0B(num10, 35);
        this.A02 = enumC53326Ni5;
        this.A04 = c28270CdF2;
        this.A0G = A1U;
        this.A0I = A1U2;
        this.A0E = A1U3;
        this.A0K = A1U4;
        this.A0J = A1U5;
        this.A0Q = A1U6;
        this.A0R = A1U7;
        this.A0F = A1U8;
        this.A06 = num6;
        this.A01 = c7n2;
        this.A08 = num7;
        this.A07 = num8;
        this.A0C = str3;
        this.A0B = str2;
        this.A05 = cvw;
        this.A0H = A1V;
        this.A0M = z15;
        this.A00 = i4;
        this.A03 = cwh2;
        this.A0N = A1U9;
        this.A0O = A1U10;
        this.A0L = A1U11;
        this.A0A = num9;
        this.A0D = A1U12;
        this.A09 = num10;
        this.A0P = A1U2 && !(A1U6 && A1U7);
    }
}
