package com.facebook.react.modules.core;

import X.AbstractC43592JPx;
import X.C0I2;
import X.C14360o3;
import X.C62800SRu;
import X.C63089Scp;
import X.InterfaceC65655TqV;
import X.T0G;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;

@ReactModule(name = "ExceptionsManager")
/* loaded from: classes10.dex */
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    public final InterfaceC65655TqV devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsManagerModule(InterfaceC65655TqV interfaceC65655TqV) {
        super(null);
        C14360o3.A0B(interfaceC65655TqV, 1);
        this.devSupportManager = interfaceC65655TqV;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, com.facebook.react.common.JavascriptException, java.lang.RuntimeException] */
    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap readableMap) {
        boolean z;
        C14360o3.A0B(readableMap, 0);
        String string = readableMap.getString(DialogModule.KEY_MESSAGE);
        if (string == null) {
            string = "";
        }
        ReadableArray array = readableMap.getArray("stack");
        if (array == null) {
            array = new WritableNativeArray();
        }
        if (readableMap.hasKey("isFatal")) {
            z = readableMap.getBoolean("isFatal");
        } else {
            z = false;
        }
        String A00 = C62800SRu.A00(readableMap);
        String A002 = C63089Scp.A00(string, array);
        if (!z) {
            C0I2.A03("ReactNative", A002);
        } else {
            ?? runtimeException = new RuntimeException(A002);
            runtimeException.extraDataAsJson = A00;
            throw runtimeException;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        T0G t0g = new T0G();
        t0g.putString(DialogModule.KEY_MESSAGE, str);
        t0g.putArray("stack", readableArray);
        t0g.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (int) d);
        AbstractC43592JPx.A1W("isFatal", t0g.A00, true);
        reportException(t0g);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        T0G t0g = new T0G();
        t0g.putString(DialogModule.KEY_MESSAGE, str);
        t0g.putArray("stack", readableArray);
        t0g.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (int) d);
        AbstractC43592JPx.A1W("isFatal", t0g.A00, false);
        reportException(t0g);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
    }
}
