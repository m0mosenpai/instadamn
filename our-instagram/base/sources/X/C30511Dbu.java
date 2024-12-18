package X;

import androidx.compose.foundation.ScrollSemanticsElement;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.Dbu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30511Dbu extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C28729CmL A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30511Dbu(C28729CmL c28729CmL, boolean z) {
        super(3);
        this.A00 = c28729CmL;
        this.A01 = z;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C6M3 c6m3;
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, 1478351300)) {
            C0fH.A01(1094602294, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
        }
        C28729CmL c28729CmL = this.A00;
        boolean z = this.A01;
        ScrollSemanticsElement scrollSemanticsElement = new ScrollSemanticsElement(c28729CmL, z);
        if (z) {
            c6m3 = C6M3.Vertical;
        } else {
            c6m3 = C6M3.Horizontal;
        }
        Modifier Eq3 = AbstractC137896Mo.A00(null, null, c6m3, c28729CmL, c28729CmL.A02, A0S, scrollSemanticsElement, 64, true, false).Eq3(new ScrollingLayoutElement(c28729CmL, z));
        if (C0fH.A02()) {
            C0fH.A00(-2072512475);
        }
        AbstractC25225BEi.A1T(A0S);
        return Eq3;
    }
}
