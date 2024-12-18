package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class X5J extends C0YY implements InterfaceC16660sJ {
    public static final X5J A00 = new X5J();

    public X5J() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map;
        String str;
        Object obj2;
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) obj;
        C14360o3.A0B(interfaceC59242nQ, 0);
        if (interfaceC59242nQ instanceof C59252nR) {
            C59252nR c59252nR = (C59252nR) interfaceC59242nQ;
            C1W1 c1w1 = (C1W1) c59252nR.A0F.A00;
            if (c1w1 == null || (map = c1w1.A04) == null) {
                map = AbstractC59372ng.A00(null, null, c59252nR).A0C;
            }
            if (map == null || (obj2 = map.get("origin")) == null || (str = obj2.toString()) == null) {
                str = "unknown";
            }
            return AbstractC167007dF.A0o(str, AbstractC37302Gc3.A02((Number) VY5.A00.get(str)));
        }
        return new C09530e4("", -1);
    }
}
