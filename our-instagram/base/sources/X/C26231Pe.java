package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26231Pe {
    public static final C26241Pf A01;
    public static final InterfaceC14020nS A02;
    public final InterfaceC09390do A00;

    static {
        String name = C26231Pe.class.getName();
        C14360o3.A07(name);
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = name;
        A02 = new C18240vB(A00);
        A01 = new C26241Pf(new ConcurrentHashMap());
    }

    public C26231Pe(UserSession userSession) {
        this.A00 = AbstractC09440dt.A01(new C206839Do(userSession, 11));
    }
}
