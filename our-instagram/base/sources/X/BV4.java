package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class BV4 extends AbstractC51572Yf {
    public final int A00;
    public final AbstractC25398BLp A01;
    public final C25348BJr A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C25348BJr c25348BJr = this.A02;
        if (c25348BJr == null) {
            return new C75723ad();
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0K = AbstractC25234BEr.A0K(AbstractC25233BEq.A0e(C05F.A00, 100.0f, 0), C05F.A01, 0);
        AbstractC25398BLp abstractC25398BLp = this.A01;
        C120985dq c120985dq = abstractC25398BLp.A0D;
        C37644Ghd c37644Ghd = abstractC25398BLp.A0E;
        int i = this.A00;
        Context context = c25348BJr.A01;
        C57112jm c57112jm = c25348BJr.A04;
        String str = c25348BJr.A0J;
        return new C25636BUy(A0K, new C38229GrY(context, c25348BJr.A03, c57112jm, c25348BJr.A06, c25348BJr.A07, str, i), c120985dq, c37644Ghd);
    }

    public BV4(AbstractC25398BLp abstractC25398BLp, C25348BJr c25348BJr, int i) {
        this.A01 = abstractC25398BLp;
        this.A00 = i;
        this.A02 = c25348BJr;
    }
}
