package X;

import android.os.Handler;

/* renamed from: X.Wou, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71159Wou implements C7GO {
    public final /* synthetic */ C71160Wov A00;

    @Override // X.C7GO
    public final void DEF(Exception exc) {
        C71160Wov c71160Wov = this.A00;
        C11T.A02(new RunnableC71523WvS(c71160Wov, exc));
        c71160Wov.A06.set(false);
    }

    public C71159Wou(C71160Wov c71160Wov) {
        this.A00 = c71160Wov;
    }

    @Override // X.C7GO
    public final void DR9() {
        C71160Wov c71160Wov = this.A00;
        c71160Wov.A05.set(false);
        ((Handler) c71160Wov.A07.getValue()).post(new C68013V6f(c71160Wov, C05F.A01, new C57517Pfr(c71160Wov, 42)));
    }

    @Override // X.C7GO
    public final void DdX(boolean z) {
        C11T.A02(new RunnableC71524WvT(this.A00, z));
    }

    @Override // X.C7GO
    public final void DdZ() {
        C71160Wov c71160Wov = this.A00;
        C11T.A02(new RunnableC71391Wt0(c71160Wov));
        c71160Wov.A06.set(false);
    }

    @Override // X.C7GO
    public final void E1s(long j, double d) {
        C11T.A02(new RunnableC71581WwY(this.A00, d, j));
    }
}
