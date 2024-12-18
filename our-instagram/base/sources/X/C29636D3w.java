package X;

/* renamed from: X.D3w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29636D3w extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29636D3w(BVY bvy, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = bvy;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A05) {
            case 0:
                C29636D3w c29636D3w = new C29636D3w((BVY) this.A01, interfaceC23621Ds);
                c29636D3w.A02 = obj;
                return c29636D3w;
            case 1:
                C29636D3w c29636D3w2 = new C29636D3w((C25779BaI) this.A04, interfaceC23621Ds);
                c29636D3w2.A01 = obj;
                return c29636D3w2;
            case 2:
                InterfaceC30782DgJ interfaceC30782DgJ = (InterfaceC30782DgJ) this.A02;
                C29636D3w c29636D3w3 = new C29636D3w((InterfaceC31064Dl6) this.A03, (CRA) this.A01, interfaceC30782DgJ, interfaceC23621Ds);
                c29636D3w3.A04 = obj;
                return c29636D3w3;
            default:
                C29636D3w c29636D3w4 = new C29636D3w(interfaceC23621Ds, (AbstractC50712Us) this.A01, (InterfaceC224417g) this.A02);
                c29636D3w4.A03 = obj;
                return c29636D3w4;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e8 -> B:26:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0142 -> B:49:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01b5 -> B:66:0x01c6). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29636D3w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C29636D3w) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29636D3w(InterfaceC31064Dl6 interfaceC31064Dl6, CRA cra, InterfaceC30782DgJ interfaceC30782DgJ, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = interfaceC30782DgJ;
        this.A01 = cra;
        this.A03 = interfaceC31064Dl6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29636D3w(InterfaceC23621Ds interfaceC23621Ds, AbstractC50712Us abstractC50712Us, InterfaceC224417g interfaceC224417g) {
        super(2, interfaceC23621Ds);
        this.A02 = interfaceC224417g;
        this.A01 = abstractC50712Us;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29636D3w(C25779BaI c25779BaI, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = c25779BaI;
    }
}
