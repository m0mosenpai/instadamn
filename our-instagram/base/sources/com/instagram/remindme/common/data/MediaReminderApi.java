package com.instagram.remindme.common.data;

import X.AbstractC40691uc;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MediaReminderApi {
    public final C40701ud A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.remindme.common.data.MediaReminderApi r14, java.lang.String r15, java.lang.String r16, X.InterfaceC23621Ds r17) {
        /*
            r5 = 22
            r6 = r17
            boolean r0 = X.PXD.A03(r6, r5)
            r4 = r14
            if (r0 == 0) goto L97
            r3 = r6
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r3.A00 = r2
        L19:
            java.lang.Object r1 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r12 = 1
            if (r0 == 0) goto L56
            if (r0 != r12) goto La5
            X.AbstractC09560e7.A00(r1)
        L27:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L9d
            X.2JS r3 = X.AbstractC25232BEp.A18(r1)
            if (r3 == 0) goto La2
            java.lang.Class<X.QwA> r2 = X.C60236QwA.class
            java.lang.String r1 = "xdt_remind_me_set_reminder(ad_id:$ad_id,media_id:$media_id)"
            r0 = -64885548(0xfffffffffc21ecd4, float:-3.363053E36)
            X.2JS r1 = r3.A05(r2, r1, r0)
            if (r1 == 0) goto La2
            java.lang.String r0 = "is_reminder_set"
            boolean r2 = r1.getRequiredBooleanField(r12, r0)
            java.lang.String r0 = "expected_send_time"
            int r1 = r1.A00(r0)
            X.P9G r0 = new X.P9G
            r0.<init>(r2, r1)
            return r0
        L56:
            X.AbstractC09560e7.A00(r1)
            r13 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "media_id"
            boolean r1 = X.AbstractC43594JPz.A1X(r6, r0, r15)
            java.lang.String r0 = "ad_id"
            r7 = r16
            r6.A04(r0, r7)
            X.1uJ r7 = X.AbstractC25227BEk.A0U(r1)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.QwB> r11 = X.C60237QwB.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "RemindMeSetReminderMutation"
            r14 = 0
            java.lang.String r16 = "xdt_remind_me_set_reminder"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = r4.A00
            r3.A00 = r12
            java.lang.Object r1 = r0.A04(r6, r3)
            if (r1 != r2) goto L27
            return r2
        L97:
            X.PXD r3 = X.PXD.A00(r14, r6, r5)
            goto L19
        L9d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La2:
            X.P9H r0 = X.P9H.A00
            return r0
        La5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.remindme.common.data.MediaReminderApi.A00(com.instagram.remindme.common.data.MediaReminderApi, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.remindme.common.data.MediaReminderApi r14, java.lang.String r15, java.lang.String r16, X.InterfaceC23621Ds r17) {
        /*
            r5 = 23
            r6 = r17
            boolean r0 = X.PXD.A03(r6, r5)
            r4 = r14
            if (r0 == 0) goto L97
            r3 = r6
            X.PXD r3 = (X.PXD) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r3.A00 = r2
        L19:
            java.lang.Object r1 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r12 = 1
            if (r0 == 0) goto L56
            if (r0 != r12) goto La5
            X.AbstractC09560e7.A00(r1)
        L27:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L9d
            X.2JS r3 = X.AbstractC25232BEp.A18(r1)
            if (r3 == 0) goto La2
            java.lang.Class<X.QwC> r2 = X.C60238QwC.class
            java.lang.String r1 = "xdt_remind_me_unset_reminder(ad_id:$ad_id,media_id:$media_id)"
            r0 = -67325602(0xfffffffffbfcb15e, float:-2.6241125E36)
            X.2JS r1 = r3.A05(r2, r1, r0)
            if (r1 == 0) goto La2
            java.lang.String r0 = "is_reminder_set"
            boolean r2 = r1.getRequiredBooleanField(r12, r0)
            java.lang.String r0 = "expected_send_time"
            int r1 = r1.A00(r0)
            X.P9G r0 = new X.P9G
            r0.<init>(r2, r1)
            return r0
        L56:
            X.AbstractC09560e7.A00(r1)
            r13 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "media_id"
            boolean r1 = X.AbstractC43594JPz.A1X(r6, r0, r15)
            java.lang.String r0 = "ad_id"
            r7 = r16
            r6.A04(r0, r7)
            X.1uJ r7 = X.AbstractC25227BEk.A0U(r1)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.QwD> r11 = X.C60239QwD.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "RemindMeUnsetReminderMutation"
            r14 = 0
            java.lang.String r16 = "xdt_remind_me_unset_reminder"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = r4.A00
            r3.A00 = r12
            java.lang.Object r1 = r0.A04(r6, r3)
            if (r1 != r2) goto L27
            return r2
        L97:
            X.PXD r3 = X.PXD.A00(r14, r6, r5)
            goto L19
        L9d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La2:
            X.P9H r0 = X.P9H.A00
            return r0
        La5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.remindme.common.data.MediaReminderApi.A01(com.instagram.remindme.common.data.MediaReminderApi, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public MediaReminderApi(UserSession userSession) {
        this.A00 = AbstractC40691uc.A01(userSession);
    }
}
