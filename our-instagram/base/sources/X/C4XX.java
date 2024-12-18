package X;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4XX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XX {
    public final int A00;
    public final C4WX A01;
    public final CopyOnWriteArrayList A02;
    public final long A03;

    public final void A02(C4B6 c4b6, final C98264b5 c98264b5, Object obj, int i, int i2, int i3, final int i4, long j, long j2) {
        final C98534bW c98534bW = new C98534bW(c4b6, obj, i, i2, i3, A00(this, j), A00(this, j2));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.WxG
                @Override // java.lang.Runnable
                public final void run() {
                    C4XX c4xx = this;
                    C4TW c4tw2 = c4tw;
                    C98264b5 c98264b52 = c98264b5;
                    C98534bW c98534bW2 = c98534bW;
                    int i5 = i4;
                    c4tw2.DPx(c98264b52, c98534bW2, c4xx.A01, c4xx.A00, i5);
                }
            });
        }
    }

    public final void A06(C4B6 c4b6, Object obj, int i, int i2, long j) {
        A0B(new C98534bW(c4b6, obj, 1, i, i2, A00(this, j), -9223372036854775807L));
    }

    public final void A09(final C98264b5 c98264b5, final C98534bW c98534bW, final IOException iOException, final boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.Tvi
                @Override // java.lang.Runnable
                public final void run() {
                    C4XX c4xx = this;
                    C4TW c4tw2 = c4tw;
                    C98264b5 c98264b52 = c98264b5;
                    C98534bW c98534bW2 = c98534bW;
                    IOException iOException2 = iOException;
                    boolean z2 = z;
                    c4tw2.DPg(c98264b52, c98534bW2, c4xx.A01, iOException2, c4xx.A00, z2);
                }
            });
        }
    }

    public final void A0A(final C98264b5 c98264b5, final C98534bW c98534bW, final Object obj, final Object obj2) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.4br
                @Override // java.lang.Runnable
                public final void run() {
                    C4XX c4xx = this;
                    c4tw.DPe(c98264b5, c98534bW, c4xx.A01, obj, obj2, c4xx.A00);
                }
            });
        }
    }

    public final void A01(C4B6 c4b6, C98264b5 c98264b5, IOException iOException, Object obj, int i, int i2, int i3, long j, long j2, boolean z) {
        A09(c98264b5, new C98534bW(c4b6, obj, i, i2, i3, A00(this, j), A00(this, j2)), iOException, z);
    }

    public final void A03(C4B6 c4b6, C98264b5 c98264b5, Object obj, int i, int i2, int i3, long j, long j2) {
        A07(c98264b5, new C98534bW(c4b6, obj, i, i2, i3, A00(this, j), A00(this, j2)));
    }

    public final void A04(C4B6 c4b6, C98264b5 c98264b5, Object obj, int i, int i2, int i3, long j, long j2) {
        A08(c98264b5, new C98534bW(c4b6, obj, i, i2, i3, A00(this, j), A00(this, j2)));
    }

    public final void A05(C4B6 c4b6, C98264b5 c98264b5, Object obj, Object obj2, Object obj3, int i, int i2, int i3, long j, long j2) {
        A0A(c98264b5, new C98534bW(c4b6, obj, i, i2, i3, A00(this, j), A00(this, j2)), obj2, obj3);
    }

    public final void A07(final C98264b5 c98264b5, final C98534bW c98534bW) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.5iO
                @Override // java.lang.Runnable
                public final void run() {
                    C4XX c4xx = this;
                    c4tw.DPa(c98264b5, c98534bW, c4xx.A01, c4xx.A00);
                }
            });
        }
    }

    public final void A08(final C98264b5 c98264b5, final C98534bW c98534bW) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.4bX
                @Override // java.lang.Runnable
                public final void run() {
                    C4XX c4xx = this;
                    c4tw.DPw(c98264b5, c98534bW, c4xx.A01, c4xx.A00);
                }
            });
        }
    }

    public final void A0B(final C98534bW c98534bW) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.4bp
                @Override // java.lang.Runnable
                public final void run() {
                    C4XX c4xx = this;
                    c4tw.DBr(c98534bW, c4xx.A01, c4xx.A00);
                }
            });
        }
    }

    public final void A0C(final C98534bW c98534bW) {
        final C4WX c4wx = this.A01;
        c4wx.getClass();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.Wwx
                @Override // java.lang.Runnable
                public final void run() {
                    C4XX c4xx = this;
                    c4tw.DxV(c98534bW, c4wx, c4xx.A00);
                }
            });
        }
    }

    public final void A0D(final InterfaceC98114aq interfaceC98114aq) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C96954Xf c96954Xf = (C96954Xf) it.next();
            final C4TW c4tw = c96954Xf.A01;
            Util.A0E(c96954Xf.A00, new Runnable() { // from class: X.WuO
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC98114aq.accept(c4tw);
                }
            });
        }
    }

    public C4XX(C4WX c4wx, CopyOnWriteArrayList copyOnWriteArrayList, int i, long j) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c4wx;
        this.A03 = j;
    }

    public static long A00(C4XX c4xx, long j) {
        long A08 = Util.A08(j);
        if (A08 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return c4xx.A03 + A08;
    }

    public C4XX() {
        this(null, new CopyOnWriteArrayList(), 0, 0L);
    }
}
