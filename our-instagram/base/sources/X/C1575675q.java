package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.75q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1575675q {
    public final UserSession A00;
    public final C83403nh A01;
    public final String A02;

    public C1575675q(UserSession userSession, C83403nh c83403nh, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c83403nh;
        this.A02 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel A05(android.content.res.Resources r14, boolean r15) {
        /*
            r13 = this;
            r12 = 0
            boolean r0 = A02(r13)
            r4 = 0
            if (r0 == 0) goto L63
            X.3nh r2 = r13.A01
            java.lang.String r1 = r2.A0k()
            java.lang.String r0 = "replayable"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L25
            java.lang.String r1 = r2.A0k()
            java.lang.String r0 = "once"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r3 = 2131238326(0x7f081db6, float:1.8092928E38)
            if (r0 == 0) goto L28
        L25:
            r3 = 2131238327(0x7f081db7, float:1.809293E38)
        L28:
            if (r15 != 0) goto L37
            boolean r0 = A00(r13)
            if (r0 == 0) goto L37
            r0 = 2131964622(0x7f1332ce, float:1.956603E38)
            java.lang.String r4 = r14.getString(r0)
        L37:
            r9 = r4
            X.442 r2 = r2.A0P()
            r1 = 1
            if (r2 == 0) goto L60
            java.lang.String r0 = r13.A02
            if (r0 == 0) goto L60
            java.lang.Integer r0 = r2.A02(r0)
            if (r0 == 0) goto L60
            int r0 = r0.intValue()
            if (r0 != r1) goto L60
        L4f:
            r12 = 1
        L50:
            java.lang.Integer r6 = X.C05F.A00
            r7 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r11 = 2
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r4 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r8 = r7
            r10 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L5f:
            return r4
        L60:
            if (r15 == 0) goto L50
            goto L4f
        L63:
            boolean r0 = A01(r13)
            if (r0 == 0) goto L5f
            java.lang.Integer r6 = X.C05F.A01
            r5 = 0
            r11 = 1
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r4 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1575675q.A05(android.content.res.Resources, boolean):com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel");
    }

    public static final boolean A00(C1575675q c1575675q) {
        Integer A0c;
        String str = c1575675q.A02;
        if (str == null || (A0c = c1575675q.A01.A0c(str)) == null || A0c.intValue() != 1) {
            C83403nh c83403nh = c1575675q.A01;
            if (!C14360o3.A0K(c83403nh.A0k(), "permanent") || !c83403nh.A1b()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A01(C1575675q c1575675q) {
        String str;
        Integer A0c;
        C83403nh c83403nh = c1575675q.A01;
        if (!c83403nh.A1j(C17060sy.A01.A01(c1575675q.A00)) && (str = c1575675q.A02) != null && (A0c = c83403nh.A0c(str)) != null && A0c.intValue() == 100) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C1575675q c1575675q) {
        String str;
        Integer A02;
        if (!A00(c1575675q)) {
            AnonymousClass442 A0P = c1575675q.A01.A0P();
            if (A0P != null && (str = c1575675q.A02) != null && (A02 = A0P.A02(str)) != null && A02.intValue() == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int A03() {
        if (A02(this) || A01(this)) {
            return 1;
        }
        return 2;
    }

    public final PrivacyMediaOverlayViewModel A04(Context context, boolean z) {
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return A05(resources, z);
    }

    public final boolean A06() {
        if ((A02(this) || A01(this)) && JUW.A03(this.A00, this.A01.A1S())) {
            return true;
        }
        return false;
    }
}
