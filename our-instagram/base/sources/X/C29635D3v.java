package X;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;

/* renamed from: X.D3v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29635D3v extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29635D3v(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, C15370ps c15370ps, C19L c19l) {
        super(2, interfaceC23621Ds);
        this.A03 = 2;
        this.A04 = c19l;
        this.A05 = interfaceC16660sJ;
        this.A06 = interfaceC16660sJ2;
        this.A01 = c15370ps;
        this.A07 = pressGestureScopeImpl;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29635D3v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC16660sJ interfaceC16660sJ;
        InterfaceC16620sF interfaceC16620sF;
        InterfaceC16820sZ interfaceC16820sZ;
        InterfaceC16820sZ interfaceC16820sZ2;
        int i;
        switch (this.A03) {
            case 0:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A06;
                interfaceC16620sF = (InterfaceC16620sF) this.A07;
                interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                interfaceC16820sZ2 = (InterfaceC16820sZ) this.A04;
                i = 0;
                break;
            case 1:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A06;
                interfaceC16620sF = (InterfaceC16620sF) this.A07;
                interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                interfaceC16820sZ2 = (InterfaceC16820sZ) this.A04;
                i = 1;
                break;
            default:
                C19L c19l = (C19L) this.A04;
                C29635D3v c29635D3v = new C29635D3v((PressGestureScopeImpl) this.A07, interfaceC23621Ds, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, (C15370ps) this.A01, c19l);
                c29635D3v.A02 = obj;
                return c29635D3v;
        }
        C29635D3v c29635D3v2 = new C29635D3v(interfaceC23621Ds, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16620sF, i);
        c29635D3v2.A01 = obj;
        return c29635D3v2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C29635D3v) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29635D3v(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A06 = interfaceC16660sJ;
        this.A07 = interfaceC16620sF;
        this.A05 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
    }
}
