package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.igtv.widget.TitleDescriptionEditor;

/* loaded from: classes9.dex */
public final class NNA extends N6s {
    public static final String __redex_internal_original_name = "IGTVUploadEditSeriesFragment";
    public String A00;
    public String A01;
    public String A02;
    public final InterfaceC09390do A03 = C57551PgP.A01(this, 14);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_edit_series_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.N6s, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String str2 = this.A01;
        if (str2 == null) {
            str = "originalTitle";
        } else {
            TitleDescriptionEditor titleDescriptionEditor = super.A03;
            if (titleDescriptionEditor != null) {
                titleDescriptionEditor.setTitleText(str2);
                String str3 = this.A00;
                if (str3 == null) {
                    str = "originalDescription";
                } else {
                    TitleDescriptionEditor titleDescriptionEditor2 = super.A03;
                    if (titleDescriptionEditor2 != null) {
                        titleDescriptionEditor2.setDescriptionText(str3);
                        return;
                    }
                }
            }
            str = "titleDescriptionEditor";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.N6s, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(991018162);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("igtv_series_id_arg", "");
        this.A01 = requireArguments.getString("igtv_series_name_arg", "");
        this.A00 = requireArguments.getString("igtv_series_description_arg", "");
        C0f9.A09(842712912, A02);
    }
}
