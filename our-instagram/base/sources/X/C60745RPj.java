package X;

import java.util.Arrays;

/* renamed from: X.RPj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60745RPj extends AbstractC64290T7z {
    public final char[] A00;

    @Override // X.InterfaceC28041Xi
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object character) {
        return A09(((Character) character).charValue());
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("CharMatcher.anyOf(\"");
        for (char c : this.A00) {
            A0s.append(AbstractC64290T7z.A02(c));
        }
        return AbstractC166997dE.A0x("\")", A0s);
    }

    public C60745RPj(CharSequence chars) {
        char[] charArray = chars.toString().toCharArray();
        this.A00 = charArray;
        Arrays.sort(charArray);
    }
}
