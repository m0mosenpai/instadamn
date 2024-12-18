package X;

import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;

/* renamed from: X.PaR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57188PaR extends AbstractC23611Dp implements InterfaceC16590sC {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57188PaR(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = i;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C57188PaR c57188PaR;
        if (this.A04 != 0) {
            boolean A1a = AbstractC166987dD.A1a(obj3);
            boolean A1a2 = AbstractC166987dD.A1a(obj4);
            c57188PaR = new C57188PaR(1, (InterfaceC23621Ds) obj5);
            c57188PaR.A00 = obj;
            c57188PaR.A01 = obj2;
            c57188PaR.A02 = A1a;
            c57188PaR.A03 = A1a2;
        } else {
            boolean A1a3 = AbstractC166987dD.A1a(obj);
            boolean A1a4 = AbstractC166987dD.A1a(obj2);
            c57188PaR = new C57188PaR(0, (InterfaceC23621Ds) obj5);
            c57188PaR.A02 = A1a3;
            c57188PaR.A03 = A1a4;
            c57188PaR.A00 = obj3;
            c57188PaR.A01 = obj4;
        }
        return c57188PaR.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.A04 != 0) {
            AbstractC09560e7.A00(obj);
            return new C54828OLn((InterfaceC57796PkO) this.A00, (MetaAiVoiceState) this.A01, this.A02, this.A03);
        }
        AbstractC09560e7.A00(obj);
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        Object obj2 = this.A00;
        C50526MSf c50526MSf = (C50526MSf) this.A01;
        if (!c50526MSf.A00 && !c50526MSf.A01 && (!z2 || !z3)) {
            z = true;
        } else {
            z = false;
        }
        return new C51758Mth(45, obj2, z);
    }
}
