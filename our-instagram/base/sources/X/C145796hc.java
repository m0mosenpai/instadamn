package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.6hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145796hc {
    public Integer A00;
    public Integer A01;
    public int A02;
    public int A03;
    public C145806hd A04;
    public final Map A05;
    public final java.util.Set A06;
    public final java.util.Set A07;
    public final java.util.Set A08;
    public final java.util.Set A09;
    public final java.util.Set A0A;
    public final java.util.Set A0B;
    public final UserSession A0C;
    public final LinkedList A0D;
    public final LinkedList A0E;
    public final java.util.Set A0F;
    public final java.util.Set A0G;

    public C145796hc(UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A0C = userSession;
        this.A05 = new LinkedHashMap();
        this.A02 = -1;
        this.A03 = -1;
        this.A08 = new LinkedHashSet();
        this.A09 = new LinkedHashSet();
        this.A0B = new LinkedHashSet();
        this.A0A = new LinkedHashSet();
        this.A06 = new LinkedHashSet();
        this.A07 = new LinkedHashSet();
        this.A0G = new LinkedHashSet();
        this.A0F = new LinkedHashSet();
        this.A0D = new LinkedList();
        this.A0E = new LinkedList();
        this.A04 = new C145806hd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r0.A00 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
    
        if (X.C14360o3.A0K(r1, r24.A0j) == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.common.session.UserSession r22, com.instagram.model.reels.Reel r23, X.C41181vS r24, int r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145796hc.A01(com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, X.1vS, int):void");
    }

    public final void A02(C41181vS c41181vS, int i) {
        java.util.Set set;
        C14360o3.A0B(c41181vS, 0);
        java.util.Set set2 = this.A0G;
        String str = c41181vS.A0j;
        if (!set2.contains(str)) {
            if (!c41181vS.CdW()) {
                boolean A1Q = c41181vS.A1Q();
                set = this.A08;
                if (!A1Q) {
                    C14360o3.A07(str);
                    set.add(str);
                }
                C14360o3.A07(str);
                set.add(str);
            }
            set = this.A0B;
            C14360o3.A07(str);
            set.add(str);
        }
        C14360o3.A07(str);
        set2.add(str);
        this.A09.add(str);
        this.A0A.add(str);
        this.A04.A03.A03(this.A08.size(), this.A0B.size(), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r1 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (X.C14360o3.A0K(r1, r8.A0j) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A00(com.instagram.model.reels.Reel r7, X.C41181vS r8) {
        /*
            r6 = this;
            boolean r5 = X.AbstractC130925vf.A0W(r7)
            r4 = 1
            if (r5 == 0) goto L1a
            com.instagram.common.session.UserSession r0 = r6.A0C
            X.1vS r0 = r7.A09(r0)
            if (r0 == 0) goto L31
            java.lang.String r1 = r0.A0j
        L11:
            java.lang.String r0 = r8.A0j
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r3 = 1
            if (r0 != 0) goto L1b
        L1a:
            r3 = 0
        L1b:
            X.1pR r0 = r7.A0X
            r2 = 0
            if (r0 == 0) goto L26
            r2 = 1
            int r1 = r0.A00
            r0 = 1
            if (r1 == 0) goto L27
        L26:
            r0 = 0
        L27:
            if (r5 != 0) goto L2b
            if (r2 == 0) goto L30
        L2b:
            if (r3 != 0) goto L30
            if (r0 != 0) goto L30
            r4 = 0
        L30:
            return r4
        L31:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145796hc.A00(com.instagram.model.reels.Reel, X.1vS):boolean");
    }
}
