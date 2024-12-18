package X;

import androidx.compose.ui.Modifier;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.DcH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30534DcH extends C0YY implements InterfaceC16610sE {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30534DcH(Object obj, Object obj2, float f, int i) {
        super(3);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A00 = f;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A01;
        float A00;
        if (this.A01 != 0) {
            C5Tl c5Tl = (C5Tl) obj2;
            if (AbstractC25228BEl.A0E(obj3) == 16 && c5Tl.Bxj()) {
                c5Tl.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(68747574, "com.instagram.creator.achievements.modules.views.ChallengeCardHScrollRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChallengeCardHScrollRow.kt:49)");
                }
                CYP.A01(c5Tl, AbstractC118185Wd.A0D(Modifier.A00, this.A00), (Badge.ChallengeBadge) this.A02, (InterfaceC16660sJ) this.A03, 8);
                if (C0fH.A02()) {
                    C0fH.A00(867234196);
                }
            }
            return C0eB.A00;
        }
        float A09 = AbstractC166987dD.A09(obj);
        float A092 = AbstractC166987dD.A09(obj2);
        float A093 = AbstractC166987dD.A09(obj3);
        BVY bvy = (BVY) this.A03;
        Object obj4 = this.A02;
        float f = this.A00;
        InterfaceC74953Yl interfaceC74953Yl = bvy.A0C;
        if (AbstractC25230BEn.A0S(interfaceC74953Yl).A09 != C6M3.Vertical && obj4 != AnonymousClass583.Ltr) {
            A01 = AbstractC167007dF.A1N(AbstractC28009CWg.A01(bvy) ? 1 : 0);
        } else {
            A01 = AbstractC28009CWg.A01(bvy);
        }
        int i = AbstractC25230BEn.A0S(interfaceC74953Yl).A05;
        if (i == 0) {
            A00 = 0.0f;
        } else {
            A00 = AbstractC28009CWg.A00(bvy) / i;
        }
        float f2 = A00 - ((int) A00);
        if (Math.abs(A09) >= bvy.A0D.EqT(400.0f) ? A09 > 0.0f : !(Math.abs(f2) <= f ? !(Math.abs(A00) < Math.abs(bvy.A02()) ? Math.abs(A092) >= Math.abs(A093) : !A01) : !A01)) {
            A092 = A093;
        }
        return Float.valueOf(A092);
    }
}
