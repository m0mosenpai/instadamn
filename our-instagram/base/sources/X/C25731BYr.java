package X;

import android.graphics.Canvas;
import android.view.View;
import java.util.List;

/* renamed from: X.BYr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25731BYr extends View {
    public C50627MWo A00;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        C50627MWo c50627MWo = this.A00;
        if (c50627MWo != null) {
            List list = (List) c50627MWo.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC30925Dic) list.get(i)).AQT(canvas, (C28225CcV) c50627MWo.A00);
            }
        }
    }

    public final void setCanvasModel(C50627MWo c50627MWo) {
        if (!C14360o3.A0K(this.A00, c50627MWo)) {
            this.A00 = c50627MWo;
            invalidate();
        }
    }

    public final C50627MWo getCanvasModel() {
        return this.A00;
    }
}
