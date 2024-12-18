package X;

import java.nio.charset.Charset;

/* renamed from: X.SqB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63603SqB implements InterfaceC65555Tma {
    public final Q7P A00;

    @Override // X.InterfaceC65555Tma
    public final void FEQ(int i, boolean z) {
        Q7O q7o = (Q7O) this.A00;
        Q7O.A01(q7o, 11);
        q7o.A0E(i << 3);
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = q7o.A03;
        int i2 = q7o.A00;
        q7o.A00 = i2 + 1;
        bArr[i2] = b;
        q7o.A01++;
    }

    @Override // X.InterfaceC65555Tma
    public final void FEW(InterfaceC65588TnS interfaceC65588TnS, Object obj, int i) {
        Q7P q7p = this.A00;
        int i2 = i << 3;
        q7p.A05(i2 | 3);
        interfaceC65588TnS.FEq(q7p.A00, obj);
        q7p.A05(i2 | 4);
    }

    @Override // X.InterfaceC65555Tma
    public final void FEb(InterfaceC65588TnS interfaceC65588TnS, Object obj, int i) {
        Q7P q7p = this.A00;
        InterfaceC65625Tpl interfaceC65625Tpl = (InterfaceC65625Tpl) obj;
        AbstractC63226Sfd.A08(q7p, i);
        q7p.A05(AbstractC58375PuF.A03(interfaceC65588TnS, interfaceC65625Tpl));
        interfaceC65588TnS.FEq(q7p.A00, interfaceC65625Tpl);
    }

    @Override // X.InterfaceC65555Tma
    public final void FEh(int i, int i2) {
        Q7P q7p = this.A00;
        int A01 = AbstractC58318PtA.A01(i2);
        Q7O q7o = (Q7O) q7p;
        AbstractC63226Sfd.A06(q7o, i);
        q7o.A0E(A01);
    }

    public C63603SqB(Q7P q7p) {
        Charset charset = AbstractC58376PuG.A03;
        this.A00 = q7p;
        q7p.A00 = this;
    }
}
