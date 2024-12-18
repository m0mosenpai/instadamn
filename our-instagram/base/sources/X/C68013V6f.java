package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.V6f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68013V6f extends AbstractRunnableC14200nk {
    public final /* synthetic */ C71160Wov A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    @Override // java.lang.Runnable
    public final void run() {
        C71160Wov c71160Wov = this.A00;
        C66055Tys c66055Tys = (C66055Tys) c71160Wov.A08.getValue();
        AtomicBoolean atomicBoolean = c71160Wov.A05;
        boolean z = atomicBoolean.get();
        Integer num = this.A01;
        C14360o3.A0B(num, 1);
        if (c66055Tys.A0B) {
            C66055Tys.A01(c66055Tys, num, z);
        }
        c71160Wov.A06.set(false);
        atomicBoolean.set(false);
        this.A02.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68013V6f(C71160Wov c71160Wov, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        super(803851324, 1, false, false);
        this.A00 = c71160Wov;
        this.A01 = num;
        this.A02 = interfaceC16820sZ;
    }
}
