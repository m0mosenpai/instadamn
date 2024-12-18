package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ja5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43842Ja5 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgRecyclerFragment";
    public C66362zD adapter;
    public L5K config;
    public C1571273r errorEmptyStateBindings;
    public C47521Kyo layoutProvider;
    public C1571273r loadingBindings;
    public MXS loadingState = MXS.A03;
    public RecyclerView recyclerView;
    public RefreshableNestedScrollingParent refreshableNestedScrollingParent;

    public final void addOnScrollListener(C1I4 c1i4) {
        C14360o3.A0B(c1i4, 0);
        getRecyclerView().A14(c1i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.L5L, java.lang.Object] */
    public final L5L configBuilder(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        ?? obj = new Object();
        interfaceC16660sJ.invoke(obj);
        return obj;
    }

    public abstract Collection getDefinitions();

    public abstract L5L getRecyclerConfigBuilder();

    public final boolean isModelClass(int i, Class... clsArr) {
        C14360o3.A0B(clsArr, 1);
        return getAdapter().A09(i, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C3F0 c3f0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        L5K l5k = this.config;
        if (l5k != null) {
            if (l5k.A08) {
                view.setPadding(0, AbstractC53242c7.A0G(view.getContext(), R.attr.actionBarHeight), 0, 0);
            }
            C66392zG A00 = C66362zD.A00(requireActivity());
            A00.A0C.addAll(getAllDefinitions());
            L5K l5k2 = this.config;
            if (l5k2 != null) {
                if (l5k2.A0C) {
                    A00.A0A = true;
                }
                setAdapter(A00.A00());
                RecyclerView recyclerView = getRecyclerView();
                L5K l5k3 = this.config;
                if (l5k3 != null) {
                    AbstractC70663Fe abstractC70663Fe = l5k3.A01;
                    if (abstractC70663Fe == null) {
                        abstractC70663Fe = new LinearLayoutManager(recyclerView.getContext(), 1, false);
                    }
                    recyclerView.setLayoutManager(abstractC70663Fe);
                    recyclerView.setAdapter(getAdapter());
                    L5K l5k4 = this.config;
                    if (l5k4 != null) {
                        if (l5k4.A0B) {
                            recyclerView.setItemAnimator(null);
                        }
                        L5K l5k5 = this.config;
                        if (l5k5 != null) {
                            if (l5k5.A09) {
                                C3F1 c3f1 = recyclerView.A0C;
                                if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
                                    c3f0.A00 = false;
                                }
                            }
                            if (l5k5.A0A) {
                                recyclerView.A0S = true;
                            }
                            AbstractC70653Fc abstractC70653Fc = l5k5.A00;
                            if (abstractC70653Fc != null) {
                                recyclerView.A10(abstractC70653Fc);
                            }
                            if (isPullToRefreshEnabled()) {
                                RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.findViewById(R.id.refreshable_container);
                                refreshableNestedScrollingParent.A07 = new C49663Lwu(this, 0);
                                this.refreshableNestedScrollingParent = refreshableNestedScrollingParent;
                            }
                            L5K l5k6 = this.config;
                            if (l5k6 != null) {
                                C1571273r c1571273r = l5k6.A05;
                                if (c1571273r == null) {
                                    c1571273r = new C1571273r();
                                    requireContext().getColor(AbstractC53242c7.A0H(getContext(), R.attr.igds_color_secondary_background));
                                }
                                this.loadingBindings = c1571273r;
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }

    public final void removeOnScrollListener(C1I4 c1i4) {
        C14360o3.A0B(c1i4, 0);
        getRecyclerView().A15(c1i4);
    }

    public final void setAdapter(C66362zD c66362zD) {
        C14360o3.A0B(c66362zD, 0);
        this.adapter = c66362zD;
    }

    public final void setLoadingBindings(C1571273r c1571273r) {
        C14360o3.A0B(c1571273r, 0);
        this.loadingBindings = c1571273r;
    }

    public final void toUnit(Object obj) {
    }

    private final boolean getShowFetchRetryView() {
        L5K l5k = this.config;
        if (l5k == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1W(l5k.A07);
    }

    private final boolean isPullToRefreshEnabled() {
        L5K l5k = this.config;
        if (l5k == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1W(l5k.A06);
    }

    private final boolean isPullingToRefresh() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.refreshableNestedScrollingParent;
        if (refreshableNestedScrollingParent != null) {
            return refreshableNestedScrollingParent.A0B;
        }
        return false;
    }

    public final void A0B(List list) {
        updateUi(MXS.A03, list);
    }

    public final void finishRefreshing() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.refreshableNestedScrollingParent;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
    }

    public final C66362zD getAdapter() {
        C66362zD c66362zD = this.adapter;
        if (c66362zD != null) {
            return c66362zD;
        }
        AbstractC31171DnF.A0t();
        throw C00O.createAndThrow();
    }

    public final C1571273r getErrorEmptyStateBindings() {
        return this.errorEmptyStateBindings;
    }

    public final C1571273r getLoadingBindings() {
        C1571273r c1571273r = this.loadingBindings;
        if (c1571273r != null) {
            return c1571273r;
        }
        C14360o3.A0F("loadingBindings");
        throw C00O.createAndThrow();
    }

    public final MXS getLoadingState() {
        return this.loadingState;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    public final RefreshableNestedScrollingParent getRefreshableNestedScrollingParent() {
        return this.refreshableNestedScrollingParent;
    }

    public final void setErrorEmptyStateBindings(C1571273r c1571273r) {
        this.errorEmptyStateBindings = c1571273r;
    }

    private final Collection getAllDefinitions() {
        ArrayList A0U = AbstractC001800i.A0U(getDefinitions());
        if (getShowFetchRetryView()) {
            if (!(A0U instanceof Collection) || !A0U.isEmpty()) {
                Iterator it = A0U.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof KHK) {
                        break;
                    }
                }
            }
            L5K l5k = this.config;
            if (l5k != null) {
                InterfaceC16820sZ interfaceC16820sZ = l5k.A07;
                C14360o3.A0A(interfaceC16820sZ);
                if (this.config != null) {
                    A0U.add(new KHK(interfaceC16820sZ));
                }
            }
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        if (this.config != null) {
            if (!(A0U instanceof Collection) || !A0U.isEmpty()) {
                Iterator it2 = A0U.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof HI1) {
                        return A0U;
                    }
                }
            }
            A0U.add(new Object());
            return A0U;
        }
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }

    public final void notifyItemChanged(int i) {
        getAdapter().notifyItemChanged(i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1651739160);
        C14360o3.A0B(layoutInflater, 0);
        L5L recyclerConfigBuilder = getRecyclerConfigBuilder();
        C47521Kyo c47521Kyo = recyclerConfigBuilder.A02;
        AbstractC70663Fe abstractC70663Fe = recyclerConfigBuilder.A01;
        InterfaceC16820sZ interfaceC16820sZ = recyclerConfigBuilder.A06;
        InterfaceC16820sZ interfaceC16820sZ2 = recyclerConfigBuilder.A07;
        boolean z = recyclerConfigBuilder.A08;
        L5K l5k = new L5K(recyclerConfigBuilder.A00, abstractC70663Fe, c47521Kyo, recyclerConfigBuilder.A05, recyclerConfigBuilder.A03, recyclerConfigBuilder.A04, interfaceC16820sZ, interfaceC16820sZ2, z, recyclerConfigBuilder.A09, recyclerConfigBuilder.A0C, recyclerConfigBuilder.A0A, recyclerConfigBuilder.A0B);
        this.config = l5k;
        C47521Kyo c47521Kyo2 = l5k.A02;
        if (c47521Kyo2 == null) {
            InterfaceC16820sZ interfaceC16820sZ3 = l5k.A06;
            int i = R.layout.ig_recycler_fragment;
            if (interfaceC16820sZ3 != null) {
                i = R.layout.ig_refreshable_recycler_fragment;
            }
            c47521Kyo2 = new C47521Kyo(i, R.id.recycler_view);
        }
        this.layoutProvider = c47521Kyo2;
        View inflate = layoutInflater.inflate(c47521Kyo2.A00, viewGroup, false);
        C47521Kyo c47521Kyo3 = this.layoutProvider;
        if (c47521Kyo3 == null) {
            C14360o3.A0F("layoutProvider");
            throw C00O.createAndThrow();
        }
        this.recyclerView = AbstractC43592JPx.A0B(inflate, c47521Kyo3.A01);
        C0f9.A09(898111261, A02);
        return inflate;
    }

    public final void updateUi(MXS mxs, List list) {
        EnumC153216up enumC153216up;
        Object c39094HIs;
        AbstractC167017dG.A1N(mxs, list);
        if (this.config != null) {
            if (isPullingToRefresh() && (mxs == MXS.A03 || mxs == MXS.A02)) {
                finishRefreshing();
            }
            L5K l5k = this.config;
            if (l5k != null) {
                this.loadingState = mxs;
                C1571273r c1571273r = l5k.A03;
                C1571273r c1571273r2 = l5k.A04;
                ArrayList A1F = AbstractC166987dD.A1F(list);
                if (getShowFetchRetryView() && mxs == MXS.A02) {
                    if (list.isEmpty() && c1571273r2 != null) {
                        c39094HIs = new C39094HIs(c1571273r2, EnumC153216up.A04);
                    } else {
                        c39094HIs = new Object();
                    }
                } else if (this.config != null) {
                    if (mxs == MXS.A04) {
                        c1571273r = getLoadingBindings();
                        enumC153216up = EnumC153216up.A06;
                    } else {
                        if (c1571273r != null && mxs == MXS.A03 && A1F.isEmpty()) {
                            enumC153216up = EnumC153216up.A02;
                        }
                        getAdapter().A05(AbstractC43593JPy.A0L(A1F));
                        return;
                    }
                    c39094HIs = new C39094HIs(c1571273r, enumC153216up);
                }
                A1F.add(c39094HIs);
                getAdapter().A05(AbstractC43593JPy.A0L(A1F));
                return;
            }
        }
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }
}
