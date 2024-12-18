package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LmU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49042LmU implements InterfaceC164937Zi {
    public MessageIdentifier A00;
    public final /* synthetic */ L5W A01;

    @Override // X.InterfaceC164937Zi
    public final void ATg(boolean z) {
    }

    @Override // X.InterfaceC164937Zi
    public final void DSy() {
    }

    public C49042LmU(L5W l5w) {
        this.A01 = l5w;
    }

    @Override // X.InterfaceC164937Zi
    public final void AOf() {
        MessageIdentifier messageIdentifier = this.A00;
        if (messageIdentifier != null) {
            String str = messageIdentifier.A01;
            String A00 = messageIdentifier.A00();
            if (A00 != null) {
                L5W l5w = this.A01;
                AbstractC165967bO.A00(l5w.A04).A0L(l5w.A0H, str, AbstractC166987dD.A1J(str), AbstractC166987dD.A1J(A00), false);
                l5w.A06.A0C(str);
            }
        }
    }

    @Override // X.InterfaceC164937Zi
    public final void ASp(MessageIdentifier messageIdentifier) {
        this.A00 = messageIdentifier;
    }
}
