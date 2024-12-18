package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Btc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26875Btc extends C53Z {
    public static final String __redex_internal_original_name = "ReachabilityFragment";
    public final String A03 = "creators_genai_reachability";
    public final InterfaceC09390do A01 = DH6.A01(this, "creator_ai_audience_extra", EnumC09460dv.A02, 34);
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(C29911DGz.A01(this, 45), C29911DGz.A01(this, 46), new C29894DGi(28, this, null), AbstractC25225BEi.A1D(C26906Bu9.class));
    public final InterfaceC09390do A00 = C29911DGz.A00(this, 43);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C26906Bu9 c26906Bu9 = (C26906Bu9) this.A02.getValue();
        Object value = this.A01.getValue();
        C14360o3.A0B(value, 0);
        C26891Bts c26891Bts = c26906Bu9.A01;
        int i = 2131966365;
        int i2 = 2131966363;
        if (value == EnumC53314Nhq.ANYBODY_CREATOR_DOES_NOT_FOLLOW) {
            i = 2131966364;
            i2 = 2131966362;
        }
        c26891Bts.A02.Egh(new MUG(BHS.A00(new Object[0], i2), BHS.A00(new Object[0], i), 1));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 25), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(38477790);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 37), 717076799);
        C0f9.A09(-1824681295, A02);
        return A00;
    }
}
