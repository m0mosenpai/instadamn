package X;

import java.util.List;

/* renamed from: X.K2p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45287K2p extends C0T6 implements MNW {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45287K2p) {
                C45287K2p c45287K2p = (C45287K2p) obj;
                if (!C14360o3.A0K(this.A01, c45287K2p.A01) || !C14360o3.A0K(this.A00, c45287K2p.A00) || this.A02 != c45287K2p.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public C45287K2p(String str, List list, boolean z) {
        this.A01 = list;
        this.A00 = str;
        this.A02 = z;
    }

    public C45287K2p() {
        this("", C16930sl.A00, false);
    }
}
