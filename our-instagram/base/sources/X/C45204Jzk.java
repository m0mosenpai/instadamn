package X;

/* renamed from: X.Jzk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45204Jzk extends C0T6 implements InterfaceC66482zP {
    public CharSequence A00 = "";
    public boolean A01 = false;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45204Jzk) {
                C45204Jzk c45204Jzk = (C45204Jzk) obj;
                if (this.A02 != c45204Jzk.A02 || !C14360o3.A0K(this.A00, c45204Jzk.A00) || this.A01 != c45204Jzk.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public C45204Jzk(int i) {
        this.A02 = i;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A02);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, ((this.A02 * 31) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
