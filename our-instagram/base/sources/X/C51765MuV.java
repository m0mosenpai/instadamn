package X;

/* renamed from: X.MuV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51765MuV extends C0T6 implements InterfaceC58104PpT {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C51765MuV(Integer num, String str, String str2, String str3) {
        C14360o3.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // X.InterfaceC58104PpT
    public final String Ar1() {
        return this.A01;
    }

    @Override // X.InterfaceC58104PpT
    public final Integer Ar7() {
        return this.A00;
    }

    @Override // X.InterfaceC58104PpT
    public final boolean Cff() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C51765MuV) {
            C51765MuV c51765MuV = (C51765MuV) obj;
            if (C14360o3.A0K(c51765MuV.A01, this.A01) && c51765MuV.A00 == this.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC53739Npr.A00(this.A00);
    }
}
