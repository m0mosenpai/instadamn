package X;

import android.text.TextUtils;

/* renamed from: X.3J2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J2 implements C2ON {
    public static final JQO A00(C35129FeW c35129FeW) {
        Long l;
        String str = c35129FeW.A0E;
        String str2 = c35129FeW.A0I;
        if (str2 != null) {
            l = AbstractC003100w.A0k(10, str2);
        } else {
            l = null;
        }
        return new JQO(c35129FeW.A03, C05F.A01, null, null, l, null, null, null, null, null, str, c35129FeW.A0H, null, null, null, null, null, null, -1L, !TextUtils.isEmpty(c35129FeW.A0F), false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r10 == com.instagram.common.notifications.push.intf.PushChannelType.A0B) goto L18;
     */
    @Override // X.C2ON
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D4k(X.C35129FeW r15, java.util.List r16) {
        /*
            r14 = this;
            r2 = 1
            X.JQU r1 = X.JQU.A01
            X.JQO r0 = A00(r15)
            r3 = r16
            r1.A09(r0, r3)
            X.E6f r4 = r15.A07
            if (r4 == 0) goto Le7
            java.lang.ref.WeakReference r0 = r4.A0A
            if (r0 == 0) goto Le7
            java.lang.Object r5 = r0.get()
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            if (r5 == 0) goto Le7
            java.lang.String r3 = r4.A04
            java.lang.String r13 = r4.A07
            java.lang.String r0 = r4.A09
            java.util.List r6 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r6)
            java.lang.String r1 = r4.A08
            boolean r9 = r4.A0C
            boolean r8 = r4.A0B
            com.instagram.common.notifications.push.intf.PushChannelType r10 = r4.A00
            java.lang.Long r12 = r4.A01
            java.lang.String r11 = r4.A05
            java.lang.String r7 = r4.A06
            r4 = 0
            X.C14360o3.A0B(r3, r2)
            java.lang.String r2 = "reason"
            r0 = 2
            X.C14360o3.A0B(r13, r0)
            r0 = 7
            X.C14360o3.A0B(r10, r0)
            X.LD0.A01(r5, r3, r13, r1, r6)
            r0 = 1196(0x4ac, float:1.676E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.0xC r3 = X.JQW.A02(r0)
            r3.A0C(r2, r13)
            r0 = 3234(0xca2, float:4.532E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r3.A0D(r0, r6)
            java.lang.String r0 = "target_id"
            if (r1 == 0) goto L65
            r3.A0C(r0, r1)
        L65:
            java.lang.String r1 = r5.userId
            java.lang.String r0 = "recipient_id"
            if (r1 == 0) goto L6e
            r3.A0C(r0, r1)
        L6e:
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.A0A
            if (r10 == r0) goto L77
            com.instagram.common.notifications.push.intf.PushChannelType r1 = com.instagram.common.notifications.push.intf.PushChannelType.A0B
            r0 = 0
            if (r10 != r1) goto L78
        L77:
            r0 = 1
        L78:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_e2ee"
            r3.A09(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0 = 169(0xa9, float:2.37E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r3.A09(r0, r1)
            java.lang.String r2 = "thread_id"
            if (r12 == 0) goto L95
            r3.A0B(r2, r12)
        L95:
            java.lang.String r0 = "pi"
            r3.A0C(r0, r11)
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 197(0xc5, float:2.76E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r3.A08(r1, r0)
            java.lang.String r1 = r10.name()
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r3.A0C(r0, r1)
            X.0x9 r1 = X.LD0.A00(r9, r8)
            java.lang.String r0 = "feature_tags"
            r3.A06(r1, r0)
            boolean r0 = X.C50C.A02(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 1033(0x409, float:1.448E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r3.A09(r0, r1)
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r6.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r3.A0C(r2, r0)
        Le0:
            X.0xH r0 = X.AbstractC11060iN.A00(r5)
            r0.EHW(r3)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3J2.D4k(X.FeW, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (r4 == com.instagram.common.notifications.push.intf.PushChannelType.A0B) goto L15;
     */
    @Override // X.C2ON
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E21(X.C35129FeW r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3J2.E21(X.FeW, java.util.List):void");
    }

    @Override // X.C2ON
    public final void DdC(C35129FeW c35129FeW) {
        JQU.A01.A0B(A00(c35129FeW));
        Integer num = C05F.A0Y;
        String str = c35129FeW.A0I;
        if (str == null) {
            str = null;
        }
        AbstractC43602JQi.A01(c35129FeW.A03, num, str, null, "InAppNotificationLoggingDelegateImpl", true);
    }

    @Override // X.C2ON
    public final void Dr2(C35129FeW c35129FeW, String str) {
        JQU.A01.A08(A00(c35129FeW), "no foreground activity to render in-app notification");
    }
}
