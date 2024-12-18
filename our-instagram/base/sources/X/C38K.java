package X;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;

@Deprecated(message = "Use IgListFragmentCompat instead!")
/* renamed from: X.38K, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C38K extends C38L implements InterfaceC11380iw, C1GL, InterfaceC59992oh, InterfaceC60682pr, InterfaceC60002oi, InterfaceC11390ix, InterfaceC60012oj, InterfaceC60052on, InterfaceC60062oo {
    public static final String __redex_internal_original_name = "IgListFragment";
    public Rect A00;
    public C3DI A01;
    public C3FQ A02;
    public final C60462pV A04 = new C60462pV();
    public final C60482pX A05 = new C60482pX();
    public final C60752pz A03 = new C60752pz();

    public AbstractC12990ll A0X() {
        return (AbstractC12990ll) ((C38J) this).A0g.getValue();
    }

    @Override // X.InterfaceC60012oj
    public final void addFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.A05.addFragmentVisibilityListener(interfaceC71183He);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return AbstractC140796Yh.A01(this, i2, z, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        Rect rect = this.A00;
        if (rect != null) {
            bundle.putParcelable(AbstractC59962oe.KEY_CONTENT_INSETS, rect);
        }
        this.A04.A0A(bundle);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Rect rect;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C60462pV c60462pV = this.A04;
        c60462pV.A0D(view, bundle);
        if (bundle != null && (rect = (Rect) bundle.getParcelable(AbstractC59962oe.KEY_CONTENT_INSETS)) != null) {
            this.A00 = rect;
        }
        A0Z();
        if (C28121Xq.A00 != null) {
            FragmentActivity requireActivity = requireActivity();
            AtomicBoolean atomicBoolean = AbstractC71193Hg.A00;
            c60462pV.A0E(new C71213Hi(new C71203Hh(requireActivity)));
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
    }

    @Override // X.InterfaceC59992oh
    public final void registerLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(interfaceC60602pj, 0);
        this.A04.A0E(interfaceC60602pj);
    }

    @Override // X.InterfaceC60012oj
    public final void removeFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.A05.removeFragmentVisibilityListener(interfaceC71183He);
    }

    @Override // X.InterfaceC59992oh
    public final void unregisterLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(interfaceC60602pj, 0);
        this.A04.A00.remove(interfaceC60602pj);
    }

    @Override // X.C38L
    public void A0V(Bundle bundle) {
        this.A04.A01();
        AbstractC12990ll A0X = A0X();
        if (A0X != null) {
            C55782hJ A00 = C55772hI.A00(A0X);
            C140976Yz c140976Yz = A00.A01;
            if (c140976Yz != null) {
                c140976Yz.A00 = getModuleName();
            }
            C3DI c3di = new C3DI(this);
            c3di.A01(A00);
            this.A01 = c3di;
        }
    }

    public final ListView A0W() {
        View view;
        View view2 = this.mView;
        if (view2 != null) {
            view = view2.findViewById(R.id.list);
        } else {
            view = null;
        }
        if (!(view instanceof ListView)) {
            return null;
        }
        return (ListView) view;
    }

    public final void A0Z() {
        Rect rect;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.mView;
        if (view != null && (rect = this.A00) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    public final void A0a(C60462pV c60462pV) {
        C60462pV c60462pV2 = this.A04;
        Iterator it = c60462pV.A00.iterator();
        while (it.hasNext()) {
            c60462pV2.A0E((InterfaceC60602pj) it.next());
        }
    }

    @Override // X.InterfaceC60002oi
    public final C3DI getFragmentVisibilityDetector() {
        return this.A01;
    }

    @Override // X.InterfaceC11390ix
    public final String getModuleNameV2() {
        return this.A03.A00;
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        C3FQ c3fq = this.A02;
        if (c3fq == null) {
            AbstractC05560Rg.A00(this);
            C3FQ A00 = C3FN.A00(super.A04);
            this.A02 = A00;
            C14360o3.A07(A00);
            return A00;
        }
        return c3fq;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.A04.A08(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C3DI c3di = this.A01;
        if (c3di != null) {
            c3di.A00();
        }
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            Context context = getContext();
            if (context != null) {
                C1GJ.A00(context, AbstractC018607g.A00(this), c11r);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void A0Y() {
        requireActivity().getWindow().setBackgroundDrawable(new ColorDrawable(AbstractC53242c7.A0F(requireContext(), R.attr.colorBackground)));
    }

    @Override // X.InterfaceC60052on
    public final Activity getRootActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Activity parent = activity.getParent();
            if (parent != null) {
                return parent;
            }
            return activity;
        }
        throw new RuntimeException("Fragment is not attached.");
    }

    @Override // androidx.fragment.app.Fragment
    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        return AbstractC140796Yh.A00(this, i2, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(-750489433);
        super.onDestroy();
        C6QM.A00(this);
        C0f9.A09(224989863, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        int A02 = C0f9.A02(-1794341724);
        super.onDestroyView();
        this.A02 = null;
        if (A0X() != null) {
            if (C18U.A06(C06090Tz.A05, A0X(), 36311049384755624L) && (view = this.mView) != null) {
                C6QM.A01(view, null, Collections.singletonMap("endpoint", AnonymousClass001.A0T(getModuleName(), getClass().getName(), ':')));
            }
        }
        C0f9.A09(146603016, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-514140793);
        super.onResume();
        A0Y();
        C0f9.A09(-48478314, A02);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }
}
