package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.facebook.litho.LithoView;
import java.util.List;

/* loaded from: classes5.dex */
public final class BZC extends HorizontalScrollView implements C2X1 {
    public int A00;
    public int A01;
    public CAK A02;
    public final LithoView A03;

    @Override // X.C2X1
    public final void Ctl(List list) {
        list.add(this.A03);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.A03.measure(View.MeasureSpec.makeMeasureSpec(this.A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(this.A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public BZC(Context context) {
        super(context);
        LithoView lithoView = new LithoView(context);
        this.A03 = lithoView;
        addView(lithoView);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(1692151401);
        super.draw(canvas);
        C0f9.A0A(91124656, A03);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A03.Ctb();
        CAK cak = this.A02;
        if (cak != null) {
            cak.A00 = getScrollX();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-18511607);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(-1727271642, A05);
        return onTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
    }
}
