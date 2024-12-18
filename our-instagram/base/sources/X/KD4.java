package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* loaded from: classes8.dex */
public final class KD4 extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "CameraFormatAttributionSheetFragment";
    public UserSession A00;
    public EnumC138476Pd A01;
    public String A02;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CameraConfiguration A00;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            Resources resources = context.getResources();
            ImageView A0D = AbstractC31176DnK.A0D(view, R.id.action_sheet_header_picture);
            TextView A0N = AbstractC167007dF.A0N(view, R.id.action_sheet_header_text_view);
            TextView A0N2 = AbstractC167007dF.A0N(view, R.id.action_sheet_subheader_text_view);
            View A0S = AbstractC166997dE.A0S(view, R.id.action_sheet_row_text_view);
            EnumC138476Pd enumC138476Pd = this.A01;
            if (enumC138476Pd != null && (A00 = enumC138476Pd.A00()) != null) {
                if (this.A00 == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                int A002 = AbstractC191348dl.A00(A00);
                if (A002 >= 0) {
                    AbstractC166997dE.A19(context, A0D, A002);
                }
            }
            EnumC138476Pd enumC138476Pd2 = this.A01;
            if (enumC138476Pd2 != null) {
                A0N.setText(AbstractC43592JPx.A07(enumC138476Pd2.A01(context)));
                A0N.setTypeface(null, 1);
                A0N2.setText(AbstractC13670mt.A06(AbstractC166997dE.A0q(resources, 2131953236), resources.getString(R.string.res_0x7f130072_name_removed)));
                AbstractC56952jT.A01(A0S);
                ViewOnClickListenerC48073LPy.A00(A0S, 36, this);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "stories_attribution_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1589620893);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = EnumC138476Pd.A01.A00(requireArguments.getString("reel_capture_type"));
        this.A02 = requireArguments.getString("source_media_id");
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-1756885307, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1491928449);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.capture_format_attribution_sheet_fragment, viewGroup, false);
        C0f9.A09(2039865162, A02);
        return inflate;
    }
}
