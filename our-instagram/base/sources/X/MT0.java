package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes9.dex */
public final class MT0 extends C0YY implements InterfaceC16620sF {
    public static final MT0 A00 = new MT0();

    public MT0() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C97 c97 = (C97) obj;
        Throwable th = (Throwable) obj2;
        C14360o3.A0B(c97, 0);
        if (c97 instanceof C50832MdP) {
            C73163Pr c73163Pr = ((C50832MdP) c97).A03;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            c73163Pr.A0X(th);
        }
        return C0eB.A00;
    }
}
