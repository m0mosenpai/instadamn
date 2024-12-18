package X;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* renamed from: X.Sf5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63202Sf5 {
    public static final AbstractC64290T7z A02;
    public static final AbstractC64290T7z A03;
    public static final AbstractC64290T7z A05;
    public static final AbstractC64290T7z A06;
    public final ImmutableList A00;
    public final String A01;
    public static final AbstractC64290T7z A04 = AbstractC64290T7z.A01(".。．｡");
    public static final C58619Pyn A08 = C58619Pyn.A00('.');
    public static final C71473Il A07 = C71473Il.A00('.');

    static {
        AbstractC64290T7z A01 = AbstractC64290T7z.A01("-_");
        A02 = A01;
        C60739RPd A00 = C60739RPd.A00();
        A03 = A00;
        AbstractC64290T7z A072 = new C60739RPd('a', 'z').A07(new C60739RPd('A', 'Z'));
        A05 = A072;
        A06 = A00.A07(A072).A07(A01);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof C63202Sf5) {
            return this.A01.equals(((C63202Sf5) object).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01;
    }

    public C63202Sf5(String name) {
        String charSequence;
        boolean z;
        AbstractC64290T7z abstractC64290T7z = A04;
        if (abstractC64290T7z instanceof C58618Pym) {
            charSequence = name.toString().replace(((C58618Pym) abstractC64290T7z).A00, '.');
        } else if (abstractC64290T7z instanceof C58630Pyy) {
            charSequence = name.toString();
        } else if (abstractC64290T7z instanceof C60740RPe) {
            char[] cArr = new char[name.length()];
            Arrays.fill(cArr, '.');
            charSequence = new String(cArr);
        } else {
            charSequence = name.toString();
            int A042 = abstractC64290T7z.A04(charSequence);
            if (A042 != -1) {
                char[] charArray = charSequence.toCharArray();
                loop1: while (true) {
                    charArray[A042] = '.';
                    do {
                        A042++;
                        if (A042 >= charArray.length) {
                            break loop1;
                        }
                    } while (!abstractC64290T7z.A09(charArray[A042]));
                }
                charSequence = new String(charArray);
            }
        }
        String A00 = C4B2.A00(charSequence);
        A00 = A00.endsWith(".") ? A00.substring(0, A00.length() - 1) : A00;
        C18C.A0A(A00, "Domain name too long: '%s':", AbstractC58319PtB.A1P(A00.length(), 253));
        this.A01 = A00;
        ImmutableList copyOf = ImmutableList.copyOf(new C64534TIq(A08, A00));
        this.A00 = copyOf;
        C18C.A0A(A00, "Domain has too many parts: '%s'", copyOf.size() <= 127);
        int size = copyOf.size() - 1;
        if (A00(AbstractC25226BEj.A1I(copyOf, size), true)) {
            for (int i = 0; i < size; i++) {
                if (A00(AbstractC25226BEj.A1I(copyOf, i), false)) {
                }
            }
            z = true;
            C18C.A0A(A00, "Not a valid domain name: '%s'", z);
        }
        z = false;
        C18C.A0A(A00, "Not a valid domain name: '%s'", z);
    }

    public static boolean A00(String part, boolean isFinalPart) {
        int length = part.length();
        if (length >= 1 && length <= 63) {
            if (A06.A0A(C60741RPf.A00.A06().A08(part))) {
                AbstractC64290T7z abstractC64290T7z = A02;
                if (!abstractC64290T7z.A09(part.charAt(0)) && !abstractC64290T7z.A09(part.charAt(length - 1)) && (!isFinalPart || !A03.A09(part.charAt(0)))) {
                    return true;
                }
            }
        }
        return false;
    }
}
