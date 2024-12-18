package X;

import android.content.Context;

/* renamed from: X.LBc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47839LBc {
    public static String A00(Context context, AbstractC115105If abstractC115105If) {
        Object A00;
        if (abstractC115105If != null && (A00 = abstractC115105If.A00()) != null) {
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) A00;
            if (interfaceC40821up.getErrorMessage() != null) {
                return interfaceC40821up.getErrorMessage();
            }
        }
        return context.getString(2131972429);
    }

    public static String A01(String str) {
        String trim = str.trim();
        if (trim.length() > 0 && !trim.matches("^https?://.+")) {
            return AnonymousClass001.A0R("http://", trim);
        }
        return trim;
    }
}
