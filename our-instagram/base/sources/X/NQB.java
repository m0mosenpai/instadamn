package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;

/* loaded from: classes9.dex */
public final class NQB extends AbstractC53501NlS {
    public final UserMonetizationProductType A00;
    public final OnboardingRepository A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public NQB(UserMonetizationProductType userMonetizationProductType, OnboardingRepository onboardingRepository, String str, String str2, String str3) {
        AbstractC167017dG.A1Q(onboardingRepository, str);
        C14360o3.A0B(str3, 5);
        this.A01 = onboardingRepository;
        this.A00 = userMonetizationProductType;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
    }
}
