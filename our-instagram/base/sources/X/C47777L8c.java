package X;

import android.R;
import android.content.res.Resources;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.L8c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47777L8c {
    public final long A00;
    public final GradientSpinner A01;

    public C47777L8c(Resources resources, GradientSpinner gradientSpinner) {
        C14360o3.A0B(resources, 2);
        this.A01 = gradientSpinner;
        this.A00 = resources.getInteger(R.integer.config_shortAnimTime);
    }

    public final void A00() {
        GradientSpinner gradientSpinner = this.A01;
        gradientSpinner.A08();
        AbstractC43594JPz.A0G(gradientSpinner).setDuration(this.A00).setListener(new JX2(gradientSpinner, 8));
    }

    public final void A01() {
        GradientSpinner gradientSpinner = this.A01;
        gradientSpinner.setAlpha(0.0f);
        gradientSpinner.setVisibility(0);
        AbstractC43594JPz.A0H(gradientSpinner).setDuration(this.A00).setListener(null);
        gradientSpinner.A06();
    }
}
