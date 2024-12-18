package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class Q59 extends FrameLayout implements XC4, InterfaceC65543TmI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bundle A04;
    public C63343Shy A05;
    public InterfaceC65212Tg2 A06;
    public C63362SiL A07;
    public SZ4 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public ViewTreeObserverOnGlobalLayoutListenerC63516Soj A0H;
    public final AtomicInteger A0I;
    public final C63139Sdk A0J;

    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        A04(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        A04(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    public void setIsFabric(boolean z) {
        this.A02 = z ? 2 : 1;
    }

    public static void A00(Q59 q59) {
        int i;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "attachToReactInstanceManager", 1670810863);
        ReactMarker.logMarker(RhX.A1e);
        if (q59.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new R3C(AnonymousClass001.A0c("Trying to attach a ReactRootView with an explicit id already set to [", "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID.", q59.getId())));
        }
        try {
            if (q59.A0A) {
                ReactMarker.logMarker(RhX.A1d);
                i = -1139695845;
            } else {
                q59.A0A = true;
                C63343Shy c63343Shy = q59.A05;
                AbstractC05810Sj.A00(c63343Shy);
                java.util.Set set = c63343Shy.A0F;
                synchronized (set) {
                    if (set.add(q59)) {
                        q59.A0I.compareAndSet(1, 0);
                        q59.removeAllViews();
                        q59.setId(-1);
                    } else {
                        C0I2.A03("ReactNative", "ReactRoot was attached multiple times");
                    }
                    Q21 A04 = c63343Shy.A04();
                    if (c63343Shy.A0J == null && A04 != null) {
                        C63343Shy.A02(c63343Shy, q59);
                    }
                }
                q59.getViewTreeObserver().addOnGlobalLayoutListener(q59.getCustomGlobalLayoutListener());
                ReactMarker.logMarker(RhX.A1d);
                i = 1145732479;
            }
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i);
        } catch (Throwable th) {
            ReactMarker.logMarker(RhX.A1d);
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1232167866);
            throw th;
        }
    }

    private void A01(boolean z, int i, int i2) {
        InterfaceC65589TnT A03;
        int i3;
        int i4;
        ReactMarker.logMarker(RhX.A1i);
        if (!AbstractC167007dF.A1W(this.A05)) {
            ReactMarker.logMarker(RhX.A1h);
            C0I2.A04("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean A1P = AbstractC167007dF.A1P(this.A02, 2);
        if (!A1P || ((i4 = this.A01) != 0 && i4 != -1)) {
            Q21 currentReactContext = getCurrentReactContext();
            if (currentReactContext != null && (A03 = UIManagerHelper.A03(currentReactContext, this.A02, true)) != null) {
                int i5 = 0;
                if (A1P) {
                    getLocationInWindow(r4);
                    Rect A0U = AbstractC166987dD.A0U();
                    getWindowVisibleDisplayFrame(A0U);
                    int i6 = r4[1] - A0U.top;
                    int[] iArr = {iArr[0] - A0U.left, i6};
                    Point point = new Point(iArr[0], i6);
                    i5 = point.x;
                    i3 = point.y;
                } else {
                    i3 = 0;
                }
                if (z || i5 != this.A0E || i3 != this.A0F) {
                    A03.updateRootLayoutSpecs(this.A01, i, i2, i5, i3);
                }
                this.A0E = i5;
                this.A0F = i3;
            }
            ReactMarker.logMarker(RhX.A1h);
            return;
        }
        ReactMarker.logMarker(RhX.A1h);
        C0I2.A03("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
    }

    private ViewTreeObserverOnGlobalLayoutListenerC63516Soj getCustomGlobalLayoutListener() {
        ViewTreeObserverOnGlobalLayoutListenerC63516Soj viewTreeObserverOnGlobalLayoutListenerC63516Soj = this.A0H;
        if (viewTreeObserverOnGlobalLayoutListenerC63516Soj == null) {
            ViewTreeObserverOnGlobalLayoutListenerC63516Soj viewTreeObserverOnGlobalLayoutListenerC63516Soj2 = new ViewTreeObserverOnGlobalLayoutListenerC63516Soj(this);
            this.A0H = viewTreeObserverOnGlobalLayoutListenerC63516Soj2;
            return viewTreeObserverOnGlobalLayoutListenerC63516Soj2;
        }
        return viewTreeObserverOnGlobalLayoutListenerC63516Soj;
    }

    public final boolean A05() {
        C63343Shy c63343Shy = this.A05;
        if (c63343Shy != null && c63343Shy.A04() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65543TmI
    public final void ELE() {
        int i;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactRootView.runApplication", 1856187450);
        try {
            if (this.A05 != null && this.A0A) {
                Q21 currentReactContext = getCurrentReactContext();
                if (currentReactContext != null) {
                    CatalystInstance A02 = currentReactContext.A02();
                    String str = this.A09;
                    AbstractC05810Sj.A00(str);
                    if (this.A0C) {
                        A01(true, this.A03, this.A00);
                    }
                    WritableNativeMap A0c = AbstractC58321PtD.A0c();
                    A0c.putDouble("rootTag", this.A01);
                    Bundle bundle = this.A04;
                    if (bundle != null) {
                        A0c.putMap("initialProps", Arguments.fromBundle(bundle));
                    }
                    this.A0B = true;
                    ((AppRegistry) A02.getJSModule(AppRegistry.class)).runApplication(str, A0c);
                    i = -1644419456;
                } else {
                    i = -547709653;
                }
            } else {
                i = -239979251;
            }
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i);
        } catch (Throwable th) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1731826109);
            throw th;
        }
    }

    public final void finalize() {
        AbstractC05810Sj.A03(!this.A0A, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public Bundle getAppProperties() {
        return this.A04;
    }

    public Q21 getCurrentReactContext() {
        C63343Shy c63343Shy = this.A05;
        if (c63343Shy == null) {
            return null;
        }
        return c63343Shy.A04();
    }

    public int getHeightMeasureSpec() {
        return this.A00;
    }

    @Override // X.InterfaceC65543TmI
    public String getJSModuleName() {
        String str = this.A09;
        AbstractC05810Sj.A00(str);
        return str;
    }

    public C63343Shy getReactInstanceManager() {
        return this.A05;
    }

    public int getRootViewTag() {
        return this.A01;
    }

    public AtomicInteger getState() {
        return this.A0I;
    }

    @Override // X.InterfaceC65543TmI
    public String getSurfaceID() {
        Bundle bundle = this.A04;
        if (bundle != null) {
            return bundle.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.A02;
    }

    public int getWidthMeasureSpec() {
        return this.A03;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A0C && this.A02 == 2) {
            A01(false, this.A03, this.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r13 != r11.A00) goto L7;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r1 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r3 = "ReactRootView.onMeasure"
            r0 = -970344232(0xffffffffc629b8d8, float:-10862.211)
            X.C0fY.A01(r1, r3, r0)
            X.RhX r0 = X.RhX.A1g
            com.facebook.react.bridge.ReactMarker.logMarker(r0)
            int r0 = r11.A03     // Catch: java.lang.Throwable -> Lb9
            r8 = 0
            r4 = 1
            if (r12 != r0) goto L1a
            int r0 = r11.A00     // Catch: java.lang.Throwable -> Lb9
            r10 = 0
            if (r13 == r0) goto L1b
        L1a:
            r10 = 1
        L1b:
            r11.A03 = r12     // Catch: java.lang.Throwable -> Lb9
            r11.A00 = r13     // Catch: java.lang.Throwable -> Lb9
            int r0 = android.view.View.MeasureSpec.getMode(r12)     // Catch: java.lang.Throwable -> Lb9
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r7) goto L2a
            if (r0 == 0) goto L2a
            goto L50
        L2a:
            r5 = 0
            r9 = 0
        L2c:
            int r0 = r11.getChildCount()     // Catch: java.lang.Throwable -> Lb9
            if (r9 >= r0) goto L54
            android.view.View r6 = r11.getChildAt(r9)     // Catch: java.lang.Throwable -> Lb9
            int r3 = r6.getLeft()     // Catch: java.lang.Throwable -> Lb9
            int r0 = r6.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + r0
            int r0 = r6.getPaddingLeft()     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + r0
            int r0 = r6.getPaddingRight()     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + r0
            int r5 = java.lang.Math.max(r5, r3)     // Catch: java.lang.Throwable -> Lb9
            int r9 = r9 + 1
            goto L2c
        L50:
            int r5 = android.view.View.MeasureSpec.getSize(r12)     // Catch: java.lang.Throwable -> Lb9
        L54:
            int r0 = android.view.View.MeasureSpec.getMode(r13)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == r7) goto L5d
            if (r0 == 0) goto L5d
            goto L82
        L5d:
            r6 = 0
        L5e:
            int r0 = r11.getChildCount()     // Catch: java.lang.Throwable -> Lb9
            if (r8 >= r0) goto L86
            android.view.View r7 = r11.getChildAt(r8)     // Catch: java.lang.Throwable -> Lb9
            int r3 = r7.getTop()     // Catch: java.lang.Throwable -> Lb9
            int r0 = r7.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + r0
            int r0 = r7.getPaddingTop()     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + r0
            int r0 = r7.getPaddingBottom()     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + r0
            int r6 = java.lang.Math.max(r6, r3)     // Catch: java.lang.Throwable -> Lb9
            int r8 = r8 + 1
            goto L5e
        L82:
            int r6 = android.view.View.MeasureSpec.getSize(r13)     // Catch: java.lang.Throwable -> Lb9
        L86:
            r11.setMeasuredDimension(r5, r6)     // Catch: java.lang.Throwable -> Lb9
            r11.A0C = r4     // Catch: java.lang.Throwable -> Lb9
            X.Shy r0 = r11.A05     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L9b
            boolean r0 = r11.A0A     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L9b
            A00(r11)     // Catch: java.lang.Throwable -> Lb9
        L96:
            r11.A0G = r5     // Catch: java.lang.Throwable -> Lb9
            r11.A0D = r6     // Catch: java.lang.Throwable -> Lb9
            goto Lad
        L9b:
            if (r10 != 0) goto La5
            int r0 = r11.A0G     // Catch: java.lang.Throwable -> Lb9
            if (r0 != r5) goto La5
            int r0 = r11.A0D     // Catch: java.lang.Throwable -> Lb9
            if (r0 == r6) goto L96
        La5:
            int r3 = r11.A03     // Catch: java.lang.Throwable -> Lb9
            int r0 = r11.A00     // Catch: java.lang.Throwable -> Lb9
            r11.A01(r4, r3, r0)     // Catch: java.lang.Throwable -> Lb9
            goto L96
        Lad:
            X.RhX r0 = X.RhX.A1f
            com.facebook.react.bridge.ReactMarker.logMarker(r0)
            r0 = 65784164(0x3ebc964, float:1.3858296E-36)
            X.C0fY.A00(r1, r0)
            return
        Lb9:
            r3 = move-exception
            X.RhX r0 = X.RhX.A1f
            com.facebook.react.bridge.ReactMarker.logMarker(r0)
            r0 = 1636178758(0x61861b46, float:3.0922862E20)
            X.C0fY.A00(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q59.onMeasure(int, int):void");
    }

    public void setAppProperties(Bundle bundle) {
        this.A04 = bundle;
        int i = this.A01;
        if (i != 0 && i != -1) {
            ELE();
        }
    }

    public Q59(Context context) {
        super(context);
        int i;
        this.A01 = 0;
        this.A0J = new C63139Sdk(this);
        this.A0C = false;
        this.A03 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A00 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A0G = 0;
        this.A0D = 0;
        this.A0E = Integer.MIN_VALUE;
        this.A0F = Integer.MIN_VALUE;
        this.A02 = 1;
        this.A0I = MSW.A1C(0);
        synchronized (C62313S6i.class) {
            i = C62313S6i.A00;
            C62313S6i.A00 = i + 10;
        }
        this.A01 = i;
        setClipChildren(false);
    }

    private boolean A02() {
        String str;
        if (A05() && this.A0A) {
            if (this.A08 == null) {
                str = "Unable to dispatch touch to JS before the dispatcher is available";
            } else if (ReactFeatureFlags.dispatchPointerEvents && this.A07 == null) {
                str = "Unable to dispatch pointer events to JS before the dispatcher is available";
            } else {
                return true;
            }
        } else {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        }
        C0I2.A04("ReactRootView", str);
        return false;
    }

    public final void A03(MotionEvent motionEvent) {
        String str;
        if (A05() && this.A0A) {
            if (this.A08 == null) {
                str = "Unable to dispatch touch to JS before the dispatcher is available";
            } else {
                X9J A04 = UIManagerHelper.A04(getCurrentReactContext(), this.A02);
                if (A04 == null) {
                    return;
                }
                this.A08.A01(motionEvent, getCurrentReactContext(), A04);
                return;
            }
        } else {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        }
        C0I2.A04("ReactRootView", str);
    }

    public final void A04(MotionEvent motionEvent, boolean z) {
        String str;
        if (A05() && this.A0A) {
            if (this.A07 == null) {
                if (ReactFeatureFlags.dispatchPointerEvents) {
                    str = "Unable to dispatch pointer events to JS before the dispatcher is available";
                } else {
                    return;
                }
            } else {
                X9J A04 = UIManagerHelper.A04(getCurrentReactContext(), this.A02);
                if (A04 == null) {
                    return;
                }
                this.A07.A05(motionEvent, A04, z);
                return;
            }
        } else {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        }
        C0I2.A04("ReactRootView", str);
    }

    @Override // X.XC4
    public final void D30(MotionEvent motionEvent, View view) {
        if (A02() && UIManagerHelper.A04(getCurrentReactContext(), this.A02) != null) {
            this.A08.A01 = false;
            C63362SiL c63362SiL = this.A07;
            if (c63362SiL != null) {
                c63362SiL.A00 = -1;
            }
        }
    }

    @Override // X.XC4
    public final void D35(MotionEvent motionEvent, View view) {
        X9J A04;
        if (A02() && (A04 = UIManagerHelper.A04(getCurrentReactContext(), this.A02)) != null) {
            SZ4 sz4 = this.A08;
            if (!sz4.A01) {
                SZ4.A00(motionEvent, sz4, A04);
                sz4.A01 = true;
                sz4.A00 = -1;
            }
            C63362SiL c63362SiL = this.A07;
            if (c63362SiL != null) {
                c63362SiL.A04(motionEvent, view, A04);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.R3C, java.lang.RuntimeException, java.lang.Exception] */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            if (A05()) {
                String message = e.getMessage();
                C14360o3.A0B(message, 1);
                ?? runtimeException = new RuntimeException(message, e);
                runtimeException.A00 = this;
                getCurrentReactContext().A0D(runtimeException);
                return;
            }
            throw AbstractC58318PtA.A0f(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (A05() && this.A0A) {
            C63139Sdk c63139Sdk = this.A0J;
            int keyCode = keyEvent.getKeyCode();
            int action = keyEvent.getAction();
            if (action == 1 || action == 0) {
                Map map = C63139Sdk.A02;
                Integer valueOf = Integer.valueOf(keyCode);
                if (map.containsKey(valueOf)) {
                    C63139Sdk.A00(c63139Sdk, AbstractC166987dD.A1A(valueOf, map), c63139Sdk.A00, action);
                }
            }
        } else {
            C0I2.A04("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1281753175);
        super.onAttachedToWindow();
        if (this.A0A) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
        C0f9.A0D(-1920771215, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-908014204);
        super.onDetachedFromWindow();
        if (this.A0A) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
        C0f9.A0D(-1908634875, A06);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2;
        int A06 = C0f9.A06(-148905419);
        if (A05() && this.A0A) {
            C63139Sdk c63139Sdk = this.A0J;
            int i3 = c63139Sdk.A00;
            if (i3 != -1) {
                C63139Sdk.A00(c63139Sdk, "blur", i3, -1);
            }
            c63139Sdk.A00 = -1;
            super.onFocusChanged(z, i, rect);
            i2 = -1587174816;
        } else {
            C0I2.A04("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
            i2 = 385704769;
        }
        C0f9.A0D(i2, A06);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        A03(motionEvent);
        A04(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(187891562);
        A03(motionEvent);
        A04(motionEvent, false);
        super.onTouchEvent(motionEvent);
        C0f9.A0C(-1058622229, A05);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.A0B) {
            this.A0B = false;
            String str = this.A09;
            AbstractC05810Sj.A00(str);
            ReactMarker.logMarker(RhX.A0B, str, this.A01);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (A05() && this.A0A) {
            C63139Sdk c63139Sdk = this.A0J;
            if (c63139Sdk.A00 != view2.getId()) {
                int i = c63139Sdk.A00;
                if (i != -1) {
                    C63139Sdk.A00(c63139Sdk, "blur", i, -1);
                }
                c63139Sdk.A00 = view2.getId();
                C63139Sdk.A00(c63139Sdk, "focus", view2.getId(), -1);
            }
        } else {
            C0I2.A04("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setEventListener(InterfaceC65212Tg2 interfaceC65212Tg2) {
        this.A06 = interfaceC65212Tg2;
    }

    public void setRootViewTag(int i) {
        this.A01 = i;
    }

    public void setShouldLogContentAppeared(boolean z) {
        this.A0B = z;
    }
}
