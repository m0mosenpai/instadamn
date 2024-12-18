package X;

/* loaded from: classes6.dex */
public final class EY3 extends C4F4 {
    public final String A00;

    public EY3(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EY3) && C14360o3.A0K(this.A00, ((EY3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C4F4 c4f4 = (C4F4) obj;
        C14360o3.A0B(c4f4, 0);
        return C14360o3.A0K(getKey(), c4f4.getKey());
    }
}
