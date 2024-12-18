package com.facebook.fbreact.safearea;

import X.AbstractC008903d;
import X.AbstractC05810Sj;
import X.AbstractC58321PtD;
import X.C02I;
import X.C14360o3;
import X.C30193DRy;
import X.C61771RtR;
import X.C63594Sq1;
import X.InterfaceC65542TmH;
import X.R3M;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.fbreact.specs.NativeSafeAreaSpec;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "SafeArea")
/* loaded from: classes10.dex */
public final class ReactSafeArea extends NativeSafeAreaSpec implements InterfaceC65542TmH {
    public static final C61771RtR Companion = new Object();
    public static final String NAME = "SafeArea";
    public final boolean enableSafeArea;
    public final int insetsType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSafeArea(R3M r3m, boolean z) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
        this.enableSafeArea = z;
        this.insetsType = 135;
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (hasForcedEdgeToEdge(r0) != false) goto L25;
     */
    @Override // com.facebook.fbreact.specs.NativeSafeAreaSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC65657Tqj safeAreaInsets() {
        /*
            r12 = this;
            r3 = r12
            boolean r0 = r12.enableSafeArea
            if (r0 != 0) goto L12
            X.R3M r0 = X.AbstractC58321PtD.A0b(r12)
            X.C14360o3.A07(r0)
            boolean r0 = r12.hasForcedEdgeToEdge(r0)
            if (r0 == 0) goto L50
        L12:
            X.R3M r0 = r12.mReactApplicationContext
            java.lang.String r2 = "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one"
            X.AbstractC05810Sj.A01(r0, r2)
            android.app.Activity r0 = r0.A01()
            if (r0 == 0) goto L48
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L48
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L48
            r12.setWindowInsetsListener(r1)
            android.view.WindowInsets r0 = r1.getRootWindowInsets()
            if (r0 == 0) goto L48
            X.04d r0 = X.C011504d.A01(r1, r0)
            int r1 = r12.insetsType
            X.04b r0 = r0.A00
            X.02I r0 = r0.A05(r1)
            X.C14360o3.A07(r0)
            com.facebook.react.bridge.WritableNativeMap r0 = r12.toSafeAreaMap(r0)
            return r0
        L48:
            X.R3M r0 = r12.mReactApplicationContext
            X.AbstractC05810Sj.A01(r0, r2)
            r0.A0A(r12)
        L50:
            r4 = 0
            r6 = r4
            r8 = r4
            r10 = r4
            com.facebook.react.bridge.WritableNativeMap r0 = r3.createSafeAreaMap(r4, r6, r8, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbreact.safearea.ReactSafeArea.safeAreaInsets():X.Tqj");
    }

    @Override // com.facebook.fbreact.specs.NativeSafeAreaSpec
    public boolean setSupportsOrientationChange(boolean z) {
        return false;
    }

    public static /* synthetic */ WritableNativeMap createSafeAreaMap$default(ReactSafeArea reactSafeArea, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        if ((i & 2) != 0) {
            d2 = 0.0d;
        }
        if ((i & 4) != 0) {
            d3 = 0.0d;
        }
        if ((i & 8) != 0) {
            d4 = 0.0d;
        }
        return reactSafeArea.createSafeAreaMap(d, d2, d3, d4);
    }

    private final boolean hasForcedEdgeToEdge(Context context) {
        if (Build.VERSION.SDK_INT >= 35 && context.getApplicationInfo().targetSdkVersion >= 35) {
            return true;
        }
        return false;
    }

    private final void setWindowInsetsListener(View view) {
        AbstractC008903d.A00(view, new C63594Sq1(new C30193DRy(this, 22), 0));
    }

    public final WritableNativeMap toSafeAreaMap(C02I c02i) {
        return createSafeAreaMap(AbstractC58321PtD.A00(c02i.A03), AbstractC58321PtD.A00(c02i.A01), AbstractC58321PtD.A00(c02i.A00), AbstractC58321PtD.A00(c02i.A02));
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        Window window;
        View decorView;
        R3M r3m = this.mReactApplicationContext;
        AbstractC05810Sj.A01(r3m, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        Activity A01 = r3m.A01();
        if (A01 != null && (window = A01.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            setWindowInsetsListener(decorView);
            R3M r3m2 = this.mReactApplicationContext;
            AbstractC05810Sj.A01(r3m2, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            r3m2.A0B(this);
            decorView.requestApplyInsets();
        }
    }

    public static final /* synthetic */ WritableNativeMap access$toSafeAreaMap(ReactSafeArea reactSafeArea, C02I c02i) {
        return reactSafeArea.toSafeAreaMap(c02i);
    }

    private final WritableNativeMap createSafeAreaMap(double d, double d2, double d3, double d4) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putDouble("top", d);
        A0c.putDouble("left", d2);
        A0c.putDouble("bottom", d3);
        A0c.putDouble("right", d4);
        return A0c;
    }

    private final double pxToDp(int i) {
        return AbstractC58321PtD.A00(i);
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
        AbstractC58321PtD.A0b(this).A0B(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactSafeArea(R3M r3m) {
        this(r3m, false);
        C14360o3.A0B(r3m, 1);
    }
}
