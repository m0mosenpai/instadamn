package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dnd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31194Dnd {
    public final long A01(UserSession userSession, C1QO c1qo, String str) {
        C06090Tz c06090Tz;
        long j;
        long j2;
        long A01;
        int A07;
        long j3;
        long A012;
        C14360o3.A0B(userSession, 2);
        if (str == null || !AbstractC001900j.A0a(str, "clips_viewer", false) || !C18U.A06(C06090Tz.A05, userSession, 36320489725370950L)) {
            if (C14360o3.A0K(str, "stories_precapture_camera")) {
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36320489725043267L)) {
                    j = 36601964700504487L;
                    A07 = AbstractC25225BEi.A07(c06090Tz, userSession, j);
                    return TimeUnit.SECONDS.toMillis(A07);
                }
            }
            if (c1qo != C1QO.A09) {
                if (c1qo == C1QO.A0F) {
                    c06090Tz = C06090Tz.A05;
                    j = 36601964699783584L;
                } else if (c1qo == C1QO.A0E || (C14360o3.A0K(str, "profile") && C18U.A06(C06090Tz.A05, userSession, 36320489724977730L))) {
                    c06090Tz = C06090Tz.A05;
                    j = 36601964699849121L;
                } else if (C14360o3.A0K(str, "direct_inbox")) {
                    boolean z = ((FJG) userSession.A01(FJG.class, new C57248PbW(userSession, 3))).A00;
                    c06090Tz = C06090Tz.A05;
                    if (z) {
                        j = 36601964703125940L;
                    } else {
                        j = 36601964699914658L;
                    }
                } else {
                    boolean A0K = C14360o3.A0K(str, "feed_timeline");
                    c06090Tz = C06090Tz.A05;
                    if (A0K) {
                        if (C18U.A06(c06090Tz, userSession, 36320489722946096L)) {
                            boolean z2 = C23051Ak.A05;
                            if (C23061Al.A00(userSession).A00(EnumC23071Am.A0S)) {
                                j2 = 36601964699718047L;
                                A01 = C18U.A01(c06090Tz, userSession, j2);
                                A07 = (int) A01;
                                return TimeUnit.SECONDS.toMillis(A07);
                            }
                        }
                        j2 = 36601964699586974L;
                        A01 = C18U.A01(c06090Tz, userSession, j2);
                        A07 = (int) A01;
                        return TimeUnit.SECONDS.toMillis(A07);
                    }
                    j = 36601964701880747L;
                }
                A07 = AbstractC25225BEi.A07(c06090Tz, userSession, j);
                return TimeUnit.SECONDS.toMillis(A07);
            }
        }
        C06090Tz c06090Tz2 = C06090Tz.A05;
        if (C18U.A06(c06090Tz2, userSession, 36320489725633097L)) {
            j3 = 36601964702405038L;
        } else {
            C06090Tz c06090Tz3 = C06090Tz.A06;
            if (C18U.A06(c06090Tz3, userSession, 36331012393878653L)) {
                A012 = C18U.A01(c06090Tz3, userSession, 36612487370512785L);
                A01 = Long.valueOf(A012).longValue();
                A07 = (int) A01;
                return TimeUnit.SECONDS.toMillis(A07);
            }
            j3 = 36601728476385623L;
        }
        A012 = C18U.A01(c06090Tz2, userSession, j3);
        A01 = Long.valueOf(A012).longValue();
        A07 = (int) A01;
        return TimeUnit.SECONDS.toMillis(A07);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00fc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31194Dnd.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
    
        if (r3.equals("reels") == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(com.instagram.common.session.UserSession r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31194Dnd.A02(com.instagram.common.session.UserSession, java.lang.String, long):boolean");
    }
}
