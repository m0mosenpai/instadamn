package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.SQq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62774SQq {
    public static WritableNativeMap A01(Throwable th) {
        C0I2.A06("ReactNative", th.getMessage(), th);
        return A00(th.getMessage());
    }

    public static WritableNativeMap A00(String str) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString(DialogModule.KEY_MESSAGE, str);
        return A0c;
    }
}
