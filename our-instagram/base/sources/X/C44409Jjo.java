package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.Jjo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44409Jjo extends View {
    public boolean A00;
    public final Paint A01;

    public C44409Jjo(Context context) {
        super(context, null, 0);
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setTextSize(58.0f);
        this.A01 = A0S;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        Paint paint = this.A01;
        float measureText = paint.measureText("🎃");
        float f = 35.0f;
        if (!this.A00) {
            f = (canvas.getWidth() - measureText) - 35.0f;
        }
        float f2 = -10.0f;
        float f3 = 14.0f;
        if (!this.A00) {
            f2 = 5.0f;
            f3 = -14.0f;
        }
        canvas.rotate(f3, f, f2);
        canvas.drawText("🎃", f, f2, paint);
    }

    public final void setIsFromMe(boolean z) {
        this.A00 = z;
        invalidate();
    }
}
