package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.4oI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105024oI {
    public final int A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C105024oI(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, boolean z) {
        C14360o3.A0B(list, 1);
        this.A09 = list;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A05 = str4;
        this.A02 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A0A = z;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C105024oI)) {
            return false;
        }
        C105024oI c105024oI = (C105024oI) obj;
        return C14360o3.A0K(this.A09, c105024oI.A09) && C14360o3.A0K(this.A06, c105024oI.A06) && C14360o3.A0K(this.A07, c105024oI.A07) && C14360o3.A0K(this.A08, c105024oI.A08) && this.A00 == c105024oI.A00 && C14360o3.A0K(this.A05, c105024oI.A05) && C14360o3.A0K(this.A02, c105024oI.A02) && C14360o3.A0K(this.A03, c105024oI.A03) && C14360o3.A0K(this.A04, c105024oI.A04) && this.A0A == c105024oI.A0A && C14360o3.A0K(this.A01, c105024oI.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A06, this.A07, this.A08, Integer.valueOf(this.A00), this.A05, this.A02, this.A03, this.A04, Boolean.valueOf(this.A0A), this.A01});
    }
}
