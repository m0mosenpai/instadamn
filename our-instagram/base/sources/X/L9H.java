package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class L9H {
    public final float A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public L9H(Integer num, String str, String str2, String str3, String str4, String str5, List list, float f, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A07 = str5;
        this.A02 = num;
        this.A01 = i;
        this.A06 = str4;
        this.A0F = z8;
        this.A0G = z6;
        this.A00 = f;
        this.A03 = str;
        this.A08 = list;
        this.A05 = str3;
        this.A04 = str2;
        this.A0B = z3;
        this.A09 = z;
        this.A0C = z4;
        this.A0E = z7;
        this.A0D = z5;
        this.A0A = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            L9H l9h = (L9H) obj;
            if (!C14360o3.A0K(this.A07, l9h.A07) || !C14360o3.A0K(this.A02, l9h.A02) || this.A01 != l9h.A01 || !C14360o3.A0K(this.A06, l9h.A06) || this.A0F != l9h.A0F || this.A0G != l9h.A0G || this.A00 != l9h.A00 || !C14360o3.A0K(this.A03, l9h.A03) || !C14360o3.A0K(this.A08, l9h.A08) || !C14360o3.A0K(this.A05, l9h.A05) || !C14360o3.A0K(this.A04, l9h.A04) || this.A0B != l9h.A0B || this.A0C != l9h.A0C || this.A0E != l9h.A0E || this.A0D != l9h.A0D || this.A0A != l9h.A0A) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, this.A07, null, null, null, null, AbstractC166997dE.A0a(), this.A02, Integer.valueOf(this.A01), this.A06, Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0G), Float.valueOf(this.A00), this.A03, this.A08, this.A05, this.A04, Boolean.valueOf(this.A0B), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0A)});
    }
}
