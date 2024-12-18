package X;

import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* renamed from: X.Gjy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37783Gjy extends C0T6 {
    public final ProductSource A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final java.util.Set A05;
    public final java.util.Set A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37783Gjy) {
                C37783Gjy c37783Gjy = (C37783Gjy) obj;
                if (!C14360o3.A0K(this.A02, c37783Gjy.A02) || !C14360o3.A0K(this.A04, c37783Gjy.A04) || !C14360o3.A0K(this.A00, c37783Gjy.A00) || !C14360o3.A0K(this.A05, c37783Gjy.A05) || !C14360o3.A0K(this.A06, c37783Gjy.A06) || !C14360o3.A0K(this.A03, c37783Gjy.A03) || this.A0A != c37783Gjy.A0A || this.A08 != c37783Gjy.A08 || this.A07 != c37783Gjy.A07 || this.A09 != c37783Gjy.A09 || !C14360o3.A0K(this.A01, c37783Gjy.A01) || this.A0B != c37783Gjy.A0B || this.A0C != c37783Gjy.A0C) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C37783Gjy A00(ProductSource productSource, C37783Gjy c37783Gjy, String str, String str2, List list, List list2, java.util.Set set, java.util.Set set2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = z4;
        String str3 = str2;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        List list3 = list2;
        java.util.Set set3 = set2;
        java.util.Set set4 = set;
        ProductSource productSource2 = productSource;
        List list4 = list;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c37783Gjy.A02;
        }
        if ((i & 2) != 0) {
            list4 = c37783Gjy.A04;
        }
        if ((i & 4) != 0) {
            productSource2 = c37783Gjy.A00;
        }
        if ((i & 8) != 0) {
            set4 = c37783Gjy.A05;
        }
        if ((i & 16) != 0) {
            set3 = c37783Gjy.A06;
        }
        if ((i & 32) != 0) {
            list3 = c37783Gjy.A03;
        }
        if ((i & 64) != 0) {
            z10 = c37783Gjy.A0A;
        }
        if ((i & 128) != 0) {
            z9 = c37783Gjy.A08;
        }
        if ((i & 256) != 0) {
            z8 = c37783Gjy.A07;
        }
        if ((i & 512) != 0) {
            z5 = c37783Gjy.A09;
        } else {
            z5 = false;
        }
        if ((i & 1024) != 0) {
            str3 = c37783Gjy.A01;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            z6 = c37783Gjy.A0B;
        } else {
            z6 = false;
        }
        if ((i & 4096) != 0) {
            z7 = c37783Gjy.A0C;
        }
        C14360o3.A0B(str4, 0);
        AbstractC25234BEr.A0j(1, list4, set4, set3, list3);
        return new C37783Gjy(productSource2, str4, str3, list4, list3, set4, set3, z10, z9, z8, z5, z6, z7);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0C, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A05, (AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A00)) * 31))))))) + AbstractC25227BEk.A07(this.A01)) * 31));
    }

    public C37783Gjy(ProductSource productSource, String str, String str2, List list, List list2, java.util.Set set, java.util.Set set2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = str;
        this.A04 = list;
        this.A00 = productSource;
        this.A05 = set;
        this.A06 = set2;
        this.A03 = list2;
        this.A0A = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A09 = z4;
        this.A01 = str2;
        this.A0B = z5;
        this.A0C = z6;
    }
}
