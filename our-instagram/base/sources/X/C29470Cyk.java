package X;

/* renamed from: X.Cyk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29470Cyk implements InterfaceC31154Dmy {
    public final C88 A00;
    public final C88 A01;
    public final C88 A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;

    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    @Override // X.InterfaceC30959DjG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object EKN(android.content.Context r23, X.InterfaceC30923Dia r24) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29470Cyk.EKN(android.content.Context, X.Dia):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29470Cyk) {
                C29470Cyk c29470Cyk = (C29470Cyk) obj;
                if (this.A03 != c29470Cyk.A03 || this.A05 != c29470Cyk.A05 || this.A06 != c29470Cyk.A06 || this.A01 != c29470Cyk.A01 || this.A02 != c29470Cyk.A02 || this.A04 != c29470Cyk.A04 || this.A00 != c29470Cyk.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int A0C;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "Medium";
        } else {
            str = "Large";
        }
        int A0F = AbstractC25228BEl.A0F(str, intValue);
        Integer num = this.A05;
        int A0L = AbstractC167017dG.A0L(num, CL8.A00(num), A0F);
        int intValue2 = this.A06.intValue();
        if (1 != intValue2) {
            str2 = "Flexible";
        } else {
            str2 = "Constrained";
        }
        int A0H = (((AbstractC25231BEo.A0H(str2, intValue2, A0L) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        Integer num2 = this.A04;
        if (num2 == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num2, CL7.A00(num2));
        }
        return ((A0H + A0C) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C29470Cyk(C88 c88, C88 c882, C88 c883, Integer num, Integer num2, Integer num3, Integer num4) {
        AbstractC167027dH.A13(num, num2, num3);
        this.A03 = num;
        this.A05 = num2;
        this.A06 = num3;
        this.A01 = c88;
        this.A02 = c882;
        this.A04 = num4;
        this.A00 = c883;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAIButtonVariant(buttonSize=");
        if (1 - this.A03.intValue() != 0) {
            str = "Medium";
        } else {
            str = "Large";
        }
        A1C.append(str);
        A1C.append(", buttonType=");
        A1C.append(CL8.A00(this.A05));
        A1C.append(", buttonWidthMode=");
        if (1 - this.A06.intValue() != 0) {
            str2 = "Flexible";
        } else {
            str2 = "Constrained";
        }
        A1C.append(str2);
        A1C.append(", buttonBackgroundColorOverride=");
        A1C.append(this.A01);
        A1C.append(", buttonTextColorOverride=");
        A1C.append(this.A02);
        A1C.append(", buttonTextTypeOverride=");
        Integer num = this.A04;
        if (num != null) {
            str3 = CL7.A00(num);
        } else {
            str3 = "null";
        }
        A1C.append(str3);
        A1C.append(", borderColorOverride=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
