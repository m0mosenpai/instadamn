package X;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* renamed from: X.T8o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64305T8o implements InterfaceC65429Tk0 {
    public static final byte[] A04 = {0};
    public final int A00;
    public final InterfaceC65431Tk2 A01;
    public final byte[] A02;
    public final byte[] A03;

    @Override // X.InterfaceC65429Tk0
    public final byte[] AIv(byte[] data) {
        byte[] AIq;
        byte[] bArr = this.A03;
        int length = bArr.length;
        byte[][] bArr2 = new byte[2];
        bArr2[0] = this.A02;
        if (length > 0) {
            AIq = this.A01.AIq(AbstractC63315ShN.A01(data, bArr), this.A00);
        } else {
            AIq = this.A01.AIq(data, this.A00);
        }
        bArr2[1] = AIq;
        return AbstractC63315ShN.A04(bArr2);
    }

    public C64305T8o(InterfaceC65431Tk2 wrappedPrf, int tagSize) {
        this.A01 = wrappedPrf;
        this.A00 = tagSize;
        this.A02 = new byte[0];
        this.A03 = new byte[0];
        if (tagSize >= 10) {
            wrappedPrf.AIq(new byte[0], tagSize);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public C64305T8o(C60798RTj key) {
        byte[] bArr;
        EnumC61068Rei enumC61068Rei = T96.A04;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HMAC");
        C60800RTl c60800RTl = key.A00;
        this.A01 = new T96(AbstractC166997dE.A0v(c60800RTl.A02, A1C), AbstractC58318PtA.A16("HMAC", key.A02.A00.A01()));
        this.A00 = c60800RTl.A01;
        this.A02 = key.A01.A01();
        if (c60800RTl.A03.equals(SY9.A02)) {
            bArr = Arrays.copyOf(A04, 1);
        } else {
            bArr = new byte[0];
        }
        this.A03 = bArr;
    }

    public C64305T8o(C60797RTi key) {
        byte[] bArr;
        EnumC61068Rei enumC61068Rei = T95.A03;
        this.A01 = new T95(key.A02.A00.A01());
        C60799RTk c60799RTk = key.A00;
        this.A00 = c60799RTk.A01;
        this.A02 = key.A01.A01();
        if (c60799RTk.A02.equals(SY8.A02)) {
            bArr = Arrays.copyOf(A04, 1);
        } else {
            bArr = new byte[0];
        }
        this.A03 = bArr;
    }
}
