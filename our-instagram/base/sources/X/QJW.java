package X;

/* loaded from: classes10.dex */
public final class QJW extends C0T6 implements InterfaceC65492TlE {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof QJW) && C14360o3.A0K(this.A00, ((QJW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("String(value=", this.A00, ')');
    }

    @Override // X.InterfaceC65492TlE
    public final byte[] CEU() {
        return MSY.A1a(this.A00);
    }

    @Override // X.InterfaceC65492TlE
    public final String CEV() {
        return this.A00;
    }

    public QJW(String str) {
        this.A00 = str;
    }
}
