package X;

import android.R;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.5lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125335lf extends AbstractC125325le {
    public final int A00;
    public final ValueAnimator A01;

    public C125335lf(View view) {
        super(view);
        int integer = view.getResources().getInteger(R.integer.config_mediumAnimTime);
        this.A00 = integer;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A01 = valueAnimator;
        valueAnimator.setDuration(integer);
        C125345lg c125345lg = new C125345lg(this);
        valueAnimator.addUpdateListener(c125345lg);
        valueAnimator.addListener(c125345lg);
    }
}
