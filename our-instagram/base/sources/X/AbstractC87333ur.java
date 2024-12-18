package X;

import android.os.Build;

/* renamed from: X.3ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87333ur {
    public static final boolean A00() {
        InterfaceC09390do interfaceC09390do;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            interfaceC09390do = AbstractC56872jL.A01;
        } else if (i == 33) {
            interfaceC09390do = AbstractC56872jL.A02;
        } else {
            return false;
        }
        if (((Boolean) interfaceC09390do.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}
