package X;

import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N8I extends AbstractC52114N4m implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BrandedContentApproveCreatorsFragment";
    public String A00;
    public List A01 = AbstractC166987dD.A1E();
    public List A02 = AbstractC166987dD.A1E();
    public boolean A03;
    public String A04;

    public static final void A00(N8I n8i, String str, String str2) {
        UserSession A0r = AbstractC166987dD.A0r(n8i.A09);
        Integer num = C05F.A15;
        Map A0n = AbstractC167007dF.A0n("action_type", str);
        String str3 = n8i.A04;
        if (str3 == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        LL0.A03(n8i, A0r, num, null, null, str2, str3, null, null, A0n);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953111);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC52114N4m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A04().setVisibility(0);
        AbstractC25227BEk.A12(A04(), this, 2131973012);
        RecyclerView recyclerView = super.A01;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new FastScrollingLinearLayoutManager(requireContext()));
            RecyclerView recyclerView2 = super.A01;
            if (recyclerView2 != null) {
                AbstractC37304Gc5.A0y(recyclerView2.A0D, recyclerView2, new JY9(this, 3), C153146ui.A0A);
                JQ1.A0i(this);
                AbstractC31171DnF.A1M(A08());
                AbstractC166987dD.A1Z(new MCJ(this, null, 40), AbstractC25235BEs.A0S(this));
                UserSession A0r = AbstractC166987dD.A0r(this.A09);
                Integer num = C05F.A0u;
                String str2 = this.A04;
                if (str2 == null) {
                    str = "entryPoint";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                LL0.A03(this, A0r, num, null, null, null, str2, null, null, null);
                return;
            }
        }
        str = "recyclerView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        IBinder iBinder;
        View view = this.mView;
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            Object systemService = requireContext().getSystemService("input_method");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(iBinder, 0);
        }
        return false;
    }

    @Override // X.AbstractC52114N4m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-898149184);
        super.onCreate(bundle);
        this.A04 = AbstractC153636vY.A01(requireArguments(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        C0f9.A09(-1891562335, A02);
    }
}
