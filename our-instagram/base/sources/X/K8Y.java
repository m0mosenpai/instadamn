package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class K8Y extends AnonymousClass935 {
    public final /* synthetic */ AnonymousClass935 A00;
    public final /* synthetic */ C32251gB A01;
    public final /* synthetic */ C1g9 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8Y(AnonymousClass935 anonymousClass935, UserSession userSession, C32251gB c32251gB, C1g9 c1g9) {
        super(userSession);
        this.A01 = c32251gB;
        this.A00 = anonymousClass935;
        this.A02 = c1g9;
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1437448800);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(788562295, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1vN] */
    @Override // X.AnonymousClass935, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1011122463);
        int A032 = C0f9.A03(-2105591324);
        this.A00.onSuccess(obj);
        UserSession userSession = this.A01.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36326141900240557L)) {
            C25671My A00 = AbstractC25651Mw.A00(userSession);
            this.A02.C7Q();
            A00.E4s(new Object());
        }
        C0f9.A0A(-626033911, A032);
        C0f9.A0A(-1854917797, A03);
    }
}
