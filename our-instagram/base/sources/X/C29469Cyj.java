package X;

/* renamed from: X.Cyj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29469Cyj implements InterfaceC31154Dmy {
    public final EnumC27424C8r A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    @Override // X.InterfaceC30959DjG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object EKN(android.content.Context r30, X.InterfaceC30923Dia r31) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29469Cyj.EKN(android.content.Context, X.Dia):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29469Cyj) {
                C29469Cyj c29469Cyj = (C29469Cyj) obj;
                if (this.A01 != c29469Cyj.A01 || this.A02 != c29469Cyj.A02 || this.A03 != c29469Cyj.A03 || this.A00 != c29469Cyj.A00) {
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
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "MEDIUM";
        } else {
            str = "LARGE";
        }
        int A0F = AbstractC25228BEl.A0F(str, intValue);
        int intValue2 = this.A02.intValue();
        if (1 != intValue2) {
            str2 = "PRIMARY";
        } else {
            str2 = "SECONDARY";
        }
        int A0H = AbstractC25231BEo.A0H(str2, intValue2, A0F);
        int intValue3 = this.A03.intValue();
        if (1 != intValue3) {
            str3 = "FLEXIBLE";
        } else {
            str3 = "CONSTRAINED";
        }
        return AbstractC166997dE.A0J(this.A00, AbstractC25231BEo.A0H(str3, intValue3, A0H) * 31);
    }

    public C29469Cyj(EnumC27424C8r enumC27424C8r, Integer num, Integer num2, Integer num3) {
        AbstractC167027dH.A13(num, num2, num3);
        C14360o3.A0B(enumC27424C8r, 5);
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A00 = enumC27424C8r;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CdsButtonVariant(buttonSize=");
        if (1 - this.A01.intValue() != 0) {
            str = "MEDIUM";
        } else {
            str = "LARGE";
        }
        A1C.append(str);
        A1C.append(", buttonType=");
        if (1 - this.A02.intValue() != 0) {
            str2 = "PRIMARY";
        } else {
            str2 = "SECONDARY";
        }
        A1C.append(str2);
        A1C.append(", buttonWidthMode=");
        if (1 - this.A03.intValue() != 0) {
            str3 = "FLEXIBLE";
        } else {
            str3 = "CONSTRAINED";
        }
        A1C.append(str3);
        AbstractC25235BEs.A1L(A1C, ", startIconName=");
        A1C.append(", startIconVariant=");
        A1C.append(this.A00);
        A1C.append(", overrides=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
