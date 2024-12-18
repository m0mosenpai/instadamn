package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;

/* loaded from: classes9.dex */
public final class NNB extends N6s implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "IGTVUploadCreateSeriesFragment";
    public boolean A01;
    public FragmentActivity A02;
    public final InterfaceC09390do A04 = C57551PgP.A00(this, new C57551PgP(this, 12), new C57251PbZ(35, null, this), AbstractC25225BEi.A1D(C50995Mg2.class), 13);
    public boolean A00 = true;
    public final InterfaceC09390do A03 = C57551PgP.A01(this, 11);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_create_series_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.LRc, java.lang.Object] */
    @Override // X.N6s, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC46635KkC.A00(this, new Object());
    }

    @Override // X.N6s, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1253495361);
        super.onCreate(bundle);
        this.A00 = getActivity() instanceof IGTVUploadActivity;
        this.A02 = requireActivity();
        C0f9.A09(-1376484923, A02);
    }
}
