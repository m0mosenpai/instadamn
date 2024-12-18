package X;

import java.util.UUID;

/* loaded from: classes8.dex */
public final class K2E extends C0T6 implements MND {
    public final String A00;
    public final UUID A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2E) {
                K2E k2e = (K2E) obj;
                if (!C14360o3.A0K(this.A00, k2e.A00) || this.A02 != k2e.A02 || !C14360o3.A0K(this.A01, k2e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0J(this.A00)));
    }

    public K2E(String str, UUID uuid, boolean z) {
        AbstractC167017dG.A1Q(str, uuid);
        this.A00 = str;
        this.A02 = z;
        this.A01 = uuid;
    }
}
