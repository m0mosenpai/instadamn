package com.instagram.direct.send.mutation.armadilloexpresstransport;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC142856cl;
import X.AbstractC150996r0;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC31174DnI;
import X.AbstractC31180DnO;
import X.AbstractC42051wv;
import X.AbstractC42141x4;
import X.AbstractC43592JPx;
import X.AbstractC46924Kp5;
import X.AbstractC46925Kp6;
import X.AbstractC46926Kp7;
import X.AbstractC60877RXa;
import X.C06090Tz;
import X.C0eB;
import X.C1122254r;
import X.C14360o3;
import X.C18U;
import X.C29481bP;
import X.C36798GJx;
import X.C41761wQ;
import X.C42221xC;
import X.C43601JQh;
import X.C44999Jvp;
import X.C45376K6j;
import X.C47954LGp;
import X.C48359LaZ;
import X.C4HC;
import X.C4JK;
import X.C50221MGc;
import X.C50340MKs;
import X.C5Fn;
import X.C72338Xba;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC37261GbE;
import X.JQ1;
import X.LGK;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Link;
import com.instagram.direct.armadilloexpress.transportpayload.LinkContext;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class ArmadilloExpressLinkMessageSender {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public ArmadilloExpressLinkMessageSender(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC25225BEi.A0F(userSession);
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, C50221MGc.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.direct.model.DirectForwardingParams r10, X.C44999Jvp r11, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r12, X.C29481bP r13, X.InterfaceC23621Ds r14) {
        /*
            r9 = r13
            r7 = r10
            r3 = 10
            boolean r0 = X.PX7.A02(r14, r3)
            if (r0 == 0) goto L9b
            r5 = r14
            X.PX7 r5 = (X.PX7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r2 = r5.A06
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L69
            if (r0 != r3) goto La2
            java.lang.Object r4 = r5.A05
            X.RXa r4 = (X.AbstractC60877RXa) r4
            java.lang.Object r3 = r5.A04
            X.RXa r3 = (X.AbstractC60877RXa) r3
            java.lang.Object r7 = r5.A03
            com.instagram.direct.model.DirectForwardingParams r7 = (com.instagram.direct.model.DirectForwardingParams) r7
            java.lang.Object r9 = r5.A02
            X.1bP r9 = (X.C29481bP) r9
            java.lang.Object r12 = r5.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r12 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender) r12
            X.AbstractC09560e7.A00(r2)
        L3a:
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r2 = (com.instagram.direct.armadilloexpress.transportpayload.LinkContext) r2
            X.RYn r1 = X.AbstractC43592JPx.A0K(r4)
            com.instagram.direct.armadilloexpress.transportpayload.Link r1 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r1
            r2.getClass()
            r1.linkContext_ = r2
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.LGK r4 = X.LGK.A00
            com.instagram.common.session.UserSession r5 = r12.A01
            X.K6j r2 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.A00()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r1 = X.JQ1.A0B(r2, r3)
            r0 = 3
            r1.addMessageContentCase_ = r0
            X.RYn r6 = X.AbstractC43592JPx.A0L(r2)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r6 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent) r6
            X.Kzy r8 = r9.A03
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = r4.A01(r5, r6, r7, r8, r9)
            return r0
        L69:
            X.AbstractC09560e7.A00(r2)
            com.instagram.direct.armadilloexpress.transportpayload.Link r0 = com.instagram.direct.armadilloexpress.transportpayload.Link.DEFAULT_INSTANCE
            X.RXa r4 = r0.A0I()
            X.9Bx r0 = r13.A00
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto La7
            X.RYn r1 = X.AbstractC43592JPx.A0K(r4)
            com.instagram.direct.armadilloexpress.transportpayload.Link r1 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r2
            r5.A01 = r12
            r5.A02 = r13
            r5.A03 = r10
            r5.A04 = r4
            r5.A05 = r4
            r5.A00 = r3
            java.lang.Object r2 = A02(r11, r12, r5)
            if (r2 != r6) goto L99
            return r6
        L99:
            r3 = r4
            goto L3a
        L9b:
            X.PX7 r5 = new X.PX7
            r5.<init>(r12, r14, r3)
            goto L18
        La2:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La7:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender.A01(com.instagram.direct.model.DirectForwardingParams, X.Jvp, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender, X.1bP, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (r4 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(com.instagram.direct.model.DirectForwardingParams r11, X.C1122254r r12, X.InterfaceC37261GbE r13, X.C44999Jvp r14, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r15, X.C29481bP r16) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender.A04(com.instagram.direct.model.DirectForwardingParams, X.54r, X.GbE, X.Jvp, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender, X.1bP):void");
    }

    public final void A05(DirectForwardingParams directForwardingParams, InterfaceC37261GbE interfaceC37261GbE, C29481bP c29481bP) {
        C14360o3.A0B(interfaceC37261GbE, 1);
        AbstractC60877RXa A0I = Link.DEFAULT_INSTANCE.A0I();
        String str = c29481bP.A00.A01;
        if (str != null) {
            Link link = (Link) AbstractC43592JPx.A0K(A0I);
            link.bitField0_ |= 1;
            link.text_ = str;
            LGK lgk = LGK.A00;
            UserSession userSession = this.A01;
            C45376K6j A00 = AddMessageContent.A00();
            JQ1.A0B(A00, A0I).addMessageContentCase_ = 3;
            TransportPayload A01 = lgk.A01(userSession, (AddMessageContent) AbstractC43592JPx.A0L(A00), directForwardingParams, c29481bP.A03, c29481bP);
            C29481bP ACZ = c29481bP.ACZ();
            if (ACZ != null) {
                A03(A01, interfaceC37261GbE, this, ACZ);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A06(DirectForwardingParams directForwardingParams, InterfaceC37261GbE interfaceC37261GbE, C29481bP c29481bP) {
        C5Fn A0J;
        UserSession userSession = this.A01;
        if (AbstractC46926Kp7.A00(userSession).A05((DirectThreadKey) JQ1.A0H(c29481bP), AbstractC111324zv.A00(1257))) {
            C1122254r c1122254r = (C1122254r) c29481bP.A00.A00;
            if (c1122254r != null) {
                A04(directForwardingParams, c1122254r, interfaceC37261GbE, null, this, c29481bP);
                return;
            }
            C47954LGp A00 = AbstractC46924Kp5.A00(this.A00, userSession);
            String str = c29481bP.A00.A01;
            if (str != null) {
                C44999Jvp A002 = A00.A00(str);
                if (A002 != null) {
                    A04(directForwardingParams, null, interfaceC37261GbE, A002, this, c29481bP);
                    return;
                }
                String str2 = c29481bP.A00.A01;
                if (str2 != null) {
                    C41761wQ A0S = AbstractC31174DnI.A0S();
                    if (C18U.A06(C06090Tz.A05, userSession, 36327907131603909L)) {
                        A0J = AbstractC142856cl.A00;
                    } else {
                        A0J = AbstractC31180DnO.A0J(userSession, C4HC.A00);
                    }
                    C42221xC A0G = C43601JQh.A00(A00.A01.A0S(C0eB.A00).A0K(new C48359LaZ(str2, A00, 6)), C50340MKs.A00, 10).A0G();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    C5Fn c5Fn = AbstractC142856cl.A00;
                    C42221xC A09 = C42221xC.A09(C4JK.A00);
                    AbstractC42051wv abstractC42051wv = A0G.A00;
                    AbstractC150996r0 abstractC150996r0 = c5Fn.A00;
                    AbstractC42051wv abstractC42051wv2 = A09.A00;
                    AbstractC42141x4.A01(abstractC42051wv2, "other is null");
                    AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
                    A0S.A02(new C42221xC(new C72338Xba(abstractC42051wv, abstractC42051wv2, abstractC150996r0, timeUnit)).A0O(A0J), new C36798GJx(4, A0S, interfaceC37261GbE, this, directForwardingParams, c29481bP));
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
        A05(directForwardingParams, interfaceC37261GbE, c29481bP);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C44999Jvp r15, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r16, X.InterfaceC23621Ds r17) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender.A02(X.Jvp, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender, X.1Ds):java.lang.Object");
    }

    public static final void A03(TransportPayload transportPayload, InterfaceC37261GbE interfaceC37261GbE, ArmadilloExpressLinkMessageSender armadilloExpressLinkMessageSender, C29481bP c29481bP) {
        AbstractC46925Kp6.A00(armadilloExpressLinkMessageSender.A01).A02(transportPayload, interfaceC37261GbE, c29481bP, (DirectThreadKey) JQ1.A0H(c29481bP), 7);
    }

    public static LinkContext A00(AbstractC60877RXa abstractC60877RXa) {
        abstractC60877RXa.A04();
        return (LinkContext) abstractC60877RXa.A00;
    }
}
