package com.facebook.react.modules.appearance;

import X.AbstractC51982Zy;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C62158S0f;
import X.InterfaceC65220TgB;
import X.R3M;
import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = "Appearance")
/* loaded from: classes10.dex */
public final class AppearanceModule extends NativeAppearanceSpec {
    public static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final C62158S0f Companion = new Object();
    public static final String NAME = "Appearance";
    public String lastEmittedColorScheme;
    public final InterfaceC65220TgB overrideColorScheme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(R3M r3m, InterfaceC65220TgB interfaceC65220TgB) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
        this.overrideColorScheme = interfaceC65220TgB;
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String str) {
    }

    public final void onConfigurationChanged(Context context) {
        C14360o3.A0B(context, 0);
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (!C14360o3.A0K(this.lastEmittedColorScheme, colorSchemeForCurrentConfiguration)) {
            this.lastEmittedColorScheme = colorSchemeForCurrentConfiguration;
            emitAppearanceChanged(colorSchemeForCurrentConfiguration);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(String str) {
        int i;
        C14360o3.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1626174665) {
            if (hashCode != 3075958) {
                if (hashCode == 102970646 && str.equals("light")) {
                    i = 1;
                } else {
                    return;
                }
            } else if (!str.equals("dark")) {
                return;
            } else {
                i = 2;
            }
        } else if (!str.equals("unspecified")) {
            return;
        } else {
            i = -1;
        }
        AbstractC51982Zy.A01(i);
    }

    public final void emitAppearanceChanged(String str) {
        C14360o3.A0B(str, 0);
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString("colorScheme", str);
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E(APPEARANCE_CHANGED_EVENT_NAME, A0c);
        }
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        int i = AbstractC58319PtB.A08(context).uiMode & 48;
        if (i == 16 || i != 32) {
            return "light";
        }
        return "dark";
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        Context A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 == null) {
            A01 = AbstractC58321PtD.A0b(this);
        }
        Context context = A01;
        C14360o3.A0A(context);
        return colorSchemeForCurrentConfiguration(context);
    }

    public /* synthetic */ AppearanceModule(R3M r3m, InterfaceC65220TgB interfaceC65220TgB, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3m, (i & 2) != 0 ? null : interfaceC65220TgB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(R3M r3m) {
        this(r3m, null);
        C14360o3.A0B(r3m, 1);
    }
}
