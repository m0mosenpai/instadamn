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
public final class DirectConfigureMediaCollectionMessageMutationFactory {
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:20:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c2 -> B:20:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c4 -> B:20:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:18:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x013a -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C83403nh r18, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory r19, X.InterfaceC23621Ds r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory.A01(X.3nh, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C83403nh r24, X.C31481er r25, X.InterfaceC23621Ds r26, boolean r27) {
        /*
            r23 = this;
            r2 = r25
            r11 = r27
            r4 = 8
            r7 = r26
            boolean r0 = X.PX0.A01(r7, r4)
            r6 = r23
            if (r0 == 0) goto L65
            r5 = r7
            X.PX0 r5 = (X.PX0) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L65
            int r3 = r3 - r1
            r5.A00 = r3
        L1e:
            java.lang.Object r10 = r5.A03
            X.1JX r8 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L40
            if (r0 != r4) goto La1
            boolean r11 = r5.A05
            java.lang.Object r2 = r5.A02
            X.1er r2 = (X.C31481er) r2
            java.lang.Object r3 = r5.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory r3 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory) r3
            X.AbstractC09560e7.A00(r10)
        L36:
            java.util.List r10 = (java.util.List) r10
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L6b
            r8 = 0
        L3f:
            return r8
        L40:
            X.AbstractC09560e7.A00(r10)
            r7 = r24
            boolean r3 = r7.A1a()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "Message type must be a collection of media."
            X.C18C.A0J(r3, r0, r1)
            boolean r0 = r7.A1S()
            r5.A01 = r6
            r5.A02 = r2
            r5.A05 = r11
            r5.A00 = r4
            java.lang.Object r10 = A01(r7, r6, r5, r0)
            if (r10 == r8) goto L3f
            r3 = r6
            goto L36
        L65:
            X.PX0 r5 = new X.PX0
            r5.<init>(r6, r7, r4)
            goto L1e
        L6b:
            com.instagram.common.session.UserSession r5 = r3.A01
            com.instagram.model.direct.DirectThreadKey r6 = r2.C7Q()
            com.instagram.pendingmedia.model.constants.ShareType r7 = com.instagram.pendingmedia.model.constants.ShareType.A0E
            X.1tg r1 = X.C40121td.A0G
            android.content.Context r0 = r3.A00
            X.1td r8 = r1.A01(r0, r5)
            r9 = 0
            X.7Q4 r14 = X.LLY.A04(r5, r6, r7, r8, r9, r10, r11)
            X.JTa r11 = r2.A02
            com.instagram.model.direct.DirectThreadKey r15 = r2.C7Q()
            java.lang.Long r3 = r2.A04
            long r0 = r2.A00
            r22 = 0
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r22)
            X.1eO r8 = new X.1eO
            r10 = r9
            r12 = r9
            r13 = r9
            r16 = r9
            r19 = r9
            r20 = r0
            r18 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22)
            return r8
        La1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory.A02(X.3nh, X.1er, X.1Ds, boolean):java.lang.Object");
    }

    public DirectConfigureMediaCollectionMessageMutationFactory(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC25225BEi.A0F(userSession);
    }
}
