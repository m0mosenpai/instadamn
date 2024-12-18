package X;

import java.util.List;

/* renamed from: X.6Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136266Fe implements InterfaceC103374lD {
    public final C136256Fd A00;
    public final C103414lH A01;
    public final Object[] A02;
    public final Object[] A03;

    @Override // X.InterfaceC103384lE
    public final /* bridge */ /* synthetic */ InterfaceC103384lE AKr(InterfaceC102974kY interfaceC102974kY, List list) {
        C103414lH c103414lH;
        C103414lH c103414lH2 = this.A01;
        if (c103414lH2 != null) {
            InterfaceC102974kY interfaceC102974kY2 = c103414lH2.A00;
            if (interfaceC102974kY != null && interfaceC102974kY2 != null) {
                interfaceC102974kY2 = interfaceC102974kY2.Cme(interfaceC102974kY);
            }
            if (null == c103414lH2.A01 && interfaceC102974kY2 == interfaceC102974kY2) {
                c103414lH = c103414lH2;
            } else {
                c103414lH = new C103414lH(interfaceC102974kY2, null);
            }
            if (c103414lH != c103414lH2) {
                return new C136266Fe(this.A00, c103414lH, this.A02, this.A03);
            }
        }
        return this;
    }

    @Override // X.InterfaceC103374lD
    public final void ASn(C6FR c6fr) {
    }

    @Override // X.InterfaceC103374lD
    public final C136266Fe F9w() {
        return this;
    }

    @Override // X.InterfaceC103384lE
    public final String Bqx() {
        return this.A00.A03.A00;
    }

    @Override // X.InterfaceC103384lE
    public final InterfaceC102974kY Byi() {
        C103414lH c103414lH = this.A01;
        if (c103414lH == null) {
            return null;
        }
        return c103414lH.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r5.length > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C136266Fe(X.C136256Fd r3, X.C103414lH r4, java.lang.Object[] r5, java.lang.Object[] r6) {
        /*
            r2 = this;
            r2.<init>()
            r3.getClass()
            r2.A00 = r3
            r2.A02 = r5
            r2.A03 = r6
            r2.A01 = r4
            if (r5 == 0) goto L14
            int r0 = r5.length
            r1 = 0
            if (r0 <= 0) goto L15
        L14:
            r1 = 1
        L15:
            java.lang.String r0 = "boundArgs must not be empty; use null"
            X.C6Ff.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136266Fe.<init>(X.6Fd, X.4lH, java.lang.Object[], java.lang.Object[]):void");
    }
}
