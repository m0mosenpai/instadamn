package X;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WyE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71662WyE implements Iterator, InterfaceC15590qF {
    public int A00;
    public final /* synthetic */ SerialDescriptor A01;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(30));
    }

    public C71662WyE(SerialDescriptor serialDescriptor) {
        this.A01 = serialDescriptor;
        this.A00 = serialDescriptor.B10();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1O(this.A00);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        SerialDescriptor serialDescriptor = this.A01;
        int B10 = serialDescriptor.B10();
        int i = this.A00;
        this.A00 = i - 1;
        return serialDescriptor.B0v(B10 - i);
    }
}
