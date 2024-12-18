package X;

/* renamed from: X.RPd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60739RPd extends AbstractC60744RPi {
    public final char A00;
    public final char A01;

    public static C60739RPd A00() {
        return new C60739RPd('0', '9');
    }

    public final String toString() {
        return AnonymousClass001.A11("CharMatcher.inRange('", AbstractC64290T7z.A02(this.A01), "', '", AbstractC64290T7z.A02(this.A00), "')");
    }

    public C60739RPd(char startInclusive, char endInclusive) {
        C18C.A0E(AbstractC43593JPy.A1Z(endInclusive, startInclusive));
        this.A01 = startInclusive;
        this.A00 = endInclusive;
    }
}
