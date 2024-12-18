package X;

/* loaded from: classes6.dex */
public final class E8T extends C0T6 implements InterfaceC66482zP {
    public final char A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E8T) && this.A00 == ((E8T) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public E8T(char c) {
        this.A00 = c;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
