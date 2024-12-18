package androidx.constraintlayout.widget;

import X.C0f9;
import X.C56302iJ;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class Guideline extends View {
    public boolean A00;

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.A00 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0f9.A0A(-2004454623, C0f9.A03(-1848725144));
    }

    public void setGuidelineBegin(int margin) {
        C56302iJ c56302iJ = (C56302iJ) getLayoutParams();
        if (this.A00 && c56302iJ.A0V == margin) {
            return;
        }
        c56302iJ.A0V = margin;
        setLayoutParams(c56302iJ);
    }

    public void setGuidelineEnd(int margin) {
        C56302iJ c56302iJ = (C56302iJ) getLayoutParams();
        if (this.A00 && c56302iJ.A0W == margin) {
            return;
        }
        c56302iJ.A0W = margin;
        setLayoutParams(c56302iJ);
    }

    public void setGuidelinePercent(float ratio) {
        C56302iJ c56302iJ = (C56302iJ) getLayoutParams();
        if (this.A00 && c56302iJ.A02 == ratio) {
            return;
        }
        c56302iJ.A02 = ratio;
        setLayoutParams(c56302iJ);
    }

    public void setFilterRedundantCalls(boolean filter) {
        this.A00 = filter;
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.A00 = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.A00 = true;
        super.setVisibility(8);
    }

    public Guideline(Context context) {
        super(context);
        this.A00 = true;
        super.setVisibility(8);
    }
}
