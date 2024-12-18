package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.LWs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48243LWs implements MPX {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r3.length() == 0) goto L5;
     */
    @Override // X.MPX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object AWi(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L9
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto La
        L9:
            r1 = 1
        La:
            r0 = 0
            if (r1 != 0) goto L15
            X.16L r1 = X.C16V.A00(r3)     // Catch: java.io.IOException -> L15
            X.KAx r0 = X.AbstractC46625Kk2.parseFromJson(r1)     // Catch: java.io.IOException -> L15
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48243LWs.AWi(java.lang.String):java.lang.Object");
    }

    @Override // X.MPX
    public final /* bridge */ /* synthetic */ String F7n(Object obj) {
        C45462KAx c45462KAx = (C45462KAx) obj;
        if (c45462KAx == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            String str = c45462KAx.A00;
            if (str != null) {
                A0S.A0S("recovery_key", str);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
