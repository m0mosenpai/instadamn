package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import java.util.Collection;

/* renamed from: X.KDo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45523KDo extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC1119153d, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AppreciationCreatorInsightsFragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new C50157MDk(this, 43));
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953093);
        C3LO c3lo = new C3LO();
        c3lo.A06 = R.drawable.instagram_info_pano_outline_24;
        c3lo.A05 = 2131953028;
        AbstractC31176DnK.A1B(LQ0.A01(this, 41), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC37304Gc5.A0y(getRecyclerView().A0D, getRecyclerView(), new JY9(this, 0), C153146ui.A0A);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 5);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, mcq, A00);
        AbstractC23641Du.A05(anonymousClass191, new MCQ(A0K, c07s, this, null, 6), C07Y.A00(A0K));
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        Object[] objArr;
        Object obj;
        char c = 1;
        if (C18U.A06(C06090Tz.A05, ((C44521JmR) this.A02.getValue()).A05, 36316491108716971L)) {
            objArr = new AbstractC66412zI[4];
            objArr[0] = new KI9(requireActivity(), AbstractC166987dD.A0r(this.A01), new C50157MDk(this, 40));
            objArr[1] = new Object();
            objArr[2] = new KHH(new C50157MDk(this, 41));
            c = 3;
            obj = new C45628KHr(this, this);
        } else {
            objArr = new AbstractC66412zI[2];
            objArr[0] = new KI9(requireActivity(), AbstractC166987dD.A0r(this.A01), new C50157MDk(this, 42));
            obj = new Object();
        }
        objArr[c] = obj;
        return AbstractC16960so.A1Q(objArr);
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(MJ7.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C45523KDo() {
        C50157MDk c50157MDk = new C50157MDk(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50157MDk(new C50157MDk(this, 44), 45));
        this.A02 = AbstractC25225BEi.A0a(new C50157MDk(A00, 46), c50157MDk, new C29897DGl(29, null, A00), AbstractC25225BEi.A1D(C44521JmR.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        CreatorLoggingData A00 = AbstractC46602Kjf.A00(requireArguments());
        ((LLN) this.A00.getValue()).A0B(Boolean.valueOf(A00.A01), Boolean.valueOf(A00.A02), C05F.A1I, A00.A00);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        CreatorLoggingData A00 = AbstractC46602Kjf.A00(requireArguments());
        ((LLN) this.A00.getValue()).A0B(Boolean.valueOf(A00.A01), Boolean.valueOf(A00.A02), C05F.A1F, A00.A00);
        return false;
    }
}
