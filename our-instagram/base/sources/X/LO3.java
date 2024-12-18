package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;

/* loaded from: classes8.dex */
public final class LO3 implements NoCopySpan, TextWatcher {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public LO3(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A03 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r4.A00 != false) goto L8;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            int r0 = 2 - r0
            if (r0 != 0) goto L2f
            java.lang.String r3 = r5.toString()
            java.lang.Object r0 = r4.A03
            X.IMx r0 = (X.C41232IMx) r0
            r0.A00 = r3
            java.lang.Object r1 = r4.A02
            X.GwI r1 = (X.C38497GwI) r1
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            X.2jc r0 = r1.A03
            android.view.View r2 = r0.A01()
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2b
            boolean r1 = r4.A00
            r0 = 0
            if (r1 == 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            r2.setActivated(r0)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LO3.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r13.length() == 0) goto L23;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L52;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r3 = r12.A03
            X.LLB r3 = (X.LLB) r3
            boolean r0 = r3.A0K
            r2 = 1
            if (r0 != 0) goto L1b
            long r0 = X.AbstractC43593JPy.A06()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0E = r0
            r3.A0K = r2
        L1b:
            if (r13 == 0) goto L2a
            java.lang.CharSequence r0 = X.AbstractC001900j.A0B(r13)
            if (r0 == 0) goto L2a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L2b
        L2a:
            r0 = 1
        L2b:
            X.LLB.A03(r3, r0, r2)
            java.lang.Object r0 = r12.A02
            X.KQx r0 = (X.C45842KQx) r0
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r1 = r0.A05
            if (r1 == 0) goto L5
            boolean r0 = r12.A00
            if (r0 != 0) goto L5
            X.BSo r4 = X.BSo.A00
            com.instagram.common.session.UserSession r5 = r3.A0Q
            java.lang.String r7 = r1.A04
            java.lang.String r8 = r1.A06
            java.lang.String r9 = r1.A05
            java.lang.Integer r6 = r1.A02
            java.lang.String r10 = r1.A0A
            long r0 = r3.A00
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r4.A07(r5, r6, r7, r8, r9, r10, r11)
            goto L76
        L52:
            java.lang.Object r3 = r12.A02
            X.6m9 r3 = (X.C148396m9) r3
            r2 = 1
            if (r13 == 0) goto L60
            int r1 = r13.length()
            r0 = 0
            if (r1 != 0) goto L61
        L60:
            r0 = 1
        L61:
            r1 = r0 ^ 1
            r0 = 0
            r3.A01(r0, r1, r2)
            boolean r0 = r12.A00
            if (r0 != 0) goto L5
            java.lang.Object r0 = r12.A03
            X.EN9 r0 = (X.EN9) r0
            X.0sZ r0 = r0.A05
            if (r0 == 0) goto L5
            r0.invoke()
        L76:
            r12.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LO3.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public LO3(C38497GwI c38497GwI, C41232IMx c41232IMx, boolean z) {
        this.A01 = 2;
        this.A03 = c41232IMx;
        this.A02 = c38497GwI;
        this.A00 = z;
    }
}
