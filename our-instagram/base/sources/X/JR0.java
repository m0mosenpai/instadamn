package X;

import android.text.TextWatcher;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JR0 implements TextWatcher {
    public final /* synthetic */ C143316dW A00;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (X.C14360o3.A0K(r2, r1) == false) goto L13;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r13) {
        /*
            r12 = this;
            r0 = 0
            X.C14360o3.A0B(r13, r0)
            X.6dW r3 = r12.A00
            r4 = 1
            X.C143316dW.A03(r3)
            X.6m5 r5 = r3.A0o
            X.6ln r2 = r5.A06
            java.lang.String r0 = r13.toString()
            java.lang.String r0 = X.AbstractC25228BEl.A1A(r0)
            int r0 = r0.length()
            r1 = 1
            if (r0 != 0) goto La0
            boolean r0 = r5.A00
            if (r0 == 0) goto La0
        L21:
            r2.A0M(r1)
            boolean r1 = r3.A0E
            r0 = 0
            if (r1 == 0) goto L37
            com.instagram.user.model.User r2 = r3.A0B
            X.1vS r1 = r3.A07
            if (r1 == 0) goto L9e
            com.instagram.user.model.User r1 = r1.A0i
        L31:
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 != 0) goto L6e
        L37:
            com.instagram.common.session.UserSession r6 = r3.A0e
            X.0Tz r5 = X.C06090Tz.A06
            r1 = 36320932104709119(0x8109b2000323ff, double:3.032841943448022E-306)
            boolean r1 = X.C18U.A06(r5, r6, r1)
            if (r1 == 0) goto L6e
            r3.A0E = r4
            X.1vS r1 = r3.A07
            if (r1 == 0) goto L4e
            com.instagram.user.model.User r0 = r1.A0i
        L4e:
            r3.A0B = r0
            X.1Ai r8 = X.AbstractC23021Ah.A00(r6)
            X.1vS r0 = r3.A07
            if (r0 == 0) goto L9b
            com.instagram.user.model.User r0 = r0.A0i
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.getId()
        L60:
            long r10 = java.lang.Long.parseLong(r0)
            X.Lru r7 = new X.Lru
            r7.<init>(r3, r4)
            java.lang.String r9 = ""
            X.JV7.A01(r6, r7, r8, r9, r10)
        L6e:
            java.lang.Long r0 = r3.A0D
            if (r0 != 0) goto L9a
            int r0 = r13.length()
            if (r0 <= 0) goto L9a
            com.instagram.common.session.UserSession r4 = r3.A0e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320790371181465(0x81099100092399, double:3.032752310594419E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L94
            X.3kb r1 = X.C143316dW.A00(r3)
            if (r1 == 0) goto L94
            X.6oC r0 = r3.A0m
            if (r0 == 0) goto L94
            r0.A02(r1)
        L94:
            java.lang.Long r0 = X.AbstractC31173DnH.A0g()
            r3.A0D = r0
        L9a:
            return
        L9b:
            java.lang.String r0 = "-1"
            goto L60
        L9e:
            r1 = r0
            goto L31
        La0:
            r1 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR0.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public JR0(C143316dW c143316dW) {
        this.A00 = c143316dW;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C38321qM c38321qM;
        C143316dW c143316dW = this.A00;
        C41181vS c41181vS = c143316dW.A07;
        if (c41181vS != null && (c38321qM = c41181vS.A0b) != null && i == 0 && i2 == 0 && i3 == 1 && !c143316dW.A0F && !c143316dW.A0G) {
            UserSession userSession = c143316dW.A0e;
            if (C18U.A06(C06090Tz.A05, userSession, 36323693768486387L)) {
                C56808PJa c56808PJa = new C56808PJa(c143316dW, 1);
                C0eR c0eR = c143316dW.A0c.mLifecycleRegistry;
                C14360o3.A07(c0eR);
                AbstractC168457ff.A02(c143316dW.A0V, c0eR, AbstractC12220kQ.A02(userSession), userSession, c38321qM, c56808PJa, C05F.A0C, C16930sl.A00);
            }
        }
    }
}
