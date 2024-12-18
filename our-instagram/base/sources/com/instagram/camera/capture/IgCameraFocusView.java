package com.instagram.camera.capture;

import X.AbstractC13560mi;
import X.C14360o3;
import X.C55942hf;
import X.C55982hj;
import X.C668630d;
import X.InterfaceC55932he;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.instagram.camera.capture.IgCameraFocusView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class IgCameraFocusView extends View {
    public float A00;
    public boolean A01;
    public final float A02;
    public final PointF A03;
    public final C55982hj A04;
    public final Paint A05;
    public final InterfaceC55932he A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgCameraFocusView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A01) {
            PointF pointF = this.A03;
            canvas.drawCircle(pointF.x, pointF.y, this.A00, this.A05);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgCameraFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setWillNotDraw(false);
        this.A03 = new PointF();
        Paint paint = new Paint(1);
        this.A05 = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        Resources resources = getResources();
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        this.A02 = TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        C668630d c668630d = new C668630d() { // from class: X.7q9
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                IgCameraFocusView igCameraFocusView = IgCameraFocusView.this;
                float f = igCameraFocusView.A02;
                igCameraFocusView.A00 = (2.0f * f) - (((float) c55982hj.A09.A00) * f);
                igCameraFocusView.invalidate();
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                IgCameraFocusView igCameraFocusView = IgCameraFocusView.this;
                igCameraFocusView.A01 = false;
                igCameraFocusView.A04.A08(0.0d, true);
                igCameraFocusView.invalidate();
            }
        };
        this.A06 = c668630d;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(C55942hf.A03(0.5d, 0.5d));
        A02.A0A(c668630d);
        this.A04 = A02;
    }

    public /* synthetic */ IgCameraFocusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgCameraFocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
