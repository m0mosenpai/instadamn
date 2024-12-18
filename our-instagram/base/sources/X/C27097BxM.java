package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.BxM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27097BxM extends AbstractC18280vF {
    public final /* synthetic */ C2NX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27097BxM(C2NX c2nx) {
        super("MAAAppLevelSPIFetaCheck", 1431641415, 3, false, false);
        this.A00 = c2nx;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        AnonymousClass253 A00 = AnonymousClass252.A00(c2nx.A04);
        A00.A00(new C29534Czm(0, A00, c2nx));
    }
}
