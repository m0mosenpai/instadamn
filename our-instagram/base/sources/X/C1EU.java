package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1EU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EU extends C0T6 {
    public static final AtomicInteger A0G = new AtomicInteger();
    public boolean A00;
    public final int A01;
    public final C1ET A02;
    public final C17590tu A03;
    public final C1EN A04;
    public final C1ES A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final Map A0D;
    public final Map A0E;
    public final boolean A0F;

    public C1EU(C1ET c1et, C17590tu c17590tu, C1EN c1en, C1ES c1es, Long l, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        this.A0A = str;
        this.A04 = c1en;
        this.A05 = c1es;
        this.A08 = str2;
        this.A03 = c17590tu;
        this.A0C = str3;
        this.A0B = str4;
        this.A0E = map;
        this.A0D = map2;
        this.A09 = str5;
        this.A01 = i;
        this.A07 = str6;
        this.A00 = z;
        this.A02 = c1et;
        this.A06 = l;
        this.A0F = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1EU) {
                C1EU c1eu = (C1EU) obj;
                if (!C14360o3.A0K(this.A0A, c1eu.A0A) || this.A04 != c1eu.A04 || !C14360o3.A0K(this.A05, c1eu.A05) || !C14360o3.A0K(this.A08, c1eu.A08) || !C14360o3.A0K(this.A03, c1eu.A03) || !C14360o3.A0K(this.A0C, c1eu.A0C) || !C14360o3.A0K(this.A0B, c1eu.A0B) || !C14360o3.A0K(this.A0E, c1eu.A0E) || !C14360o3.A0K(this.A0D, c1eu.A0D) || !C14360o3.A0K(this.A09, c1eu.A09) || this.A01 != c1eu.A01 || !C14360o3.A0K(this.A07, c1eu.A07) || this.A00 != c1eu.A00 || !C14360o3.A0K(this.A02, c1eu.A02) || !C14360o3.A0K(this.A06, c1eu.A06) || this.A0F != c1eu.A0F) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        C1EN c1en = this.A04;
        if (c1en != C1EN.A06 && c1en != C1EN.A0N) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        C1EN c1en = this.A04;
        if (!c1en.A00()) {
            if (C1EN.A0N == c1en) {
                Map map = this.A0D;
                if (map.containsKey("new_posts_pill_type") && C14360o3.A0K(map.get("new_posts_pill_type"), C3FZ.A05.toString())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (this.A04 == C1EN.A0H) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = ((((this.A0A.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str = this.A08;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode7 + hashCode) * 31;
        C17590tu c17590tu = this.A03;
        if (c17590tu == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c17590tu.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A0C;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.A0B;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode8 = (((((((((i4 + hashCode4) * 31) + this.A0E.hashCode()) * 31) + this.A0D.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A01) * 31 * 31;
        String str4 = this.A07;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (hashCode8 + hashCode5) * 31;
        int i6 = 1237;
        if (this.A00) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        C1ET c1et = this.A02;
        if (c1et == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c1et.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        Long l = this.A06;
        if (l != null) {
            i = l.hashCode();
        }
        int i9 = (i8 + i) * 31;
        int i10 = 1237;
        if (this.A0F) {
            i10 = 1231;
        }
        return i9 + i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{mReason=");
        sb.append(this.A04);
        sb.append(", mInstanceNumber=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
