package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class EOC extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BroadcastChannelActivityFeedV2Fragment";
    public final java.util.Set A00;
    public final InterfaceC09390do A01 = C1XM.A00(new C37055GUl(this, 16));
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final FFI A05;
    public final FFJ A06;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131959426;
        if (AbstractC167027dH.A01(this.A01) == 0) {
            i = 2131959425;
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.EkS(true);
        InterfaceC09390do interfaceC09390do = this.A03;
        if (C7HD.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36319377328840004L)) {
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A0C = 2131959424;
                A0B.A0P = true;
                A0B.A02 = AbstractC31173DnH.A03(getContext(), requireContext(), R.attr.igds_color_creation_tools_blue);
                AbstractC31176DnK.A1B(ViewOnClickListenerC35681FpG.A00(this, 38), A0B, interfaceC56362iU);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_broadcast_chats_activity_feed";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        C0UO c0uo = ((BroadcastChannelActivityFeedV2ViewModel) interfaceC09390do.getValue()).A08;
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new GST(this, null, 15), AbstractC33634Etk.A00(C07S.STARTED, getViewLifecycleOwner().getLifecycle(), c0uo)));
        ((BroadcastChannelActivityFeedV2ViewModel) interfaceC09390do.getValue()).A01();
        G7M.A00(getRecyclerView(), this, 1);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new C32610EXk(this, this.A06), new EX3(this.A05), new Object(), new C65721Tsu(((BroadcastChannelActivityFeedV2ViewModel) this.A04.getValue()).A05, null, null, R.layout.direct_empty_view));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new GWH(this, 21));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public EOC() {
        C37055GUl c37055GUl = new C37055GUl(this, 22);
        InterfaceC09390do A00 = C37055GUl.A00(new C37055GUl(this, 19), EnumC09460dv.A02, 20);
        this.A04 = AbstractC25225BEi.A0a(new C37055GUl(A00, 21), c37055GUl, new C50172MDz(29, null, A00), AbstractC25225BEi.A1D(BroadcastChannelActivityFeedV2ViewModel.class));
        this.A02 = C1XM.A00(new C37055GUl(this, 18));
        this.A06 = new FFJ(this);
        this.A00 = AbstractC31171DnF.A0l();
        this.A05 = new FFI(this);
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C81663kb C76;
        int A02 = C0f9.A02(-1642150674);
        super.onResume();
        BroadcastChannelActivityFeedV2ViewModel broadcastChannelActivityFeedV2ViewModel = (BroadcastChannelActivityFeedV2ViewModel) this.A04.getValue();
        if (broadcastChannelActivityFeedV2ViewModel.A06.getValue() == EnumC33355Eoo.A06) {
            C05A c05a = broadcastChannelActivityFeedV2ViewModel.A07;
            Iterable A0w = AbstractC31172DnG.A0w(c05a);
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0w) {
                InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) obj;
                if ((interfaceC66482zP instanceof C32097E8v) && ((C76 = broadcastChannelActivityFeedV2ViewModel.A04.C76(((C32097E8v) interfaceC66482zP).A06)) == null || !C76.CPZ())) {
                    A1E.add(obj);
                }
            }
            boolean A1b = AbstractC166987dD.A1b(A1E);
            List list = A1E;
            if (!A1b) {
                list = AbstractC166987dD.A1J(new E8U(AbstractC166997dE.A0q(broadcastChannelActivityFeedV2ViewModel.A02, 2131958786)));
            }
            c05a.Egh(list);
        }
        C0f9.A09(-1596632729, A02);
    }
}
