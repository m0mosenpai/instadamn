package X;

import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;
import java.util.List;

/* renamed from: X.BcM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25867BcM extends AbstractC52922bZ {
    public C45116Jxl A00;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A06;
    public AnonymousClass195 A07;
    public final AvoidedTopicsRepository A08;
    public final C05A A09;
    public final C0UO A0A;
    public String A01 = "";
    public boolean A05 = true;

    public C25867BcM(AvoidedTopicsRepository avoidedTopicsRepository) {
        this.A08 = avoidedTopicsRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26080Bg9());
        this.A09 = A1H;
        this.A0A = AbstractC208910l.A02(A1H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r12.A01) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r12.A05 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C25867BcM r12) {
        /*
            X.05A r3 = r12.A09
        L2:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            X.Bg9 r5 = (X.C26080Bg9) r5
            java.lang.Object r1 = r5.A02
            X.Mth r1 = (X.C51758Mth) r1
            boolean r0 = r12.A06
            r2 = 0
            if (r0 != 0) goto L17
            boolean r0 = r12.A05
            r6 = 1
            if (r0 == 0) goto L18
        L17:
            r6 = 0
        L18:
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            r0 = 19
            X.Mth r7 = new X.Mth
            r7.<init>(r6, r1, r0)
            boolean r0 = r12.A06
            if (r0 == 0) goto L38
            boolean r0 = r12.A05
            if (r0 == 0) goto L38
            java.lang.String r0 = r12.A01
            boolean r0 = X.AbstractC25225BEi.A1Y(r0)
            r11 = 1
            if (r0 != 0) goto L39
        L38:
            r11 = 0
        L39:
            boolean r0 = r12.A05
            if (r0 != 0) goto L42
            boolean r0 = r12.A06
            if (r0 != 0) goto L42
            r2 = 1
        L42:
            java.lang.String r0 = r12.A01
            boolean r1 = X.AbstractC25225BEi.A1Y(r0)
            r0 = 11
            X.MSf r6 = new X.MSf
            r6.<init>(r2, r1, r0)
            java.lang.Object r1 = r5.A04
            X.MtP r1 = (X.C51740MtP) r1
            boolean r0 = r12.A05
            r2 = r0 ^ 1
            java.lang.String r1 = r1.A00
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = 7
            X.MtP r8 = new X.MtP
            r8.<init>(r1, r2, r0)
            java.lang.Object r9 = r5.A03
            X.C6R r9 = (X.C6R) r9
            java.lang.Object r10 = r5.A05
            X.C6R r10 = (X.C6R) r10
            X.Bg9 r5 = new X.Bg9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r3.AIi(r4, r5)
            if (r0 == 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25867BcM.A00(X.BcM):void");
    }

    public final void A01() {
        Object value;
        if (!AbstractC001900j.A0T(this.A01)) {
            this.A04 = false;
            C05A c05a = this.A09;
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C26080Bg9.A00(null, null, (C26080Bg9) value, null, C6R.A03, null, 62)));
            AnonymousClass195 anonymousClass195 = this.A07;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            this.A07 = AbstractC25226BEj.A1L(D4z.A02(this, null, 41), AbstractC141776au.A00(this));
        }
    }
}
