package X;

/* loaded from: classes8.dex */
public final class KT3 extends AbstractC129515tG implements InterfaceC129555tK {
    public final C7QX A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KT3) && C14360o3.A0K(this.A00, ((KT3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KT3(C7QX c7qx) {
        super(c7qx);
        this.A00 = c7qx;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
