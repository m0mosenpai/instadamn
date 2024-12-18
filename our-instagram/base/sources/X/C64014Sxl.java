package X;

import com.instagram.schools.management.data.UserSchoolEligibilityResponseImpl;

/* renamed from: X.Sxl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64014Sxl implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C64014Sxl(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        InterfaceC16660sJ interfaceC16660sJ;
        EnumC27384C6n enumC27384C6n;
        C2JS A0k;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null) {
            C4OF c4of = C2JS.Companion;
            C2JS A03 = A0k.A03(UserSchoolEligibilityResponseImpl.XdtUserSchoolEligibility.class, "xdt_user_school_eligibility(input:$input)", -505317559);
            if (A03 != null) {
                if (!A03.getCoercedBooleanField(1, "user_eligibility_status")) {
                    interfaceC16660sJ = this.A00;
                    enumC27384C6n = EnumC27384C6n.A04;
                } else if (A03.getCoercedIntField(0, "user_verification_status") == 1 || A03.getCoercedIntField(0, "user_verification_status") == 4) {
                    interfaceC16660sJ = this.A00;
                    enumC27384C6n = EnumC27384C6n.A02;
                }
                interfaceC16660sJ.invoke(enumC27384C6n);
            }
        }
        interfaceC16660sJ = this.A00;
        enumC27384C6n = EnumC27384C6n.A03;
        interfaceC16660sJ.invoke(enumC27384C6n);
    }
}
