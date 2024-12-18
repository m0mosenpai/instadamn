package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.8wO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C201918wO implements InterfaceC200208tP {
    public final Object A00;

    @Override // X.InterfaceC200208tP
    public final InterfaceC200208tP AKt(InterfaceC200438tm queue, Object value, ReferenceQueue entry) {
        return this;
    }

    @Override // X.InterfaceC200208tP
    public final InterfaceC200438tm B2N() {
        return null;
    }

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
    public final int CHT() {
        if (this instanceof C214219eL) {
            return ((C214219eL) this).A00;
        }
        return 1;
    }

    @Override // X.InterfaceC200208tP
    public final Object FDs() {
        return this.A00;
    }

    @Override // X.InterfaceC200208tP
    public final Object get() {
        return this.A00;
    }

    public C201918wO(Object referent) {
        this.A00 = referent;
    }
}
