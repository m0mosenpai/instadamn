package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes5.dex */
public final class CUB {
    public final PointF A00;
    public final RectF A01;
    public final View A02;
    public final String A03;
    public final String A04;

    public CUB(PointF pointF, RectF rectF, View view, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = pointF;
        this.A01 = rectF;
        this.A02 = view;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("\n      ShowreelInteractivityListenerData(\n      action: ");
        A1C.append(this.A03);
        A1C.append(", \n      value: ");
        A1C.append(this.A04);
        A1C.append(",\n      interactionPoint: ");
        A1C.append(this.A00);
        A1C.append(",\n      bounds: ");
        A1C.append(this.A01);
        A1C.append(",\n      view: ");
        A1C.append(this.A02.getClass());
        return AbstractC16490ru.A0p(AbstractC166997dE.A0x("\n      )\n    ", A1C));
    }
}
