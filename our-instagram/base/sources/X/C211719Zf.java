package X;

import java.util.List;

/* renamed from: X.9Zf */
/* loaded from: classes4.dex */
public final class C211719Zf extends C0T6 {
    public final EnumC1810181d A00;
    public final EnumC1810381f A01;
    public final Integer A02;
    public final Integer A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211719Zf) {
                C211719Zf c211719Zf = (C211719Zf) obj;
                if (this.A03 != c211719Zf.A03 || !C14360o3.A0K(this.A04, c211719Zf.A04) || this.A05 != c211719Zf.A05 || this.A01 != c211719Zf.A01 || this.A00 != c211719Zf.A00 || this.A02 != c211719Zf.A02 || this.A06 != c211719Zf.A06 || this.A07 != c211719Zf.A07 || this.A08 != c211719Zf.A08 || this.A09 != c211719Zf.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C211719Zf A00(C211719Zf c211719Zf, EnumC1810181d enumC1810181d, EnumC1810381f enumC1810381f, Integer num, Integer num2, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        Integer num3 = num2;
        EnumC1810181d enumC1810181d2 = enumC1810181d;
        EnumC1810381f enumC1810381f2 = enumC1810381f;
        boolean z10 = z;
        List list2 = list;
        Integer num4 = num;
        if ((i & 1) != 0) {
            num4 = c211719Zf.A03;
        }
        if ((i & 2) != 0) {
            list2 = c211719Zf.A04;
        }
        if ((i & 4) != 0) {
            z10 = c211719Zf.A05;
        }
        if ((i & 8) != 0) {
            enumC1810381f2 = c211719Zf.A01;
        }
        if ((i & 16) != 0) {
            enumC1810181d2 = c211719Zf.A00;
        }
        if ((i & 32) != 0) {
            num3 = c211719Zf.A02;
        }
        if ((i & 64) != 0) {
            z9 = c211719Zf.A06;
        }
        if ((i & 128) != 0) {
            z8 = c211719Zf.A07;
        }
        if ((i & 256) != 0) {
            z7 = c211719Zf.A08;
        }
        if ((i & 512) != 0) {
            z6 = c211719Zf.A09;
        }
        AbstractC167017dG.A1N(num4, list2);
        C14360o3.A0B(num3, 5);
        return new C211719Zf(enumC1810181d2, enumC1810381f2, num4, num3, list2, z10, z9, z8, z7, z6);
    }

    public final int hashCode() {
        String str;
        String str2;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "REEL";
                break;
            case 2:
                str = "DIRECT";
                break;
            case 3:
                str = "UNSUPPORTED";
                break;
            default:
                str = "STORY";
                break;
        }
        int A0D = (((AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A04, (str.hashCode() + intValue) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31;
        int intValue2 = this.A02.intValue();
        switch (intValue2) {
            case 1:
                str2 = "SOUND_OFF";
                break;
            case 2:
                str2 = "HIDDEN";
                break;
            default:
                str2 = "SOUND_ON";
                break;
        }
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, (A0D + str2.hashCode() + intValue2) * 31))));
    }

    public C211719Zf(EnumC1810181d enumC1810181d, EnumC1810381f enumC1810381f, Integer num, Integer num2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = num;
        this.A04 = list;
        this.A05 = z;
        this.A01 = enumC1810381f;
        this.A00 = enumC1810181d;
        this.A02 = num2;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A09 = z5;
    }
}
