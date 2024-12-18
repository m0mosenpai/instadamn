package X;

import java.util.ArrayList;

/* renamed from: X.4kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102984kZ implements InterfaceC102974kY {
    public final C102814kI A00;
    public final InterfaceC102974kY A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206859Dq(this, 0));

    @Override // X.InterfaceC102974kY
    public final SOW Agb() {
        ArrayList arrayList = new ArrayList();
        InterfaceC102974kY interfaceC102974kY = this.A01;
        String CAv = interfaceC102974kY.CAv();
        InterfaceC09390do interfaceC09390do = this.A02;
        C22897A7r c22897A7r = (C22897A7r) interfaceC09390do.getValue();
        String str = null;
        if (c22897A7r != null) {
            arrayList.addAll(c22897A7r.A02);
        }
        if (CAv != null && CAv.length() != 0) {
            arrayList.add(CAv);
        }
        C22897A7r c22897A7r2 = (C22897A7r) interfaceC09390do.getValue();
        if (c22897A7r2 != null) {
            str = c22897A7r2.A01;
        }
        return new SOW(interfaceC102974kY.BbE(), AnonymousClass001.A0T(str, AbstractC001800i.A0P(":", "", "", arrayList, null), '|'));
    }

    @Override // X.InterfaceC102974kY
    public final String BOp() {
        String str;
        C22897A7r c22897A7r = (C22897A7r) this.A02.getValue();
        if (c22897A7r == null || (str = c22897A7r.A00) == null) {
            InterfaceC102974kY BbE = this.A01.BbE();
            if (BbE != null) {
                return BbE.BOp();
            }
            return null;
        }
        return str;
    }

    @Override // X.InterfaceC102974kY
    public final InterfaceC102974kY BbE() {
        return this.A01.BbE();
    }

    @Override // X.InterfaceC102974kY
    public final String CAv() {
        return this.A01.CAv();
    }

    @Override // X.InterfaceC102974kY
    public final InterfaceC102974kY Cme(InterfaceC102974kY interfaceC102974kY) {
        return new C102984kZ(this.A00, this.A01.Cme(interfaceC102974kY));
    }

    public C102984kZ(C102814kI c102814kI, InterfaceC102974kY interfaceC102974kY) {
        this.A01 = interfaceC102974kY;
        this.A00 = c102814kI;
    }
}
