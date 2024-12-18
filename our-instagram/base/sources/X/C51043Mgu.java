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
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Mgu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51043Mgu extends AbstractC52922bZ {
    public UserMonetizationProductType A00;
    public OTV A01;
    public final C2GS A02;
    public final C41761wQ A03 = AbstractC31173DnH.A0S();
    public final UserSession A04;
    public final OnboardingRepository A05;
    public final MonetizationRepository A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;

    public final void A07(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        IGRevShareProductType iGRevShareProductType;
        Fragment A00;
        int A07 = AbstractC25230BEn.A07(1, userSession, str);
        OnboardingRepository onboardingRepository = this.A05;
        MonetizationRepository monetizationRepository = this.A06;
        UserMonetizationProductType A04 = A04();
        String A05 = A05();
        String A01 = A01(this);
        int i = 0;
        C14360o3.A0B(onboardingRepository, 2);
        AbstractC167007dF.A1G(monetizationRepository, A07, A05);
        List A06 = onboardingRepository.A06(A04);
        if (A06 != null && !A06.isEmpty()) {
            HashMap hashMap = onboardingRepository.A00;
            C51746MtV c51746MtV = (C51746MtV) hashMap.get(A04);
            if (c51746MtV != null) {
                i = c51746MtV.A00;
            }
            ((ProductOnboardingNextStepInfo) A06.get(i)).A01 = "complete";
            C51746MtV c51746MtV2 = (C51746MtV) hashMap.get(A04);
            if (c51746MtV2 != null) {
                c51746MtV2.A01 = A06;
            }
            int i2 = i + 1;
            if (A06.size() > i2) {
                onboardingRepository.A07(A04, i2);
                ProductOnboardingNextStepInfo productOnboardingNextStepInfo = (ProductOnboardingNextStepInfo) A06.get(i2);
                String str3 = productOnboardingNextStepInfo.A02;
                if ("payouts_onboarding".equals(str3)) {
                    FW0.A01(fragment, fragmentActivity, A04, userSession, str, A05, null, null, null);
                    return;
                }
                int ordinal = A04.ordinal();
                if (ordinal != 10) {
                    if (ordinal != 13) {
                        if (ordinal != 9) {
                            if (ordinal == 2) {
                                if (!C14360o3.A0K(str3, "checklist_screen") && C14360o3.A0K(str3, "terms_and_conditions")) {
                                    AbstractC34338FCg.A00().A00();
                                    A00 = new N69();
                                } else {
                                    AbstractC34338FCg.A00().A00();
                                    A00 = new N6E();
                                }
                            } else {
                                throw AbstractC31175DnJ.A0V("CompleteStepAndGetNextStepFragment: Invalid product type for settings: ", A04.name());
                            }
                        } else {
                            FVI.A01().A00();
                            A00 = W6d.A02(AbstractC31171DnF.A0C(userSession), C66277U6x.A00("com.instagram.user_pay.fan_club.screens.creator_onboarding.feature_list"));
                        }
                        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
                        A0r.A0B(null, A00);
                        A0r.A09();
                        A0r.A0A = str2;
                        A0r.A04();
                        return;
                    }
                    iGRevShareProductType = IGRevShareProductType.A05;
                } else {
                    iGRevShareProductType = IGRevShareProductType.A04;
                }
                A00 = AbstractC54070NvU.A00(iGRevShareProductType, productOnboardingNextStepInfo);
                C140966Yy A0r2 = AbstractC25225BEi.A0r(fragmentActivity, userSession);
                A0r2.A0B(null, A00);
                A0r2.A09();
                A0r2.A0A = str2;
                A0r2.A04();
                return;
            }
            return;
        }
        monetizationRepository.A0B.put(A04, true);
        onboardingRepository.A07(A04, 0);
        C51746MtV c51746MtV3 = (C51746MtV) onboardingRepository.A00.get(A04);
        if (c51746MtV3 != null) {
            c51746MtV3.A01 = null;
        }
        N6G A012 = C55045OZt.A01(A04, userSession, A05, A01, null);
        C140966Yy A0r3 = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r3.A0B(null, A012);
        A0r3.A09();
        A0r3.A0A = str2;
        A0r3.A04();
    }

    public static C2GS A00(C51043Mgu c51043Mgu) {
        C2GS c2gs = c51043Mgu.A02;
        C51571MqP c51571MqP = (C51571MqP) c2gs.A02();
        if (c51571MqP != null) {
            c51571MqP.A05 = false;
        }
        return c2gs;
    }

    public static String A01(C51043Mgu c51043Mgu) {
        C51571MqP c51571MqP = (C51571MqP) c51043Mgu.A02.A02();
        if (c51571MqP != null) {
            return c51571MqP.A01;
        }
        return null;
    }

    public final UserMonetizationProductType A04() {
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType != null) {
            return userMonetizationProductType;
        }
        C14360o3.A0F("monetizationProductType");
        throw C00O.createAndThrow();
    }

    public final String A05() {
        String str;
        C51571MqP c51571MqP = (C51571MqP) this.A02.A02();
        if (c51571MqP == null || (str = c51571MqP.A02) == null) {
            return "UNKNOWN";
        }
        return str;
    }

    public final void A06() {
        int i;
        OnboardingRepository onboardingRepository = this.A05;
        UserMonetizationProductType A04 = A04();
        int i2 = 0;
        C14360o3.A0B(onboardingRepository, 0);
        C51746MtV c51746MtV = (C51746MtV) onboardingRepository.A00.get(A04);
        if (c51746MtV != null) {
            i = c51746MtV.A00;
        } else {
            i = 0;
        }
        List A06 = onboardingRepository.A06(A04);
        if (A06 != null && !A06.isEmpty()) {
            if (i != 0) {
                i2 = i - 1;
            } else {
                return;
            }
        }
        onboardingRepository.A07(A04, i2);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A03.A01();
    }

    public C51043Mgu(UserSession userSession, OnboardingRepository onboardingRepository, MonetizationRepository monetizationRepository) {
        this.A04 = userSession;
        this.A06 = monetizationRepository;
        this.A05 = onboardingRepository;
        C24721Ip A0s = MSY.A0s();
        this.A07 = A0s;
        this.A08 = AbstractC07080Za.A03(A0s);
        this.A02 = MSW.A0E();
    }

    public static final void A02(C51043Mgu c51043Mgu) {
        PZF.A02(c51043Mgu, AbstractC141776au.A00(c51043Mgu), 43);
    }

    public final int A03() {
        switch (A04().ordinal()) {
            case 2:
                return 2131976470;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            default:
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("getOnboardingProductTitle Invalid product type: ");
                throw AbstractC166987dD.A14(AbstractC166997dE.A0v(A04(), A1C));
            case 7:
                return 2131956687;
            case 9:
                return 2131976537;
            case 10:
                if (!AbstractC54069NvT.A00(this.A04)) {
                    return 2131963805;
                }
                return 2131963855;
            case 11:
                return 2131964490;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return 2131963789;
            case Process.SIGTERM /* 15 */:
                return 2131976554;
        }
    }
}
