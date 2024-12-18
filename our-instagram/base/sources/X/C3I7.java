package X;

import android.view.View;

/* renamed from: X.3I7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3I7 {
    public static C159467Dh A00(View view) {
        return new C159467Dh(view);
    }

    public static C3I8 A01(Object obj, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(obj.getClass().getSimpleName());
        if (obj instanceof InterfaceC11380iw) {
            try {
                String moduleName = ((InterfaceC11380iw) obj).getModuleName();
                sb.append(".");
                sb.append(moduleName);
            } catch (RuntimeException e) {
                C0K8.A07(C3I7.class, "Caught exception when getting analytics module", e, new Object[0]);
            }
        }
        if (z) {
            sb.append(".cache");
        }
        return new C3I8(sb.toString(), z2);
    }
}
