package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* loaded from: classes4.dex */
public class B4g extends SoftReference implements InterfaceC200208tP {
    public final InterfaceC200438tm A00;

    @Override // X.InterfaceC200208tP
    public final void CtT(Object newValue) {
    }

    @Override // X.InterfaceC200208tP
    public final boolean isActive() {
        return true;
    }

    @Override // X.InterfaceC200208tP
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC200208tP
    public final InterfaceC200208tP AKt(InterfaceC200438tm queue, Object value, ReferenceQueue entry) {
        if (this instanceof C214199eJ) {
            return new C214199eJ(queue, value, entry, ((C214199eJ) this).A00);
        }
        return new B4g(queue, value, entry);
    }

    @Override // X.InterfaceC200208tP
    public final InterfaceC200438tm B2N() {
        return this.A00;
    }

    @Override // X.InterfaceC200208tP
    public final int CHT() {
        if (this instanceof C214199eJ) {
            return ((C214199eJ) this).A00;
        }
        return 1;
    }

    public B4g(InterfaceC200438tm queue, Object referent, ReferenceQueue entry) {
        super(referent, entry);
        this.A00 = queue;
    }

    @Override // X.InterfaceC200208tP
    public final Object FDs() {
        return get();
    }
}
