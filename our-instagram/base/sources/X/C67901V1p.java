package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.V1p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67901V1p extends C53Z implements C1M1, InterfaceC62612t0, XB1 {
    public static final String __redex_internal_original_name = "SaveToCollectionFragment";
    public int A00;
    public RecyclerView A01;
    public C38321qM A02;
    public InterfaceC60442pS A03;
    public C66417UGl A04;
    public GFJ A05;
    public XLP A06;
    public VCX A07;
    public SpinnerImageView A08;
    public String A09;
    public String A0A;
    public int A0B;
    public C41645Ibb A0C;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List BqL;
        String str;
        super.onViewCreated(view, bundle);
        boolean z = false;
        C38321qM c38321qM = this.A02;
        if (c38321qM != null) {
            z = Boolean.valueOf(AbstractC35273Fh8.A09(getSession(), c38321qM, this.A00));
        }
        C66417UGl c66417UGl = new C66417UGl(requireContext(), this, this, z, AbstractC35273Fh8.A08(getSession()));
        this.A04 = c66417UGl;
        if (this.A07.ordinal() == 1 && (str = this.A09) != null) {
            BqL = Collections.singletonList(str);
        } else {
            C38321qM c38321qM2 = this.A02;
            if (c38321qM2 != null) {
                BqL = c38321qM2.BqL();
            } else {
                throw new IllegalStateException("mSelectionMode disallows mMedia or mCollectionIdViewing to be null");
            }
        }
        c66417UGl.A00 = BqL;
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.collections_recycler_view);
        this.A01 = recyclerView;
        recyclerView.setAdapter(this.A04);
        AbstractC31174DnI.A17(getContext(), this.A01, false);
        RecyclerView recyclerView2 = this.A01;
        recyclerView2.A14(new C153156uj(recyclerView2.A0D, this, C153146ui.A08));
        int A03 = AbstractC167017dG.A03(requireContext());
        this.A01.A10(new C3YB(A03, A03));
        this.A08 = (SpinnerImageView) view.findViewById(R.id.loading_spinner);
        C66417UGl c66417UGl2 = this.A04;
        c66417UGl2.A06.clear();
        c66417UGl2.notifyDataSetChanged();
        SpinnerImageView spinnerImageView = this.A08;
        spinnerImageView.getClass();
        spinnerImageView.setLoadingStatus(C3T1.LOADING);
        this.A05.A02(true, true);
        C38321qM c38321qM3 = this.A02;
        if (c38321qM3 != null) {
            AbstractC99834e5.A00(view, this.A03, getSession(), c38321qM3);
        }
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        this.A05.A01();
    }

    @Override // X.XB1
    public final void D5t(SavedCollection savedCollection) {
        if (this.A06 != null) {
            if (this.A07.ordinal() != 1) {
                C38321qM c38321qM = this.A02;
                if (c38321qM != null) {
                    String str = savedCollection.A0F;
                    String str2 = EnumC33416Epn.A07.A01;
                    C41645Ibb c41645Ibb = this.A0C;
                    if (str == str2) {
                        int i = this.A00;
                        int i2 = this.A0B;
                        this.A04.getItemCount();
                        c41645Ibb.A01(this.mParentFragment, c38321qM, i, i2);
                    } else {
                        int i3 = this.A00;
                        int i4 = this.A0B;
                        c41645Ibb.A02(this.mParentFragment, c38321qM, savedCollection, this.A09, i3, i4);
                    }
                }
                this.A06.APe();
                return;
            }
            if (TextUtils.isEmpty(this.A09) || this.A09.equals(savedCollection.A0F)) {
                return;
            }
            this.A06.Cpy(savedCollection);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A07 == VCX.MOVE_TO) {
            return "move_to_collection_tray";
        }
        return "save_to_collections_tray";
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return requireArguments().getString("SaveToCollectionFragment.ARGS_SESSION_ID");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(108822075);
        super.onCreate(bundle);
        this.A09 = requireArguments().getString("SaveToCollectionFragment.ARGS_COLLECTION_ID_VIEWING");
        this.A02 = C1DW.A00(getSession()).A02(requireArguments().getString("SaveToCollectionFragment.ARGS_MEDIA_ID"));
        this.A00 = requireArguments().getInt("SaveToCollectionFragment.ARGS_CAROUSEL_INDEX");
        this.A0A = requireArguments().getString("SaveToCollectionFragment.ARGS_NAVIGATION_TYPE");
        Parcelable parcelable = requireArguments().getParcelable("SaveToCollectionFragment.ARGS_PARENT_MODULE");
        parcelable.getClass();
        this.A03 = (InterfaceC60442pS) parcelable;
        this.A0B = requireArguments().getInt("SaveToCollectionFragment.ARGS_POSITION");
        Serializable serializable = requireArguments().getSerializable("SaveToCollectionFragment.ARGS_SELECTION_MODE");
        serializable.getClass();
        this.A07 = (VCX) serializable;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        UserSession session = getSession();
        C67901V1p c67901V1p = this;
        if (requireArguments().getString("SaveToCollectionFragment.ARGS_SESSION_ID") == null) {
            c67901V1p = null;
        }
        this.A0C = new C41645Ibb(this, session, interfaceC60442pS, c67901V1p);
        List A00 = AbstractC35273Fh8.A00(getSession(), this.A02, Arrays.asList(EnumC33416Epn.A0A), this.A00);
        this.A05 = new GFJ(requireContext(), AbstractC018607g.A00(this), this, getSession(), new C71003WmK(this, 0), A00, Collections.emptyList(), null);
        VCX vcx = this.A07;
        if (vcx == null || ((vcx == VCX.MOVE_TO && this.A09 == null) || (vcx == VCX.SAVE_TO && this.A02 == null))) {
            XLP xlp = this.A06;
            if (xlp != null) {
                xlp.APe();
            } else {
                AbstractC31176DnK.A12(requireContext(), C3DN.A00);
            }
        }
        C0f9.A09(-2041628461, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1869346370);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, null, R.layout.save_to_collection);
        C0f9.A09(-784843665, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(194162887);
        super.onDestroyView();
        this.A08 = null;
        this.A01 = null;
        C0f9.A09(-1344215562, A02);
    }
}
