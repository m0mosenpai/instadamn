package X;

/* renamed from: X.MvF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51811MvF extends C0T6 implements InterfaceC66482zP {
    public final C41551w4 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51811MvF) && C14360o3.A0K(this.A00, ((C51811MvF) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C51811MvF(C41551w4 c41551w4) {
        this.A00 = c41551w4;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
