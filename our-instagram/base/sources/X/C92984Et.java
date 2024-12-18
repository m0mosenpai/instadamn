package X;

import java.util.List;

/* renamed from: X.4Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92984Et extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final EnumC92974Es A04;
    public final List A05;
    public final List A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92984Et) {
                C92984Et c92984Et = (C92984Et) obj;
                if (this.A04 != c92984Et.A04 || this.A03 != c92984Et.A03 || this.A07 != c92984Et.A07 || this.A00 != c92984Et.A00 || this.A01 != c92984Et.A01 || !C14360o3.A0K(this.A06, c92984Et.A06) || this.A02 != c92984Et.A02 || !C14360o3.A0K(this.A05, c92984Et.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A04.hashCode() * 31;
        long j = this.A03;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = 1237;
        if (this.A07) {
            i2 = 1231;
        }
        return ((((((((((i + i2) * 31) + this.A00) * 31) + this.A01) * 31) + this.A06.hashCode()) * 31) + this.A02) * 31) + this.A05.hashCode();
    }

    public C92984Et(EnumC92974Es enumC92974Es, List list, List list2, int i, int i2, int i3, long j, boolean z) {
        this.A04 = enumC92974Es;
        this.A03 = j;
        this.A07 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = list;
        this.A02 = i3;
        this.A05 = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C92984Et() {
        /*
            r10 = this;
            X.4Es r1 = X.EnumC92974Es.A0A
            r7 = 0
            r4 = 0
            X.0sl r2 = X.C16930sl.A00
            r0 = r10
            r3 = r2
            r5 = r4
            r6 = r4
            r9 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92984Et.<init>():void");
    }
}
