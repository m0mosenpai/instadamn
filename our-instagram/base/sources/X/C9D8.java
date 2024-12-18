package X;

import androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1;

/* renamed from: X.9D8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9D8 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D8(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A03;
        long j = ((C119365at) obj2).A00;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        Object obj4 = this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C9D8 c9d8 = new C9D8(obj4, interfaceC23621Ds, i);
        c9d8.A02 = obj;
        c9d8.A01 = j;
        return c9d8.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC58269PsN interfaceC58269PsN = (InterfaceC58269PsN) this.A02;
            long j = this.A01;
            AbstractC114345Dz abstractC114345Dz = (AbstractC114345Dz) this.A04;
            if (abstractC114345Dz.A08) {
                this.A00 = 1;
                C5XO c5xo = abstractC114345Dz.A02;
                if (c5xo != null && AnonymousClass194.A00(this, new AbstractClickableNode$handlePressInteraction$2$1(abstractC114345Dz, interfaceC58269PsN, c5xo, null, j)) == c1jx) {
                    return c1jx;
                }
            }
        }
        return C0eB.A00;
    }
}
