package X;

import android.text.TextWatcher;

/* renamed from: X.APk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23188APk implements TextWatcher {
    public boolean A00;
    public final /* synthetic */ C210989Uv A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.A03 != true) goto L6;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r7) {
        /*
            r6 = this;
            r2 = 0
            X.C14360o3.A0B(r7, r2)
            X.9Uv r1 = r6.A01
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            X.9aC r0 = r1.A00
            r5 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.A03
            r4 = 1
            if (r0 == r5) goto L13
        L12:
            r4 = 0
        L13:
            boolean r0 = r6.A00
            if (r0 == 0) goto L39
            java.lang.String r3 = r7.toString()
            java.util.List r0 = X.AJp.A00
            X.C14360o3.A0B(r3, r2)
        L20:
            int r0 = r3.length()
            if (r2 >= r0) goto L39
            char r0 = r3.charAt(r2)
            java.util.List r1 = X.AJp.A00
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3a
            int r2 = r2 + 1
            goto L20
        L39:
            r5 = 0
        L3a:
            if (r4 == 0) goto L41
            if (r5 == 0) goto L41
            r7.clear()
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23188APk.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        this.A00 = AJp.A01(charSequence.toString());
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C23188APk(C210989Uv c210989Uv) {
        this.A01 = c210989Uv;
    }
}
