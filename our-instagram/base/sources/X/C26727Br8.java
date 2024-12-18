package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Br8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26727Br8 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BlendViewerNuxFragment";
    public final InterfaceC09390do A00 = DH5.A01(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, EnumC09460dv.A02, 40);
    public final InterfaceC09390do A01;
    public final InterfaceC60442pS A02;
    public final String A03;

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26727Br8() {
        C60962qK A01 = AbstractC60952qJ.A01("blend_viewer_nux_fragment", true, false);
        this.A02 = A01;
        this.A03 = A01.A00;
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageUrl imageUrl;
        int A02 = C0f9.A02(-411991528);
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A01;
        AbstractC145016gM.A03(requireActivity, this, AbstractC166987dD.A0r(interfaceC09390do), false, true);
        C38321qM A022 = C1DW.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(AbstractC25225BEi.A15(this.A00));
        if (A022 != null) {
            imageUrl = A022.A1S();
        } else {
            imageUrl = null;
        }
        ComposeView A023 = AbstractC25319BIo.A02(this, C5UA.A04(new C30486DbV(18, imageUrl, this), -1631860901, true), true, false);
        C0f9.A09(194622658, A02);
        return A023;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1988277820);
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A01), false, true);
        super.onDestroyView();
        C0f9.A09(-126290169, A02);
    }
}
