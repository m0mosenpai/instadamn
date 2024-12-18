package X;

import java.util.Arrays;

/* renamed from: X.Fc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35027Fc0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        C35027Fc0 c35027Fc0;
        if (obj instanceof C35027Fc0) {
            c35027Fc0 = (C35027Fc0) obj;
        } else {
            c35027Fc0 = null;
        }
        if (c35027Fc0 == null || !AbstractC167017dG.A1Z(this, c35027Fc0) || this.A0C != c35027Fc0.A0C || this.A0B != c35027Fc0.A0B || !C14360o3.A0K(this.A0A, c35027Fc0.A0A) || !C14360o3.A0K(this.A08, c35027Fc0.A08) || !C14360o3.A0K(this.A00, c35027Fc0.A00) || !C14360o3.A0K(this.A05, c35027Fc0.A05) || !C14360o3.A0K(this.A07, c35027Fc0.A07) || !C14360o3.A0K(this.A06, c35027Fc0.A06) || !C14360o3.A0K(this.A02, c35027Fc0.A02) || !C14360o3.A0K(this.A04, c35027Fc0.A04) || !C14360o3.A0K(this.A01, c35027Fc0.A01) || !C14360o3.A0K(this.A03, c35027Fc0.A03)) {
            return false;
        }
        return AbstractC25231BEo.A1Z(this.A09, c35027Fc0.A09, false);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0B), this.A0A, this.A08, this.A00, this.A05, this.A07, this.A06, this.A02, this.A04, this.A01, this.A03, this.A09});
    }

    public C35027Fc0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2) {
        this.A0C = z;
        this.A0B = z2;
        this.A0A = str;
        this.A08 = str2;
        this.A00 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A02 = str7;
        this.A04 = str8;
        this.A01 = str9;
        this.A03 = str10;
        this.A09 = str11;
    }

    public C35027Fc0() {
        this.A0C = false;
        this.A0B = false;
        this.A0A = null;
        this.A08 = null;
        this.A00 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        this.A09 = null;
    }
}
