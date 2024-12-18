package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import java.util.List;

/* renamed from: X.BcQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25869BcQ extends AbstractC52922bZ {
    public static final List A0F = AbstractC16960so.A1Q(EnumC53314Nhq.ANYBODY_CREATOR_DOES_NOT_FOLLOW, EnumC53314Nhq.FOLLOWERS_CREATOR_DOES_NOT_FOLLOW, EnumC53314Nhq.SELECTED_USERS_ONLY);
    public C31349DqE A00;
    public Boolean A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final BP5 A05;
    public final CreatorAiSettingsRepository A06;
    public final String A07;
    public final C5Hc A08;
    public final C05A A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final boolean A0D;
    public final UserSession A0E;

    public C25869BcQ(UserSession userSession, BP5 bp5, CreatorAiSettingsRepository creatorAiSettingsRepository, String str) {
        EnumC27403C7g[] enumC27403C7gArr;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 3);
        this.A0E = userSession;
        this.A06 = creatorAiSettingsRepository;
        this.A07 = str;
        this.A05 = bp5;
        boolean A0K = C14360o3.A0K(userSession.userId, str);
        this.A0D = A0K;
        C06090Tz c06090Tz = C06090Tz.A05;
        EnumC27403C7g enumC27403C7g = null;
        C008002u A1H = AbstractC25225BEi.A1H(new C26067Bfv(null, AbstractC25225BEi.A0t(""), C6R.A03, null, C3T1.SUCCESS, null, "", "", C5HZ.A01, 5, C17s.A04(AbstractC50712Us.A00, new C17u(0, 5)), false, true, true, false, false, false, C18U.A06(c06090Tz, userSession, 36322929266207485L)));
        this.A0A = A1H;
        this.A0C = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(C29254Cux.A00);
        this.A09 = A00;
        this.A0B = AbstractC208910l.A02(A00);
        char c = 6;
        if (C18U.A06(c06090Tz, userSession, 36322929266207485L)) {
            enumC27403C7gArr = new EnumC27403C7g[7];
            enumC27403C7gArr[0] = EnumC27403C7g.A07;
            enumC27403C7gArr[1] = EnumC27403C7g.A05;
            enumC27403C7gArr[2] = EnumC27403C7g.A0J;
            enumC27403C7gArr[3] = EnumC27403C7g.A0D;
            enumC27403C7gArr[4] = EnumC27403C7g.A0H;
            enumC27403C7gArr[5] = C18U.A06(c06090Tz, userSession, 36322929265158898L) ? EnumC27403C7g.A08 : null;
        } else {
            enumC27403C7gArr = new EnumC27403C7g[11];
            enumC27403C7gArr[0] = EnumC27403C7g.A0F;
            enumC27403C7gArr[1] = A0K ? EnumC27403C7g.A0A : null;
            enumC27403C7gArr[2] = EnumC27403C7g.A07;
            enumC27403C7gArr[3] = EnumC27403C7g.A0E;
            enumC27403C7gArr[4] = EnumC27403C7g.A09;
            enumC27403C7gArr[5] = EnumC27403C7g.A0I;
            enumC27403C7gArr[6] = EnumC27403C7g.A0G;
            enumC27403C7gArr[7] = EnumC27403C7g.A0C;
            enumC27403C7gArr[8] = C18U.A06(c06090Tz, userSession, 36322929265945337L) ? EnumC27403C7g.A0B : null;
            enumC27403C7gArr[9] = C18U.A06(c06090Tz, userSession, 36322929265158898L) ? EnumC27403C7g.A08 : null;
            c = '\n';
        }
        EnumC27403C7g enumC27403C7g2 = EnumC27403C7g.A06;
        if (A0K && C18U.A06(c06090Tz, userSession, 36322929265879800L)) {
            enumC27403C7g = enumC27403C7g2;
        }
        enumC27403C7gArr[c] = enumC27403C7g;
        C14360o3.A0B(enumC27403C7gArr, 0);
        this.A08 = AbstractC133095zb.A00(AbstractC009903n.A0I(enumC27403C7gArr));
    }

    public final void A01(boolean z) {
        C05A c05a;
        Object obj;
        C51743MtS c51743MtS = ((C26067Bfv) this.A0C.getValue()).A02;
        if (c51743MtS != null) {
            C05A c05a2 = this.A09;
            String str = c51743MtS.A04;
            String str2 = c51743MtS.A02;
            c05a2.Egh(new C26210Bia(c51743MtS.A03, c51743MtS.A01, str2, str));
            return;
        }
        if (!this.A03) {
            if (!C14360o3.A0K(this.A0E.userId, this.A07)) {
                c05a = this.A09;
                obj = new C26208BiY(2131957083, null);
            } else {
                this.A05.A01(C8j.AUTO_REPLIES);
                c05a = this.A09;
                obj = C29253Cuw.A00;
            }
        } else if (z) {
            c05a = this.A09;
            obj = C29255Cuy.A00;
        } else {
            BP5 bp5 = this.A05;
            bp5.A02(null, null, C8p.A07, this.A01, false, bp5.A00);
            String str3 = this.A02;
            if (str3 == null) {
                return;
            }
            AbstractC166987dD.A1Z(new PXZ(this, str3, null, 3, z), AbstractC141776au.A00(this));
            return;
        }
        c05a.Egh(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r1 = r2.getValue();
        r6 = (X.C26067Bfv) r1;
        r9 = X.AbstractC101904i3.A08(r3);
        X.C14360o3.A07(r9);
        r4 = r3.Bhu();
        r8 = r3.A03.getFbidV2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r8 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r2.AIi(r1, X.C26067Bfv.A00(r4, null, r6, null, r8, r9, 258559, false, false, false, false)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        X.AbstractC166987dD.A1Z(new X.C57155PYz(r15, null, r16, 17), X.AbstractC141776au.A00(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        r3 = X.AnonymousClass189.A00(r15.A0E).A02(r15.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0015, code lost:
    
        if (((X.C26067Bfv) r2.getValue()).A04 == X.C6R.A02) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0017, code lost:
    
        r5 = r2.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r2.AIi(r5, X.C26067Bfv.A01(X.C6R.A03, (X.C26067Bfv) r5, 262135, false)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r15.A0D == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r3 = X.C17060sy.A01.A01(r15.A0E);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(int r16) {
        /*
            r15 = this;
            X.BP5 r2 = r15.A05
            X.C8p r1 = X.C8p.A09
            java.lang.String r0 = r2.A00
            r2.A04(r1, r0)
            X.05A r2 = r15.A0A
            java.lang.Object r0 = r2.getValue()
            X.Bfv r0 = (X.C26067Bfv) r0
            X.C6R r1 = r0.A04
            X.C6R r0 = X.C6R.A02
            if (r1 != r0) goto L2e
        L17:
            java.lang.Object r5 = r2.getValue()
            r4 = r5
            X.Bfv r4 = (X.C26067Bfv) r4
            r3 = 0
            X.C6R r1 = X.C6R.A03
            r0 = 262135(0x3fff7, float:3.6733E-40)
            X.Bfv r0 = X.C26067Bfv.A01(r1, r4, r0, r3)
            boolean r0 = r2.AIi(r5, r0)
            if (r0 == 0) goto L17
        L2e:
            boolean r0 = r15.A0D
            if (r0 == 0) goto L7d
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r15.A0E
            com.instagram.user.model.User r3 = r1.A01(r0)
        L3a:
            if (r3 == 0) goto L6b
        L3c:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            X.Bfv r6 = (X.C26067Bfv) r6
            java.lang.String r9 = X.AbstractC101904i3.A08(r3)
            X.C14360o3.A07(r9)
            com.instagram.common.typedurl.ImageUrl r4 = r3.Bhu()
            X.17P r0 = r3.A03
            java.lang.String r8 = r0.getFbidV2()
            if (r8 != 0) goto L58
            java.lang.String r8 = ""
        L58:
            r11 = 0
            r5 = 0
            r10 = 258559(0x3f1ff, float:3.62318E-40)
            r7 = r5
            r12 = r11
            r13 = r11
            r14 = r11
            X.Bfv r0 = X.C26067Bfv.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L3c
        L6b:
            X.6aw r3 = X.AbstractC141776au.A00(r15)
            r2 = 0
            r1 = 17
            X.PYz r0 = new X.PYz
            r4 = r16
            r0.<init>(r15, r2, r4, r1)
            X.AbstractC166987dD.A1Z(r0, r3)
            return
        L7d:
            com.instagram.common.session.UserSession r0 = r15.A0E
            X.18A r1 = X.AnonymousClass189.A00(r0)
            java.lang.String r0 = r15.A07
            com.instagram.user.model.User r3 = r1.A02(r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25869BcQ.A00(int):void");
    }
}
