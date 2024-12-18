package X;

/* renamed from: X.JyX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45131JyX extends C0T6 implements InterfaceC50419MNy {
    public String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45131JyX) && C14360o3.A0K(this.A00, ((C45131JyX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC50419MNy
    public final byte[] EqB() {
        String A0R = AnonymousClass001.A0R("1;", this.A00);
        C14360o3.A0B(A0R, 0);
        byte[] bytes = A0R.getBytes(C15W.A05);
        C14360o3.A07(bytes);
        return bytes;
    }
}
