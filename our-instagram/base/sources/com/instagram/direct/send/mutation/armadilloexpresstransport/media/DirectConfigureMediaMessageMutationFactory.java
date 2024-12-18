package com.instagram.direct.send.mutation.armadilloexpresstransport.media;

import X.AbstractC209669Pc;
import X.AbstractC25225BEi;
import X.AbstractC43592JPx;
import X.AbstractC46712KlV;
import X.AbstractC60562pf;
import X.AbstractC917048o;
import X.C183978Ee;
import X.C206409Bx;
import X.C25821No;
import X.C48276LXz;
import X.C50472Tr;
import X.C73033Pe;
import X.C89563yw;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.JQ0;
import X.LKn;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes8.dex */
public final class DirectConfigureMediaMessageMutationFactory {
    public final Context A00;
    public final UserSession A01;

    private final Object A00(ImageUrl imageUrl, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        Bitmap bitmap;
        if (imageUrl != null) {
            if (z) {
                UserSession userSession = this.A01;
                String A0w = AbstractC43592JPx.A0w(imageUrl);
                C89563yw A0r = JQ0.A0r(interfaceC23621Ds);
                InterfaceC09390do interfaceC09390do = LKn.A05;
                C48276LXz.A00(AbstractC46712KlV.A00(userSession), A0r, A0w, 2);
                return A0r.A00();
            }
            C25821No A00 = C25821No.A00();
            UserSession userSession2 = this.A01;
            C73033Pe A0K = A00.A0K(userSession2, imageUrl, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
            if (A0K != null && (bitmap = A0K.A01) != null) {
                C183978Ee A03 = AbstractC209669Pc.A03(bitmap, null, userSession2, C50472Tr.A01(), AbstractC917048o.A04("direct_temp_photo", ".jpg"), 0, false);
                C206409Bx c206409Bx = A0K.A02;
                if (c206409Bx != null) {
                    AbstractC60562pf.A02(c206409Bx, A03.A03());
                }
                return A03.A06();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.EnumC159397Cz r16, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r17, X.C38321qM r18, com.instagram.model.direct.DirectThreadKey r19, X.InterfaceC23621Ds r20, boolean r21) {
        /*
            r2 = r17
            r9 = r19
            r3 = r18
            r8 = r16
            r5 = 18
            r7 = r20
            boolean r0 = X.MAP.A02(r7, r5)
            if (r0 == 0) goto L5b
            r6 = r7
            X.MAP r6 = (X.MAP) r6
            int r4 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L5b
            int r4 = r4 - r1
            r6.A00 = r4
        L20:
            java.lang.Object r5 = r6.A05
            X.1JX r1 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L92
            java.lang.Object r8 = r6.A04
            X.7Cz r8 = (X.EnumC159397Cz) r8
            java.lang.Object r3 = r6.A03
            X.1qM r3 = (X.C38321qM) r3
            java.lang.Object r9 = r6.A02
            com.instagram.model.direct.DirectThreadKey r9 = (com.instagram.model.direct.DirectThreadKey) r9
            java.lang.Object r2 = r6.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r2 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory) r2
            X.AbstractC09560e7.A00(r5)
        L3e:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L61
            r1 = 0
            return r1
        L44:
            X.AbstractC09560e7.A00(r5)
            android.content.Context r0 = r2.A00
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r3.A1q(r0)
            r6.A01 = r2
            X.MAP.A00(r9, r3, r8, r6, r4)
            r4 = r21
            java.lang.Object r5 = r2.A00(r0, r6, r4)
            if (r5 != r1) goto L3e
            return r1
        L5b:
            X.MAP r6 = new X.MAP
            r6.<init>(r2, r7, r5)
            goto L20
        L61:
            int r15 = r3.A0z()
            int r16 = r3.A0y()
            r21 = 0
            long r17 = java.lang.System.currentTimeMillis()
            long r19 = java.lang.System.currentTimeMillis()
            java.io.File r14 = X.AbstractC166987dD.A11(r5)
            X.8Ee r13 = new X.8Ee
            r13.<init>(r14, r15, r16, r17, r19, r21)
            android.content.Context r6 = r2.A00
            com.instagram.common.session.UserSession r7 = r2.A01
            com.instagram.pendingmedia.model.constants.ShareType r11 = com.instagram.pendingmedia.model.constants.ShareType.A0E
            X.1tg r0 = X.C40121td.A0G
            X.1td r12 = r0.A01(r6, r7)
            r10 = 0
            r14 = r10
            r15 = r10
            r16 = r10
            X.7Q4 r1 = X.LLY.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L92:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory.A01(X.7Cz, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory, X.1qM, com.instagram.model.direct.DirectThreadKey, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.EnumC159397Cz r16, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r17, X.C38321qM r18, com.instagram.model.direct.DirectThreadKey r19, X.InterfaceC23621Ds r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory.A02(X.7Cz, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory, X.1qM, com.instagram.model.direct.DirectThreadKey, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.EnumC159397Cz r21, X.C83403nh r22, X.C31481er r23, X.InterfaceC23621Ds r24) {
        /*
            r20 = this;
            r3 = r23
            r4 = 41
            r5 = r24
            boolean r0 = X.MAF.A01(r5, r4)
            r9 = r20
            if (r0 == 0) goto L31
            r12 = r5
            X.MAF r12 = (X.MAF) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r12.A00 = r2
        L1c:
            java.lang.Object r11 = r12.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r12.A00
            r6 = 0
            r4 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L37
            if (r0 == r1) goto L6e
            if (r0 == r4) goto L6e
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L31:
            X.MAF r12 = new X.MAF
            r12.<init>(r9, r5, r4)
            goto L1c
        L37:
            X.AbstractC09560e7.A00(r11)
            r0 = r22
            X.1qM r10 = r0.A0s
            if (r10 == 0) goto L98
            boolean r13 = r0.A1S()
            X.1tc r0 = r10.BRp()
            int r0 = r0.ordinal()
            r8 = r21
            if (r0 == r2) goto L61
            if (r0 != r1) goto L97
            com.instagram.model.direct.DirectThreadKey r11 = r3.C7Q()
            r12.A01 = r3
            r12.A00 = r4
            java.lang.Object r11 = A02(r8, r9, r10, r11, r12, r13)
        L5e:
            if (r11 != r5) goto L75
            return r5
        L61:
            com.instagram.model.direct.DirectThreadKey r11 = r3.C7Q()
            r12.A01 = r3
            r12.A00 = r1
            java.lang.Object r11 = A01(r8, r9, r10, r11, r12, r13)
            goto L5e
        L6e:
            java.lang.Object r3 = r12.A01
            X.1er r3 = (X.C31481er) r3
            X.AbstractC09560e7.A00(r11)
        L75:
            X.7Q4 r11 = (X.C7Q4) r11
            if (r11 == 0) goto L97
            X.JTa r8 = r3.A02
            com.instagram.model.direct.DirectThreadKey r12 = r3.C7Q()
            java.lang.Long r15 = r3.A04
            long r0 = r3.A00
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            X.1eO r5 = new X.1eO
            r7 = r6
            r9 = r6
            r10 = r6
            r13 = r6
            r16 = r6
            r19 = r2
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            return r5
        L97:
            return r6
        L98:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory.A03(X.7Cz, X.3nh, X.1er, X.1Ds):java.lang.Object");
    }

    public DirectConfigureMediaMessageMutationFactory(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC25225BEi.A0F(userSession);
    }
}
