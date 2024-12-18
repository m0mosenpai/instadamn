package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;

/* renamed from: X.OZt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55045OZt {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo A00(com.instagram.api.schemas.UserMonetizationProductType r6, com.instagram.monetization.onboarding.repository.OnboardingRepository r7) {
        /*
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            java.util.List r2 = r7.A06(r6)
            if (r2 == 0) goto L11
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L12
        L11:
            r0 = 1
        L12:
            r4 = 0
            if (r0 == 0) goto L19
            r7.A07(r6, r5)
            return r4
        L19:
            java.util.Iterator r3 = r2.iterator()
        L1d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r2 = r3.next()
            com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo r2 = (com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "incomplete"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
            return r2
        L34:
            r7.A07(r6, r5)
            java.util.HashMap r0 = r7.A00
            java.lang.Object r0 = r0.get(r6)
            X.MtV r0 = (X.C51746MtV) r0
            if (r0 == 0) goto L43
            r0.A01 = r4
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55045OZt.A00(com.instagram.api.schemas.UserMonetizationProductType, com.instagram.monetization.onboarding.repository.OnboardingRepository):com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo");
    }

    public final void A02(Fragment fragment, FragmentActivity fragmentActivity, UserMonetizationProductType userMonetizationProductType, UserSession userSession, OnboardingRepository onboardingRepository, String str, String str2, String str3, String str4, String str5, String str6) {
        Fragment A00;
        C14360o3.A0B(userSession, 1);
        AbstractC25233BEq.A0w(2, str, onboardingRepository, userMonetizationProductType);
        C14360o3.A0B(str2, 5);
        C14360o3.A0B(str3, 6);
        ProductOnboardingNextStepInfo A002 = A00(userMonetizationProductType, onboardingRepository);
        if (A002 != null && C14360o3.A0K(A002.A02, "payouts_onboarding")) {
            FW0.A01(fragment, fragmentActivity, userMonetizationProductType, userSession, str, str2, null, null, str5);
            return;
        }
        int ordinal = userMonetizationProductType.ordinal();
        if (ordinal != 10) {
            if (ordinal != 13) {
                if (ordinal != 2) {
                    if (ordinal != 15) {
                        if (ordinal == 11) {
                            A00 = AbstractC34897FZj.A00().A03(userSession, str2, str4, null);
                        } else {
                            throw AbstractC31175DnJ.A0V("GetOnboardingStepsOrSettingsFragment: Unsupported monetization product type: ", userMonetizationProductType.name());
                        }
                    } else if (A002 == null) {
                        A00 = AbstractC34338FCg.A00().A00().A00(str2, str4);
                    } else {
                        throw AbstractC166987dD.A14("GetOnboardingStepsOrSettingsFragment: onboarding for user_pay migrated to Bloks. Native onboarding is not supported.");
                    }
                } else {
                    A00 = AbstractC31364DqT.A02().A02(userSession, AbstractC31402Dr6.A00(userSession, "user_pay_incentives_onboarding", str).A03());
                }
            } else if (A002 == null) {
                A00 = OPZ.A01().A00().A01(IGRevShareProductType.A05, str2, str4);
            } else {
                A00 = AbstractC54070NvU.A00(IGRevShareProductType.A05, A002);
            }
        } else if (A002 == null) {
            A00 = OPZ.A01().A00().A01(IGRevShareProductType.A04, str2, str4);
        } else {
            A00 = AbstractC54070NvU.A00(IGRevShareProductType.A04, A002);
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0B(null, A00);
        A0P.A0A = str6;
        A0P.A04();
    }

    public static final N6G A01(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str, String str2, String str3) {
        switch (userMonetizationProductType.ordinal()) {
            case 2:
            case Process.SIGTERM /* 15 */:
                return AbstractC34338FCg.A00().A00().A00(str, str2);
            case 9:
                return FVI.A01().A00().A02(str);
            case 10:
                return OPZ.A01().A00().A01(IGRevShareProductType.A04, str, str2);
            case 11:
                return AbstractC34897FZj.A00().A03(userSession, str, str2, str3);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return OPZ.A01().A00().A01(IGRevShareProductType.A05, str, str2);
            default:
                throw AbstractC31175DnJ.A0V("GetSettingsFragmentByProductType: Invalid product type for settings: ", userMonetizationProductType.name());
        }
    }
}
