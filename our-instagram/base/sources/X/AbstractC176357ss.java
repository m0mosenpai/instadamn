package X;

import android.content.Context;

/* renamed from: X.7ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176357ss {
    public static InterfaceC176367st A00(Context context, boolean z) {
        InterfaceC176367st interfaceC176367st = InterfaceC176367st.A01;
        try {
            Class<?> cls = Class.forName("com.facebook.cameracore.camerasdk.optic.arcore.PreviewSetupDelegateImpl");
            Class cls2 = Boolean.TYPE;
            return (InterfaceC176367st) cls.getConstructor(Context.class, cls2, cls2).newInstance(context, false, Boolean.valueOf(z));
        } catch (Exception unused) {
            return interfaceC176367st;
        }
    }
}
