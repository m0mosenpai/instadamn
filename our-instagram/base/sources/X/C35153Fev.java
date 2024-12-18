package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.Fev, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35153Fev {
    public int A00;
    public int A01;
    public C34414FFe A02;
    public Runnable A03;
    public String A04;
    public final C34715FRa A07;
    public String A05 = "";
    public String A06 = "";
    public final List A08 = AbstractC166987dD.A1E();
    public final Handler A09 = AbstractC167007dF.A0J();

    public static final void A01(C35153Fev c35153Fev) {
        int length;
        c35153Fev.A04 = null;
        int i = c35153Fev.A00;
        if (i >= 0) {
            List list = c35153Fev.A08;
            if (i < list.size()) {
                int i2 = c35153Fev.A00;
                int A01 = AbstractC31176DnK.A01(list, i2);
                if (i2 < AbstractC25226BEj.A05(list)) {
                    length = AbstractC31176DnK.A01(list, i2 + 1);
                } else {
                    length = c35153Fev.A05.length();
                }
                String str = c35153Fev.A05;
                if (A01 < str.length() && A01 < length) {
                    String A0w = AbstractC25227BEk.A0w(str, A01, length);
                    C34414FFe c34414FFe = c35153Fev.A02;
                    if (c34414FFe != null) {
                        c34414FFe.A00.setText(A0w);
                    }
                    c35153Fev.A04 = A0w;
                    c35153Fev.A01 = length;
                    String substring = c35153Fev.A05.substring(length);
                    C14360o3.A07(substring);
                    c35153Fev.A06 = substring;
                    c35153Fev.A00++;
                    GNJ gnj = new GNJ(c35153Fev);
                    c35153Fev.A03 = gnj;
                    c35153Fev.A09.postDelayed(gnj, c35153Fev.A07.A06 * AbstractC167007dF.A0m(A0w, " ", 0).size());
                }
            }
        }
    }

    private final void A00() {
        C34414FFe c34414FFe = this.A02;
        if (c34414FFe != null) {
            c34414FFe.A00.setText("");
        }
        this.A05 = "";
        this.A06 = "";
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
        this.A03 = null;
        this.A08.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (java.lang.Character.isWhitespace(r1.codePointAt(r6)) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r3 = r15.A08;
        r1 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r3.contains(r1) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r6 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r1 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (java.lang.Character.isWhitespace(r15.A05.codePointAt(r1)) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if ((-1) >= r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.String r16, X.InterfaceC16820sZ r17) {
        /*
            r15 = this;
            r1 = r16
            if (r16 == 0) goto Lda
            int r0 = r1.length()
            if (r0 == 0) goto Lda
            java.lang.String r0 = r15.A05
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 != 0) goto Le6
            java.lang.String r0 = r15.A05
            r4 = 0
            boolean r0 = X.AbstractC002300n.A0h(r1, r0, r4)
            if (r0 == 0) goto Lca
            java.lang.String r0 = r15.A05
            int r0 = r0.length()
            java.lang.String r1 = r1.substring(r0)
            X.C14360o3.A07(r1)
            java.lang.String r0 = r15.A06
            java.lang.String r8 = X.AnonymousClass001.A0R(r0, r1)
            r15.A06 = r8
            java.lang.String r0 = r15.A05
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
        L36:
            r15.A05 = r1
            X.FRa r2 = r15.A07
            android.text.TextPaint r9 = r2.A07
            java.lang.Object r0 = r17.invoke()
            int r10 = X.AbstractC166987dD.A0H(r0)
            int r5 = r2.A02
            int r3 = r2.A03
            float r13 = r2.A00
            float r12 = r2.A01
            boolean r14 = r2.A08
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            int r10 = r10 - r5
            int r10 = r10 - r3
            if (r1 < r0) goto Lc2
            android.text.DynamicLayout$Builder r1 = android.text.DynamicLayout.Builder.obtain(r8, r9, r10)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            android.text.DynamicLayout$Builder r0 = r1.setAlignment(r0)
            android.text.DynamicLayout$Builder r0 = r0.setLineSpacing(r13, r12)
            android.text.DynamicLayout$Builder r0 = r0.setBreakStrategy(r4)
            android.text.DynamicLayout$Builder r0 = r0.setIncludePad(r14)
            android.text.DynamicLayout r7 = r0.build()
            X.C14360o3.A0A(r7)
        L73:
            r5 = 0
            int r4 = r7.getLineCount()
        L78:
            if (r5 >= r4) goto Ld2
            int r0 = r2.A04
            int r0 = r5 % r0
            if (r0 != 0) goto Lab
            int r6 = r7.getLineStart(r5)
            int r0 = r15.A01
            int r6 = r6 + r0
            r3 = -1
            if (r6 < 0) goto Lab
            java.lang.String r1 = r15.A05
            int r0 = r1.length()
            if (r6 >= r0) goto Lab
            int r0 = r1.codePointAt(r6)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto Lb0
        L9c:
            java.util.List r3 = r15.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto Lab
            r3.add(r1)
        Lab:
            int r5 = r5 + 1
            goto L78
        Lae:
            if (r3 >= r1) goto Lab
        Lb0:
            if (r6 == 0) goto L9c
            java.lang.String r0 = r15.A05
            int r1 = r6 + (-1)
            int r0 = r0.codePointAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L9c
            r6 = r1
            goto Lae
        Lc2:
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_CENTER
            android.text.DynamicLayout r7 = new android.text.DynamicLayout
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L73
        Lca:
            r15.A00()
            r15.A06 = r1
            r8 = r1
            goto L36
        Ld2:
            java.lang.String r0 = r15.A04
            if (r0 != 0) goto Le6
            A01(r15)
            return
        Lda:
            java.lang.Runnable r1 = r15.A03
            if (r1 == 0) goto Le3
            android.os.Handler r0 = r15.A09
            r0.removeCallbacks(r1)
        Le3:
            r15.A00()
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35153Fev.A02(java.lang.String, X.0sZ):void");
    }

    public C35153Fev(C34715FRa c34715FRa) {
        this.A07 = c34715FRa;
    }
}
