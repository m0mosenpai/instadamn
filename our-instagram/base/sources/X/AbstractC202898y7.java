package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;

/* renamed from: X.8y7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202898y7 {
    public static final void A01(Editable editable, C190888ck c190888ck, boolean z) {
        Integer num;
        C14360o3.A0B(editable, 1);
        if (z) {
            num = C05F.A00;
        } else {
            num = c190888ck.A08;
        }
        if (num != null && num.intValue() == 0) {
            int length = editable.length();
            int i = 0;
            while (true) {
                int i2 = -1;
                if (i < length) {
                    if (Character.isLowerCase(editable.charAt(i))) {
                        if (i != -1) {
                            int length2 = editable.length() - 1;
                            if (i <= length2) {
                                while (true) {
                                    if (Character.isLowerCase(editable.charAt(length2))) {
                                        i2 = length2;
                                        break;
                                    } else if (length2 == i) {
                                        break;
                                    } else {
                                        length2--;
                                    }
                                }
                            }
                            if (i == i2) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(Character.toUpperCase(editable.charAt(i))));
                                spannableStringBuilder.setSpan(new Object(), 0, 1, 33);
                                editable.replace(i, i + 1, spannableStringBuilder);
                                return;
                            }
                            String upperCase = editable.toString().toUpperCase(C1Q2.A02());
                            C14360o3.A07(upperCase);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(upperCase);
                            int min = Math.min(spannableStringBuilder2.length() - 1, i2);
                            C4GL.A04(spannableStringBuilder2, editable, Object.class);
                            if (i <= min) {
                                while (true) {
                                    if (Character.isLowerCase(editable.charAt(i))) {
                                        spannableStringBuilder2.setSpan(new Object(), i, i + 1, 33);
                                    }
                                    if (i == min) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                            editable.replace(0, editable.length(), spannableStringBuilder2);
                            return;
                        }
                        return;
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            A00(editable);
        }
    }

    public static final void A00(Editable editable) {
        for (C202908y8 c202908y8 : (C202908y8[]) C4GL.A06(editable, C202908y8.class)) {
            int spanStart = editable.getSpanStart(c202908y8);
            editable.removeSpan(c202908y8);
            editable.replace(spanStart, spanStart + 1, String.valueOf(Character.toLowerCase(editable.charAt(spanStart))));
        }
    }
}
