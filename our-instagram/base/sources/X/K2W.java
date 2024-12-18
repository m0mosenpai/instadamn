package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes8.dex */
public final class K2W extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final MessageIdentifier A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2W) {
                K2W k2w = (K2W) obj;
                if (!C14360o3.A0K(this.A01, k2w.A01) || this.A00 != k2w.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public K2W(MessageIdentifier messageIdentifier, int i) {
        this.A01 = messageIdentifier;
        this.A00 = i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
