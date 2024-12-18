package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;

/* renamed from: X.Brl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26764Brl extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ReelsMidcardInjectToolSelectionFragment";
    public final String A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0c = AbstractC166987dD.A0c(view, R.id.midcard_view);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new B5a(viewLifecycleOwner, A0c, c07s, this, null, 5), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public C26764Brl() {
        D88 d88 = new D88(this, 40);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new D88(new D88(this, 37), 38));
        this.A06 = AbstractC25225BEi.A0a(new D88(A00, 39), d88, new D8K(40, null, A00), AbstractC25225BEi.A1D(C50929Mey.class));
        this.A05 = AbstractC60492pY.A02(this);
        this.A02 = C1XM.A00(new D88(this, 33));
        this.A03 = C1XM.A00(new D88(this, 34));
        this.A04 = C1XM.A00(new D88(this, 35));
        this.A01 = AbstractC25225BEi.A0a(new D88(this, 36), new D88(this, 32), new D8K(39, null, this), AbstractC25225BEi.A1D(C1810981l.class));
        this.A00 = "InjectedMidcardFragment";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1752721646);
        C14360o3.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("midcard_type_args");
        } else {
            str = null;
        }
        Object obj = InstagramMidcardType.A01.get(str);
        if (obj == null) {
            obj = InstagramMidcardType.A0k;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("midcard_subtype_args");
        }
        ClipsMidCardSubtype A00 = AbstractC39817HlR.A00(str2);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A06);
        AbstractC166987dD.A1Z(new C57159PZd(obj, A00, A0Z, null, 8), AbstractC141776au.A00(A0Z));
        View inflate = layoutInflater.inflate(R.layout.reels_injected_midcard_fragment, viewGroup, false);
        C0f9.A09(731470468, A02);
        return inflate;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
    }
}
