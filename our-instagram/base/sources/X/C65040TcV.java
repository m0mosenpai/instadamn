package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.TcV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65040TcV extends C0YY implements InterfaceC16660sJ {
    public static final C65040TcV A00 = new C65040TcV();

    public C65040TcV() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) obj;
        C14360o3.A0B(interfaceC59242nQ, 0);
        if (interfaceC59242nQ instanceof C59252nR) {
            AbstractC59442nn abstractC59442nn = ((C59252nR) interfaceC59242nQ).A0G.A04;
            if (abstractC59442nn == null) {
                return "unset";
            }
            int A02 = abstractC59442nn.A02();
            return AbstractC58318PtA.A0o(Locale.US, "%dx%d", Arrays.copyOf(AbstractC25228BEl.A1Z(Integer.valueOf(A02), abstractC59442nn.A01()), 2));
        }
        return "";
    }
}
