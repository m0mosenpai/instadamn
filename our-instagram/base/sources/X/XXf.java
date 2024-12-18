package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

/* loaded from: classes12.dex */
public final class XXf extends AbstractC95034Pm {
    public static final C95044Pn A03 = new Object();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    @Override // X.AbstractC95034Pm
    public final void A0I() {
    }

    @Override // X.AbstractC95034Pm
    public final void A0J() {
        A0L((byte) 0);
    }

    @Override // X.AbstractC95034Pm
    public final void A0K() {
    }

    @Override // X.AbstractC95034Pm
    public final void A0U(C95044Pn c95044Pn) {
    }

    @Override // X.AbstractC95034Pm
    public final void A0Y(byte[] bArr) {
        int length = bArr.length;
        A0O(length);
        super.A00.A01(bArr, length);
    }

    public XXf(C4PN c4pn) {
        super.A00 = c4pn;
        this.A02 = new byte[8];
        this.A00 = -1L;
        this.A01 = -1L;
    }

    private void A00(int i) {
        if (i >= 0) {
            long j = this.A01;
            if (j > 0 && i > j) {
                throw new RuntimeException(String.format(AbstractC111324zv.A00(1558), Integer.valueOf(i), Long.valueOf(j)));
            }
            return;
        }
        throw new RuntimeException(AnonymousClass001.A0O(AbstractC111324zv.A00(320), i));
    }

    @Override // X.AbstractC95034Pm
    public final byte A06() {
        C4PO c4po = C4PN.A02;
        byte[] bArr = this.A02;
        super.A00.A00(bArr, 1);
        return bArr[0];
    }

    @Override // X.AbstractC95034Pm
    public final int A09() {
        byte[] bArr = this.A02;
        C4PO c4po = C4PN.A02;
        super.A00.A00(bArr, 4);
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    @Override // X.AbstractC95034Pm
    public final long A0A() {
        byte[] bArr = this.A02;
        C4PO c4po = C4PN.A02;
        super.A00.A00(bArr, 8);
        return (bArr[7] & 255) | ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    @Override // X.AbstractC95034Pm
    public final short A0H() {
        byte[] bArr = this.A02;
        C4PO c4po = C4PN.A02;
        super.A00.A00(bArr, 2);
        return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
    }

    @Override // X.AbstractC95034Pm
    public final void A0L(byte b) {
        byte[] bArr = this.A02;
        bArr[0] = b;
        super.A00.A01(bArr, 1);
    }

    @Override // X.AbstractC95034Pm
    public final void A0O(int i) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        super.A00.A01(bArr, 4);
    }

    @Override // X.AbstractC95034Pm
    public final void A0P(long j) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        super.A00.A01(bArr, 8);
    }

    @Override // X.AbstractC95034Pm
    public final void A0Q(C95054Po c95054Po) {
        A0L(c95054Po.A00);
        A0W(c95054Po.A03);
    }

    @Override // X.AbstractC95034Pm
    public final void A0R(C73293Xzi c73293Xzi) {
        A0L(c73293Xzi.A00);
        A0O(c73293Xzi.A01);
    }

    @Override // X.AbstractC95034Pm
    public final void A0S(C73303Xzu c73303Xzu) {
        A0L(c73303Xzu.A00);
        A0L(c73303Xzu.A01);
        A0O(c73303Xzu.A02);
    }

    @Override // X.AbstractC95034Pm
    public final void A0T(C73294Xzj c73294Xzj) {
        A0L(c73294Xzj.A00);
        A0O(c73294Xzj.A01);
    }

    @Override // X.AbstractC95034Pm
    public final void A0V(String str) {
        byte[] bytes = str.getBytes(AbstractC95084Ps.A00);
        int length = bytes.length;
        A0O(length);
        super.A00.A01(bytes, length);
    }

    @Override // X.AbstractC95034Pm
    public final void A0W(short s) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        super.A00.A01(bArr, 2);
    }

    public final void A0b(byte b) {
        int i = b & 15;
        if (i == 2 || i == 3 || i == 4 || i == 6 || i == 8 || i == 19) {
            return;
        }
        switch (i) {
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
                return;
            default:
                throw new RuntimeException(AnonymousClass001.A0O(AbstractC111324zv.A00(1833), (byte) i));
        }
    }

    @Override // X.AbstractC95034Pm
    public final double A07() {
        return Double.longBitsToDouble(A0A());
    }

    @Override // X.AbstractC95034Pm
    public final float A08() {
        return Float.intBitsToFloat(A09());
    }

    @Override // X.AbstractC95034Pm
    public final C95054Po A0B() {
        short A0H;
        byte A06 = A06();
        if (A06 == 0) {
            A0H = 0;
        } else {
            A0H = A0H();
        }
        return new C95054Po("", A06, A0H);
    }

    @Override // X.AbstractC95034Pm
    public final C73293Xzi A0C() {
        byte A06 = A06();
        int A09 = A09();
        A00(A09);
        A0b(A06);
        C4PO c4po = C4PN.A02;
        return new C73293Xzi(A09, A06);
    }

    @Override // X.AbstractC95034Pm
    public final C73303Xzu A0D() {
        byte A06 = A06();
        byte A062 = A06();
        int A09 = A09();
        A00(A09);
        A0b(A06);
        A0b(A062);
        C4PO c4po = C4PN.A02;
        return new C73303Xzu(A06, A062, A09);
    }

    @Override // X.AbstractC95034Pm
    public final C73294Xzj A0E() {
        byte A06 = A06();
        int A09 = A09();
        A00(A09);
        A0b(A06);
        C4PO c4po = C4PN.A02;
        return new C73294Xzj(A09, A06);
    }

    @Override // X.AbstractC95034Pm
    public final String A0G() {
        int A09 = A09();
        if (A09 >= 0) {
            long j = this.A00;
            if (j > 0 && A09 > j) {
                throw new RuntimeException(String.format(AbstractC111324zv.A00(1803), Integer.valueOf(A09), Long.valueOf(j)));
            }
            C4PO c4po = C4PN.A02;
            byte[] bArr = new byte[A09];
            super.A00.A00(bArr, A09);
            return new String(bArr, AbstractC95084Ps.A00);
        }
        throw new RuntimeException(AnonymousClass001.A0O(AbstractC111324zv.A00(320), A09));
    }

    @Override // X.AbstractC95034Pm
    public final void A0M(double d) {
        A0P(Double.doubleToLongBits(d));
    }

    @Override // X.AbstractC95034Pm
    public final void A0N(float f) {
        A0O(Float.floatToIntBits(f));
    }

    @Override // X.AbstractC95034Pm
    public final boolean A0Z() {
        if (A06() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC95034Pm
    public final byte[] A0a() {
        int A09 = A09();
        C4PO c4po = C4PN.A02;
        byte[] bArr = new byte[A09];
        super.A00.A00(bArr, A09);
        return bArr;
    }

    @Override // X.AbstractC95034Pm
    public final C95044Pn A0F(Map map) {
        return A03;
    }

    @Override // X.AbstractC95034Pm
    public final void A0X(boolean z) {
        A0L(z ? (byte) 1 : (byte) 0);
    }
}
