package X;

/* renamed from: X.CWb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28004CWb {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final C27460CAd A04;

    public final char A00(int i) {
        String str;
        int i2;
        C27460CAd c27460CAd = this.A04;
        CAV cav = c27460CAd.A02;
        if (cav != null && i >= (i2 = c27460CAd.A01)) {
            int i3 = cav.A00;
            int i4 = cav.A01;
            int i5 = cav.A02;
            int i6 = i3 - (i4 - i5);
            if (i < i6 + i2) {
                int i7 = i - i2;
                char[] cArr = cav.A03;
                if (i7 >= i5) {
                    i7 = (i7 - i5) + i4;
                }
                return cArr[i7];
            }
            str = c27460CAd.A03;
            i -= (i6 - c27460CAd.A00) + i2;
        } else {
            str = c27460CAd.A03;
        }
        return str.charAt(i);
    }

    public final void A02(int i, int i2) {
        int A00;
        if (i >= 0 && i <= (A00 = this.A04.A00())) {
            if (i2 >= 0 && i2 <= A00) {
                if (i < i2) {
                    this.A01 = i;
                    this.A00 = i2;
                    return;
                }
                throw AbstractC25230BEn.A0o("Do not set reversed or empty range: ", " > ", i, i2);
            }
            throw AbstractC25229BEm.A0l("end (", ") offset is outside of text region ", i2, A00);
        }
        throw AbstractC25229BEm.A0l("start (", ") offset is outside of text region ", i, this.A04.A00());
    }

    public final void A03(int i, int i2) {
        int A00;
        if (i >= 0 && i <= (A00 = this.A04.A00())) {
            if (i2 >= 0 && i2 <= A00) {
                if (i <= i2) {
                    this.A03 = i;
                    this.A02 = i2;
                    return;
                }
                throw AbstractC25230BEn.A0o("Do not set reversed range: ", " > ", i, i2);
            }
            throw AbstractC25229BEm.A0l("end (", ") offset is outside of text region ", i2, A00);
        }
        throw AbstractC25229BEm.A0l("start (", ") offset is outside of text region ", i, this.A04.A00());
    }

    public final void A04(int i, int i2, String str) {
        C27460CAd c27460CAd;
        int A00;
        if (i >= 0 && i <= (A00 = (c27460CAd = this.A04).A00())) {
            if (i2 >= 0 && i2 <= A00) {
                if (i <= i2) {
                    c27460CAd.A01(i, i2, str);
                    int A04 = AbstractC25226BEj.A04(str, i);
                    if (A04 >= 0) {
                        this.A03 = A04;
                        this.A02 = A04;
                        this.A01 = -1;
                        this.A00 = -1;
                        return;
                    }
                    throw AbstractC25230BEn.A0n("Cannot set selectionStart to a negative value: ", A04);
                }
                throw AbstractC25230BEn.A0o("Do not set reversed range: ", " > ", i, i2);
            }
            throw AbstractC25229BEm.A0l("end (", ") offset is outside of text region ", i2, A00);
        }
        throw AbstractC25229BEm.A0l("start (", ") offset is outside of text region ", i, this.A04.A00());
    }

    public final String toString() {
        return this.A04.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.CAd] */
    public C28004CWb(C5C8 c5c8, long j) {
        int length;
        String str = c5c8.A00;
        ?? obj = new Object();
        obj.A03 = str;
        obj.A01 = -1;
        obj.A00 = -1;
        this.A04 = obj;
        int A01 = C5C2.A01(j);
        this.A03 = A01;
        int A00 = C5C2.A00(j);
        this.A02 = A00;
        this.A01 = -1;
        this.A00 = -1;
        if (A01 >= 0 && A01 <= (length = c5c8.length())) {
            if (A00 >= 0 && A00 <= length) {
                if (A01 <= A00) {
                    return;
                } else {
                    throw AbstractC25230BEn.A0o("Do not set reversed range: ", " > ", A01, A00);
                }
            }
            throw AbstractC25229BEm.A0l("end (", ") offset is outside of text region ", A00, length);
        }
        throw AbstractC25229BEm.A0l("start (", ") offset is outside of text region ", A01, c5c8.length());
    }

    public final void A01(int i, int i2) {
        int A00;
        long A002 = C60Z.A00(i, i2);
        this.A04.A01(i, i2, "");
        long A003 = AbstractC27479CBa.A00(C60Z.A00(this.A03, this.A02), A002);
        int A01 = C5C2.A01(A003);
        if (A01 >= 0) {
            this.A03 = A01;
            int A004 = C5C2.A00(A003);
            if (A004 >= 0) {
                this.A02 = A004;
                int i3 = this.A01;
                if (i3 != -1) {
                    long A005 = AbstractC27479CBa.A00(C60Z.A00(i3, this.A00), A002);
                    if (C5C2.A03(A005)) {
                        A00 = -1;
                        this.A01 = -1;
                    } else {
                        this.A01 = C5C2.A01(A005);
                        A00 = C5C2.A00(A005);
                    }
                    this.A00 = A00;
                    return;
                }
                return;
            }
            throw AbstractC25230BEn.A0n("Cannot set selectionEnd to a negative value: ", A004);
        }
        throw AbstractC25230BEn.A0n("Cannot set selectionStart to a negative value: ", A01);
    }
}
