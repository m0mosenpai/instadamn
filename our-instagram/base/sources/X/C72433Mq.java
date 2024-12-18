package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72433Mq extends C0T6 implements InterfaceC41141vN {
    public int A00;
    public C38321qM A01;
    public String A02;
    public String A03;
    public final C75113Zb A04;
    public final String A05;
    public final boolean A06;
    public final UserSession A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72433Mq) {
                C72433Mq c72433Mq = (C72433Mq) obj;
                if (!C14360o3.A0K(this.A05, c72433Mq.A05) || !C14360o3.A0K(this.A01, c72433Mq.A01) || !C14360o3.A0K(this.A04, c72433Mq.A04) || !C14360o3.A0K(this.A03, c72433Mq.A03) || !C14360o3.A0K(this.A07, c72433Mq.A07) || !C14360o3.A0K(this.A08, c72433Mq.A08) || this.A06 != c72433Mq.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A05.hashCode() * 31) + this.A01.hashCode()) * 31;
        C75113Zb c75113Zb = this.A04;
        int i = 0;
        if (c75113Zb == null) {
            hashCode = 0;
        } else {
            hashCode = c75113Zb.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31;
        String str = this.A08;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C72433Mq(com.instagram.common.session.UserSession r9, X.C38321qM r10, X.C75113Zb r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r8 = this;
            r8.<init>()
            r8.A05 = r12
            r8.A01 = r10
            r8.A04 = r11
            r8.A03 = r13
            r8.A07 = r9
            r8.A08 = r14
            r8.A06 = r15
            r0 = -1
            r8.A00 = r0
            int r0 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.NumberFormatException -> L1b
            r8.A00 = r0     // Catch: java.lang.NumberFormatException -> L1b
            goto L23
        L1b:
            r2 = move-exception
            java.lang.String r1 = "MediaEvent"
            java.lang.String r0 = "Failed to convert carousel child mention index to int"
            X.C0w9.A06(r1, r0, r2)
        L23:
            X.1qM r1 = r8.A01
            com.instagram.common.session.UserSession r0 = r8.A07
            X.1qM r0 = r1.A1g(r0)
            r8.A01 = r0
            int r7 = r8.A00
            X.1rF r0 = r0.A0C
            java.util.List r0 = r0.AmB()
            if (r0 == 0) goto L61
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
        L3c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r4 = r6.next()
            X.1qM r4 = (X.C38321qM) r4
            java.lang.String r3 = r4.getId()
            r2 = 1
            if (r3 == 0) goto L59
            java.lang.String r1 = "open_carousel_prompt"
            r0 = 0
            boolean r0 = X.AbstractC002300n.A0f(r3, r1, r0)
            if (r0 != r2) goto L59
            goto L3c
        L59:
            if (r5 != r7) goto L78
            java.lang.String r0 = r4.getId()
            if (r0 != 0) goto L75
        L61:
            java.lang.String r2 = r8.A08
            if (r2 == 0) goto L7b
            X.1qM r0 = r8.A01
            java.lang.String r1 = r0.Biv()
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            r0 = 95
            java.lang.String r0 = X.AnonymousClass001.A0T(r2, r1, r0)
        L75:
            r8.A02 = r0
            return
        L78:
            int r5 = r5 + 1
            goto L3c
        L7b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72433Mq.<init>(com.instagram.common.session.UserSession, X.1qM, X.3Zb, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
