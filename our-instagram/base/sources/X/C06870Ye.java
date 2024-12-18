package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06870Ye extends AbstractC11640jN implements Iterator, C0s1 {
    @Override // java.util.Iterator
    public final Object next() {
        A00();
        int i = this.A00;
        C06860Yd c06860Yd = this.A03;
        C06860Yd c06860Yd2 = C06860Yd.A0D;
        if (i < c06860Yd.A01) {
            this.A00 = i + 1;
            this.A01 = i;
            Object[] objArr = c06860Yd.A0C;
            C14360o3.A0A(objArr);
            Object obj = objArr[this.A01];
            A01();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
