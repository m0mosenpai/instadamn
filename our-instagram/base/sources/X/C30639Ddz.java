package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.Ddz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30639Ddz extends C0YY implements InterfaceC16610sE {
    public static final C30639Ddz A00 = new C30639Ddz();

    public C30639Ddz() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC31030DkT interfaceC31030DkT = (InterfaceC31030DkT) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        boolean A1X = AbstractC25231BEo.A1X(obj3, interfaceC31030DkT);
        if (AbstractC25227BEk.A1U(c5Tl, 1466253795)) {
            C0fH.A01(528212571, "com.instagram.compose.igds.components.contextmenu.IgdsContextMenuContent.<anonymous> (IgdsContextMenuContent.kt:78)");
        }
        boolean Cek = interfaceC31030DkT.Cek(Boolean.valueOf(A1X), AbstractC166997dE.A0b());
        int i = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        if (Cek) {
            i = 30;
        }
        C25245BFe A002 = C25245BFe.A00(i, A1X ? 1 : 0);
        if (C0fH.A02()) {
            C0fH.A00(-1615873021);
        }
        AbstractC25225BEi.A1V(c5Tl, A1X);
        return A002;
    }
}
