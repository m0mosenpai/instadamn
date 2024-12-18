package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.NGz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52404NGz extends AbstractC18280vF {
    public final /* synthetic */ C2NX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52404NGz(C2NX c2nx) {
        super("contactSyncForWearables", 20232754, 5, false, false);
        this.A00 = c2nx;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        AbstractC34194F6s.A00(c2nx.A04, new C56384P1v(c2nx));
    }
}
