package X;

import java.util.List;

/* renamed from: X.HKk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39131HKk extends AbstractC39654Hij {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39131HKk) {
                C39131HKk c39131HKk = (C39131HKk) obj;
                if (!C14360o3.A0K(this.A00, c39131HKk.A00) || this.A01 != c39131HKk.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C39131HKk(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public C39131HKk() {
        this(C16930sl.A00, false);
    }
}
