package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* loaded from: classes9.dex */
public final class PYh extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYh(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
        this.A07 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        switch (this.A05) {
            case 0:
                obj2 = this.A06;
                obj3 = this.A07;
                i = 0;
                break;
            case 1:
                obj2 = this.A06;
                obj3 = this.A07;
                i = 1;
                break;
            default:
                PYh pYh = new PYh((AudioOverlayTrack) this.A06, (C50870Me1) this.A07, interfaceC23621Ds, this.A01, this.A00);
                pYh.A03 = obj;
                return pYh;
        }
        return new PYh(obj2, obj3, interfaceC23621Ds, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0162, code lost:
    
        if (r2 != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0123 A[Catch: IllegalStateException -> 0x01c2, Njj -> 0x0203, CancellationException -> 0x020b, TryCatch #2 {Njj -> 0x0203, CancellationException -> 0x020b, IllegalStateException -> 0x01c2, blocks: (B:8:0x0118, B:9:0x011b, B:11:0x0123, B:14:0x0126, B:16:0x0149, B:18:0x0151, B:21:0x0159, B:23:0x015d, B:26:0x0167, B:30:0x017d, B:28:0x01bf, B:37:0x0066, B:38:0x0069, B:40:0x006e, B:42:0x0071, B:44:0x007b, B:46:0x0089, B:48:0x0097, B:50:0x009e, B:53:0x00d4, B:55:0x00e4, B:59:0x00e7, B:61:0x00ed, B:63:0x00f0, B:67:0x002a, B:70:0x0050, B:71:0x0055, B:74:0x0053), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0126 A[Catch: IllegalStateException -> 0x01c2, Njj -> 0x0203, CancellationException -> 0x020b, TryCatch #2 {Njj -> 0x0203, CancellationException -> 0x020b, IllegalStateException -> 0x01c2, blocks: (B:8:0x0118, B:9:0x011b, B:11:0x0123, B:14:0x0126, B:16:0x0149, B:18:0x0151, B:21:0x0159, B:23:0x015d, B:26:0x0167, B:30:0x017d, B:28:0x01bf, B:37:0x0066, B:38:0x0069, B:40:0x006e, B:42:0x0071, B:44:0x007b, B:46:0x0089, B:48:0x0097, B:50:0x009e, B:53:0x00d4, B:55:0x00e4, B:59:0x00e7, B:61:0x00ed, B:63:0x00f0, B:67:0x002a, B:70:0x0050, B:71:0x0055, B:74:0x0053), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x023a -> B:76:0x0224). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x027c -> B:90:0x0266). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYh) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYh(AudioOverlayTrack audioOverlayTrack, C50870Me1 c50870Me1, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A05 = 2;
        this.A07 = c50870Me1;
        this.A06 = audioOverlayTrack;
        this.A01 = i;
        this.A00 = i2;
    }
}
