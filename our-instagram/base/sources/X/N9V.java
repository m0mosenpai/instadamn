package X;

/* loaded from: classes9.dex */
public final class N9V extends C1P1 {
    public final /* synthetic */ N7U A00;

    public N9V(N7U n7u) {
        this.A00 = n7u;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        boolean z;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1902225499);
        super.onFail(abstractC115105If);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
        if (interfaceC40821up != null) {
            z = "login_required".equals(interfaceC40821up.getErrorMessage());
        } else {
            z = false;
        }
        N7U n7u = this.A00;
        if (n7u.isResumed() && !z && n7u.getContext() != null) {
            AbstractC35254Fgn.A01(n7u.getContext());
        }
        C0f9.A0A(1338904579, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1163856806);
        N31 n31 = (N31) obj;
        int A0N = AbstractC167017dG.A0N(n31, 714701979);
        N7U n7u = this.A00;
        if (n7u.isResumed()) {
            C52191N8g c52191N8g = n7u.A01;
            if (c52191N8g == null) {
                C14360o3.A0F("loginHistoryAdapter");
                throw C00O.createAndThrow();
            }
            c52191N8g.A0C(n31);
        }
        C0f9.A0A(-607867247, A0N);
        C0f9.A0A(-427555063, A03);
    }
}
