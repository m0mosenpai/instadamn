package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.Arrays;

/* renamed from: X.83s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1816383s {
    public int A00;
    public NewFundraiserInfo A01;
    public AHE A02;
    public AHE A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C1816383s(NewFundraiserInfo newFundraiserInfo, AHE ahe, AHE ahe2, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A09 = str6;
        this.A08 = str5;
        ahe2.getClass();
        this.A03 = ahe2;
        this.A07 = str4;
        this.A01 = newFundraiserInfo;
        this.A04 = str;
        this.A06 = str3;
        this.A02 = ahe;
        this.A05 = str2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1816383s c1816383s = (C1816383s) obj;
            if (!C2I7.A00(this.A09, c1816383s.A09) || !C2I7.A00(this.A08, c1816383s.A08) || !C2I7.A00(this.A03, c1816383s.A03) || !C2I7.A00(this.A07, c1816383s.A07) || !C2I7.A00(this.A01, c1816383s.A01) || !C2I7.A00(this.A04, c1816383s.A04) || !C2I7.A00(this.A06, c1816383s.A06) || !C2I7.A00(this.A02, c1816383s.A02) || !C2I7.A00(this.A05, c1816383s.A05) || !C2I7.A00(Integer.valueOf(this.A00), Integer.valueOf(c1816383s.A00))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A08, this.A03, this.A07, this.A01, this.A04, this.A06, this.A02, this.A05});
    }

    public C1816383s() {
    }
}
