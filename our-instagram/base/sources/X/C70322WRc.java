package X;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.WRc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70322WRc implements XE1 {
    public static final int A0D;
    public static final int[] A0E = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] A0F;
    public static final byte[] A0G;
    public static final byte[] A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public InterfaceC72026XFo A06;
    public InterfaceC71878X8l A07;
    public XG2 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final byte[] A0C;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0F = iArr;
        Charset charset = AbstractC50482Ts.A05;
        A0G = "#!AMR\n".getBytes(charset);
        A0H = "#!AMR-WB\n".getBytes(charset);
        A0D = iArr[8];
    }

    private boolean A00(XGj xGj) {
        byte[] bArr = A0G;
        xGj.EJn();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        xGj.E3s(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.A0B = false;
        } else {
            bArr = A0H;
            xGj.EJn();
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            xGj.E3s(bArr3, 0, length2);
            if (!Arrays.equals(bArr3, bArr)) {
                return false;
            }
            this.A0B = true;
        }
        xGj.Em8(bArr.length);
        return true;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A06 = interfaceC72026XFo;
        this.A08 = interfaceC72026XFo.F87(0, 1);
        interfaceC72026XFo.ASd();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r12, X.VZk r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70322WRc.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A04 = 0L;
        this.A01 = 0;
        this.A00 = 0;
        if (j != 0) {
            InterfaceC71878X8l interfaceC71878X8l = this.A07;
            if (interfaceC71878X8l instanceof AbstractC70343WRx) {
                this.A05 = AbstractC65703TsZ.A08(j - ((AbstractC70343WRx) interfaceC71878X8l).A03) / r3.A00;
                return;
            }
        }
        this.A05 = 0L;
    }

    public C70322WRc(int i) {
        this.A0C = new byte[1];
        this.A02 = -1;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        return A00(xGj);
    }

    public C70322WRc() {
        this(0);
    }
}
