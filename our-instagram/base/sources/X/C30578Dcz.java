package X;

import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.Dcz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30578Dcz extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A00 != 0) {
            C5Tl c5Tl = (C5Tl) obj2;
            int A0H = AbstractC166987dD.A0H(obj3);
            C14360o3.A0B(obj, 0);
            if ((A0H & 17) == 16 && c5Tl.Bxj()) {
                c5Tl.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(77088783, "com.instagram.schools.management.ui.SchoolOnboardingConfirmSchoolContent.<anonymous> (SchoolOnboardingConfirmSchoolContent.kt:59)");
                }
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A02;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                CYy.A01(c5Tl, (EnumC27395C6y) this.A01, (EnumC27383C6m) this.A05, this.A07, this.A06, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, 0, this.A08);
                if (C0fH.A02()) {
                    C0fH.A00(359578281);
                }
            }
            return C0eB.A00;
        }
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, -1525724089)) {
            C0fH.A01(1219847955, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
        }
        C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(A0S, A0S.EEc(), C5UI.A00);
        Modifier A00 = C5WM.A00((InterfaceC118075Vr) this.A01, c5xo, Modifier.A00);
        boolean z = this.A08;
        String str = this.A06;
        Modifier Eq3 = A00.Eq3(new CombinedClickableElement(null, c5xo, (C5XQ) this.A05, str, this.A07, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, z));
        if (C0fH.A02()) {
            C0fH.A00(-1922433245);
        }
        AbstractC25225BEi.A1T(A0S);
        return Eq3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30578Dcz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A08 = z;
        this.A06 = str;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A07 = str2;
        this.A04 = obj4;
        this.A03 = obj5;
    }
}
