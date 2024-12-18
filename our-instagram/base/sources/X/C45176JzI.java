package X;

/* renamed from: X.JzI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45176JzI extends C0T6 implements InterfaceC66492zQ {
    public final C9BO A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45176JzI) && C14360o3.A0K(this.A00, ((C45176JzI) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C45176JzI(C9BO c9bo) {
        this.A00 = c9bo;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
