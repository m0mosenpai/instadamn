package X;

import java.io.File;
import java.util.List;

/* renamed from: X.StG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63760StG implements InterfaceC65471Tko, InterfaceC65474Tkr {
    public int A00;
    public List A01;
    public int A02 = -1;
    public InterfaceC65617To8 A03;
    public File A04;
    public final InterfaceC65536Tm8 A05;
    public final C62757SPo A06;
    public final List A07;
    public volatile SFV A08;

    @Override // X.InterfaceC65471Tko
    public final void D9H(Object obj) {
        this.A05.D9F(this.A03, this.A03, this.A08.A01, C05F.A0C, obj);
    }

    @Override // X.InterfaceC65471Tko
    public final void DPj(Exception exc) {
        this.A05.D9E(this.A03, this.A08.A01, exc, C05F.A0C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r2 = r7.A01;
        r1 = r7.A00;
        r7.A00 = r1 + 1;
        r6 = (X.InterfaceC65477Tku) r2.get(r1);
        r5 = r7.A04;
        r3 = r7.A06;
        r7.A08 = r6.AEj(r3.A05, r5, r3.A01, r3.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r7.A08 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r3.A01(r7.A08.A01.Avg()) == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r7.A08.A01.ChQ(r3.A03, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        r7.A08 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r7.A00 >= r7.A01.size()) goto L31;
     */
    @Override // X.InterfaceC65474Tkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ene() {
        /*
            r7 = this;
        L0:
            java.util.List r0 = r7.A01     // Catch: java.lang.Throwable -> L93
            r4 = 0
            if (r0 == 0) goto L54
            int r1 = r7.A00     // Catch: java.lang.Throwable -> L93
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L93
            if (r1 >= r0) goto L54
            r0 = 0
            r7.A08 = r0     // Catch: java.lang.Throwable -> L93
        L10:
            int r1 = r7.A00     // Catch: java.lang.Throwable -> L93
            java.util.List r0 = r7.A01     // Catch: java.lang.Throwable -> L93
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L93
            if (r1 >= r0) goto L92
            java.util.List r2 = r7.A01     // Catch: java.lang.Throwable -> L93
            int r1 = r7.A00     // Catch: java.lang.Throwable -> L93
            int r0 = r1 + 1
            r7.A00 = r0     // Catch: java.lang.Throwable -> L93
            java.lang.Object r6 = r2.get(r1)     // Catch: java.lang.Throwable -> L93
            X.Tku r6 = (X.InterfaceC65477Tku) r6     // Catch: java.lang.Throwable -> L93
            java.io.File r5 = r7.A04     // Catch: java.lang.Throwable -> L93
            X.SPo r3 = r7.A06     // Catch: java.lang.Throwable -> L93
            int r2 = r3.A01     // Catch: java.lang.Throwable -> L93
            int r1 = r3.A00     // Catch: java.lang.Throwable -> L93
            X.Ssj r0 = r3.A05     // Catch: java.lang.Throwable -> L93
            X.SFV r0 = r6.AEj(r0, r5, r2, r1)     // Catch: java.lang.Throwable -> L93
            r7.A08 = r0     // Catch: java.lang.Throwable -> L93
            X.SFV r0 = r7.A08     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L10
            X.SFV r0 = r7.A08     // Catch: java.lang.Throwable -> L93
            X.Tn3 r0 = r0.A01     // Catch: java.lang.Throwable -> L93
            java.lang.Class r0 = r0.Avg()     // Catch: java.lang.Throwable -> L93
            X.SLR r0 = r3.A01(r0)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L10
            X.SFV r0 = r7.A08     // Catch: java.lang.Throwable -> L93
            X.Tn3 r1 = r0.A01     // Catch: java.lang.Throwable -> L93
            X.RfN r0 = r3.A03     // Catch: java.lang.Throwable -> L93
            r1.ChQ(r0, r7)     // Catch: java.lang.Throwable -> L93
            goto L91
        L54:
            int r0 = r7.A02     // Catch: java.lang.Throwable -> L93
            int r2 = r0 + 1
            r7.A02 = r2     // Catch: java.lang.Throwable -> L93
            java.util.List r1 = r7.A07     // Catch: java.lang.Throwable -> L93
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L93
            if (r2 >= r0) goto L92
            int r0 = r7.A02     // Catch: java.lang.Throwable -> L93
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Throwable -> L93
            X.To8 r3 = (X.InterfaceC65617To8) r3     // Catch: java.lang.Throwable -> L93
            X.SPo r2 = r7.A06     // Catch: java.lang.Throwable -> L93
            X.To8 r0 = r2.A04     // Catch: java.lang.Throwable -> L93
            X.Ssh r1 = new X.Ssh     // Catch: java.lang.Throwable -> L93
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L93
            X.SL0 r0 = r2.A07     // Catch: java.lang.Throwable -> L93
            X.Tks r0 = r0.A00()     // Catch: java.lang.Throwable -> L93
            java.io.File r1 = r0.AXN(r1)     // Catch: java.lang.Throwable -> L93
            r7.A04 = r1     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L0
            r7.A03 = r3     // Catch: java.lang.Throwable -> L93
            X.SQE r0 = X.InterfaceC65610To1.A00(r2)     // Catch: java.lang.Throwable -> L93
            java.util.List r0 = r0.A02(r1)     // Catch: java.lang.Throwable -> L93
            r7.A01 = r0     // Catch: java.lang.Throwable -> L93
            r7.A00 = r4     // Catch: java.lang.Throwable -> L93
            goto L0
        L91:
            r4 = 1
        L92:
            return r4
        L93:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63760StG.Ene():boolean");
    }

    @Override // X.InterfaceC65474Tkr
    public final void cancel() {
        SFV sfv = this.A08;
        if (sfv != null) {
            sfv.A01.cancel();
        }
    }

    public C63760StG(InterfaceC65536Tm8 interfaceC65536Tm8, C62757SPo c62757SPo, List list) {
        this.A07 = list;
        this.A06 = c62757SPo;
        this.A05 = interfaceC65536Tm8;
    }
}
