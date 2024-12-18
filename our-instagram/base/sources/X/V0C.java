package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V0C extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MarketingActivationFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle("Marketing Activation");
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_chevron_left_pano_outline_24;
        interfaceC56362iU.Ehd(new C3LY(c3lo));
        C3LO c3lo2 = new C3LO();
        c3lo2.A06 = R.drawable.instagram_direct_pano_outline_24;
        c3lo2.A0K = "";
        c3lo2.A0M = "";
        interfaceC56362iU.AA9(new C3LY(c3lo2));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "marketing_activation_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A00.getValue();
    }

    public V0C() {
        X2w x2w = new X2w(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2w(new X2w(this, 30), 31));
        this.A01 = new C60842q8(new X2w(A00, 32), x2w, new C29898DGm(2, null, A00), new C0YZ(C44485Jlr.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1328343972);
        super.onCreate(bundle);
        AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01.getValue();
        C50120MBu.A01(abstractC52922bZ, "test", AbstractC141776au.A00(abstractC52922bZ), 0);
        C0f9.A09(1697570558, A02);
    }
}
