package X;

import java.util.List;

/* renamed from: X.K8r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45404K8r extends AbstractC46606Kjj {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45404K8r) {
                C45404K8r c45404K8r = (C45404K8r) obj;
                if (!C14360o3.A0K(this.A08, c45404K8r.A08) || !C14360o3.A0K(this.A07, c45404K8r.A07) || !C14360o3.A0K(this.A05, c45404K8r.A05) || !C14360o3.A0K(this.A09, c45404K8r.A09) || !C14360o3.A0K(this.A01, c45404K8r.A01) || !C14360o3.A0K(this.A04, c45404K8r.A04) || !C14360o3.A0K(this.A03, c45404K8r.A03) || !C14360o3.A0K(this.A02, c45404K8r.A02) || !C14360o3.A0K(this.A00, c45404K8r.A00) || !"appreciation_gift_feed_query_gifters_failure".equals("appreciation_gift_feed_query_gifters_failure") || !C14360o3.A0K(this.A06, c45404K8r.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05((((((((((AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A08)))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31, -498760940) + AbstractC25227BEk.A07(this.A06);
    }

    public C45404K8r(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, String str4, List list) {
        this.A08 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A09 = list;
        this.A01 = bool;
        this.A04 = bool2;
        this.A03 = bool3;
        this.A02 = bool4;
        this.A00 = bool5;
        this.A06 = str4;
    }
}
