package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GkM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37807GkM implements C5Jy {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C37807GkM(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    @Override // X.C5Jy
    public final /* bridge */ /* synthetic */ C208209Je AUa(Object obj, Object obj2, String str) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167017dG.A1O(c120985dq, str);
        String str2 = this.A01;
        String A06 = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(c120985dq.A02));
        UserSession userSession = this.A00;
        String A0S = AbstractC37303Gc4.A0S(c120985dq, userSession);
        String A04 = AbstractC82563mK.A04(userSession, c120985dq.A02);
        return new C208209Je(AbstractC37303Gc4.A0G(c120985dq), str2, A06, A0S, A04, AbstractC37564GgK.A02(c120985dq), str, C16930sl.A00, System.currentTimeMillis());
    }

    @Override // X.C5Jy
    public final /* bridge */ /* synthetic */ C9CQ AU0(Object obj, Object obj2) {
        return AbstractC37303Gc4.A05(obj);
    }
}
