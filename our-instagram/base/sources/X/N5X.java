package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class N5X extends AbstractC59962oe implements InterfaceC58184Pqp, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PartnershipLabelAndAdsFragment";
    public BrandedContentGatingInfoIntf A00;
    public BrandedContentProjectMetadataIntf A01;
    public List A02;
    public boolean A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A09;
    public final InterfaceC41501vz A0A;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04 = C1XM.A00(new C50163MDq(this, 7));
    public final InterfaceC09390do A08 = C1XM.A00(new C50163MDq(this, 10));

    @Override // X.InterfaceC58184Pqp
    public final void CvJ() {
    }

    @Override // X.InterfaceC58184Pqp
    public final void CvK() {
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CvW(boolean z) {
        return false;
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CwP(boolean z) {
        return false;
    }

    @Override // X.InterfaceC58184Pqp
    public final void DQD(View view) {
    }

    @Override // X.InterfaceC58184Pqp
    public final void DTc(View view) {
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean DkH() {
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969368);
        interfaceC56362iU.EkF(AbstractC167007dF.A1Z(this.A08));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new NED(this));
        A0R.A01(new Object());
        InterfaceC09390do interfaceC09390do = this.A07;
        C66362zD A0R2 = AbstractC31173DnH.A0R(A0R, new NEO(this, AbstractC166987dD.A0r(interfaceC09390do)));
        A08.setAdapter(A0R2);
        AbstractC31174DnI.A16(getContext(), A08, 1, false);
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        A08.setItemAnimator(c70623Ez);
        C50970Mfd c50970Mfd = (C50970Mfd) this.A09.getValue();
        c50970Mfd.A00 = AbstractC167007dF.A1Z(this.A04);
        interfaceC09390do.getValue();
        List list = this.A02;
        if (list == null) {
            C14360o3.A0F("brandedContentTags");
            throw C00O.createAndThrow();
        }
        c50970Mfd.A00(AbstractC55150OdD.A00(requireContext(), this.A01, list, this.A03));
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), c50970Mfd.A01, new C50259MHo(A0R2, 24), 44);
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), AbstractC31172DnG.A0E(c50970Mfd.A04), new C50259MHo(this, 25), 44);
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CvB(boolean z) {
        C50970Mfd c50970Mfd = (C50970Mfd) this.A09.getValue();
        this.A07.getValue();
        List list = this.A02;
        if (list == null) {
            C14360o3.A0F("brandedContentTags");
            throw C00O.createAndThrow();
        }
        String A00 = AbstractC55150OdD.A00(requireContext(), this.A01, list, this.A03);
        c50970Mfd.A00 = z;
        c50970Mfd.A00(A00);
        AbstractC25651Mw.A00(c50970Mfd.A02).E4s(new C56023Otu(z));
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public N5X() {
        C50163MDq c50163MDq = new C50163MDq(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50163MDq(new C50163MDq(this, 11), 12));
        this.A09 = AbstractC25225BEi.A0a(new C50163MDq(A00, 13), c50163MDq, new C57253Pbb(2, null, A00), AbstractC25225BEi.A1D(C50970Mfd.class));
        this.A06 = C1XM.A00(new C50163MDq(this, 9));
        this.A05 = C1XM.A00(new C50163MDq(this, 8));
        this.A0A = C56035Ou7.A00(this, 12);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        Object parcelable;
        Object parcelable2;
        int A02 = C0f9.A02(182751987);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("argument_is_paid_partnership_label");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableArrayList = requireArguments.getParcelableArrayList("argument_bc_tag_list", BrandedContentTag.class);
        } else {
            parcelableArrayList = requireArguments.getParcelableArrayList("argument_bc_tag_list");
        }
        this.A02 = MSY.A0l(parcelableArrayList);
        if (i >= 33) {
            parcelable = requireArguments.getParcelable("argument_bc_project_metadata", BrandedContentProjectMetadata.class);
        } else {
            parcelable = requireArguments.getParcelable("argument_bc_project_metadata");
        }
        this.A01 = (BrandedContentProjectMetadataIntf) parcelable;
        if (i >= 33) {
            parcelable2 = requireArguments.getParcelable("argument_bc_gating_info", BrandedContentGatingInfo.class);
        } else {
            parcelable2 = requireArguments.getParcelable("argument_bc_gating_info");
        }
        this.A00 = (BrandedContentGatingInfo) parcelable2;
        AbstractC31176DnK.A0Q(this.A07).A01(this.A0A, C56021Ots.class);
        C0f9.A09(774617613, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-757940451);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_recyclerview, false);
        C0f9.A09(1729966750, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1072051628);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A07).A02(this.A0A, C56021Ots.class);
        C0f9.A09(-2026833886, A02);
    }
}
