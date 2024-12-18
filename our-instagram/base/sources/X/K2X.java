package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class K2X extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final DirectMessageIdentifier A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2X) {
                K2X k2x = (K2X) obj;
                if (!C14360o3.A0K(this.A03, k2x.A03) || !C14360o3.A0K(this.A02, k2x.A02) || this.A00 != k2x.A00 || this.A01 != k2x.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03)) + this.A00) * 31) + this.A01;
    }

    public K2X(DirectMessageIdentifier directMessageIdentifier, String str, int i, int i2) {
        this.A03 = str;
        this.A02 = directMessageIdentifier;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
