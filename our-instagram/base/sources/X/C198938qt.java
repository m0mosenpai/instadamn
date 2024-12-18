package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.8qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198938qt extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public C6S5 A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public List A07;
    public List A08;
    public final HashMap A09;

    public C198938qt(C6S5 c6s5, Integer num, Integer num2, String str, HashMap hashMap, List list, List list2, int i, int i2, int i3) {
        C14360o3.A0B(list, 5);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = c6s5;
        this.A07 = list;
        this.A04 = num;
        this.A08 = list2;
        this.A09 = hashMap;
        this.A05 = num2;
        this.A06 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C198938qt) {
                C198938qt c198938qt = (C198938qt) obj;
                if (this.A02 != c198938qt.A02 || this.A01 != c198938qt.A01 || this.A00 != c198938qt.A00 || this.A03 != c198938qt.A03 || !C14360o3.A0K(this.A07, c198938qt.A07) || !C14360o3.A0K(this.A04, c198938qt.A04) || !C14360o3.A0K(this.A08, c198938qt.A08) || !C14360o3.A0K(this.A09, c198938qt.A09) || !C14360o3.A0K(this.A05, c198938qt.A05) || !C14360o3.A0K(this.A06, c198938qt.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31;
        Integer num2 = this.A05;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.A06.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C198938qt() {
        /*
            r11 = this;
            r2 = 0
            r8 = 0
            r10 = -1
            X.6S5 r1 = X.C6S5.A05
            X.0sl r6 = X.C16930sl.A00
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r4 = ""
            r0 = r11
            r3 = r2
            r7 = r6
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198938qt.<init>():void");
    }
}
