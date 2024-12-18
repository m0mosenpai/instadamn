package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14650od {
    public static final C14640oc A02 = new Object();
    public static volatile C14650od A03;
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public static final UserSession A00(C14650od c14650od) {
        return c14650od.A00;
    }

    public C14650od(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new C0NW(userSession));
    }
}
