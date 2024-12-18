package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class EID extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReelXpostViewerInfoFragment";
    public C34568FLc A00;
    public UserSession A01;
    public IgTextView A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(331006592);
        super.onCreate(bundle);
        this.mArguments.getClass();
        this.A01 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-922788667, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-942685333);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reel_xpost_viewer_info);
        C0f9.A09(818500182, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.info_icon_content);
        this.A02 = A0X;
        AnonymousClass773.A07(new C31745Dwy(this, 7), A0X, requireContext().getString(2131971679), AbstractC167007dF.A0f(requireContext(), requireContext().getString(2131971679), 2131971678));
    }
}
