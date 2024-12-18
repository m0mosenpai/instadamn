package X;

import android.content.Context;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.List;

/* renamed from: X.7Vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163997Vo {
    public final /* synthetic */ AnonymousClass983 A00;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (((X.C81663kb) r0).A01.A0t == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.graphics.RectF r12, X.AnonymousClass442 r13, java.lang.String r14, int r15) {
        /*
            r11 = this;
            r2 = 0
            X.22P r6 = X.C22P.A2S
            X.983 r4 = r11.A00
            com.instagram.common.session.UserSession r0 = r4.A10
            X.JZk r1 = X.AbstractC208269Jl.A00(r0)
            r0 = 1
            r1.A07(r6, r0)
            boolean r0 = X.C4GR.A03(r15)
            r5 = r12
            if (r0 == 0) goto L21
            X.7W4 r0 = X.AnonymousClass983.A01(r4)
            r1 = 0
            X.7ZX r0 = r0.A0t
            r0.CrM(r12, r6, r1, r14)
            return
        L21:
            X.81T r1 = X.C81T.A00
            X.81W[] r0 = new X.C81W[r2]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r7 = X.C82R.A00(r1, r0)
            X.7El r3 = r4.A0R
            if (r3 == 0) goto L4d
            boolean r0 = r3.A1W()
            r0 = r0 ^ 1
            r7.A02 = r0
            boolean r0 = X.C159737El.A0y(r3)
            r2 = 1
            if (r0 == 0) goto L62
            com.instagram.common.session.UserSession r3 = r3.A1Z
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325669453837559(0x810e01000634f7, double:3.0358378621126215E-306)
        L45:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r2 = r0 ^ 1
        L4b:
            r7.A01 = r2
        L4d:
            X.7W4 r0 = X.AnonymousClass983.A01(r4)
            r9 = 0
            X.7ZX r4 = r0.A0t
            X.7U0 r0 = r0.A08
            if (r0 != 0) goto L8a
            java.lang.String r0 = "clientInfra"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L62:
            com.instagram.api.schemas.IGAIAgentType r1 = X.C159737El.A04(r3)
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r1 != r0) goto L74
            com.instagram.common.session.UserSession r3 = r3.A1Z
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325669453706485(0x810e01000434f5, double:3.03583786202973E-306)
            goto L45
        L74:
            com.instagram.api.schemas.IGAIAgentType r1 = X.C159737El.A04(r3)
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A08
            if (r1 != r0) goto L86
            com.instagram.common.session.UserSession r3 = r3.A1Z
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325669453968633(0x810e01000834f9, double:3.035837862195513E-306)
            goto L45
        L86:
            X.C159737El.A04(r3)
            goto L4b
        L8a:
            X.7Ux r0 = r0.C7r()
            X.2EC r0 = r0.Co6()
            if (r0 == 0) goto L9d
            X.3kb r0 = (X.C81663kb) r0
            X.3iy r0 = r0.A01
            X.3kP r0 = r0.A0t
            r10 = 1
            if (r0 != 0) goto L9e
        L9d:
            r10 = 0
        L9e:
            r8 = r13
            r4.Cqu(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163997Vo.A03(android.graphics.RectF, X.442, java.lang.String, int):void");
    }

    public final void A04(C148286ly c148286ly, EnumC46186KcO enumC46186KcO) {
        if (enumC46186KcO != EnumC46186KcO.A0B) {
            AnonymousClass983 anonymousClass983 = this.A00;
            C7IT A0J = AnonymousClass983.A01(anonymousClass983).A0J();
            Context context = anonymousClass983.A02;
            if (context == null) {
                C14360o3.A0F("context");
                throw C00O.createAndThrow();
            }
            C7IT.A00(A0J, "sendAiStaticSticker", new MIL(13, context, A0J, c148286ly, anonymousClass983.A10, null));
        }
    }

    public final void A05(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, AnonymousClass442 anonymousClass442) {
        C14360o3.A0B(enumC46186KcO, 2);
        if (enumC46186KcO != EnumC46186KcO.A0B) {
            AnonymousClass983 anonymousClass983 = this.A00;
            C7IT A0J = AnonymousClass983.A01(anonymousClass983).A0J();
            Context context = anonymousClass983.A02;
            if (context == null) {
                C14360o3.A0F("context");
                throw C00O.createAndThrow();
            }
            C7IT.A00(A0J, "sendAvatarStaticSticker", new MIL(12, context, A0J, c148286ly, anonymousClass983.A10, anonymousClass442));
        }
    }

    public final void A06(L7G l7g, String str, String str2) {
        C14360o3.A0B(str, 0);
        A09(null, null, l7g, null, null, null, null, null, str, str2, null, null, null);
    }

    public final void A07(AnonymousClass442 anonymousClass442, DirectStoreSticker directStoreSticker) {
        C14360o3.A0B(directStoreSticker, 0);
        AnonymousClass983 anonymousClass983 = this.A00;
        C7IT A0J = AnonymousClass983.A01(anonymousClass983).A0J();
        if (anonymousClass983.A02 == null) {
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
        C50364MLq c50364MLq = new C50364MLq(12, directStoreSticker, anonymousClass442, A0J);
        C7X1 c7x1 = A0J.A01;
        c7x1.A00();
        c50364MLq.invoke(A0J.A06.invoke());
        c7x1.A01(null, 100);
    }

    public final boolean A09(C50679MYx c50679MYx, C44178Jfh c44178Jfh, L7G l7g, L51 l51, SendMentionData$MentionData sendMentionData$MentionData, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(str, 0);
        if (str.length() == 0) {
            if (str3 != null) {
                IGFOAMessagingLocalSendSpeedLogger A00 = C7R5.A00(this.A00.A10, Integer.valueOf(str3.hashCode()));
                if (A00 != null) {
                    A00.onEndFlowFail("Text is empty");
                }
            }
            return false;
        }
        AnonymousClass983 anonymousClass983 = this.A00;
        AnonymousClass983.A06(anonymousClass983).A00 = 0;
        C7IT c7it = AnonymousClass983.A01(anonymousClass983).A0j.A03;
        if (c7it != null) {
            return c7it.A03(c50679MYx, c44178Jfh, l7g, l51, sendMentionData$MentionData, num, num2, l, str, str2, str3, str4, list, false);
        }
        C14360o3.A0F("directSendHelper");
        throw C00O.createAndThrow();
    }

    public C163997Vo(AnonymousClass983 anonymousClass983) {
        this.A00 = anonymousClass983;
    }

    public final DirectShareTarget A00() {
        return AnonymousClass983.A01(this.A00).A0L();
    }

    public final void A01() {
        ((C7XR) AnonymousClass983.A01(this.A00).A0i.A0Q.getValue()).D01();
    }

    public final void A02() {
        AnonymousClass983 anonymousClass983 = this.A00;
        ((C7XR) AnonymousClass983.A01(anonymousClass983).A0i.A0Q.getValue()).D0E();
        ((C159457Dg) anonymousClass983.A1Z.getValue()).A04 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r1.A0l != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L8
            X.983 r1 = r5.A00
            boolean r0 = r1.A0l
            if (r0 == 0) goto Ld
        L8:
            X.983 r1 = r5.A00
            X.AnonymousClass983.A0D(r1, r6)
        Ld:
            X.7W4 r0 = X.AnonymousClass983.A01(r1)
            X.7U6 r0 = r0.A0k
            X.7U8 r4 = r0.A03
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L3c
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320790371050391(0x81099100072397, double:3.032752310511527E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L3c
            X.0sZ r0 = r4.A03
            java.lang.Object r1 = r0.invoke()
            X.2EC r1 = (X.C2EC) r1
            if (r1 == 0) goto L3c
            X.6oC r0 = r4.A01
            r0.A02(r1)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163997Vo.A08(boolean):void");
    }
}
