package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4a8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class TextureViewSurfaceTextureListenerC97714a8 implements TextureView.SurfaceTextureListener {
    public final java.util.Set A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C14360o3.A0B(surfaceTexture, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public final void A00() {
        if (this instanceof C97764aF) {
            ((C97764aF) this).A00 = null;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this instanceof C97764aF) {
            C97764aF c97764aF = (C97764aF) this;
            C14360o3.A0B(surfaceTexture, 0);
            if (c97764aF.A00 == null) {
                c97764aF.A00 = surfaceTexture;
                Iterator it = ((TextureViewSurfaceTextureListenerC97714a8) c97764aF).A00.iterator();
                while (it.hasNext()) {
                    ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureAvailable(surfaceTexture, i, i2);
                }
                return;
            }
            return;
        }
        C14360o3.A0B(surfaceTexture, 0);
        Iterator it2 = this.A00.iterator();
        while (it2.hasNext()) {
            ((TextureView.SurfaceTextureListener) it2.next()).onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this instanceof C97764aF) {
            C97764aF c97764aF = (C97764aF) this;
            C14360o3.A0B(surfaceTexture, 0);
            c97764aF.A01 = true;
            if (c97764aF.A00 == null) {
                Iterator it = ((TextureViewSurfaceTextureListenerC97714a8) c97764aF).A00.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    z &= ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureDestroyed(surfaceTexture);
                }
                return z;
            }
            return false;
        }
        C14360o3.A0B(surfaceTexture, 0);
        Iterator it2 = this.A00.iterator();
        boolean z2 = true;
        while (it2.hasNext()) {
            z2 &= ((TextureView.SurfaceTextureListener) it2.next()).onSurfaceTextureDestroyed(surfaceTexture);
        }
        return z2;
    }

    public TextureViewSurfaceTextureListenerC97714a8(TextureViewSurfaceTextureListenerC97714a8 textureViewSurfaceTextureListenerC97714a8) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (textureViewSurfaceTextureListenerC97714a8 != null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet(textureViewSurfaceTextureListenerC97714a8.A00);
        } else {
            copyOnWriteArraySet = new CopyOnWriteArraySet();
        }
        this.A00 = copyOnWriteArraySet;
    }

    public TextureViewSurfaceTextureListenerC97714a8() {
        this(null);
    }
}
