package X;

import androidx.media3.common.Metadata;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.WRb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70321WRb implements XE1 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Metadata A05;
    public InterfaceC72026XFo A06;
    public C70166WEi A07;
    public XG2 A08;
    public C66400UFl A09;
    public final WFa A0A;
    public final C68651VZj A0B;
    public final byte[] A0C;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.A03 = 0;
        } else {
            C66400UFl c66400UFl = this.A09;
            if (c66400UFl != null) {
                c66400UFl.A01(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.A04 = j3;
        this.A00 = 0;
        this.A0A.A0M(0);
    }

    private void A00() {
        this.A08.ELS(null, 1, this.A00, 0, (this.A04 * 1000000) / this.A07.A07);
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A06 = interfaceC72026XFo;
        this.A08 = interfaceC72026XFo.F87(0, 1);
        interfaceC72026XFo.ASd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x021c, code lost:
    
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
    
        r1 = r1.A00;
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.UFl, X.Vtw] */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r30, X.VZk r31) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70321WRb.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        new C69515Vqe().A00(xGj, Q95.A01);
        WFa wFa = new WFa(4);
        xGj.E3s(wFa.A02, 0, 4);
        if (wFa.A0C() != 1716281667) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.WFa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.VZj] */
    public C70321WRb(int i) {
        this.A0C = new byte[42];
        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
        ?? obj = new Object();
        obj.A02 = bArr;
        obj.A00 = 0;
        this.A0A = obj;
        this.A0B = new Object();
        this.A03 = 0;
    }

    public C70321WRb() {
        this(0);
    }
}
