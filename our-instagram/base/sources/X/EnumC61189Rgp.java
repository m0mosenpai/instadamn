package X;

import java.util.HashMap;

/* renamed from: X.Rgp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61189Rgp {
    AES128GCM(1, 16),
    AES256GCM(2, 32),
    /* JADX INFO: Fake field, exist only in values array */
    CHACHA20POLY1305(3, 32);

    public static final HashMap A04 = AbstractC166987dD.A1G();
    public final int A00;
    public final int A01 = 12;
    public final int A02 = 16;
    public final int A03;

    static {
        for (EnumC61189Rgp enumC61189Rgp : values()) {
            AbstractC58319PtB.A1H(enumC61189Rgp, A04, enumC61189Rgp.A03);
        }
    }

    EnumC61189Rgp(int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
    }
}
