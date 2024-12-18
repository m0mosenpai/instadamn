package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.38L, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C38L extends AbstractC05560Rg {
    public abstract void A0V(Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC10920i8 abstractC10920i8 = this.mHost;
        if (abstractC10920i8 != null) {
            LayoutInflater cloneInContext = abstractC10920i8.A02().cloneInContext(this.mHost.A01);
            getChildFragmentManager();
            cloneInContext.setFactory2(this.mChildFragmentManager.A0S);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z && isMenuVisible()) {
            super.setHasOptionsMenu(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C3DI c3di;
        AbstractC10360h2 abstractC10360h2;
        boolean z2 = this.mUserVisibleHint;
        if (!z2 && z && this.mState < 5 && (abstractC10360h2 = this.mFragmentManager) != null) {
            abstractC10360h2.A0v(abstractC10360h2.A0U(this));
        }
        super.setUserVisibleHint(z);
        C38K c38k = (C38K) this;
        boolean z3 = false;
        if (z2 != z) {
            z3 = true;
        }
        c38k.A05.A00(c38k, z);
        if (z3 && (c3di = c38k.A01) != null) {
            c3di.A00();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performActivityCreated(Bundle bundle) {
        super.performActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreate(Bundle bundle) {
        try {
            super.performCreate(bundle);
        } finally {
            A0V(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            super.performCreateView(layoutInflater, viewGroup, bundle);
        } finally {
            View view = this.mView;
            C38K c38k = (C38K) this;
            C14360o3.A0B(layoutInflater, 0);
            if (view != null) {
                c38k.A04.A0C(view);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performDestroy() {
        try {
            super.performDestroy();
        } finally {
            ((C38K) this).A04.A02();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performDestroyView() {
        try {
            super.performDestroyView();
        } finally {
            ((C38K) this).A04.A03();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performPause() {
        try {
            super.performPause();
        } finally {
            C38K c38k = (C38K) this;
            c38k.A04.A04();
            C3DI c3di = c38k.A01;
            if (c3di != null) {
                c3di.A00();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performResume() {
        try {
            super.performResume();
        } finally {
            C38K c38k = (C38K) this;
            c38k.A04.A05();
            C3DI c3di = c38k.A01;
            if (c3di != null) {
                c3di.A00();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performStart() {
        try {
            super.performStart();
        } finally {
            ((C38K) this).A04.A06();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performStop() {
        try {
            super.performStop();
        } finally {
            ((C38K) this).A04.A07();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performViewCreated() {
        super.performViewCreated();
    }
}
