package X;

import com.instagram.api.schemas.PartnerProgramOnboardingSteps;

/* loaded from: classes7.dex */
public final class H4J extends C0T6 implements InterfaceC43473JIl {
    public final int A00;
    public final PartnerProgramOnboardingSteps A01;

    public H4J(PartnerProgramOnboardingSteps partnerProgramOnboardingSteps, int i) {
        C14360o3.A0B(partnerProgramOnboardingSteps, 2);
        this.A00 = i;
        this.A01 = partnerProgramOnboardingSteps;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4J) {
                H4J h4j = (H4J) obj;
                if (this.A00 != h4j.A00 || this.A01 != h4j.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }
}
