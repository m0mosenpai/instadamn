package X;

/* renamed from: X.BhQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26139BhQ extends C0T6 implements InterfaceC31109Dlr {
    public final String A00;

    public C26139BhQ(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC31109Dlr
    public final C26139BhQ ExX() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26139BhQ) && C14360o3.A0K(this.A00, ((C26139BhQ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
