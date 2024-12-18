package X;

import com.instagram.common.session.UserSession;
import com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity;

/* loaded from: classes6.dex */
public final class GB4 implements GY7 {
    public final /* synthetic */ OnboardingActivity A00;

    public GB4(OnboardingActivity onboardingActivity) {
        this.A00 = onboardingActivity;
    }

    @Override // X.GY7
    public final void onFinished() {
        OnboardingActivity onboardingActivity = this.A00;
        UserSession userSession = onboardingActivity.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        AbstractC31525Dt9.A08(onboardingActivity, onboardingActivity, userSession);
    }
}
