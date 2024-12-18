package X;

/* renamed from: X.LGd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47948LGd {
    public L7F A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47948LGd)) {
            return false;
        }
        C47948LGd c47948LGd = (C47948LGd) obj;
        return C14360o3.A0K(this.A09, c47948LGd.A09) && C14360o3.A0K(this.A07, c47948LGd.A07) && C14360o3.A0K(this.A02, c47948LGd.A02) && C14360o3.A0K(this.A01, c47948LGd.A01) && C14360o3.A0K(this.A08, c47948LGd.A08) && C14360o3.A0K(this.A05, c47948LGd.A05);
    }

    public C47948LGd(L7F l7f, C2EY c2ey, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        this.A02 = str;
        this.A04 = str2;
        this.A06 = str3;
        if (c2ey != null) {
            str8 = c2ey.A00;
        } else {
            str8 = null;
        }
        this.A03 = str8;
        this.A07 = str4;
        this.A09 = "like";
        this.A01 = str5;
        this.A08 = str6;
        this.A05 = str7;
        this.A00 = l7f;
    }

    public final int hashCode() {
        int i = 0;
        int A04 = ((((((((((AbstractC31177DnL.A04(this.A09) * 31) + AbstractC31177DnL.A04(this.A07)) * 31) + AbstractC31177DnL.A04(this.A02)) * 31) + AbstractC31177DnL.A04(this.A01)) * 31) + AbstractC31177DnL.A04(this.A08)) * 31) + AbstractC31177DnL.A04(this.A05)) * 31;
        L7F l7f = this.A00;
        if (l7f != null) {
            i = l7f.hashCode();
        }
        return A04 + i;
    }

    public C47948LGd() {
    }
}
