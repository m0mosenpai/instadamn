package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class N48 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AdCodeAfterMediaCreationFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        InterfaceC43551JLl A1F;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        String string = requireArguments().getString("media_id");
        C38321qM A02 = AbstractC31176DnK.A0Z(this.A00).A02(string);
        if (A02 != null && (A1F = A02.A1F()) != null) {
            str = A1F.getAccessToken();
        } else {
            str = null;
        }
        if (A02 == null) {
            C0f5 AEp = C18950wb.A01.AEp("missing_argument", 652421789);
            AEp.ERI(AbstractC166987dD.A14(AbstractC111324zv.A00(2694)));
            AEp.report();
        }
        if (str == null) {
            C0f5 AEp2 = C18950wb.A01.AEp("missing_argument", 652421789);
            AEp2.ERI(AbstractC166987dD.A14("adcode is null"));
            AEp2.report();
        }
        if (A02 != null && str != null) {
            ImageUrl A1S = A02.A1S();
            if (A1S != null) {
                AbstractC31172DnG.A0Z(view, R.id.media_thumbnail).setUrl(A1S, this);
            }
            TextView A0N = AbstractC167007dF.A0N(view, R.id.ad_code);
            A0N.setText(str);
            C0fQ.A00(new ViewOnClickListenerC35674Fp9(requireContext, this, str, string, 0), A0N);
            C0fQ.A00(new ViewOnClickListenerC35674Fp9(requireContext, this, str, string, 1), view.requireViewById(R.id.copy_button));
            C0fQ.A00(new ViewOnClickListenerC35674Fp9(requireContext, this, str, string, 2), view.requireViewById(R.id.share_button));
            return;
        }
        AbstractC25233BEq.A14(this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-4462008);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.pa_ad_code_after_media_creation, viewGroup, false);
        C0f9.A09(-210677934, A02);
        return inflate;
    }
}
