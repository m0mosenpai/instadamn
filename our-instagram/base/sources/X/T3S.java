package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class T3S implements InterfaceC65388TjL {
    public final int A00;
    public final Object A01;

    public T3S(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65388TjL
    public final /* bridge */ /* synthetic */ void Dgi(Object obj, String str, Throwable th) {
        C62678SLr A01;
        AtomicReference atomicReference;
        C60619REe c60619REe;
        switch (this.A00) {
            case 0:
                ((InterfaceC65622ToD) this.A01).resolve(obj);
                return;
            case 1:
                C60619REe c60619REe2 = (C60619REe) this.A01;
                if (obj != null) {
                    A01 = SSG.A00(new SEC(obj, th));
                } else {
                    A01 = SSG.A01(th);
                }
                atomicReference = c60619REe2.A03;
                c60619REe = c60619REe2;
                atomicReference.set(A01);
                c60619REe.A03(A01);
                return;
            default:
                C60620REf c60620REf = (C60620REf) this.A01;
                if (obj != null) {
                    A01 = SSG.A00(new SEC(obj, th));
                } else {
                    A01 = SSG.A01(th);
                }
                atomicReference = c60620REf.A03;
                c60619REe = c60620REf;
                atomicReference.set(A01);
                c60619REe.A03(A01);
                return;
        }
    }
}
