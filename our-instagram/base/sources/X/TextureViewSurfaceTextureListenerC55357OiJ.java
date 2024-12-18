package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.OiJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC55357OiJ implements TextureView.SurfaceTextureListener {
    public C55208OeM A00;
    public C54526O7d A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final UserSession A06;
    public final C47Z A07;
    public final InterfaceC16820sZ A08;
    public final boolean A09;
    public final ConstrainedTextureView A0A;

    public TextureViewSurfaceTextureListenerC55357OiJ(Context context, ViewGroup viewGroup, UserSession userSession, ConstrainedTextureView constrainedTextureView, C47Z c47z, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2, boolean z, boolean z2) {
        ConstrainedTextureView constrainedTextureView2;
        float f2;
        C14360o3.A0B(userSession, 2);
        this.A05 = context;
        this.A06 = userSession;
        this.A07 = c47z;
        this.A02 = f;
        this.A09 = z;
        this.A04 = i;
        this.A03 = i2;
        this.A08 = interfaceC16820sZ;
        if (constrainedTextureView == null) {
            constrainedTextureView2 = new ConstrainedTextureView(context);
        } else {
            constrainedTextureView2 = constrainedTextureView;
        }
        this.A0A = constrainedTextureView2;
        constrainedTextureView2.setVisibility(0);
        constrainedTextureView2.setSurfaceTextureListener(this);
        if (z2) {
            f2 = 0.5625f;
        } else {
            ClipInfo clipInfo = c47z.A1N;
            f2 = clipInfo.A09 / clipInfo.A06;
        }
        constrainedTextureView2.setAspectRatio(f2);
        if (constrainedTextureView == null) {
            viewGroup.addView(constrainedTextureView2, 0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        this.A01 = new C54526O7d(surfaceTexture, this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C54526O7d c54526O7d = this.A01;
        if (c54526O7d != null) {
            TextureViewSurfaceTextureListenerC55357OiJ textureViewSurfaceTextureListenerC55357OiJ = c54526O7d.A01;
            C55208OeM c55208OeM = textureViewSurfaceTextureListenerC55357OiJ.A00;
            if (c55208OeM != null) {
                c55208OeM.A07();
            }
            textureViewSurfaceTextureListenerC55357OiJ.A00 = null;
            return true;
        }
        return true;
    }
}
