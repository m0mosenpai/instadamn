package X;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class U3K {
    public static final U3K A01 = new Object();
    public static final U3M A00 = new U3M();
    public static final C11L A02 = new C11L(".*[ऀ-ॿঀ-\u09ff\u0a00-\u0a7f\u0a80-૿\u0b00-\u0b7f\u0b80-\u0bffఀ-౿ಀ-\u0cffഀ-ൿ\u0d80-\u0dff\u0e00-\u0e7f\u0e80-\u0effༀ-\u0fffက-႟ᜀ-ᜟᜠ-\u173fᝀ-\u175fᝠ-\u177fក-\u17ffᤀ-᥏ᥐ-\u197fᦀ-᧟᧠-᧿ᨀ-᨟ᨠ-\u1aafᬀ-\u1b7fᮀ-ᮿᯀ-᯿ᰀ-ᱏ᳀-\u1ccfꠀ-\ua82fꡀ-\ua87fꢀ-\ua8df꣠-ꣿꤰ-꥟ꦀ-꧟ꧠ-\ua9ffꨀ-꩟ꩠ-ꩿꪀ-꫟ꫠ-\uaaffꯀ-\uabff\u0590-\u05ff\u0600-ۿݐ–ݿࢠ–ࣿﭐ–﷿ﹰ–\ufeff\u0d80-\u0dff\u0e80-\u0eff].*");

    public static final void A00(SpannableString spannableString, List list, int i, int i2) {
        TypefaceSpan typefaceSpan;
        for (int i3 = i; i3 < i2; i3++) {
            if (!Character.isWhitespace(spannableString.charAt(i3))) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    Typeface A012 = AbstractC14710oj.A01(null);
                    if (AbstractC14710oj.A08() && A012 != null) {
                        typefaceSpan = new TypefaceSpan(A012);
                    } else {
                        typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    }
                    spannableString.setSpan(typefaceSpan, i, i2, 17);
                }
                return;
            }
        }
    }
}
