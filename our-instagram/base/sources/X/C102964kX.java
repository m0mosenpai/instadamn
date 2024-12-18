package X;

import java.util.List;

/* renamed from: X.4kX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102964kX implements InterfaceC102974kY {
    public final InterfaceC102974kY A00;
    public final List A01;

    @Override // X.InterfaceC102974kY
    public final SOW Agb() {
        SOW Agb;
        String str;
        InterfaceC102974kY interfaceC102974kY = this.A00;
        if (interfaceC102974kY != null && (Agb = interfaceC102974kY.Agb()) != null) {
            String CAv = CAv();
            if (CAv != null && CAv.length() != 0) {
                str = AnonymousClass001.A0T(Agb.A01, CAv, ':');
            } else {
                str = Agb.A01;
            }
            return new SOW(Agb.A00, str);
        }
        return null;
    }

    @Override // X.InterfaceC102974kY
    public final String BOp() {
        InterfaceC102974kY interfaceC102974kY = this.A00;
        if (interfaceC102974kY != null) {
            return interfaceC102974kY.BOp();
        }
        return null;
    }

    @Override // X.InterfaceC102974kY
    public final InterfaceC102974kY BbE() {
        return this.A00;
    }

    @Override // X.InterfaceC102974kY
    public final String CAv() {
        List list = this.A01;
        if (list != null) {
            return AbstractC001800i.A0P(":", "", "", list, null);
        }
        return null;
    }

    @Override // X.InterfaceC102974kY
    public final InterfaceC102974kY Cme(InterfaceC102974kY interfaceC102974kY) {
        return new C102964kX(interfaceC102974kY, this.A01);
    }

    public C102964kX(InterfaceC102974kY interfaceC102974kY, List list) {
        this.A00 = interfaceC102974kY;
        this.A01 = list;
    }
}
