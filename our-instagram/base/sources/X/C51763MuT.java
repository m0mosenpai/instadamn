package X;

/* renamed from: X.MuT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51763MuT extends C0T6 implements InterfaceC58104PpT {
    public final String A00;
    public final Integer A01;

    public C51763MuT(Integer num, String str) {
        C14360o3.A0B(num, 2);
        this.A00 = str;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51763MuT) {
                C51763MuT c51763MuT = (C51763MuT) obj;
                if (!C14360o3.A0K(this.A00, c51763MuT.A00) || this.A01 != c51763MuT.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58104PpT
    public final String Ar1() {
        return this.A00;
    }

    @Override // X.InterfaceC58104PpT
    public final Integer Ar7() {
        return this.A01;
    }

    @Override // X.InterfaceC58104PpT
    public final boolean Cff() {
        return false;
    }

    public final int hashCode() {
        int A0J = (AbstractC166987dD.A0J(this.A00) + AbstractC53739Npr.A00(this.A01)) * 31;
        int A00 = AbstractC53644Nnp.A00();
        return ((A0J + A00) * 31) + A00;
    }
}
