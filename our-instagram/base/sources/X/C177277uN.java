package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;

/* renamed from: X.7uN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177277uN implements InterfaceC174927qS {
    public int A00;
    public int A01;
    public C175007qa A02;
    public C174797qF A03;
    public int A04;
    public int A05;
    public TextureView A06;
    public boolean A07 = true;
    public final View.OnAttachStateChangeListener A09 = new View.OnAttachStateChangeListener() { // from class: X.7uO
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            OrientationEventListener orientationEventListener = C177277uN.this.A02.A01;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
        }
    };
    public final TextureView.SurfaceTextureListener A08 = new TextureViewSurfaceTextureListenerC177297uP(this);

    @Override // X.InterfaceC174927qS
    public final void Bfi(AbstractC184688Hj abstractC184688Hj, int i, int i2) {
    }

    @Override // X.InterfaceC174927qS
    public final Bitmap Bfm() {
        Bitmap bitmap = null;
        try {
            Bitmap bitmap2 = this.A06.getBitmap();
            if (bitmap2 == null) {
                return null;
            }
            if (this.A02.A0L != EnumC177227uI.CAMERA1 && this.A07) {
                int width = getWidth();
                int height = getHeight();
                Matrix transform = this.A06.getTransform(null);
                C0fK.A03(bitmap2);
                bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, transform, true);
                return bitmap;
            }
            return bitmap2;
        } catch (OutOfMemoryError | RuntimeException unused) {
            return bitmap;
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
    public final boolean CQM() {
        TextureView textureView = this.A06;
        if (textureView == null) {
            return false;
        }
        if (textureView.isAvailable()) {
            if (this.A01 == 0 || this.A00 == 0) {
                this.A01 = getWidth();
                this.A00 = getHeight();
                C175007qa c175007qa = this.A02;
                c175007qa.A0R.A00(c175007qa.A0S).Dic(this.A06.getSurfaceTexture(), this.A01, this.A00);
            }
            return true;
        }
        this.A06.requestLayout();
        return false;
    }

    @Override // X.InterfaceC174927qS
    public final boolean CWm() {
        if (!this.A02.A0G && this.A06.isAvailable() && this.A02.A0E && this.A06.isAttachedToWindow()) {
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
    public final void Eg8(Matrix matrix) {
        if (this.A07) {
            this.A06.setTransform(matrix);
        }
    }

    @Override // X.InterfaceC174927qS
    public final void Eh1(View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            this.A06 = textureView;
            textureView.addOnAttachStateChangeListener(this.A09);
            this.A06.setSurfaceTextureListener(this.A08);
            return;
        }
        throw new IllegalArgumentException("Camera view must be a TextureView");
    }

    @Override // X.InterfaceC174927qS
    public final Context getContext() {
        return this.A06.getContext();
    }

    @Override // X.InterfaceC174927qS
    public final int getHeight() {
        if (this.A06.getHeight() > 0) {
            return this.A06.getHeight();
        }
        return this.A04;
    }

    @Override // X.InterfaceC174927qS
    public final View getView() {
        return this.A06;
    }

    @Override // X.InterfaceC174927qS
    public final int getWidth() {
        if (this.A06.getWidth() > 0) {
            return this.A06.getWidth();
        }
        return this.A05;
    }

    @Override // X.InterfaceC174927qS
    public final void release() {
        TextureView textureView = this.A06;
        if (textureView != null) {
            textureView.removeOnAttachStateChangeListener(this.A09);
            this.A06.setSurfaceTextureListener(null);
        }
    }

    public C177277uN(View view, InterfaceC174927qS interfaceC174927qS) {
        this.A05 = interfaceC174927qS.Ak9();
        this.A04 = interfaceC174927qS.Ak8();
        Eh1(view);
    }

    @Override // X.InterfaceC174927qS
    public final void EQz(C175007qa c175007qa) {
        this.A02 = c175007qa;
    }

    @Override // X.InterfaceC174927qS
    public final void Ea1(C174797qF c174797qF) {
        this.A03 = c174797qF;
    }

    @Override // X.InterfaceC174927qS
    public final void EgA(boolean z) {
        this.A07 = z;
    }

    public C177277uN() {
    }
}
