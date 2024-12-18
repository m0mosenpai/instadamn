package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.Awn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC24706Awn implements Runnable {
    public final /* synthetic */ GLDrawingView A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ RunnableC24706Awn(GLDrawingView gLDrawingView, Runnable runnable) {
        this.A00 = gLDrawingView;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GLDrawingView gLDrawingView = this.A00;
        Runnable runnable = this.A01;
        gLDrawingView.A0E.A02();
        gLDrawingView.A03();
        gLDrawingView.post(runnable);
    }
}
