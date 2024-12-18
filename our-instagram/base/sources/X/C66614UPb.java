package X;

import java.util.List;

/* renamed from: X.UPb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66614UPb extends C0T6 {
    public boolean A0M = false;
    public String A04 = null;
    public String A05 = null;
    public String A06 = null;
    public String A07 = null;
    public String A08 = null;
    public String A09 = null;
    public String A0A = null;
    public String A0B = null;
    public Integer A03 = null;
    public String A0C = null;
    public Boolean A00 = null;
    public List A0L = null;
    public String A0D = "";
    public String A0E = null;
    public Boolean A01 = null;
    public Boolean A02 = null;
    public boolean A0N = false;
    public String A0F = null;
    public String A0G = null;
    public String A0H = null;
    public String A0I = null;
    public String A0J = null;
    public String A0K = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66614UPb) {
                C66614UPb c66614UPb = (C66614UPb) obj;
                if (this.A0M != c66614UPb.A0M || !C14360o3.A0K(this.A04, c66614UPb.A04) || !C14360o3.A0K(this.A05, c66614UPb.A05) || !C14360o3.A0K(this.A06, c66614UPb.A06) || !C14360o3.A0K(this.A07, c66614UPb.A07) || !C14360o3.A0K(this.A08, c66614UPb.A08) || !C14360o3.A0K(this.A09, c66614UPb.A09) || !C14360o3.A0K(this.A0A, c66614UPb.A0A) || !C14360o3.A0K(this.A0B, c66614UPb.A0B) || !C14360o3.A0K(this.A03, c66614UPb.A03) || !C14360o3.A0K(this.A0C, c66614UPb.A0C) || !C14360o3.A0K(this.A00, c66614UPb.A00) || !C14360o3.A0K(this.A0L, c66614UPb.A0L) || !C14360o3.A0K(this.A0D, c66614UPb.A0D) || !C14360o3.A0K(this.A0E, c66614UPb.A0E) || !C14360o3.A0K(this.A01, c66614UPb.A01) || !C14360o3.A0K(this.A02, c66614UPb.A02) || this.A0N != c66614UPb.A0N || !C14360o3.A0K(this.A0F, c66614UPb.A0F) || !C14360o3.A0K(this.A0G, c66614UPb.A0G) || !C14360o3.A0K(this.A0H, c66614UPb.A0H) || !C14360o3.A0K(this.A0I, c66614UPb.A0I) || !C14360o3.A0K(this.A0J, c66614UPb.A0J) || !C14360o3.A0K(this.A0K, c66614UPb.A0K)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A0M) {
            i = 1231;
        }
        int i2 = 0;
        int A0D = (((((((((AbstractC167007dF.A0D(this.A0N, (((((AbstractC166997dE.A0K(this.A0D, ((((((((((((((((((((((((i * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0L)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31;
        String str = this.A0K;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0D + i2;
    }
}
