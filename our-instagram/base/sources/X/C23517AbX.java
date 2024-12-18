package X;

import android.content.Context;
import android.graphics.Point;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;

/* renamed from: X.AbX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23517AbX implements XD9 {
    public Point A00;
    public final UserSession A01;
    public final C47Z A02;
    public final C22892A7m A03;
    public final XOT A04;

    @Override // X.XD9
    public final InterfaceC72007XEv ALV(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, InterfaceC178897x1 interfaceC178897x1, C179877yd c179877yd, MYB myb, WDI wdi, MediaComposition mediaComposition, U7W u7w, Integer num) {
        AbstractC167027dH.A0a(0, context, wdi, num, eGLContext);
        AbstractC167017dG.A1U(eGLDisplay, eGLSurface);
        Point point = new Point(wdi.A0C, wdi.A0A);
        this.A00 = point;
        C22892A7m c22892A7m = this.A03;
        VideoFilter videoFilter = c22892A7m.A00;
        VideoFilter videoFilter2 = c22892A7m.A01;
        XOT xot = this.A04;
        UserSession userSession = this.A01;
        C9N6 A01 = C9N5.A01(point, this.A02);
        Point point2 = this.A00;
        return new C23516AbW(context, eGLContext, eGLDisplay, eGLSurface, userSession, videoFilter2, videoFilter, xot, A01, point2.x, point2.y);
    }

    @Override // X.XD9
    public final boolean CLF() {
        return false;
    }

    @Override // X.XD9
    public final /* synthetic */ EGLContext BuP() {
        return null;
    }

    public C23517AbX(Point point, UserSession userSession, C47Z c47z, C22892A7m c22892A7m, XOT xot) {
        this.A01 = userSession;
        this.A02 = c47z;
        this.A00 = point;
        this.A03 = c22892A7m;
        this.A04 = xot;
    }
}
