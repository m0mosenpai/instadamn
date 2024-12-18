package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: X.BYs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25732BYs extends View {
    public final CUM A00;

    public C25732BYs(Context context) {
        super(context, null, 0);
        this.A00 = new CUM(context);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A00.A00(canvas, getWidth(), getHeight());
    }

    public final void setBorderColor(int i) {
        this.A00.A00 = i;
    }

    public final void setBorderEnabled(boolean z) {
        this.A00.A02 = z;
    }

    public final void setInfoText(String str) {
        this.A00.A01 = str;
    }
}
