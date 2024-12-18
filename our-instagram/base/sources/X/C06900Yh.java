package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06900Yh extends AbstractC11640jN implements Iterator, C0s1 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        A00();
        int i = this.A00;
        C06860Yd c06860Yd = this.A03;
        C06860Yd c06860Yd2 = C06860Yd.A0D;
        if (i < c06860Yd.A01) {
            this.A00 = i + 1;
            this.A01 = i;
            C06890Yg c06890Yg = new C06890Yg(c06860Yd, i);
            A01();
            return c06890Yg;
        }
        throw new NoSuchElementException();
    }
}
