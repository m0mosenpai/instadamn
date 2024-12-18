package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.V1k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67900V1k extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionTestFragment";
    public View A00;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "qp_test_surface";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131958527));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Context context;
        int A02 = C0f9.A02(-1857399109);
        super.onCreate(bundle);
        if (this.mArguments != null && (context = getContext()) != null) {
            C1ON A00 = AFY.A00(getSession(), QuickPromotionSlot.A0o, C05F.A01, (int) Math.ceil(AbstractC65702TsY.A00(context)));
            A00.A00 = new C67954V3t(16, context, this);
            schedule(A00);
        }
        C0f9.A09(433648046, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1844801176);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.quick_promotion_test_fragment, false);
        C0f9.A09(-1925601918, A02);
        return A07;
    }
}
