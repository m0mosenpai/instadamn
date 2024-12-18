package com.facebook.catalyst.modules.linking;

import X.AbstractC05810Sj;
import X.AbstractC08820cl;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C07980bI;
import X.C0Qa;
import X.C0b3;
import X.C61747Rt2;
import X.InterfaceC65622ToD;
import X.R3M;
import android.content.ContextWrapper;
import android.content.Intent;
import com.facebook.fbreact.specs.NativeFBLinkingAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "FBLinkingAndroid")
/* loaded from: classes10.dex */
public final class FBLinkingModule extends NativeFBLinkingAndroidSpec {
    public static final C61747Rt2 Companion = new Object();
    public static final String NAME = "FBLinkingAndroid";

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
    }

    public FBLinkingModule(R3M r3m) {
        super(r3m);
    }

    private final C07980bI scopeToIntentLauncher(String str) {
        C0Qa A09;
        switch (str.hashCode()) {
            case -1281860764:
                if (!str.equals("family")) {
                    return null;
                }
                return C0b3.A00().A05();
            case -969937473:
                if (!str.equals("thirdParty")) {
                    return null;
                }
                return C0b3.A00().A0A();
            case -354142814:
                if (!str.equals("accessibleByAnyApp")) {
                    return null;
                }
                return C0b3.A00().A03();
            case 570410685:
                if (!str.equals("internal")) {
                    return null;
                }
                return AbstractC58322PtE.A0Z();
            case 1864483865:
                if (!str.equals("sameKey")) {
                    return null;
                }
                C0b3 A00 = C0b3.A00();
                synchronized (A00) {
                    A09 = A00.A09();
                }
                return A09;
            default:
                return null;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFBLinkingAndroidSpec
    public void canOpenURL(String str, String str2, InterfaceC65622ToD interfaceC65622ToD) {
        AbstractC167027dH.A12(str, str2, interfaceC65622ToD);
        if (str.length() == 0) {
            InterfaceC65622ToD.A01("Invalid URL: ", str, interfaceC65622ToD);
            return;
        }
        C07980bI scopeToIntentLauncher = scopeToIntentLauncher(str2);
        if (scopeToIntentLauncher == null) {
            InterfaceC65622ToD.A01("Invalid scope: ", str2, interfaceC65622ToD);
            return;
        }
        try {
            Intent A0D = AbstractC58318PtA.A0D(AbstractC08820cl.A03(str).normalizeScheme());
            R3M r3m = this.mReactApplicationContext;
            AbstractC05810Sj.A01(r3m, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            ContextWrapper A01 = r3m.A01();
            if (A01 == null) {
                A01 = this.mReactApplicationContext;
                AbstractC05810Sj.A01(A01, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            }
            interfaceC65622ToD.resolve(Boolean.valueOf(AbstractC167007dF.A1W(C07980bI.A00(A01, A0D, scopeToIntentLauncher))));
        } catch (Throwable th) {
            InterfaceC65622ToD.A00(interfaceC65622ToD, "Could not check if URL '", str, "' can be opened: ", th);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFBLinkingAndroidSpec
    public void openURL(String str, String str2, InterfaceC65622ToD interfaceC65622ToD) {
        AbstractC167027dH.A12(str, str2, interfaceC65622ToD);
        if (str.length() == 0) {
            InterfaceC65622ToD.A01("Invalid URL: ", str, interfaceC65622ToD);
            return;
        }
        C07980bI scopeToIntentLauncher = scopeToIntentLauncher(str2);
        if (scopeToIntentLauncher == null) {
            InterfaceC65622ToD.A01("Invalid scope: ", str2, interfaceC65622ToD);
            return;
        }
        try {
            Intent A0D = AbstractC58318PtA.A0D(AbstractC08820cl.A03(str).normalizeScheme());
            R3M r3m = this.mReactApplicationContext;
            AbstractC05810Sj.A01(r3m, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            ContextWrapper A01 = r3m.A01();
            if (A01 == null) {
                A01 = this.mReactApplicationContext;
                AbstractC05810Sj.A01(A01, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            }
            boolean A0G = scopeToIntentLauncher.A0G(A01, A0D);
            if (A0G) {
                interfaceC65622ToD.resolve(Boolean.valueOf(A0G));
            } else {
                interfaceC65622ToD.reject(new RuntimeException(AnonymousClass001.A0S("Could not launch activity for '", str, '\'')));
            }
        } catch (Throwable th) {
            InterfaceC65622ToD.A00(interfaceC65622ToD, "Could not open URL '", str, "': ", th);
        }
    }
}
