package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4XY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XY {
    public final int A00;
    public final C4WX A01;
    public final CopyOnWriteArrayList A02;

    public final void A00() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C97054Xq c97054Xq = (C97054Xq) it.next();
            final C4WA c4wa = c97054Xq.A01;
            Util.A0E(c97054Xq.A00, new Runnable() { // from class: X.YHQ
                @Override // java.lang.Runnable
                public final void run() {
                    C4XY c4xy = C4XY.this;
                    c4wa.DCU(c4xy.A01, c4xy.A00);
                }
            });
        }
    }

    public final void A01() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C97054Xq c97054Xq = (C97054Xq) it.next();
            final C4WA c4wa = c97054Xq.A01;
            Util.A0E(c97054Xq.A00, new Runnable() { // from class: X.YHR
                @Override // java.lang.Runnable
                public final void run() {
                    C4XY c4xy = C4XY.this;
                    c4wa.DCV(c4xy.A01, c4xy.A00);
                }
            });
        }
    }

    public final void A02() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C97054Xq c97054Xq = (C97054Xq) it.next();
            final C4WA c4wa = c97054Xq.A01;
            Util.A0E(c97054Xq.A00, new Runnable() { // from class: X.YHP
                @Override // java.lang.Runnable
                public final void run() {
                    C4XY c4xy = C4XY.this;
                    c4wa.DCY(c4xy.A01, c4xy.A00);
                }
            });
        }
    }

    public final void A03(final int i) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C97054Xq c97054Xq = (C97054Xq) it.next();
            final C4WA c4wa = c97054Xq.A01;
            Util.A0E(c97054Xq.A00, new Runnable() { // from class: X.YIM
                @Override // java.lang.Runnable
                public final void run() {
                    C4XY c4xy = C4XY.this;
                    C4WA c4wa2 = c4wa;
                    int i2 = i;
                    c4wa2.DCW(c4xy.A01, c4xy.A00, i2);
                }
            });
        }
    }

    public final void A04(final Exception exc) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C97054Xq c97054Xq = (C97054Xq) it.next();
            final C4WA c4wa = c97054Xq.A01;
            Util.A0E(c97054Xq.A00, new Runnable() { // from class: X.YIL
                @Override // java.lang.Runnable
                public final void run() {
                    C4XY c4xy = C4XY.this;
                    c4wa.DCX(c4xy.A01, exc, c4xy.A00);
                }
            });
        }
    }

    public C4XY(C4WX c4wx, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c4wx;
    }

    public C4XY() {
        this(null, new CopyOnWriteArrayList(), 0);
    }
}
