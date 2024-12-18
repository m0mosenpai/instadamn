package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.SRm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62792SRm {
    public static WritableNativeMap A00(String str, int i) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, i);
        if (str != null) {
            A0c.putString(DialogModule.KEY_MESSAGE, str);
        }
        A0c.putInt("PERMISSION_DENIED", 1);
        A0c.putInt("POSITION_UNAVAILABLE", 2);
        A0c.putInt("TIMEOUT", 3);
        return A0c;
    }
}
