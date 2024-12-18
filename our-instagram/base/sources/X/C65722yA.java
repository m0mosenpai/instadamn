package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.2yA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65722yA {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final HashSet A03;
    public final HashSet A04;
    public final HashSet A05;

    public C65722yA(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A05 = new HashSet();
        this.A03 = new HashSet();
        this.A04 = new HashSet();
    }
}
