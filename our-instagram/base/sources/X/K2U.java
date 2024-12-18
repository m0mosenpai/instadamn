package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* loaded from: classes8.dex */
public final class K2U extends C0T6 implements InterfaceC129525tH, InterfaceC129555tK {
    public final C7QY A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ C7QX A03;

    public K2U(C7QY c7qy, String str, String str2) {
        C14360o3.A0B(c7qy, 1);
        this.A03 = c7qy.A0B;
        this.A00 = c7qy;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC129525tH
    public final int BJB() {
        return this.A03.BJB();
    }

    @Override // X.InterfaceC129525tH
    public final String C0c() {
        return this.A03.C0c();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2U) {
                K2U k2u = (K2U) obj;
                if (!C14360o3.A0K(this.A00, k2u.A00) || !C14360o3.A0K(this.A01, k2u.A01) || !C14360o3.A0K(this.A02, k2u.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC129525tH
    public final boolean ARd() {
        return C7BP.A01(this.A03);
    }

    @Override // X.InterfaceC129525tH
    public final C2EY Ar9() {
        return this.A03.A04;
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier ArP() {
        return this.A03.A05;
    }

    @Override // X.InterfaceC129525tH
    public final List AuO() {
        return this.A03.A07;
    }

    @Override // X.InterfaceC129525tH
    public final C7P3 AxY() {
        return this.A03.A03;
    }

    @Override // X.InterfaceC129525tH
    public final boolean BCt() {
        return this.A03.A08;
    }

    @Override // X.InterfaceC129525tH
    public final C7QV BPA() {
        return this.A03.A02;
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier BSy() {
        return this.A03.A06;
    }

    @Override // X.InterfaceC129525tH
    public final long BT8() {
        return this.A03.A00;
    }

    @Override // X.InterfaceC129525tH
    public final AnonymousClass541 BfF() {
        return AnonymousClass541.A0J;
    }

    @Override // X.InterfaceC129525tH
    public final String BxY() {
        return null;
    }

    @Override // X.InterfaceC129525tH
    public final String CCL() {
        return C7BP.A00(this.A03);
    }

    @Override // X.InterfaceC129525tH
    public final boolean CVC() {
        return this.A03.A09;
    }

    @Override // X.InterfaceC129525tH
    public final boolean CXQ() {
        return this.A03.A0A;
    }

    @Override // X.InterfaceC129525tH
    public final boolean CYW() {
        return this.A03.A0B;
    }

    @Override // X.InterfaceC129525tH
    public final boolean Cd1() {
        return this.A03.A0C;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
