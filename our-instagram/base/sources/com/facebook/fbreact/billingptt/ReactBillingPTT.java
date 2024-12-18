package com.facebook.fbreact.billingptt;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C2FP;
import X.C61769RtP;
import X.C64191T3a;
import X.InterfaceC65622ToD;
import X.JQ0;
import X.R3M;
import X.SJ1;
import X.SZ5;
import X.T3W;
import X.TQZ;
import com.facebook.fbreact.specs.NativeBillingPTTSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ReactModule(name = "BillingPTT")
/* loaded from: classes10.dex */
public final class ReactBillingPTT extends NativeBillingPTTSpec {
    public static final C61769RtP Companion = new Object();
    public static final String NAME = "BillingPTT";

    @Override // com.facebook.fbreact.specs.NativeBillingPTTSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BillingPTT";
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.SEA, java.lang.Object] */
    @Override // com.facebook.fbreact.specs.NativeBillingPTTSpec
    public void getPTT(String str, ReadableMap readableMap, ReadableMap readableMap2, String str2, String str3, InterfaceC65622ToD interfaceC65622ToD) {
        String string;
        C14360o3.A0B(str, 0);
        JQ0.A1O(readableMap, readableMap2, str2, str3, interfaceC65622ToD);
        SZ5 A02 = C2FP.A04().A02(T3W.A00, new SJ1(str3, null, null, null, str2, null, null), C64191T3a.A00);
        HashMap A1G = AbstractC166987dD.A1G();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.CLQ()) {
            String Csu = keySetIterator.Csu();
            if (readableMap2.hasKey(Csu)) {
                string = readableMap2.getString(Csu);
            } else {
                string = readableMap.getString(Csu);
            }
            A1G.put(Csu, String.valueOf(string));
        }
        Set keySet = readableMap2.toHashMap().keySet();
        ?? obj = new Object();
        obj.A00 = A1G;
        obj.A01 = keySet;
        C2FP.A06().A00.A03.execute(new TQZ(interfaceC65622ToD, obj, A02, str));
    }

    public ReactBillingPTT(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeBillingPTTSpec
    public Map getTypedExportedConstants() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("version", 1);
        return A1G;
    }
}
