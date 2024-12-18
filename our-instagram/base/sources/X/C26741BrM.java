package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.BrM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26741BrM extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BlendFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC60442pS A0A;
    public final String A0B;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57159PZd(viewLifecycleOwner, c07s, this, null, 6), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C26741BrM() {
        C60962qK A01 = AbstractC60952qJ.A01("blend_fragment", true, false);
        this.A0A = A01;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A08 = DH5.A01(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, enumC09460dv, 39);
        this.A00 = AbstractC09440dt.A00(enumC09460dv, new D66(this));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new D67(this));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new D68(this));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new D69(this));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new D6A(this));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk(true, this, "blend_membership_checked_status", 40));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk(true, this, "blend_is_eligible_to_reinvite", 41));
        J8Z j8z = new J8Z(this, 45);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new J8Z(new J8Z(this, 42), 43));
        this.A09 = AbstractC25225BEi.A0a(new J8Z(A00, 44), j8z, new D8K(30, null, A00), AbstractC25225BEi.A1D(C25842Bbx.class));
        this.A0B = A01.A00;
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-694806883);
        AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A06), false, true);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new C30506Dbp(this, 18), 1512453917, true), true, false);
        C0f9.A09(1678069152, A02);
        return A022;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1732724700);
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A06), false, true);
        super.onDestroyView();
        C0f9.A09(-1905813032, A02);
    }
}
