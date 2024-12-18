package X;

import java.util.List;

/* renamed from: X.Bep, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26001Bep extends C0T6 {
    public final C60037Qsx A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final C5Hc A04;
    public final int A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26001Bep) {
                C26001Bep c26001Bep = (C26001Bep) obj;
                if (!C14360o3.A0K(this.A01, c26001Bep.A01) || !C14360o3.A0K(this.A06, c26001Bep.A06) || this.A05 != c26001Bep.A05 || !C14360o3.A0K(this.A00, c26001Bep.A00) || !C14360o3.A0K(this.A03, c26001Bep.A03) || !C14360o3.A0K(this.A02, c26001Bep.A02) || !C14360o3.A0K(this.A04, c26001Bep.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A05) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C26001Bep(C60037Qsx c60037Qsx, String str, String str2, String str3, List list, C5Hc c5Hc, int i) {
        this.A01 = str;
        this.A06 = list;
        this.A05 = i;
        this.A00 = c60037Qsx;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = c5Hc;
    }
}
