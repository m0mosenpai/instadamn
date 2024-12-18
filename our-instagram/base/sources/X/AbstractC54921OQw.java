package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OQw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54921OQw {
    public static final void A01(Object obj, C14510oO c14510oO, C15370ps c15370ps, C15370ps c15370ps2, C15370ps c15370ps3, C15370ps c15370ps4) {
        if (!(obj instanceof InterfaceC09250da)) {
            try {
                c14510oO.A00 = true;
                c15370ps.A00 = ((InterfaceC16620sF) c15370ps2.A00).invoke(c15370ps.A00, obj);
                c14510oO.A00 = false;
                Object obj2 = c15370ps3.A00;
                c15370ps4.A00 = obj2;
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    AbstractC166987dD.A1Y(it.next());
                }
                return;
            } catch (Throwable th) {
                c14510oO.A00 = false;
                throw th;
            }
        }
        throw AbstractC166987dD.A12("Actions must be plain objects. Use custom middleware for async \nactions.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oO, java.lang.Object] */
    public static final InterfaceC31063Dl5 A00(Object obj, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        if (interfaceC16660sJ != null) {
            return (InterfaceC31063Dl5) ((InterfaceC16610sE) interfaceC16660sJ.invoke(C57773Pk0.A00)).invoke(interfaceC16620sF, obj, null);
        }
        C15370ps A1F = AbstractC25225BEi.A1F();
        A1F.A00 = interfaceC16620sF;
        C15370ps A1F2 = AbstractC25225BEi.A1F();
        A1F2.A00 = obj;
        C15370ps A1F3 = AbstractC25225BEi.A1F();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1F3.A00 = A1E;
        C15370ps A1F4 = AbstractC25225BEi.A1F();
        A1F4.A00 = A1E;
        ?? obj2 = new Object();
        A01(C54953OSd.A00, obj2, A1F2, A1F, A1F4, A1F3);
        return new PVs(obj2, A1F2, A1F, A1F4, A1F3);
    }
}
