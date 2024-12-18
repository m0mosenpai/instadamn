package X;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: X.5fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121885fg {
    public static final WindowManager A00;
    public static final InterfaceC09390do A01;

    static {
        Object obj;
        Context context = AbstractC12290kX.A00;
        WindowManager windowManager = null;
        if (context != null) {
            obj = context.getSystemService("window");
        } else {
            obj = null;
        }
        if (obj instanceof WindowManager) {
            windowManager = (WindowManager) obj;
        }
        A00 = windowManager;
        A01 = AbstractC09440dt.A00(EnumC09460dv.A02, C121895fh.A00);
    }
}
