package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* loaded from: classes8.dex */
public final class K2Y extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final DirectMessageIdentifier A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2Y) {
                K2Y k2y = (K2Y) obj;
                if (!C14360o3.A0K(this.A01, k2y.A01) || this.A03 != k2y.A03 || this.A00 != k2y.A00 || this.A04 != k2y.A04 || !C14360o3.A0K(this.A02, k2y.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A04, (AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A01)) + this.A00) * 31));
    }

    public K2Y(DirectMessageIdentifier directMessageIdentifier, List list, int i, boolean z, boolean z2) {
        this.A01 = directMessageIdentifier;
        this.A03 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A02 = list;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
