package com.facebook.hermes.unicode;

import X.AbstractC166987dD;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

/* loaded from: classes9.dex */
public class AndroidUnicodeUtils {
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat timeInstance;
        if (z) {
            if (z2) {
                timeInstance = DateFormat.getDateTimeInstance(2, 2);
            } else {
                timeInstance = DateFormat.getDateInstance(2);
            }
        } else if (z2) {
            timeInstance = DateFormat.getTimeInstance(2);
        } else {
            throw AbstractC166987dD.A18("Bad dateFormat configuration");
        }
        return timeInstance.format(Long.valueOf((long) d));
    }

    public static String convertToCase(String str, int i, boolean z) {
        Locale locale;
        if (z) {
            locale = Locale.getDefault();
        } else {
            locale = Locale.ENGLISH;
        }
        if (i != 0) {
            if (i == 1) {
                return str.toLowerCase(locale);
            }
            throw AbstractC166987dD.A18("Invalid target case");
        }
        return str.toUpperCase(locale);
    }

    public static String normalize(String str, int i) {
        Normalizer.Form form;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        form = Normalizer.Form.NFKD;
                    } else {
                        throw AbstractC166987dD.A18("Invalid form");
                    }
                } else {
                    form = Normalizer.Form.NFKC;
                }
            } else {
                form = Normalizer.Form.NFD;
            }
        } else {
            form = Normalizer.Form.NFC;
        }
        return Normalizer.normalize(str, form);
    }

    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }
}
