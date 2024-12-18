package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Bof, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26582Bof extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final Reel A02;
    public final User A03;
    public final C37616GhB A04;
    public final boolean A05;
    public final MVN A06;
    public final C57 A07;
    public final InterfaceC31071DlD A08;
    public final InterfaceC16820sZ A09;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(android.content.Context r18, android.view.View r19, X.C26582Bof r20, float r21, float r22, boolean r23) {
        /*
            r5 = 0
            if (r23 == 0) goto L5e
            r2 = r20
            X.MVN r11 = r2.A06
            boolean r0 = r11.A08
            if (r0 == 0) goto L5e
            X.DlD r7 = r2.A08
            java.lang.Object r3 = r11.A04
            X.5dq r3 = (X.C120985dq) r3
            boolean r0 = r3.CdW()
            if (r0 == 0) goto L5b
            X.C65 r0 = X.C65.INFLUENCER
        L19:
            r4 = 1
            X.JxX r10 = new X.JxX
            r6 = r21
            r1 = r22
            r10.<init>(r0, r6, r1)
            X.0sZ r15 = r2.A09
            java.lang.Object r0 = r11.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L32
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L33
        L32:
            r0 = 1
        L33:
            r16 = r0 ^ 1
            r9 = r19
            java.lang.Object r1 = r9.getTag()
            java.lang.String r0 = "clips_author_info_profile_pic_component"
            boolean r17 = X.C14360o3.A0K(r1, r0)
            boolean r1 = r2.A05
            java.lang.Object r0 = r11.A05
            X.Ghd r0 = (X.C37644Ghd) r0
            X.3Zb r13 = r0.A0E
            if (r13 == 0) goto L5e
            boolean r19 = r3.CdW()
            com.instagram.user.model.User r14 = r2.A03
            X.2pS r12 = r2.A01
            r8 = r18
            r18 = r1
            r7.Dbj(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r4
        L5b:
            X.C65 r0 = X.C65.BRAND
            goto L19
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26582Bof.A04(android.content.Context, android.view.View, X.Bof, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0254  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r28) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26582Bof.A0Y(X.3bS):X.2Vc");
    }

    private final C51722Yv A03(MVN mvn, C2Z1 c2z1, C3PD c3pd, List list, int i) {
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CV.A00(AbstractC25231BEo.A0Y(AbstractC25233BEq.A0a(C9CV.A00(AbstractC25233BEq.A0X(C9CU.A00(null, C05F.A00, 0, AbstractC77623dm.A0D(c2z1, R.dimen.biz_sign_up_divider_bottom_margin)), c2z1, R.dimen.biz_sign_up_divider_bottom_margin), C05F.A08, "profile_picture", 4), C05F.A0C, 0.0f), DRY.A00(mvn, c3pd, 8)), C05F.A04, DRY.A00(this, c2z1, 9), 4);
        String A01 = AbstractC100574fM.A01(AbstractC77363dM.A00(c2z1), AbstractC166987dD.A1F(AbstractC001800i.A0X(list)), list.size(), AbstractC25230BEn.A1S(AbstractC166987dD.A1F(AbstractC001800i.A0X(list)).size(), i), AbstractC167007dF.A1P(i, 2));
        C14360o3.A07(A01);
        return C9CV.A00(AbstractC25233BEq.A0N(EnumC77673dr.A0Q, C9CV.A00(A00, C05F.A0N, AbstractC77623dm.A0G(c2z1, A01, 2131970237), 0)), C05F.A0D, "clips_author_info_profile_pic_component", 4);
    }

    public C26582Bof(MVN mvn, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Reel reel, User user, C57 c57, InterfaceC31071DlD interfaceC31071DlD, C37616GhB c37616GhB, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167027dH.A13(mvn, user, userSession);
        C14360o3.A0B(c37616GhB, 6);
        this.A06 = mvn;
        this.A03 = user;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A08 = interfaceC31071DlD;
        this.A04 = c37616GhB;
        this.A02 = reel;
        this.A09 = interfaceC16820sZ;
        this.A05 = z;
        this.A07 = c57;
    }
}
