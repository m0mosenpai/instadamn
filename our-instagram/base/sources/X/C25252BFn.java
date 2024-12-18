package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.BFn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25252BFn extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25252BFn(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = 0;
        this.A02 = androidEdgeEffectOverscrollEffect;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC16660sJ interfaceC16660sJ;
        int i;
        switch (this.A03) {
            case 0:
                C25252BFn c25252BFn = new C25252BFn((AndroidEdgeEffectOverscrollEffect) this.A02, interfaceC23621Ds);
                c25252BFn.A01 = obj;
                return c25252BFn;
            case 1:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                i = 1;
                C25252BFn c25252BFn2 = new C25252BFn(interfaceC23621Ds, interfaceC16660sJ, i);
                c25252BFn2.A02 = obj;
                return c25252BFn2;
            case 2:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                i = 2;
                C25252BFn c25252BFn22 = new C25252BFn(interfaceC23621Ds, interfaceC16660sJ, i);
                c25252BFn22.A02 = obj;
                return c25252BFn22;
            default:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                i = 3;
                C25252BFn c25252BFn222 = new C25252BFn(interfaceC23621Ds, interfaceC16660sJ, i);
                c25252BFn222.A02 = obj;
                return c25252BFn222;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0135 -> B:34:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x016b -> B:68:0x014e). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25252BFn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C25252BFn) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25252BFn(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = interfaceC16660sJ;
    }
}
