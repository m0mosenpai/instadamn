package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.B4h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C25007B4h extends WeakReference implements InterfaceC200208tP {
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
        if (this instanceof C214259eP) {
            return new C214259eP(queue, value, entry, ((C214259eP) this).A00);
        }
        return new C25007B4h(queue, value, entry);
    }

    @Override // X.InterfaceC200208tP
    public final InterfaceC200438tm B2N() {
        return this.A00;
    }

    @Override // X.InterfaceC200208tP
    public final int CHT() {
        if (this instanceof C214259eP) {
            return ((C214259eP) this).A00;
        }
        return 1;
    }

    public C25007B4h(InterfaceC200438tm queue, Object referent, ReferenceQueue entry) {
        super(referent, entry);
        this.A00 = queue;
    }

    @Override // X.InterfaceC200208tP
    public final Object FDs() {
        return get();
    }
}
