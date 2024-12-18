package X;

import com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient;

/* loaded from: classes9.dex */
public final class PYi extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYi(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A06 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A07 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        int i;
        switch (this.A03) {
            case 0:
                obj2 = this.A06;
                obj3 = this.A05;
                obj4 = this.A04;
                z = this.A07;
                i = 0;
                return new PYi(obj2, obj3, obj4, interfaceC23621Ds, i, z);
            case 1:
                return new PYi((O1L) this.A02, (AbstractC12990ll) this.A05, (IgPlayIntegrityAttestationClient) this.A06, (OMi) this.A04, interfaceC23621Ds, this.A00, this.A07);
            default:
                obj2 = this.A06;
                obj3 = this.A05;
                obj4 = this.A04;
                z = this.A07;
                i = 2;
                return new PYi(obj2, obj3, obj4, interfaceC23621Ds, i, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0243, code lost:
    
        if (r14 == null) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #6 {all -> 0x00ea, blocks: (B:10:0x0022, B:25:0x00d2), top: B:4:0x0018 }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYi) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYi(O1L o1l, AbstractC12990ll abstractC12990ll, IgPlayIntegrityAttestationClient igPlayIntegrityAttestationClient, OMi oMi, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = 1;
        this.A05 = abstractC12990ll;
        this.A06 = igPlayIntegrityAttestationClient;
        this.A00 = i;
        this.A02 = o1l;
        this.A04 = oMi;
        this.A07 = z;
    }
}
