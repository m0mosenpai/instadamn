package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.5H0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5H0 {
    public final C3ZE A00;
    public final WeakReference A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16610sE A03;

    public C5H0(C3ZE c3ze, InterfaceC101954iA interfaceC101954iA, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(c3ze, 2);
        C14360o3.A0B(interfaceC101954iA, 3);
        C14360o3.A0B(interfaceC16660sJ, 4);
        this.A00 = c3ze;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16610sE;
        this.A01 = new WeakReference(interfaceC101954iA);
    }

    public static final C29173Cte A00(C27086BxB c27086BxB, C5H0 c5h0, InterfaceC16820sZ interfaceC16820sZ, int i) {
        HashMap hashMap = c27086BxB.A01;
        Integer valueOf = Integer.valueOf(i);
        C29173Cte c29173Cte = (C29173Cte) hashMap.get(valueOf);
        if (c29173Cte == null && (c29173Cte = (C29173Cte) interfaceC16820sZ.invoke()) != null) {
            hashMap.put(valueOf, c29173Cte);
            C3ZE c3ze = c5h0.A00;
            C3ZO c3zo = (C3ZO) c29173Cte.A09.get(c29173Cte.A01);
            InterfaceC16660sJ interfaceC16660sJ = c5h0.A02;
            C14360o3.A0B(c3zo, 1);
            C14360o3.A0B(interfaceC16660sJ, 2);
            c3zo.CgR(new C30172DRc(16, interfaceC16660sJ, c29173Cte, c3ze));
        }
        return c29173Cte;
    }
}
