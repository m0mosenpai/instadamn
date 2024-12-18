package X;

/* renamed from: X.Jzr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45211Jzr extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final C45128JyU A01;
    public final Float A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45211Jzr) {
                C45211Jzr c45211Jzr = (C45211Jzr) obj;
                if (!C14360o3.A0K(this.A01, c45211Jzr.A01) || !C14360o3.A0K(this.A03, c45211Jzr.A03) || !C14360o3.A0K(this.A02, c45211Jzr.A02) || this.A00 != c45211Jzr.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        C45128JyU c45128JyU = this.A01;
        String str = c45128JyU.A0A;
        if (str == null) {
            return C45128JyU.A00(c45128JyU);
        }
        return str;
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45128JyU c45128JyU;
        C45211Jzr c45211Jzr = (C45211Jzr) obj;
        C45128JyU c45128JyU2 = this.A01;
        if (c45211Jzr != null) {
            c45128JyU = c45211Jzr.A01;
        } else {
            c45128JyU = null;
        }
        return C14360o3.A0K(c45128JyU2, c45128JyU);
    }

    public C45211Jzr(C45128JyU c45128JyU, Float f, String str, int i) {
        this.A01 = c45128JyU;
        this.A03 = str;
        this.A02 = f;
        this.A00 = i;
    }
}
