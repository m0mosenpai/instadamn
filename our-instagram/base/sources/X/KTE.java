package X;

/* loaded from: classes8.dex */
public final class KTE extends AbstractC129515tG implements InterfaceC129555tK {
    public final C7QL A00;
    public final Boolean A01;
    public final CharSequence A02;
    public final String A03;
    public final String A04;
    public final C7QX A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTE(C7QX c7qx, C7QL c7ql, Boolean bool, CharSequence charSequence, String str, String str2, boolean z) {
        super(c7qx);
        C14360o3.A0B(charSequence, 2);
        this.A04 = str;
        this.A02 = charSequence;
        this.A03 = str2;
        this.A01 = bool;
        this.A00 = c7ql;
        this.A05 = c7qx;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTE) {
                KTE kte = (KTE) obj;
                if (!C14360o3.A0K(this.A04, kte.A04) || !C14360o3.A0K(this.A02, kte.A02) || !C14360o3.A0K(this.A03, kte.A03) || !C14360o3.A0K(this.A01, kte.A01) || !C14360o3.A0K(this.A00, kte.A00) || !C14360o3.A0K(this.A05, kte.A05) || this.A06 != kte.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A00, (((AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
