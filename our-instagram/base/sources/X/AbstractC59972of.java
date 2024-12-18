package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.2of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59972of extends Fragment {
    public void afterOnActivityCreated(Bundle bundle) {
    }

    public void afterOnCreate(Bundle bundle) {
    }

    public void afterOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater, boolean z) {
    }

    public void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
    }

    public void afterOnDestroy() {
    }

    public void afterOnDestroyView() {
    }

    public void afterOnPause() {
    }

    public void afterOnResume() {
    }

    public void afterOnStart() {
    }

    public void afterOnStop() {
    }

    public void afterOnViewCreated() {
    }

    public void beforeOnActivityCreated(Bundle bundle) {
    }

    public void beforeOnCreate(Bundle bundle) {
    }

    public boolean beforeOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return false;
    }

    public void beforeOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public void beforeOnDestroy() {
    }

    public void beforeOnDestroyView() {
    }

    public void beforeOnPause() {
    }

    public void beforeOnResume() {
    }

    public void beforeOnStart() {
    }

    public void beforeOnStop() {
    }

    public void beforeOnViewCreated() {
    }

    @Deprecated
    public void onSetUserVisibleHint(boolean z, boolean z2) {
    }

    public LayoutInflater provideOverrideLayoutInflater() {
        return null;
    }

    public final AbstractC10920i8 getFragmentHost() {
        return this.mHost;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null) {
            LayoutInflater cloneInContext = abstractC10920i8.A02().cloneInContext(this.mHost.A01);
            getChildFragmentManager();
            cloneInContext.setFactory2(this.mChildFragmentManager.A0S);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void invalidateOptionsMenu() {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null && this.mHasMenu && isAdded() && !isHidden() && isMenuVisible()) {
            abstractC10920i8.A03();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreate(Bundle bundle) {
        try {
            this.mLifecycleRegistry.A09(new InterfaceC09670ek() { // from class: X.2pk
                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    View view;
                    if (c07r == C07R.ON_STOP && (view = AbstractC59972of.this.mView) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            beforeOnCreate(bundle);
            super.performCreate(bundle);
        } finally {
            afterOnCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z && isMenuVisible()) {
            super.setHasOptionsMenu(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        AbstractC10360h2 abstractC10360h2;
        boolean z2 = this.mUserVisibleHint;
        if (!z2 && z && this.mState < 5 && (abstractC10360h2 = this.mFragmentManager) != null) {
            abstractC10360h2.A0v(abstractC10360h2.A0U(this));
        }
        super.setUserVisibleHint(z);
        onSetUserVisibleHint(z, z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performActivityCreated(Bundle bundle) {
        super.performActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return super.performCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            beforeOnCreateView(layoutInflater, viewGroup, bundle);
            super.performCreateView(layoutInflater, viewGroup, bundle);
        } finally {
            afterOnCreateView(layoutInflater, viewGroup, bundle, this.mView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performDestroy() {
        try {
            beforeOnDestroy();
            super.performDestroy();
        } finally {
            afterOnDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performDestroyView() {
        try {
            beforeOnDestroyView();
            super.performDestroyView();
        } finally {
            afterOnDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performPause() {
        try {
            beforeOnPause();
            super.performPause();
        } finally {
            afterOnPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performResume() {
        try {
            beforeOnResume();
            super.performResume();
        } finally {
            afterOnResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performStart() {
        try {
            beforeOnStart();
            super.performStart();
        } finally {
            afterOnStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performStop() {
        try {
            super.performStop();
        } finally {
            afterOnStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performViewCreated() {
        try {
            super.performViewCreated();
        } finally {
            afterOnViewCreated();
        }
    }
}
