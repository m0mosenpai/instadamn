package X;

import java.util.Map;

/* renamed from: X.Jwf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45050Jwf extends C0T6 {
    public final int A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final java.util.Set A04;
    public final java.util.Set A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45050Jwf) {
                C45050Jwf c45050Jwf = (C45050Jwf) obj;
                if (this.A00 != c45050Jwf.A00 || !C14360o3.A0K(this.A01, c45050Jwf.A01) || !C14360o3.A0K(this.A02, c45050Jwf.A02) || !C14360o3.A0K(this.A03, c45050Jwf.A03) || !C14360o3.A0K(this.A04, c45050Jwf.A04) || !C14360o3.A0K(this.A05, c45050Jwf.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A01, this.A00 * 31)))));
    }

    public C45050Jwf(String str, Map map, Map map2, java.util.Set set, java.util.Set set2, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = map;
        this.A03 = map2;
        this.A04 = set;
        this.A05 = set2;
    }
}
