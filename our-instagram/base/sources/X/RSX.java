package X;

/* loaded from: classes10.dex */
public class RSX extends SPT {
    public final C63018Sai A00;
    public final Character A01;
    public volatile SPT A02;

    public final void A04(Appendable target, byte[] bytes, int off, int len) {
        C18C.A03(off, off + len, bytes.length);
        C63018Sai c63018Sai = this.A00;
        int i = c63018Sai.A01;
        int i2 = 0;
        C18C.A0E(AbstractC58319PtB.A1P(len, i));
        long j = 0;
        for (int i3 = 0; i3 < len; i3++) {
            j = (j | (bytes[off + i3] & 255)) << 8;
        }
        int i4 = c63018Sai.A00;
        int i5 = ((len + 1) * 8) - i4;
        while (i2 < len * 8) {
            target.append(c63018Sai.A07[((int) (j >>> (i5 - i2))) & c63018Sai.A03]);
            i2 += i4;
        }
        Character ch = this.A01;
        if (ch != null) {
            while (i2 < i * 8) {
                target.append(ch.charValue());
                i2 += i4;
            }
        }
    }

    public final boolean equals(Object other) {
        if (!(other instanceof RSX)) {
            return false;
        }
        RSX rsx = (RSX) other;
        if (!this.A00.equals(rsx.A00) || !C2I7.A00(this.A01, rsx.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ AbstractC167017dG.A0M(this.A01);
    }

    public final String toString() {
        String str;
        StringBuilder A0s = AbstractC58318PtA.A0s("BaseEncoding.");
        C63018Sai c63018Sai = this.A00;
        A0s.append(c63018Sai);
        if (8 % c63018Sai.A00 != 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2 == (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RSX(X.C63018Sai r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            if (r5 == 0) goto L16
            char r2 = r5.charValue()
            byte[] r1 = r4.A06
            int r0 = r1.length
            if (r2 >= r0) goto L16
            r2 = r1[r2]
            r0 = -1
            r1 = 0
            if (r2 != r0) goto L17
        L16:
            r1 = 1
        L17:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            X.C18C.A0A(r5, r0, r1)
            r3.A01 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RSX.<init>(X.Sai, java.lang.Character):void");
    }
}
