package X;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TTC implements Iterator, InterfaceC15590qF {
    public int A00;
    public final int A01;
    public final /* synthetic */ ReadableMapBuffer A02;

    public TTC(ReadableMapBuffer readableMapBuffer) {
        this.A02 = readableMapBuffer;
        this.A01 = readableMapBuffer.count - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC58319PtB.A1P(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        ReadableMapBuffer readableMapBuffer = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return new T0L(readableMapBuffer, readableMapBuffer.offsetToMapBuffer + 8 + (i * 12));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC58321PtD.A10();
    }
}
