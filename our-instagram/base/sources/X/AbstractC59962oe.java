package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59962oe extends AbstractC59972of implements InterfaceC11380iw, C1GL, InterfaceC59992oh, InterfaceC60002oi, InterfaceC11390ix, InterfaceC60012oj, InterfaceC60022ok, InterfaceC60032ol, InterfaceC60042om, InterfaceC60052on, InterfaceC60062oo {
    public static final C60732px Companion = new Object();
    public static final String KEY_CONTENT_INSETS = "contentInsets";
    public static final String __redex_internal_original_name = "IgFragment";
    public C3DI _fragmentVisibilityDetector;
    public Rect contentInsets;
    public final boolean isContainerFragment;
    public final InterfaceC09390do lifecycleLogger$delegate = C1XM.A00(new C9EI(this, 48));
    public final MessageQueue.IdleHandler eventDropIdleHandler = new MessageQueue.IdleHandler() { // from class: X.2py
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            C60922qG lifecycleLogger;
            lifecycleLogger = AbstractC59962oe.this.getLifecycleLogger();
            if (lifecycleLogger.A01) {
                C006802i c006802i = lifecycleLogger.A02;
                if (c006802i != null) {
                    c006802i.markerEnd(694561158, (short) 4);
                }
                lifecycleLogger.A01 = false;
                return false;
            }
            return false;
        }
    };
    public final C60462pV lifecycleListenerSet = new C60462pV();
    public final C60482pX fragmentVisibilityListenerController = new C60482pX();
    public final C60752pz analyticsModuleV2Helper = new C60752pz();
    public final C60762q0 volumeKeyPressController = new C60762q0();
    public final InterfaceC09390do themedContext$delegate = C1XM.A00(new C9EI(this, 49));
    public final EnumC60772q1 statusBarType = EnumC60772q1.A02;
    public final boolean canShowVoiceMessageBar = true;
    public EnumC60792q3 dayNightMode = EnumC60792q3.A02;

    @Override // X.InterfaceC60012oj
    public void addFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.fragmentVisibilityListenerController.addFragmentVisibilityListener(interfaceC71183He);
    }

    public final void addLoggerListener(InterfaceC12060kA interfaceC12060kA) {
        C14360o3.A0B(interfaceC12060kA, 0);
        getLifecycleLogger().A00 = interfaceC12060kA;
    }

    @Override // X.AbstractC59972of
    public void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        C14360o3.A0B(layoutInflater, 0);
        C60922qG.A00(getLifecycleLogger(), C05F.A01);
        if (view != null) {
            this.lifecycleListenerSet.A0C(view);
        }
    }

    @Override // X.AbstractC59972of
    public void beforeOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C14360o3.A0B(layoutInflater, 0);
        C60922qG.A01(getLifecycleLogger(), C05F.A01);
    }

    public final Object getContextAs(Class cls) {
        C14360o3.A0B(cls, 0);
        return AbstractC13320mI.A00(getContext(), cls);
    }

    public abstract AbstractC18680vv getSession();

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        this.lifecycleListenerSet.A09(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return AbstractC140796Yh.A01(this, i2, z, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        Rect rect = this.contentInsets;
        if (rect != null) {
            bundle.putParcelable(KEY_CONTENT_INSETS, rect);
        }
        this.lifecycleListenerSet.A0A(bundle);
    }

    @Override // X.AbstractC59972of
    public void onSetUserVisibleHint(boolean z, boolean z2) {
        C3DI c3di;
        boolean z3 = z2 != z;
        this.fragmentVisibilityListenerController.A00(this, z);
        if (z3 && (c3di = this._fragmentVisibilityDetector) != null) {
            c3di.A00();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        Rect rect;
        C14360o3.A0B(view, 0);
        this.lifecycleListenerSet.A0D(view, bundle);
        if (bundle != null && (rect = (Rect) bundle.getParcelable(KEY_CONTENT_INSETS)) != null) {
            this.contentInsets = rect;
        }
        tryToApplyContentInset();
        if (C28121Xq.A00 != null) {
            C60462pV c60462pV = this.lifecycleListenerSet;
            FragmentActivity requireActivity = requireActivity();
            AtomicBoolean atomicBoolean = AbstractC71193Hg.A00;
            c60462pV.A0E(new C71213Hi(new C71203Hh(requireActivity)));
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
        if (!isContainerFragment()) {
            view.post(new Runnable() { // from class: X.3Hj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    ReboundViewPager reboundViewPager;
                    JRR jrr;
                    final String moduleName = this.getModuleName();
                    if (moduleName == null) {
                        moduleName = "unknown_scroll_context";
                    }
                    View A00 = C3KN.A00(view, C3KN.A01);
                    if (A00 instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) A00;
                        C14360o3.A0B(recyclerView, 0);
                        i = R.id.global_scroll_state_listener;
                        Object tag = recyclerView.getTag(R.id.global_scroll_state_listener);
                        if (tag instanceof C73943Tg) {
                            recyclerView.A15((C1I4) tag);
                        }
                        C1I4 c1i4 = new C1I4(moduleName) { // from class: X.3Tg
                            public final C73953Th A00;

                            {
                                this.A00 = new C73953Th(moduleName, false);
                            }

                            @Override // X.C1I4
                            public final void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                                int A03 = C0f9.A03(-916300652);
                                int i3 = 0;
                                C14360o3.A0B(recyclerView2, 0);
                                C73953Th c73953Th = this.A00;
                                if (i2 != 0) {
                                    i3 = 1;
                                    if (i2 != 1) {
                                        i3 = -1;
                                    }
                                }
                                c73953Th.A00(recyclerView2, i3);
                                C0f9.A0A(1271717179, A03);
                            }

                            @Override // X.C1I4
                            public final void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                                int A03 = C0f9.A03(-830327913);
                                C73953Th c73953Th = this.A00;
                                if (c73953Th.A01) {
                                    if (i3 != 0) {
                                        c73953Th.A00 += Math.abs(i3);
                                    } else if (i2 != 0) {
                                        c73953Th.A00 += Math.abs(i2);
                                        c73953Th.A02 = false;
                                    }
                                }
                                C0f9.A0A(-511816006, A03);
                            }
                        };
                        recyclerView.A14(c1i4);
                        jrr = c1i4;
                        reboundViewPager = recyclerView;
                    } else if (A00 instanceof ReboundViewPager) {
                        ReboundViewPager reboundViewPager2 = (ReboundViewPager) A00;
                        C14360o3.A0B(reboundViewPager2, 0);
                        i = R.id.global_scroll_state_listener;
                        Object tag2 = reboundViewPager2.getTag(R.id.global_scroll_state_listener);
                        if (tag2 instanceof JRR) {
                            reboundViewPager2.A0Q((InterfaceC62892tS) tag2);
                        }
                        JRR jrr2 = new JRR(moduleName);
                        reboundViewPager2.A0P(jrr2);
                        jrr = jrr2;
                        reboundViewPager = reboundViewPager2;
                    } else {
                        if (!(A00 instanceof RefreshableListView)) {
                            return;
                        }
                        RefreshableListView refreshableListView = (RefreshableListView) A00;
                        C14360o3.A0B(refreshableListView, 0);
                        refreshableListView.A01 = new AbsListView.OnScrollListener(moduleName) { // from class: X.71r
                            public final C73953Th A00;

                            {
                                this.A00 = new C73953Th(moduleName, false);
                            }

                            @Override // android.widget.AbsListView.OnScrollListener
                            public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
                                C0f9.A0A(-1863110389, C0f9.A03(838963272));
                            }

                            @Override // android.widget.AbsListView.OnScrollListener
                            public final void onScrollStateChanged(AbsListView absListView, int i2) {
                                int A03 = C0f9.A03(697271306);
                                int i3 = 0;
                                C14360o3.A0B(absListView, 0);
                                C73953Th c73953Th = this.A00;
                                if (i2 != 0) {
                                    i3 = 1;
                                    if (i2 != 1) {
                                        i3 = -1;
                                    }
                                }
                                c73953Th.A00(absListView, i3);
                                C0f9.A0A(-1385003491, A03);
                            }
                        };
                        return;
                    }
                    reboundViewPager.setTag(i, jrr);
                }
            });
        }
        AbstractC18680vv session = getSession();
        if (session != null) {
            AbstractC25651Mw.A00(session).A05(new InterfaceC41141vN(this) { // from class: X.3Hk
                public final AbstractC59962oe A00;

                {
                    this.A00 = this;
                }
            });
        }
    }

    @Override // X.InterfaceC60022ok
    public boolean onVolumeKeyPressed(EnumC37329GcX enumC37329GcX, KeyEvent keyEvent) {
        C14360o3.A0B(enumC37329GcX, 0);
        C14360o3.A0B(keyEvent, 1);
        for (InterfaceC08430c6 interfaceC08430c6 : getChildFragmentManager().A0U.A04()) {
            if ((interfaceC08430c6 instanceof InterfaceC60022ok) && ((InterfaceC60022ok) interfaceC08430c6).onVolumeKeyPressed(enumC37329GcX, keyEvent)) {
                return true;
            }
        }
        return this.volumeKeyPressController.onVolumeKeyPressed(enumC37329GcX, keyEvent);
    }

    public final void registerLifecycleListenerSet(C60462pV c60462pV) {
        C14360o3.A0B(c60462pV, 0);
        C60462pV c60462pV2 = this.lifecycleListenerSet;
        Iterator it = c60462pV.A00.iterator();
        while (it.hasNext()) {
            c60462pV2.A0E((InterfaceC60602pj) it.next());
        }
    }

    @Override // X.InterfaceC60012oj
    public void removeFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.fragmentVisibilityListenerController.removeFragmentVisibilityListener(interfaceC71183He);
    }

    public final Object requireContextAs(Class cls) {
        C14360o3.A0B(cls, 0);
        Object A00 = AbstractC13320mI.A00(getContext(), cls);
        if (A00 != null) {
            return A00;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int scheduleAndGetLoaderId(C11R c11r) {
        C14360o3.A0B(c11r, 0);
        return C1GJ.A00(requireContext(), AbstractC018607g.A00(this), c11r);
    }

    public final void setDayNightMode(EnumC60792q3 enumC60792q3) {
        C14360o3.A0B(enumC60792q3, 0);
        this.dayNightMode = enumC60792q3;
    }

    public final boolean setModuleNameV2(String str) {
        C14360o3.A0B(str, 0);
        C60752pz c60752pz = this.analyticsModuleV2Helper;
        if (c60752pz.A00 == null) {
            c60752pz.A00 = str;
            return true;
        }
        return false;
    }

    public final void unregisterLifecycleListenerSet(C60462pV c60462pV) {
        C14360o3.A0B(c60462pV, 0);
        C60462pV c60462pV2 = this.lifecycleListenerSet;
        Iterator it = c60462pV.A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A0B(next, 0);
            c60462pV2.A00.remove(next);
        }
    }

    public final boolean updateModuleNameV2_USE_WITH_CAUTION(String str) {
        C14360o3.A0B(str, 0);
        AbstractC18680vv session = getSession();
        if (session == null) {
            return false;
        }
        C60752pz c60752pz = this.analyticsModuleV2Helper;
        if (this instanceof InterfaceC11210ic) {
            c60752pz.A00 = str;
            if (isResumed() && this.mUserVisibleHint) {
                C55772hI.A00(session).A0D("dynamic_analytics_module", this);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C60922qG getLifecycleLogger() {
        return (C60922qG) this.lifecycleLogger$delegate.getValue();
    }

    @Override // X.AbstractC59972of
    public void afterOnDestroy() {
        this.lifecycleListenerSet.A02();
    }

    @Override // X.AbstractC59972of
    public void afterOnDestroyView() {
        this.lifecycleListenerSet.A03();
    }

    @Override // X.AbstractC59972of
    public void afterOnPause() {
        this.lifecycleListenerSet.A04();
        C3DI c3di = this._fragmentVisibilityDetector;
        if (c3di != null) {
            c3di.A00();
        }
        try {
            C23031Ai A00 = AbstractC23021Ah.A00((UserSession) AbstractC60492pY.A02(this).getValue());
            String moduleName = getModuleName();
            C14360o3.A0B(moduleName, 0);
            InterfaceC19610xo ARD = A00.A01.ARD();
            ARD.E7K("app_entry_last_interacted_fragment", moduleName);
            ARD.apply();
            AbstractC18680vv session = getSession();
            if (session != null) {
                C55772hI.A00(session);
                getModuleName();
            }
        } catch (IllegalStateException e) {
            C0K8.A0F(getModuleName(), " failed to get user session", e);
        }
    }

    @Override // X.AbstractC59972of
    public void afterOnResume() {
        AbstractC09800fd.A01("IgFragment.afterOnResume", 2080887718);
        try {
            this.lifecycleListenerSet.A05();
            C3DI c3di = this._fragmentVisibilityDetector;
            if (c3di != null) {
                c3di.A00();
            }
            C60922qG.A00(getLifecycleLogger(), C05F.A0Y);
            AbstractC09800fd.A00(-1286466902);
        } catch (Throwable th) {
            AbstractC09800fd.A00(518475348);
            throw th;
        }
    }

    @Override // X.AbstractC59972of
    public void afterOnStart() {
        this.lifecycleListenerSet.A06();
        C60922qG.A00(getLifecycleLogger(), C05F.A0N);
    }

    @Override // X.AbstractC59972of
    public void afterOnStop() {
        this.lifecycleListenerSet.A07();
    }

    @Override // X.AbstractC59972of
    public void beforeOnDestroyView() {
        C60462pV c60462pV = this.lifecycleListenerSet;
        View view = this.mView;
        int size = c60462pV.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = C60462pV.A00(c60462pV, size);
            if (A00 != null) {
                A00.ADK(view);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public boolean getCanShowVoiceMessageBar() {
        return this.canShowVoiceMessageBar;
    }

    public final EnumC60792q3 getDayNightMode() {
        return this.dayNightMode;
    }

    @Override // X.InterfaceC60002oi
    public C3DI getFragmentVisibilityDetector() {
        return this._fragmentVisibilityDetector;
    }

    @Override // X.AbstractC59972of, androidx.fragment.app.Fragment
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        LayoutInflater from;
        if (this.dayNightMode == EnumC60792q3.A02) {
            from = super.getLayoutInflater(bundle);
        } else {
            from = LayoutInflater.from(getThemedContext());
        }
        C14360o3.A07(from);
        return from;
    }

    @Override // X.InterfaceC11390ix
    public String getModuleNameV2() {
        return this.analyticsModuleV2Helper.A00;
    }

    public EnumC60772q1 getStatusBarType() {
        return this.statusBarType;
    }

    public Context getThemedContext() {
        return (Context) this.themedContext$delegate.getValue();
    }

    @Override // X.InterfaceC60032ol
    public C60762q0 getVolumeKeyPressController() {
        return this.volumeKeyPressController;
    }

    public boolean isContainerFragment() {
        return this.isContainerFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.lifecycleListenerSet.A08(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        C3DI c3di = this._fragmentVisibilityDetector;
        if (c3di != null) {
            c3di.A00();
        }
    }

    @Override // X.InterfaceC59992oh
    public void registerLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        if (interfaceC60602pj != null) {
            this.lifecycleListenerSet.A0E(interfaceC60602pj);
        }
    }

    @Override // X.C1GL
    public void schedule(C11R c11r) {
        if (c11r != null) {
            if (this.mFragmentManager == null) {
                C0w9.A03("IG_FRAGMENT_SCHEDULE", AnonymousClass001.A0g("Can't schedule task: ", c11r.getName(), " on detached fragment"));
            } else {
                C1GJ.A00(requireContext(), AbstractC018607g.A00(this), c11r);
            }
        }
    }

    public final void setContentInset(int i, int i2, int i3, int i4) {
        this.contentInsets = new Rect(i, i2, i3, i4);
        tryToApplyContentInset();
    }

    public final void tryToApplyContentInset() {
        Rect rect;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.mView;
        if (view != null && (rect = this.contentInsets) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    @Override // X.InterfaceC59992oh
    public void unregisterLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        if (interfaceC60602pj != null) {
            this.lifecycleListenerSet.A00.remove(interfaceC60602pj);
        }
    }

    @Override // X.AbstractC59972of
    public void afterOnCreate(Bundle bundle) {
        C60922qG.A00(getLifecycleLogger(), C05F.A00);
        this.lifecycleListenerSet.A01();
        AbstractC18680vv session = getSession();
        if (session != null) {
            C55782hJ A00 = C55772hI.A00(session);
            C140976Yz c140976Yz = A00.A01;
            if (c140976Yz != null) {
                c140976Yz.A00 = getModuleName();
            }
            C3DI c3di = new C3DI(this);
            c3di.A01(A00);
            this._fragmentVisibilityDetector = c3di;
        }
    }

    @Override // X.AbstractC59972of
    public void beforeOnCreate(Bundle bundle) {
        C60922qG.A01(getLifecycleLogger(), C05F.A00);
        Looper.myQueue().addIdleHandler(this.eventDropIdleHandler);
    }

    @Override // X.AbstractC59972of
    public void beforeOnResume() {
        C60922qG.A01(getLifecycleLogger(), C05F.A0Y);
        Looper.myQueue().removeIdleHandler(this.eventDropIdleHandler);
    }

    @Override // X.AbstractC59972of
    public void beforeOnStart() {
        C60922qG.A01(getLifecycleLogger(), C05F.A0N);
    }

    @Override // X.InterfaceC60052on
    public Activity getRootActivity() {
        Activity activity;
        Context context = getContext();
        if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
            return null;
        }
        Activity parent = activity.getParent();
        if (parent != null) {
            return parent;
        }
        return activity;
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return AbstractC140796Yh.A00(this, i2, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(-799703426);
        super.onDestroy();
        C6QM.A00(this);
        C0f9.A09(-1092462541, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        int A02 = C0f9.A02(-329702987);
        super.onDestroyView();
        AbstractC18680vv session = getSession();
        if (session != null && C14360o3.A0K(Boolean.valueOf(C18U.A06(C06090Tz.A05, session, 36311049384755624L)), true) && (view = this.mView) != null) {
            C6QM.A01(view, null, AbstractC16850sd.A0M(new C09530e4("additional_logged_classname", getClass().getName())));
        }
        C0f9.A09(1163185354, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-833451044);
        super.onResume();
        AbstractC56402iY.A05(requireActivity(), getStatusBarType());
        C0f9.A09(-241399534, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        int A02 = C0f9.A02(-1337981550);
        super.onViewStateRestored(bundle);
        this.lifecycleListenerSet.A0B(bundle);
        C0f9.A09(-982976163, A02);
    }

    public final void stopLoader(int i) {
        AbstractC018607g.A00(this).A03(i);
    }

    @Override // X.C1GL
    public void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }
}
