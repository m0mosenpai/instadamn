package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.facebook.R;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.igtv.widget.TitleDescriptionEditor;

/* loaded from: classes9.dex */
public abstract class N6s extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou, InterfaceC58119Ppi, InterfaceC57829Pkv {
    public static final String __redex_internal_original_name = "IGTVUploadSeriesInfoFragment";
    public View A00;
    public ImageView A01;
    public ScrollView A02;
    public TitleDescriptionEditor A03;
    public boolean A04;
    public C56062Ouf A05;
    public final InterfaceC09390do A06 = C57551PgP.A00(this, new C57551PgP(this, 16), new C57251PbZ(36, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 17);
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0v;
        C14360o3.A0B(interfaceC56362iU, 0);
        requireActivity();
        OPJ.A01(interfaceC56362iU);
        ImageView A00 = OXy.A00(interfaceC56362iU, C05F.A1F, new C57551PgP(this, 15), requireContext().getColor(AbstractC53242c7.A0C(getContext())));
        OXy.A01(A00, this.A04);
        this.A01 = A00;
        if (this instanceof NNA) {
            A0v = AbstractC25227BEk.A0v(this, 2131964190);
        } else {
            A0v = AbstractC25227BEk.A0v(this, 2131964264);
        }
        interfaceC56362iU.setTitle(A0v);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (ScrollView) view.findViewById(R.id.scroll_view_container);
        this.A00 = view.findViewById(R.id.scroll_view_content);
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            C14360o3.A0F("titleDescriptionEditor");
            throw C00O.createAndThrow();
        }
        titleDescriptionEditor.A03 = titleDescriptionEditor.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        titleDescriptionEditor.setMaxTitleLength(titleDescriptionEditor.getResources().getInteger(R.integer.series_title_max_characters));
        titleDescriptionEditor.setTitleHint(2131964275);
        titleDescriptionEditor.setDescriptionHint(2131964273);
        if (this instanceof NNB) {
            z = !((NNB) this).A00;
        } else {
            z = true;
        }
        titleDescriptionEditor.A0M = z;
    }

    public final String A00() {
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            C14360o3.A0F("titleDescriptionEditor");
            throw C00O.createAndThrow();
        }
        String A0g = AbstractC167007dF.A0g(titleDescriptionEditor.A0J);
        C14360o3.A07(A0g);
        return AbstractC25228BEl.A1A(A0g);
    }

    public final String A01() {
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            C14360o3.A0F("titleDescriptionEditor");
            throw C00O.createAndThrow();
        }
        String A0g = AbstractC167007dF.A0g(titleDescriptionEditor.A0K);
        C14360o3.A07(A0g);
        return AbstractC25228BEl.A1A(A0g);
    }

    public final boolean A02() {
        String str;
        if (this instanceof NNA) {
            NNA nna = (NNA) this;
            String str2 = nna.A01;
            if (str2 == null) {
                str = "originalTitle";
            } else if (str2.equals(nna.A01())) {
                String str3 = nna.A00;
                if (str3 == null) {
                    str = "originalDescription";
                } else if (str3.equals(nna.A00())) {
                    return false;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        NNB nnb = (NNB) this;
        if (!nnb.A01) {
            if (TextUtils.isEmpty(nnb.A01()) && TextUtils.isEmpty(nnb.A00())) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58119Ppi
    public final void Cyw() {
        if (this instanceof NNB) {
            NNB nnb = (NNB) this;
            if (nnb.A00) {
                OPI.A01(nnb, nnb.A06);
                return;
            }
            return;
        }
        if (!(getActivity() instanceof IGTVUploadActivity)) {
            return;
        }
        OPI.A01(this, this.A06);
    }

    @Override // X.InterfaceC58119Ppi
    public final void DAV() {
        if (this instanceof NNB) {
            NNB nnb = (NNB) this;
            if (nnb.A00) {
                MSW.A0b(nnb.A06).A04(nnb, NN4.A00);
                return;
            } else {
                AbstractC25226BEj.A1P(nnb);
                return;
            }
        }
        if (getActivity() instanceof IGTVUploadActivity) {
            MSW.A0b(this.A06).A04(this, NN4.A00);
        } else {
            AbstractC25226BEj.A1P(this);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C56062Ouf c56062Ouf = this.A05;
        if (c56062Ouf == null) {
            C14360o3.A0F("backHandlerDelegate");
            throw C00O.createAndThrow();
        }
        return c56062Ouf.onBackPressed();
    }

    @Override // X.InterfaceC58119Ppi
    public final boolean BCs() {
        return A02();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1037902656);
        super.onCreate(bundle);
        this.A05 = new C56062Ouf(requireContext(), this);
        C0f9.A09(-635057663, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1529440583);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.upload_series_info, false);
        if (!(getActivity() instanceof IGTVUploadActivity)) {
            View findViewById = A0R.findViewById(R.id.scroll_view_content);
            C14360o3.A0A(findViewById);
            AbstractC13880nE.A0f(findViewById, 0);
        }
        TitleDescriptionEditor titleDescriptionEditor = (TitleDescriptionEditor) A0R.findViewById(R.id.title_description_editor);
        titleDescriptionEditor.A0I = this;
        titleDescriptionEditor.A0N = false;
        this.A03 = titleDescriptionEditor;
        registerLifecycleListener(titleDescriptionEditor);
        C0f9.A09(699926701, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-28152975);
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            C14360o3.A0F("titleDescriptionEditor");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(titleDescriptionEditor);
        super.onDestroyView();
        C0f9.A09(283772258, A02);
    }
}
