package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dc8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30525Dc8 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C132335yC A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30525Dc8(C132335yC c132335yC, InterfaceC16820sZ interfaceC16820sZ, float f) {
        super(3);
        this.A00 = f;
        this.A02 = interfaceC16820sZ;
        this.A01 = c132335yC;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C6IV c6iv = (C6IV) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0p = AbstractC25232BEp.A0p(obj3, c6iv);
        if ((A0p & 6) == 0) {
            A0p |= AbstractC25232BEp.A0R(c5Tl, c6iv);
        }
        if ((A0p & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(431399246, "com.instagram.feed.tifu.ui.TifuHScrollUnit.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TifuHScrollUnit.kt:246)");
            }
            Modifier A02 = C6L7.A02(c6iv.AVE(Modifier.A00, this.A00), new C6L4(AbstractC25226BEj.A0E(c5Tl)), C5WF.A01(16.0f), 1.0f);
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            if (AbstractC25231BEo.A1P(c5Tl, AbstractC118175Wb.A0A(AbstractC25228BEl.A0Z(AbstractC118635Yc.A04(c5Tl, A02, interfaceC16820sZ), 16.0f, AbstractC25226BEj.A09(c5Tl)), 51.0f, 24.0f), new DSA(31, interfaceC16820sZ, this.A01), 225648522)) {
                C0fH.A00(-1766659749);
            }
        }
        return C0eB.A00;
    }
}
