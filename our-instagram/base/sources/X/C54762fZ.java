package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.ui.swipenavigation.SwipeNavigationContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2fZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54762fZ {
    public static final Long A0C = 100L;
    public InterfaceC53962da A00;
    public C54772fa A01;
    public C54802fd A02;
    public boolean A04;
    public View A06;
    public C23031Ai A07;
    public final FragmentActivity A08;
    public final UserSession A09;
    public final InterfaceC53752dE A0A;
    public final Map A0B;
    public boolean A05 = false;
    public boolean A03 = true;

    public final Fragment A00() {
        return this.A01.A02.getSupportFragmentManager().A0O(R.id.layout_container_main);
    }

    public final String A01() {
        C1QO A02 = this.A01.A02();
        if (A02 == null) {
            if (C18U.A06(C06090Tz.A05, this.A09, 36325695223248146L)) {
                return "";
            }
        }
        A02.getClass();
        return A02.toString();
    }

    public final String A02() {
        return this.A02.A0B(this.A08.getSupportFragmentManager());
    }

    public final void A03() {
        C54802fd c54802fd = this.A02;
        C13080lu A00 = AbstractC13090lv.A00("SwipeNavigationController.onActivityDestroyed");
        try {
            c54802fd.A0G = null;
            SwipeNavigationContainer swipeNavigationContainer = c54802fd.A0F;
            if (swipeNavigationContainer != null) {
                swipeNavigationContainer.setListener(null);
                swipeNavigationContainer.A0C = null;
            }
            A00.close();
            this.A02 = null;
            this.A01 = null;
            this.A00 = null;
            this.A05 = true;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public final void A04(Intent intent) {
        C54802fd c54802fd = this.A02;
        if (intent.getData() == null) {
            UserSession userSession = c54802fd.A0P;
            if (AbstractC23021Ah.A00(userSession).A01.getBoolean("has_ever_captured_media_for_recovery", false)) {
                C196948nP A00 = AbstractC60292pC.A00(userSession);
                if (A00 != null) {
                    if (AbstractC60292pC.A03(userSession, A00)) {
                        int i = A00.A00;
                        if (C1AD.A06(C06090Tz.A05, 18302827038249939L) || i < 3) {
                            A00.A00++;
                            AbstractC60292pC.A02(userSession, A00);
                            CameraConfiguration cameraConfiguration = null;
                            C195868lW c195868lW = A00.A04;
                            if (c195868lW != null && c195868lW.A13) {
                                cameraConfiguration = C82R.A00(C208509Kk.A00, C81W.A0B);
                            }
                            c54802fd.FBp(new PositionConfig(null, cameraConfiguration, null, "story_captured_media_recovery", null, null, null, null, null, null, null, null, null, -1.0f, 0, false));
                            return;
                        }
                    }
                    InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                    ARD.E7K("captured_media_recovery_info", "");
                    ARD.apply();
                }
                if (AbstractC23021Ah.A00(userSession).A01.getString("pending_capture_intent_capture_mode", null) == null) {
                    return;
                }
                InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                ARD2.EEj("pending_capture_intent_capture_mode");
                ARD2.EEj("pending_capture_intent_media_type");
                ARD2.EEj("pending_capture_intent_is_reply");
                ARD2.apply();
            }
        }
    }

    public final void A05(Bundle bundle) {
        bundle.putBoolean("MainTabControllerImpl.BUNDLE_KEY_IS_CURRENT_TAB_LOADED", this.A04);
        C54802fd c54802fd = this.A02;
        ArrayList<String> arrayList = new ArrayList<>();
        if (c54802fd.A0F != null) {
            if (c54802fd.A0C != null && c54802fd.A0G()) {
                arrayList.add("fragment_panel_direct");
            }
            if (c54802fd.A0A() != null && c54802fd.A0I()) {
                arrayList.add("fragment_panel_camera");
            }
        }
        bundle.putStringArrayList("RESTORE_DISABLED_FRAGMENT_TAGS", arrayList);
        C54772fa c54772fa = this.A01;
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator it = c54772fa.A06.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toString());
        }
        bundle.putStringArrayList("NavigationController.BUNDLE_KEY_BACK_STACK", arrayList2);
        bundle.putFloat("InstagramMainActivity.BUNDLE_KEY_CURRENT_NAVIGATION_POSITION", this.A02.A00);
    }

    public final void A06(Bundle bundle) {
        C59862oT c59862oT;
        float f;
        String str;
        C13080lu A00 = AbstractC13090lv.A00("MainTabControllerImpl.setUpSwipeNavigationController");
        try {
            C54802fd c54802fd = this.A02;
            Window window = this.A08.getWindow();
            window.getClass();
            View decorView = window.getDecorView();
            C13080lu A002 = AbstractC13090lv.A00("SwipeNavigationController.setUpSwipeNavigation");
            try {
                c54802fd.A09 = decorView.findViewById(R.id.layout_container_main_panel);
                c54802fd.A08 = decorView.findViewById(R.id.layout_container_main);
                c54802fd.A0A = decorView.findViewById(R.id.layout_container_left);
                c54802fd.A0B = decorView.findViewById(R.id.layout_container_right);
                c54802fd.A0F = (SwipeNavigationContainer) decorView.requireViewById(R.id.swipe_navigation_container);
                C54822fg c54822fg = c54802fd.A0S;
                View view = c54802fd.A09;
                C14360o3.A0B(view, 1);
                float f2 = 1.0f;
                UserSession userSession = c54802fd.A0P;
                if (AbstractC55822hN.A00(userSession) == C05F.A00) {
                    f2 = 0.5f;
                }
                SwipeNavigationContainer swipeNavigationContainer = c54802fd.A0F;
                View view2 = c54802fd.A0A;
                C14360o3.A0B(view2, 1);
                C59862oT c59862oT2 = new C59862oT(view2, -1.0f, 1.0f);
                C59862oT c59862oT3 = new C59862oT(view, 0.0f, f2);
                if (c54802fd.A0J()) {
                    View view3 = c54802fd.A0B;
                    C14360o3.A0B(view3, 1);
                    c59862oT = new C59862oT(view3, 1.0f, 1.0f);
                } else {
                    c59862oT = null;
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                double A003 = C18U.A00(c06090Tz, userSession, 37158089949970502L);
                double A004 = C18U.A00(c06090Tz, userSession, 37158089950036039L);
                swipeNavigationContainer.A0C = c54802fd;
                swipeNavigationContainer.A0E = c59862oT3;
                swipeNavigationContainer.A0G = c59862oT2;
                swipeNavigationContainer.A0F = c59862oT;
                swipeNavigationContainer.A0g.A09(C55942hf.A04(40.0d, 8.0d * A003));
                swipeNavigationContainer.A00 = A004;
                C59872oU c59872oU = new C59872oU(c54802fd.A0O, c54802fd.A0F);
                c54802fd.A0G = c59872oU;
                c54822fg.A00(c59872oU);
                c54802fd.A0F.setListener(new C59922oZ(c54802fd));
                if (bundle == null) {
                    f = 0.0f;
                } else {
                    f = bundle.getFloat("InstagramMainActivity.BUNDLE_KEY_CURRENT_NAVIGATION_POSITION");
                }
                c54802fd.A00 = f;
                c54802fd.A01 = f;
                if (bundle == null) {
                    str = "activity_newly_created";
                } else {
                    str = "activity_recreated";
                }
                c54802fd.FBp(new PositionConfig(null, null, null, str, null, null, null, null, null, null, null, null, null, f, 0, false));
                A002.close();
                A00.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
            }
        }
    }

    public final void A07(Bundle bundle, C1QP c1qp) {
        InterfaceC08430c6 A0Q = this.A01.A02.getSupportFragmentManager().A0Q(c1qp.B8U());
        if (A0Q instanceof InterfaceC60102os) {
            ((InterfaceC60102os) A0Q).EU2(bundle);
        } else {
            this.A0B.put(c1qp, bundle);
        }
    }

    public final void A08(View view) {
        View view2 = this.A06;
        if (view2 != null) {
            final boolean z = false;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            try {
                view2.onInitializeAccessibilityNodeInfo(obtain);
                final CharSequence tooltipText = obtain.getTooltipText();
                if (tooltipText != null && tooltipText.length() != 0) {
                    AbstractC010103p.A0B(view2, new C02V() { // from class: X.2m7
                        @Override // X.C02V
                        public final void A0Y(View view3, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            C14360o3.A0B(view3, 0);
                            C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                            super.A0Y(view3, accessibilityNodeInfoCompat);
                            accessibilityNodeInfoCompat.mInfo.setSelected(z);
                            accessibilityNodeInfoCompat.setRoleDescription(view3.getContext().getString(2131975126));
                            accessibilityNodeInfoCompat.mInfo.setTooltipText(tooltipText);
                        }
                    });
                }
            } catch (NullPointerException unused) {
            }
            this.A06.setSelected(false);
        }
        this.A06 = view;
        if (view != null) {
            final boolean z2 = true;
            AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(obtain2);
                final CharSequence tooltipText2 = obtain2.getTooltipText();
                if (tooltipText2 != null && tooltipText2.length() != 0) {
                    AbstractC010103p.A0B(view, new C02V() { // from class: X.2m7
                        @Override // X.C02V
                        public final void A0Y(View view3, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            C14360o3.A0B(view3, 0);
                            C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                            super.A0Y(view3, accessibilityNodeInfoCompat);
                            accessibilityNodeInfoCompat.mInfo.setSelected(z2);
                            accessibilityNodeInfoCompat.setRoleDescription(view3.getContext().getString(2131975126));
                            accessibilityNodeInfoCompat.mInfo.setTooltipText(tooltipText2);
                        }
                    });
                }
            } catch (NullPointerException unused2) {
            }
            this.A06.setSelected(true);
        }
    }

    public final void A09(C1QO c1qo) {
        if (!this.A04 || c1qo != this.A01.A02()) {
            this.A01.A05(c1qo, false, false, false);
            this.A04 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ed, code lost:
    
        if (X.C18U.A06(r2, r9, 2342160526819202343L) == false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.C1QO r28, X.C1QO r29) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54762fZ.A0A(X.1QO, X.1QO):void");
    }

    public final boolean A0B(C1QO c1qo) {
        if (this.A01.A02() != c1qo) {
            return false;
        }
        return true;
    }

    public C54762fZ(Intent intent, Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, C54132eL c54132eL, InterfaceC53752dE interfaceC53752dE, InterfaceC53962da interfaceC53962da) {
        this.A04 = false;
        this.A08 = fragmentActivity;
        this.A09 = userSession;
        this.A00 = interfaceC53962da;
        this.A01 = new C54772fa(intent, bundle, fragmentActivity, userSession, this);
        if (bundle != null) {
            this.A04 = bundle.getBoolean("MainTabControllerImpl.BUNDLE_KEY_IS_CURRENT_TAB_LOADED");
        }
        this.A0A = interfaceC53752dE;
        this.A02 = new C54802fd(fragmentActivity, userSession, c54132eL, this);
        this.A0B = new HashMap();
        this.A07 = AbstractC23021Ah.A00(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36328151945788671L)) {
            AbstractC110014xV.A00(userSession).A00(fragmentActivity.getApplicationContext());
        }
    }
}
