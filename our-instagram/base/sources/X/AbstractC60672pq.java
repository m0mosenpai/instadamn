package X;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2pq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60672pq extends AbstractC59962oe implements InterfaceC60682pr {
    public static final String SAVED_STATE_USE_RECYCLERVIEW = "USE_RECYCLERVIEW";
    public static final String __redex_internal_original_name = "IgListFragmentCompat";
    public InterfaceC65242xM mAdapter;
    public AbstractC65392xb mAdapterDataObserver;
    public View mEmptyView;
    public C3FQ mScrollingViewProxy;
    public boolean mShouldRestoreDefaultTheme = true;
    public Boolean mUseRecyclerView;

    public Boolean getUseRecyclerViewFromQE() {
        return null;
    }

    public void onListViewCreated(ListView listView) {
    }

    public void onRecyclerViewCreated(RecyclerView recyclerView) {
    }

    private C3FQ initializeScrollingView() {
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq != null) {
            return c3fq;
        }
        View view = this.mView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.list);
            if (viewGroup == null) {
                viewGroup = (ViewGroup) this.mView.findViewById(com.facebook.R.id.recycler_view);
            }
            C3FQ A00 = C3FN.A00(viewGroup);
            if (A00.CXX()) {
                this.mUseRecyclerView = false;
            } else {
                this.mUseRecyclerView = true;
                onRecyclerViewCreated((RecyclerView) viewGroup);
            }
            InterfaceC65242xM interfaceC65242xM = this.mAdapter;
            if (interfaceC65242xM != null && A00.AZU() == null) {
                A00.EPJ(interfaceC65242xM);
            }
            return A00;
        }
        throw new IllegalStateException("Cannot initialize scrolling view. Fragment not created yet or destroyed already");
    }

    public InterfaceC65242xM getAdapter() {
        C3FQ c3fq = this.mScrollingViewProxy;
        InterfaceC65242xM interfaceC65242xM = this.mAdapter;
        if (interfaceC65242xM == null && c3fq != null) {
            InterfaceC65242xM AZU = c3fq.AZU();
            this.mAdapter = AZU;
            return AZU;
        }
        return interfaceC65242xM;
    }

    public View getEmptyView() {
        return this.mEmptyView;
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq == null) {
            C3FQ initializeScrollingView = initializeScrollingView();
            this.mScrollingViewProxy = initializeScrollingView;
            return initializeScrollingView;
        }
        return c3fq;
    }

    public boolean getShouldRestoreDefaultTheme() {
        return this.mShouldRestoreDefaultTheme;
    }

    public void hideEmptyView() {
        View view = this.mEmptyView;
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq != null && view != null && view.getVisibility() == 0) {
            view.setVisibility(8);
            c3fq.CFj().setVisibility(0);
        }
    }

    public final boolean isUsingRecyclerView() {
        Boolean bool = this.mUseRecyclerView;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("To call this method, implement getUseRecyclerViewFromQE()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1899922399);
        AbstractC13090lv.A02("IgListFragmentCompat.onCreate");
        try {
            super.onCreate(bundle);
            if (bundle != null && bundle.containsKey(SAVED_STATE_USE_RECYCLERVIEW)) {
                this.mUseRecyclerView = Boolean.valueOf(bundle.getBoolean(SAVED_STATE_USE_RECYCLERVIEW));
            } else {
                this.mUseRecyclerView = getUseRecyclerViewFromQE();
            }
            AbstractC13090lv.A01();
            C0f9.A09(1742923310, A02);
        } catch (Throwable th) {
            AbstractC13090lv.A01();
            C0f9.A09(1618656787, A02);
            throw th;
        }
    }

    public final C3FQ optScrollingViewProxy() {
        return this.mScrollingViewProxy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAdapter(final InterfaceC65242xM interfaceC65242xM) {
        this.mAdapter = interfaceC65242xM;
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq != null) {
            c3fq.EPJ(interfaceC65242xM);
        }
        if (interfaceC65242xM instanceof C2UU) {
            AbstractC65392xb abstractC65392xb = new AbstractC65392xb() { // from class: X.3HA
                @Override // X.AbstractC65392xb
                public final void onChanged() {
                    int itemCount = ((C2UU) interfaceC65242xM).getItemCount();
                    AbstractC60672pq abstractC60672pq = AbstractC60672pq.this;
                    if (itemCount == 0) {
                        abstractC60672pq.showEmptyView();
                    } else {
                        abstractC60672pq.hideEmptyView();
                    }
                }

                @Override // X.AbstractC65392xb
                public final void onItemRangeInserted(int i, int i2) {
                    if (((C2UU) interfaceC65242xM).getItemCount() > 0) {
                        AbstractC60672pq.this.hideEmptyView();
                    }
                }

                @Override // X.AbstractC65392xb
                public final void onItemRangeRemoved(int i, int i2) {
                    if (((C2UU) interfaceC65242xM).getItemCount() == 0) {
                        AbstractC60672pq.this.showEmptyView();
                    }
                }
            };
            this.mAdapterDataObserver = abstractC65392xb;
            ((C2UU) interfaceC65242xM).registerAdapterDataObserver(abstractC65392xb);
        }
    }

    public final void setEmptyViewForRecyclerView(View view) {
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq != null) {
            if (!c3fq.CXX()) {
                ViewParent parent = c3fq.CFj().getParent();
                if (parent instanceof ViewGroup) {
                    this.mEmptyView = view;
                    view.setVisibility(8);
                    ((ViewGroup) parent).addView(this.mEmptyView);
                    return;
                }
                throw new IllegalStateException("Cannot support empty view if RecyclerView doesn't have a ViewGroup parent");
            }
            return;
        }
        throw new IllegalStateException("View hasn't been created yet");
    }

    public void showEmptyView() {
        View view = this.mEmptyView;
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq != null && view != null && view.getVisibility() == 8) {
            view.setVisibility(0);
            c3fq.CFj().setVisibility(8);
        }
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        if (view != null) {
            this.mScrollingViewProxy = initializeScrollingView();
            View findViewById = view.findViewById(R.id.empty);
            C3FQ c3fq = this.mScrollingViewProxy;
            if (c3fq.CXX()) {
                ((AdapterView) c3fq.CFj()).setEmptyView(findViewById);
            }
            this.mEmptyView = findViewById;
        }
    }

    public final RecyclerView getRecyclerView() {
        C3FQ scrollingViewProxy = getScrollingViewProxy();
        if (!scrollingViewProxy.CXX()) {
            return (RecyclerView) scrollingViewProxy.CFj();
        }
        throw new IllegalStateException("view is ListView");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(832726903);
        super.onDestroyView();
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq != null) {
            c3fq.AI0();
            this.mScrollingViewProxy.EPJ(null);
            this.mScrollingViewProxy = null;
        }
        this.mEmptyView = null;
        C0f9.A09(-778606502, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        int A02 = C0f9.A02(362850148);
        super.onDetach();
        C0f9.A09(2138233040, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-1304108535);
        super.onResume();
        setColorBackgroundDrawable();
        this.mShouldRestoreDefaultTheme = true;
        C0f9.A09(-480400389, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean bool = this.mUseRecyclerView;
        if (bool != null) {
            bundle.putBoolean(SAVED_STATE_USE_RECYCLERVIEW, bool.booleanValue());
        }
    }

    public void setColorBackgroundDrawable() {
        requireActivity().getWindow().setBackgroundDrawable(new ColorDrawable(AbstractC53242c7.A0F(getContext(), R.attr.colorBackground)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void setShouldRestoreDefaultTheme(boolean z) {
        this.mShouldRestoreDefaultTheme = z;
    }
}
