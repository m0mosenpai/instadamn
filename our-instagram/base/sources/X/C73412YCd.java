package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.YCd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73412YCd implements YRK {
    public boolean A00;
    public final YNt A01;
    public final C72825XoF A02;
    public final AtomicReference A03;

    @Override // X.YRK, X.YNq
    public final void APm(Object obj) {
        if (!this.A00) {
            try {
                this.A00 = true;
                AtomicReference atomicReference = this.A03;
                atomicReference.set(this.A01.ECl(atomicReference.get(), obj));
                this.A00 = false;
                this.A02.A00();
                return;
            } catch (Throwable th) {
                this.A00 = false;
                throw th;
            }
        }
        throw AbstractC166987dD.A18("Cannot dispatch in a reducer");
    }

    @Override // X.YRK
    public final Object getState() {
        return this.A03.get();
    }

    public C73412YCd(YNt yNt, C72825XoF c72825XoF, Object obj) {
        this.A03 = new AtomicReference(obj);
        this.A02 = c72825XoF;
        this.A01 = yNt;
    }
}
