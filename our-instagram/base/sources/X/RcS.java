package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class RcS extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass253 A02;

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A02.A02;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        int i = this.A00;
        InterfaceC16530ry interfaceC16530ry = A00.A1G;
        C0YR[] c0yrArr = C23031Ai.A8c;
        interfaceC16530ry.Egi(A00, Integer.valueOf(i), c0yrArr[22]);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        long j = this.A01;
        A002.A1H.Egi(A002, Long.valueOf(j), c0yrArr[23]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcS(AnonymousClass253 anonymousClass253, int i, long j) {
        super(1793449280, 3, false, false);
        this.A02 = anonymousClass253;
        this.A00 = i;
        this.A01 = j;
    }
}
