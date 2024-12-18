package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class THX implements Closeable {
    public static final String[] A04 = new String[128];
    public int A00;
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];
    public int[] A01 = new int[32];

    public static void A0A(C58810QAt c58810QAt) {
        c58810QAt.A00 = 0;
        int[] iArr = ((THX) c58810QAt).A01;
        int i = ((THX) c58810QAt).A00 - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final double A0B() {
        String A03;
        C64531TIl c64531TIl;
        double parseDouble;
        C58810QAt c58810QAt = (C58810QAt) this;
        int A07 = A07(c58810QAt);
        if (A07 == 16) {
            A0A(c58810QAt);
            return c58810QAt.A02;
        }
        try {
            if (A07 == 17) {
                A03 = c58810QAt.A04.A07(SUN.A00, c58810QAt.A01);
            } else {
                if (A07 == 9) {
                    c64531TIl = C58810QAt.A06;
                } else if (A07 == 8) {
                    c64531TIl = C58810QAt.A07;
                } else if (A07 == 10) {
                    A03 = C58810QAt.A03(c58810QAt);
                } else {
                    if (A07 != 11) {
                        throw A08(c58810QAt, "Expected a double but was ");
                    }
                    c58810QAt.A00 = 11;
                    parseDouble = Double.parseDouble(c58810QAt.A03);
                    if (Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                        c58810QAt.A03 = null;
                        A0A(c58810QAt);
                        return parseDouble;
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append(AbstractC111324zv.A00(649));
                    A1C.append(parseDouble);
                    A1C.append(" at path ");
                    throw new IOException(AbstractC166997dE.A0x(c58810QAt.A0H(), A1C));
                }
                A03 = C58810QAt.A04(c58810QAt, c64531TIl);
            }
            parseDouble = Double.parseDouble(c58810QAt.A03);
            if (Double.isNaN(parseDouble)) {
            }
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append(AbstractC111324zv.A00(649));
            A1C2.append(parseDouble);
            A1C2.append(" at path ");
            throw new IOException(AbstractC166997dE.A0x(c58810QAt.A0H(), A1C2));
        } catch (NumberFormatException unused) {
            throw new RuntimeException(AnonymousClass001.A0u("Expected a double but was ", c58810QAt.A03, " at path ", c58810QAt.A0H()));
        }
        c58810QAt.A03 = A03;
        c58810QAt.A00 = 11;
    }

    public final int A0C() {
        C64531TIl c64531TIl;
        C58810QAt c58810QAt = (C58810QAt) this;
        int A07 = A07(c58810QAt);
        if (A07 == 16) {
            long j = c58810QAt.A02;
            int i = (int) j;
            if (j == i) {
                A0A(c58810QAt);
                return i;
            }
            throw new RuntimeException(AnonymousClass001.A0r("Expected an int but was ", " at path ", c58810QAt.A0H(), j));
        }
        if (A07 == 17) {
            c58810QAt.A03 = c58810QAt.A04.A07(SUN.A00, c58810QAt.A01);
        } else {
            if (A07 != 9) {
                if (A07 == 8) {
                    c64531TIl = C58810QAt.A07;
                } else if (A07 != 11) {
                    throw A08(c58810QAt, "Expected an int but was ");
                }
            } else {
                c64531TIl = C58810QAt.A06;
            }
            String A042 = C58810QAt.A04(c58810QAt, c64531TIl);
            c58810QAt.A03 = A042;
            try {
                int parseInt = Integer.parseInt(A042);
                A0A(c58810QAt);
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        c58810QAt.A00 = 11;
        try {
            String str = c58810QAt.A03;
            double parseDouble = Double.parseDouble(str);
            int i2 = (int) parseDouble;
            if (i2 == parseDouble) {
                c58810QAt.A03 = null;
                A0A(c58810QAt);
                return i2;
            }
            throw new RuntimeException(AnonymousClass001.A0u("Expected an int but was ", str, " at path ", c58810QAt.A0H()));
        } catch (NumberFormatException unused2) {
            throw new RuntimeException(AnonymousClass001.A0u("Expected an int but was ", c58810QAt.A03, " at path ", c58810QAt.A0H()));
        }
    }

    public final int A0D(C63136Sdh c63136Sdh) {
        String str;
        int i;
        C58810QAt c58810QAt = (C58810QAt) this;
        int A07 = A07(c58810QAt);
        if (A07 >= 12 && A07 <= 15) {
            if (A07 == 15) {
                str = c58810QAt.A03;
                String[] strArr = c63136Sdh.A01;
                int length = strArr.length;
                i = 0;
                while (i < length) {
                    if (str.equals(strArr[i])) {
                        c58810QAt.A00 = 0;
                    } else {
                        i++;
                    }
                }
                return -1;
            }
            int EMo = c58810QAt.A05.EMo(c63136Sdh.A00);
            if (EMo != -1) {
                c58810QAt.A00 = 0;
                ((THX) c58810QAt).A03[((THX) c58810QAt).A00 - 1] = c63136Sdh.A01[EMo];
                return EMo;
            }
            str = ((THX) c58810QAt).A03[((THX) c58810QAt).A00 - 1];
            String A0F = c58810QAt.A0F();
            String[] strArr2 = c63136Sdh.A01;
            int length2 = strArr2.length;
            i = 0;
            while (true) {
                if (i < length2) {
                    if (A0F.equals(strArr2[i])) {
                        c58810QAt.A00 = 0;
                        ((THX) c58810QAt).A03[((THX) c58810QAt).A00 - 1] = A0F;
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                c58810QAt.A00 = 15;
                c58810QAt.A03 = A0F;
            }
            return i;
            ((THX) c58810QAt).A03[((THX) c58810QAt).A00 - 1] = str;
            return i;
        }
        return -1;
    }

    public final Integer A0E() {
        switch (A07((C58810QAt) this)) {
            case 1:
                return C05F.A0C;
            case 2:
                return C05F.A0N;
            case 3:
                return C05F.A00;
            case 4:
                return C05F.A01;
            case 5:
            case 6:
                return C05F.A15;
            case 7:
                return C05F.A1F;
            case 8:
            case 9:
            case 10:
            case 11:
                return C05F.A0j;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            default:
                return C05F.A0Y;
            case 16:
            case 17:
                return C05F.A0u;
            case 18:
                return C05F.A1I;
        }
    }

    public final String A0F() {
        String str;
        C64531TIl c64531TIl;
        C58810QAt c58810QAt = (C58810QAt) this;
        int A07 = A07(c58810QAt);
        if (A07 == 14) {
            str = C58810QAt.A03(c58810QAt);
        } else {
            if (A07 == 13) {
                c64531TIl = C58810QAt.A06;
            } else if (A07 == 12) {
                c64531TIl = C58810QAt.A07;
            } else if (A07 == 15) {
                str = c58810QAt.A03;
            } else {
                throw A09(c58810QAt, "Expected a name but was ");
            }
            str = C58810QAt.A04(c58810QAt, c64531TIl);
        }
        c58810QAt.A00 = 0;
        ((THX) c58810QAt).A03[((THX) c58810QAt).A00 - 1] = str;
        return str;
    }

    public final String A0G() {
        String A07;
        C64531TIl c64531TIl;
        C58810QAt c58810QAt = (C58810QAt) this;
        int A072 = A07(c58810QAt);
        if (A072 == 10) {
            A07 = C58810QAt.A03(c58810QAt);
        } else {
            if (A072 == 9) {
                c64531TIl = C58810QAt.A06;
            } else if (A072 == 8) {
                c64531TIl = C58810QAt.A07;
            } else if (A072 == 11) {
                A07 = c58810QAt.A03;
                c58810QAt.A03 = null;
            } else if (A072 == 16) {
                A07 = Long.toString(c58810QAt.A02);
            } else if (A072 == 17) {
                A07 = c58810QAt.A04.A07(SUN.A00, c58810QAt.A01);
            } else {
                throw A09(c58810QAt, "Expected a string but was ");
            }
            A07 = C58810QAt.A04(c58810QAt, c64531TIl);
        }
        A0A(c58810QAt);
        return A07;
    }

    public final void A0I() {
        C58810QAt c58810QAt = (C58810QAt) this;
        if (A07(c58810QAt) == 3) {
            c58810QAt.A0O(1);
            ((THX) c58810QAt).A01[((THX) c58810QAt).A00 - 1] = 0;
            c58810QAt.A00 = 0;
            return;
        }
        throw A09(c58810QAt, "Expected BEGIN_ARRAY but was ");
    }

    public final void A0J() {
        C58810QAt c58810QAt = (C58810QAt) this;
        if (A07(c58810QAt) == 1) {
            c58810QAt.A0O(3);
            c58810QAt.A00 = 0;
            return;
        }
        throw A09(c58810QAt, "Expected BEGIN_OBJECT but was ");
    }

    public final void A0K() {
        C58810QAt c58810QAt = (C58810QAt) this;
        if (A07(c58810QAt) == 4) {
            int i = ((THX) c58810QAt).A00 - 1;
            ((THX) c58810QAt).A00 = i;
            int[] iArr = ((THX) c58810QAt).A01;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            c58810QAt.A00 = 0;
            return;
        }
        throw A09(c58810QAt, "Expected END_ARRAY but was ");
    }

    public final void A0L() {
        C58810QAt c58810QAt = (C58810QAt) this;
        if (A07(c58810QAt) == 2) {
            int i = ((THX) c58810QAt).A00 - 1;
            ((THX) c58810QAt).A00 = i;
            ((THX) c58810QAt).A03[i] = null;
            int[] iArr = ((THX) c58810QAt).A01;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            c58810QAt.A00 = 0;
            return;
        }
        throw A09(c58810QAt, "Expected END_OBJECT but was ");
    }

    public final void A0M() {
        C64531TIl c64531TIl;
        C58810QAt c58810QAt = (C58810QAt) this;
        int A07 = A07(c58810QAt);
        if (A07 == 14) {
            long CNO = c58810QAt.A05.CNO(C58810QAt.A08);
            TWX twx = c58810QAt.A04;
            if (CNO == -1) {
                CNO = twx.A00;
            }
            twx.Em6(CNO);
        } else {
            if (A07 == 13) {
                c64531TIl = C58810QAt.A06;
            } else if (A07 == 12) {
                c64531TIl = C58810QAt.A07;
            } else if (A07 != 15) {
                throw A09(c58810QAt, "Expected a name but was ");
            }
            C58810QAt.A05(c58810QAt, c64531TIl);
        }
        c58810QAt.A00 = 0;
        ((THX) c58810QAt).A03[((THX) c58810QAt).A00 - 1] = "null";
    }

    public final void A0N() {
        C64531TIl c64531TIl;
        C58810QAt c58810QAt = (C58810QAt) this;
        int i = 0;
        do {
            int A07 = A07(c58810QAt);
            if (A07 == 3) {
                c58810QAt.A0O(1);
            } else if (A07 == 1) {
                c58810QAt.A0O(3);
            } else {
                if (A07 == 4) {
                    i--;
                    if (i < 0) {
                        throw A08(c58810QAt, "Expected a value but was ");
                    }
                } else if (A07 == 2) {
                    i--;
                    if (i < 0) {
                        throw A08(c58810QAt, "Expected a value but was ");
                    }
                } else {
                    if (A07 != 14 && A07 != 10) {
                        if (A07 != 9 && A07 != 13) {
                            if (A07 != 8 && A07 != 12) {
                                if (A07 == 17) {
                                    c58810QAt.A04.Em6(c58810QAt.A01);
                                } else if (A07 == 18) {
                                    throw A08(c58810QAt, "Expected a value but was ");
                                }
                            } else {
                                c64531TIl = C58810QAt.A07;
                            }
                        } else {
                            c64531TIl = C58810QAt.A06;
                        }
                        C58810QAt.A05(c58810QAt, c64531TIl);
                    } else {
                        long CNO = c58810QAt.A05.CNO(C58810QAt.A08);
                        TWX twx = c58810QAt.A04;
                        if (CNO == -1) {
                            CNO = twx.A00;
                        }
                        twx.Em6(CNO);
                    }
                    c58810QAt.A00 = 0;
                }
                ((THX) c58810QAt).A00--;
                c58810QAt.A00 = 0;
            }
            i++;
            c58810QAt.A00 = 0;
        } while (i != 0);
        int[] iArr = ((THX) c58810QAt).A01;
        int i2 = ((THX) c58810QAt).A00 - 1;
        iArr[i2] = iArr[i2] + 1;
        ((THX) c58810QAt).A03[i2] = "null";
    }

    public final boolean A0Q() {
        int A07 = A07((C58810QAt) this);
        if (A07 != 2 && A07 != 4 && A07 != 18) {
            return true;
        }
        return false;
    }

    public final boolean A0R() {
        C58810QAt c58810QAt = (C58810QAt) this;
        int A07 = A07(c58810QAt);
        if (A07 == 5) {
            c58810QAt.A00 = 0;
            int[] iArr = ((THX) c58810QAt).A01;
            int i = ((THX) c58810QAt).A00 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (A07 == 6) {
            c58810QAt.A00 = 0;
            int[] iArr2 = ((THX) c58810QAt).A01;
            int i2 = ((THX) c58810QAt).A00 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw A09(c58810QAt, "Expected a boolean but was ");
    }

    static {
        String[] strArr;
        int i = 0;
        do {
            strArr = A04;
            strArr[i] = String.format("\\u%04x", AbstractC25228BEl.A1Y(i));
            i++;
        } while (i <= 31);
        AbstractC58321PtD.A1U(strArr);
    }

    public static int A07(C58810QAt c58810QAt) {
        int i = c58810QAt.A00;
        if (i == 0) {
            return C58810QAt.A01(c58810QAt);
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.TX7, java.lang.RuntimeException] */
    public static TX7 A08(THX thx, String str) {
        return new RuntimeException(AnonymousClass001.A0u(str, AbstractC61651RrR.A00(thx.A0E()), " at path ", thx.A0H()));
    }

    public final String A0H() {
        int i = this.A00;
        int[] iArr = this.A02;
        String[] strArr = this.A03;
        int[] iArr2 = this.A01;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    A1C.append('.');
                    String str = strArr[i2];
                    if (str != null) {
                        A1C.append(str);
                    }
                }
            } else {
                A1C.append('[');
                A1C.append(iArr2[i2]);
                A1C.append(']');
            }
        }
        return A1C.toString();
    }

    public final void A0O(int i) {
        int i2 = this.A00;
        int[] iArr = this.A02;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.A02 = Arrays.copyOf(iArr, length * 2);
                String[] strArr = this.A03;
                this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.A01;
                this.A01 = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException(AnonymousClass001.A0R("Nesting too deep at ", A0H()));
            }
        }
        int[] iArr3 = this.A02;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr3[i3] = i;
    }

    public final void A0P(String str) {
        throw new IOException(AnonymousClass001.A0g(str, " at path ", A0H()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.TX7, java.lang.RuntimeException] */
    public static TX7 A09(THX thx, String str) {
        return new RuntimeException(AnonymousClass001.A0u(str, AbstractC61651RrR.A00(thx.A0E()), " at path ", thx.A0H()));
    }
}
