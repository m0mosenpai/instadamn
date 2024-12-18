package X;

import android.content.Context;

/* loaded from: classes9.dex */
public final class PYj extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01 = 1;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYj(Context context, C07X c07x, C54828OLn c54828OLn, C51029Mgc c51029Mgc, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A06 = c51029Mgc;
        this.A00 = c54828OLn;
        this.A03 = context;
        this.A02 = j;
        this.A04 = c07x;
        this.A05 = interfaceC16660sJ;
        this.A07 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i = this.A01;
        C51029Mgc c51029Mgc = (C51029Mgc) this.A06;
        if (i != 0) {
            PYj pYj = new PYj((Context) this.A03, (C07X) this.A04, c51029Mgc, interfaceC23621Ds, (InterfaceC16660sJ) this.A05, this.A02, this.A07);
            pYj.A00 = obj;
            return pYj;
        }
        C54828OLn c54828OLn = (C54828OLn) this.A00;
        return new PYj((Context) this.A03, (C07X) this.A04, c54828OLn, c51029Mgc, interfaceC23621Ds, (InterfaceC16660sJ) this.A05, this.A02, this.A07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b1, code lost:
    
        if (r4.length() == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02fa, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02fe, code lost:
    
        if (r4 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00ed, code lost:
    
        if (r12 != null) goto L40;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYj) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYj(Context context, C07X c07x, C51029Mgc c51029Mgc, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A06 = c51029Mgc;
        this.A03 = context;
        this.A02 = j;
        this.A04 = c07x;
        this.A05 = interfaceC16660sJ;
        this.A07 = z;
    }
}
