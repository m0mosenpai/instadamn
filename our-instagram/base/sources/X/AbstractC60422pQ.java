package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60422pQ extends AbstractC60432pR implements InterfaceC11380iw, C1GL, InterfaceC59992oh, InterfaceC60002oi, InterfaceC60012oj, InterfaceC60052on {
    public static final String __redex_internal_original_name = "IgViewLessFragment";
    public Rect A00;
    public C3DI A01;
    public final C60462pV A02 = new C60462pV();
    public final C60482pX A03 = new C60482pX();

    @Override // X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        C3DI c3di;
        boolean z3 = z2 != z;
        this.A03.A00(this, z);
        if (z3 && (c3di = this.A01) != null) {
            c3di.A00();
        }
    }

    @Override // X.InterfaceC60012oj
    public final void addFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        this.A03.addFragmentVisibilityListener(interfaceC71183He);
    }

    @Override // X.AbstractC59972of
    public final void afterOnCreate(Bundle bundle) {
        this.A02.A01();
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) ((C60412pP) this).A05.getValue();
        if (abstractC12990ll != null) {
            C55782hJ A00 = C55772hI.A00(abstractC12990ll);
            C3DI c3di = new C3DI(this);
            this.A01 = c3di;
            c3di.A01(A00);
        }
    }

    @Override // X.AbstractC59972of
    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        if (view != null) {
            this.A02.A0C(view);
        }
    }

    @Override // X.AbstractC59972of
    public final void afterOnDestroy() {
        this.A02.A02();
    }

    @Override // X.AbstractC59972of
    public final void afterOnDestroyView() {
        this.A02.A03();
    }

    @Override // X.AbstractC59972of
    public final void afterOnPause() {
        this.A02.A04();
        C3DI c3di = this.A01;
        if (c3di != null) {
            c3di.A00();
        }
    }

    @Override // X.AbstractC59972of
    public final void afterOnResume() {
        this.A02.A05();
        C3DI c3di = this.A01;
        if (c3di != null) {
            c3di.A00();
        }
    }

    @Override // X.AbstractC59972of
    public final void afterOnStart() {
        this.A02.A06();
    }

    @Override // X.AbstractC59972of
    public final void afterOnStop() {
        this.A02.A07();
    }

    @Override // X.InterfaceC60002oi
    public final C3DI getFragmentVisibilityDetector() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A02.A08(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C3DI c3di = this.A01;
        if (c3di != null) {
            c3di.A00();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Rect rect = this.A00;
        if (rect != null) {
            bundle.putParcelable(AbstractC59962oe.KEY_CONTENT_INSETS, rect);
        }
        this.A02.A0A(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.A02.A0D(view, bundle);
        if (bundle != null && bundle.getParcelable(AbstractC59962oe.KEY_CONTENT_INSETS) != null) {
            this.A00 = (Rect) bundle.getParcelable(AbstractC59962oe.KEY_CONTENT_INSETS);
        }
        View view2 = this.mView;
        if (view2 != null && this.A00 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Rect rect = this.A00;
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    @Override // X.InterfaceC59992oh
    public final void registerLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        this.A02.A0E(interfaceC60602pj);
    }

    @Override // X.InterfaceC60012oj
    public final void removeFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        this.A03.removeFragmentVisibilityListener(interfaceC71183He);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            C1GJ.A00(requireContext(), AbstractC018607g.A00(this), c11r);
        }
    }

    @Override // X.InterfaceC59992oh
    public final void unregisterLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        C60462pV c60462pV = this.A02;
        C14360o3.A0B(interfaceC60602pj, 0);
        c60462pV.A00.remove(interfaceC60602pj);
    }

    @Override // X.InterfaceC60052on
    public final Activity getRootActivity() {
        if (getContext() instanceof Activity) {
            Activity parent = ((Activity) getContext()).getParent();
            if (parent == null) {
                return (Activity) getContext();
            }
            return parent;
        }
        throw new RuntimeException("Fragment is not attached.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(89982638);
        super.onDestroy();
        C6QM.A00(this);
        C0f9.A09(726815957, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1415958630);
        super.onDestroyView();
        C0f9.A09(-494834276, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(331497784);
        super.onResume();
        C0f9.A09(-1201278086, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        int A02 = C0f9.A02(27272210);
        super.onViewStateRestored(bundle);
        this.A02.A0B(bundle);
        C0f9.A09(-1547844035, A02);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }
}
