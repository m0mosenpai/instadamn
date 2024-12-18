package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;

/* renamed from: X.V1q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67902V1q extends C53Z implements C1M1, InterfaceC86363t8 {
    public static final String __redex_internal_original_name = "SaveToNewCollectionFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public EditText A05;
    public C38321qM A06;
    public C41645Ibb A07;
    public C69150Vif A08;
    public String A09;
    public String A0A;
    public InterfaceC60442pS A0B;
    public RoundedCornerCheckMarkSelectableImageView A0C;
    public final TextWatcher A0D = new WKU(this, 17);

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwQ(float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwR(Integer num, float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5o() {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5p(Integer num) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DId(Integer num) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DZk(int i, int i2) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void Dyj(C51752Mtb c51752Mtb) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "save_to_collections_tray";
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        View view = this.mView;
        if (view != null) {
            AbstractC13880nE.A0O(view);
        }
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return requireArguments().getString("SaveToNewCollectionFragment.ARGS_SESSION_ID");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1788302559);
        super.onCreate(bundle);
        this.A06 = C1DW.A00(getSession()).A02(requireArguments().getString("SaveToNewCollectionFragment.ARGS_MEDIA_ID"));
        this.A00 = requireArguments().getInt("SaveToNewCollectionFragment.ARGS_CAROUSEL_INDEX");
        this.A09 = requireArguments().getString("SaveToNewCollectionFragment.ARGS_NAVIGATION_TYPE");
        this.A0B = (InterfaceC60442pS) requireArguments().getParcelable("SaveToNewCollectionFragment.ARGS_PARENT_MODULE");
        this.A02 = requireArguments().getInt("SaveToNewCollectionFragment.ARGS_POSITION");
        this.A03 = requireArguments().getInt("SaveToNewCollectionFragment.ARGS_PREV_NUM_COLLECTIONS");
        InterfaceC60442pS interfaceC60442pS = this.A0B;
        UserSession session = getSession();
        C67902V1q c67902V1q = this;
        if (requireArguments().getString("SaveToNewCollectionFragment.ARGS_SESSION_ID") == null) {
            c67902V1q = null;
        }
        this.A07 = new C41645Ibb(this, session, interfaceC60442pS, c67902V1q);
        if (this.A06 == null) {
            AbstractC31176DnK.A12(requireContext(), C3DN.A00);
        }
        C0f9.A09(-1712000953, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-760062111);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, null, R.layout.save_to_new_collection);
        C0f9.A09(1801727205, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1811164030);
        super.onDestroyView();
        this.A0C = null;
        this.A05 = null;
        this.A04 = null;
        C0f9.A09(861109236, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1424230457);
        super.onPause();
        AbstractC13880nE.A0O(this.mView);
        C0f9.A09(-1025220650, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0C = (RoundedCornerCheckMarkSelectableImageView) view.requireViewById(R.id.collection_image);
        C38321qM c38321qM = this.A06;
        c38321qM.getClass();
        ExtendedImageUrl A1o = c38321qM.A1o(R.dimen.fbpay_ui_text_button_width);
        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = this.A0C;
        if (A1o != null) {
            roundedCornerCheckMarkSelectableImageView.setUrl(A1o, this);
        } else {
            roundedCornerCheckMarkSelectableImageView.A02();
        }
        this.A04 = view.findViewById(R.id.edit_text_underline);
        this.A01 = AbstractC167017dG.A09(requireContext());
        EditText editText = (EditText) view.requireViewById(R.id.create_collection_edit_text);
        this.A05 = editText;
        editText.addTextChangedListener(this.A0D);
        this.A05.requestFocus();
        AbstractC13880nE.A0R(this.A05);
    }
}
