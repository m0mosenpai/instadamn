package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Btd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26876Btd extends C53Z {
    public static final String __redex_internal_original_name = "AudienceFragment";
    public final String A04 = MSV.A00(1097);
    public final InterfaceC09390do A02 = AbstractC25235BEs.A0s(EnumC53314Nhq.NOBODY, this, "creator_ai_audience_extra", EnumC09460dv.A02, 41);
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(C29911DGz.A01(this, 38), C29911DGz.A01(this, 39), new C29894DGi(26, this, null), AbstractC25225BEi.A1D(C26906Bu9.class));
    public final InterfaceC09390do A00 = C29911DGz.A00(this, 35);
    public final InterfaceC09390do A01 = C29911DGz.A00(this, 36);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 24), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(C26876Btd c26876Btd) {
        C189448aO A0y = AbstractC25225BEi.A0y(c26876Btd.getSession());
        A0y.A0d = c26876Btd.getString(2131973239);
        A0y.A0C = 1;
        A0y.A03 = 0.7f;
        A0y.A1G = true;
        C189478aR c189478aR = (C189478aR) c26876Btd.A00.getValue();
        if (c189478aR != null) {
            c189478aR.A0F(new C26877Bte(), A0y);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-438121803);
        super.onCreate(bundle);
        ((C26906Bu9) this.A03.getValue()).A00((EnumC53314Nhq) this.A02.getValue());
        C0f9.A09(670490608, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1045642626);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 35), -583327835);
        C0f9.A09(-1224083785, A02);
        return A00;
    }
}
