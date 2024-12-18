package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.BsW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26808BsW extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SchoolSettingsGraduationFragment";
    public SchoolSettingsRepository A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public EnumC39642HiX A00 = EnumC39642HiX.SWITCH_SCHOOL_SETTING;
    public final C8n A06 = C8n.UPDATE_GRADUATION;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963282);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_settings_graduation";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25226BEj.A12(this.A03).A03(EnumC39642HiX.PROFILE_BIO, this.A06);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 48), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A12(this.A03).A04(this.A00, this.A06);
        return false;
    }

    public C26808BsW() {
        C37016GSx c37016GSx = new C37016GSx(this, 46);
        C37016GSx c37016GSx2 = new C37016GSx(this, 43);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C37016GSx(c37016GSx2, 44));
        this.A05 = AbstractC25225BEi.A0a(new C37016GSx(A00, 45), c37016GSx, new C57536PgA(40, null, A00), AbstractC25225BEi.A1D(C25856BcB.class));
        this.A03 = AbstractC09440dt.A01(new C37016GSx(this, 41));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C37016GSx(this, 40));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-709213247);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 42), -210669795);
        C0f9.A09(1800130619, A02);
        return A00;
    }
}
