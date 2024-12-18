package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.2bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53052bm implements Iterator, InterfaceC15590qF {
    public int A00 = -2;
    public Object A01;
    public final /* synthetic */ C53042bl A02;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C53052bm(C53042bl c53042bl) {
        this.A02 = c53042bl;
    }

    private final void A00() {
        Object invoke;
        int i = this.A00;
        C53042bl c53042bl = this.A02;
        if (i == -2) {
            invoke = c53042bl.A00.invoke();
        } else {
            InterfaceC16660sJ interfaceC16660sJ = c53042bl.A01;
            Object obj = this.A01;
            C14360o3.A0A(obj);
            invoke = interfaceC16660sJ.invoke(obj);
        }
        this.A01 = invoke;
        int i2 = 1;
        if (invoke == null) {
            i2 = 0;
        }
        this.A00 = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            C14360o3.A0C(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.A00 = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
