package X;

/* loaded from: classes6.dex */
public final class EY4 extends C4F4 {
    public final C5QE A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EY4) && C14360o3.A0K(this.A00, ((EY4) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public EY4(C5QE c5qe) {
        this.A00 = c5qe;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
