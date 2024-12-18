package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N6I extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, JPR, InterfaceC58108PpX {
    public static final String __redex_internal_original_name = "ArchiveReelComposeFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    @Override // X.InterfaceC58108PpX
    public final void CzI(String str, Integer num) {
    }

    @Override // X.InterfaceC58108PpX
    public final void DH6(String str, Integer num) {
    }

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.JPR
    public final void DXZ() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        java.util.Set set = (java.util.Set) ((C26078Bg7) ((C51039Mgp) this.A0A.getValue()).A09.getValue()).A05;
        if (set.isEmpty()) {
            interfaceC56362iU.Efu(2131956960);
            interfaceC56362iU.AAC(2131968535);
        } else {
            interfaceC56362iU.setTitle(AbstractC43594JPz.A0t(AbstractC166997dE.A0N(this), set.size(), 2131963618));
            interfaceC56362iU.AAF(new ViewOnClickListenerC55467OkM(this, 34), 2131968535);
        }
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51039Mgp.A01((C51039Mgp) this.A0A.getValue(), null, true);
        ((Ow3) this.A00.getValue()).A04.add(this);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        ((C51039Mgp) this.A0A.getValue()).A02(0);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (AbstractC167007dF.A1Z(this.A05)) {
            return "reel_highlights_gallery";
        }
        return "archive_stories_tab";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public N6I() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = C57508Pfi.A00(this, enumC09460dv, 38);
        this.A05 = C57508Pfi.A00(this, enumC09460dv, 42);
        this.A04 = C57508Pfi.A00(this, enumC09460dv, 41);
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C57236PbK(this));
        this.A02 = C57508Pfi.A00(this, enumC09460dv, 39);
        this.A03 = C57508Pfi.A00(this, enumC09460dv, 40);
        this.A00 = C1XM.A00(new C57508Pfi(this, 37));
        this.A09 = C1XM.A00(new C57508Pfi(this, 48));
        this.A06 = C1XM.A00(new C57508Pfi(this, 43));
        C57508Pfi c57508Pfi = new C57508Pfi(this, 49);
        InterfaceC09390do A00 = C57508Pfi.A00(new C57508Pfi(this, 45), enumC09460dv, 46);
        this.A0A = AbstractC25225BEi.A0a(new C57508Pfi(A00, 47), c57508Pfi, new MHV(2, (Object) null, A00), AbstractC25225BEi.A1D(C51039Mgp.class));
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC58108PpX
    public final void DaM(String str, Integer num) {
        O73 o73;
        String str2;
        AbstractC167017dG.A1N(str, num);
        if (num == C05F.A00 && (o73 = (O73) ((Ow3) this.A00.getValue()).A03.get(str)) != null && (str2 = o73.A01) != null) {
            InterfaceC09390do interfaceC09390do = this.A0A;
            Iterator it = ((List) ((C26078Bg7) ((C51039Mgp) interfaceC09390do.getValue()).A09.getValue()).A02).iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (C14360o3.A0K(((OJ8) it.next()).A02.getId(), str2)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue > -1) {
                ((C51039Mgp) interfaceC09390do.getValue()).A02((r5.size() - 1) - (intValue + AbstractC167017dG.A0K(o73.A00)));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-776351304);
        super.onCreate(bundle);
        AbstractC31178DnM.A0m(requireContext(), (JQS) this.A06.getValue(), this, this.A07);
        C0f9.A09(1926922675, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1662617455);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A03(new C30480DbP(this, 17), 973849433), false, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A07), 36316851885773512L));
        C0f9.A09(-699316860, A02);
        return A022;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1547219791);
        super.onDestroy();
        C55197Oe4.A04(((C51039Mgp) this.A0A.getValue()).A05);
        ((Ow3) this.A00.getValue()).A04.remove(this);
        C0f9.A09(-474281009, A02);
    }
}
