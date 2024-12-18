package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class QJV extends C0T6 implements InterfaceC65492TlE {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof QJV) && C14360o3.A0K(this.A00, ((QJV) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0S("ByteArray(value=", Arrays.toString(this.A00), ')');
    }

    @Override // X.InterfaceC65492TlE
    public final byte[] CEU() {
        return this.A00;
    }

    @Override // X.InterfaceC65492TlE
    public final String CEV() {
        return AbstractC58318PtA.A0m(C15W.A05, this.A00);
    }

    public QJV(byte[] bArr) {
        this.A00 = bArr;
    }
}
