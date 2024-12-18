package com.facebook.react.modules.intent;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AbstractC63123SdR;
import X.AnonymousClass001;
import X.InterfaceC65542TmH;
import X.InterfaceC65622ToD;
import X.R3M;
import X.T07;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.List;

@ReactModule(name = NativeIntentAndroidSpec.NAME)
/* loaded from: classes10.dex */
public class IntentModule extends NativeIntentAndroidSpec {
    public static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    public InterfaceC65542TmH mInitialURLListener;
    public final List mPendingOpenURLPromises;

    private synchronized void waitForActivityAndGetInitialURL(InterfaceC65622ToD interfaceC65622ToD) {
        this.mPendingOpenURLPromises.add(interfaceC65622ToD);
        if (this.mInitialURLListener == null) {
            this.mInitialURLListener = new T07(this);
            AbstractC58321PtD.A0b(this).A0A(this.mInitialURLListener);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        synchronized (this) {
            this.mPendingOpenURLPromises.clear();
            if (this.mInitialURLListener != null) {
                AbstractC58321PtD.A0b(this).A0B(this.mInitialURLListener);
                this.mInitialURLListener = null;
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String str, InterfaceC65622ToD interfaceC65622ToD) {
        if (str != null && !str.isEmpty()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                interfaceC65622ToD.resolve(Boolean.valueOf(AbstractC167007dF.A1W(intent.resolveActivity(AbstractC58321PtD.A0b(this).getPackageManager()))));
                return;
            } catch (Exception e) {
                InterfaceC65622ToD.A00(interfaceC65622ToD, "Could not check if URL '", str, "' can be opened: ", e);
                return;
            }
        }
        InterfaceC65622ToD.A01("Invalid URL: ", str, interfaceC65622ToD);
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String str, InterfaceC65622ToD interfaceC65622ToD) {
        if (str != null && !str.isEmpty()) {
            try {
                sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), AbstractC166997dE.A0a());
                interfaceC65622ToD.resolve(AbstractC166997dE.A0b());
                return;
            } catch (Exception e) {
                InterfaceC65622ToD.A00(interfaceC65622ToD, "Could not open URL '", str, "': ", e);
                return;
            }
        }
        InterfaceC65622ToD.A01("Invalid URL: ", str, interfaceC65622ToD);
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String str, ReadableArray readableArray, InterfaceC65622ToD interfaceC65622ToD) {
        if (str != null && !str.isEmpty()) {
            Intent A0E = AbstractC58318PtA.A0E(str);
            if (A0E.resolveActivity(AbstractC58321PtD.A0b(this).getPackageManager()) == null) {
                interfaceC65622ToD.reject(new RuntimeException(AnonymousClass001.A0g("Could not launch Intent with action ", str, ".")));
                return;
            }
            if (readableArray != null) {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string = map.getString("key");
                    int ordinal = map.getType(EXTRA_MAP_KEY_FOR_VALUE).ordinal();
                    if (ordinal != 3) {
                        if (ordinal != 2) {
                            if (ordinal != 1) {
                                interfaceC65622ToD.reject(new RuntimeException(AnonymousClass001.A0g("Extra type for ", string, " not supported.")));
                                return;
                            }
                            A0E.putExtra(string, map.getBoolean(EXTRA_MAP_KEY_FOR_VALUE));
                        } else {
                            A0E.putExtra(string, Double.valueOf(map.getDouble(EXTRA_MAP_KEY_FOR_VALUE)));
                        }
                    } else {
                        A0E.putExtra(string, map.getString(EXTRA_MAP_KEY_FOR_VALUE));
                    }
                }
            }
            sendOSIntent(A0E, true);
            return;
        }
        interfaceC65622ToD.reject(new RuntimeException(AnonymousClass001.A0g("Invalid Action: ", str, ".")));
    }

    public IntentModule(R3M r3m) {
        super(r3m);
        this.mInitialURLListener = null;
        this.mPendingOpenURLPromises = AbstractC166987dD.A1E();
    }

    private void sendOSIntent(Intent intent, Boolean bool) {
        String str;
        Context A01 = AbstractC58321PtD.A0b(this).A01();
        R3M r3m = this.mReactApplicationContext;
        AbstractC05810Sj.A01(r3m, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        String packageName = r3m.getPackageName();
        R3M r3m2 = this.mReactApplicationContext;
        AbstractC05810Sj.A01(r3m2, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        ComponentName resolveActivity = intent.resolveActivity(r3m2.getPackageManager());
        if (resolveActivity != null) {
            str = resolveActivity.getPackageName();
        } else {
            str = "";
        }
        if (bool.booleanValue() || A01 == null || !packageName.equals(str)) {
            intent.addFlags(268435456);
            if (A01 == null) {
                A01 = this.mReactApplicationContext;
                AbstractC05810Sj.A01(A01, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            }
        }
        A01.startActivity(intent);
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(InterfaceC65622ToD interfaceC65622ToD) {
        try {
            Activity A01 = AbstractC58321PtD.A0b(this).A01();
            if (A01 == null) {
                waitForActivityAndGetInitialURL(interfaceC65622ToD);
                return;
            }
            Intent intent = A01.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            String str = null;
            if (data != null && ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
                str = data.toString();
            }
            interfaceC65622ToD.resolve(str);
        } catch (Exception e) {
            InterfaceC65622ToD.A01("Could not get the initial URL : ", e.getMessage(), interfaceC65622ToD);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(InterfaceC65622ToD interfaceC65622ToD) {
        try {
            Intent A04 = AbstractC31171DnF.A04();
            Activity A01 = AbstractC58321PtD.A0b(this).A01();
            String packageName = AbstractC58321PtD.A0b(this).getPackageName();
            A04.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            A04.addCategory("android.intent.category.DEFAULT");
            A04.setData(Uri.parse(AnonymousClass001.A0R(AbstractC43591JPw.A00(88), packageName)));
            A04.addFlags(268435456);
            A04.addFlags(AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            A04.addFlags(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
            A01.startActivity(A04);
            interfaceC65622ToD.resolve(AbstractC166997dE.A0b());
        } catch (Exception e) {
            InterfaceC65622ToD.A01("Could not open the Settings: ", e.getMessage(), interfaceC65622ToD);
        }
    }
}
