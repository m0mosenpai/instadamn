package X;

import java.util.List;

/* renamed from: X.Bxa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27111Bxa extends C9D {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27111Bxa) {
                C27111Bxa c27111Bxa = (C27111Bxa) obj;
                if (!C14360o3.A0K(this.A00, c27111Bxa.A00) || this.A01 != c27111Bxa.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C27111Bxa(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
