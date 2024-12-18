package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.But, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26952But extends AbstractC25595BTi {
    public static final String __redex_internal_original_name = "CommentListBottomsheetComposeFragment";
    public int A00;
    public final InterfaceC09390do A05 = C1XM.A00(DAY.A00);
    public final InterfaceC09390do A06 = AbstractC25595BTi.A00(this, 5);
    public final InterfaceC09390do A02 = AbstractC25595BTi.A00(this, 10);
    public final InterfaceC09390do A03 = AbstractC25595BTi.A00(this, 14);
    public final InterfaceC09390do A04 = AbstractC25595BTi.A00(this, 15);
    public final InterfaceC09390do A01 = AbstractC25595BTi.A00(this, 8);

    @Override // X.AbstractC25595BTi, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC60442pS A00 = C28185CbY.A00(this.A09);
        C166587cU c166587cU = new C166587cU((C166047bW) A04().A0B.A03.getValue(), AbstractC166987dD.A0r(this.A0A), A00);
        c166587cU.A00(view, C71163Hc.A00(this));
        ((C166867cy) super.A05.getValue()).A03 = new D89(view, 12);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCP(c166587cU, viewLifecycleOwner, this, c07s, null, 34), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC25595BTi, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1072754486);
        super.onCreate(bundle);
        this.mLifecycleRegistry.A09((C166487cH) this.A05.getValue());
        C0f9.A09(-1798951561, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(263828775);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A03(new C30485DbU(15, viewGroup, this), -419719480), false, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(this.A0A), 36318741672565194L));
        C0f9.A09(1638370570, A02);
        return A022;
    }
}
