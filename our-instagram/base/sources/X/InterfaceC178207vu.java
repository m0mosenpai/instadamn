package X;

import android.content.Context;

/* renamed from: X.7vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC178207vu {
    InterfaceC178067vf Aq0(C178087vh c178087vh);

    InterfaceC178287w2 Aq1(C178307w4 c178307w4);

    Object AqF(C177257uL c177257uL);

    Object AqG(C178037vc c178037vc);

    boolean CRY(C178087vh c178087vh);

    boolean CRZ(C178307w4 c178307w4);

    Context getContext();

    static InterfaceC178067vf A00(AbstractC178807ws abstractC178807ws, C178087vh c178087vh) {
        InterfaceC178207vu interfaceC178207vu = abstractC178807ws.A00;
        interfaceC178207vu.getClass();
        InterfaceC178067vf Aq0 = interfaceC178207vu.Aq0(c178087vh);
        C14360o3.A07(Aq0);
        return Aq0;
    }

    static C9P6 A02(Object obj) {
        return (C9P6) ((AbstractC179687yI) obj).A00.Aq0(C9P6.A00);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.Aaf, X.7qS] */
    static C178647wc A01(InterfaceC178207vu interfaceC178207vu) {
        Context context = interfaceC178207vu.getContext();
        ?? obj = new Object();
        obj.A02 = context;
        return new C178647wc(interfaceC178207vu, obj);
    }
}
