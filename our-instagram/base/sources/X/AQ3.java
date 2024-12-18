package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.TextureView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AQ3 implements TextureView.SurfaceTextureListener {
    public final Context A00;
    public final UserSession A01;
    public final C178117vk A02;
    public final String A03;
    public final String A04;
    public final InterfaceC09390do A05 = AbstractC09440dt.A00(EnumC09460dv.A02, new B5y(this, 21));

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        C25005B4e c25005B4e = (C25005B4e) this.A05.getValue();
        synchronized (c25005B4e) {
            c25005B4e.A00 = surfaceTexture;
        }
        c25005B4e.A03 = true;
        c25005B4e.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C25005B4e c25005B4e = (C25005B4e) this.A05.getValue();
        c25005B4e.A03 = false;
        c25005B4e.A02 = false;
        AQ3 aq3 = c25005B4e.A05;
        synchronized (c25005B4e) {
            C178117vk c178117vk = aq3.A02;
            EGLDisplay eGLDisplay = c178117vk.A01;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                C178117vk.A05.A01("eglMakeCurrent");
            }
            try {
                EGL14.eglDestroyContext(c178117vk.A01, c178117vk.A00);
                EGL14.eglDestroySurface(c178117vk.A01, c178117vk.A02);
                EGL14.eglTerminate(c178117vk.A01);
            } catch (Exception unused) {
            }
            c25005B4e.A00 = null;
            c25005B4e.A01 = null;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.instagram.creation.capture.quickcapture.text.gradient.ShaderFetcher] */
    public AQ3(Context context, UserSession userSession) {
        this.A01 = userSession;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        this.A02 = new C178117vk();
        this.A04 = AbstractC54307NzR.A00(AbstractC166997dE.A0M(applicationContext), R.raw.uniform_texture_vertex);
        this.A03 = new Object().getShaderString();
    }
}
