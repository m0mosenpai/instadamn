package X;

/* renamed from: X.JyY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45132JyY extends C0T6 implements InterfaceC50419MNy {
    public final String A00;

    public C45132JyY(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45132JyY) && C14360o3.A0K(this.A00, ((C45132JyY) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC50419MNy
    public final byte[] EqB() {
        String str = this.A00;
        C14360o3.A0B(str, 0);
        byte[] bytes = str.getBytes(C15W.A05);
        C14360o3.A07(bytes);
        return bytes;
    }
}
