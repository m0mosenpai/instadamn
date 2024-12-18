package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.OrientationEventListener;
import android.view.PixelCopy;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* renamed from: X.7qR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174917qR implements InterfaceC174927qS {
    public SurfaceView A00;
    public C175007qa A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05;
    public final View.OnAttachStateChangeListener A07 = new View.OnAttachStateChangeListener() { // from class: X.7qT
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            OrientationEventListener orientationEventListener = C174917qR.this.A01.A01;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
        }
    };
    public final SurfaceHolder.Callback A06 = new SurfaceHolder.Callback() { // from class: X.7qU
        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C174917qR c174917qR = C174917qR.this;
            C175007qa c175007qa = c174917qR.A01;
            if (!c175007qa.A0G && c174917qR.A03) {
                c175007qa.A0R.A00(c175007qa.A0S).Dib(i2, i3);
                c174917qR.A01.A05();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C174917qR c174917qR = C174917qR.this;
            C175007qa c175007qa = c174917qR.A01;
            if (!c175007qa.A0G) {
                if (!c174917qR.A03) {
                    c174917qR.A03 = true;
                    c175007qa.A0R.A00(c175007qa.A0S).Did(surfaceHolder.getSurface(), c174917qR.A00.getWidth(), c174917qR.A00.getHeight());
                }
                if (c174917qR.A02) {
                    c174917qR.A02 = false;
                    c174917qR.A01.A03();
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C174917qR c174917qR = C174917qR.this;
            if (c174917qR.A03) {
                c174917qR.A03 = false;
                C175007qa c175007qa = c174917qR.A01;
                c175007qa.A0R.A00(c175007qa.A0S).Dif(surfaceHolder.getSurface());
            }
        }
    };

    @Override // X.InterfaceC174927qS
    public final Bitmap Bfm() {
        return null;
    }

    @Override // X.InterfaceC174927qS
    public final void Ea1(C174797qF c174797qF) {
    }

    @Override // X.InterfaceC174927qS
    public final void Eg8(Matrix matrix) {
    }

    @Override // X.InterfaceC174927qS
    public final void EgA(boolean z) {
    }

    @Override // X.InterfaceC174927qS
    public final void release() {
        this.A02 = false;
        SurfaceView surfaceView = this.A00;
        if (surfaceView != null) {
            surfaceView.removeOnAttachStateChangeListener(this.A07);
            this.A00.getHolder().removeCallback(this.A06);
        }
    }

    @Override // X.InterfaceC174927qS
    public final int Ak8() {
        return this.A04;
    }

    @Override // X.InterfaceC174927qS
    public final int Ak9() {
        return this.A05;
    }

    @Override // X.InterfaceC174927qS
    public final void Bfi(final AbstractC184688Hj abstractC184688Hj, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            try {
                i = this.A00.getWidth();
                i2 = this.A00.getHeight();
            } catch (Throwable th) {
                abstractC184688Hj.A01(new IllegalStateException("Failed to acquire bitmap", th));
                return;
            }
        }
        final Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView = this.A00;
        PixelCopy.request(surfaceView, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.8nT
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i3) {
                Bitmap bitmap = createBitmap;
                AbstractC184688Hj abstractC184688Hj2 = abstractC184688Hj;
                if (i3 != 0) {
                    bitmap.eraseColor(-12303292);
                }
                abstractC184688Hj2.A02(bitmap);
            }
        }, surfaceView.getHandler());
    }

    @Override // X.InterfaceC174927qS
    public final boolean CQM() {
        SurfaceView surfaceView = this.A00;
        if (surfaceView != null) {
            this.A02 = true;
            SurfaceHolder holder = surfaceView.getHolder();
            if (holder.getSurface() != null && holder.getSurface().isValid()) {
                this.A06.surfaceCreated(holder);
            }
        }
        return false;
    }

    @Override // X.InterfaceC174927qS
    public final boolean CWm() {
        C175007qa c175007qa = this.A01;
        if (!c175007qa.A0G && this.A03 && c175007qa.A0E && this.A00.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC174927qS
    public final void ER0(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    @Override // X.InterfaceC174927qS
    public final void Eh1(View view) {
        if (view instanceof SurfaceView) {
            this.A02 = false;
            SurfaceView surfaceView = (SurfaceView) view;
            this.A00 = surfaceView;
            surfaceView.addOnAttachStateChangeListener(this.A07);
            this.A00.getHolder().addCallback(this.A06);
            return;
        }
        throw new IllegalArgumentException("Camera view must be a SurfaceView");
    }

    @Override // X.InterfaceC174927qS
    public final Context getContext() {
        return this.A00.getContext();
    }

    @Override // X.InterfaceC174927qS
    public final int getHeight() {
        if (this.A00.getHeight() > 0) {
            return this.A00.getHeight();
        }
        return this.A04;
    }

    @Override // X.InterfaceC174927qS
    public final View getView() {
        return this.A00;
    }

    @Override // X.InterfaceC174927qS
    public final int getWidth() {
        if (this.A00.getWidth() > 0) {
            return this.A00.getWidth();
        }
        return this.A05;
    }

    public C174917qR(View view, InterfaceC174927qS interfaceC174927qS) {
        this.A05 = interfaceC174927qS.Ak9();
        this.A04 = interfaceC174927qS.Ak8();
        Eh1(view);
    }

    @Override // X.InterfaceC174927qS
    public final void EQz(C175007qa c175007qa) {
        this.A01 = c175007qa;
    }

    public C174917qR() {
    }
}
