package com.instagram.base.activity;

import X.AbstractC018607g;
import X.AbstractC10360h2;
import X.AbstractC12860lY;
import X.AbstractC12960li;
import X.AbstractC13180m4;
import X.AbstractC13880nE;
import X.AbstractC18680vv;
import X.AbstractC19730y1;
import X.AbstractC215613i;
import X.AbstractC25061Kk;
import X.AbstractC50712Us;
import X.AbstractC51982Zy;
import X.AbstractC53172bz;
import X.AbstractC53242c7;
import X.AbstractC56402iY;
import X.AbstractC74033Tu;
import X.AnonymousClass001;
import X.C006802i;
import X.C06090Tz;
import X.C07S;
import X.C0K8;
import X.C0L6;
import X.C0PJ;
import X.C0f9;
import X.C0fO;
import X.C106904rr;
import X.C11R;
import X.C12260kU;
import X.C14360o3;
import X.C14H;
import X.C172077lc;
import X.C18U;
import X.C1GJ;
import X.C1H6;
import X.C1KM;
import X.C1KP;
import X.C1KT;
import X.C2UR;
import X.C3DN;
import X.C3DP;
import X.C3K7;
import X.C3K8;
import X.C3K9;
import X.C51852Zj;
import X.C52912bY;
import X.C53252c9;
import X.C55772hI;
import X.C57982lB;
import X.C5G9;
import X.C5I1;
import X.EnumC37329GcX;
import X.InterfaceC08430c6;
import X.InterfaceC12850lX;
import X.InterfaceC12980lk;
import X.InterfaceC19610xo;
import X.InterfaceC47352Fi;
import X.InterfaceC60022ok;
import X.InterfaceC60072op;
import X.InterfaceC60452pT;
import X.InterfaceC60602pj;
import X.PIN;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.apiperf.TouchEventProvider;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class IgFragmentActivity extends AppCompatActivity implements InterfaceC47352Fi, InterfaceC12980lk {
    public static final C51852Zj Companion = new Object();
    public static final String TAG = "IgFragmentActivity";
    public static final String TOUCH_EVENT_PRIVATE_FLAGS_VARIABLE_NAME = "int android.view.View.mPrivateFlags";
    public Boolean _useVolumeKeyPressController;
    public TouchEventProvider debugHeadTouchListener;
    public C3DN mBottomSheetNavigator;
    public final Set onActivityResultListenerMap = new CopyOnWriteArraySet();
    public C5G9 responsivenessWatcher;
    public boolean subscribedToInsets;
    public C53252c9 trLogger;

    private final boolean handleVolumeKey(int i, KeyEvent keyEvent) {
        EnumC37329GcX enumC37329GcX;
        if (i == 25 || i == 24) {
            boolean useVolumeKeyPressController = getUseVolumeKeyPressController();
            List<InterfaceC08430c6> A04 = this.mFragments.A00.A03.A0U.A04();
            if (useVolumeKeyPressController) {
                C14360o3.A07(A04);
                return handleVolumeKey(i, keyEvent, A04);
            }
            for (InterfaceC08430c6 interfaceC08430c6 : A04) {
                if (interfaceC08430c6 instanceof InterfaceC60022ok) {
                    InterfaceC60022ok interfaceC60022ok = (InterfaceC60022ok) interfaceC08430c6;
                    if (i == 25) {
                        enumC37329GcX = EnumC37329GcX.A02;
                    } else {
                        enumC37329GcX = EnumC37329GcX.A03;
                    }
                    if (interfaceC60022ok.onVolumeKeyPressed(enumC37329GcX, keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        C14360o3.A0B(context, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.attachBaseContext", -1312784016);
        }
        try {
            super.attachBaseContext(new C2UR(context));
            if (Systrace.A0E(1L)) {
                C0fO.A00(-379765616);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1998430372);
            }
            throw th;
        }
    }

    public boolean canRedirectBackPressToFeedForColdStart() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0227, code lost:
    
        if (X.AbstractC001900j.A0a(r4, com.instagram.base.activity.IgFragmentActivity.TOUCH_EVENT_PRIVATE_FLAGS_VARIABLE_NAME, false) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0236, code lost:
    
        r3 = new java.lang.StringBuilder();
        r3.append("Tried to dispatch a touch event, but got an error. MotionEvent: ");
        r3.append(r22);
        X.AbstractC12120kG.A04("IgFragmentActivity_error_dispatching_touch_event", r3.toString(), 817902720, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0253, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0255, code lost:
    
        X.C0fO.A00(1346248655);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0234, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36311440226845202L) == false) goto L107;
     */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (X.WFP.A03("tracking", r24) == false) goto L15;
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dump(java.lang.String r21, java.io.FileDescriptor r22, java.io.PrintWriter r23, java.lang.String[] r24) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // X.InterfaceC47352Fi
    public C3DN getBottomSheetNavigator() {
        String str;
        AbstractC18680vv session = getSession();
        if (session != null) {
            if (isFinishing()) {
                str = "Activity is finishing";
            } else if (isDestroyed()) {
                str = "Activity is destroyed";
            }
            C0K8.A0D(TAG, str);
            return null;
        }
        C3DN c3dn = this.mBottomSheetNavigator;
        if (c3dn == null) {
            if (session == null) {
                str = "Session not found";
                C0K8.A0D(TAG, str);
                return null;
            }
            Window window = getWindow();
            if (window != null && window.getDecorView() != null) {
                View bottomSheetRootView = getBottomSheetRootView();
                C14360o3.A0B(bottomSheetRootView, 0);
                if (bottomSheetRootView.findViewById(R.id.bottom_sheet_container) != null || bottomSheetRootView.findViewById(R.id.bottom_sheet_container_stub) != null) {
                    View bottomSheetRootView2 = getBottomSheetRootView();
                    AbstractC10360h2 abstractC10360h2 = this.mFragments.A00.A03;
                    C14360o3.A07(abstractC10360h2);
                    C14360o3.A0B(bottomSheetRootView2, 1);
                    C3DP c3dp = new C3DP(this, bottomSheetRootView2, abstractC10360h2, session, R.id.layout_container_bottom_sheet, true);
                    this.mBottomSheetNavigator = c3dp;
                    return c3dp;
                }
            }
            return null;
        }
        return c3dn;
    }

    public C172077lc getGnvGestureHandler() {
        return null;
    }

    public abstract AbstractC18680vv getSession();

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.onConfigurationChanged", -714194484);
        }
        try {
            super.onConfigurationChanged(configuration);
            AbstractC13880nE.A00 = null;
            Resources resources = getResources();
            if (resources instanceof AbstractC215613i) {
                ((AbstractC215613i) resources).A01(configuration);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-148223390);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-16603078);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (super.onKeyDown(r5, r6) != false) goto L15;
     */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            r2 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L14
            r1 = -351587966(0xffffffffeb0b3182, float:-1.6827448E26)
            java.lang.String r0 = "IgFragmentActivity.onKeyDown"
            X.C0fO.A01(r0, r1)
        L14:
            boolean r0 = X.C1KM.A08     // Catch: java.lang.Throwable -> L53
            boolean r0 = X.C1KT.A05     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L26
            X.1KS r0 = X.C1KT.A02     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r0.A01     // Catch: java.lang.Throwable -> L53
            X.4JX r0 = new X.4JX     // Catch: java.lang.Throwable -> L53
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L53
            X.C1KT.A02(r0)     // Catch: java.lang.Throwable -> L53
        L26:
            boolean r0 = X.C1KM.A08     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L38
            X.1KS r0 = X.C1KM.A00()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r0.A01     // Catch: java.lang.Throwable -> L53
            X.4JX r0 = new X.4JX     // Catch: java.lang.Throwable -> L53
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L53
            X.C1KM.A06(r0)     // Catch: java.lang.Throwable -> L53
        L38:
            boolean r0 = r4.handleVolumeKey(r5, r6)     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L45
            boolean r0 = super.onKeyDown(r5, r6)     // Catch: java.lang.Throwable -> L53
            r1 = 0
            if (r0 == 0) goto L46
        L45:
            r1 = 1
        L46:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L52
            r0 = -465640499(0xffffffffe43ee3cd, float:-1.4085185E22)
            X.C0fO.A00(r0)
        L52:
            return r1
        L53:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L60
            r0 = 347908540(0x14bca9bc, float:1.9050097E-26)
            X.C0fO.A00(r0)
        L60:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.onKeyUp", 1875777590);
        }
        try {
            boolean z = C1KM.A08;
            if (C1KT.A05) {
                C1KT.A02(new C5I1(keyEvent, ((C1KP) C1KT.A02).A01));
            }
            if (C1KM.A08) {
                C1KM.A06(new C5I1(keyEvent, ((C1KP) C1KM.A00()).A01));
            }
            InterfaceC08430c6 fragment = getFragment();
            boolean z2 = true;
            if ((!(fragment instanceof InterfaceC60452pT) || !((InterfaceC60452pT) fragment).CJv(i, keyEvent)) && !handleVolumeKey(i, keyEvent)) {
                if (!super.onKeyUp(i, keyEvent)) {
                    z2 = false;
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-872831627);
            }
            return z2;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1102190875);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.onRestoreInstanceState", 1754002483);
        }
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            C14360o3.A0A(classLoader);
            C52912bY.A00(bundle, classLoader);
            super.onRestoreInstanceState(bundle);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1442828429);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-813584398);
            }
            throw th;
        }
    }

    public void registerOnActivityResultListener(InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(interfaceC60602pj, 0);
        synchronized (this.onActivityResultListenerMap) {
            this.onActivityResultListenerMap.add(interfaceC60602pj);
        }
    }

    public void unregisterOnActivityResultListener(InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(interfaceC60602pj, 0);
        synchronized (this.onActivityResultListenerMap) {
            this.onActivityResultListenerMap.remove(interfaceC60602pj);
        }
    }

    private final void executePendingActions() {
        C3K7 c3k7 = C3K7.A00;
        if (!c3k7.isEmpty()) {
            c3k7.removeFirst();
            throw new NullPointerException("execute");
        }
    }

    private final Fragment getFragment() {
        return this.mFragments.A00.A03.A0O(R.id.layout_container_main);
    }

    private final boolean getUseVolumeKeyPressController() {
        Boolean bool = this._useVolumeKeyPressController;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getSession() != null) {
            this._useVolumeKeyPressController = true;
            return true;
        }
        return false;
    }

    private final void handleRegisteredOnActivityResultListeners(int i, int i2, Intent intent) {
        synchronized (this.onActivityResultListenerMap) {
            Iterator it = this.onActivityResultListenerMap.iterator();
            while (it.hasNext()) {
                ((InterfaceC60602pj) it.next()).onActivityResult(i, i2, intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTransparentThemeAndroid15() {
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(android.R.attr.windowBackground, typedValue, true);
        getTheme().resolveAttribute(android.R.attr.windowIsTranslucent, typedValue2, true);
        if (typedValue2.data != 0 || (typedValue.isColorType() && typedValue.data == 0)) {
            return true;
        }
        return false;
    }

    private final void startMainActivity() {
        C12260kU.A0C(this, C14H.A03.A00().A03(this, 268566528));
    }

    public void configureWindowInsetsAndroid15() {
        if (!this.subscribedToInsets && AbstractC13180m4.A02(this)) {
            this.subscribedToInsets = true;
            C57982lB.A0B.A04(this, new PIN(this), false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.onActivityResult", -717160125);
        }
        try {
            super.onActivityResult(i, i2, intent);
            handleRegisteredOnActivityResultListeners(i, i2, intent);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1545818446);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-664832117);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i;
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.onBackPressed", 1408487883);
        }
        try {
            C3DN c3dn = this.mBottomSheetNavigator;
            if (c3dn == null || !c3dn.A0Y()) {
                Fragment fragment = getFragment();
                if ((fragment instanceof InterfaceC60072op) && ((InterfaceC60072op) fragment).onBackPressed()) {
                    if (Systrace.A0E(1L)) {
                        i = -20713344;
                    } else {
                        return;
                    }
                } else {
                    AbstractC18680vv session = getSession();
                    if (session != null) {
                        C55772hI.A00(session).A09(this, "back");
                    }
                    if (Build.VERSION.SDK_INT == 29 && this.mFragments.A00.A03.A0L() == 0 && isTaskRoot() && !getOnBackPressedDispatcher().A01) {
                        finishAfterTransition();
                        if (Systrace.A0E(1L)) {
                            i = 1968410805;
                        } else {
                            return;
                        }
                    } else {
                        if (shouldRedirectBackPressForColdStart()) {
                            startMainActivity();
                        }
                        if (fragment != 0 && !fragment.mLifecycleRegistry.A07().A00(C07S.CREATED) && session != null && (session instanceof UserSession)) {
                            if (C18U.A06(C06090Tz.A05, (UserSession) session, 36319093858507702L)) {
                                if (Systrace.A0E(1L)) {
                                    i = 2029627774;
                                } else {
                                    return;
                                }
                            }
                        }
                        super.onBackPressed();
                        if (Systrace.A0E(1L)) {
                            i = -1453797639;
                        } else {
                            return;
                        }
                    }
                }
            } else if (Systrace.A0E(1L)) {
                i = 2052952466;
            } else {
                return;
            }
            C0fO.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1922839413);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01eb, code lost:
    
        if (r5 != 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (r12 != 2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207 A[Catch: all -> 0x0234, TryCatch #1 {all -> 0x0234, blocks: (B:78:0x0183, B:80:0x018f, B:82:0x0193, B:83:0x0197, B:85:0x01a3, B:88:0x01b3, B:90:0x01bc, B:92:0x01c2, B:93:0x0228, B:94:0x0233, B:95:0x01c5, B:101:0x01f1, B:103:0x0207, B:104:0x020e, B:110:0x01b7), top: B:77:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109 A[Catch: all -> 0x0138, TryCatch #3 {all -> 0x0138, blocks: (B:13:0x0085, B:15:0x0091, B:17:0x0095, B:18:0x0099, B:20:0x00a5, B:23:0x00b5, B:25:0x00be, B:27:0x00c4, B:28:0x012c, B:29:0x0137, B:31:0x00c7, B:37:0x00f3, B:39:0x0109, B:40:0x0110, B:52:0x00b9), top: B:12:0x0085, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #4 {all -> 0x014c, blocks: (B:9:0x0079, B:11:0x007f, B:41:0x0112, B:43:0x0118, B:54:0x0139, B:56:0x013f, B:57:0x0145, B:58:0x014b, B:13:0x0085, B:15:0x0091, B:17:0x0095, B:18:0x0099, B:20:0x00a5, B:23:0x00b5, B:25:0x00be, B:27:0x00c4, B:28:0x012c, B:29:0x0137, B:31:0x00c7, B:37:0x00f3, B:39:0x0109, B:40:0x0110, B:52:0x00b9), top: B:8:0x0079, outer: #0, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:5:0x0067, B:7:0x0073, B:44:0x011e, B:46:0x0124, B:60:0x014d, B:62:0x0153, B:63:0x0159, B:64:0x015f, B:9:0x0079, B:11:0x007f, B:41:0x0112, B:43:0x0118, B:54:0x0139, B:56:0x013f, B:57:0x0145, B:58:0x014b), top: B:4:0x0067, inners: #4 }] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.onTrimMemory", -1907450718);
        }
        try {
            super.onTrimMemory(i);
            AbstractC25061Kk.A00().A07(i);
            onLowMemory();
            if (Systrace.A0E(1L)) {
                C0fO.A00(171349744);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1339425305);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgFragmentActivity.onWindowFocusChanged", 302666338);
        }
        try {
            super.onWindowFocusChanged(z);
            if (Systrace.A0E(1L)) {
                C0fO.A01("ActivityListenerManager.activityWindowFocusChanged", -956123121);
            }
            try {
                Set set = AbstractC12860lY.A00;
                AbstractC12860lY.A0A(new C0PJ(this, set, z), "onActivityWindowFocusChanged", set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((InterfaceC12850lX) it.next()).Cv8(this, z);
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1375439509);
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-161502499);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-200841443);
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1184645724);
            }
            throw th2;
        }
    }

    public void schedule(C11R c11r) {
        if (c11r != null) {
            C1GJ.A00(this, AbstractC018607g.A00(this), c11r);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void setDefaultNightMode(int i) {
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD.E7D("dark_mode_toggle_setting", i);
        ARD.E7D("dark_mode_toggle_override_previous_value", i);
        ARD.apply();
        int i2 = AbstractC51982Zy.A00;
        AbstractC51982Zy.A01(i);
        if (i == -1) {
            int i3 = 1;
            if (C1H6.A00().getInt("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", -1) == 32) {
                i3 = 2;
            }
            if (i2 != i3) {
                recreate();
            }
        }
    }

    private final boolean isAttributionTouchListenerEnabled() {
        return C18U.A06(C06090Tz.A05, getSession(), 36324896359330382L);
    }

    private final boolean shouldRedirectBackPressForColdStart() {
        if (!C18U.A06(C06090Tz.A05, getSession(), 36322980804832050L) || getIntent() == null || this.mFragments.A00.A03.A0L() > 0 || !isTaskRoot() || !canRedirectBackPressToFeedForColdStart() || getSession() == null) {
            return false;
        }
        return true;
    }

    public void configureBackgroundColorAndroid15() {
        int color = getColor(AbstractC53242c7.A0D(this));
        AbstractC56402iY.A02(this, color);
        getWindow().getDecorView().setBackgroundColor(color);
    }

    public View getBottomSheetRootView() {
        View decorView = getWindow().getDecorView();
        C14360o3.A07(decorView);
        return decorView;
    }

    public final C106904rr getInteractionLogger() {
        AbstractC18680vv session = getSession();
        if (session != null) {
            return C106904rr.A00(session);
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int A00 = C0f9.A00(1870482225);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = IgFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onDestroy");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onDestroy", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 953750011);
                }
                try {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("IgFragmentActivity.onDestroy", -1003582970);
                    }
                    try {
                        super.onDestroy();
                        if (getSession() != null) {
                            this.mBottomSheetNavigator = null;
                        }
                        this.onActivityResultListenerMap.clear();
                        AbstractC12860lY.A02(this);
                        AbstractC74033Tu.A00(this);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(644522438);
                        }
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-2043815933);
                        }
                        c006802i.markerEnd(694558626, A03, (short) 2);
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-744764059);
                        }
                        C0f9.A07(421754636, A00);
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1981411846);
                    }
                    C0f9.A07(-287244253, A00);
                    throw th2;
                }
            } finally {
            }
        } else {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgFragmentActivity.onDestroy", 2098005094);
            }
            try {
                super.onDestroy();
                if (getSession() != null) {
                    this.mBottomSheetNavigator = null;
                }
                this.onActivityResultListenerMap.clear();
                AbstractC12860lY.A02(this);
                AbstractC74033Tu.A00(this);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1251128009);
                }
            } catch (Throwable th3) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(928663132);
                }
                C0f9.A07(-1384788485, A00);
                throw th3;
            }
        }
        C0f9.A07(454229144, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = C0f9.A00(-2087975887);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = IgFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onPause");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onPause", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1183625969);
                }
                try {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("IgFragmentActivity.onPause", -1833696191);
                    }
                    try {
                        super.onPause();
                        AbstractC12860lY.A03(this);
                        if (getSession() != null && C3K8.A00(getSession())) {
                            WeakReference weakReference = C3K9.A00;
                            C3K9.A00 = new WeakReference(null);
                        }
                        C53252c9 c53252c9 = this.trLogger;
                        if (c53252c9 != null) {
                            c53252c9.A01();
                        }
                        C1KM.A09.A0B();
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(528205332);
                        }
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-638365646);
                        }
                        c006802i.markerEnd(694558626, A03, (short) 2);
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-323269873);
                        }
                        C0f9.A07(-234322666, A00);
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-975544022);
                    }
                    C0f9.A07(-1260921241, A00);
                    throw th2;
                }
            } finally {
            }
        } else {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgFragmentActivity.onPause", -15417943);
            }
            try {
                super.onPause();
                AbstractC12860lY.A03(this);
                if (getSession() != null && C3K8.A00(getSession())) {
                    WeakReference weakReference2 = C3K9.A00;
                    C3K9.A00 = new WeakReference(null);
                }
                C53252c9 c53252c92 = this.trLogger;
                if (c53252c92 != null) {
                    c53252c92.A01();
                }
                C1KM.A09.A0B();
                if (Systrace.A0E(1L)) {
                    C0fO.A00(2052277847);
                }
            } catch (Throwable th3) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1241994653);
                }
                C0f9.A07(-1089027443, A00);
                throw th3;
            }
        }
        C0f9.A07(336780431, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = C0f9.A00(1127377374);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = IgFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onResume");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onResume", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1456481113);
                }
                try {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("IgFragmentActivity.onResume", 1594214439);
                    }
                    try {
                        super.onResume();
                        AbstractC12860lY.A04(this);
                        executePendingActions();
                        if (getSession() != null && C3K8.A00(getSession())) {
                            WeakReference weakReference = C3K9.A00;
                            C3K9.A00 = new WeakReference(this);
                        }
                        C53252c9 c53252c9 = this.trLogger;
                        if (c53252c9 != null) {
                            c53252c9.A02();
                        }
                        configureWindowInsetsAndroid15();
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(1733459963);
                        }
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(591409870);
                        }
                        c006802i.markerEnd(694558626, A03, (short) 2);
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(933927512);
                        }
                        C0f9.A07(1266295207, A00);
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1837197241);
                    }
                    C0f9.A07(1031856156, A00);
                    throw th2;
                }
            } finally {
            }
        } else {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgFragmentActivity.onResume", -569703215);
            }
            try {
                super.onResume();
                AbstractC12860lY.A04(this);
                executePendingActions();
                if (getSession() != null && C3K8.A00(getSession())) {
                    WeakReference weakReference2 = C3K9.A00;
                    C3K9.A00 = new WeakReference(this);
                }
                C53252c9 c53252c92 = this.trLogger;
                if (c53252c92 != null) {
                    c53252c92.A02();
                }
                configureWindowInsetsAndroid15();
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-545285990);
                }
            } catch (Throwable th3) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(326332581);
                }
                C0f9.A07(896821635, A00);
                throw th3;
            }
        }
        C0f9.A07(1003786484, A00);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = C0f9.A00(-1316889764);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = IgFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onStart");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onStart", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1688449042);
                }
                try {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("IgFragmentActivity.onStart", -1614079066);
                    }
                    try {
                        super.onStart();
                        AbstractC12860lY.A05(this);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(1099751003);
                        }
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-116549452);
                        }
                        c006802i.markerEnd(694558626, A03, (short) 2);
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(688261050);
                        }
                        C0f9.A07(-1347926943, A00);
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1879479402);
                    }
                    C0f9.A07(1872510837, A00);
                    throw th2;
                }
            } finally {
            }
        } else {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgFragmentActivity.onStart", 223567766);
            }
            try {
                super.onStart();
                AbstractC12860lY.A05(this);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1417217833);
                }
            } catch (Throwable th3) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1609061791);
                }
                C0f9.A07(-2143557386, A00);
                throw th3;
            }
        }
        C0f9.A07(1643503015, A00);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = C0f9.A00(-1827184599);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = IgFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onStop");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onStop", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 193248112);
                }
                try {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("IgFragmentActivity.onStop", -1374353684);
                    }
                    try {
                        super.onStop();
                        AbstractC12860lY.A06(this);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-1270081487);
                        }
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-1450843930);
                        }
                        c006802i.markerEnd(694558626, A03, (short) 2);
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(393023406);
                        }
                        C0f9.A07(-2086048164, A00);
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-685922095);
                    }
                    C0f9.A07(1137271518, A00);
                    throw th2;
                }
            } finally {
            }
        } else {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgFragmentActivity.onStop", -443684979);
            }
            try {
                super.onStop();
                AbstractC12860lY.A06(this);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(708492557);
                }
            } catch (Throwable th3) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1571730667);
                }
                C0f9.A07(1192150004, A00);
                throw th3;
            }
        }
        C0f9.A07(-69241415, A00);
    }

    public final void onUpPressed() {
        onBackPressed();
    }

    public final void setupColorTheme() {
        getTheme().applyStyle(AbstractC53172bz.A00(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean handleVolumeKey(int i, KeyEvent keyEvent, List list) {
        boolean handleVolumeKey;
        EnumC37329GcX enumC37329GcX;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment instanceof InterfaceC60022ok) {
                InterfaceC60022ok interfaceC60022ok = (InterfaceC60022ok) fragment;
                if (i == 25) {
                    enumC37329GcX = EnumC37329GcX.A02;
                } else {
                    enumC37329GcX = EnumC37329GcX.A03;
                }
                handleVolumeKey = interfaceC60022ok.onVolumeKeyPressed(enumC37329GcX, keyEvent);
            } else {
                List A04 = fragment.getChildFragmentManager().A0U.A04();
                C14360o3.A07(A04);
                handleVolumeKey = handleVolumeKey(i, keyEvent, A04);
            }
            if (handleVolumeKey) {
                return true;
            }
        }
        return false;
    }
}
