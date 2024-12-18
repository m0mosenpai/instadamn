package X;

/* renamed from: X.WSp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70361WSp implements InterfaceC71967XCx {
    public int A00;
    public int A01;
    public int A02;
    public C69793VvZ A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final XE2 A0A;
    public final WFZ A09 = new WFZ(new byte[10]);
    public int A03 = 0;

    @Override // X.InterfaceC71967XCx
    public final void EMb() {
        this.A03 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A0A.EMb();
    }

    private boolean A00(WFa wFa, byte[] bArr, int i) {
        int i2 = wFa.A00 - wFa.A01;
        int i3 = this.A00;
        int min = Math.min(i2, i - i3);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wFa.A0P(min);
        } else {
            wFa.A0R(bArr, i3, min);
        }
        int i4 = this.A00 + min;
        this.A00 = i4;
        if (i4 == i) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0060 -> B:13:0x0032). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC71967XCx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJZ(X.WFa r13, int r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70361WSp.AJZ(X.WFa, int):void");
    }

    @Override // X.InterfaceC71967XCx
    public final void CNd(C69793VvZ c69793VvZ, InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        this.A04 = c69793VvZ;
        this.A0A.ANM(interfaceC72026XFo, w4q);
    }

    public C70361WSp(XE2 xe2) {
        this.A0A = xe2;
    }
}
