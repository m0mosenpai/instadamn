package X;

import java.util.List;

/* renamed from: X.JwM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45031JwM extends C0T6 {
    public final long A00;
    public final long A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45031JwM) {
                C45031JwM c45031JwM = (C45031JwM) obj;
                if (this.A01 != c45031JwM.A01 || this.A00 != c45031JwM.A00 || !C14360o3.A0K(this.A02, c45031JwM.A02) || !C14360o3.A0K(this.A03, c45031JwM.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A07(this.A00, ((int) (j ^ (j >>> 32))) * 31)));
    }

    public C45031JwM(String str, List list, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = str;
        this.A03 = list;
    }
}
