package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes12.dex */
public final class XP8 implements C2JL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9CK A01;
    public final /* synthetic */ XP0 A02;
    public final /* synthetic */ C72127XOz A03;
    public final /* synthetic */ C72122XOt A04;
    public final /* synthetic */ XP9 A05;
    public final /* synthetic */ C6PU A06;
    public final /* synthetic */ Throwable A07;
    public final /* synthetic */ boolean A08;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        C72122XOt c72122XOt = this.A04;
        XP9 xp9 = this.A05;
        boolean z = this.A08;
        int i = this.A00;
        C9CK c9ck = this.A01;
        C6PU c6pu = this.A06;
        C72127XOz c72127XOz = this.A03;
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
            C72064XMi c72064XMi = c72122XOt.A01;
            if (i < c72064XMi.A00) {
                long j = c72064XMi.A01;
                if (j > 0) {
                    RunnableC73546YIs runnableC73546YIs = new RunnableC73546YIs(c9ck, xp0, c72127XOz, c72122XOt, xp9, c6pu, th, i);
                    xp0.A00 = runnableC73546YIs;
                    c72122XOt.A02.A00.postDelayed(runnableC73546YIs, j);
                    return;
                }
                C72122XOt.A00(c9ck, xp0, c72127XOz, c72122XOt, xp9, c6pu, th, i + 1);
                return;
            }
        }
        xp9.Dfv(th);
        c72127XOz.A00.A01(th);
    }

    public XP8(C9CK c9ck, XP0 xp0, C72127XOz c72127XOz, C72122XOt c72122XOt, XP9 xp9, C6PU c6pu, Throwable th, int i, boolean z) {
        this.A03 = c72127XOz;
        this.A08 = z;
        this.A05 = xp9;
        this.A00 = i;
        this.A04 = c72122XOt;
        this.A07 = th;
        this.A01 = c9ck;
        this.A06 = c6pu;
        this.A02 = xp0;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (obj == null) {
            C72127XOz c72127XOz = this.A03;
            c72127XOz.A00.A01(new C53401Njq(MSV.A00(76), null));
        } else {
            if (this.A08) {
                this.A05.ClE(this.A00, LF9.A00(this.A07));
            }
            this.A03.A00.A00(obj);
        }
    }
}
