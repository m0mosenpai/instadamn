package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class SO7 {
    public final Context A00;
    public final C62540SFr A01;
    public final C62477SDe A02;
    public final SLB A03;
    public final C62957SYz A04;
    public final SWL A05;

    public SO7(Context context, AbstractC61599RqO abstractC61599RqO, InterfaceC65489TlA interfaceC65489TlA) {
        SLB slb = new SLB(interfaceC65489TlA);
        C62957SYz c62957SYz = new C62957SYz(interfaceC65489TlA, slb.A01);
        C62477SDe c62477SDe = new C62477SDe();
        this.A00 = context;
        this.A01 = new C62540SFr(abstractC61599RqO);
        this.A03 = slb;
        this.A04 = c62957SYz;
        c62957SYz.A00 = new TKN(this);
        this.A02 = c62477SDe;
        this.A05 = new SWL(interfaceC65489TlA, this);
    }

    public final void A00() {
        InterfaceC65210Tfy abstractC64100SzH;
        InterfaceC65210Tfy abstractC64100SzH2;
        int intValue;
        C62664SLa A00 = AbstractC61801Rtv.A00(this.A00);
        if (!A00.A01 && !A00.A02) {
            SWL swl = this.A05;
            try {
                SO7 so7 = swl.A02;
                C62540SFr c62540SFr = so7.A01;
                C62539SFq c62539SFq = c62540SFr.A00;
                if (c62539SFq == null) {
                    C63166SeQ c63166SeQ = swl.A00;
                    String A002 = c62540SFr.A02.A00();
                    try {
                        try {
                            Bundle A0b = AbstractC166987dD.A0b();
                            A0b.putString("package_name", A002);
                            Bundle A003 = C63166SeQ.A00(A0b, c63166SeQ, "get_install_data");
                            c62539SFq = new C62539SFq((String) AbstractC61805Rtz.A00(A003, String.class, "version_name"), AbstractC58318PtA.A07(AbstractC61805Rtz.A00(A003, Integer.class, "version_code")), ((Long) AbstractC61805Rtz.A00(A003, Long.class, "total_download_size_bytes")).longValue());
                            c62540SFr.A00 = c62539SFq;
                        } catch (IllegalStateException e) {
                            throw new RkF(EnumC61155RgG.UNKNOWN, e);
                        } catch (Exception e2) {
                            throw new RkF(EnumC61155RgG.UNKNOWN, e2);
                        }
                    } catch (RkF e3) {
                        throw e3;
                    } catch (IllegalArgumentException | UnsupportedOperationException e4) {
                        throw new RkF(EnumC61155RgG.INTERNAL_UNRECOVERABLE, e4);
                    }
                }
                SIF A02 = swl.A00.A02(c62540SFr.A02.A00());
                if (!c62540SFr.A01 || ((intValue = A02.A04.intValue()) != 6 && intValue != 8)) {
                    c62540SFr.A01 = false;
                    switch (A02.A04.intValue()) {
                        case 0:
                        case 1:
                            abstractC64100SzH2 = new QKH(c62539SFq, so7);
                            break;
                        case 2:
                            abstractC64100SzH2 = new AbstractC64100SzH(so7);
                            break;
                        case 3:
                            abstractC64100SzH2 = new QKP(A02, so7);
                            break;
                        case 4:
                            abstractC64100SzH2 = new AbstractC64100SzH(so7);
                            break;
                        case 5:
                            abstractC64100SzH2 = new AbstractC64100SzH(so7);
                            break;
                        case 6:
                            abstractC64100SzH2 = new QKH(c62539SFq, so7);
                            break;
                        case 7:
                            abstractC64100SzH2 = new AbstractC64100SzH(so7);
                            break;
                        case 8:
                            abstractC64100SzH2 = new QKN(A02.A02, c62539SFq, so7);
                            break;
                        default:
                            abstractC64100SzH2 = new QKG(EnumC61155RgG.INTERNAL_UNRECOVERABLE, so7);
                            break;
                    }
                } else {
                    abstractC64100SzH2 = new QKH(c62539SFq, so7);
                }
                so7.A01(abstractC64100SzH2);
                return;
            } catch (RkF e5) {
                swl.A01.EmQ("OxygenInstallSDK_UNEXPECTED_STATE_EXCEPTION", e5);
                swl.A02.A01(SWL.A00(e5, swl));
                return;
            }
        }
        if (A00.A02) {
            abstractC64100SzH = new QKG(EnumC61155RgG.INTERNAL_UNRECOVERABLE, this);
        } else {
            abstractC64100SzH = new AbstractC64100SzH(this);
        }
        A01(abstractC64100SzH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r3.A00 instanceof X.InterfaceC65654TqT) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC65210Tfy r5) {
        /*
            r4 = this;
            X.SDe r3 = r4.A02
            if (r5 == 0) goto L2f
            X.Tfy r0 = r3.A00
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2f
        Lc:
            boolean r0 = r5 instanceof X.QKJ
            if (r0 == 0) goto L15
            java.util.Set r0 = r3.A01
            r0.clear()
        L15:
            X.SYz r2 = r4.A04
            java.util.Set r0 = r3.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            X.Tfy r0 = r3.A00
            boolean r1 = r0 instanceof X.InterfaceC65654TqT
            r0 = 1
            if (r1 == 0) goto L27
        L26:
            r0 = 0
        L27:
            boolean r0 = X.AbstractC31174DnI.A1b(r0)
            r2.A01(r0)
            return
        L2f:
            r3.A00 = r5
            if (r5 == 0) goto Lc
            java.util.Set r0 = r3.A01
            java.util.Iterator r1 = r0.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r1.next()
            X.Ku3 r0 = (X.C47230Ku3) r0
            X.3Iw r0 = r0.A00
            r0.F8s(r5)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SO7.A01(X.Tfy):void");
    }
}
