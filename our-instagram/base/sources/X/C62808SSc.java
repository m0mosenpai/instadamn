package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.SSc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62808SSc {
    public static final SK4 A00() {
        try {
            Object A0s = AbstractC58320PtC.A0s(Class.forName("com.instagram.contacts.ccu.impl.CCUServiceImpl"));
            C14360o3.A0C(A0s, "null cannot be cast to non-null type com.instagram.contacts.ccu.intf.CCUService");
            return (SK4) A0s;
        } catch (Throwable th) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to initialize CCUService");
            C14360o3.A0A(formatStrLocaleSafe);
            C0w9.A06("CCUService", formatStrLocaleSafe, th);
            return null;
        }
    }
}
