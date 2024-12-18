package X;

import java.util.List;

/* renamed from: X.JwP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45034JwP extends C0T6 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final List A03;

    public C45034JwP(String str, List list, int i, long j) {
        C14360o3.A0B(list, 2);
        this.A02 = str;
        this.A03 = list;
        this.A01 = j;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45034JwP) {
                C45034JwP c45034JwP = (C45034JwP) obj;
                if (!C14360o3.A0K(this.A02, c45034JwP.A02) || !C14360o3.A0K(this.A03, c45034JwP.A03) || this.A01 != c45034JwP.A01 || this.A00 != c45034JwP.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A02))) + this.A00;
    }
}
