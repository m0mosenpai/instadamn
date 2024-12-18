package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8c4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190468c4 {
    public static final InterfaceC190488c6 A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        return new U20(interfaceC11380iw, userSession, null, str, null, null, null);
    }

    public static final InterfaceC190488c6 A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        Object obj;
        C14360o3.A0B(userSession, 2);
        if (z) {
            obj = new U20(interfaceC11380iw, userSession, null, str, null, null, null);
        } else {
            obj = new Object();
        }
        return (InterfaceC190488c6) obj;
    }
}
