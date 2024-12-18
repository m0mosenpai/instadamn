package X;

import android.content.Context;
import java.util.Iterator;
import java.util.NoSuchElementException;

@Deprecated
/* loaded from: classes4.dex */
public final class B0W implements Iterator, Iterable {
    public final Context A02;
    public final Object A03 = new Object();
    public int A00 = -1;
    public int A01 = 0;
    public final int[] A04 = new int[0];

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.A00 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A01, 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A01;
        int[] iArr = this.A04;
        if (i != 0) {
            this.A01 = i + 1;
            this.A00 = iArr[i];
            return this;
        }
        throw new NoSuchElementException("There were no registered Plugins for this Socket/PluginList combination.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public B0W(Context context) {
        this.A02 = context;
    }
}
