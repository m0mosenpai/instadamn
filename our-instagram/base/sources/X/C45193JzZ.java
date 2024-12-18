package X;

/* renamed from: X.JzZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45193JzZ extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45193JzZ) {
                C45193JzZ c45193JzZ = (C45193JzZ) obj;
                if (!C14360o3.A0K(this.A01, c45193JzZ.A01) || !C14360o3.A0K(this.A00, c45193JzZ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R(this.A01, this.A00);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C45193JzZ(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
