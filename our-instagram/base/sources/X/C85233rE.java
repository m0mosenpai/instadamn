package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85233rE extends C0T6 {
    public final C9C6 A00;
    public final ImageUrl A01;
    public final EnumC85043qs A02;
    public final InterfaceC85193rA A03;
    public final C85083qw A04;
    public final C85103qy A05;
    public final EnumC85113qz A06;
    public final C76623c7 A07;
    public final C3r3 A08;
    public final C75113Zb A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
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

    public C85233rE(C9C6 c9c6, ImageUrl imageUrl, EnumC85043qs enumC85043qs, InterfaceC85193rA interfaceC85193rA, C85083qw c85083qw, C85103qy c85103qy, EnumC85113qz enumC85113qz, C76623c7 c76623c7, C3r3 c3r3, C75113Zb c75113Zb, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        C14360o3.A0B(enumC85043qs, 17);
        C14360o3.A0B(interfaceC85193rA, 27);
        this.A07 = c76623c7;
        this.A09 = c75113Zb;
        this.A0E = z;
        this.A0G = z2;
        this.A0L = z3;
        this.A0F = z4;
        this.A0M = z5;
        this.A0K = z6;
        this.A0H = z7;
        this.A0N = z8;
        this.A0J = z9;
        this.A0U = z10;
        this.A0V = z11;
        this.A0R = z12;
        this.A0C = str;
        this.A0Q = z13;
        this.A02 = enumC85043qs;
        this.A0W = true;
        this.A0A = num;
        this.A0B = str2;
        this.A0S = z14;
        this.A0D = str3;
        this.A04 = c85083qw;
        this.A05 = c85103qy;
        this.A08 = c3r3;
        this.A00 = c9c6;
        this.A03 = interfaceC85193rA;
        this.A06 = enumC85113qz;
        this.A0O = z15;
        this.A0T = z16;
        this.A0I = z17;
        this.A01 = imageUrl;
        this.A0P = z18;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C85233rE) {
                C85233rE c85233rE = (C85233rE) obj;
                if (!C14360o3.A0K(this.A07, c85233rE.A07) || !C14360o3.A0K(this.A09, c85233rE.A09) || this.A0E != c85233rE.A0E || this.A0G != c85233rE.A0G || this.A0L != c85233rE.A0L || this.A0F != c85233rE.A0F || this.A0M != c85233rE.A0M || this.A0K != c85233rE.A0K || this.A0H != c85233rE.A0H || this.A0N != c85233rE.A0N || this.A0J != c85233rE.A0J || this.A0U != c85233rE.A0U || this.A0V != c85233rE.A0V || this.A0R != c85233rE.A0R || !C14360o3.A0K(this.A0C, c85233rE.A0C) || this.A0Q != c85233rE.A0Q || this.A02 != c85233rE.A02 || this.A0W != c85233rE.A0W || this.A0A != c85233rE.A0A || !C14360o3.A0K(this.A0B, c85233rE.A0B) || this.A0S != c85233rE.A0S || !C14360o3.A0K(this.A0D, c85233rE.A0D) || !C14360o3.A0K(this.A04, c85233rE.A04) || !C14360o3.A0K(this.A05, c85233rE.A05) || !C14360o3.A0K(this.A08, c85233rE.A08) || !C14360o3.A0K(this.A00, c85233rE.A00) || !C14360o3.A0K(this.A03, c85233rE.A03) || this.A06 != c85233rE.A06 || this.A0O != c85233rE.A0O || this.A0T != c85233rE.A0T || this.A0I != c85233rE.A0I || !C14360o3.A0K(this.A01, c85233rE.A01) || this.A0P != c85233rE.A0P) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A07.hashCode() * 31) + this.A09.hashCode()) * 31;
        int i = 1237;
        if (this.A0E) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A0G) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0L) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0F) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0M) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0K) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0H) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0N) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0J) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        int i19 = 1237;
        if (this.A0U) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0V) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        int i23 = 1237;
        if (this.A0R) {
            i23 = 1231;
        }
        int hashCode3 = (((i22 + i23) * 31) + this.A0C.hashCode()) * 31;
        int i24 = 1237;
        if (this.A0Q) {
            i24 = 1231;
        }
        int hashCode4 = (((hashCode3 + i24) * 31) + this.A02.hashCode()) * 31;
        int i25 = 1237;
        if (this.A0W) {
            i25 = 1231;
        }
        int A00 = (((((hashCode4 + i25) * 31) + AbstractC27606CGc.A00(this.A0A)) * 31) + this.A0B.hashCode()) * 31;
        int i26 = 1237;
        if (this.A0S) {
            i26 = 1231;
        }
        int hashCode5 = (((((((((((((((A00 + i26) * 31) + this.A0D.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i27 = 1237;
        if (this.A0O) {
            i27 = 1231;
        }
        int i28 = (hashCode5 + i27) * 31;
        int i29 = 1237;
        if (this.A0T) {
            i29 = 1231;
        }
        int i30 = (i28 + i29) * 31;
        int i31 = 1237;
        if (this.A0I) {
            i31 = 1231;
        }
        int i32 = (i30 + i31) * 31;
        ImageUrl imageUrl = this.A01;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i33 = (i32 + hashCode) * 31;
        int i34 = 1237;
        if (this.A0P) {
            i34 = 1231;
        }
        return i33 + i34;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("MediaUfiUiState(immutableMedia=");
        sb.append(this.A07);
        sb.append(AbstractC43591JPw.A00(57));
        sb.append(this.A09);
        sb.append(", currentMediaHasSharingFriction=");
        sb.append(this.A0E);
        sb.append(", isLiked=");
        sb.append(this.A0G);
        sb.append(", isSaved=");
        sb.append(this.A0L);
        sb.append(", isCommentsEnabled=");
        sb.append(this.A0F);
        sb.append(", isShareEnabled=");
        sb.append(this.A0M);
        sb.append(", isSaveEnabled=");
        sb.append(this.A0K);
        sb.append(", isMediaCovered=");
        sb.append(this.A0H);
        sb.append(", isSocialUfiEnabled=");
        sb.append(this.A0N);
        sb.append(", isSandwichDotsWithoutSocialUfiEnabled=");
        sb.append(this.A0J);
        sb.append(", isLithoEligibleForSocialUfi=");
        sb.append(this.A0U);
        sb.append(", isOverlayCarouselPageIndicatorEnabled=");
        sb.append(this.A0V);
        sb.append(", shouldShowLikeCountInUfi=");
        sb.append(this.A0R);
        sb.append(AbstractC111324zv.A00(570));
        sb.append(this.A0C);
        sb.append(", shouldShowCommentCountInUfi=");
        sb.append(this.A0Q);
        sb.append(", shouldShowContentNotesNux=");
        sb.append(this.A02);
        sb.append(", shouldStartNuxButtonAnimation=");
        sb.append(this.A0W);
        sb.append(", contentNotesUFIEntryPointType=");
        Integer num = this.A0A;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = AbstractC111324zv.A00(1519);
                    break;
                case 2:
                    str = "RESHARE";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", commentCount=");
        sb.append(this.A0B);
        sb.append(", shouldShowShareCountInUfi=");
        sb.append(this.A0S);
        sb.append(", shareCount=");
        sb.append(this.A0D);
        sb.append(", carouselIndicatorUiState=");
        sb.append(this.A04);
        sb.append(", actions=");
        sb.append(this.A05);
        sb.append(", mediaVideoScrubberBottomBufferUiState=");
        sb.append(this.A08);
        sb.append(", mediaLargerCTABufferUiState=");
        sb.append(this.A00);
        sb.append(", contentNotesNuxUiState=");
        sb.append(this.A03);
        sb.append(", pressStateType=");
        sb.append(this.A06);
        sb.append(", isUFIRowAfterMediaContent=");
        sb.append(this.A0O);
        sb.append(", bugFixLazyLoaded=");
        sb.append(this.A0T);
        sb.append(", isMediaVideo=");
        sb.append(this.A0I);
        sb.append(", mediaThumbnailUrl=");
        sb.append(this.A01);
        sb.append(", isVisualSearchEnabled=");
        sb.append(this.A0P);
        sb.append(')');
        return sb.toString();
    }
}
