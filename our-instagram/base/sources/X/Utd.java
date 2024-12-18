package X;

import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class Utd extends WL0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Surface A00;
    public SurfaceControl A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public final SurfaceView A07;
    public final X9Q A08;
    public final XLB A09;

    @Override // X.WL0, android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C14360o3.A0B(surfaceHolder, 0);
    }

    @Override // X.WL0, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Surface surface;
        Surface surface2;
        C14360o3.A0B(surfaceHolder, 0);
        C121745fS c121745fS = super.A02;
        if (c121745fS.A06) {
            surfaceHolder.getSurface().release();
        }
        if (c121745fS.A07 && (surface = super.A00) != null && surface.isValid() && this.A01.isValid() && (surface2 = super.A00) != null) {
            try {
                super.A01.A09(surface2);
                A00(this, c121745fS.A00, c121745fS.A01);
                return;
            } catch (Exception e) {
                this.A09.D7n(e);
            }
        }
        Surface surface3 = this.A00;
        if (surface3 == null) {
            surface3 = new Surface(this.A01);
        }
        super.A00 = surface3;
        X9Q x9q = this.A08;
        if (x9q != null) {
            x9q.setSurface(surface3);
        }
        if (this.A00 == null) {
            super.A00 = surface3;
            super.A01.A09(surface3);
        }
        super.A03.Dr5(surface3);
        this.A00 = null;
        Double d = c121745fS.A00;
        if (d == null) {
            d = this.A02;
        }
        A00(this, d, c121745fS.A01);
        this.A07.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public static final void A00(Utd utd, Double d, Integer num) {
        int i;
        int i2;
        Integer num2;
        int[] iArr;
        if (utd.A01.isValid()) {
            SurfaceView surfaceView = utd.A07;
            SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
            int width = surfaceView.getWidth();
            int height = surfaceView.getHeight();
            C121745fS c121745fS = ((WL0) utd).A02;
            if (d != null) {
                utd.A02 = Double.valueOf(d.doubleValue());
            }
            boolean z = false;
            if (width > 0 && height > 0 && num != null && d != null) {
                double doubleValue = d.doubleValue();
                int intValue = num.intValue();
                int i3 = height;
                int i4 = width;
                if (doubleValue <= 0.0d) {
                    iArr = new int[]{0, 0, 0, 0};
                } else {
                    double d2 = width;
                    double d3 = height;
                    double d4 = (d2 * 1.0d) / d3;
                    if (intValue != 3) {
                        if ((doubleValue < d4 && intValue == 2) || (doubleValue > d4 && intValue == 1)) {
                            i4 = (int) Math.ceil(d3 * doubleValue);
                        } else {
                            i3 = (int) Math.ceil(d2 / doubleValue);
                        }
                    }
                    iArr = new int[]{i4, i3, height, width};
                }
                i2 = iArr[0];
                i = iArr[1];
            } else {
                i = 0;
                i2 = 0;
            }
            Integer num3 = utd.A06;
            if ((num3 != null && i2 == num3.intValue() && (num2 = utd.A05) != null && i == num2.intValue()) || i2 == 0 || i == 0) {
                z = true;
            }
            boolean A0K = C14360o3.A0K(surfaceControl, utd.A01);
            if (A0K && z) {
                return;
            }
            C14360o3.A0B(c121745fS, 1);
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            boolean z2 = true;
            if (!A0K) {
                try {
                    transaction.reparent(utd.A01, surfaceControl);
                } catch (Exception e) {
                    if ((e instanceof NullPointerException) || c121745fS.A05) {
                        z2 = false;
                    } else {
                        throw e;
                    }
                }
            }
            if (!z) {
                utd.A06 = Integer.valueOf(i2);
                utd.A05 = Integer.valueOf(i);
                try {
                    transaction.setBufferSize(utd.A01, i2, i);
                } catch (Exception e2) {
                    if ((e2 instanceof NullPointerException) || c121745fS.A05) {
                        z2 = false;
                    } else {
                        throw e2;
                    }
                }
            }
            try {
                transaction.setVisibility(utd.A01, true);
            } catch (Exception e3) {
                if ((e3 instanceof NullPointerException) || c121745fS.A05) {
                    z2 = false;
                } else {
                    throw e3;
                }
            }
            SurfaceControl surfaceControl2 = utd.A01;
            if (z2 && surfaceControl2.isValid()) {
                try {
                    transaction.apply();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    transaction.close();
                    throw th;
                }
                transaction.close();
                return;
            }
            transaction.close();
        }
    }

    public final void A02() {
        if (!super.A02.A02) {
            Surface surface = super.A00;
            if (surface != null) {
                A01(surface);
            }
            super.A00 = null;
            X9Q x9q = this.A08;
            if (x9q != null) {
                x9q.setSurface(null);
            }
        }
        this.A01.release();
        AbstractC166997dE.A1K(this.A07, this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup.LayoutParams layoutParams = this.A07.getLayoutParams();
        if (layoutParams != null) {
            Integer num = this.A04;
            Integer num2 = this.A03;
            Double d = this.A02;
            if (d != null) {
                if (num != null && num2 != null) {
                    int intValue = num.intValue();
                    if (Math.abs(layoutParams.height - num2.intValue()) <= 5 && Math.abs(layoutParams.width - intValue) <= 5) {
                        return;
                    }
                }
                this.A04 = Integer.valueOf(layoutParams.width);
                this.A03 = Integer.valueOf(layoutParams.height);
                A00(this, d, super.A02.A01);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utd(SurfaceControl surfaceControl, SurfaceView surfaceView, C4RP c4rp, C121745fS c121745fS, X9Q x9q, XLB xlb) {
        super(c4rp, c121745fS, xlb);
        AbstractC167017dG.A1R(c121745fS, surfaceView);
        this.A07 = surfaceView;
        this.A01 = surfaceControl;
        this.A09 = xlb;
        this.A08 = x9q;
    }

    public final void A03(SurfaceControl surfaceControl) {
        this.A01 = surfaceControl;
    }

    @Override // X.WL0, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        A02();
    }
}
