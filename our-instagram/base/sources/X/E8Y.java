package X;

/* loaded from: classes6.dex */
public final class E8Y extends C0T6 implements InterfaceC66482zP {
    public final C36731GHa A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E8Y) && C14360o3.A0K(this.A00, ((E8Y) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.A04);
    }

    public E8Y(C36731GHa c36731GHa) {
        this.A00 = c36731GHa;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C14360o3.A0K(obj, this);
    }
}
