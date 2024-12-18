package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* loaded from: classes7.dex */
public final class H3H extends C0T6 implements InterfaceC108164u1 {
    public final boolean A00;
    public final MonetizationEligibilityDecision A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3H) {
                H3H h3h = (H3H) obj;
                if (this.A00 != h3h.A00 || this.A01 != h3h.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    public H3H(MonetizationEligibilityDecision monetizationEligibilityDecision, boolean z) {
        this.A00 = z;
        this.A01 = monetizationEligibilityDecision;
    }
}
