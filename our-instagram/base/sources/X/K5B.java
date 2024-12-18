package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class K5B extends K5Q implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IdVerificationPermissionsFragment";
    public String A00;
    public boolean A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "selfie_permissions";
    }

    @Override // X.K5Q, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC47994LKy.A05((Button) AbstractC47961LGz.A00(view, R.id.btn_camera_access_allow));
        if (this.A01) {
            this.A02.getValue();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2089666137);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getString("challenge_use_case");
        requireArguments.getString("av_session_id");
        requireArguments.getString("flow_id");
        this.A01 = AbstractC58317Pt9.A00(816).equals(this.A00);
        C0f9.A09(-1896244941, A02);
    }

    @Override // X.K5Q, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(826065864);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.id_verification_permission_layout, viewGroup, false);
        C0f9.A09(1559980761, A02);
        return inflate;
    }
}
