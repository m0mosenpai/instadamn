package X;

/* renamed from: X.Ccw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28252Ccw {
    public final InterfaceC74953Yl A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28252Ccw)) {
            return false;
        }
        return AbstractC25229BEm.A1V(this.A00, ((C28252Ccw) obj).A00.getValue());
    }

    public final int hashCode() {
        return this.A00.getValue().hashCode();
    }

    public C28252Ccw(C92 c92) {
        this.A00 = AbstractC25230BEn.A0U(c92);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ContextMenuState(status=");
        return AbstractC167017dG.A0o(this.A00.getValue(), A1C);
    }

    public C28252Ccw() {
        this(BZV.A00);
    }
}
