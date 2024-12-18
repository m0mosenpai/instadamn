package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.9ZP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZP extends C0T6 {
    public final CameraTool A00;
    public final CW0 A01;
    public final CWB A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Integer A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZP) {
                C9ZP c9zp = (C9ZP) obj;
                if (this.A00 != c9zp.A00 || !C14360o3.A0K(this.A08, c9zp.A08) || !C14360o3.A0K(this.A01, c9zp.A01) || !C14360o3.A0K(this.A09, c9zp.A09) || !C14360o3.A0K(this.A06, c9zp.A06) || !C14360o3.A0K(this.A07, c9zp.A07) || !C14360o3.A0K(this.A03, c9zp.A03) || !C14360o3.A0K(this.A04, c9zp.A04) || !C14360o3.A0K(this.A05, c9zp.A05) || this.A0B != c9zp.A0B || !C14360o3.A0K(this.A0A, c9zp.A0A) || !C14360o3.A0K(this.A02, c9zp.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0G = (((((((((((((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
        int intValue = this.A0B.intValue();
        switch (intValue) {
            case 1:
                str = AbstractC43591JPw.A00(240);
                break;
            case 2:
                str = "META_INTENTS";
                break;
            default:
                str = "IMAGINE_NATIVE";
                break;
        }
        return ((((A0G + str.hashCode() + intValue) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C9ZP(CameraTool cameraTool, CW0 cw0, CWB cwb, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = cameraTool;
        this.A08 = str;
        this.A01 = cw0;
        this.A09 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A05 = str7;
        this.A0B = num;
        this.A0A = str8;
        this.A02 = cwb;
    }
}
