package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.IOException;

/* renamed from: X.2nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59252nR extends Drawable implements InterfaceC59242nQ, Drawable.Callback {
    public static final /* synthetic */ C0YR[] A0O = {new AnonymousClass013(C59252nR.class, "dataSource", "getDataSource()Lcom/facebook/datasource/DataSource;", 0), new AnonymousClass013(C59252nR.class, "closeable", "getCloseable()Ljava/io/Closeable;", 0)};
    public long A00;
    public Rect A01;
    public C2nP A02;
    public C59322nb A03;
    public C59322nb A04;
    public Object A05;
    public boolean A06;
    public int A07;
    public int A08;
    public ColorFilter A09;
    public InterfaceC107934tc A0A;
    public Runnable A0B;
    public boolean A0C;
    public final C2nW A0D;
    public final C2nS A0E;
    public final C59272nV A0F;
    public final C59322nb A0G;
    public final C59322nb A0H;
    public final C59322nb A0I;
    public final RunnableC59302nZ A0J;
    public final InterfaceC16820sZ A0K;
    public final InterfaceC16820sZ A0L;
    public final C1W8 A0M;
    public final InterfaceC16660sJ A0N;

    private final void A00(Rect rect) {
        if (rect != null) {
            C59322nb c59322nb = this.A0I;
            AbstractC59442nn abstractC59442nn = c59322nb.A04;
            C59182nJ c59182nJ = c59322nb.A03;
            c59322nb.A01(c59322nb.A01, rect, c59322nb.A0A.A01, c59182nJ, abstractC59442nn);
            C59322nb c59322nb2 = this.A0G;
            AbstractC59442nn abstractC59442nn2 = c59322nb2.A04;
            C59182nJ c59182nJ2 = c59322nb2.A03;
            c59322nb2.A01(c59322nb2.A01, rect, c59322nb2.A0A.A01, c59182nJ2, abstractC59442nn2);
            C59322nb c59322nb3 = this.A04;
            if (c59322nb3 != null) {
                AbstractC59442nn abstractC59442nn3 = c59322nb3.A04;
                C59182nJ c59182nJ3 = c59322nb3.A03;
                c59322nb3.A01(c59322nb3.A01, rect, c59322nb3.A0A.A01, c59182nJ3, abstractC59442nn3);
            }
            C59322nb c59322nb4 = this.A0H;
            AbstractC59442nn abstractC59442nn4 = c59322nb4.A04;
            C59182nJ c59182nJ4 = c59322nb4.A03;
            c59322nb4.A01(c59322nb4.A01, rect, c59322nb4.A0A.A01, c59182nJ4, abstractC59442nn4);
            C59322nb c59322nb5 = this.A03;
            if (c59322nb5 != null) {
                AbstractC59442nn abstractC59442nn5 = c59322nb5.A04;
                C59182nJ c59182nJ5 = c59322nb5.A03;
                c59322nb5.A01(c59322nb5.A01, rect, c59322nb5.A0A.A01, c59182nJ5, abstractC59442nn5);
            }
            this.A0C = true;
        }
    }

    @Override // X.InterfaceC59242nQ
    public final void EZQ(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        InterfaceC16660sJ interfaceC16660sJ;
        InterfaceC16660sJ interfaceC16660sJ2;
        C14360o3.A0B(canvas, 0);
        if (!this.A0C) {
            A00(getBounds());
        }
        InterfaceC16660sJ interfaceC16660sJ3 = this.A0I.A05;
        if (interfaceC16660sJ3 != null) {
            interfaceC16660sJ3.invoke(canvas);
        }
        InterfaceC16660sJ interfaceC16660sJ4 = this.A0G.A05;
        if (interfaceC16660sJ4 != null) {
            interfaceC16660sJ4.invoke(canvas);
        }
        C59322nb c59322nb = this.A04;
        if (c59322nb != null && (interfaceC16660sJ2 = c59322nb.A05) != null) {
            interfaceC16660sJ2.invoke(canvas);
        }
        InterfaceC16660sJ interfaceC16660sJ5 = this.A0H.A05;
        if (interfaceC16660sJ5 != null) {
            interfaceC16660sJ5.invoke(canvas);
        }
        C59322nb c59322nb2 = this.A03;
        if (c59322nb2 != null && (interfaceC16660sJ = c59322nb2.A05) != null) {
            interfaceC16660sJ.invoke(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final void A01() {
        C2nP c2nP = this.A02;
        if (c2nP != null) {
            this.A0E.Dec(AbstractC59372ng.A00(null, null, this), c2nP, this.A00);
        }
        C27511Ve.A07.A00(this);
        this.A00 = 0L;
        C2nW c2nW = this.A0D;
        C0YR[] c0yrArr = A0O;
        c2nW.Egi(this, null, c0yrArr[1]);
        Egi(this, null, c0yrArr[0]);
        this.A02 = null;
        this.A05 = null;
        this.A08 = -1;
        this.A07 = -1;
        this.A0I.A02(true);
        this.A0G.A02(true);
        C59322nb c59322nb = this.A04;
        if (c59322nb != null) {
            c59322nb.A02(true);
        }
        this.A0H.A02(true);
        C59322nb c59322nb2 = this.A03;
        if (c59322nb2 != null) {
            c59322nb2.A02(true);
        }
        this.A0C = false;
        C2nS c2nS = this.A0E;
        try {
            c2nS.A02 = null;
        } catch (IOException unused) {
        }
        c2nS.A02 = null;
    }

    @Override // X.InterfaceC59242nQ
    public final Drawable AZ0() {
        AbstractC59442nn abstractC59442nn = this.A0G.A04;
        if (abstractC59442nn instanceof C59432nm) {
            return ((C59432nm) abstractC59442nn).A02;
        }
        return null;
    }

    @Override // X.InterfaceC59242nQ
    public final Object Ajt() {
        return this.A05;
    }

    @Override // X.InterfaceC59242nQ
    public final long BGi() {
        return this.A00;
    }

    @Override // X.InterfaceC59242nQ
    public final C2nP BGo() {
        return this.A02;
    }

    @Override // X.InterfaceC59242nQ
    public final Runnable Bm6() {
        return this.A0B;
    }

    @Override // X.InterfaceC59242nQ
    public final boolean CL2() {
        if (this.A0G.A04 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC59242nQ
    public final boolean CUk() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A07;
        if (i == -1) {
            return super.getIntrinsicHeight();
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.A08;
        if (i == -1) {
            return super.getIntrinsicWidth();
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0I.A00(i);
        this.A0G.A00(i);
        C59322nb c59322nb = this.A04;
        if (c59322nb != null) {
            c59322nb.A00(i);
        }
        this.A0H.A00(i);
        C59322nb c59322nb2 = this.A03;
        if (c59322nb2 != null) {
            c59322nb2.A00(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        InterfaceC107934tc interfaceC107934tc = this.A0A;
        if (interfaceC107934tc != null) {
            interfaceC107934tc.E1A(z);
        }
        return super.setVisible(z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2nV] */
    public C59252nR(C1W8 c1w8) {
        this.A0M = c1w8;
        this.A0E = new C2nS();
        this.A0F = new C2nW() { // from class: X.2nV
            {
                InterfaceC16660sJ interfaceC16660sJ = AbstractC59282nX.A00;
            }
        };
        C27511Ve c27511Ve = C27511Ve.A07;
        this.A0J = new RunnableC59302nZ(this);
        this.A08 = -1;
        this.A07 = -1;
        C206999Ee c206999Ee = new C206999Ee(this, 17);
        this.A0N = c206999Ee;
        this.A0D = new C2nW(c206999Ee);
        C206859Dq c206859Dq = new C206859Dq(this, 5);
        this.A0K = c206859Dq;
        C206859Dq c206859Dq2 = new C206859Dq(this, 6);
        this.A0L = c206859Dq2;
        this.A0I = new C59322nb(c206859Dq, c206859Dq2);
        this.A0G = new C59322nb(this.A0K, this.A0L);
        this.A0H = new C59322nb(this.A0K, this.A0L);
    }

    @Override // X.InterfaceC59242nQ
    public final void EcP(Runnable runnable) {
        this.A0B = runnable;
    }

    @Override // X.InterfaceC59242nQ
    public final void EhD(InterfaceC107934tc interfaceC107934tc) {
        this.A0A = interfaceC107934tc;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09 = colorFilter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1W8, java.lang.Object] */
    public C59252nR() {
        this(new Object());
    }
}
