package X;

import java.util.List;

/* renamed from: X.MsW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51701MsW extends C0T6 {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C51701MsW() {
        this(null, C05F.A00, null, null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51701MsW) {
                C51701MsW c51701MsW = (C51701MsW) obj;
                if (!C14360o3.A0K(this.A04, c51701MsW.A04) || !C14360o3.A0K(this.A05, c51701MsW.A05) || this.A07 != c51701MsW.A07 || this.A03 != c51701MsW.A03 || !C14360o3.A0K(this.A06, c51701MsW.A06) || !C14360o3.A0K(this.A00, c51701MsW.A00) || !C14360o3.A0K(this.A01, c51701MsW.A01) || !C14360o3.A0K(this.A02, c51701MsW.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC167007dF.A0D(this.A07, ((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC53866Nru.A00(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C51701MsW(Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, List list, boolean z) {
        C14360o3.A0B(num, 4);
        this.A04 = str;
        this.A05 = str2;
        this.A07 = z;
        this.A03 = num;
        this.A06 = list;
        this.A00 = bool;
        this.A01 = num2;
        this.A02 = num3;
    }
}
