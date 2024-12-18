package X;

/* renamed from: X.Mwm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51904Mwm extends C0T6 implements InterfaceC57856PlM {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
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
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51904Mwm) {
                C51904Mwm c51904Mwm = (C51904Mwm) obj;
                if (this.A0C != c51904Mwm.A0C || this.A0I != c51904Mwm.A0I || this.A0J != c51904Mwm.A0J || this.A02 != c51904Mwm.A02 || this.A0L != c51904Mwm.A0L || this.A08 != c51904Mwm.A08 || this.A06 != c51904Mwm.A06 || this.A07 != c51904Mwm.A07 || this.A0U != c51904Mwm.A0U || this.A0P != c51904Mwm.A0P || this.A0V != c51904Mwm.A0V || this.A0W != c51904Mwm.A0W || this.A0H != c51904Mwm.A0H || this.A0Y != c51904Mwm.A0Y || this.A0O != c51904Mwm.A0O || this.A0S != c51904Mwm.A0S || this.A0M != c51904Mwm.A0M || this.A03 != c51904Mwm.A03 || this.A0N != c51904Mwm.A0N || this.A0K != c51904Mwm.A0K || this.A0T != c51904Mwm.A0T || this.A0B != c51904Mwm.A0B || this.A0Z != c51904Mwm.A0Z || this.A01 != c51904Mwm.A01 || this.A00 != c51904Mwm.A00 || this.A0G != c51904Mwm.A0G || !C14360o3.A0K(this.A04, c51904Mwm.A04) || !C14360o3.A0K(this.A05, c51904Mwm.A05) || this.A0F != c51904Mwm.A0F || this.A0D != c51904Mwm.A0D || this.A0R != c51904Mwm.A0R || this.A0A != c51904Mwm.A0A || this.A0E != c51904Mwm.A0E || this.A0X != c51904Mwm.A0X || this.A0Q != c51904Mwm.A0Q || this.A09 != c51904Mwm.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C51904Mwm c51904Mwm, Object obj) {
        boolean z = c51904Mwm.A09;
        C14360o3.A0B(obj, 3);
        return z;
    }

    public final int hashCode() {
        String str;
        int A0C;
        int A0D = AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0I, AbstractC25225BEi.A08(this.A0C)));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "BACK";
                break;
            case 2:
                str = "DUAL";
                break;
            default:
                str = "FRONT";
                break;
        }
        int A0D2 = AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0S, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0Y, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0W, AbstractC167007dF.A0D(this.A0V, AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0L, AbstractC25231BEo.A0H(str, intValue, A0D))))))))))))));
        Integer num = this.A03;
        if (num == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num, AbstractC54163Nwz.A00(num));
        }
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0X, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0F, (((AbstractC167007dF.A0D(this.A0G, (((AbstractC167007dF.A0D(this.A0Z, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0T, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0N, (A0D2 + A0C) * 31))))) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31))))))));
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallControlsViewModel(disableControls=");
        A1C.append(this.A0C);
        A1C.append(", isAudioOn=");
        A1C.append(this.A0I);
        A1C.append(", isCameraOn=");
        A1C.append(this.A0J);
        A1C.append(", cameraMode=");
        Integer num = this.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "BACK";
                    break;
                case 2:
                    str = "DUAL";
                    break;
                default:
                    str = "FRONT";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", showAudioOutputRouteButton=");
        A1C.append(this.A0L);
        A1C.append(", cameraButtonChangeDisabled=");
        A1C.append(this.A08);
        A1C.append(", audioOutputChangeDisabled=");
        A1C.append(this.A06);
        A1C.append(", audioOutputIsEarpiece=");
        A1C.append(this.A07);
        A1C.append(", showMinimize=");
        A1C.append(this.A0U);
        A1C.append(", showCoWatch=");
        A1C.append(this.A0P);
        A1C.append(", showScreenCapture=");
        A1C.append(this.A0V);
        A1C.append(", showScreenShare=");
        A1C.append(this.A0W);
        A1C.append(", hideControls=");
        A1C.append(this.A0H);
        A1C.append(", showSwitchCamera=");
        A1C.append(this.A0Y);
        A1C.append(", showCloseButton=");
        A1C.append(this.A0O);
        A1C.append(", showDetailsButton=");
        A1C.append(this.A0S);
        A1C.append(", showBottomControls=");
        A1C.append(this.A0M);
        A1C.append(", tooltip=");
        Integer num2 = this.A03;
        if (num2 != null) {
            str2 = AbstractC54163Nwz.A00(num2);
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", showCameraButton=");
        A1C.append(this.A0N);
        A1C.append(", showAudioButton=");
        A1C.append(this.A0K);
        A1C.append(", showLeaveRoomButton=");
        A1C.append(this.A0T);
        A1C.append(", debugEnabled=");
        A1C.append(this.A0B);
        A1C.append(", switchCameraEnabled=");
        A1C.append(this.A0Z);
        A1C.append(", systemTopInset=");
        A1C.append(this.A01);
        A1C.append(", systemBottomInset=");
        A1C.append(this.A00);
        A1C.append(", forceShowHeaderTitle=");
        A1C.append(this.A0G);
        A1C.append(", headerTitle=");
        A1C.append(this.A04);
        A1C.append(", subHeaderTitle=");
        A1C.append(this.A05);
        A1C.append(", forceHideHeader=");
        A1C.append(this.A0F);
        A1C.append(", enableCoWatchButton=");
        A1C.append(this.A0D);
        A1C.append(", showCowatchE2EEDisclaimer=");
        A1C.append(this.A0R);
        A1C.append(", centerBottomControls=");
        A1C.append(this.A0A);
        A1C.append(", enableCombinedPeopleButton=");
        A1C.append(this.A0E);
        A1C.append(", showSendMessageButton=");
        A1C.append(this.A0X);
        A1C.append(", showCombinedPeopleButton=");
        A1C.append(this.A0Q);
        A1C.append(", canAutoHideCallControls=");
        return AbstractC25236BEt.A0a(A1C, this.A09);
    }

    public C51904Mwm(Integer num, Integer num2, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30) {
        this.A0C = z;
        this.A0I = z2;
        this.A0J = z3;
        this.A02 = num;
        this.A0L = z4;
        this.A08 = z5;
        this.A06 = z6;
        this.A07 = z7;
        this.A0U = z8;
        this.A0P = z9;
        this.A0V = z10;
        this.A0W = z11;
        this.A0H = z12;
        this.A0Y = z13;
        this.A0O = z14;
        this.A0S = z15;
        this.A0M = z16;
        this.A03 = num2;
        this.A0N = z17;
        this.A0K = z18;
        this.A0T = z19;
        this.A0B = z20;
        this.A0Z = z21;
        this.A01 = i;
        this.A00 = i2;
        this.A0G = z22;
        this.A04 = str;
        this.A05 = str2;
        this.A0F = z23;
        this.A0D = z24;
        this.A0R = z25;
        this.A0A = z26;
        this.A0E = z27;
        this.A0X = z28;
        this.A0Q = z29;
        this.A09 = z30;
    }

    public C51904Mwm() {
        this(C05F.A00, null, null, null, 0, 0, true, false, false, false, false, false, true, false, false, false, false, false, true, true, false, true, true, true, false, false, true, false, false, true, false, false, true, false, false, false);
    }
}
