package X;

/* renamed from: X.Mvm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51844Mvm extends C0T6 implements InterfaceC57956Pn2 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final EnumC53172NfT A03 = EnumC53172NfT.A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51844Mvm) {
                C51844Mvm c51844Mvm = (C51844Mvm) obj;
                if (!C14360o3.A0K(this.A02, c51844Mvm.A02) || !C14360o3.A0K(this.A00, c51844Mvm.A00) || !C14360o3.A0K(this.A01, c51844Mvm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57956Pn2
    public final EnumC53172NfT CBf() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    public C51844Mvm(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
