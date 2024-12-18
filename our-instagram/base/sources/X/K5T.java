package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.List;

/* loaded from: classes8.dex */
public final class K5T extends K5U implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IdVerificationPhotoReviewFragment";
    public View A00;
    public ImageView A01;
    public C45348K5h A02;
    public IgFrameLayout A03;
    public TF9 A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public FragmentActivity A09;
    public AbstractC18680vv A0A;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC58317Pt9.A00(815);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.A00 = view;
        this.A03 = (IgFrameLayout) AbstractC47961LGz.A00(view, R.id.action_sheet_container);
        this.A07 = AbstractC166987dD.A1E();
        C45348K5h c45348K5h = new C45348K5h(requireActivity());
        this.A02 = c45348K5h;
        c45348K5h.setTitleText(getString(2131969591));
        this.A02.setSubtitleText(getString(2131969590));
        ViewOnClickListenerC48073LPy.A00(view.requireViewById(R.id.id_verification_photo_review_back_button), 65, this);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.id_verification_photo_preview);
        C64P c64p = (C64P) view.requireViewById(R.id.id_verification_photo_preview_bottom_button);
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC48073LPy(this, 66));
        c64p.setSecondaryActionOnClickListener(new ViewOnClickListenerC48073LPy(this, 67));
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = bundle2.getString("photo_file_path");
        }
        this.A04.A00(EnumC61065Ree.A04, EnumC61067Reg.A03, this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-143582079);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        this.A09 = requireActivity;
        IdCaptureConfig idCaptureConfig = (IdCaptureConfig) requireActivity.getIntent().getParcelableExtra(AbstractC58317Pt9.A00(814));
        idCaptureConfig.getClass();
        Bundle A0B = AbstractC31177DnL.A0B(this);
        A0B.putString("IgSessionManager.SESSION_TOKEN_KEY", idCaptureConfig.A0G);
        setArguments(A0B);
        AbstractC18680vv A0n = AbstractC166987dD.A0n(AbstractC60492pY.A01(this));
        this.A0A = A0n;
        this.A04 = new TF9(A0n);
        Bundle bundle2 = idCaptureConfig.A03;
        if (bundle2 != null) {
            this.A05 = bundle2.getString("challenge_use_case");
            bundle2.getString("challenge_id");
            bundle2.getString("av_session_id");
            bundle2.getString("flow_id");
        }
        this.A08 = this.A09.getIntent().getBooleanExtra("is_cancel_confirmation_action_sheet_enabled", false);
        C0f9.A09(-434573583, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-452922599);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.id_verification_photo_review_layout);
        C0f9.A09(1811249252, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(769388931);
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        super.onDestroyView();
        C0f9.A09(-1352382149, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1810638836);
        super.onStart();
        new C45560KEz(this).A02(new Void[0]);
        C0f9.A09(1856120875, A02);
    }
}
