package com.facebook.smartcapture.view;

import X.AbstractC166987dD;
import X.AbstractC43591JPw;
import X.AbstractC58323PtF;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C62430SBf;
import X.EnumC61102RfH;
import X.InterfaceC50381MMj;
import X.K5K;
import X.K5O;
import X.MSY;
import X.S1M;
import X.S1Q;
import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.ui.consent.ConsentTextsProvider;

/* loaded from: classes10.dex */
public final class SelfieOnboardingActivity extends BaseSelfieCaptureActivity implements InterfaceC50381MMj {
    public K5K A00;
    public C62430SBf A01;

    public static final void A01(SelfieOnboardingActivity selfieOnboardingActivity) {
        C62430SBf c62430SBf = selfieOnboardingActivity.A01;
        C14360o3.A0A(c62430SBf);
        c62430SBf.A00.edit().putBoolean("onboarding_has_seen", true).apply();
        Intent A00 = S1Q.A00(selfieOnboardingActivity, selfieOnboardingActivity.A02(), SelfieCaptureStep.ONBOARDING);
        BaseSelfieCaptureActivity.A00(selfieOnboardingActivity).nextStep = SelfieCaptureStep.CAPTURE;
        selfieOnboardingActivity.startActivityForResult(A00, 1);
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        K5K k5k = this.A00;
        if (k5k != null) {
            K5O k5o = (K5O) k5k;
            ViewPager viewPager = k5o.A04;
            C14360o3.A0A(viewPager);
            if (viewPager.getVisibility() == 0) {
                ViewPager viewPager2 = k5o.A04;
                C14360o3.A0A(viewPager2);
                if (viewPager2.getCurrentItem() > 0) {
                    ViewPager viewPager3 = k5o.A04;
                    C14360o3.A0A(viewPager3);
                    ViewPager viewPager4 = k5o.A04;
                    C14360o3.A0A(viewPager4);
                    viewPager3.setCurrentItem(viewPager4.getCurrentItem() - 1);
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1998299601);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
            i = -637762949;
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.selfie_fragment_container_activity);
            this.A01 = new C62430SBf(this);
            if (bundle == null) {
                if (this.A05 != null) {
                    try {
                        C14360o3.A07(A02().A0O);
                        K5K k5k = (K5K) K5O.class.newInstance();
                        this.A00 = k5k;
                        C14360o3.A0A(k5k);
                        EnumC61102RfH enumC61102RfH = A02().A07;
                        ConsentTextsProvider consentTextsProvider = A02().A0E;
                        String str = A02().A0P;
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putBoolean(AbstractC43591JPw.A00(1189), false);
                        A0b.putSerializable("training_consent", enumC61102RfH);
                        A0b.putParcelable("texts_provider", consentTextsProvider);
                        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
                        k5k.setArguments(A0b);
                        C14240no A0G = MSY.A0G(this);
                        K5K k5k2 = this.A00;
                        C14360o3.A0A(k5k2);
                        A0G.A0A(k5k2, R.id.fragment_container);
                        A0G.A00();
                    } catch (IllegalAccessException | InstantiationException e) {
                        A05(e.getMessage(), e);
                    }
                } else {
                    A05("SmartCaptureUi is null", null);
                    IllegalStateException A14 = AbstractC166987dD.A14("SmartCaptureUi must not be null");
                    C0f9.A07(797039746, A00);
                    throw A14;
                }
            }
            SelfieCaptureConfig A02 = A02();
            C62430SBf c62430SBf = this.A01;
            C14360o3.A0A(c62430SBf);
            if (!S1M.A00(A02, c62430SBf)) {
                A01(this);
            }
            i = 1469084819;
        }
        C0f9.A07(i, A00);
    }
}
