package X;

import com.facebook.R;
import com.instagram.user.model.User;

/* renamed from: X.3hN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79723hN extends C0T6 {
    public final float A00;
    public final float A01;
    public final C9BH A02;
    public final C206189Bb A03;
    public final C9C6 A04;
    public final C102824kJ A05;
    public final InterfaceC65702y7 A06;
    public final C86493tM A07;
    public final C76623c7 A08;
    public final C79613hC A09;
    public final C79703hL A0A;
    public final C79673hI A0B;
    public final C79553h6 A0C;
    public final C116355Oo A0D;
    public final C75113Zb A0E;
    public final EnumC79303gb A0F;
    public final EnumC74373Vt A0G;
    public final User A0H;
    public final String A0I;
    public final String A0J;
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
    public final C3x9 A0U;
    public final C96444Vc A0V;
    public final String A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C79723hN) {
                C79723hN c79723hN = (C79723hN) obj;
                if (!C14360o3.A0K(this.A0J, c79723hN.A0J) || !C14360o3.A0K(this.A0H, c79723hN.A0H) || this.A0R != c79723hN.A0R || this.A0P != c79723hN.A0P || this.A0L != c79723hN.A0L || this.A0c != c79723hN.A0c || this.A0a != c79723hN.A0a || this.A0O != c79723hN.A0O || this.A0N != c79723hN.A0N || this.A0Q != c79723hN.A0Q || this.A0S != c79723hN.A0S || this.A0b != c79723hN.A0b || this.A0Y != c79723hN.A0Y || this.A0K != c79723hN.A0K || this.A0Z != c79723hN.A0Z || this.A0X != c79723hN.A0X || Float.compare(this.A00, c79723hN.A00) != 0 || !C14360o3.A0K(this.A0V, c79723hN.A0V) || Float.compare(this.A01, c79723hN.A01) != 0 || this.A0M != c79723hN.A0M || !C14360o3.A0K(this.A0U, c79723hN.A0U) || !C14360o3.A0K(this.A0I, c79723hN.A0I) || !C14360o3.A0K(this.A0W, c79723hN.A0W) || this.A0G != c79723hN.A0G || this.A0F != c79723hN.A0F || !C14360o3.A0K(this.A03, c79723hN.A03) || !C14360o3.A0K(this.A0D, c79723hN.A0D) || !C14360o3.A0K(this.A05, c79723hN.A05) || !C14360o3.A0K(this.A0C, c79723hN.A0C) || !C14360o3.A0K(this.A04, c79723hN.A04) || !C14360o3.A0K(this.A02, c79723hN.A02) || !C14360o3.A0K(this.A07, c79723hN.A07) || !C14360o3.A0K(this.A09, c79723hN.A09) || !C14360o3.A0K(this.A0B, c79723hN.A0B) || !C14360o3.A0K(this.A06, c79723hN.A06) || !C14360o3.A0K(this.A0E, c79723hN.A0E) || !C14360o3.A0K(this.A08, c79723hN.A08) || !C14360o3.A0K(this.A0A, c79723hN.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaViewUiState(mediaId=");
        sb.append(this.A0J);
        sb.append(", user=");
        sb.append(this.A0H);
        sb.append(AbstractC111324zv.A00(568));
        sb.append(this.A0R);
        sb.append(", isReelMedia=");
        sb.append(this.A0P);
        sb.append(", isClipMedia=");
        sb.append(this.A0L);
        sb.append(", isIGTVMedia=");
        sb.append(this.A0c);
        sb.append(", isAdVideo=");
        sb.append(this.A0a);
        sb.append(", isPlayableMedia=");
        sb.append(this.A0O);
        sb.append(", isMediaCovered=");
        sb.append(this.A0N);
        sb.append(AbstractC111324zv.A00(567));
        sb.append(this.A0Q);
        sb.append(", isViolatingBrandedContentPolicy=");
        sb.append(this.A0S);
        sb.append(", isEventReminderEnabled=");
        sb.append(this.A0b);
        sb.append(", hasPeopleTags=");
        sb.append(this.A0Y);
        sb.append(", hasAllProductTags=");
        sb.append(this.A0K);
        sb.append(", hasProductTags=");
        sb.append(this.A0Z);
        sb.append(", hasMediaCroppingInfo=");
        sb.append(this.A0X);
        sb.append(AbstractC43591JPw.A00(56));
        sb.append(this.A00);
        sb.append(MSV.A00(644));
        sb.append(this.A0V);
        sb.append(", renderAspectRatio=");
        sb.append(this.A01);
        sb.append(", isClipMediaEligibleForFullAspectRatioRender=");
        sb.append(this.A0M);
        sb.append(", clipsMetadata=");
        sb.append(this.A0U);
        sb.append(", colorPreviewHex=");
        sb.append(this.A0I);
        sb.append(", standaloneFundraiserId=");
        sb.append(this.A0W);
        sb.append(", videoIconState=");
        sb.append(this.A0G);
        sb.append(", videoPlayButtonState=");
        sb.append(this.A0F);
        sb.append(", viewSimilarUiState=");
        sb.append(this.A03);
        sb.append(", mediaOverlayBlurredCoverUiState=");
        sb.append(this.A0D);
        sb.append(", informBloksPayload=");
        sb.append(this.A05);
        sb.append(", mediaVideoScrubberUiState=");
        sb.append(this.A0C);
        sb.append(", mediaLargerCTABufferUiState=");
        sb.append(this.A04);
        sb.append(", brandedContentViolationBannerUiState=");
        sb.append(this.A02);
        sb.append(", floatingBubblesUiState=");
        sb.append(this.A07);
        sb.append(", textOverlayUiState=");
        sb.append(this.A09);
        sb.append(", midNudgeUiState=");
        sb.append(this.A0B);
        sb.append(AbstractC111324zv.A00(1422));
        sb.append(this.A06);
        sb.append(AbstractC43591JPw.A00(57));
        sb.append(this.A0E);
        sb.append(", immutableMedia=");
        sb.append(this.A08);
        sb.append(", actions=");
        sb.append(this.A0A);
        sb.append(')');
        return sb.toString();
    }

    public final int A00() {
        C79703hL c79703hL = this.A0A;
        InterfaceC16820sZ interfaceC16820sZ = c79703hL.A0E;
        if (((Boolean) interfaceC16820sZ.invoke()).booleanValue() && ((Boolean) c79703hL.A0D.invoke()).booleanValue()) {
            return R.dimen.audio_page_audio_filter_tooltip_vertical_offset;
        }
        if (((Boolean) c79703hL.A0D.invoke()).booleanValue()) {
            return R.dimen.abc_alert_dialog_button_dimen;
        }
        if (!((Boolean) interfaceC16820sZ.invoke()).booleanValue()) {
            return R.dimen.abc_button_padding_horizontal_material;
        }
        return R.dimen.ad4ad_button_bottom_margin;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = this.A0J.hashCode() * 31;
        User user = this.A0H;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int i2 = (hashCode12 + hashCode) * 31;
        int i3 = 1237;
        if (this.A0R) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0P) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0L) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0c) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0a) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0O) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0N) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0Q) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        int i19 = 1237;
        if (this.A0S) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0b) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        int i23 = 1237;
        if (this.A0Y) {
            i23 = 1231;
        }
        int i24 = (i22 + i23) * 31;
        int i25 = 1237;
        if (this.A0K) {
            i25 = 1231;
        }
        int i26 = (i24 + i25) * 31;
        int i27 = 1237;
        if (this.A0Z) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        int i29 = 1237;
        if (this.A0X) {
            i29 = 1231;
        }
        int floatToIntBits = (((i28 + i29) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C96444Vc c96444Vc = this.A0V;
        if (c96444Vc == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c96444Vc.hashCode();
        }
        int floatToIntBits2 = (((floatToIntBits + hashCode2) * 31) + Float.floatToIntBits(this.A01)) * 31;
        int i30 = 1237;
        if (this.A0M) {
            i30 = 1231;
        }
        int i31 = (floatToIntBits2 + i30) * 31;
        C3x9 c3x9 = this.A0U;
        if (c3x9 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c3x9.hashCode();
        }
        int i32 = (i31 + hashCode3) * 31;
        String str = this.A0I;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i33 = (i32 + hashCode4) * 31;
        String str2 = this.A0W;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int hashCode13 = (((((((i33 + hashCode5) * 31) + this.A0G.hashCode()) * 31) + this.A0F.hashCode()) * 31) + this.A03.hashCode()) * 31;
        C116355Oo c116355Oo = this.A0D;
        if (c116355Oo == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c116355Oo.hashCode();
        }
        int i34 = (hashCode13 + hashCode6) * 31;
        C102824kJ c102824kJ = this.A05;
        if (c102824kJ == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c102824kJ.hashCode();
        }
        int i35 = (i34 + hashCode7) * 31;
        C79553h6 c79553h6 = this.A0C;
        if (c79553h6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c79553h6.hashCode();
        }
        int i36 = (i35 + hashCode8) * 31;
        C9C6 c9c6 = this.A04;
        if (c9c6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = c9c6.hashCode();
        }
        int hashCode14 = (((i36 + hashCode9) * 31) + this.A02.hashCode()) * 31;
        C86493tM c86493tM = this.A07;
        if (c86493tM == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c86493tM.hashCode();
        }
        int i37 = (hashCode14 + hashCode10) * 31;
        C79613hC c79613hC = this.A09;
        if (c79613hC == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = c79613hC.hashCode();
        }
        int i38 = (i37 + hashCode11) * 31;
        C79673hI c79673hI = this.A0B;
        if (c79673hI != null) {
            i = c79673hI.hashCode();
        }
        return ((((((((i38 + i) * 31) + this.A06.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A0A.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0099, code lost:
    
        if (((java.lang.Boolean) r14.A0B.invoke()).booleanValue() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C79723hN(X.C9BH r4, X.C206189Bb r5, X.C9C6 r6, X.C3x9 r7, X.C102824kJ r8, X.InterfaceC65702y7 r9, X.C86493tM r10, X.C96444Vc r11, X.C76623c7 r12, X.C79613hC r13, X.C79703hL r14, X.C79673hI r15, X.C79553h6 r16, X.C116355Oo r17, X.C75113Zb r18, X.EnumC79303gb r19, X.EnumC74373Vt r20, com.instagram.user.model.User r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, float r25, float r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            r3 = this;
            r0 = 35
            X.C14360o3.A0B(r9, r0)
            r3.<init>()
            r0 = r22
            r3.A0J = r0
            r0 = r21
            r3.A0H = r0
            r0 = r27
            r3.A0R = r0
            r0 = r28
            r3.A0P = r0
            r0 = r29
            r3.A0L = r0
            r0 = r30
            r3.A0c = r0
            r0 = r31
            r3.A0a = r0
            r0 = r32
            r3.A0O = r0
            r0 = r33
            r3.A0N = r0
            r0 = r34
            r3.A0Q = r0
            r0 = r35
            r3.A0S = r0
            r0 = r36
            r3.A0b = r0
            r2 = r37
            r3.A0Y = r2
            r0 = r38
            r3.A0K = r0
            r1 = r39
            r3.A0Z = r1
            r0 = r40
            r3.A0X = r0
            r0 = r25
            r3.A00 = r0
            r3.A0V = r11
            r0 = r26
            r3.A01 = r0
            r0 = r41
            r3.A0M = r0
            r3.A0U = r7
            r0 = r23
            r3.A0I = r0
            r0 = r24
            r3.A0W = r0
            r0 = r20
            r3.A0G = r0
            r0 = r19
            r3.A0F = r0
            r3.A03 = r5
            r0 = r17
            r3.A0D = r0
            r3.A05 = r8
            r0 = r16
            r3.A0C = r0
            r3.A04 = r6
            r3.A02 = r4
            r3.A07 = r10
            r3.A09 = r13
            r3.A0B = r15
            r3.A06 = r9
            r0 = r18
            r3.A0E = r0
            r3.A08 = r12
            r3.A0A = r14
            if (r37 != 0) goto L9b
            if (r39 != 0) goto L9b
            X.0sZ r0 = r14.A0B
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L9c
        L9b:
            r0 = 1
        L9c:
            r3.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79723hN.<init>(X.9BH, X.9Bb, X.9C6, X.3x9, X.4kJ, X.2y7, X.3tM, X.4Vc, X.3c7, X.3hC, X.3hL, X.3hI, X.3h6, X.5Oo, X.3Zb, X.3gb, X.3Vt, com.instagram.user.model.User, java.lang.String, java.lang.String, java.lang.String, float, float, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
