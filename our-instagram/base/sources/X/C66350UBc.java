package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* renamed from: X.UBc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66350UBc extends FrameLayout {
    public PointF A00;
    public C68916VeG A01;
    public String A02;
    public final Path A03;

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    private final void A00(int i, int i2) {
        Path path = this.A03;
        path.reset();
        RectF rectF = new RectF();
        float f = i;
        PointF pointF = this.A00;
        float f2 = pointF.x;
        float f3 = i2;
        float f4 = pointF.y;
        C68916VeG c68916VeG = this.A01;
        rectF.set(f2 * f, f4 * f3, (f2 + c68916VeG.A01) * f, (f4 + c68916VeG.A00) * f3);
        if (C14360o3.A0K(this.A02, "ellipse")) {
            float width = rectF.left - ((rectF.width() - f) / 2.0f);
            float height = rectF.top - ((rectF.height() - f3) / 2.0f);
            rectF.set(width, height, rectF.width() + width, rectF.height() + height);
        }
        boolean A0K = C14360o3.A0K(this.A02, "ellipse");
        Path.Direction direction = Path.Direction.CW;
        if (A0K) {
            path.addOval(rectF, direction);
        } else {
            path.addRect(rectF, direction);
        }
    }

    public final void setMaskShape(String str) {
        this.A02 = str;
        A00(getWidth(), getHeight());
        invalidate();
    }

    public C66350UBc(Context context) {
        super(context);
        this.A02 = "rectangle";
        this.A03 = new Path();
        this.A00 = new PointF();
        this.A01 = new C68916VeG();
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        canvas.clipPath(this.A03);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1802435030);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        C0f9.A0D(-1436131389, A06);
    }

    public final void setMaskBounds(PointF pointF, C68916VeG c68916VeG) {
        AbstractC167017dG.A1N(pointF, c68916VeG);
        this.A00 = pointF;
        this.A01 = c68916VeG;
        A00(getWidth(), getHeight());
        invalidate();
    }
}
