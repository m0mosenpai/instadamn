package X;

/* renamed from: X.SvI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63884SvI implements InterfaceC65329TiA {
    public C63881SvF A00;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Ti9, X.SvF, java.lang.Object] */
    @Override // X.InterfaceC65329TiA
    public final InterfaceC65328Ti9 AEX(Integer num, boolean z) {
        if (num == C05F.A0Y) {
            return C63882SvG.A00;
        }
        C63881SvF c63881SvF = this.A00;
        if (c63881SvF != null) {
            return c63881SvF;
        }
        ?? obj = new Object();
        this.A00 = obj;
        return obj;
    }
}
