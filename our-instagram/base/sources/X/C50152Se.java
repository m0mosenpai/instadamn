package X;

/* renamed from: X.2Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50152Se extends C2QT {
    public final C19D A00;

    @Override // X.C2QU
    public final void A05(Throwable th) {
        this.A00.dispose();
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.A00.dispose();
        return C0eB.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisposeOnCancel[");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    public C50152Se(C19D c19d) {
        this.A00 = c19d;
    }
}
