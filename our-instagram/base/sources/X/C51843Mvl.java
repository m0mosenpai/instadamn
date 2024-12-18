package X;

import java.util.List;

/* renamed from: X.Mvl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51843Mvl extends C0T6 implements InterfaceC57956Pn2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C51843Mvl(List list, int i, String str) {
        EnumC53172NfT enumC53172NfT;
        this.A00 = i;
        this.A03 = str;
        this.A01 = list;
        switch (i) {
            case 0:
                enumC53172NfT = EnumC53172NfT.A03;
                break;
            case 1:
                enumC53172NfT = EnumC53172NfT.A06;
                break;
            default:
                enumC53172NfT = EnumC53172NfT.A07;
                break;
        }
        this.A02 = enumC53172NfT;
    }

    @Override // X.InterfaceC57956Pn2
    public final EnumC53172NfT CBf() {
        return (EnumC53172NfT) this.A02;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C51843Mvl) {
            C51843Mvl c51843Mvl = (C51843Mvl) obj;
            if (c51843Mvl.A00 != i || !C14360o3.A0K(this.A03, c51843Mvl.A03) || !C14360o3.A0K(this.A01, c51843Mvl.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A03));
    }
}
