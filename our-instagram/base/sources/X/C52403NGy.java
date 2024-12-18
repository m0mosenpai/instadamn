package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.NGy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52403NGy extends AbstractC18280vF {
    public final /* synthetic */ C2NX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52403NGy(C2NX c2nx) {
        super("foregroundEligibilityStatusJob", 1147640425, 2, false, false);
        this.A00 = c2nx;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        Object A01 = c2nx.A04.deviceSession.A01(C55039OZl.class, new C57246PbU(c2nx, 10));
        boolean z = C218914p.A05;
        C218914p.A03(EnumC220415e.A02, new C56056OuX(A01, 2));
    }
}
