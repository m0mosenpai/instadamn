package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class N6E extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "OnboardingIntroFragment";
    public C51043Mgu A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01 = C57526Pg0.A00(this, 15);

    public static final void A00(View view, String str) {
        View findViewById = AbstractC31173DnH.A0E(AbstractC31171DnF.A07(view, R.id.preview), R.layout.video_view).findViewById(R.id.preview);
        View findViewById2 = findViewById.findViewById(R.id.loading_spinner);
        VideoView videoView = (VideoView) findViewById.findViewById(R.id.video);
        videoView.setVideoPath(str);
        videoView.setZOrderOnTop(true);
        videoView.setOnErrorListener(C55338Oh3.A00);
        videoView.setOnPreparedListener(new LNA(findViewById2, 5));
        videoView.start();
        ViewTreeObserverOnGlobalLayoutListenerC55502Okv.A00(view.getViewTreeObserver(), videoView, view, 7);
    }

    public static final void A02(N6E n6e) {
        C51043Mgu A03 = n6e.A03();
        FragmentActivity requireActivity = n6e.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(n6e.A02);
        C14360o3.A07(n6e.getString(n6e.A03().A03()));
        A03.A07(n6e, requireActivity, A0r, n6e.getModuleName(), null);
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, A03().A03());
    }

    @Override // X.InterfaceC11380iw
    public abstract String getModuleName();

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 8888) {
            if (intent != null && intent.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
                A04("finished", "payouts_onboarding", getModuleName(), null);
                A02(this);
                OY3.A01(requireContext());
            } else {
                A03().A06();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PZF.A02(this, AbstractC25235BEs.A0S(this), 31);
    }

    public static final void A01(View view, String str, String str2, int i) {
        if (view != null) {
            AbstractC31171DnF.A08(view, R.id.icon).setImageResource(i);
            TextView A0e = AbstractC166987dD.A0e(view, R.id.title);
            A0e.setText(str);
            if (str2 != null) {
                A0e.setTextAppearance(R.style.igds_emphasized_label);
                TextView A0e2 = AbstractC166987dD.A0e(view, R.id.sub_title);
                A0e2.setVisibility(0);
                A0e2.setText(str2);
            }
        }
    }

    public final C51043Mgu A03() {
        C51043Mgu c51043Mgu = this.A00;
        if (c51043Mgu != null) {
            return c51043Mgu;
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    public final void A04(String str, String str2, String str3, String str4) {
        ((C56136Ovw) this.A01.getValue()).A01(AbstractC35078Fcp.A01(A03().A04()), AbstractC35078Fcp.A02(A03().A04()), str, str2, str3, A03().A05(), str4);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String moduleName;
        String str;
        String str2;
        boolean z;
        if (this instanceof NQ2) {
            AbstractC25226BEj.A1P(this);
            return true;
        }
        if (this instanceof NQ1) {
            moduleName = NQ1.__redex_internal_original_name;
            str = "back_button_clicked";
            str2 = "feature_preview";
        } else {
            moduleName = getModuleName();
            str = "back_button_clicked";
            str2 = "what_you_need";
        }
        A04(str, str2, moduleName, null);
        if (this instanceof NQ0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC25226BEj.A1P(this);
            return true;
        }
        F9C.A00(this, A03());
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(766345826);
        super.onCreate(bundle);
        C51043Mgu A00 = C52332NDw.A00(requireActivity(), this.A02);
        C14360o3.A0B(A00, 0);
        this.A00 = A00;
        C0f9.A09(-45663658, A02);
    }
}
