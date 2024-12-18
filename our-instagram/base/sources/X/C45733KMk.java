package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.KMk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45733KMk extends AbstractC18280vF {
    public final /* synthetic */ C2NX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45733KMk(C2NX c2nx) {
        super("prewarmDirectInboxDatabase", 1934382846, 2, false, false);
        this.A00 = c2nx;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C49692Qc c49692Qc = C49682Qb.A06;
        if (c49692Qc.A00() != null) {
            C49682Qb A00 = c49692Qc.A00();
            C14360o3.A0A(A00);
            C2NX c2nx = this.A00;
            CallerContext callerContext = C2NX.A08;
            A00.A02(new C46912Df(c2nx.A04));
        }
    }
}
