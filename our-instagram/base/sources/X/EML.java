package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EML extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "FacebookCrosspostingToInstagramFragment";
    public String A00;
    public String A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.facebook_crossposting_to_instagram_subtitle);
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("userName");
            throw C00O.createAndThrow();
        }
        if (str.length() > 0) {
            AbstractC31177DnL.A10(A0N, this, str, 2131962040);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A00;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return I58.A00(this, str);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A1F;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1524227108);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getString("args_previous_module_name", "");
        this.A01 = requireArguments.getString(AbstractC111324zv.A00(3958), "");
        C0f9.A09(189552821, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1930213114);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.facebook_crossposting_to_instagram_sheet_fragment, viewGroup, false);
        C0f9.A09(-532104807, A02);
        return inflate;
    }
}
