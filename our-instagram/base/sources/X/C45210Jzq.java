package X;

/* renamed from: X.Jzq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45210Jzq extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final Boolean A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45210Jzq) {
                C45210Jzq c45210Jzq = (C45210Jzq) obj;
                if (this.A00 != c45210Jzq.A00 || !C14360o3.A0K(this.A02, c45210Jzq.A02) || !C14360o3.A0K(this.A01, c45210Jzq.A01) || this.A03 != c45210Jzq.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (AbstractC166997dE.A0K(this.A02, this.A00 * 31) + AbstractC167017dG.A0M(this.A01)) * 31);
    }

    public C45210Jzq(Boolean bool, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = bool;
        this.A03 = z;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C14360o3.A0K(obj, this);
    }
}
