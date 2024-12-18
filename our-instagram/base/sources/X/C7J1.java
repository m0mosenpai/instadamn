package X;

import java.nio.charset.Charset;

/* renamed from: X.7J1, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7J1 {
    public AbstractC115105If A00 = C7J2.A00();
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public InterfaceC2056798r A04;
    public boolean A05;
    public final /* synthetic */ C28811aJ A06;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A0M, 36321430321309113L) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A00() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7J1.A00():void");
    }

    public void A01() {
        C7J0 c7j0 = (C7J0) this;
        C129095sU c129095sU = c7j0.A00;
        if (c129095sU != null) {
            c129095sU.A06(c7j0);
            c7j0.A00 = null;
        }
    }

    public C7J1(InterfaceC2056798r interfaceC2056798r, C28811aJ c28811aJ) {
        this.A06 = c28811aJ;
        this.A04 = interfaceC2056798r;
    }

    public final void A02() {
        if (!this.A05 && !this.A01) {
            this.A05 = true;
            C28811aJ c28811aJ = this.A06;
            Charset charset = C28811aJ.A0v;
            c28811aJ.A0J.obtainMessage(9, this).sendToTarget();
            this.A04 = null;
        }
    }

    public final void A03() {
        C28811aJ c28811aJ = this.A06;
        Charset charset = C28811aJ.A0v;
        c28811aJ.A0J.obtainMessage(8, this).sendToTarget();
    }

    public final void A04(AbstractC115105If abstractC115105If, boolean z, boolean z2) {
        if (!this.A05 && !this.A01) {
            this.A01 = true;
            this.A03 = z;
            this.A02 = z2;
            this.A00 = abstractC115105If;
            InterfaceC2056798r interfaceC2056798r = this.A04;
            if (interfaceC2056798r != null) {
                interfaceC2056798r.Dn9(this);
            }
        }
    }
}
