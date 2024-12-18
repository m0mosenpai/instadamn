package X;

import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class JZU extends AbstractC46440Kh0 {
    public final DirectThreadKey A00;
    public final boolean A01;
    public final boolean A02;

    public JZU(DirectThreadKey directThreadKey, boolean z, boolean z2) {
        C14360o3.A0B(directThreadKey, 1);
        this.A00 = directThreadKey;
        this.A01 = z;
        this.A02 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JZU) {
                JZU jzu = (JZU) obj;
                if (!C14360o3.A0K(this.A00, jzu.A00) || this.A01 != jzu.A01 || this.A02 != jzu.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC166987dD.A0G(this.A00)));
    }
}
