package X;

/* loaded from: classes8.dex */
public final class JVH extends AbstractC129515tG implements InterfaceC129555tK {
    public final int A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final C7QX A03;
    public final C7QL A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JVH) {
                JVH jvh = (JVH) obj;
                if (!C14360o3.A0K(this.A02, jvh.A02) || !C14360o3.A0K(this.A01, jvh.A01) || this.A00 != jvh.A00 || !C14360o3.A0K(this.A04, jvh.A04) || !C14360o3.A0K(this.A03, jvh.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A04, ((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC166997dE.A0I(this.A01)) * 31) + this.A00) * 31));
    }

    public JVH(C7QX c7qx, C7QL c7ql, CharSequence charSequence, CharSequence charSequence2, int i) {
        super(c7qx);
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = i;
        this.A04 = c7ql;
        this.A03 = c7qx;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
