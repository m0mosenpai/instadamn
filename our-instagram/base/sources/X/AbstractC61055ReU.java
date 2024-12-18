package X;

import java.io.Writer;

/* renamed from: X.ReU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61055ReU extends Writer {
    public static String A00(int i) {
        String str;
        StringBuilder A1C;
        String str2;
        if (i > 1114111) {
            A1C = AbstractC166997dE.A11("Illegal character point (0x");
            AbstractC58318PtA.A1T(A1C, i);
            str = ") to output; max is 0x10FFFF as per RFC 4627";
        } else {
            str = ")";
            A1C = AbstractC166987dD.A1C();
            if (i <= 56319) {
                str2 = "Unmatched first part of surrogate pair (0x";
            } else {
                str2 = "Unmatched second part of surrogate pair (0x";
            }
            A1C.append(str2);
            AbstractC58318PtA.A1T(A1C, i);
        }
        return AbstractC166997dE.A0x(str, A1C);
    }
}
