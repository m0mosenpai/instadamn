package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.modal.ModalActivity;

/* renamed from: X.KCt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45504KCt extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IGTVSeriesFragment";
    public C38900HAw A00;
    public C44572Jnx A01;
    public C52770NXa A02;
    public String A03;
    public RecyclerView A04;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A08 = C1XM.A00(new C57538PgC(this, 4));
    public final InterfaceC09390do A06 = C1XM.A00(new C57538PgC(this, 3));
    public final InterfaceC09390do A05 = C1XM.A00(new C57538PgC(this, 2));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        FragmentActivity activity;
        C14360o3.A0B(interfaceC56362iU, 0);
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F("_actionBarTitle");
            throw C00O.createAndThrow();
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, str);
        if (((C44537Jmh) this.A09.getValue()).A0F && (activity = getActivity()) != null) {
            OXy.A00(interfaceC56362iU, C05F.A00, new C57251PbZ(11, activity, this), requireContext().getColor(AbstractC31174DnI.A05(this)));
        }
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.LRc, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        requireArguments.getString("igtv_base_analytics_module_arg");
        C38900HAw c38900HAw = this.A00;
        if (c38900HAw == null) {
            str = "series";
        } else {
            String A02 = OZN.A02(c38900HAw.A03);
            C14360o3.A07(A02);
            C57112jm A00 = C57112jm.A00();
            InterfaceC09390do interfaceC09390do = this.A07;
            this.A01 = new C44572Jnx(requireContext, this, AbstractC166987dD.A0r(interfaceC09390do), new C47674L3h(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do), A00, this, C1M3.A00().A00, new C50361MLn(A02, 38)), this, this, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext);
            RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.series_recycler_view);
            A0B.A0S = true;
            A0B.setLayoutManager(linearLayoutManager);
            C44572Jnx c44572Jnx = this.A01;
            if (c44572Jnx != null) {
                A0B.setAdapter(c44572Jnx);
                C44572Jnx c44572Jnx2 = this.A01;
                if (c44572Jnx2 != null) {
                    new JoR(this, this, new C47639L1y(linearLayoutManager, c44572Jnx2, A0B));
                    this.A04 = A0B;
                    C71163Hc A002 = C71163Hc.A00(this);
                    RecyclerView recyclerView = this.A04;
                    if (recyclerView == null) {
                        str = "recyclerView";
                    } else {
                        A00.A08(recyclerView, A002, new InterfaceC57142jp[0]);
                        C07X viewLifecycleOwner = getViewLifecycleOwner();
                        InterfaceC09390do interfaceC09390do2 = this.A09;
                        C44537Jmh c44537Jmh = (C44537Jmh) interfaceC09390do2.getValue();
                        AbstractC43593JPy.A1E(viewLifecycleOwner, c44537Jmh.A04, new C57561PgZ(this, 16), 44);
                        AbstractC43593JPy.A1E(viewLifecycleOwner, c44537Jmh.A03, new C57561PgZ(this, 17), 44);
                        AbstractC43593JPy.A1E(viewLifecycleOwner, c44537Jmh.A02, new C57561PgZ(this, 18), 44);
                        AbstractC43593JPy.A1E(viewLifecycleOwner, c44537Jmh.A01, new C57561PgZ(this, 19), 44);
                        c44537Jmh.A09.Cti(viewLifecycleOwner, new C43891Jay(2, c44537Jmh, this));
                        c44537Jmh.A08.Cti(viewLifecycleOwner, new C44145JfA(this, 9));
                        c44537Jmh.A0A.Cti(viewLifecycleOwner, new C43891Jay(3, c44537Jmh, this));
                        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do2);
                        AbstractC166987dD.A1Z(new MCG(A0Z, null, 41), AbstractC141776au.A00(A0Z));
                        A00(this);
                        AbstractC46635KkC.A00(this, new Object());
                        return;
                    }
                }
            }
            C14360o3.A0F("seriesAdapter");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C45504KCt c45504KCt) {
        InterfaceC09390do interfaceC09390do = c45504KCt.A09;
        if (!((C44537Jmh) interfaceC09390do.getValue()).A00) {
            C44572Jnx c44572Jnx = c45504KCt.A01;
            if (c44572Jnx == null) {
                C14360o3.A0F("seriesAdapter");
                throw C00O.createAndThrow();
            }
            Integer num = C05F.A00;
            if (c44572Jnx.A01 != num) {
                c44572Jnx.A01 = num;
                c44572Jnx.A00(false);
                c44572Jnx.notifyDataSetChanged();
            }
            C44537Jmh c44537Jmh = (C44537Jmh) interfaceC09390do.getValue();
            C44537Jmh.A00(c44537Jmh, new C50537MSq(c44537Jmh, null, 11), true);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String A00 = new IL4(EnumC39626Hek.A0O).A00();
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public C45504KCt() {
        C57538PgC c57538PgC = new C57538PgC(this, 8);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57538PgC(new C57538PgC(this, 5), 6));
        this.A09 = AbstractC25225BEi.A0a(new C57538PgC(A00, 7), c57538PgC, new C57251PbZ(12, null, A00), AbstractC25225BEi.A1D(C44537Jmh.class));
        this.A07 = AbstractC60492pY.A02(this);
    }

    public final void A01() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity instanceof ModalActivity) {
                InterfaceC09390do interfaceC09390do = this.A07;
                AbstractC25229BEm.A18(AbstractC31364DqT.A02().A02(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), ((C44537Jmh) this.A09.getValue()).A0D.A00, "igtv_series_username_row", getModuleName()).A03()), AbstractC25231BEo.A0c(activity, interfaceC09390do));
                return;
            }
            ((ILL) this.A05.getValue()).A00(activity, ((C44537Jmh) this.A09.getValue()).A0D.A00, "igtv_series_username_row");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1613114852);
        super.onCreate(bundle);
        C38900HAw c38900HAw = ((C44537Jmh) this.A09.getValue()).A07;
        this.A00 = c38900HAw;
        this.A03 = c38900HAw.A08;
        C0f9.A09(929367336, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1642849006);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.igtv_series, viewGroup, false);
        C0f9.A09(361235070, A02);
        return inflate;
    }
}
