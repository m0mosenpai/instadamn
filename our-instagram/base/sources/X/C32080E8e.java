package X;

/* renamed from: X.E8e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32080E8e extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32080E8e) {
                C32080E8e c32080E8e = (C32080E8e) obj;
                if (!C14360o3.A0K(this.A00, c32080E8e.A00) || this.A01 != c32080E8e.A01 || this.A02 != c32080E8e.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public C32080E8e(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
