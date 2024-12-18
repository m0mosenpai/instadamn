package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ACF {
    public boolean A00;
    public final Y2I A01;
    public final InterfaceC178407wE A02;
    public final InterfaceC179577y7 A03 = new C23496AbC(this);
    public volatile boolean A04;

    public final void A00() {
        Y2I y2i = this.A01;
        InterfaceC179187xU interfaceC179187xU = y2i.A0M;
        if (interfaceC179187xU != null) {
            interfaceC179187xU.F9Y(this.A03, EnumC179217xX.A0F);
        }
        y2i.A02();
        if (this.A00) {
            this.A02.Ckt(22, 0);
        }
        this.A00 = false;
    }

    public final void A01() {
        if (!this.A00) {
            this.A02.Ckt(19, 0);
        }
        this.A00 = true;
        Y2I y2i = this.A01;
        y2i.A07(C05F.A00);
        C73348Y9d.A01(y2i.A0J, new Object[0], 6);
        this.A04 = false;
        InterfaceC179187xU interfaceC179187xU = y2i.A0M;
        if (interfaceC179187xU != null) {
            interfaceC179187xU.EDH(this.A03, EnumC179217xX.A0F);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Ab4, java.lang.Object] */
    public ACF(Y2I y2i, InterfaceC178407wE interfaceC178407wE) {
        this.A01 = y2i;
        this.A02 = interfaceC178407wE;
        ArrayList A1E = AbstractC166987dD.A1E();
        ?? obj = new Object();
        C23017ACw c23017ACw = new C23017ACw(new AVW(obj), -1);
        obj.A02 = c23017ACw;
        obj.A01 = 1;
        obj.A00 = 1;
        c23017ACw.A01 = 480;
        c23017ACw.A02(c23017ACw.A03, c23017ACw.A00);
        A1E.add(obj);
        A1E.add(new C23490Ab5());
        C73348Y9d.A00(y2i.A0J, A1E, 26);
        y2i.A08 = C05F.A0C;
        this.A00 = false;
    }
}
