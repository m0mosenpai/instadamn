package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.EKj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32296EKj extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "GuidedActivationConfirmationFragment";
    public IgLinearLayout A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public C51157Mj0 A04;
    public SpinnerImageView A05;
    public RecyclerView A06;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A07 = C37049GUf.A00(this, 21);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgLinearLayout) view.requireViewById(R.id.guided_activation_container);
        this.A05 = AbstractC31180DnO.A0V(view);
        this.A03 = AbstractC31172DnG.A0X(view, R.id.guided_activation_confirmation_title);
        this.A02 = AbstractC31172DnG.A0X(view, R.id.guided_activation_confirmation_subtitle);
        this.A01 = AbstractC31172DnG.A0X(view, R.id.guided_activation_notify_now);
        this.A06 = AbstractC31172DnG.A0G(view, R.id.notification_deferral_next_steps_recycler_view);
        C51157Mj0 c51157Mj0 = new C51157Mj0(AbstractC166987dD.A0r(this.A08));
        this.A04 = c51157Mj0;
        c51157Mj0.A00 = this;
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null) {
            C14360o3.A0F("nextSteps");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(c51157Mj0);
        C50952MfL c50952MfL = (C50952MfL) this.A09.getValue();
        C141796aw A00 = AbstractC141776au.A00(c50952MfL);
        C50530MSj c50530MSj = new C50530MSj(c50952MfL, null);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c50530MSj, A00);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new MCL(viewLifecycleOwner, c07s, this, null, 23), C07Y.A00(viewLifecycleOwner));
        AbstractC23641Du.A05(anonymousClass191, new MCL(A0K, c07s, this, null, 24), C07Y.A00(A0K));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public C32296EKj() {
        C37049GUf c37049GUf = new C37049GUf(this, 25);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37049GUf(new C37049GUf(this, 22), 23));
        this.A09 = AbstractC25225BEi.A0a(new C37049GUf(A00, 24), c37049GUf, new C50171MDy(34, null, A00), AbstractC25225BEi.A1D(C50952MfL.class));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        interfaceC56362iU.Efu(2131963407);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(35958899);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.guided_activation_confirmation, viewGroup, false);
        C0f9.A09(1353784320, A02);
        return inflate;
    }
}
