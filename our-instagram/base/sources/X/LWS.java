package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LWS implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public LWS(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    public final void A00() {
        AbstractC25225BEi.A1U(this.A02, new C47590L0a((C125865mb) this.A01, (C125855ma) this.A03, ((C47576Kzm) this.A04).A01.userId));
    }

    public final void A01() {
        LJd lJd = (LJd) this.A04;
        ACD acd = lJd.A03;
        if (acd != null) {
            acd.A01(new JVY(12, lJd, this.A02, this.A01), 2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        boolean equals;
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 1:
            case 2:
            default:
                C14360o3.A0B(th, 0);
                String message = th.getMessage();
                if (message == null) {
                    equals = false;
                } else {
                    equals = message.equals("Unknown error executing GraphQL operation");
                }
                boolean z = !equals;
                C41151IJq c41151IJq = (C41151IJq) this.A02;
                if (z) {
                    ((C2JL) this.A01).onFailure(th);
                    UserSession userSession = (UserSession) this.A04;
                    InterfaceC38391qT interfaceC38391qT = (InterfaceC38391qT) this.A03;
                    FXM.A01(userSession, interfaceC38391qT, C57602kZ.A00(userSession).A0O(interfaceC38391qT));
                    C57602kZ.A00(userSession).A0N(c41151IJq, false);
                    return;
                }
                return;
            case 3:
                A00();
                return;
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 1:
            case 2:
            default:
                C57602kZ.A00((UserSession) this.A04).A0N((C41151IJq) this.A02, true);
                ((C2JL) this.A01).onSuccess(obj);
                return;
            case 3:
                A00();
                return;
        }
    }
}
