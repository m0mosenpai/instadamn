package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TT4 implements Iterator {
    public Object A00;
    public final int A01 = 0;
    public final Object A02;

    public TT4(TZ2 tz2) {
        this.A02 = tz2;
        this.A00 = tz2.A00.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return ((Iterator) this.A00).hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return ((Iterator) this.A00).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A01;
        throw AbstractC43592JPx.A11();
    }

    public TT4(final TZ7 this$0) {
        this.A02 = this$0;
        this.A00 = this$0.A00.iterator();
    }

    public TT4(TZ9 tz9) {
        this.A02 = tz9;
        this.A00 = tz9.A00.iterator();
    }

    public TT4(TZB tzb) {
        this.A02 = tzb;
        this.A00 = tzb.A00.iterator();
    }
}
