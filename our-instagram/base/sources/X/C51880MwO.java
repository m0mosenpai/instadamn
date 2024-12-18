package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.MwO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51880MwO extends C0T6 implements InterfaceC57855PlL {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
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
            if (obj instanceof C51880MwO) {
                C51880MwO c51880MwO = (C51880MwO) obj;
                if (this.A0F != c51880MwO.A0F || this.A04 != c51880MwO.A04 || this.A08 != c51880MwO.A08 || this.A0V != c51880MwO.A0V || this.A07 != c51880MwO.A07 || this.A05 != c51880MwO.A05 || this.A06 != c51880MwO.A06 || this.A0I != c51880MwO.A0I || this.A0L != c51880MwO.A0L || this.A0M != c51880MwO.A0M || this.A0Q != c51880MwO.A0Q || this.A03 != c51880MwO.A03 || this.A0E != c51880MwO.A0E || this.A0S != c51880MwO.A0S || this.A0R != c51880MwO.A0R || this.A0T != c51880MwO.A0T || this.A0U != c51880MwO.A0U || this.A0J != c51880MwO.A0J || this.A00 != c51880MwO.A00 || this.A0H != c51880MwO.A0H || this.A0P != c51880MwO.A0P || this.A0Y != c51880MwO.A0Y || this.A0W != c51880MwO.A0W || this.A0C != c51880MwO.A0C || this.A0B != c51880MwO.A0B || this.A0O != c51880MwO.A0O || !C14360o3.A0K(this.A01, c51880MwO.A01) || this.A0D != c51880MwO.A0D || this.A0G != c51880MwO.A0G || this.A0N != c51880MwO.A0N || this.A0A != c51880MwO.A0A || this.A09 != c51880MwO.A09 || this.A0X != c51880MwO.A0X || !C14360o3.A0K(this.A02, c51880MwO.A02) || this.A0K != c51880MwO.A0K || this.A0Z != c51880MwO.A0Z) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A0J, (AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A0T, AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0S, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0V, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A0F))))))))))))))))) + AbstractC53644Nnp.A00()) * 31);
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "LOBBY_PREVIEW";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "LOBBY";
                break;
        }
        return AbstractC166987dD.A0K(this.A0Z, AbstractC167007dF.A0D(this.A0K, (AbstractC167007dF.A0D(this.A0X, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0D, (AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0W, AbstractC167007dF.A0D(this.A0Y, AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0H, AbstractC25231BEo.A0H(str, intValue, A0D)))))))) + AbstractC167017dG.A0O(this.A01)) * 31)))))) + AbstractC25227BEk.A07(this.A02)) * 31));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallControlsModel(controlsEnabled=");
        A1C.append(this.A0F);
        A1C.append(", audioOn=");
        A1C.append(this.A04);
        A1C.append(", cameraOn=");
        A1C.append(this.A08);
        A1C.append(", showAudioOutputRouteButton=");
        A1C.append(this.A0V);
        A1C.append(", cameraButtonChangeDisabled=");
        A1C.append(this.A07);
        A1C.append(", audioOutputChangeDisabled=");
        A1C.append(this.A05);
        A1C.append(", audioOutputIsEarpiece=");
        A1C.append(this.A06);
        A1C.append(", frontFacingCamera=");
        A1C.append(this.A0I);
        A1C.append(", isDualCameraOn=");
        A1C.append(this.A0L);
        A1C.append(", isDualCameraSupported=");
        A1C.append(this.A0M);
        A1C.append(", minimizingEnabled=");
        A1C.append(this.A0Q);
        A1C.append(", addingUsersEnabled=");
        A1C.append(this.A03);
        A1C.append(", coWatchEnabled=");
        A1C.append(this.A0E);
        A1C.append(", screenCaptureEnabled=");
        A1C.append(this.A0S);
        A1C.append(", photoboothHaloTooltipEnabled=");
        A1C.append(this.A0R);
        A1C.append(", screenShareEnabled=");
        A1C.append(this.A0T);
        A1C.append(", screenShareHaloTooltipEnabled=");
        A1C.append(this.A0U);
        A1C.append(", avatarTooltipEnabled=");
        A1C.append(false);
        A1C.append(", isAvatarApplied=");
        A1C.append(this.A0J);
        A1C.append(", lobbyState=");
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "LOBBY_PREVIEW";
                    break;
                case 2:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
                default:
                    str = "LOBBY";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", detailsEnabled=");
        A1C.append(this.A0H);
        A1C.append(", isSwitchCameraFacingSupported=");
        A1C.append(this.A0P);
        A1C.append(", tooltipsEnabled=");
        A1C.append(this.A0Y);
        A1C.append(", showE2eeLabel=");
        A1C.append(this.A0W);
        A1C.append(", canToggleVideo=");
        A1C.append(this.A0C);
        A1C.append(", canToggleAudio=");
        A1C.append(this.A0B);
        A1C.append(", isPipSupported=");
        A1C.append(this.A0O);
        A1C.append(", callTarget=");
        A1C.append(this.A01);
        A1C.append(", canUseCoWatch=");
        A1C.append(this.A0D);
        A1C.append(", cowatchPlaybackActive=");
        A1C.append(this.A0G);
        A1C.append(", isE2eeEnabled=");
        A1C.append(this.A0N);
        A1C.append(", canAutoHideCallControls=");
        A1C.append(this.A0A);
        A1C.append(", canAddUsers=");
        A1C.append(this.A09);
        A1C.append(", showParticipantList=");
        A1C.append(this.A0X);
        A1C.append(", localCallId=");
        A1C.append(this.A02);
        A1C.append(", isCreatorAiEmbodiment=");
        A1C.append(this.A0K);
        A1C.append(", isUserCreatedAIEmbodiment=");
        return AbstractC25236BEt.A0a(A1C, this.A0Z);
    }

    public C51880MwO(Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33) {
        this.A0F = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A0V = z4;
        this.A07 = z5;
        this.A05 = z6;
        this.A06 = z7;
        this.A0I = z8;
        this.A0L = z9;
        this.A0M = z10;
        this.A0Q = z11;
        this.A03 = z12;
        this.A0E = z13;
        this.A0S = z14;
        this.A0R = z15;
        this.A0T = z16;
        this.A0U = z17;
        this.A0J = z18;
        this.A00 = num;
        this.A0H = z19;
        this.A0P = z20;
        this.A0Y = z21;
        this.A0W = z22;
        this.A0C = z23;
        this.A0B = z24;
        this.A0O = z25;
        this.A01 = str;
        this.A0D = z26;
        this.A0G = z27;
        this.A0N = z28;
        this.A0A = z29;
        this.A09 = z30;
        this.A0X = z31;
        this.A02 = str2;
        this.A0K = z32;
        this.A0Z = z33;
    }
}
