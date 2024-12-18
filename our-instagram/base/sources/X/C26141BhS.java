package X;

/* renamed from: X.BhS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26141BhS extends C0T6 implements InterfaceC31117Dlz {
    public final String A00;

    public C26141BhS(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC31117Dlz
    public final C26141BhS Exc() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26141BhS) && C14360o3.A0K(this.A00, ((C26141BhS) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC31117Dlz
    public final String AgV() {
        return this.A00;
    }
}
