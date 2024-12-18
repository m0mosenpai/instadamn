package com.facebook.react.bridge;

import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.InterfaceC65622ToD;
import X.InterfaceC65657Tqj;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public class PromiseImpl implements InterfaceC65622ToD {
    public Callback mReject;
    public Callback mResolve;

    @Override // X.InterfaceC65622ToD
    public void reject(String str, String str2) {
        reject(str, str2, null, null);
    }

    @Override // X.InterfaceC65622ToD
    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            AbstractC58321PtD.A1K(callback, obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    public void reject(String str, String str2, Throwable th, InterfaceC65657Tqj interfaceC65657Tqj) {
        WritableNativeArray writableNativeArray;
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        if (str == null) {
            str = "EUNSPECIFIED";
        }
        A0c.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str);
        if (str2 == null) {
            if (th != null) {
                str2 = th.getMessage();
                if (str2 == null || str2.isEmpty()) {
                    str2 = AbstractC58319PtB.A0u(th);
                }
            } else {
                str2 = "Error not specified.";
            }
        }
        A0c.putString(DialogModule.KEY_MESSAGE, str2);
        A0c.putNull("userInfo");
        if (th != null) {
            A0c.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AbstractC58319PtB.A0u(th));
            StackTraceElement[] stackTrace = th.getStackTrace();
            writableNativeArray = new WritableNativeArray();
            for (int i = 0; i < stackTrace.length && i < 50; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                WritableNativeMap A0c2 = AbstractC58321PtD.A0c();
                A0c2.putString("class", stackTraceElement.getClassName());
                A0c2.putString("file", stackTraceElement.getFileName());
                A0c2.putInt("lineNumber", stackTraceElement.getLineNumber());
                A0c2.putString("methodName", stackTraceElement.getMethodName());
                writableNativeArray.pushMap(A0c2);
            }
        } else {
            writableNativeArray = new WritableNativeArray();
        }
        A0c.putArray("nativeStackAndroid", writableNativeArray);
        AbstractC58321PtD.A1K(this.mReject, A0c);
        this.mResolve = null;
        this.mReject = null;
    }

    @Override // X.InterfaceC65622ToD
    public void reject(Throwable th) {
        reject(null, null, th, null);
    }
}
