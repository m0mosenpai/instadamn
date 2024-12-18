package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.0jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11640jN {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final C06860Yd A03;

    public final void A00() {
        C06860Yd c06860Yd = this.A03;
        C06860Yd c06860Yd2 = C06860Yd.A0D;
        if (c06860Yd.A03 == this.A02) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void A01() {
        while (true) {
            int i = this.A00;
            C06860Yd c06860Yd = this.A03;
            C06860Yd c06860Yd2 = C06860Yd.A0D;
            if (i < c06860Yd.A01 && c06860Yd.A0A[i] < 0) {
                this.A00 = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        int i = this.A00;
        C06860Yd c06860Yd = this.A03;
        C06860Yd c06860Yd2 = C06860Yd.A0D;
        if (i >= c06860Yd.A01) {
            return false;
        }
        return true;
    }

    public AbstractC11640jN(C06860Yd c06860Yd) {
        this.A03 = c06860Yd;
        C06860Yd c06860Yd2 = C06860Yd.A0D;
        this.A02 = c06860Yd.A03;
        A01();
    }

    public final void remove() {
        A00();
        if (this.A01 != -1) {
            C06860Yd c06860Yd = this.A03;
            c06860Yd.A05();
            C06860Yd.A03(c06860Yd, this.A01);
            this.A01 = -1;
            this.A02 = c06860Yd.A03;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
