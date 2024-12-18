package X;

/* renamed from: X.7oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173637oF extends C0T6 {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;
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
    public final Integer A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C173637oF) {
                C173637oF c173637oF = (C173637oF) obj;
                if (this.A0G != c173637oF.A0G || this.A0D != c173637oF.A0D || this.A0E != c173637oF.A0E || this.A09 != c173637oF.A09 || this.A02 != c173637oF.A02 || this.A06 != c173637oF.A06 || this.A0A != c173637oF.A0A || this.A0C != c173637oF.A0C || this.A0B != c173637oF.A0B || this.A03 != c173637oF.A03 || this.A05 != c173637oF.A05 || this.A04 != c173637oF.A04 || this.A07 != c173637oF.A07 || this.A08 != c173637oF.A08 || this.A0F != c173637oF.A0F || this.A0H != c173637oF.A0H || !C14360o3.A0K(this.A01, c173637oF.A01) || !C14360o3.A0K(this.A00, c173637oF.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int hashCode2;
        Integer num = this.A0G;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "CONFIG_V2";
                    break;
                case 2:
                    str = "OTHER";
                    break;
                default:
                    str = "CONFIG_V1";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A0D) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0E) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A02) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A06) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0A) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0C) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0B) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        int i19 = 1237;
        if (this.A03) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A05) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        int i23 = 1237;
        if (this.A04) {
            i23 = 1231;
        }
        int i24 = (i22 + i23) * 31;
        int i25 = 1237;
        if (this.A07) {
            i25 = 1231;
        }
        int i26 = (i24 + i25) * 31;
        int i27 = 1237;
        if (this.A08) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        int i29 = 1237;
        if (this.A0F) {
            i29 = 1231;
        }
        int i30 = (i28 + i29) * 31;
        int i31 = 1237;
        if (this.A0H) {
            i31 = 1231;
        }
        int i32 = (i30 + i31) * 31;
        Integer num2 = this.A01;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i33 = (i32 + hashCode2) * 31;
        Integer num3 = this.A00;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return i33 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ReelsXpostContentConfig(configSource=");
        Integer num = this.A0G;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "CONFIG_V2";
                    break;
                case 2:
                    str = "OTHER";
                    break;
                default:
                    str = "CONFIG_V1";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", supportRemixV1=");
        sb.append(this.A0D);
        sb.append(", supportRemixV2=");
        sb.append(this.A0E);
        sb.append(", supportOAReuseCheck=");
        sb.append(this.A09);
        sb.append(", supportAddYoursSticker=");
        sb.append(this.A02);
        sb.append(", supportEmojiSliderSticker=");
        sb.append(this.A06);
        sb.append(", supportPollSticker=");
        sb.append(this.A0A);
        sb.append(", supportQuizSticker=");
        sb.append(this.A0C);
        sb.append(", supportQuestionSticker=");
        sb.append(this.A0B);
        sb.append(", supportBrandedContent=");
        sb.append(this.A03);
        sb.append(", supportCollaboration=");
        sb.append(this.A05);
        sb.append(", supportCloseFriendsAudience=");
        sb.append(this.A04);
        sb.append(", supportFollowersOnlyAudience=");
        sb.append(this.A07);
        sb.append(", supportGroupProfile=");
        sb.append(this.A08);
        sb.append(", supportVisualReply=");
        sb.append(this.A0F);
        sb.append(", supportPanavision=");
        sb.append(this.A0H);
        sb.append(", videoMinLengthMs=");
        sb.append(this.A01);
        sb.append(", videoMaxLengthMs=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C173637oF(Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.A0G = num;
        this.A0D = z;
        this.A0E = z2;
        this.A09 = z3;
        this.A02 = z4;
        this.A06 = z5;
        this.A0A = z6;
        this.A0C = z7;
        this.A0B = z8;
        this.A03 = z9;
        this.A05 = z10;
        this.A04 = z11;
        this.A07 = z12;
        this.A08 = z13;
        this.A0F = z14;
        this.A0H = z15;
        this.A01 = num2;
        this.A00 = num3;
    }
}
