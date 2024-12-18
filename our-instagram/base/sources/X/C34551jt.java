package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34551jt implements InterfaceC29301b7 {
    public static final C0KV A01 = C34561ju.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // X.InterfaceC29301b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ENr(X.C19260xA r14, X.InterfaceC37261GbE r15, X.C1OW r16) {
        /*
            r13 = this;
            r8 = r16
            X.1jr r8 = (X.C34531jr) r8
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r6 = 2
            X.C14360o3.A0B(r15, r6)
            X.JTa r0 = r8.A02
            X.L1W r0 = r0.A00
            if (r0 == 0) goto L16
            X.KdI r3 = r0.A00
            if (r3 != 0) goto L96
        L16:
            X.KdI r3 = X.EnumC46242KdI.A06
            if (r0 != 0) goto L96
            r0 = 0
        L1b:
            com.instagram.common.session.UserSession r5 = r13.A00
            com.instagram.model.direct.DirectThreadKey r11 = r8.C7Q()
            java.lang.String r7 = r8.A01
            long r1 = r8.A00
            java.lang.String r12 = r3.toString()
            if (r0 == 0) goto L93
            long r3 = r0.longValue()
        L2f:
            boolean r10 = r8.A03
            boolean r9 = r8.A04
            r8 = 0
            X.C14360o3.A0B(r7, r6)
            r0 = 4
            X.C14360o3.A0B(r12, r0)
            r0 = -2
            X.1Ms r6 = new X.1Ms
            r6.<init>(r5, r0)
            java.lang.Integer r0 = X.C05F.A01
            r6.A09(r0)
            java.lang.String r0 = r11.A00
            java.lang.Object[] r11 = new java.lang.Object[]{r0}
            java.lang.String r0 = "direct_v2/threads/%s/bump_thread/"
            r6.A0L(r0, r11)
            java.lang.String r0 = "ephemerality_product_type"
            r6.A9s(r0, r12)
            java.lang.String r0 = "ephemerality_duration_sec"
            r6.A0E(r0, r3)
            java.lang.String r0 = "is_message_deletion"
            r6.A0I(r0, r10)
            java.lang.String r0 = "is_message_reaction"
            r6.A0I(r0, r9)
            java.lang.Class<X.1ul> r4 = X.C40781ul.class
            java.lang.Class<X.2hA> r3 = X.C55702hA.class
            r0 = 0
            r6.A0P(r0, r4, r3, r8)
            int r0 = r7.length()
            if (r0 <= 0) goto L8c
            java.lang.String r0 = "item_id"
            r6.A9s(r0, r7)
        L7e:
            X.1ON r1 = r6.A0N()
            X.EDz r0 = X.AbstractC46987Kq6.A00(r5, r15)
            r1.A00 = r0
            X.C1GJ.A03(r1)
            return
        L8c:
            java.lang.String r0 = "timestamp_ms"
            r6.A0E(r0, r1)
            goto L7e
        L93:
            r3 = -1
            goto L2f
        L96:
            java.lang.Long r0 = r0.A01
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34551jt.ENr(X.0xA, X.GbE, X.1OW):void");
    }

    public C34551jt(UserSession userSession) {
        this.A00 = userSession;
    }
}
