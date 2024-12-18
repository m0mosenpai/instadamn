package X;

import android.text.TextWatcher;

/* renamed from: X.APm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23190APm implements TextWatcher {
    public String A00;
    public final boolean A01;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C23190APm(boolean z) {
        this.A00 = "";
        this.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (r4.A01 != false) goto L14;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r3 = "@"
            r2 = 0
            if (r0 <= 0) goto L26
            char r1 = r5.charAt(r2)
            r0 = 64
            if (r1 != r0) goto L2a
            int r0 = r5.length()
            r1 = 1
            if (r0 != r1) goto L2e
            boolean r0 = r4.A01
            if (r0 != 0) goto L25
            int r1 = r5.length()
            java.lang.String r0 = ""
            r5.replace(r2, r1, r0)
        L25:
            return
        L26:
            boolean r0 = r4.A01
            if (r0 == 0) goto L42
        L2a:
            r5.insert(r2, r3)
            goto L42
        L2e:
            int[] r0 = X.AbstractC202818xz.A02
            int r0 = r5.length()
            if (r0 <= r1) goto L49
            java.util.regex.Pattern r0 = X.AbstractC202818xz.A01
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L49
        L42:
            java.lang.String r0 = r5.toString()
            r4.A00 = r0
            return
        L49:
            int r1 = r5.length()
            java.lang.String r0 = r4.A00
            r5.replace(r2, r1, r0)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23190APm.afterTextChanged(android.text.Editable):void");
    }

    public C23190APm() {
        this(false);
    }
}
