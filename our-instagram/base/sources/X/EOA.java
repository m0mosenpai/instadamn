package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EOA extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ChannelsFeaturedEventListFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new C37055GUl(this, 36));
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final FFL A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C45116Jxl c45116Jxl = ((FKO) ((ChannelsFeaturedEventListViewModel) this.A02.getValue()).A03.getValue()).A00;
        String str = null;
        if (c45116Jxl != null) {
            str = c45116Jxl.A00;
        }
        interfaceC56362iU.setTitle(str);
        interfaceC56362iU.EkS(true);
        if (c45116Jxl != null) {
            String str2 = c45116Jxl.A01;
            String str3 = c45116Jxl.A02;
            if (str2 != null && str3 != null) {
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A0K = str2;
                A0B.A0P = true;
                A0B.A02 = C3WR.A01(requireContext(), R.attr.igds_color_creation_tools_blue);
                AbstractC31176DnK.A1B(new ViewOnClickListenerC35671Fp6(str3, this, 6), A0B, interfaceC56362iU);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2248);
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A15 = AbstractC25225BEi.A15(this.A00);
        InterfaceC09390do interfaceC09390do = this.A02;
        C0UO c0uo = ((ChannelsFeaturedEventListViewModel) interfaceC09390do.getValue()).A03;
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new GST(this, null, 18), AbstractC33634Etk.A00(C07S.STARTED, getViewLifecycleOwner().getLifecycle(), c0uo)));
        ((ChannelsFeaturedEventListViewModel) interfaceC09390do.getValue()).A01(A15);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new V5C(this), new Object(), new EXH(this, this.A03));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new GWH(this, 23));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public EOA() {
        C37055GUl c37055GUl = new C37055GUl(this, 41);
        InterfaceC09390do A00 = C37055GUl.A00(new C37055GUl(this, 38), EnumC09460dv.A02, 39);
        this.A02 = AbstractC25225BEi.A0a(new C37055GUl(A00, 40), c37055GUl, new C50172MDz(32, null, A00), AbstractC25225BEi.A1D(ChannelsFeaturedEventListViewModel.class));
        this.A03 = new FFL(this);
        this.A01 = AbstractC60492pY.A02(this);
    }
}
