package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* loaded from: classes11.dex */
public final class WZD implements XD9 {
    @Override // X.XD9
    public final boolean CLF() {
        return false;
    }

    @Override // X.XD9
    public final InterfaceC72007XEv ALV(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, InterfaceC178897x1 interfaceC178897x1, C179877yd c179877yd, MYB myb, WDI wdi, MediaComposition mediaComposition, U7W u7w, Integer num) {
        return new WZC(context, eGLContext, eGLDisplay, eGLSurface, c179877yd, myb, wdi, mediaComposition, u7w);
    }

    @Override // X.XD9
    public final /* synthetic */ EGLContext BuP() {
        return null;
    }
}
