package com.google.common.base;

import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.MSY;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public final class Strings {
    public static boolean validSurrogatePairAt(CharSequence string, int index) {
        return index >= 0 && index <= string.length() + (-2) && Character.isHighSurrogate(string.charAt(index)) && Character.isLowSurrogate(string.charAt(index + 1));
    }

    public static String A00(String template, Object... args) {
        int length;
        String valueOf = String.valueOf(template);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = args.length;
            if (i2 >= length) {
                break;
            }
            Object obj = args[i2];
            if (obj == null) {
                obj = "null";
            } else {
                try {
                    obj = obj.toString();
                } catch (Exception e) {
                    String A0T = AnonymousClass001.A0T(MSY.A0h(obj), AbstractC58322PtE.A0q(obj), '@');
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, AnonymousClass001.A0R("Exception during lenientFormat for ", A0T), (Throwable) e);
                    obj = AnonymousClass001.A11("<", A0T, " threw ", MSY.A0h(e), ">");
                }
            }
            args[i2] = obj;
            i2++;
        }
        int length2 = valueOf.length();
        StringBuilder A0r = AbstractC58318PtA.A0r(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0r.append((CharSequence) valueOf, i3, indexOf);
            A0r.append(args[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0r.append((CharSequence) valueOf, i3, length2);
        if (i < length) {
            int A0B = AbstractC58322PtE.A0B(" [", A0r, args, i);
            while (A0B < length) {
                A0B = AbstractC58322PtE.A0B(", ", A0r, args, A0B);
            }
            A0r.append(']');
        }
        return A0r.toString();
    }
}
