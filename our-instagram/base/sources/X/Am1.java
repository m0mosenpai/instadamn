package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class Am1 implements InterfaceC57997Pnh {
    public final /* synthetic */ C8JN A00;

    public Am1(C8JN c8jn) {
        this.A00 = c8jn;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(C54845OMq c54845OMq) {
        C14360o3.A0B(c54845OMq, 0);
        C8JN c8jn = this.A00;
        c54845OMq.A05(EnumC223469td.A0S);
        if (!c8jn.A09.A0Y()) {
            c54845OMq.A05(EnumC223469td.A0E);
            UserSession userSession = c8jn.A08;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A22;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 343)) {
                c54845OMq.A05(EnumC223469td.A0G);
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A22, c0yrArr, 343, true);
            }
        }
    }
}
