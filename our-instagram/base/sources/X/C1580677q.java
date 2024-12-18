package X;

import android.content.Context;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.77q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580677q {
    public static final C1580677q A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if (r14 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.text.Editable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.text.Editable$Factory] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.Py8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AnonymousClass781 A02(android.content.Context r86, com.instagram.common.session.UserSession r87, X.C98K r88, X.AnonymousClass988 r89, X.C160787Im r90, X.C7IM r91) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580677q.A02(android.content.Context, com.instagram.common.session.UserSession, X.98K, X.988, X.7Im, X.7IM):X.781");
    }

    public static final AnonymousClass781 A03(Context context, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7im, 2);
        C14360o3.A0B(c160787Im, 3);
        C14360o3.A0B(anonymousClass988, 4);
        C14360o3.A0B(c98k, 5);
        return A04(context, userSession, c98k, anonymousClass988, c160787Im, c7im, AbstractC1580777r.A00.A04(userSession, c160787Im), false, c160787Im.A0V);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r12.A02 != r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r28, 36324767510639041L) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        if (r23 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
    
        if (r3.A1U() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a9, code lost:
    
        if (r0.A1u.equals(X.AbstractC31271Dot.A00(r28)) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AnonymousClass781 A04(android.content.Context r27, com.instagram.common.session.UserSession r28, X.C98K r29, X.AnonymousClass988 r30, X.C160787Im r31, X.C7IM r32, java.lang.String r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580677q.A04(android.content.Context, com.instagram.common.session.UserSession, X.98K, X.988, X.7Im, X.7IM, java.lang.String, boolean, boolean):X.781");
    }

    public static final AnonymousClass781 A05(Context context, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, boolean z) {
        String A04;
        Class<?> cls;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7im, 2);
        C14360o3.A0B(anonymousClass988, 4);
        C14360o3.A0B(c98k, 7);
        C18950wb c18950wb = C18950wb.A01;
        C14360o3.A0B(c18950wb, 1);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C2EY c2ey = c83403nh.A10;
        C76R c76r = C76R.$redex_init_class;
        if (c2ey.ordinal() == 22) {
            Object obj = c83403nh.A1T;
            if (!(obj instanceof C7QR)) {
                StringBuilder sb = new StringBuilder();
                sb.append("directMessage.content required to be DirectReelMedia but is ");
                if (obj != null) {
                    cls = obj.getClass();
                } else {
                    cls = null;
                }
                sb.append(cls);
                throw new IllegalArgumentException(sb.toString());
            }
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
            A04 = ((C7QR) obj).A0A;
            C14360o3.A0A(A04);
        } else {
            if (c83403nh.A1q == null) {
                C0f5 AEp = c18950wb.AEp("Expected REEL_SHARE or directMessage.text != null", 817891009);
                AEp.ABW("item_type", c83403nh.A10.toString());
                AEp.report();
            }
            A04 = AbstractC1580777r.A00.A04(userSession, c160787Im);
        }
        return A04(context, userSession, c98k, anonymousClass988, c160787Im, c7im, A04, false, z);
    }

    public static final AnonymousClass781 A06(Context context, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, boolean z, boolean z2) {
        Class<?> cls;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7im, 2);
        C14360o3.A0B(anonymousClass988, 4);
        C14360o3.A0B(c98k, 7);
        C83403nh c83403nh = c160787Im.A0e;
        Object obj = c83403nh.A1T;
        if (!(obj instanceof String) && !(obj instanceof List) && c83403nh.A1q == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("directMessage.content required to be String but is ");
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
        return A04(context, userSession, c98k, anonymousClass988, c160787Im, c7im, AbstractC1580777r.A00.A04(userSession, c160787Im), z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r32, 36322538422282555L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r35.A03 != 8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r32, 36324651546194250L) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r32, 36324651546194250L) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0156, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (X.C14360o3.A0K(r35.A0M, r37) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence A07(android.content.Context r31, com.instagram.common.session.UserSession r32, X.C98K r33, X.AnonymousClass988 r34, X.C160787Im r35, X.C7IM r36, java.lang.String r37, java.util.List r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580677q.A07(android.content.Context, com.instagram.common.session.UserSession, X.98K, X.988, X.7Im, X.7IM, java.lang.String, java.util.List, boolean, boolean):java.lang.CharSequence");
    }

    private final Py8 A00(Context context, UserSession userSession, C7IM c7im, boolean z, boolean z2, boolean z3) {
        if (C18U.A06(C06090Tz.A05, userSession, 36324660136849752L)) {
            C47565Kzb c47565Kzb = (C47565Kzb) userSession.A01(C47565Kzb.class, new C50252MHh(userSession, 23));
            UserSession userSession2 = c47565Kzb.A01;
            C72769Xml c72769Xml = new C72769Xml(context, userSession2, c7im);
            LruCache lruCache = c47565Kzb.A00;
            Py8 py8 = (Py8) lruCache.get(c72769Xml);
            if (py8 == null) {
                Py8 A01 = A01(context, userSession2, c7im, z, z2, z3);
                lruCache.put(c72769Xml, A01);
                return A01;
            }
            return py8;
        }
        return A01(context, userSession, c7im, z, z2, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r20, 36330836299236395L) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r5 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r24 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r20, 36324660136522069L) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r7 = X.AbstractC162737Qk.A04(r21, r22).A04;
        r8 = X.AbstractC162737Qk.A04(r21, r22).A05;
        r9 = X.AbstractC162737Qk.A04(r21, r22).A01;
        r6 = java.lang.Integer.valueOf(X.AbstractC162737Qk.A04(r21, r22).A02);
        r10 = r19.getResources().getDimensionPixelSize(com.facebook.R.dimen.account_group_management_row_text_size);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r4 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        r4 = new X.C51737MtK(r19.getResources().getDimensionPixelSize(com.facebook.R.dimen.abc_action_bar_elevation_material), r19.getResources().getDimensionPixelSize(com.facebook.R.dimen.account_discovery_bottom_gap), 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        if (r14 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r15 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        return new X.Py8(r19, r4, r5, r6, r7, r8, r9, r10, com.facebook.R.style.MessageRenderingBlockquoteOutgoing, com.facebook.R.style.MessageRenderingBlockquoteIncoming, true, true, true, true, r17, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r5 = new X.C51608Mr0(r19.getResources().getDimensionPixelSize(com.facebook.R.dimen.avatar_search_sticker_tray_text_size), 0, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (r23 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r20, 36324660136522069L) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r20, 36330836299367469L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0027, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0028, code lost:
    
        if (r5 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0014, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r20, 36330836299105321L) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r23 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r5 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r20, 36330836299301932L) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r15 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.Py8 A01(android.content.Context r19, com.instagram.common.session.UserSession r20, X.C7IM r21, boolean r22, boolean r23, boolean r24) {
        /*
            r3 = r20
            if (r24 != 0) goto L7
            r5 = 0
            if (r23 == 0) goto L16
        L7:
            r5 = 1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330836299105321(0x8112b400004429, double:3.03910539586517E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L19
        L16:
            r4 = 0
            if (r5 == 0) goto L27
        L19:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330836299301932(0x8112b40003442c, double:3.039105395989508E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r14 = 1
            if (r0 != 0) goto L2a
        L27:
            r14 = 0
            if (r5 == 0) goto L38
        L2a:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330836299236395(0x8112b40002442b, double:3.039105395948062E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r15 = 1
            if (r0 != 0) goto L3b
        L38:
            r15 = 0
            if (r5 == 0) goto L4a
        L3b:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330836299367469(0x8112b40004442d, double:3.0391053960309536E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r16 = 1
            if (r0 != 0) goto L4c
        L4a:
            r16 = 0
        L4c:
            if (r24 == 0) goto Ld5
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324660136522069(0x810d1600063155, double:3.035199565778111E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto Le4
        L5b:
            r17 = 0
        L5d:
            r18 = 0
            r2 = r21
            r1 = r22
            X.7IJ r0 = X.AbstractC162737Qk.A04(r2, r1)
            int r7 = r0.A04
            X.7IJ r0 = X.AbstractC162737Qk.A04(r2, r1)
            int r8 = r0.A05
            X.7IJ r0 = X.AbstractC162737Qk.A04(r2, r1)
            int r9 = r0.A01
            X.7IJ r0 = X.AbstractC162737Qk.A04(r2, r1)
            int r0 = r0.A02
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r3 = r19
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r5 = 0
            if (r4 == 0) goto Ld3
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 4
            X.MtK r4 = new X.MtK
            r4.<init>(r2, r1, r0)
        Lab:
            if (r14 != 0) goto Laf
            if (r15 == 0) goto Lc2
        Laf:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165318(0x7f070086, float:1.794485E38)
            int r12 = r1.getDimensionPixelSize(r0)
            X.Mr0 r5 = new X.Mr0
            r11 = r5
            r13 = r18
            r11.<init>(r12, r13, r14, r15, r16)
        Lc2:
            r13 = 1
            r11 = 2132017948(0x7f14031c, float:1.9674189E38)
            r12 = 2132017947(0x7f14031b, float:1.9674187E38)
            X.Py8 r2 = new X.Py8
            r14 = r13
            r15 = r13
            r16 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r2
        Ld3:
            r4 = r5
            goto Lab
        Ld5:
            if (r23 == 0) goto L5b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324660136522069(0x810d1600063155, double:3.035199565778111E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L5b
        Le4:
            r17 = 1
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580677q.A01(android.content.Context, com.instagram.common.session.UserSession, X.7IM, boolean, boolean, boolean):X.Py8");
    }
}
