package X;

import com.facebook.forker.Process;

/* renamed from: X.WSa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70346WSa implements XE2 {
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public XG2 A0A;
    public C69041Vgi A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G = 0;
    public boolean A0H;
    public final WFZ A0I;
    public final WFa A0J;
    public final WFa A0K;

    @Override // X.XE2
    public final void E3B(boolean z) {
    }

    @Override // X.XE2
    public final void EMb() {
        this.A0G = 0;
        this.A07 = 0;
        this.A0J.A0M(2);
        this.A04 = 0;
        this.A03 = 0;
        this.A05 = Process.WAIT_RESULT_STOPPED;
        this.A06 = -1;
        this.A08 = 0;
        this.A09 = -1L;
        this.A0D = false;
        this.A0E = false;
        this.A0H = true;
        this.A0F = true;
        this.A00 = -9.223372036854776E18d;
        this.A01 = -9.223372036854776E18d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0093, code lost:
    
        if (r2 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03ab, code lost:
    
        throw new X.VCM(r0, null, 1, true);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:201:0x03f4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:227:0x0202. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0419 A[SYNTHETIC] */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r22) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70346WSa.AJY(X.WFa):void");
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A02 = i;
        if (!this.A0F && (this.A03 != 0 || !this.A0H)) {
            this.A0E = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.A0E) {
                this.A01 = d;
            } else {
                this.A00 = d;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.WFa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Vgi] */
    public C70346WSa() {
        ?? obj = new Object();
        obj.A02 = new byte[15];
        obj.A00 = 2;
        this.A0J = obj;
        this.A0I = new WFZ();
        this.A0K = new WFa();
        this.A0B = new Object();
        this.A05 = Process.WAIT_RESULT_STOPPED;
        this.A06 = -1;
        this.A09 = -1L;
        this.A0F = true;
        this.A0H = true;
        this.A00 = -9.223372036854776E18d;
        this.A01 = -9.223372036854776E18d;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A0C = w4q.A01;
        W4Q.A00(w4q);
        this.A0A = interfaceC72026XFo.F87(w4q.A00, 1);
    }
}
