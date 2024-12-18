package X;

/* renamed from: X.Msl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51716Msl extends C0T6 {
    public final C50526MSf A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
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

    public C51716Msl(C50526MSf c50526MSf, Integer num, Integer num2, Integer num3, Integer num4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C14360o3.A0B(num, 5);
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A04 = num;
        this.A09 = z5;
        this.A0A = z6;
        this.A0F = z7;
        this.A0B = z8;
        this.A0C = z9;
        this.A0E = z10;
        this.A01 = num2;
        this.A02 = num3;
        this.A00 = c50526MSf;
        this.A03 = num4;
        this.A0D = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51716Msl) {
                C51716Msl c51716Msl = (C51716Msl) obj;
                if (this.A05 != c51716Msl.A05 || this.A06 != c51716Msl.A06 || this.A07 != c51716Msl.A07 || this.A08 != c51716Msl.A08 || this.A04 != c51716Msl.A04 || this.A09 != c51716Msl.A09 || this.A0A != c51716Msl.A0A || this.A0F != c51716Msl.A0F || this.A0B != c51716Msl.A0B || this.A0C != c51716Msl.A0C || this.A0E != c51716Msl.A0E || this.A01 != c51716Msl.A01 || !C14360o3.A0K(this.A02, c51716Msl.A02) || !C14360o3.A0K(this.A00, c51716Msl.A00) || this.A03 != c51716Msl.A03 || this.A0D != c51716Msl.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0C;
        String str2;
        int A0D = AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC25225BEi.A08(this.A05))));
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "Group";
                break;
            case 2:
                str = "Opal";
                break;
            default:
                str = "Individual";
                break;
        }
        int A0D2 = AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC25231BEo.A0H(str, intValue, A0D)))))));
        Integer num = this.A01;
        int i = 0;
        if (num == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num, AbstractC54210Nxo.A00(num));
        }
        int A0M = (((((A0D2 + A0C) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        Integer num2 = this.A03;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            switch (intValue2) {
                case 1:
                    str2 = "CAN_SHARE_TO_FACEBOOK";
                    break;
                case 2:
                    str2 = "DEPEND_ON_OA_EXPANSION";
                    break;
                default:
                    str2 = "NO_XPOST";
                    break;
            }
            i = AbstractC25226BEj.A02(str2, intValue2);
        }
        return AbstractC166987dD.A0K(this.A0D, (A0M + i) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ReelXpostFeatureState(hasAddYoursSticker=");
        A1C.append(this.A05);
        A1C.append(", hasBrandedContent=");
        A1C.append(this.A06);
        A1C.append(", hasCollaboration=");
        A1C.append(this.A07);
        A1C.append(", hasEmojiSliderSticker=");
        A1C.append(this.A08);
        A1C.append(", targetProfileType=");
        Integer num = this.A04;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "Group";
                    break;
                case 2:
                    str = "Opal";
                    break;
                default:
                    str = "Individual";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", hasMixMediaAudio=");
        A1C.append(this.A09);
        A1C.append(", hasPollSticker=");
        A1C.append(this.A0A);
        A1C.append(", shouldBlockCommentPollCrossPosting=");
        A1C.append(this.A0F);
        A1C.append(", hasQuestionSticker=");
        A1C.append(this.A0B);
        A1C.append(", hasQuizSticker=");
        A1C.append(this.A0C);
        A1C.append(", hasVisualComment=");
        A1C.append(this.A0E);
        A1C.append(AbstractC111324zv.A00(1397));
        Integer num2 = this.A01;
        if (num2 != null) {
            str2 = AbstractC54210Nxo.A00(num2);
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", durationMs=");
        A1C.append(this.A02);
        A1C.append(", remix=");
        A1C.append(this.A00);
        A1C.append(", oaRemix=");
        Integer num3 = this.A03;
        if (num3 != null) {
            switch (num3.intValue()) {
                case 1:
                    str3 = "CAN_SHARE_TO_FACEBOOK";
                    break;
                case 2:
                    str3 = "DEPEND_ON_OA_EXPANSION";
                    break;
                default:
                    str3 = "NO_XPOST";
                    break;
            }
        } else {
            str3 = "null";
        }
        A1C.append(str3);
        A1C.append(", hasScheduledContent=");
        return AbstractC25236BEt.A0a(A1C, this.A0D);
    }

    public C51716Msl() {
        this(null, C05F.A00, null, null, null, false, false, false, false, false, false, false, false, false, false, false);
    }
}
