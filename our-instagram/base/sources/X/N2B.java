package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N2B extends JQS {
    public final C69613Av A00;
    public final C69613Av A01;
    public final C69613Av A02;
    public final int A03;

    @Override // X.AbstractC69603Au
    public final int A01() {
        return this.A03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2B(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A03 = 31784967;
        this.A02 = A02("network");
        this.A01 = A02("list_render");
        this.A00 = A02("api_callback");
    }
}
