package X;

/* renamed from: X.MvH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51813MvH extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51813MvH) {
                C51813MvH c51813MvH = (C51813MvH) obj;
                if (!C14360o3.A0K(this.A00, c51813MvH.A00) || this.A01 != c51813MvH.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C51813MvH(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C14360o3.A0K(obj, this);
    }
}
