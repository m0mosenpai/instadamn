package X;

/* renamed from: X.XcR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC72391XcR {
    A0C("TERMINATOR", new int[]{0, 0, 0}),
    A0A("NUMERIC", new int[]{10, 12, 14}),
    A03("ALPHANUMERIC", new int[]{9, 11, 13}),
    A0B("STRUCTURED_APPEND", new int[]{0, 0, 0}),
    A04("BYTE", new int[]{8, 16, 16}),
    A05("ECI", new int[]{0, 0, 0}),
    A09("KANJI", new int[]{8, 10, 12}),
    A06("FNC1_FIRST_POSITION", new int[]{0, 0, 0}),
    A07("FNC1_SECOND_POSITION", new int[]{0, 0, 0}),
    A08("HANZI", new int[]{8, 10, 12});

    public final int A00;
    public final int[] A01;

    public final int A00(Y7W y7w) {
        char c;
        int i = y7w.A01;
        if (i <= 9) {
            c = 0;
        } else {
            c = 2;
            if (i <= 26) {
                c = 1;
            }
        }
        return this.A01[c];
    }

    EnumC72391XcR(String str, int[] iArr) {
        this.A01 = iArr;
        this.A00 = r2;
    }
}
