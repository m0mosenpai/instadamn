package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;

/* renamed from: X.D3p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29634D3p extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29634D3p(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        if (this.A02 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C29634D3p c29634D3p = new C29634D3p(i, interfaceC23621Ds);
        c29634D3p.A01 = obj;
        return c29634D3p;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            return obj;
        }
        AbstractC09560e7.A00(obj);
        C6KZ c6kz = (C6KZ) this.A01;
        this.A00 = 1;
        Object A00 = TapGestureDetectorKt.A00(c6kz, EnumC25334BJd.Main, this);
        if (A00 != c1jx) {
            return A00;
        }
        return c1jx;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C29634D3p) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
