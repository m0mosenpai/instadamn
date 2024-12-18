package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72483Mv extends C0SG {
    public void A0I() {
    }

    public void A0J() {
    }

    public final void A0H() {
        if (this instanceof AbstractC72463Mt) {
            AbstractC72463Mt abstractC72463Mt = (AbstractC72463Mt) this;
            abstractC72463Mt.A01.A01();
            AbstractC12990ll A0M = abstractC72463Mt.A0M();
            if (A0M != null) {
                C55782hJ A00 = C55772hI.A00(A0M);
                C3DI c3di = new C3DI(abstractC72463Mt);
                c3di.A01(A00);
                abstractC72463Mt.A00 = c3di;
            }
        }
    }

    public void A0K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        if (this instanceof AbstractC72463Mt) {
            AbstractC72463Mt abstractC72463Mt = (AbstractC72463Mt) this;
            C14360o3.A0B(layoutInflater, 0);
            if (view != null) {
                abstractC72463Mt.A01.A0C(view);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        if (!this.A07) {
            AbstractC10920i8 abstractC10920i8 = this.mHost;
            if (abstractC10920i8 != null) {
                LayoutInflater cloneInContext = abstractC10920i8.A02().cloneInContext(this.mHost.A01);
                getChildFragmentManager();
                cloneInContext.setFactory2(this.mChildFragmentManager.A0S);
                return cloneInContext;
            }
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        return super.getLayoutInflater(bundle);
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
        if (this instanceof AbstractC72463Mt) {
            AbstractC72463Mt abstractC72463Mt = (AbstractC72463Mt) this;
            boolean z3 = false;
            if (z2 != z) {
                z3 = true;
            }
            abstractC72463Mt.A02.A00(abstractC72463Mt, z);
            if (z3 && (c3di = abstractC72463Mt.A00) != null) {
                c3di.A00();
            }
        }
    }

    public int A0G(AbstractC016706m abstractC016706m, String str, boolean z) {
        abstractC016706m.A0B(this, str);
        return ((C14240no) abstractC016706m).A0J(true);
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
            A0H();
        }
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            super.performCreateView(layoutInflater, viewGroup, bundle);
        } finally {
            A0K(layoutInflater, viewGroup, bundle, this.mView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performDestroy() {
        try {
            super.performDestroy();
        } finally {
            if (this instanceof AbstractC72463Mt) {
                ((AbstractC72463Mt) this).A01.A02();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performDestroyView() {
        try {
            super.performDestroyView();
        } finally {
            if (this instanceof AbstractC72463Mt) {
                ((AbstractC72463Mt) this).A01.A03();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performPause() {
        try {
            A0J();
            super.performPause();
        } finally {
            if (this instanceof AbstractC72463Mt) {
                AbstractC72463Mt abstractC72463Mt = (AbstractC72463Mt) this;
                abstractC72463Mt.A01.A04();
                C3DI c3di = abstractC72463Mt.A00;
                if (c3di != null) {
                    c3di.A00();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performResume() {
        try {
            super.performResume();
        } finally {
            A0I();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performStart() {
        try {
            super.performStart();
        } finally {
            if (this instanceof AbstractC72463Mt) {
                ((AbstractC72463Mt) this).A01.A06();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performStop() {
        try {
            super.performStop();
        } finally {
            if (this instanceof AbstractC72463Mt) {
                ((AbstractC72463Mt) this).A01.A07();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performViewCreated() {
        super.performViewCreated();
    }
}
