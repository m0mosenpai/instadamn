package X;

import androidx.compose.foundation.selection.SelectableElement;
import androidx.compose.foundation.selection.ToggleableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.Dcc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30555Dcc extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30555Dcc(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        boolean A1U = AbstractC25227BEk.A1U(A0S, -1525724089);
        if (i != 0) {
            if (A1U) {
                C0fH.A01(-1466288466, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(A0S, A0S.EEc(), C5UI.A00);
            Modifier Eq3 = C5WM.A00((InterfaceC118075Vr) this.A01, c5xo, Modifier.A00).Eq3(new ToggleableElement(null, c5xo, (C5XQ) this.A03, (InterfaceC16660sJ) this.A02, this.A05, this.A04));
            if (C0fH.A02()) {
                C0fH.A00(-1765575152);
            }
            AbstractC25225BEi.A1T(A0S);
            return Eq3;
        }
        if (A1U) {
            C0fH.A01(-1123764373, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
        }
        C5XO c5xo2 = (C5XO) AbstractC25232BEp.A1C(A0S, A0S.EEc(), C5UI.A00);
        Modifier Eq32 = C5WM.A00((InterfaceC118075Vr) this.A01, c5xo2, Modifier.A00).Eq3(new SelectableElement(null, c5xo2, (C5XQ) this.A03, (InterfaceC16820sZ) this.A02, this.A05, this.A04));
        if (C0fH.A02()) {
            C0fH.A00(-1412070675);
        }
        AbstractC25225BEi.A1T(A0S);
        return Eq32;
    }
}
