package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* renamed from: X.NPe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52609NPe extends N73 implements InterfaceC58285Psd {
    public static final String __redex_internal_original_name = "MediaKitGalleryPickerFragment";
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C14360o3.A0B(map, 0);
        A00(map);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A01().A05(view, false);
        Object value = this.A05.getValue();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, value, c07s, this, null, 1), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C52609NPe() {
        C57546PgK c57546PgK = new C57546PgK(this, 21);
        InterfaceC09390do A00 = C57546PgK.A00(new C57546PgK(this, 22), EnumC09460dv.A02, 23);
        this.A00 = AbstractC25225BEi.A0a(new C57546PgK(A00, 24), c57546PgK, C57535Pg9.A00(null, A00, 31), AbstractC25225BEi.A1D(C52618NPn.class));
    }

    private final void A00(Map map) {
        EnumC172127lh A00 = AbstractC93174Ft.A00(map);
        boolean z = true;
        if (A00 != null && A00 != EnumC172127lh.A05) {
            if (A00 != EnumC172127lh.A04) {
                z = false;
            }
            C66095TzW c66095TzW = super.A00;
            if (c66095TzW != null) {
                c66095TzW.A00 = new C52513NLg(z);
                C66095TzW.A00(c66095TzW);
                AbstractC93174Ft.A01(requireActivity(), this);
                return;
            }
        } else {
            C66095TzW c66095TzW2 = super.A00;
            if (c66095TzW2 != null) {
                c66095TzW2.A00 = null;
                C66095TzW.A00(c66095TzW2);
                A04(false);
                return;
            }
        }
        C14360o3.A0F("gridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1738293666);
        super.onStart();
        FragmentActivity requireActivity = requireActivity();
        A00(AbstractC23451Ch.A02(requireActivity, AbstractC93174Ft.A05(requireActivity)));
        C0f9.A09(-106771545, A02);
    }
}
