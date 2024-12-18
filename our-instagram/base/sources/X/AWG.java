package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class AWG implements InterfaceC201588vn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AWF A01;

    public AWG(AWF awf, int i) {
        this.A01 = awf;
        this.A00 = i;
    }

    @Override // X.InterfaceC201588vn
    public final boolean CTl(long j) {
        AWF awf = this.A01;
        C69688VtY c69688VtY = (C69688VtY) awf.A01.get(this.A00);
        C0J8.A03(c69688VtY, "timeline effect should not be null.");
        return c69688VtY.A00.A06(TimeUnit.MICROSECONDS, j, awf.A02);
    }
}
