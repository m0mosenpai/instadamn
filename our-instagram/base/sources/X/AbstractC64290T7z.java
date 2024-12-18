package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.T7z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64290T7z implements InterfaceC28041Xi {
    public static String A02(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public final int A04(CharSequence sequence) {
        if (this instanceof C58630Pyy) {
            sequence.getClass();
        } else if (this instanceof C60740RPe) {
            if (sequence.length() != 0) {
                return 0;
            }
        } else {
            return A05(sequence, 0);
        }
        return -1;
    }

    public final int A05(CharSequence sequence, int start) {
        if (this instanceof C58630Pyy) {
            C18C.A02(start, sequence.length());
        } else if (this instanceof C60740RPe) {
            int length = sequence.length();
            C18C.A02(start, length);
            if (start != length) {
                return start;
            }
        } else {
            int length2 = sequence.length();
            C18C.A02(start, length2);
            while (start < length2) {
                if (A09(sequence.charAt(start))) {
                    return start;
                }
                start++;
            }
        }
        return -1;
    }

    public final AbstractC64290T7z A06() {
        if (this instanceof C60746RPk) {
            return ((C60746RPk) this).A00;
        }
        if (this instanceof AbstractC60744RPi) {
            AbstractC60744RPi abstractC60744RPi = (AbstractC60744RPi) this;
            if (abstractC60744RPi instanceof RPb) {
                return new C58618Pym(((RPb) abstractC60744RPi).A00);
            }
            if (abstractC60744RPi instanceof C58618Pym) {
                return new RPb(((C58618Pym) abstractC60744RPi).A00);
            }
            if (abstractC60744RPi instanceof C58630Pyy) {
                return C60740RPe.A00;
            }
            if (abstractC60744RPi instanceof C60740RPe) {
                return C58630Pyy.A00;
            }
            return new C60746RPk(abstractC60744RPi);
        }
        return new C60746RPk(this);
    }

    public final AbstractC64290T7z A07(AbstractC64290T7z other) {
        if (this instanceof RPb) {
            RPb rPb = (RPb) this;
            if (other.A09(rPb.A00)) {
                return C60740RPe.A00;
            }
            return rPb;
        }
        if (this instanceof C58618Pym) {
            C58618Pym c58618Pym = (C58618Pym) this;
            if (other.A09(c58618Pym.A00)) {
                return other;
            }
            return new C60747RPl(c58618Pym, other);
        }
        if (this instanceof C58630Pyy) {
            other.getClass();
            return other;
        }
        if (this instanceof C60740RPe) {
            other.getClass();
            return this;
        }
        return new C60747RPl(this, other);
    }

    public final String A08(CharSequence sequence) {
        if (this instanceof C58630Pyy) {
            return sequence.toString();
        }
        if (this instanceof C60740RPe) {
            return "";
        }
        String charSequence = sequence.toString();
        int A04 = A04(charSequence);
        if (A04 == -1) {
            return charSequence;
        }
        char[] charArray = charSequence.toCharArray();
        int i = 1;
        while (true) {
            A04++;
            if (A04 == charArray.length) {
                return new String(charArray, 0, A04 - i);
            }
            if (A09(charArray[A04])) {
                i++;
            } else {
                charArray[A04 - i] = charArray[A04];
            }
        }
    }

    public final boolean A09(char c) {
        if (this instanceof C60747RPl) {
            C60747RPl c60747RPl = (C60747RPl) this;
            if (!c60747RPl.A00.A09(c) && !c60747RPl.A01.A09(c)) {
                return false;
            }
        } else {
            if (this instanceof C60746RPk) {
                return !((C60746RPk) this).A00.A09(c);
            }
            if (this instanceof C60745RPj) {
                return MSY.A1R(Arrays.binarySearch(((C60745RPj) this).A00, c));
            }
            if (this instanceof RPb) {
                return MSY.A1S(c, ((RPb) this).A00);
            }
            if (this instanceof C60738RPc) {
                C60738RPc c60738RPc = (C60738RPc) this;
                if (c != c60738RPc.A00 && c != c60738RPc.A01) {
                    return false;
                }
            } else {
                if (this instanceof C58618Pym) {
                    return AbstractC167007dF.A1P(c, ((C58618Pym) this).A00);
                }
                if (this instanceof C60739RPd) {
                    C60739RPd c60739RPd = (C60739RPd) this;
                    if (c60739RPd.A01 <= c && c <= c60739RPd.A00) {
                        return true;
                    }
                    return false;
                }
                if (this instanceof C60742RPg) {
                    return AbstractC167007dF.A1P("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> C60742RPg.A00), c);
                }
                if (this instanceof C58630Pyy) {
                    return false;
                }
                if (this instanceof C60741RPf) {
                    return AbstractC58319PtB.A1P(c, StringTreeSet.MAX_SYMBOL_COUNT);
                }
            }
        }
        return true;
    }

    public final boolean A0A(CharSequence sequence) {
        if (this instanceof C60746RPk) {
            AbstractC64290T7z abstractC64290T7z = ((C60746RPk) this).A00;
            if (abstractC64290T7z instanceof C60746RPk) {
                return ((C60746RPk) abstractC64290T7z).A00.A0A(sequence);
            }
            if (!(abstractC64290T7z instanceof C58630Pyy)) {
                if (abstractC64290T7z instanceof C60740RPe) {
                    return AbstractC167007dF.A1N(sequence.length());
                }
                return AbstractC167007dF.A1P(abstractC64290T7z.A04(sequence), -1);
            }
        } else {
            if (this instanceof C58630Pyy) {
                return AbstractC167007dF.A1N(sequence.length());
            }
            if (!(this instanceof C60740RPe)) {
                for (int length = sequence.length() - 1; length >= 0; length--) {
                    if (!A09(sequence.charAt(length))) {
                        return false;
                    }
                }
                return true;
            }
        }
        sequence.getClass();
        return true;
    }

    public static AbstractC64290T7z A01(final CharSequence sequence) {
        int length = sequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new C60745RPj(sequence);
                }
                return new C60738RPc(sequence.charAt(0), sequence.charAt(1));
            }
            return new C58618Pym(sequence.charAt(0));
        }
        return C58630Pyy.A00;
    }

    public static String A03(AbstractC64290T7z abstractC64290T7z, CharSequence charSequence) {
        String A08 = abstractC64290T7z.A06().A08(charSequence);
        C14360o3.A07(A08);
        return A08;
    }
}
