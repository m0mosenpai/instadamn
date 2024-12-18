package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ENT extends AbstractC60672pq implements InterfaceC60122ou, C38O {
    public static final String __redex_internal_original_name = "AccountDiscoveryOneCategoryFragment";
    public EVZ A00;
    public EQL A01;
    public String A02;
    public String A03;
    public String A04;
    public C57112jm A05;
    public C34609FMs A06;
    public String A07;
    public String A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0n(this);
        return c193328hC;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC35666Fp0(this, 65), AbstractC31174DnI.A0K(), interfaceC56362iU);
        String str = this.A08;
        if (str == null) {
            C14360o3.A0F("pageTitle");
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.setTitle(str);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        EVZ evz = this.A00;
        if (evz == null) {
            C14360o3.A0F("accountDiscoveryController");
            throw C00O.createAndThrow();
        }
        AbstractC31174DnI.A16(evz.A06.requireContext(), recyclerView, 1, false);
        recyclerView.A0S = true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EQL eql = this.A01;
        if (eql == null) {
            str = "oneCategoryAdapter";
        } else {
            setAdapter(eql);
            C57112jm c57112jm = this.A05;
            if (c57112jm == null) {
                str = "viewPointManager";
            } else {
                c57112jm.A08(((C3FR) getScrollingViewProxy()).CGT(), C71163Hc.A00(this), new InterfaceC57142jp[0]);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(450298119);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = AbstractC153636vY.A01(requireArguments, "AccountDiscoveryFragment.title");
        this.A02 = AbstractC153636vY.A01(requireArguments, "AccountDiscoveryFragment.category");
        this.A03 = AbstractC31171DnF.A0Z(requireArguments);
        String str = this.A02;
        String str2 = "category";
        if (str != null) {
            this.A07 = AnonymousClass001.A0R("account_discovery_", str);
            this.A04 = requireArguments.getString("AccountDiscoveryFragment.forcedUserIds");
            InterfaceC09390do interfaceC09390do = this.A09;
            C32904Edl c32904Edl = new C32904Edl(AbstractC166987dD.A0r(interfaceC09390do), this);
            C57112jm A01 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
            this.A05 = A01;
            this.A06 = new C34609FMs(A01, new FQ3(this, AbstractC166987dD.A0r(interfaceC09390do), null));
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Context requireContext = requireContext();
            String str3 = this.A02;
            if (str3 != null) {
                C34609FMs c34609FMs = this.A06;
                if (c34609FMs == null) {
                    str2 = "recommendedUserCardsViewpointHelper";
                } else {
                    this.A01 = new EQL(requireContext, this, A0r, c34609FMs, c32904Edl, str3);
                    this.A00 = new EVZ(this, AbstractC166987dD.A0r(interfaceC09390do), new G7D(this));
                    C0f9.A09(1514561357, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1508693746);
        C14360o3.A0B(layoutInflater, 0);
        EVZ evz = this.A00;
        if (evz == null) {
            C14360o3.A0F("accountDiscoveryController");
            throw C00O.createAndThrow();
        }
        View A01 = evz.A01(layoutInflater, viewGroup);
        C0f9.A09(-2090843599, A02);
        return A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1645268149);
        super.onStop();
        C34609FMs c34609FMs = this.A06;
        if (c34609FMs == null) {
            C14360o3.A0F("recommendedUserCardsViewpointHelper");
            throw C00O.createAndThrow();
        }
        c34609FMs.A04.clear();
        C0f9.A09(-1276298554, A02);
    }
}
