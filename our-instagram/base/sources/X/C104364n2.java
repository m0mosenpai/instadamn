package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.4n2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104364n2 extends C0T6 implements InterfaceC104374n3 {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final MonetizationEligibilityDecision A03;
    public final Boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104364n2) {
                C104364n2 c104364n2 = (C104364n2) obj;
                if (!C14360o3.A0K(this.A00, c104364n2.A00) || !C14360o3.A0K(this.A04, c104364n2.A04) || !C14360o3.A0K(this.A01, c104364n2.A01) || !C14360o3.A0K(this.A02, c104364n2.A02) || this.A03 != c104364n2.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A04;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A01;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A02;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MonetizationEligibilityDecision monetizationEligibilityDecision = this.A03;
        return hashCode4 + (monetizationEligibilityDecision != null ? monetizationEligibilityDecision.hashCode() : 0);
    }

    public C104364n2(MonetizationEligibilityDecision monetizationEligibilityDecision, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.A00 = bool;
        this.A04 = bool2;
        this.A01 = bool3;
        this.A02 = bool4;
        this.A03 = monetizationEligibilityDecision;
    }
}
