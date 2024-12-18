package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.7OR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7OR {
    public static final C7OR A00 = new Object();

    public static final CharSequence A00(EditText editText, C7OQ c7oq, CharSequence charSequence, boolean z) {
        C14360o3.A0B(c7oq, 2);
        return A01(editText, c7oq, charSequence, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r1.A02(r14, r15.toString(), 0) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence A01(android.widget.EditText r13, X.C7OQ r14, java.lang.CharSequence r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7OR.A01(android.widget.EditText, X.7OQ, java.lang.CharSequence, boolean, boolean):java.lang.CharSequence");
    }

    public static final String A03(EditText editText, C7OQ c7oq, boolean z) {
        C14360o3.A0B(c7oq, 1);
        String obj = editText.getText().toString();
        int selectionEnd = editText.getSelectionEnd() - 1;
        int length = obj.length();
        if (selectionEnd >= length) {
            return null;
        }
        int selectionEnd2 = editText.getSelectionEnd();
        while (selectionEnd >= 0) {
            C7OR c7or = A00;
            if (!A05(c7oq, obj.charAt(selectionEnd))) {
                if (z) {
                    Integer A02 = c7or.A02(c7oq, obj, selectionEnd);
                    if (A02 != null) {
                        selectionEnd = (selectionEnd - A02.intValue()) + 1;
                        if (selectionEnd == -1 || selectionEnd < 0) {
                            return null;
                        }
                    }
                } else if (Character.isWhitespace(obj.charAt(selectionEnd))) {
                    return null;
                }
                selectionEnd--;
            }
            if (selectionEnd2 > length) {
                return null;
            }
            String substring = obj.substring(selectionEnd, selectionEnd2);
            C14360o3.A07(substring);
            return substring;
        }
        return null;
    }

    public static final boolean A04(EditText editText, C7OQ c7oq, int i, boolean z) {
        int selectionEnd;
        char charAt;
        C14360o3.A0B(c7oq, 1);
        Editable text = editText.getText();
        if (text.length() >= i && (selectionEnd = editText.getSelectionEnd()) > 0 && (z || !Character.isWhitespace(text.charAt(selectionEnd - 1)))) {
            for (int i2 = selectionEnd - 1; -1 < i2; i2--) {
                C7OR c7or = A00;
                if (A05(c7oq, text.charAt(i2))) {
                    if (i2 != 0 && (charAt = text.charAt(i2 - 1)) < 128 && Character.isLetterOrDigit((int) charAt)) {
                    }
                    return true;
                }
                if (z && c7or.A02(c7oq, text.toString(), i2) != null) {
                    return true;
                }
                if (Character.isWhitespace(text.charAt(i2))) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0060, code lost:
    
        if (r8.matcher(r0).matches() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer A02(X.C7OQ r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            X.7OQ r0 = X.C7OQ.A06
            r10 = 0
            if (r12 == r0) goto Le
            X.7OQ r0 = X.C7OQ.A02
            if (r12 == r0) goto Le
            X.7OQ r0 = X.C7OQ.A05
            if (r12 == r0) goto Le
        Ld:
            return r10
        Le:
            r0 = 4
            java.lang.Integer[] r6 = X.C05F.A00(r0)
            r5 = 0
            int r4 = r6.length
        L15:
            if (r5 >= r4) goto Ld
            r0 = r6[r5]
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto Lc2;
                case 2: goto Lc6;
                case 3: goto Lca;
                default: goto L20;
            }
        L20:
            java.lang.String r7 = "meta ai"
        L22:
            int r3 = r7.length()
            r2 = 32
            if (r14 < r3) goto Lbf
            int r0 = r13.length()
            if (r0 == r3) goto Lbf
            java.lang.String r1 = X.AnonymousClass001.A0D(r7, r2)
        L34:
            r9 = 1
            if (r14 == 0) goto L3e
            int r0 = r1.length()
            int r0 = r0 - r9
            if (r14 < r0) goto L69
        L3e:
            r0 = 2
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r1, r0)
            int r0 = r1.length()
            int r0 = r14 - r0
            int r1 = r0 + 1
            r0 = 0
            if (r1 >= r0) goto L4f
            r1 = 0
        L4f:
            int r0 = r14 + 1
            java.lang.String r0 = r13.substring(r1, r0)
            X.C14360o3.A07(r0)
            java.util.regex.Matcher r0 = r8.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L69
        L62:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto Lbb
            return r0
        L69:
            if (r14 <= r3) goto Lb5
            int r1 = r13.length()
            int r0 = r3 + 1
            if (r1 == r0) goto Lb5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
        L7b:
            r0.append(r7)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            if (r14 == 0) goto L8e
            int r0 = r1.length()
            int r0 = r0 - r9
            if (r14 < r0) goto Lbb
        L8e:
            r0 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r1, r0)
            int r0 = r1.length()
            int r0 = r14 - r0
            int r1 = r0 + 1
            r0 = 0
            if (r1 >= r0) goto L9f
            r1 = 0
        L9f:
            int r0 = r14 + 1
            java.lang.String r0 = r13.substring(r1, r0)
            X.C14360o3.A07(r0)
            java.util.regex.Matcher r0 = r2.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Lbb
            int r3 = r3 + 1
            goto L62
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L7b
        Lbb:
            int r5 = r5 + 1
            goto L15
        Lbf:
            r1 = r7
            goto L34
        Lc2:
            java.lang.String r7 = "metaai"
            goto L22
        Lc6:
            java.lang.String r7 = "meta"
            goto L22
        Lca:
            java.lang.String r7 = "ai"
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7OR.A02(X.7OQ, java.lang.String, int):java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r6 != '#') goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r6 != '@') goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(X.C7OQ r5, char r6) {
        /*
            int r5 = r5.ordinal()
            r4 = 64
            r3 = 0
            if (r5 == r3) goto L26
            r0 = 1
            r2 = 35
            if (r5 == r0) goto L23
            r0 = 2
            r1 = 47
            if (r5 == r0) goto L1d
            r0 = 3
            if (r5 == r0) goto L21
            r0 = 4
            if (r5 != r0) goto L20
            if (r6 == r4) goto L1f
            if (r6 == r2) goto L1f
        L1d:
            if (r6 != r1) goto L20
        L1f:
            r3 = 1
        L20:
            return r3
        L21:
            if (r6 == r4) goto L1f
        L23:
            if (r6 != r2) goto L20
            goto L1f
        L26:
            if (r6 != r4) goto L20
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7OR.A05(X.7OQ, char):boolean");
    }
}
