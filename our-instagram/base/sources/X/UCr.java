package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UCr extends RatingBar {
    public final C65859TvM A00;

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public UCr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C3WR.A03(this, getContext());
        C65859TvM c65859TvM = new C65859TvM(this);
        this.A00 = c65859TvM;
        c65859TvM.A02(attributeSet, R.attr.ratingBarStyle);
    }
}
