package X;

import android.content.Context;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.Lqq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49296Lqq implements C7TM, InterfaceC13050lr {
    public final C41761wQ A00;
    public final C6JX A01;
    public final UserSession A02;
    public final C47764L7k A03;

    @Override // X.C7TM
    public final void ENB(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, boolean z) {
    }

    @Override // X.C7TM
    public final void ENC(SocialContextType socialContextType, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    @Override // X.C7TM
    public final void END(SocialContextType socialContextType, C148286ly c148286ly, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z) {
        AbstractC167007dF.A1G(directShareTarget, 0, str2);
        this.A03.A00(new L4I(directShareTarget, C2EY.A0W, c38321qM, str, str2, z));
    }

    @Override // X.C7TM
    public final void ENF(C84923qg c84923qg, DirectShareTarget directShareTarget, String str, boolean z) {
    }

    @Override // X.C7TM
    public final void ENG(C148286ly c148286ly, C38321qM c38321qM, DirectPendingLayeredXma directPendingLayeredXma, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
    }

    @Override // X.C7TM
    public final void ENH(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
    }

    @Override // X.C7TM
    public final void ENJ(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        C14360o3.A0B(str8, 9);
        if (str3 != null && str3.length() != 0) {
            this.A03.A00(new L4I(directShareTarget, C2EY.A0g, str3, str7, str8, z));
        } else {
            C0w9.A04("MsysSendShareManager", "Fail to send destination share due to null title", 1);
        }
    }

    @Override // X.C7TM
    public final void ENP(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7 = str6;
        boolean A1V = AbstractC167007dF.A1V(str2);
        if (str3 != null) {
            C50679MYx c50679MYx = new C50679MYx(str2, str3, 36);
            C47764L7k c47764L7k = this.A03;
            C2EY c2ey = C2EY.A0r;
            if (str6 == null) {
                str7 = "";
            }
            c47764L7k.A00(new L4I(directShareTarget, c2ey, c50679MYx, str, str7, z));
            return;
        }
        C0w9.A04("MsysSendShareManager", "Fail to send fbpay referral share due to null fbid", A1V ? 1 : 0);
    }

    @Override // X.C7TM
    public final void ENQ(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, boolean z, boolean z2) {
    }

    @Override // X.C7TM
    public final void ENT(DirectShareTarget directShareTarget, GKP gkp, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 2);
        this.A03.A00(new L4I(directShareTarget, C2EY.A0w, gkp.A08, str2, str3, z));
    }

    @Override // X.C7TM
    public final void ENU(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        C14360o3.A0B(str2, 3);
        this.A03.A00(new L4I(directShareTarget, C2EY.A0t, c38321qM, str, str2, z));
    }

    @Override // X.C7TM
    public final void ENW(InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        C14360o3.A0B(str2, 2);
        this.A03.A00(new L4I(directShareTarget, C2EY.A13, infoCenterFactShareInfoIntf, str, str2, z));
    }

    @Override // X.C7TM
    public final void ENX(InfoCenterShareInfoIntf infoCenterShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        C14360o3.A0B(str2, 2);
        this.A03.A00(new L4I(directShareTarget, C2EY.A14, infoCenterShareInfoIntf, str, str2, z));
    }

    @Override // X.C7TM
    public final void ENd(Context context, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z) {
        AbstractC25233BEq.A0x(1, str, str4, str5);
        if (C18U.A06(C06090Tz.A05, this.A02, 2342156760134191338L)) {
            C6JY c6jy = this.A01.A00;
            InterfaceC2056098k A0X = JQ0.A0X(directShareTarget);
            String A0t = AbstractC31174DnI.A0t(context, str2, AnonymousClass001.A0u("https://www.instagram.com/", str2, "/live/", str), 2131959956);
            C14360o3.A07(A0t);
            C41761wQ c41761wQ = this.A00;
            c41761wQ.A02(c6jy.A0B(A0X, C05F.A00, C05F.A0j, A0t, str4, false), C49772Lyf.A00);
            if (str3.length() > 0) {
                c41761wQ.A02(c6jy.A0C(A0X, str3, str4), C49773Lyg.A00);
            }
        }
    }

    @Override // X.C7TM
    public final void ENe(C148286ly c148286ly, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str4, 5);
        this.A03.A00(new L4I(directShareTarget, C2EY.A1w, str, str3, str4, z));
    }

    @Override // X.C7TM
    public final void ENj(SocialContextType socialContextType, C148286ly c148286ly, C32068E6u c32068E6u, C38321qM c38321qM, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3) {
        C14360o3.A0B(directShareTarget, 0);
        this.A03.A00(new L4I(directShareTarget, C2EY.A1F, new C9CL(c38321qM, null, str, str2, null), str, c32068E6u.A01, c32068E6u.A02));
    }

    @Override // X.C7TM
    public final void ENw(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    @Override // X.C7TM
    public final void EO0(Context context, AnonymousClass442 anonymousClass442, DirectShareTarget directShareTarget, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, boolean z) {
        AbstractC167007dF.A1D(context, 0, c183978Ee);
        InterfaceC2056098k A0X = JQ0.A0X(directShareTarget);
        C6JY c6jy = this.A01.A00;
        C41761wQ c41761wQ = this.A00;
        c41761wQ.A02(c6jy.A0A(A0X, c183978Ee, null, null, str2, false), C49775Lyi.A00);
        if (str != null && str.length() != 0) {
            c41761wQ.A02(c6jy.A0C(A0X, str, str2), C49776Lyj.A00);
        }
    }

    @Override // X.C7TM
    public final void EO3(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    @Override // X.C7TM
    public final void EO4(DirectShareTarget directShareTarget, Product product, String str, String str2, boolean z) {
        C14360o3.A0B(str2, 3);
        this.A03.A00(new L4I(directShareTarget, C2EY.A1a, product.A01, str, str2, z));
    }

    @Override // X.C7TM
    public final void EO7(MessagingOffPlatformShareType messagingOffPlatformShareType, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
    }

    @Override // X.C7TM
    public final void EOC(C148286ly c148286ly, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(str5, 6);
        this.A03.A00(new L4I(directShareTarget, C2EY.A1U, str4, str, str5, z));
    }

    @Override // X.C7TM
    public final void EOD(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, boolean z) {
    }

    @Override // X.C7TM
    public final void EOM(DirectShareTarget directShareTarget, String str, String str2, boolean z) {
    }

    @Override // X.C7TM
    public final void EOP(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        String str7 = str6;
        C45116Jxl c45116Jxl = new C45116Jxl(str3, str2, str4, 13);
        C47764L7k c47764L7k = this.A03;
        C2EY c2ey = C2EY.A1c;
        if (str6 == null) {
            str7 = "";
        }
        c47764L7k.A00(new L4I(directShareTarget, c2ey, c45116Jxl, str, str7, z));
    }

    @Override // X.C7TM
    @Deprecated(message = "Please use forwardMessage instead.")
    public final void EOX(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C6JY c6jy = this.A01.A00;
        InterfaceC2056098k A0X = JQ0.A0X(directShareTarget);
        C41761wQ c41761wQ = this.A00;
        c41761wQ.A02(c6jy.A0B(A0X, null, null, str, str3, z2), C49777Lyk.A00);
        if (str2.length() != 0) {
            c41761wQ.A02(c6jy.A0C(A0X, str2, str3), C49778Lyl.A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7TM
    public final void EOi(Context context, C26069Bfx c26069Bfx, AnonymousClass442 anonymousClass442, DirectShareTarget directShareTarget, ClipInfo clipInfo, C47Z c47z, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0v(0, context, clipInfo, str);
        C14360o3.A0B(str3, 6);
        InterfaceC2056098k A0X = JQ0.A0X(directShareTarget);
        C6JY c6jy = this.A01.A00;
        C41761wQ c41761wQ = this.A00;
        C42221xC A01 = C6JY.A01(c6jy, A0X);
        c41761wQ.A02(AbstractC43593JPy.A0M(new C48377Lar(c6jy, clipInfo, null, 0 == true ? 1 : 0, str, str3, false), A01), C49780Lyn.A00);
        if (str2 != null && str2.length() != 0) {
            c41761wQ.A02(c6jy.A0C(A0X, str2, str3), C49781Lyo.A00);
        }
    }

    @Override // X.C7TM
    public final void EN2(DirectAREffectShare directAREffectShare, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        this.A03.A00(new L4I(directShareTarget, C2EY.A0M, directAREffectShare, str, str2, z));
    }

    @Override // X.C7TM
    public final void ENE(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z) {
        this.A03.A00(new L4I(directShareTarget, C2EY.A0a, savedCollection, str, str2, z));
    }

    @Override // X.C7TM
    public final void ENc(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        C6JY c6jy = this.A01.A00;
        InterfaceC2056098k A0X = JQ0.A0X(directShareTarget);
        C41761wQ c41761wQ = this.A00;
        c41761wQ.A02(c6jy.A0C(A0X, str, str3), C49770Lyd.A00);
        if (str2.length() != 0) {
            c41761wQ.A02(c6jy.A0C(A0X, str2, str3), C49771Lye.A00);
        }
    }

    @Override // X.C7TM
    public final void ENh(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        throw AbstractC166987dD.A1D("stub");
    }

    @Override // X.C7TM
    public final void EO5(C148286ly c148286ly, DirectShareTarget directShareTarget, User user, String str, String str2, String str3, boolean z) {
        this.A03.A00(new L4I(directShareTarget, C2EY.A1Q, user, str, str2, z));
    }

    @Override // X.C7TM
    public final void EO8(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z, boolean z2) {
        this.A03.A00(new L4I(directShareTarget, C2EY.A0a, savedCollection, str, str2, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r16.A03 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7TM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EOB(X.C45001Jvr r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r15 = this;
            r10 = r16
            com.instagram.model.direct.gifs.DirectAnimatedMedia r13 = r10.A02
            X.1qM r2 = r10.A00
            java.lang.String r3 = r10.A0J
            java.lang.String r4 = r10.A0I
            java.lang.String r5 = r10.A0D
            java.lang.String r6 = r10.A0B
            java.lang.String r0 = r10.A0G
            if (r0 != 0) goto L17
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r10.A03
            r9 = 0
            if (r0 == 0) goto L18
        L17:
            r9 = 1
        L18:
            r7 = 0
            java.lang.String r8 = r10.A07
            X.7QR r1 = new X.7QR
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            X.L7k r2 = r15.A03
            X.2EY r11 = X.C2EY.A1V
            if (r13 != 0) goto L27
            r13 = r3
        L27:
            X.L3c r9 = new X.L3c
            r14 = r17
            r12 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            X.Jvr r0 = r9.A00
            boolean r0 = r0.A0K
            if (r0 == 0) goto L45
            java.util.Map r1 = r2.A02
            X.2EY r0 = r9.A01
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L54
            X.MQ4 r0 = (X.MQ4) r0
        L41:
            r0.EOH(r9)
            return
        L45:
            java.util.Map r1 = r2.A03
            X.2EY r0 = r9.A01
            java.lang.Object r0 = r1.get(r0)
            X.MQ4 r0 = (X.MQ4) r0
            if (r0 != 0) goto L41
            X.MQ4 r0 = r2.A01
            goto L41
        L54:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49296Lqq.EOB(X.Jvr, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.C7TM
    public final void EOQ(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        String str11 = str10;
        C26069Bfx c26069Bfx = new C26069Bfx(str6, str5, str3, str4, 10);
        C47764L7k c47764L7k = this.A03;
        C2EY c2ey = C2EY.A1b;
        if (str10 == null) {
            str11 = "";
        }
        c47764L7k.A00(new L4I(directShareTarget, c2ey, c26069Bfx, str, str11, z));
    }

    @Override // X.C7TM
    public final void EOW(DirectShareTarget directShareTarget, User user, String str, String str2, String str3, String str4, boolean z) {
        throw AbstractC166987dD.A1D("stub");
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00.A01();
    }

    public C49296Lqq(UserSession userSession, C6JX c6jx, C47764L7k c47764L7k) {
        AbstractC167017dG.A1Q(userSession, c6jx);
        this.A02 = userSession;
        this.A03 = c47764L7k;
        this.A01 = c6jx;
        this.A00 = AbstractC31174DnI.A0S();
    }

    @Override // X.C7TM
    public final void AWc(DirectForwardingParams directForwardingParams, DirectShareTarget directShareTarget, C2EY c2ey, final String str, final String str2, boolean z) {
        if (F5H.A00(directForwardingParams, directShareTarget.A01()) == C05F.A0N) {
            C41761wQ c41761wQ = this.A00;
            final C6JY c6jy = this.A01.A00;
            final long parseLong = Long.parseLong(directForwardingParams.A06);
            InterfaceC83713oG A01 = directShareTarget.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadTarget");
            c41761wQ.A02(AbstractC31180DnO.A0I(C6JY.A01(c6jy, (InterfaceC2056098k) A01).A0L(new C6D2() { // from class: X.Lad
                @Override // X.C6D2
                public final Object apply(Object obj) {
                    C6JY c6jy2 = C6JY.this;
                    final long j = parseLong;
                    final String str3 = str;
                    final String str4 = str2;
                    final InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                    if (interfaceC132965zL instanceof C48496Lcn) {
                        return C48496Lcn.A00(interfaceC132965zL);
                    }
                    final String A14 = AbstractC25225BEi.A14();
                    return c6jy2.A00.A0L(new C6D2() { // from class: X.Laj
                        @Override // X.C6D2
                        public final Object apply(Object obj2) {
                            InterfaceC132965zL interfaceC132965zL2 = InterfaceC132965zL.this;
                            long j2 = j;
                            String str5 = str3;
                            String str6 = str4;
                            String str7 = A14;
                            return C42221xC.A07(new C48468LcL(obj2, interfaceC132965zL2, str5, str6, str7, 0, j2), AbstractC137146It.A00("tam_forward_message"));
                        }
                    });
                }
            }), "tam_forward_message"), C49768Lyb.A00);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.C7TM
    public final void EN4(Context context, UserSession userSession, DirectShareTarget directShareTarget, DirectAnimatedMedia directAnimatedMedia, String str, String str2, boolean z) {
        InterfaceC2056098k A0X = JQ0.A0X(directShareTarget);
        C6JY c6jy = this.A01.A00;
        C7UR c7ur = C7UR.A0A;
        C7US.A00(context).A05(new C49472Ltl(userSession, c6jy, this, directAnimatedMedia, A0X, str, str2), directAnimatedMedia.A02.A09);
    }

    @Override // X.C7TM
    public final void ENV(EnumC33381EpE enumC33381EpE, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3, long j, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TM
    public final void ENi(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        throw JQ0.A0d();
    }

    @Override // X.C7TM
    public final void EOK(DirectRoomsXma directRoomsXma, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TM
    public final void EOU(C45001Jvr c45001Jvr, String str) {
        throw JQ0.A0d();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.7QP] */
    @Override // X.C7TM
    public final void EOV(C148286ly c148286ly, C32068E6u c32068E6u, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AbstractC167017dG.A1Q(str, c38321qM);
        ?? obj = new Object();
        obj.A01 = c38321qM;
        obj.A08 = str3;
        obj.A07 = str;
        this.A03.A00(new L4I(directShareTarget, C2EY.A1g, obj, str3, c32068E6u.A01, c32068E6u.A02));
    }

    @Override // X.C7TM
    public final void EOf(EnumC46200Kcc enumC46200Kcc, DirectShareTarget directShareTarget, Boolean bool, String str, String str2, String str3, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TM
    public final void EOp(DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TM
    public final void ENA(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        ENc(directShareTarget, str, str2, str3, z);
    }
}
