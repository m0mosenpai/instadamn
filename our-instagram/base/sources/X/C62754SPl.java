package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SPl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62754SPl {
    public String A01;
    public String A04;
    public String A05;
    public List A06;
    public final List A07;
    public String A03 = "";
    public String A02 = "";
    public int A00 = -1;

    public final void A01(String str) {
        ArrayList arrayList;
        if (str != null) {
            arrayList = C63379Sit.A03(C63379Sit.A02(str, " \"'<>#", 0, str.length(), true, false, true, true));
        } else {
            arrayList = null;
        }
        this.A06 = arrayList;
    }

    public final C63379Sit A00() {
        if (this.A05 != null) {
            if (this.A04 != null) {
                return new C63379Sit(this);
            }
            throw AbstractC166987dD.A14("host == null");
        }
        throw AbstractC166987dD.A14("scheme == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0290, code lost:
    
        if (r9 <= 65535) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x00a6, code lost:
    
        if (r9 <= 'z') goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
    
        if (r9 >= 'A') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        if (r9 <= 'Z') goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (r3 >= r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        r9 = r25.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if (r9 >= 'a') goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r9 >= 'A') goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r9 < '0') goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r9 == '+') goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        if (r9 == '-') goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        if (r9 != '.') goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        if (r9 <= '9') goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        if (r9 == ':') goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b0 -> B:32:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.String r25, X.C63379Sit r26) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62754SPl.A02(java.lang.String, X.Sit):void");
    }

    public C62754SPl() {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A07 = A1E;
        A1E.add("");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r1 != X.C63379Sit.A00(r4)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r6.append(':');
        r6.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        if (r4 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r6 = X.AbstractC166987dD.A1C()
            java.lang.String r4 = r7.A05
            if (r4 == 0) goto L85
            r6.append(r4)
            java.lang.String r0 = "://"
        Ld:
            r6.append(r0)
            java.lang.String r1 = r7.A03
            boolean r0 = r1.isEmpty()
            r3 = 58
            if (r0 == 0) goto L22
            java.lang.String r0 = r7.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
        L22:
            r6.append(r1)
            java.lang.String r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L33
            r6.append(r3)
            r6.append(r1)
        L33:
            r0 = 64
            r6.append(r0)
        L38:
            java.lang.String r1 = r7.A04
            r2 = -1
            if (r1 == 0) goto L50
            int r0 = r1.indexOf(r3)
            if (r0 == r2) goto L81
            r0 = 91
            r6.append(r0)
            r6.append(r1)
            r0 = 93
            r6.append(r0)
        L50:
            int r1 = r7.A00
            if (r1 != r2) goto L7e
            if (r4 == 0) goto L66
            int r1 = X.C63379Sit.A00(r4)
        L5a:
            int r0 = X.C63379Sit.A00(r4)
            if (r1 == r0) goto L66
        L60:
            r6.append(r3)
            r6.append(r1)
        L66:
            java.util.List r3 = r7.A07
            int r2 = r3.size()
            r1 = 0
        L6d:
            if (r1 >= r2) goto L88
            r0 = 47
            r6.append(r0)
            java.lang.String r0 = X.AbstractC25226BEj.A1I(r3, r1)
            r6.append(r0)
            int r1 = r1 + 1
            goto L6d
        L7e:
            if (r4 == 0) goto L60
            goto L5a
        L81:
            r6.append(r1)
            goto L50
        L85:
            java.lang.String r0 = "//"
            goto Ld
        L88:
            java.util.List r5 = r7.A06
            if (r5 == 0) goto Lb9
            r0 = 63
            r6.append(r0)
            int r4 = r5.size()
            r3 = 0
        L96:
            if (r3 >= r4) goto Lb9
            java.lang.String r2 = X.AbstractC25226BEj.A1I(r5, r3)
            int r0 = r3 + 1
            java.lang.String r1 = X.AbstractC25226BEj.A1I(r5, r0)
            if (r3 <= 0) goto La9
            r0 = 38
            r6.append(r0)
        La9:
            r6.append(r2)
            if (r1 == 0) goto Lb6
            r0 = 61
            r6.append(r0)
            r6.append(r1)
        Lb6:
            int r3 = r3 + 2
            goto L96
        Lb9:
            java.lang.String r1 = r7.A01
            if (r1 == 0) goto Lc5
            r0 = 35
            r6.append(r0)
            r6.append(r1)
        Lc5:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62754SPl.toString():java.lang.String");
    }
}
