package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153746vj {
    public final C153756vk A00;
    public final C57112jm A01;
    public final C38V A02;
    public final String A03;
    public final UserSession A04;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.38U, java.lang.Object] */
    public C153746vj(C153756vk c153756vk, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 3);
        this.A01 = c57112jm;
        this.A04 = userSession;
        this.A03 = str;
        this.A00 = c153756vk;
        this.A02 = new C38V(userSession, interfaceC60442pS, new Object());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C153746vj(UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str) {
        this(null, userSession, c57112jm, interfaceC60442pS, str);
        C14360o3.A0B(c57112jm, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        C14360o3.A0B(userSession, 3);
    }
}
