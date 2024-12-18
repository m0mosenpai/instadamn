package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class KT8 extends AbstractC129515tG implements InterfaceC129555tK {
    public final C158797Aq A00;
    public final boolean A01;
    public final C7QX A02;
    public final DirectMessageIdentifier A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KT8) {
                KT8 kt8 = (KT8) obj;
                if (!C14360o3.A0K(this.A03, kt8.A03) || !C14360o3.A0K(this.A00, kt8.A00) || !C14360o3.A0K(this.A02, kt8.A02) || this.A01 != kt8.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0M(this.A00)) * 31));
    }

    public KT8(C158797Aq c158797Aq, C7QX c7qx, DirectMessageIdentifier directMessageIdentifier, boolean z) {
        super(c7qx);
        this.A03 = directMessageIdentifier;
        this.A00 = c158797Aq;
        this.A02 = c7qx;
        this.A01 = z;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
