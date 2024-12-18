package X;

import java.util.List;

/* renamed from: X.JwI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45027JwI extends C0T6 {
    public String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45027JwI) {
                C45027JwI c45027JwI = (C45027JwI) obj;
                if (!C14360o3.A0K(this.A01, c45027JwI.A01) || !C14360o3.A0K(this.A02, c45027JwI.A02) || !C14360o3.A0K(this.A00, c45027JwI.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A01)));
    }

    public C45027JwI(String str, String str2, List list) {
        AbstractC167017dG.A1Q(str, str2);
        this.A01 = str;
        this.A02 = list;
        this.A00 = str2;
    }
}
