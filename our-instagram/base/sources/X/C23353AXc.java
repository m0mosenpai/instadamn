package X;

/* renamed from: X.AXc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23353AXc implements InterfaceC48212Jk {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C23353AXc(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C0K8.A0O("BrandedContentXPostingDestinationFBPageEligibilityFetcher", "Failed to fetch BrandedContentXPostingDestinationFBPageEligibilityQuery: %s", th.getMessage());
        this.A00.invoke(th);
    }
}
