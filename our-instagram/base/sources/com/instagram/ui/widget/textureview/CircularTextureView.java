package com.instagram.ui.widget.textureview;

import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.C05F;
import X.C0f9;
import X.C18C;
import X.C69165Viu;
import X.U9D;
import X.W3I;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes11.dex */
public class CircularTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public float A00;
    public float A01;
    public Rect A02;
    public TextureView.SurfaceTextureListener A03;
    public W3I A04;
    public boolean A05;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        W3I w3i = this.A04;
        if (w3i != null) {
            U9D u9d = w3i.A06;
            u9d.sendMessageAtFrontOfQueue(u9d.obtainMessage(3));
            this.A04 = null;
        }
        this.A05 = false;
        return true;
    }

    public void setIsMirrored(boolean z) {
        W3I w3i = this.A04;
        w3i.getClass();
        w3i.A0C = z;
    }

    public CircularTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = false;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        setOpaque(false);
    }

    private void A00(SurfaceTexture surfaceTexture, int i, int i2) {
        C18C.A0E(AbstractC167007dF.A1P(i, i2));
        W3I w3i = new W3I();
        this.A04 = w3i;
        w3i.A05 = C05F.A0Y;
        w3i.A09 = i;
        w3i.A08 = i2;
        w3i.A0A = new Rect(0, 0, w3i.A09, w3i.A08);
        this.A04.A0B = new C69165Viu(this, i, i2);
        W3I w3i2 = this.A04;
        AbstractC58318PtA.A1F(w3i2.A06, new Surface(surfaceTexture), 1);
    }

    public final boolean A01() {
        W3I w3i;
        if (super.isAvailable() && this.A05 && (w3i = this.A04) != null && w3i.A01 != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.TextureView
    public SurfaceTexture getSurfaceTexture() {
        if (A01()) {
            W3I w3i = this.A04;
            w3i.getClass();
            return w3i.A01;
        }
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-769432212);
        super.onAttachedToWindow();
        if (super.isAvailable()) {
            SurfaceTexture surfaceTexture = super.getSurfaceTexture();
            surfaceTexture.getClass();
            A00(surfaceTexture, super.getWidth(), super.getHeight());
        } else {
            super.setSurfaceTextureListener(this);
        }
        C0f9.A0D(1823821905, A06);
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.A03 = surfaceTextureListener;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }

    public CircularTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularTextureView(Context context) {
        this(context, null);
    }
}
