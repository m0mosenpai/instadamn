package X;

import android.text.Spanned;
import java.text.BreakIterator;

/* loaded from: classes10.dex */
public abstract class SQO {
    /* JADX WARN: Multi-variable type inference failed */
    public static final int A00(String str, int i) {
        int i2;
        int length;
        if (C58341Ptc.A09 != null) {
            C58341Ptc A00 = C58341Ptc.A00();
            if (A00.A01() == 1) {
                boolean z = true;
                if (A00.A01() != 1) {
                    z = false;
                }
                C02R.A07(z, "Not initialized yet");
                C02R.A03(str, "charSequence cannot be null");
                C55092g9 c55092g9 = A00.A01.A01;
                if (i >= 0 && i < (length = str.length())) {
                    if (str instanceof Spanned) {
                        Spanned spanned = (Spanned) str;
                        AbstractC1343865k[] abstractC1343865kArr = (AbstractC1343865k[]) spanned.getSpans(i, i + 1, AbstractC1343865k.class);
                        if (abstractC1343865kArr.length > 0) {
                            i2 = spanned.getSpanEnd(abstractC1343865kArr[0]);
                        }
                    }
                    i2 = ((C63607SqF) C55092g9.A00(new C63607SqF(i), c55092g9, str, Math.max(0, i - 16), Math.min(length, i + 16), Integer.MAX_VALUE, true)).A00;
                } else {
                    i2 = -1;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (i2 != -1 && valueOf != null) {
                    return i2;
                }
            }
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int A01(String str, int i) {
        int i2;
        int length;
        if (C58341Ptc.A09 != null) {
            C58341Ptc A00 = C58341Ptc.A00();
            if (A00.A01() == 1) {
                int max = Math.max(0, i - 1);
                boolean z = true;
                if (A00.A01() != 1) {
                    z = false;
                }
                C02R.A07(z, "Not initialized yet");
                C02R.A03(str, "charSequence cannot be null");
                C55092g9 c55092g9 = A00.A01.A01;
                if (max >= 0 && max < (length = str.length())) {
                    if (str instanceof Spanned) {
                        Spanned spanned = (Spanned) str;
                        AbstractC1343865k[] abstractC1343865kArr = (AbstractC1343865k[]) spanned.getSpans(max, max + 1, AbstractC1343865k.class);
                        if (abstractC1343865kArr.length > 0) {
                            i2 = spanned.getSpanStart(abstractC1343865kArr[0]);
                        }
                    }
                    i2 = ((C63607SqF) C55092g9.A00(new C63607SqF(max), c55092g9, str, Math.max(0, max - 16), Math.min(length, max + 16), Integer.MAX_VALUE, true)).A01;
                } else {
                    i2 = -1;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (i2 != -1 && valueOf != null) {
                    return i2;
                }
            }
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
