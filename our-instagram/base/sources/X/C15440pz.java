package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.0pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15440pz implements C08V {
    public static final InterfaceC08100bW A02 = new C1QF("IgSecureUriParser").A00;
    public final InstagramMainActivity A00;
    public final InterfaceC53812dK A01;

    /* JADX WARN: Code restructure failed: missing block: B:88:0x025f, code lost:
    
        if (X.AbstractC001900j.A0a(r14, org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND, false) != true) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(android.content.Intent r29, com.instagram.common.session.UserSession r30, X.InterfaceC53782dH r31) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15440pz.A04(android.content.Intent, com.instagram.common.session.UserSession, X.2dH):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r13, 36331012393223284L) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0020, code lost:
    
        if (r12 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.content.Intent r11, android.os.Bundle r12, com.instagram.common.session.UserSession r13, X.InterfaceC53782dH r14, X.C54132eL r15, java.lang.String r16, boolean r17) {
        /*
            r10 = this;
            boolean r0 = X.AbstractC58327PtK.A00
            r7 = r10
            r3 = r11
            r4 = r13
            if (r0 == 0) goto L20
            r12 = 0
        L8:
            r5 = r14
            r6 = r15
            r8 = r16
            r9 = r17
            java.lang.Integer r1 = A01(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L22
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L1f
        L1a:
            X.2dK r0 = r10.A01
            r0.ET7()
        L1f:
            return
        L20:
            if (r12 == 0) goto L8
        L22:
            java.lang.String r1 = "MainActivityAccountHelper.STARTUP_TAB"
            boolean r0 = r11.hasExtra(r1)
            if (r0 == 0) goto L4b
            if (r12 != 0) goto L4b
            X.2dK r6 = r10.A01
            java.lang.String r5 = r11.getStringExtra(r1)
            X.1QO[] r4 = X.C1QO.values()
            int r3 = r4.length
            r2 = 0
        L38:
            if (r2 >= r3) goto L49
            r1 = r4[r2]
            java.lang.String r0 = r1.toString()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L7e
            int r2 = r2 + 1
            goto L38
        L49:
            r1 = 0
            goto L7e
        L4b:
            r1 = 0
            java.lang.String r0 = "is_cold_start_reel_tab"
            boolean r0 = r11.getBooleanExtra(r0, r1)
            if (r0 != 0) goto L7a
            X.1Ai r3 = X.AbstractC23021Ah.A00(r13)
            X.0ry r2 = r3.A7o
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 37
            r0 = r1[r0]
            java.lang.Object r0 = r2.CES(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36331012393223284(0x8112dd00074474, double:3.039216758494444E-306)
            boolean r0 = X.C18U.A06(r2, r13, r0)
            if (r0 == 0) goto L1a
        L7a:
            X.2dK r6 = r10.A01
            X.1QO r1 = X.C1QO.A09
        L7e:
            r6.EfI(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15440pz.A03(android.content.Intent, android.os.Bundle, com.instagram.common.session.UserSession, X.2dH, X.2eL, java.lang.String, boolean):void");
    }

    public C15440pz(InstagramMainActivity instagramMainActivity, InterfaceC53812dK interfaceC53812dK) {
        this.A00 = instagramMainActivity;
        this.A01 = interfaceC53812dK;
    }

    public static final Bundle A00(Intent intent) {
        String dataString = intent.getDataString();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        if (dataString != null) {
            extras.putString("original_url", dataString);
            android.net.Uri A022 = AbstractC08820cl.A02(A02, dataString, true);
            if (A022 != null) {
                for (String str : A022.getQueryParameterNames()) {
                    extras.putString(str, A022.getQueryParameter(str));
                }
            }
        }
        return extras;
    }

    public static final boolean A02(Intent intent, UserSession userSession) {
        Integer num;
        if (intent.getData() != null && (!TextUtils.isEmpty(intent.getStringExtra("from_notification_id")))) {
            android.net.Uri data = intent.getData();
            String A00 = AbstractC34771FTu.A00(data);
            if (A00 == null) {
                num = C05F.A0Y;
            } else if ("force_logout_login_help".equalsIgnoreCase(intent.getStringExtra("from_notification_category"))) {
                num = C05F.A0N;
            } else if (A00.equals(userSession.userId)) {
                num = C05F.A00;
            } else if (((C17110t6) C0BQ.A00(userSession)).BOc(null).contains(A00)) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
            if (data != null) {
                data.getQueryParameter("calling_package");
                data.getQueryParameter("attempt_id");
            }
            if (!C05F.A0C.equals(num) && !C05F.A01.equals(num)) {
                return !C05F.A0N.equals(num);
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x051c, code lost:
    
        if (r9.A05 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0212, code lost:
    
        if (r0 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0222, code lost:
    
        if (r0 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ("bloks_screen_query".equals(r6.getHost()) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0306 A[Catch: all -> 0x0920, TryCatch #0 {all -> 0x0920, blocks: (B:95:0x02ef, B:98:0x02fb, B:100:0x0306, B:102:0x0315, B:104:0x031d, B:106:0x0325, B:109:0x0338, B:112:0x034e, B:114:0x0358, B:116:0x0365, B:118:0x0393, B:120:0x03a8, B:227:0x03c0, B:229:0x03c6, B:231:0x03d9, B:232:0x0408, B:234:0x041e, B:235:0x0423, B:236:0x042a, B:238:0x0345), top: B:94:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x034e A[Catch: all -> 0x0920, TRY_ENTER, TryCatch #0 {all -> 0x0920, blocks: (B:95:0x02ef, B:98:0x02fb, B:100:0x0306, B:102:0x0315, B:104:0x031d, B:106:0x0325, B:109:0x0338, B:112:0x034e, B:114:0x0358, B:116:0x0365, B:118:0x0393, B:120:0x03a8, B:227:0x03c0, B:229:0x03c6, B:231:0x03d9, B:232:0x0408, B:234:0x041e, B:235:0x0423, B:236:0x042a, B:238:0x0345), top: B:94:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042a A[Catch: all -> 0x0920, TryCatch #0 {all -> 0x0920, blocks: (B:95:0x02ef, B:98:0x02fb, B:100:0x0306, B:102:0x0315, B:104:0x031d, B:106:0x0325, B:109:0x0338, B:112:0x034e, B:114:0x0358, B:116:0x0365, B:118:0x0393, B:120:0x03a8, B:227:0x03c0, B:229:0x03c6, B:231:0x03d9, B:232:0x0408, B:234:0x041e, B:235:0x0423, B:236:0x042a, B:238:0x0345), top: B:94:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0345 A[Catch: all -> 0x0920, TRY_LEAVE, TryCatch #0 {all -> 0x0920, blocks: (B:95:0x02ef, B:98:0x02fb, B:100:0x0306, B:102:0x0315, B:104:0x031d, B:106:0x0325, B:109:0x0338, B:112:0x034e, B:114:0x0358, B:116:0x0365, B:118:0x0393, B:120:0x03a8, B:227:0x03c0, B:229:0x03c6, B:231:0x03d9, B:232:0x0408, B:234:0x041e, B:235:0x0423, B:236:0x042a, B:238:0x0345), top: B:94:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0800 A[LOOP:1: B:300:0x07fa->B:302:0x0800, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A01(android.content.Intent r25, com.instagram.common.session.UserSession r26, X.InterfaceC53782dH r27, X.C54132eL r28, final X.C15440pz r29, java.lang.String r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 2450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15440pz.A01(android.content.Intent, com.instagram.common.session.UserSession, X.2dH, X.2eL, X.0pz, java.lang.String, boolean):java.lang.Integer");
    }
}
