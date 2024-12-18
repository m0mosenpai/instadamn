package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.util.List;

/* renamed from: X.5Pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116665Pv implements C4TW, C4WA {
    public final C116485Pd A00;
    public final /* synthetic */ C5PR A01;

    private Pair A00(C4WX c4wx, int i) {
        C4WX c4wx2 = null;
        if (c4wx != null) {
            C116485Pd c116485Pd = this.A00;
            int i2 = 0;
            while (true) {
                List list = c116485Pd.A04;
                if (i2 >= list.size()) {
                    return null;
                }
                if (((C4WY) list.get(i2)).A03 == c4wx.A03) {
                    Object obj = c4wx.A04;
                    Object obj2 = c116485Pd.A03;
                    Timeline timeline = Timeline.A00;
                    c4wx2 = c4wx.A00(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i + this.A00.A00), c4wx2);
    }

    @Override // X.C4TW
    public final void DPe(final C98264b5 c98264b5, final C98534bW c98534bW, C4WX c4wx, final Object obj, final Object obj2, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.5TB
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    C98264b5 c98264b52 = c98264b5;
                    C98534bW c98534bW2 = c98534bW;
                    Object obj3 = obj;
                    Object obj4 = obj2;
                    c116665Pv.A01.A04.DPe(c98264b52, c98534bW2, (C4WX) pair.second, obj3, obj4, ((Number) pair.first).intValue());
                }
            });
        }
    }

    @Override // X.C4TW
    public final void DPg(final C98264b5 c98264b5, final C98534bW c98534bW, C4WX c4wx, final IOException iOException, int i, final boolean z) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.YIo
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    C98264b5 c98264b52 = c98264b5;
                    C98534bW c98534bW2 = c98534bW;
                    IOException iOException2 = iOException;
                    boolean z2 = z;
                    c116665Pv.A01.A04.DPg(c98264b52, c98534bW2, (C4WX) pair.second, iOException2, AbstractC166987dD.A0H(pair.first), z2);
                }
            });
        }
    }

    @Override // X.C4TW
    public final /* synthetic */ void DPx(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, int i, int i2) {
    }

    public C116665Pv(C116485Pd c116485Pd, C5PR c5pr) {
        this.A01 = c5pr;
        this.A00 = c116485Pd;
    }

    @Override // X.C4TW
    public final void DBr(final C98534bW c98534bW, C4WX c4wx, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.5TK
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    C98534bW c98534bW2 = c98534bW;
                    c116665Pv.A01.A04.DBr(c98534bW2, (C4WX) pair.second, ((Number) pair.first).intValue());
                }
            });
        }
    }

    @Override // X.C4WA
    public final void DCU(C4WX c4wx, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.YHM
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    c116665Pv.A01.A04.DCU((C4WX) pair.second, AbstractC166987dD.A0H(pair.first));
                }
            });
        }
    }

    @Override // X.C4WA
    public final void DCV(C4WX c4wx, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.YHN
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    c116665Pv.A01.A04.DCV((C4WX) pair.second, AbstractC166987dD.A0H(pair.first));
                }
            });
        }
    }

    @Override // X.C4WA
    public final void DCW(C4WX c4wx, int i, final int i2) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.YII
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    int i3 = i2;
                    c116665Pv.A01.A04.DCW((C4WX) pair.second, AbstractC166987dD.A0H(pair.first), i3);
                }
            });
        }
    }

    @Override // X.C4WA
    public final void DCX(C4WX c4wx, final Exception exc, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.YIK
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    Exception exc2 = exc;
                    c116665Pv.A01.A04.DCX((C4WX) pair.second, exc2, AbstractC166987dD.A0H(pair.first));
                }
            });
        }
    }

    @Override // X.C4WA
    public final void DCY(C4WX c4wx, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.YHO
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    c116665Pv.A01.A04.DCY((C4WX) pair.second, AbstractC166987dD.A0H(pair.first));
                }
            });
        }
    }

    @Override // X.C4TW
    public final void DPa(final C98264b5 c98264b5, final C98534bW c98534bW, C4WX c4wx, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.XN3
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    C98264b5 c98264b52 = c98264b5;
                    C98534bW c98534bW2 = c98534bW;
                    c116665Pv.A01.A04.DPa(c98264b52, c98534bW2, (C4WX) pair.second, AbstractC166987dD.A0H(pair.first));
                }
            });
        }
    }

    @Override // X.C4TW
    public final void DPw(final C98264b5 c98264b5, final C98534bW c98534bW, C4WX c4wx, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.5T7
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    C98264b5 c98264b52 = c98264b5;
                    C98534bW c98534bW2 = c98534bW;
                    c116665Pv.A01.A04.DPw(c98264b52, c98534bW2, (C4WX) pair.second, ((Number) pair.first).intValue());
                }
            });
        }
    }

    @Override // X.C4TW
    public final void DxV(final C98534bW c98534bW, C4WX c4wx, int i) {
        final Pair A00 = A00(c4wx, i);
        if (A00 != null) {
            InterfaceC96774Wm interfaceC96774Wm = this.A01.A05;
            ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.YIJ
                @Override // java.lang.Runnable
                public final void run() {
                    C116665Pv c116665Pv = this;
                    Pair pair = A00;
                    C98534bW c98534bW2 = c98534bW;
                    C4W8 c4w8 = c116665Pv.A01.A04;
                    int A0H = AbstractC166987dD.A0H(pair.first);
                    Object obj = pair.second;
                    obj.getClass();
                    c4w8.DxV(c98534bW2, (C4WX) obj, A0H);
                }
            });
        }
    }
}
