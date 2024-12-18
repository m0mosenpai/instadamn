package X;

/* renamed from: X.RLm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60677RLm extends AbstractC60679RLo {
    public final char A00;

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = this.A00;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return AnonymousClass001.A0g("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    public C60677RLm(char c) {
        this.A00 = c;
    }
}
