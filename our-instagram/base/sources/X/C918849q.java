package X;

/* renamed from: X.49q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C918849q extends C2QT {
    public final C918749p[] A00;
    public final /* synthetic */ C918649o A01;

    public C918849q(C918649o c918649o, C918749p[] c918749pArr) {
        this.A01 = c918649o;
        this.A00 = c918749pArr;
    }

    public final void A06() {
        for (C918749p c918749p : this.A00) {
            C19D c19d = c918749p.A00;
            if (c19d != null) {
                c19d.dispose();
            } else {
                C14360o3.A0F("handle");
                throw C00O.createAndThrow();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisposeHandlersOnCancel[");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A06();
        return C0eB.A00;
    }

    @Override // X.C2QU
    public final void A05(Throwable th) {
        A06();
    }
}
