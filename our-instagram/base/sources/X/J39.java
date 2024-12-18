package X;

import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* loaded from: classes7.dex */
public final class J39 implements Runnable {
    public final /* synthetic */ GenericSurveyFragment A00;

    public J39(GenericSurveyFragment genericSurveyFragment) {
        this.A00 = genericSurveyFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GenericSurveyFragment genericSurveyFragment = this.A00;
        if (genericSurveyFragment.isResumed()) {
            HEH heh = genericSurveyFragment.A05;
            if (heh == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            heh.A00 = false;
        }
    }
}
