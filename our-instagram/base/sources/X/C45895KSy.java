package X;

/* renamed from: X.KSy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45895KSy extends AbstractC129515tG implements InterfaceC129545tJ, AnonymousClass782, InterfaceC129555tK {
    public final C7QL A00;
    public final AbstractC46444Kh4 A01;
    public final CharSequence A02;
    public final String A03;
    public final C7QX A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45895KSy(C7QX c7qx, C7QL c7ql, AbstractC46444Kh4 abstractC46444Kh4, CharSequence charSequence, String str) {
        super(c7qx);
        C14360o3.A0B(str, 3);
        this.A01 = abstractC46444Kh4;
        this.A02 = charSequence;
        this.A03 = str;
        this.A00 = c7ql;
        this.A04 = c7qx;
        this.A05 = charSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45895KSy) {
                C45895KSy c45895KSy = (C45895KSy) obj;
                if (!C14360o3.A0K(this.A01, c45895KSy.A01) || !C14360o3.A0K(this.A02, c45895KSy.A02) || !C14360o3.A0K(this.A03, c45895KSy.A03) || !C14360o3.A0K(this.A00, c45895KSy.A00) || !C14360o3.A0K(this.A04, c45895KSy.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass782
    public final String Arl() {
        return this.A05;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVa() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVb() {
        return this.A00.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
