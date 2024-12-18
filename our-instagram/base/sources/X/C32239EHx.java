package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EHx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32239EHx extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BannerBottomSheetFragment";
    public User A00;
    public RecyclerView A02;
    public List A01 = C16930sl.A00;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_banner_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.banner_rv);
        this.A02 = A0G;
        String str = "recyclerView";
        if (A0G != null) {
            AbstractC31177DnL.A0s(requireContext(), A0G);
            int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.A10(new C51184MjS(dimensionPixelOffset, 5));
                RecyclerView recyclerView2 = this.A02;
                if (recyclerView2 != null) {
                    requireContext();
                    User user = this.A00;
                    if (user == null) {
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                    } else {
                        recyclerView2.setAdapter(new C32419EPu(AbstractC166987dD.A0r(this.A03), user, this.A01));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-940862765);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_banner_bottom_sheet_fragment, false);
        C0f9.A09(1733029721, A02);
        return A0R;
    }
}
