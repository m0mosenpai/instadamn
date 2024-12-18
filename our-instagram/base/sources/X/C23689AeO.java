package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.ViewGroup;

/* renamed from: X.AeO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23689AeO implements BDJ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public SurfaceTexture A04;
    public TextureView A05;
    public C8J6 A06;
    public boolean A07;
    public final Context A08;
    public final C8RB A09;

    @Override // X.BDJ
    public final void DCI(Canvas canvas, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        SurfaceTexture surfaceTexture;
        C8J6 c8j6;
        int i3;
        int i4;
        TextureView textureView = this.A05;
        if (textureView == null) {
            textureView = new TextureView(this.A08);
            textureView.setOutlineProvider(new C66347UAt(this, 4));
            textureView.setClipToOutline(true);
            this.A09.addView(textureView, 0);
            textureView.setTranslationX(-this.A00);
            textureView.setSurfaceTextureListener(new AQ2(this, 4));
            textureView.setVisibility(8);
            this.A05 = textureView;
        }
        textureView.setVisibility(0);
        TextureView textureView2 = this.A05;
        if (textureView2 != null && (layoutParams = textureView2.getLayoutParams()) != null) {
            if (layoutParams.height == i2 && layoutParams.width == i) {
                if (this.A07 && (surfaceTexture = this.A04) != null && (c8j6 = this.A06) != null && (i3 = this.A03) != 0 && (i4 = this.A02) != 0) {
                    this.A07 = false;
                    c8j6.EGu(surfaceTexture, this.A01, i3, i4);
                    return;
                }
                return;
            }
            layoutParams.width = i;
            layoutParams.height = i2;
            TextureView textureView3 = this.A05;
            if (textureView3 != null) {
                textureView3.setLayoutParams(layoutParams);
            }
            this.A07 = true;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.BDJ
    public final void FCa(int i, int i2, int i3) {
        int i4;
        int i5;
        this.A01 = i;
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            C8J6 c8j6 = this.A06;
            if (c8j6 != null && (i4 = this.A03) != 0 && (i5 = this.A02) != 0) {
                this.A07 = false;
                c8j6.EGu(surfaceTexture, i, i4, i5);
                return;
            }
            return;
        }
        this.A07 = true;
    }

    @Override // X.BDJ
    public final void reset() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            this.A09.removeView(textureView);
            this.A05 = null;
        }
    }

    public C23689AeO(Context context, C8RB c8rb) {
        this.A08 = context;
        this.A09 = c8rb;
    }
}
