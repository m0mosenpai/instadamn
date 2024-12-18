package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.Locale;

/* renamed from: X.Snr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63478Snr implements InputFilter {
    public final Context A00;

    public String A00() {
        return this.A00.getString(2131964640);
    }

    public String A01(char c) {
        String valueOf;
        try {
            valueOf = new String(Normalizer.normalize(String.valueOf(c), Normalizer.Form.NFD).replace("Œ", "OE").replace("œ", "oe").replace("Æ", "AE").replace("æ", "ae").getBytes("ascii"), "ascii");
        } catch (UnsupportedEncodingException unused) {
            valueOf = String.valueOf(c);
        }
        return valueOf.toLowerCase(Locale.ENGLISH).replace(" ", "_").replaceAll("[^a-z0-9_.]", "");
    }

    public void A02(String str) {
        C9GR.A09(this.A00, str);
    }

    public boolean A03(char c) {
        if (c >= '0') {
            if (c > '9') {
                if (c >= 'a') {
                    if (c > 'z') {
                        return false;
                    }
                    return true;
                }
                if (c != '_') {
                    return false;
                }
                return true;
            }
            return true;
        }
        if (c != '.') {
            return false;
        }
        return true;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, i, i2);
        int i5 = 0;
        if (charSequence instanceof Spanned) {
            TextUtils.copySpansFrom((Spanned) charSequence, i, i2, Object.class, spannableStringBuilder, 0);
        }
        boolean z = false;
        for (int i6 = 0; i6 < i2 - i; i6++) {
            char charAt = charSequence.charAt(i6 + i);
            if (!A03(charAt)) {
                int i7 = i6 + i5;
                String A01 = A01(charAt);
                spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) A01);
                i5 += A01.length() - 1;
                if (!z) {
                    z = false;
                    if (!TextUtils.isEmpty(A01)) {
                    }
                }
                z = true;
            }
        }
        if (z) {
            A02(A00());
        }
        return spannableStringBuilder;
    }

    public AbstractC63478Snr(Context context) {
        this.A00 = context;
    }
}
