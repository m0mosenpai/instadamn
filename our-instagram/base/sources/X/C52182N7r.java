package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N7r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52182N7r extends AbstractC43842Ja5 implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou, InterfaceC1571373s, InterfaceC58119Ppi {
    public static final String __redex_internal_original_name = "IGTVUploadSeriesSelectionFragment";
    public View A00;
    public C32158EBf A01;
    public C52339NEd A02;
    public FragmentActivity A04;
    public C56062Ouf A05;
    public C1571273r A06;
    public final InterfaceC09390do A08 = C57551PgP.A00(this, new C57551PgP(this, 19), new C57251PbZ(37, null, this), AbstractC25225BEi.A1D(C50995Mg2.class), 20);
    public final InterfaceC09390do A0A = C57551PgP.A00(this, new C57551PgP(this, 21), new C57251PbZ(38, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 22);
    public boolean A03 = true;
    public final InterfaceC09390do A07 = C57551PgP.A01(this, 18);
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131976744);
        boolean z = true;
        interfaceC56362iU.EkS(true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131964261);
        View A0F = AbstractC31177DnL.A0F(ViewOnClickListenerC55455Ok9.A00(this, 39), A0B, interfaceC56362iU);
        this.A00 = A0F;
        C52339NEd c52339NEd = this.A02;
        if (c52339NEd == null) {
            C14360o3.A0F("seriesItemDefinition");
            throw C00O.createAndThrow();
        }
        if (c52339NEd.A00 == MSX.A0R(this.A08).A01) {
            z = false;
        }
        OXy.A01(A0F, z);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(1076);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.LRc, java.lang.Object] */
    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = getRecyclerView();
        if (!this.A03) {
            AbstractC13880nE.A0f(recyclerView, 0);
        }
        recyclerView.setItemAnimator(null);
        Context requireContext = requireContext();
        C1571273r c1571273r = new C1571273r();
        c1571273r.A02 = R.drawable.instagram_play_outline_96;
        c1571273r.A0D = requireContext.getString(2131964235);
        c1571273r.A07 = requireContext.getString(2131964266);
        c1571273r.A03 = requireContext.getColor(AbstractC53242c7.A07(requireContext));
        c1571273r.A0C = requireContext.getString(2131964265);
        c1571273r.A00 = AbstractC53242c7.A0F(requireContext, R.attr.backgroundColorSecondary);
        c1571273r.A06 = this;
        this.A06 = c1571273r;
        AbstractC46635KkC.A00(this, new Object());
    }

    public static final List A00(C52182N7r c52182N7r) {
        C1571273r c1571273r;
        EnumC153216up enumC153216up;
        C32158EBf c32158EBf = c52182N7r.A01;
        if (c32158EBf == null) {
            Context requireContext = c52182N7r.requireContext();
            c1571273r = new C1571273r();
            c1571273r.A00 = AbstractC53242c7.A00(requireContext);
            enumC153216up = EnumC153216up.A06;
        } else if (c32158EBf.A00.isEmpty()) {
            c1571273r = c52182N7r.A06;
            if (c1571273r == null) {
                C14360o3.A0F("emptyBindings");
                throw C00O.createAndThrow();
            }
            enumC153216up = EnumC153216up.A02;
        } else {
            List list = c32158EBf.A00;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(new C56084Ov1((C38900HAw) it.next()));
            }
            return AbstractC001800i.A0T(new Object(), A0q);
        }
        return AbstractC166987dD.A1J(new C39094HIs(c1571273r, enumC153216up));
    }

    public static final void A01(C52182N7r c52182N7r) {
        if (c52182N7r.A03) {
            MSW.A0b(c52182N7r.A0A).A04(null, C52536NMi.A00);
        } else {
            OXy.A02(c52182N7r, new NNB(), AbstractC166987dD.A0r(c52182N7r.A09), OU0.A06);
        }
    }

    public final void A0C(int i, boolean z) {
        if (z) {
            notifyItemChanged(i);
        }
        View view = this.A00;
        if (view != null) {
            C52339NEd c52339NEd = this.A02;
            if (c52339NEd == null) {
                C14360o3.A0F("seriesItemDefinition");
                throw C00O.createAndThrow();
            }
            OXy.A01(view, MSY.A1S(c52339NEd.A00, MSX.A0R(this.A08).A01));
        }
    }

    @Override // X.InterfaceC58119Ppi
    public final boolean BCs() {
        int i = MSX.A0R(this.A08).A01;
        C52339NEd c52339NEd = this.A02;
        if (c52339NEd == null) {
            C14360o3.A0F("seriesItemDefinition");
            throw C00O.createAndThrow();
        }
        return MSY.A1S(i, c52339NEd.A00);
    }

    @Override // X.InterfaceC58119Ppi
    public final void Cyw() {
        if (this.A03) {
            OPI.A01(this, this.A0A);
        }
    }

    @Override // X.InterfaceC58119Ppi
    public final void DAV() {
        if (this.A03) {
            MSW.A0b(this.A0A).A04(this, NN4.A00);
        } else {
            AbstractC25226BEj.A1P(this);
        }
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        C52339NEd c52339NEd = new C52339NEd(this, MSX.A0R(this.A08).A01);
        this.A02 = c52339NEd;
        return AbstractC16960so.A1Q(c52339NEd, new NEI(this));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C57561PgZ(this, 42));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C56062Ouf c56062Ouf = this.A05;
        if (c56062Ouf == null) {
            C14360o3.A0F("backHandlerDelegate");
            throw C00O.createAndThrow();
        }
        return c56062Ouf.onBackPressed();
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2080313402);
        super.onCreate(bundle);
        this.A03 = getActivity() instanceof IGTVUploadActivity;
        this.A05 = new C56062Ouf(requireContext(), this);
        this.A04 = requireActivity();
        C0f9.A09(1472328836, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1844203471);
        super.onResume();
        this.A01 = null;
        A0B(A00(this));
        AbstractC166987dD.A1Z(new MCG(this, null, 43), AbstractC25235BEs.A0S(this));
        InterfaceC09390do interfaceC09390do = this.A08;
        C54987OTv c54987OTv = ((C50995Mg2) interfaceC09390do.getValue()).A00;
        if (c54987OTv != null) {
            C38900HAw c38900HAw = new C38900HAw(EnumC39587Hdx.A0G, c54987OTv.A02, c54987OTv.A03);
            C52339NEd c52339NEd = this.A02;
            if (c52339NEd == null) {
                C14360o3.A0F("seriesItemDefinition");
                throw C00O.createAndThrow();
            }
            int i = c54987OTv.A01;
            int i2 = c52339NEd.A00;
            c52339NEd.A00 = i;
            c52339NEd.A01 = c38900HAw;
            c52339NEd.A02.A0C(i2, MSY.A1S(i2, -1));
            C50995Mg2 c50995Mg2 = (C50995Mg2) interfaceC09390do.getValue();
            C54987OTv c54987OTv2 = c50995Mg2.A01;
            int i3 = c54987OTv2.A01;
            if (i3 != -1) {
                c54987OTv2 = new C54987OTv(i3 + 1, c54987OTv2.A00, c54987OTv2.A02, c54987OTv2.A03);
            }
            c50995Mg2.A01 = c54987OTv2;
            ((C50995Mg2) interfaceC09390do.getValue()).A00 = null;
        }
        C0f9.A09(799319283, A02);
    }
}
