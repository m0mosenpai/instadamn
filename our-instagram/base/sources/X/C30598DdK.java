package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawWithCacheElement;

/* renamed from: X.DdK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30598DdK extends C0YY implements InterfaceC16610sE {
    public static final C30598DdK A00 = new C30598DdK();

    public C30598DdK() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, -2126899193)) {
            C0fH.A01(-15653284, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
        }
        long j = ((CVE) A0S.AJX(CNJ.A01)).A01;
        C1130158n c1130158n = Modifier.A00;
        boolean AH3 = A0S.AH3(j);
        Object EEc = A0S.EEc();
        if (AH3 || EEc == C5UI.A00) {
            EEc = new JXD(j, 0);
            A0S.FBy(EEc);
        }
        Modifier Eq3 = modifier.Eq3(c1130158n.Eq3(new DrawWithCacheElement((InterfaceC16660sJ) EEc)));
        if (C0fH.A02()) {
            C0fH.A00(1924332122);
        }
        AbstractC25225BEi.A1T(A0S);
        return Eq3;
    }
}
