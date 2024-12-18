package X;

import android.os.Bundle;
import com.bloks.foa.core.lifecycles.impl.NativeLifecycleCallback$NativeCallback;

/* renamed from: X.U6t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66274U6t {
    public static final InterfaceC71942XBr A00(Bundle bundle, String str) {
        Integer num;
        InterfaceC71942XBr interfaceC71942XBr;
        String str2;
        String str3;
        String string = bundle.getString(AnonymousClass001.A0R("CALLBACK_TYPE_PREFIX_", str));
        if (string == null) {
            return null;
        }
        if (string.equals("BLOKS")) {
            num = C05F.A00;
        } else if (string.equals("NATIVE")) {
            num = C05F.A01;
        } else {
            throw new IllegalArgumentException(string);
        }
        if (num.intValue() != 0) {
            NativeLifecycleCallback$NativeCallback nativeLifecycleCallback$NativeCallback = (NativeLifecycleCallback$NativeCallback) bundle.getParcelable(str);
            interfaceC71942XBr = null;
            if (nativeLifecycleCallback$NativeCallback != null) {
                interfaceC71942XBr = new WTS(nativeLifecycleCallback$NativeCallback);
            } else {
                str2 = "NativeLifecycleCallback";
                str3 = "Retrieved a null NativeCallback from the Bundle.";
                AbstractC25241Le.A02(str2, str3);
            }
        } else {
            C66246U5q c66246U5q = (C66246U5q) AbstractC66261U6f.A02(C66246U5q.class, Integer.valueOf(bundle.getInt(str, -1)));
            interfaceC71942XBr = null;
            if (c66246U5q != null) {
                interfaceC71942XBr = new WTR(c66246U5q);
            } else {
                str2 = "BloksLifecycleCallback";
                str3 = "Retrieved a null ActionParseResult from the Bundle.";
                AbstractC25241Le.A02(str2, str3);
            }
        }
        return interfaceC71942XBr;
    }

    public static final void A01(Bundle bundle, InterfaceC71942XBr interfaceC71942XBr, String str) {
        String str2;
        if (interfaceC71942XBr != null) {
            interfaceC71942XBr.EqA(str, bundle);
            String A0R = AnonymousClass001.A0R("CALLBACK_TYPE_PREFIX_", str);
            if (interfaceC71942XBr.CBp().intValue() != 0) {
                str2 = "NATIVE";
            } else {
                str2 = "BLOKS";
            }
            bundle.putString(A0R, str2);
        }
    }
}
