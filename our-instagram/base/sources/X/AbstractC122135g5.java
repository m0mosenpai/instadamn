package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122135g5 {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r3.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = X.AbstractC101904i3.A00(r6, r25, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r1 = (com.instagram.user.model.User) X.AbstractC001800i.A0N(r24.A0B);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r24.A0C == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        r1.getId();
        r0 = java.util.Collections.unmodifiableList(r24.A0B);
        X.C14360o3.A07(r0);
        r1 = (com.instagram.user.model.User) r0.get(0);
        r0 = r1.A03.BBO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r0.booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        return A01(r1, r26, r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r0 = r1.A03.AwE();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r0.booleanValue() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r14 = X.AbstractC31232DoF.A00(r24.A09, r4);
        r2 = r24.A0C;
        r8 = new com.instagram.model.direct.DirectShareTarget(null, r24.A03, r24.A04, r24.A05, null, r14, r26, java.lang.Boolean.valueOf(r24.A0D), r27, null, java.lang.Integer.valueOf(r24.A01), java.lang.Integer.valueOf(r24.A00), r3, null, r24.A06, null, r28, r4, r2, r24.A0H);
        r0 = r24.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        r8.A0H = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.instagram.user.model.User] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.model.direct.DirectShareTarget A00(X.C2n2 r23, X.C121375ed r24, com.instagram.common.session.UserSession r25, java.lang.Boolean r26, java.lang.Double r27, java.lang.String r28) {
        /*
            r2 = 0
            r5 = r24
            X.C14360o3.A0B(r5, r2)
            r7 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r5.A0B
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.C14360o3.A07(r0)
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r1 = r3.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r6 = r23
            if (r23 == 0) goto L34
            java.lang.String r0 = r1.getId()
            java.lang.Object r0 = r6.apply(r0)
            if (r0 == 0) goto L34
            r1 = r0
        L34:
            r4.add(r1)
            goto L19
        L38:
            java.util.ArrayList r4 = X.C4GO.A01(r4)
            android.content.Context r6 = X.AbstractC12290kX.A00
            X.C14360o3.A07(r6)
            java.lang.String r3 = r5.A0A
            r8 = r25
            java.lang.String r1 = X.AbstractC101904i3.A00(r6, r8, r4)
            X.C14360o3.A07(r1)
            int r0 = r4.size()
            if (r0 <= r7) goto Lf3
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto Lf3
            java.lang.String r3 = ""
        L5a:
            int r0 = r3.length()
            if (r0 != 0) goto L64
        L60:
            java.lang.String r3 = X.AbstractC101904i3.A00(r6, r8, r4)
        L64:
            java.util.List r0 = r5.A0B
            java.lang.Object r1 = X.AbstractC001800i.A0N(r0)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r15 = r26
            r7 = r27
            r6 = r28
            if (r1 == 0) goto Lab
            boolean r0 = r5.A0C
            if (r0 == 0) goto Lab
            r1.getId()
            java.util.List r0 = r5.A0B
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.C14360o3.A07(r0)
            java.lang.Object r1 = r0.get(r2)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.17P r0 = r1.A03
            java.lang.Boolean r0 = r0.BBO()
            if (r0 == 0) goto L98
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La6
        L98:
            X.17P r0 = r1.A03
            java.lang.Boolean r0 = r0.AwE()
            if (r0 == 0) goto Lab
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lab
        La6:
            com.instagram.model.direct.DirectShareTarget r8 = A01(r1, r15, r7, r6)
        Laa:
            return r8
        Lab:
            java.lang.String r0 = r5.A09
            X.3oF r14 = X.AbstractC31232DoF.A00(r0, r4)
            boolean r2 = r5.A0C
            r9 = 0
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r11 = r5.A04
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r10 = r5.A03
            com.instagram.direct.model.thread.DiscoverableThreadInfo r12 = r5.A05
            java.lang.String r1 = r5.A06
            boolean r0 = r5.A0D
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
            int r0 = r5.A01
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            int r0 = r5.A00
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.A0H
            com.instagram.model.direct.DirectShareTarget r8 = new com.instagram.model.direct.DirectShareTarget
            r13 = r9
            r18 = r9
            r22 = r9
            r23 = r1
            r24 = r9
            r25 = r6
            r26 = r4
            r27 = r2
            r28 = r0
            r21 = r3
            r17 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.instagram.direct.model.thread.ChannelsContextLine r0 = r5.A02
            if (r0 == 0) goto Laa
            java.lang.String r0 = r0.A00
            r8.A0H = r0
            return r8
        Lf3:
            if (r3 == 0) goto L60
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC122135g5.A00(X.2n2, X.5ed, com.instagram.common.session.UserSession, java.lang.Boolean, java.lang.Double, java.lang.String):com.instagram.model.direct.DirectShareTarget");
    }

    public static final DirectShareTarget A01(User user, Boolean bool, Double d, String str) {
        Boolean AwE;
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        C14360o3.A07(singletonList);
        Boolean BBO = user.A03.BBO();
        if ((BBO != null && BBO.booleanValue()) || ((AwE = user.A03.AwE()) != null && AwE.booleanValue())) {
            List singletonList2 = Collections.singletonList(AbstractC34821FVx.A00((AnonymousClass172) singletonList.get(0)));
            C14360o3.A07(singletonList2);
            return new DirectShareTarget(null, new C23974Ak9(EnumC92794Ds.A04, singletonList2), bool, d, AbstractC101904i3.A07(user), str, singletonList, true, true);
        }
        return new DirectShareTarget(new C122145g6(singletonList), bool, d, AbstractC101904i3.A07(user), singletonList, true);
    }
}
