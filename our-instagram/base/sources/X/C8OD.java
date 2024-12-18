package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8OD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OD extends AbstractC52922bZ {
    public int A00;
    public List A01;
    public boolean A02;
    public final int A03;
    public final UserSession A04;
    public final C149776oU A05;
    public final List A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final boolean A09;

    public /* synthetic */ C8OD(UserSession userSession, boolean z, int i) {
        C149776oU c149776oU = new C149776oU(userSession);
        C14360o3.A0B(userSession, 3);
        this.A09 = z;
        this.A03 = i;
        this.A04 = userSession;
        this.A05 = c149776oU;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A07 = c24721Ip;
        this.A08 = AbstractC07080Za.A03(c24721Ip);
        this.A01 = C16930sl.A00;
        this.A06 = AbstractC16960so.A1N(new C09530e4(null, null));
    }

    public final C09530e4 A00() {
        C09530e4 c09530e4;
        int i = this.A00;
        List list = this.A06;
        if (i >= list.size() || (c09530e4 = (C09530e4) AbstractC001800i.A0O(list, this.A00)) == null) {
            return new C09530e4(EnumC222699sA.A04, null);
        }
        return c09530e4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r19.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.util.List r19) {
        /*
            r18 = this;
            r4 = r18
            java.util.List r3 = r4.A06
            r3.clear()
            r10 = 0
            X.0e4 r0 = new X.0e4
            r0.<init>(r10, r10)
            r3.add(r0)
            r5 = r19
            if (r19 == 0) goto L1b
            boolean r1 = r5.isEmpty()
            r0 = 0
            if (r1 == 0) goto L1c
        L1b:
            r0 = 1
        L1c:
            r0 = r0 ^ 1
            r4.A02 = r0
            r2 = 10
            if (r19 == 0) goto L9e
            int r0 = X.AbstractC06950Ym.A1E(r5, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r7 = r5.iterator()
        L31:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r9 = r7.next()
            com.instagram.api.schemas.StoryTemplateDict r9 = (com.instagram.api.schemas.StoryTemplateDict) r9
            boolean r14 = r4.A09
            int r13 = r4.A03
            r15 = 0
            X.83y r8 = new X.83y
            r11 = r10
            r12 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.List r5 = r8.A03
            int r0 = X.AbstractC06950Ym.A1E(r5, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r12 = r5.next()
            X.AA2 r12 = (X.AA2) r12
            X.5NL r13 = r12.A06
            r17 = 1
            r16 = 12
            X.9Zk r11 = new X.9Zk
            r14 = r10
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6.add(r11)
            goto L58
        L75:
            r1.add(r6)
            goto L31
        L79:
            int r0 = X.AbstractC06950Ym.A1E(r1, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L86:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r2 = r4.next()
            X.9sA r1 = X.EnumC222699sA.A02
            X.0e4 r0 = new X.0e4
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L86
        L9b:
            r3.addAll(r5)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8OD.A01(java.util.List):void");
    }
}
