package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.Whc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70819Whc implements X8G {
    public final int[] A00;
    public final /* synthetic */ GLDrawingView A01;

    public AbstractC70819Whc(GLDrawingView gLDrawingView, int[] iArr) {
        this.A01 = gLDrawingView;
        int i = gLDrawingView.A00;
        if (i == 2 || i == 3) {
            int[] iArr2 = new int[15];
            System.arraycopy(iArr, 0, iArr2, 0, 12);
            iArr2[12] = 12352;
            iArr2[13] = gLDrawingView.A00 == 2 ? 4 : 64;
            iArr2[14] = 12344;
            iArr = iArr2;
        }
        this.A00 = iArr;
    }
}
