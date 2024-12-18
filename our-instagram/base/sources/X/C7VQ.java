package X;

import java.util.List;

/* renamed from: X.7VQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VQ {
    public final List A00;

    public final void A00(Class cls, InterfaceC16660sJ interfaceC16660sJ) {
        for (Object obj : this.A00) {
            if (cls.isInstance(obj)) {
                interfaceC16660sJ.invoke(obj);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7VQ(java.util.List r8) {
        /*
            r7 = this;
            r7.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r8.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r4 = r6.next()
            r2 = r4
            X.7VI r2 = (X.C7VI) r2
            boolean r0 = r2 instanceof X.C7VH
            if (r0 == 0) goto L2e
            X.7VH r2 = (X.C7VH) r2
            boolean r0 = r2.A05
            if (r0 != 0) goto Lc
            X.7VG r0 = r2.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.C7VR.A00(r0)
        L2b:
            if (r0 != 0) goto L43
            goto Lc
        L2e:
            boolean r0 = r2 instanceof X.C7VL
            if (r0 == 0) goto L47
            X.7VG r0 = r2.A00
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321237047452916(0x8109f9000424f4, double:3.033034790467105E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
        L41:
            if (r0 == 0) goto Lc
        L43:
            r5.add(r4)
            goto Lc
        L47:
            boolean r0 = r2 instanceof X.C7VO
            if (r0 != 0) goto L43
            boolean r0 = r2 instanceof X.C163707Ui
            if (r0 == 0) goto L58
            X.7Ui r2 = (X.C163707Ui) r2
            X.2pJ r0 = r2.A02
            boolean r0 = r0.A00()
            goto L41
        L58:
            boolean r0 = r2 instanceof X.C163767Uq
            if (r0 == 0) goto L67
            X.7Uq r2 = (X.C163767Uq) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "inbox_new_subscriber_social_channel_messaging_led"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            goto L41
        L67:
            boolean r0 = r2 instanceof X.C7UL
            if (r0 == 0) goto L8b
            X.7UL r2 = (X.C7UL) r2
            com.instagram.avatars.store.AvatarStore r0 = r2.A01
            X.21d r0 = r0.A01
            X.21h r1 = r0.A00
            X.5lz r0 = X.C125535lz.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc
            X.7UM r0 = r2.A02
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322568487053634(0x810b2f00002942, double:3.033876798231876E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            goto L2b
        L8b:
            boolean r0 = r2 instanceof X.C7U8
            if (r0 == 0) goto L9f
            X.7U8 r2 = (X.C7U8) r2
            com.instagram.common.session.UserSession r3 = r2.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320790371050391(0x81099100072397, double:3.032752310511527E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            goto L41
        L9f:
            boolean r0 = r2 instanceof X.C7UA
            if (r0 != 0) goto L43
            boolean r0 = r2 instanceof X.C163757Un
            if (r0 == 0) goto Lb7
            X.7Un r2 = (X.C163757Un) r2
            com.instagram.common.session.UserSession r3 = r2.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323672294305254(0x810c30000a2de6, double:3.034574850382476E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            goto L41
        Lb7:
            boolean r0 = r2 instanceof X.C7UI
            if (r0 != 0) goto Lde
            boolean r0 = r2 instanceof X.C7UK
            if (r0 == 0) goto Ld0
            X.7VG r0 = r2.A00
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36330376738063187(0x81124900074353, double:3.038814767611621E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            goto L41
        Ld0:
            boolean r0 = r2 instanceof X.C159437De
            if (r0 != 0) goto Lde
            X.7VG r0 = r2.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.AbstractC28415CgL.A03(r0)
            goto L41
        Lde:
            X.7VG r0 = r2.A00
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.AbstractC31268Doq.A08(r0)
            goto L41
        Le8:
            r7.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7VQ.<init>(java.util.List):void");
    }
}
