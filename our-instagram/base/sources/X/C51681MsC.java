package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.instagram.common.typedurl.ImageUrl;
import org.webrtc.RendererCommon;

/* renamed from: X.MsC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51681MsC extends C0T6 {
    public final float A00;
    public final int A01;
    public final long A02;
    public final GridItemType A03;
    public final ImageUrl A04;
    public final OKK A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final RendererCommon.ScalingType A0B;
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51681MsC) {
                C51681MsC c51681MsC = (C51681MsC) obj;
                if (!C14360o3.A0K(this.A09, c51681MsC.A09) || !C14360o3.A0K(this.A04, c51681MsC.A04) || this.A0I != c51681MsC.A0I || this.A0H != c51681MsC.A0H || this.A0K != c51681MsC.A0K || this.A0N != c51681MsC.A0N || this.A0E != c51681MsC.A0E || this.A0F != c51681MsC.A0F || !C14360o3.A0K(this.A05, c51681MsC.A05) || !C14360o3.A0K(this.A08, c51681MsC.A08) || this.A0B != c51681MsC.A0B || this.A06 != c51681MsC.A06 || Float.compare(this.A00, c51681MsC.A00) != 0 || this.A0C != c51681MsC.A0C || this.A0G != c51681MsC.A0G || this.A0L != c51681MsC.A0L || this.A0J != c51681MsC.A0J || this.A0M != c51681MsC.A0M || this.A0D != c51681MsC.A0D || !C14360o3.A0K(this.A0A, c51681MsC.A0A) || this.A03 != c51681MsC.A03 || this.A02 != c51681MsC.A02 || this.A01 != c51681MsC.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = (AbstractC166997dE.A0K(this.A08, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0I, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A09)))))))) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31;
        int intValue = this.A06.intValue();
        switch (intValue) {
            case 1:
                str = "COMPACT";
                break;
            case 2:
                str = "BADGE";
                break;
            default:
                str = "REGULAR";
                break;
        }
        return (AbstractC25236BEt.A01(this.A02, AbstractC166997dE.A0J(this.A03, (AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0C, AbstractC166997dE.A00(AbstractC25231BEo.A0H(str, intValue, A0K), this.A00))))))) + AbstractC167017dG.A0O(this.A0A)) * 31)) + this.A01) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallParticipantViewModel(participantId=");
        A1C.append(this.A09);
        A1C.append(", avatarUrl=");
        A1C.append(this.A04);
        A1C.append(", showBackground=");
        A1C.append(this.A0I);
        A1C.append(", showAvatar=");
        A1C.append(this.A0H);
        A1C.append(", showMuted=");
        A1C.append(this.A0K);
        A1C.append(", showVideo=");
        A1C.append(this.A0N);
        A1C.append(", enableTouch=");
        A1C.append(this.A0E);
        A1C.append(", enableViewTap=");
        A1C.append(this.A0F);
        A1C.append(", attachVideo=");
        A1C.append(this.A05);
        A1C.append(", cellContentDescription=");
        A1C.append(this.A08);
        A1C.append(", scalingType=");
        A1C.append(this.A0B);
        A1C.append(", muteIndicatorStyle=");
        Integer num = this.A06;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "COMPACT";
                    break;
                case 2:
                    str = "BADGE";
                    break;
                default:
                    str = "REGULAR";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", avatarSizeRatio=");
        A1C.append(this.A00);
        A1C.append(", attachInstructionText=");
        A1C.append(this.A0C);
        A1C.append(", scaleInstructionText=");
        A1C.append(this.A0G);
        A1C.append(", showReconnectingBackground=");
        A1C.append(this.A0L);
        A1C.append(", showCellOutline=");
        A1C.append(this.A0J);
        A1C.append(", showScreenShareButton=");
        A1C.append(this.A0M);
        A1C.append(", darkenBackgroundForLegibility=");
        A1C.append(this.A0D);
        A1C.append(", textBelowAvatar=");
        A1C.append(this.A0A);
        A1C.append(", itemType=");
        A1C.append(this.A03);
        A1C.append(", id=");
        A1C.append(this.A02);
        A1C.append(", viewType=");
        A1C.append(this.A01);
        A1C.append(", extras=");
        return AbstractC167017dG.A0o(null, A1C);
    }

    public /* synthetic */ C51681MsC(GridItemType gridItemType, ImageUrl imageUrl, OKK okk, Integer num, String str, String str2, String str3, RendererCommon.ScalingType scalingType, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        long j;
        Integer num2 = num;
        float f2 = f;
        String str4 = str3;
        RendererCommon.ScalingType scalingType2 = (i2 & 1024) != 0 ? null : scalingType;
        num2 = (i2 & C3OO.FLAG_MOVED) != 0 ? C05F.A00 : num2;
        f2 = (i2 & 4096) != 0 ? 0.5f : f2;
        boolean A1U = AbstractC25226BEj.A1U(i2 & 8192, z7);
        boolean A1U2 = AbstractC25226BEj.A1U(i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, z8);
        boolean A1U3 = AbstractC25226BEj.A1U(32768 & i2, z9);
        boolean A1U4 = AbstractC25226BEj.A1U(65536 & i2, z10);
        boolean A1U5 = AbstractC25226BEj.A1U(131072 & i2, z11);
        boolean A1U6 = AbstractC25226BEj.A1U(262144 & i2, z12);
        str4 = (524288 & i2) != 0 ? null : str4;
        if ((2097152 & i2) != 0) {
            j = Long.parseLong(str);
        } else {
            j = 0;
        }
        AbstractC167017dG.A1P(str, imageUrl);
        C14360o3.A0B(num2, 12);
        this.A09 = str;
        this.A04 = imageUrl;
        this.A0I = z;
        this.A0H = z2;
        this.A0K = z3;
        this.A0N = z4;
        this.A0E = z5;
        this.A0F = z6;
        this.A05 = okk;
        this.A08 = str2;
        this.A0B = scalingType2;
        this.A06 = num2;
        this.A00 = f2;
        this.A0C = A1U;
        this.A0G = A1U2;
        this.A0L = A1U3;
        this.A0J = A1U4;
        this.A0M = A1U5;
        this.A0D = A1U6;
        this.A0A = str4;
        this.A03 = gridItemType;
        this.A02 = j;
        this.A01 = i;
        this.A07 = MSX.A0Z(z4 ? 1 : 0);
    }
}
