package X;

/* loaded from: classes10.dex */
public class RMH extends SK8 {
    public final C63004SaS A00;
    public final Character A01;
    public volatile SK8 A02;

    public final void A01(Appendable appendable, byte[] bArr, int i, int i2) {
        AbstractC63065Sbm.A02(i, i + i2, bArr.length);
        C63004SaS c63004SaS = this.A00;
        int i3 = c63004SaS.A03;
        int i4 = 0;
        if (i2 <= i3) {
            long j = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                j = (j | (bArr[i + i5] & 255)) << 8;
            }
            int i6 = (i2 + 1) * 8;
            while (i4 < i2 * 8) {
                int i7 = c63004SaS.A01;
                appendable.append(c63004SaS.A07[c63004SaS.A00 & ((int) (j >>> ((i6 - i7) - i4)))]);
                i4 += i7;
            }
            if (this.A01 != null) {
                while (i4 < i3 * 8) {
                    appendable.append('=');
                    i4 += c63004SaS.A01;
                }
                return;
            }
            return;
        }
        throw AbstractC58318PtA.A0Y();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RMH)) {
            return false;
        }
        RMH rmh = (RMH) obj;
        if (!this.A00.equals(rmh.A00) || !C2I7.A00(this.A01, rmh.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Character ch = this.A01;
        return AbstractC167017dG.A0M(ch) ^ this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder A0s = AbstractC58318PtA.A0s("BaseEncoding.");
        C63004SaS c63004SaS = this.A00;
        A0s.append(c63004SaS);
        if (8 % c63004SaS.A01 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                A0s.append(".withPadChar('");
                A0s.append(ch);
                str = "')";
            }
            A0s.append(str);
        }
        return A0s.toString();
    }

    public RMH(C63004SaS c63004SaS, Character ch) {
        this.A00 = c63004SaS;
        if (ch != null) {
            byte[] bArr = c63004SaS.A06;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw AbstractC166987dD.A12(S2W.A00("Padding character %s was already in alphabet", ch));
            }
        }
        this.A01 = ch;
    }
}
