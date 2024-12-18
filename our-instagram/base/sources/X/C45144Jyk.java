package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.Jyk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45144Jyk extends C0T6 implements InterfaceC108174u2 {
    public final int A00;
    public final MonetizationEligibilityDecision A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45144Jyk) {
                C45144Jyk c45144Jyk = (C45144Jyk) obj;
                if (this.A01 != c45144Jyk.A01 || this.A00 != c45144Jyk.A00 || this.A02 != c45144Jyk.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, ((AbstractC167017dG.A0M(this.A01) * 31) + this.A00) * 31);
    }

    public C45144Jyk(MonetizationEligibilityDecision monetizationEligibilityDecision, int i, boolean z) {
        this.A01 = monetizationEligibilityDecision;
        this.A00 = i;
        this.A02 = z;
    }
}
