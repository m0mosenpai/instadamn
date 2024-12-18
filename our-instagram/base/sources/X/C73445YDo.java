package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.YDo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73445YDo implements C2JL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9CK A01;
    public final /* synthetic */ XP0 A02;
    public final /* synthetic */ XP9 A03;
    public final /* synthetic */ XP3 A04;
    public final /* synthetic */ C6PU A05;
    public final /* synthetic */ C6VU A06;
    public final /* synthetic */ Throwable A07;
    public final /* synthetic */ boolean A08;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        C6VU c6vu = this.A06;
        XP9 xp9 = this.A03;
        boolean z = this.A08;
        int i = this.A00;
        C9CK c9ck = this.A01;
        C6PU c6pu = this.A05;
        XP3 xp3 = this.A04;
        XP0 xp0 = this.A02;
        Throwable th2 = this.A07;
        if (th instanceof CancellationException) {
            xp9.Dfl();
            return;
        }
        if (z) {
            xp9.ClC(i, LF9.A00(th2));
        }
        if (!(th instanceof C53401Njq)) {
            C72064XMi c72064XMi = c6vu.A02;
            if (i < c72064XMi.A00) {
                long j = c72064XMi.A01;
                if (j > 0) {
                    RunnableC73547YIt runnableC73547YIt = new RunnableC73547YIt(c9ck, xp0, xp9, xp3, c6pu, c6vu, th, i);
                    xp0.A00 = runnableC73547YIt;
                    c6vu.A03.A00.postDelayed(runnableC73547YIt, j);
                    return;
                }
                C6VU.A01(c9ck, xp0, xp9, xp3, c6pu, c6vu, th, i + 1);
                return;
            }
        }
        xp9.Dfv(th);
        xp3.A00.A01(th);
    }

    public C73445YDo(C9CK c9ck, XP0 xp0, XP9 xp9, XP3 xp3, C6PU c6pu, C6VU c6vu, Throwable th, int i, boolean z) {
        this.A04 = xp3;
        this.A06 = c6vu;
        this.A03 = xp9;
        this.A08 = z;
        this.A00 = i;
        this.A01 = c9ck;
        this.A05 = c6pu;
        this.A02 = xp0;
        this.A07 = th;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        XP3 xp3 = this.A04;
        if (obj == null) {
            xp3.A00.A01(new C53401Njq(MSV.A00(76), null));
        } else {
            xp3.A00.A00(obj);
        }
    }
}
