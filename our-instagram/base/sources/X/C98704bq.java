package X;

import java.io.Serializable;

/* renamed from: X.4bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98704bq implements Serializable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                String str = ((C98704bq) obj).A0D;
                String str2 = this.A0D;
                if (str == null) {
                    if (str2 == null) {
                    }
                } else if (str2 == null || str != str2) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A0D.hashCode();
    }

    public C98704bq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0D = str;
        this.A0E = str2;
        this.A05 = i;
        this.A04 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A02 = i5;
        this.A06 = str3;
        this.A0B = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A08 = str7;
        this.A0C = str8;
        this.A07 = str9;
        this.A0L = z;
        this.A0M = z2;
        this.A0K = z3;
        this.A0J = z4;
        this.A0I = z6;
        this.A0H = z5;
        this.A0G = z7;
        this.A0F = z8;
        this.A03 = i6;
    }
}
