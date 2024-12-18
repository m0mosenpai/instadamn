package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.A6y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22878A6y {
    public final GLDrawingView A00;
    public final /* synthetic */ C8PR A01;

    public C22878A6y(C8PR c8pr, GLDrawingView gLDrawingView) {
        this.A01 = c8pr;
        this.A00 = gLDrawingView;
        gLDrawingView.setGLThreadListener(c8pr.A0O);
        gLDrawingView.setBrushList(c8pr.A0N);
        gLDrawingView.setOnDrawListener(new C73477YFa(this));
    }
}
