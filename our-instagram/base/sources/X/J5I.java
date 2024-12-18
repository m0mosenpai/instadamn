package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* loaded from: classes7.dex */
public final class J5I implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ GenericSurveyFragment A01;
    public final /* synthetic */ C3M4 A02;

    public J5I(ViewGroup viewGroup, GenericSurveyFragment genericSurveyFragment, C3M4 c3m4) {
        this.A01 = genericSurveyFragment;
        this.A00 = viewGroup;
        this.A02 = c3m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RectF rectF;
        RectF rectF2;
        GenericSurveyFragment genericSurveyFragment = this.A01;
        if (genericSurveyFragment.isResumed()) {
            C42800Iwc c42800Iwc = (C42800Iwc) AbstractC166987dD.A0c(this.A00, R.id.reel_preview_container).getTag();
            if (c42800Iwc != null) {
                rectF = AbstractC13880nE.A0G(c42800Iwc.A05);
                rectF2 = new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            } else {
                rectF = null;
                rectF2 = null;
            }
            this.A02.A0X(rectF, rectF2, genericSurveyFragment, null);
        }
    }
}
