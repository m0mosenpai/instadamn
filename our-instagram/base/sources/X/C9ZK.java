package X;

import java.util.List;

/* renamed from: X.9ZK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZK extends C0T6 {
    public EnumC46169Kc7 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final C09530e4 A06;
    public final List A07;

    public C9ZK(EnumC46169Kc7 enumC46169Kc7, String str, String str2, String str3, String str4, List list, List list2, C09530e4 c09530e4) {
        AbstractC167027dH.A0a(1, str, str2, str3, list);
        AbstractC167017dG.A1T(list2, c09530e4);
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = list;
        this.A07 = list2;
        this.A06 = c09530e4;
        this.A01 = str4;
        this.A00 = enumC46169Kc7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZK) {
                C9ZK c9zk = (C9ZK) obj;
                if (!C14360o3.A0K(this.A02, c9zk.A02) || !C14360o3.A0K(this.A04, c9zk.A04) || !C14360o3.A0K(this.A03, c9zk.A03) || !C14360o3.A0K(this.A05, c9zk.A05) || !C14360o3.A0K(this.A07, c9zk.A07) || !C14360o3.A0K(this.A06, c9zk.A06) || !C14360o3.A0K(this.A01, c9zk.A01) || this.A00 != c9zk.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A02)))))) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
