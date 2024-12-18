package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.react.delegate.IgReactDelegateLifecycleUtil;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class Rb1 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC60112ot, InterfaceC60452pT {
    public static final String __redex_internal_original_name = "IgReactFragmentProxy";
    public AbstractC60962Rck A00 = AbstractC27401Ut.getInstance().newIgReactDelegate(this);
    public AbstractC18680vv A01;

    @Override // X.InterfaceC60452pT
    public final boolean CJv(int i, KeyEvent keyEvent) {
        return this.A00.CJv(i, keyEvent);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this instanceof Rd0) {
            return true;
        }
        return this.A00.onBackPressed();
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return requireArguments().getBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (requireArguments().getBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN")) {
            interfaceC56362iU.EkF(false);
            return;
        }
        boolean z = requireArguments().getBoolean("IgReactFragment.ARGUMENT_IS_MODAL");
        String string = requireArguments().getString("IgReactFragment.ARGUMENT_TITLE");
        boolean z2 = requireArguments().getBoolean("IgReactFragment.ARGUMENT_LOGO_AS_TITLE", false);
        if (z) {
            interfaceC56362iU.Ehk(string);
            return;
        }
        if (z2) {
            interfaceC56362iU.ESp(AbstractC03270Dk.A01(this.A01), R.layout.action_bar_title_logo, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0);
        } else {
            interfaceC56362iU.setTitle(string);
        }
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String string = requireArguments().getString("IgReactFragment.ARGUMENT_ANALYTICS_MODULE");
        if (TextUtils.isEmpty(string)) {
            return AnonymousClass001.A0R("rn_", requireArguments().getString("IgReactFragment.ARGUMENT_APP_KEY"));
        }
        return string;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Q21 A04;
        super.onActivityResult(i, i2, intent);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (!igReactDelegate.A09 && (A04 = C64489TFz.A01(igReactDelegate).A04()) != null) {
            Iterator it = A04.A0B.iterator();
            while (it.hasNext()) {
                try {
                    C64134Szx c64134Szx = (C64134Szx) ((InterfaceC65213Tg3) it.next());
                    if (i == 1) {
                        WritableNativeMap A0c = AbstractC58321PtD.A0c();
                        if (i2 != -1 || intent == null) {
                            A0c.putBoolean("success", false);
                        } else {
                            A0c.putBoolean("success", "success".equals(intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)));
                            A0c.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
                            A0c.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE));
                            String A00 = AbstractC58410Puo.A00();
                            A0c.putString(A00, intent.getStringExtra(A00));
                        }
                        InterfaceC65622ToD interfaceC65622ToD = c64134Szx.A00.mShopPayPromise;
                        if (interfaceC65622ToD != null) {
                            interfaceC65622ToD.resolve(A0c);
                        }
                    }
                } catch (RuntimeException e) {
                    A04.A0D(e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C27431Uw A00;
        Bundle A0b;
        int A02 = C0f9.A02(647684239);
        super.onCreate(bundle);
        this.A01 = AbstractC166987dD.A0n(AbstractC60492pY.A01(this));
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        Fragment fragment = ((AbstractC62448SCb) igReactDelegate).A00;
        igReactDelegate.A05 = C023409i.A0A.A04(fragment.mArguments);
        igReactDelegate.A0C = fragment.mArguments.getBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED");
        synchronized (C27431Uw.class) {
            A00 = C27431Uw.A02.A00();
        }
        igReactDelegate.A06 = A00.A00(igReactDelegate.A05);
        igReactDelegate.A04 = new T0W(igReactDelegate);
        IgReactExceptionManager A002 = C62815SSm.A00(igReactDelegate.A05);
        igReactDelegate.A07 = A002;
        A002.addExceptionHandler(igReactDelegate);
        if (igReactDelegate.A01 == null) {
            if (bundle != null) {
                A0b = bundle.getBundle("IgReactFragment.SAVED_RN_BUNDLE");
            } else {
                A0b = AbstractC166987dD.A0b();
            }
            igReactDelegate.A01 = A0b;
        }
        igReactDelegate.A06.A00++;
        String string = fragment.mArguments.getString("IgReactFragment.TTI_EVENT_NAME");
        int i = fragment.mArguments.getInt("IgReactFragment.TTI_EVENT_ID", 0);
        Bundle bundle2 = fragment.mArguments.getBundle("IgReactFragment.TTI_EVENT_ANNOTATIONS");
        if (string != null) {
            AbstractC27401Ut.getInstance().getPerformanceLogger(igReactDelegate.A05).Emr(bundle2, C05F.A01, null, string, i);
        }
        C0f9.A09(1142474185, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-25043463);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        Fragment fragment = ((AbstractC62448SCb) igReactDelegate).A00;
        FrameLayout frameLayout = new FrameLayout(fragment.getContext());
        igReactDelegate.mFrameLayout = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Q59 q59 = igReactDelegate.A03;
        if (q59 == null) {
            q59 = new Q59(fragment.getActivity());
            igReactDelegate.A03 = q59;
        }
        q59.A06 = new C64131Szu(igReactDelegate);
        FrameLayout frameLayout2 = igReactDelegate.mFrameLayout;
        C0f9.A09(-2038747028, A02);
        return frameLayout2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Q21 q21;
        int A02 = C0f9.A02(-595431062);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        AbstractC27401Ut.getInstance().getPerformanceLogger(igReactDelegate.A05).Dri();
        igReactDelegate.A07.removeExceptionHandler(igReactDelegate);
        if (!igReactDelegate.A09) {
            Q59 q59 = igReactDelegate.A03;
            if (q59 != null) {
                C63343Shy c63343Shy = q59.A05;
                if (c63343Shy != null && q59.A0A) {
                    if (c63343Shy.A0F.remove(q59) && (q21 = c63343Shy.A0G) != null && q21.A0F()) {
                        C63343Shy.A03(q21, q59);
                    }
                    q59.A0A = false;
                }
                q59.A05 = null;
                q59.A0B = false;
                igReactDelegate.A03 = null;
            }
            C63343Shy A01 = C64489TFz.A01(igReactDelegate);
            if (((AbstractC62448SCb) igReactDelegate).A00.getActivity() == A01.A00) {
                C63343Shy.A01(A01);
                A01.A00 = null;
            }
        }
        C64489TFz c64489TFz = igReactDelegate.A06;
        int i = c64489TFz.A00 - 1;
        c64489TFz.A00 = i;
        if (i < 0) {
            C0w9.A03(C64489TFz.class.getName(), "Negative count of active fragments");
        }
        super.onDestroy();
        C0f9.A09(341609362, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(196522243);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (igReactDelegate.A02 != null) {
            C63343Shy A01 = C64489TFz.A01(igReactDelegate);
            A01.A0D.remove(igReactDelegate.A02);
            igReactDelegate.A02 = null;
        }
        Q59 q59 = igReactDelegate.A03;
        if (!igReactDelegate.A09 && q59 != null) {
            igReactDelegate.mFrameLayout.removeView(q59);
            q59.A06 = null;
        }
        IgReactDelegateLifecycleUtil.cleanupReferences(igReactDelegate);
        super.onDestroyView();
        C0f9.A09(1902799669, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1608681833);
        super.onPause();
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        AbstractC27401Ut.getInstance().getPerformanceLogger(igReactDelegate.A05).Dri();
        Fragment fragment = ((AbstractC62448SCb) igReactDelegate).A00;
        AbstractC13880nE.A0O(AbstractC43592JPx.A08(fragment.getActivity()));
        fragment.getActivity().getWindow().setSoftInputMode(48);
        if (!igReactDelegate.A09 && !igReactDelegate.A05.hasEnded()) {
            C63343Shy A01 = C64489TFz.A01(igReactDelegate);
            FragmentActivity activity = fragment.getActivity();
            boolean z = true;
            Activity activity2 = A01.A00;
            if (activity2 != null) {
                if (activity != activity2) {
                    z = false;
                }
                AbstractC05810Sj.A03(z, AnonymousClass001.A0u("Pausing an activity that is not the current activity, this is incorrect! Current activity: ", AbstractC31173DnH.A0q(activity2), " Paused activity: ", AbstractC31173DnH.A0q(activity)));
            }
            A01.A03 = null;
            synchronized (A01) {
                Q21 A04 = A01.A04();
                if (A04 != null) {
                    if (A01.A0I == C05F.A00) {
                        A04.A09(A01.A00);
                    } else if (A01.A0I == C05F.A0C) {
                    }
                    A04.A08();
                }
                A01.A0I = C05F.A01;
            }
        }
        if (igReactDelegate.A0D) {
            C1UC activity3 = fragment.getActivity();
            if (activity3 instanceof InterfaceC53712dA) {
                ((InterfaceC53712dA) activity3).EfL(0);
            }
        }
        AbstractC917648y.A00(fragment.getActivity(), igReactDelegate.A00);
        C0f9.A09(1277653628, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int A02 = C0f9.A02(1447143849);
        super.onResume();
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (!igReactDelegate.A09) {
            C63343Shy A01 = C64489TFz.A01(igReactDelegate);
            FragmentActivity activity = ((AbstractC62448SCb) igReactDelegate).A00.getActivity();
            A01.A03 = igReactDelegate.A04;
            A01.A00 = activity;
            synchronized (A01) {
                Q21 A04 = A01.A04();
                if (A04 != null && (A01.A0I == C05F.A01 || A01.A0I == C05F.A00)) {
                    A04.A09(A01.A00);
                }
                A01.A0I = C05F.A0C;
            }
            Q21 A042 = C64489TFz.A01(igReactDelegate).A04();
            if (!igReactDelegate.A0B && A042 != null) {
                IgReactDelegate.RCTViewEventEmitter rCTViewEventEmitter = (IgReactDelegate.RCTViewEventEmitter) A042.A03(IgReactDelegate.RCTViewEventEmitter.class);
                Q59 q59 = igReactDelegate.A03;
                if (q59 != null) {
                    i = q59.A01;
                } else {
                    i = 0;
                }
                rCTViewEventEmitter.emit("viewDidAppear", Integer.valueOf(i));
            }
        }
        Fragment fragment = ((AbstractC62448SCb) igReactDelegate).A00;
        fragment.getActivity().getWindow().setSoftInputMode(16);
        boolean z = fragment.mArguments.getBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB");
        igReactDelegate.A0D = z;
        if (z) {
            C1UC activity2 = fragment.getActivity();
            if (activity2 instanceof InterfaceC53712dA) {
                ((InterfaceC53712dA) activity2).EfL(8);
            }
        }
        igReactDelegate.A00 = fragment.getActivity().getRequestedOrientation();
        AbstractC917648y.A00(fragment.getActivity(), fragment.mArguments.getInt("IgReactFragment.ARGUMENT_ORIENTATION"));
        C0f9.A09(-789331928, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = ((IgReactDelegate) this.A00).A01;
        if (bundle2 != null) {
            bundle.putBundle("IgReactFragment.SAVED_RN_BUNDLE", bundle2);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (igReactDelegate.A09) {
            IgReactDelegate.A01(igReactDelegate);
            return;
        }
        if (igReactDelegate.A0B) {
            Fragment fragment = ((AbstractC62448SCb) igReactDelegate).A00;
            Bundle bundle3 = fragment.mArguments;
            String A00 = MSV.A00(349);
            Bundle bundle4 = bundle3.getBundle(A00);
            if (bundle4 == null) {
                bundle4 = AbstractC166987dD.A0b();
            }
            bundle4.putBundle("fragmentSavedInstanceState", igReactDelegate.A01);
            C63343Shy c63343Shy = igReactDelegate.A06.A02;
            if (c63343Shy != null && c63343Shy.A0K) {
                IgReactDelegate.A00(igReactDelegate);
            } else {
                SpinnerImageView spinnerImageView = new SpinnerImageView(fragment.getContext());
                igReactDelegate.mLoadingIndicator = spinnerImageView;
                spinnerImageView.setImageResource(R.drawable.spinner_large);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                igReactDelegate.mFrameLayout.addView(igReactDelegate.mLoadingIndicator, layoutParams);
                igReactDelegate.A02 = new C64129Szr(igReactDelegate);
                C64489TFz.A01(igReactDelegate).A0D.add(igReactDelegate.A02);
            }
            String string = fragment.mArguments.getString("IgReactFragment.ARGUMENT_APP_KEY");
            Q59 q59 = igReactDelegate.A03;
            C63343Shy A01 = C64489TFz.A01(igReactDelegate);
            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "startReactApplication", -84855720);
            try {
                AbstractC05810Sj.A03(AbstractC25229BEm.A1Z(q59.A05), "This root view has already been attached to a catalyst instance manager");
                q59.A05 = A01;
                q59.A09 = string;
                q59.A04 = bundle4;
                A01.A05();
                if (C62856SUd.A00.enableEagerRootViewAttachment()) {
                    if (!q59.A0C) {
                        DisplayMetrics A0K = AbstractC167007dF.A0K(q59.getContext());
                        q59.A03 = View.MeasureSpec.makeMeasureSpec(A0K.widthPixels, Integer.MIN_VALUE);
                        q59.A00 = View.MeasureSpec.makeMeasureSpec(A0K.heightPixels, Integer.MIN_VALUE);
                    }
                    Q59.A00(q59);
                }
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 655522556);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(new TF4(igReactDelegate), igReactDelegate.A05), "ig_react_launch_app");
                if (!A0f.isSampled()) {
                    return;
                }
                if ("FacebookAppRouteHandler".endsWith(string) && (bundle2 = fragment.mArguments.getBundle(A00)) != null && bundle2.containsKey("routeName")) {
                    string = bundle2.getString("routeName");
                }
                A0f.AAP("app_key", string);
                A0f.Cht();
                return;
            } catch (Throwable th) {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -842277342);
                throw th;
            }
        }
        C63343Shy c63343Shy2 = igReactDelegate.A06.A02;
        if (c63343Shy2 == null || !c63343Shy2.A0K) {
            return;
        }
        IgReactDelegate.A00(igReactDelegate);
    }
}
