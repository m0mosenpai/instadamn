package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity;

/* renamed from: X.EKo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32301EKo extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BrandedContentSettingsFragment";
    public C64842wi A00;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A02 = C1XM.A00(new C50163MDq(this, 0));
    public InterfaceC16820sZ A01 = new C50163MDq(this, 5);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131954154);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((RecyclerView) AbstractC166997dE.A0R(view, R.id.branded_content_settings_recycler_view)).setAdapter((C2UU) this.A02.getValue());
        C44548Jms c44548Jms = (C44548Jms) this.A04.getValue();
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), c44548Jms.A04, new C50259MHo(this, 22), 43);
        c44548Jms.A03();
        AbstractC166987dD.A1Z(new MCJ(c44548Jms, this, null, 48), AbstractC25235BEs.A0S(this));
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0D;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A04 = new GCP(this, 0);
        A0S.A08 = new C31451Drv(this, 0);
        C64842wi A0T = AbstractC31175DnJ.A0T(this, A0r, A0S, A00, quickPromotionSlot);
        this.A00 = A0T;
        A0T.DiZ();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C32301EKo() {
        C50163MDq c50163MDq = new C50163MDq(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50163MDq(new C50163MDq(this, 1), 2));
        this.A04 = AbstractC25225BEi.A0a(new C50163MDq(A00, 3), c50163MDq, new C57253Pbb(1, null, A00), AbstractC25225BEi.A1D(C44548Jms.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && intent.getBooleanExtra(MSV.A00(749), false)) {
            ((C44548Jms) this.A04.getValue()).A03();
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (requireActivity() instanceof BrandedContentUrlHandlerActivity) {
            AbstractC25227BEk.A1B(this);
            return true;
        }
        getParentFragmentManager().A0x(null, 0);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1443888562);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.branded_content_settings, viewGroup, false);
        C0f9.A09(-2027261446, A02);
        return inflate;
    }
}
