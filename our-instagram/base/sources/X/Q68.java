package X;

import java.text.BreakIterator;

/* loaded from: classes10.dex */
public final class Q68 extends AbstractC63584Spr {
    public final BreakIterator A00;
    public final CharSequence A01;

    public Q68(CharSequence charSequence) {
        this.A01 = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.A00 = characterInstance;
    }
}
