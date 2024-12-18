package X;

/* loaded from: classes11.dex */
public final class WRZ implements XE1 {
    public int A00;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public InterfaceC72026XFo A06;
    public C66405UFq A07;
    public C66406UFr A08;
    public boolean A09;
    public boolean A0A;
    public final WFa A0E = new WFa(4);
    public final WFa A0B = new WFa(9);
    public final WFa A0C = new WFa(11);
    public final WFa A0F = new WFa();
    public final C66407UFs A0D = new C66407UFs();
    public int A01 = 1;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        if (j == 0) {
            this.A01 = 1;
            this.A09 = false;
        } else {
            this.A01 = 3;
        }
        this.A00 = 0;
    }

    private WFa A00(XGj xGj) {
        int i = this.A02;
        WFa wFa = this.A0F;
        int length = wFa.A02.length;
        if (i > length) {
            wFa.A0Q(new byte[Math.max(length * 2, i)], 0);
        } else {
            wFa.A0O(0);
        }
        wFa.A0N(this.A02);
        xGj.readFully(wFa.A02, 0, this.A02);
        return wFa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (X.MSY.A1S(r12, 5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (r11.A03(r10, r0) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0060, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0082  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.UFq, X.Vqf] */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r15, X.VZk r16) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRZ.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        WFa wFa = this.A0E;
        xGj.E3s(wFa.A02, 0, 3);
        wFa.A0O(0);
        if (wFa.A06() != 4607062) {
            return false;
        }
        xGj.E3s(wFa.A02, 0, 2);
        wFa.A0O(0);
        if ((wFa.A08() & C8S8.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        xGj.E3s(wFa.A02, 0, 4);
        wFa.A0O(0);
        int A01 = wFa.A01();
        xGj.EJn();
        xGj.AB0(A01);
        xGj.E3s(wFa.A02, 0, 4);
        wFa.A0O(0);
        if (wFa.A01() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A06 = interfaceC72026XFo;
    }
}
