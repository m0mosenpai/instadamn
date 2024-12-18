package X;

/* renamed from: X.9aC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211859aC extends C0T6 implements InterfaceC66482zP {
    public int A00 = 0;
    public String A01 = "";
    public String A02 = "";
    public boolean A03 = true;
    public boolean A04 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211859aC) {
                C211859aC c211859aC = (C211859aC) obj;
                if (this.A00 != c211859aC.A00 || !C14360o3.A0K(this.A01, c211859aC.A01) || !C14360o3.A0K(this.A02, c211859aC.A02) || this.A03 != c211859aC.A03 || this.A04 != c211859aC.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, this.A00 * 31))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
