package X;

import android.graphics.Path;

/* renamed from: X.Bgg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26096Bgg extends C0T6 implements InterfaceC30926Did {
    public final C26104Bgo A00;
    public final C26112Bgw A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26096Bgg) {
                C26096Bgg c26096Bgg = (C26096Bgg) obj;
                if (!C14360o3.A0K(this.A00, c26096Bgg.A00) || !C14360o3.A0K(this.A01, c26096Bgg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C26096Bgg(C26104Bgo c26104Bgo, C26112Bgw c26112Bgw) {
        this.A00 = c26104Bgo;
        this.A01 = c26112Bgw;
    }

    @Override // X.InterfaceC30926Did
    public final void ACE(Path path, C28225CcV c28225CcV) {
        AbstractC167017dG.A1N(path, c28225CcV);
        C26104Bgo c26104Bgo = this.A00;
        C26112Bgw c26112Bgw = this.A01;
        Path A00 = c28225CcV.A00(c26104Bgo, c26112Bgw);
        c28225CcV.A01(c26112Bgw, new C65075Td4(A00, 46));
        path.addPath(A00);
    }
}
