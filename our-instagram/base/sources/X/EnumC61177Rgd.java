package X;

import java.util.HashMap;

/* renamed from: X.Rgd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61177Rgd {
    SHA256(1, 32),
    SHA384(2, 48),
    /* JADX INFO: Fake field, exist only in values array */
    SHA512(3, 64);

    public static final HashMap A02 = AbstractC166987dD.A1G();
    public final int A00;
    public final int A01;

    static {
        for (EnumC61177Rgd enumC61177Rgd : values()) {
            AbstractC58319PtB.A1H(enumC61177Rgd, A02, enumC61177Rgd.A01);
        }
    }

    EnumC61177Rgd(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
