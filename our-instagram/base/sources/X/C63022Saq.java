package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;

/* renamed from: X.Saq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63022Saq {
    public static final C63022Saq A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Saq, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A01 = -1;
        obj.A00 = 0;
        obj.A03 = new int[0];
        obj.A04 = new Object[0];
        obj.A02 = false;
        A05 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C63022Saq)) {
                C63022Saq c63022Saq = (C63022Saq) obj;
                int i = this.A00;
                if (i == c63022Saq.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = c63022Saq.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = c63022Saq.A04;
                            for (int i3 = 0; i3 < i; i3++) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int A052;
        int A01;
        int i;
        int i2 = this.A01;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00; i4++) {
            int i5 = this.A03[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 5) {
                                i = AbstractC63073Sbv.A05(i6) + 4;
                            } else {
                                throw new IllegalStateException(C4L5.A00());
                            }
                        } else {
                            A052 = AbstractC63073Sbv.A05(i6) * 2;
                            A01 = ((C63022Saq) this.A04[i4]).A00();
                        }
                    } else {
                        AbstractC64538TIu abstractC64538TIu = (AbstractC64538TIu) this.A04[i4];
                        boolean z = CodedOutputStream.A02;
                        A052 = AbstractC63073Sbv.A05(i6);
                        int A02 = abstractC64538TIu.A02();
                        A01 = AbstractC58321PtD.A06(A02) + A02;
                    }
                } else {
                    i = AbstractC63073Sbv.A05(i6) + 8;
                }
                i3 += i;
            } else {
                long A0N = AbstractC166987dD.A0N(this.A04[i4]);
                A052 = AbstractC63073Sbv.A05(i6);
                A01 = CodedOutputStream.A01(A0N);
            }
            i = A052 + A01;
            i3 += i;
        }
        this.A01 = i3;
        return i3;
    }

    public final void A01(int i, Object obj) {
        if (this.A02) {
            int i2 = this.A00;
            int[] iArr = this.A03;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A03 = Arrays.copyOf(iArr, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
            }
            int[] iArr2 = this.A03;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A04[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw AbstractC43592JPx.A11();
    }

    public final void A02(SCD scd) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    scd.A00.A08(i3, AbstractC166987dD.A0H(obj));
                                } else {
                                    throw AbstractC58318PtA.A0f(C4L5.A00());
                                }
                            } else {
                                CodedOutputStream codedOutputStream = scd.A00;
                                int i5 = i3 << 3;
                                codedOutputStream.A07(i5 | 3);
                                ((C63022Saq) obj).A02(scd);
                                codedOutputStream.A07(i5 | 4);
                            }
                        } else {
                            CodedOutputStream codedOutputStream2 = scd.A00;
                            AbstractC63073Sbv.A06(codedOutputStream2, i3);
                            codedOutputStream2.A0H((AbstractC64538TIu) obj);
                        }
                    } else {
                        scd.A00.A0B(i3, AbstractC166987dD.A0N(obj));
                    }
                } else {
                    scd.A00.A0C(i3, AbstractC166987dD.A0N(obj));
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int A01 = JQ0.A01(i);
        int[] iArr = this.A03;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (A01 + i2) * 31;
        Object[] objArr = this.A04;
        int i5 = 17;
        for (int i6 = 0; i6 < i; i6++) {
            i5 = AbstractC166987dD.A0I(objArr[i6], i5 * 31);
        }
        return i4 + i5;
    }
}
