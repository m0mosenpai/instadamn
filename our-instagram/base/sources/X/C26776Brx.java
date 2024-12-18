package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.wonderwall.model.WallText;

/* renamed from: X.Brx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26776Brx extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "WallPostPreviewFragment";
    public C189478aR A00;
    public View A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02 = C1XM.A00(new DGU(this, 49));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57168PZm(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 38), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(C26066Bfu c26066Bfu, C26776Brx c26776Brx) {
        ((C56352iT) c26776Brx.A02.getValue()).setTitle(CKS.A00(c26776Brx.requireContext(), (WallText) c26066Bfu.A03));
        View view = c26776Brx.A01;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(c26066Bfu.A07 ? 1 : 0));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26776Brx() {
        C29892DGg A00 = C29892DGg.A00(this, 1);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C29892DGg.A00(C29892DGg.A00(this, 2), 3));
        this.A03 = AbstractC25225BEi.A0a(C29892DGg.A00(A002, 4), A00, new C29895DGj(31, null, A002), AbstractC25225BEi.A1D(C25884Bck.class));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        C3LO c3lo = new C3LO();
        c3lo.A06 = R.drawable.instagram_more_horizontal_pano_filled_24;
        c3lo.A05 = 2131966888;
        c3lo.A0G = ViewOnClickListenerC28666ClE.A00(this, 49);
        this.A01 = interfaceC56362iU.AA9(new C3LY(c3lo));
        A00((C26066Bfu) ((C25884Bck) this.A03.getValue()).A0B.getValue(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(347176410);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 38), -2143427436);
        C0f9.A09(683863924, A02);
        return A00;
    }
}
