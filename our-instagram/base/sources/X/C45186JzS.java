package X;

/* renamed from: X.JzS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45186JzS extends C0T6 implements InterfaceC66482zP {
    public final C1576676a A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45186JzS) && C14360o3.A0K(this.A00, ((C45186JzS) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A02;
    }

    public C45186JzS(C1576676a c1576676a) {
        this.A00 = c1576676a;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
