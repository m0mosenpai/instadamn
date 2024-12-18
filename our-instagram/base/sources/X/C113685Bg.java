package X;

/* renamed from: X.5Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113685Bg {
    public final C113695Bh A00 = new C113695Bh();
    public final C113695Bh A01 = new C113695Bh();

    public final void A00(AnonymousClass599 anonymousClass599, boolean z) {
        C113695Bh c113695Bh = this.A00;
        if (z) {
            if (anonymousClass599.A0A != null) {
                c113695Bh.A00.add(anonymousClass599);
            }
            AbstractC28290Cdc.A01("DepthSortedSet.add called on an unattached node");
            throw C00O.createAndThrow();
        }
        if (c113695Bh.A00.contains(anonymousClass599)) {
            return;
        }
        C113695Bh c113695Bh2 = this.A01;
        if (anonymousClass599.A0A != null) {
            c113695Bh2.A00.add(anonymousClass599);
            return;
        }
        AbstractC28290Cdc.A01("DepthSortedSet.add called on an unattached node");
        throw C00O.createAndThrow();
    }

    public final boolean A01() {
        if (this.A01.A00.isEmpty() && this.A00.A00.isEmpty()) {
            return true;
        }
        return false;
    }
}
