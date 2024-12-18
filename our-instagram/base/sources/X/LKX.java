package X;

import android.view.View;
import com.instagram.api.schemas.NotePogVideoDict;

/* loaded from: classes8.dex */
public abstract class LKX {
    public static final L5X A00(View view, View view2, C45216Jzw c45216Jzw, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new L5X(view, view2, null, null, null, c45216Jzw, null, str, str2, str3, str4, C16930sl.A00, false, false, z, z2, false, z3, true, z4, z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r19 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.L5X A01(android.view.View r17, com.instagram.api.schemas.NotePogVideoDict r18, X.C6C9 r19, com.instagram.contentnotes.data.metadata.ContentNoteMetadata r20, X.C45216Jzw r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r9 = 0
            r4 = r19
            if (r19 == 0) goto L3e
            X.67s r0 = r4.A0A
            if (r0 == 0) goto L3e
            X.67y r0 = r0.A0B
            if (r0 == 0) goto L3e
            java.lang.String r8 = r0.A02
        Lf:
            X.67s r0 = r4.A0A
            if (r0 == 0) goto L19
            X.67y r0 = r0.A0B
            if (r0 == 0) goto L19
            java.lang.String r9 = r0.A03
        L19:
            r2 = 0
            r15 = 0
            X.0sl r12 = X.C16930sl.A00
            r19 = 1
            X.L5X r0 = new X.L5X
            r1 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r13 = r22
            r14 = r23
            r16 = r24
            r17 = r25
            r7 = r2
            r10 = r2
            r11 = r2
            r18 = r15
            r20 = r15
            r21 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L3e:
            r8 = r9
            if (r19 == 0) goto L19
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKX.A01(android.view.View, com.instagram.api.schemas.NotePogVideoDict, X.6C9, com.instagram.contentnotes.data.metadata.ContentNoteMetadata, X.Jzw, boolean, boolean, boolean, boolean):X.L5X");
    }

    public static final L5X A02(NotePogVideoDict notePogVideoDict, C6C9 c6c9, Double d, Double d2) {
        String str;
        if (d != null) {
            str = d.toString();
        } else {
            str = null;
        }
        return new L5X(null, null, notePogVideoDict, c6c9, null, null, null, null, null, str, d2 != null ? d2.toString() : null, C16930sl.A00, false, false, false, false, false, true, false, false, false);
    }

    public static final L5X A04(C6C9 c6c9, String str, String str2, int i) {
        AbstractC167007dF.A1D(str, 1, str2);
        return new L5X(null, null, null, c6c9, null, null, Integer.valueOf(i), str, str2, null, null, C16930sl.A00, false, false, false, false, false, false, true, false, false);
    }

    public static final L5X A03(NotePogVideoDict notePogVideoDict, C6C9 c6c9, String str, String str2, boolean z, boolean z2) {
        C1348267y c1348267y;
        String str3 = str2;
        C14360o3.A0B(c6c9, 0);
        if (str2 == null) {
            C67s c67s = c6c9.A0A;
            if (c67s != null && (c1348267y = c67s.A0B) != null) {
                str3 = c1348267y.A03;
            } else {
                str3 = null;
            }
        }
        return new L5X(null, null, notePogVideoDict, c6c9, null, null, null, str, str3, null, null, C16930sl.A00, false, false, false, z, false, false, true, z2, false);
    }
}
