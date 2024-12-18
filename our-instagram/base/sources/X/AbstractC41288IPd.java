package X;

import java.util.List;

/* renamed from: X.IPd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41288IPd {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        String str3;
        String str4;
        C102884kP c102884kP = (C102884kP) c6fw.A00();
        List list = c6fw.A00;
        if (list.size() > 3) {
            str = AbstractC31173DnH.A0s(list, 3);
        } else {
            str = null;
        }
        if (list.size() > 4) {
            str2 = AbstractC31173DnH.A0s(list, 4);
        } else {
            str2 = null;
        }
        if (list.size() > 5) {
            str3 = (String) c6fw.A03(5);
        } else {
            str3 = null;
        }
        if (list.size() > 6) {
            str4 = AbstractC31173DnH.A0s(list, 6);
        } else {
            str4 = null;
        }
        A01(C6BQ.A04(c6fq), C6BQ.A08(c6fq), c6fq, c102884kP, AbstractC31179DnN.A0K(c6fq), null, null, null, str, str2, str3, str4, null, null, null, null, null, null, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r7.CdW() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(androidx.fragment.app.FragmentActivity r14, X.InterfaceC11380iw r15, X.C6FQ r16, X.C102884kP r17, com.instagram.common.session.UserSession r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.Long r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            r13 = r23
            X.It4 r11 = new X.It4
            r0 = r22
            r11.<init>(r0, r15)
            com.instagram.user.model.Product r12 = X.AbstractC41287IPc.A01(r17)
            r0 = r25
            r10 = r18
            X.1qM r7 = X.AbstractC25229BEm.A0h(r10, r0)
            java.util.HashMap r1 = X.AbstractC166987dD.A1G()
            r2 = r28
            if (r28 == 0) goto L22
            java.lang.String r0 = "id"
            r1.put(r0, r2)
        L22:
            r6 = 0
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r5 = new com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo
            r0 = r27
            r5.<init>(r0, r6, r1)
            r1 = 2131438327(0x7f0b2af7, float:1.8498578E38)
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductFeedItem> r0 = com.instagram.model.shopping.productfeed.ProductFeedItem.class
            r2 = r16
            java.lang.Object r1 = X.C6BQ.A0F(r2, r0, r1)
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            if (r1 == 0) goto L8f
            com.instagram.model.shopping.productfeed.ProductTile r0 = r1.A02
            if (r0 == 0) goto L8d
            com.instagram.model.shopping.productfeed.ProductTileMedia r4 = r0.A00(r10)
        L41:
            java.lang.String r3 = r1.getId()
        L45:
            X.1XJ r8 = X.C1XJ.A00
            if (r23 != 0) goto L4b
            java.lang.String r13 = "bloks"
        L4b:
            r9 = r14
            r14 = r24
            X.Ile r2 = r8.A0L(r9, r10, r11, r12, r13, r14)
            r0 = r26
            r2.A0S = r0
            long r0 = X.AbstractC25232BEp.A0t(r21)
            r2.A01 = r0
            r2.A02(r7, r6)
            r2.A05 = r4
            r2.A0L = r3
            r0 = r31
            r2.A0G = r0
            r0 = r32
            r2.A0H = r0
            r0 = r19
            r2.A0D = r0
            r0 = r20
            r2.A0C = r0
            if (r7 == 0) goto L7c
            boolean r1 = r7.CdW()
            r0 = 1
            if (r1 != 0) goto L7d
        L7c:
            r0 = 0
        L7d:
            r2.A0X = r0
            r2.A0A = r5
            r0 = r29
            r2.A0I = r0
            r0 = r30
            r2.A0F = r0
            X.C42130Ile.A01(r2)
            return
        L8d:
            r4 = r6
            goto L41
        L8f:
            r3 = r6
            r4 = r6
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41288IPd.A01(androidx.fragment.app.FragmentActivity, X.0iw, X.6FQ, X.4kP, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
