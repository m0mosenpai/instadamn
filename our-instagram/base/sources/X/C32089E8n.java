package X;

/* renamed from: X.E8n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32089E8n extends C0T6 implements InterfaceC66482zP {
    public final AbstractC46972Dl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32089E8n) {
                C32089E8n c32089E8n = (C32089E8n) obj;
                if (!C14360o3.A0K(this.A01, c32089E8n.A01) || !C14360o3.A0K(this.A02, c32089E8n.A02) || !C14360o3.A0K(this.A03, c32089E8n.A03) || !C14360o3.A0K(this.A00, c32089E8n.A00) || this.A05 != c32089E8n.A05 || this.A06 != c32089E8n.A06 || this.A04 != c32089E8n.A04 || this.A07 != c32089E8n.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))))))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32089E8n c32089E8n = (C32089E8n) obj;
        if (c32089E8n != null && C14360o3.A0K(this.A01, c32089E8n.A01) && C14360o3.A0K(this.A02, c32089E8n.A02) && C14360o3.A0K(this.A03, c32089E8n.A03) && C14360o3.A0K(this.A00, c32089E8n.A00) && this.A05 == c32089E8n.A05 && this.A06 == c32089E8n.A06 && this.A04 == c32089E8n.A04 && this.A07 == c32089E8n.A07) {
            return true;
        }
        return false;
    }

    public C32089E8n(AbstractC46972Dl abstractC46972Dl, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = abstractC46972Dl;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }
}
