package X;

/* loaded from: classes4.dex */
public final class AB0 {
    public final /* synthetic */ C214619ez A00;

    public AB0(C214619ez c214619ez) {
        this.A00 = c214619ez;
    }

    public final void A00(String str) {
        C214619ez c214619ez = this.A00;
        BCJ bcj = c214619ez.A04;
        if (bcj == null) {
            C14360o3.A0F("arCommerceDataStoreProvider");
            throw C00O.createAndThrow();
        }
        bcj.E6S().CJi(c214619ez.requireActivity(), str);
    }
}
