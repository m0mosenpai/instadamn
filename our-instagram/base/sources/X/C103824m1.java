package X;

import java.util.Arrays;

/* renamed from: X.4m1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103824m1 {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103824m1)) {
            return false;
        }
        C103824m1 c103824m1 = (C103824m1) obj;
        return this.A00 == c103824m1.A00 && this.A09.equals(c103824m1.A09) && C2I7.A00(this.A0A, c103824m1.A0A) && C2I7.A00(this.A0B, c103824m1.A0B) && C2I7.A00(this.A01, c103824m1.A01) && C2I7.A00(this.A08, c103824m1.A08) && this.A05.equals(c103824m1.A05) && C2I7.A00(this.A06, c103824m1.A06) && C2I7.A00(this.A07, c103824m1.A07) && this.A0C == c103824m1.A0C && C2I7.A00(this.A03, c103824m1.A03) && this.A02.equals(c103824m1.A02) && C2I7.A00(this.A04, c103824m1.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A09, this.A0A, this.A0B, this.A01, this.A08, this.A05, this.A06, this.A07, Boolean.valueOf(this.A0C), this.A03, this.A02, this.A04});
    }

    public C103824m1(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, boolean z) {
        this.A00 = i;
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A01 = num;
        this.A08 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A0C = z;
        this.A03 = str8;
        this.A02 = str9;
        this.A04 = str10;
    }
}
