package X;

/* renamed from: X.5bW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119725bW extends AbstractC119735bX {
    public final InterfaceC118245Wl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C119725bW) && C14360o3.A0K(this.A00, ((C119725bW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalCrossAxisAlignment(horizontal=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C119725bW(InterfaceC118245Wl interfaceC118245Wl) {
        this.A00 = interfaceC118245Wl;
    }
}
