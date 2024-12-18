package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3D6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3D6 implements InterfaceC13000lm {
    public C61442r7 A00;
    public C3D7 A01;
    public HashSet A02;
    public final UserSession A03;
    public final Handler A04;

    public C3D6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = new Handler(Looper.getMainLooper());
        this.A02 = new HashSet();
    }

    public static final synchronized C3D7 A00(C1QT c1qt, C3D6 c3d6) {
        synchronized (c3d6) {
            C3D7 c3d7 = c3d6.A01;
            if (c3d7 == null) {
                return null;
            }
            if (c1qt.isOngoingFlow(c3d7.A05)) {
                return c3d7;
            }
            c3d6.A01 = null;
            return null;
        }
    }

    public static final synchronized C3D7 A01(final C3D6 c3d6, Integer num) {
        String str;
        synchronized (c3d6) {
            UserSession userSession = c3d6.A03;
            C06090Tz c06090Tz = C06090Tz.A05;
            String str2 = null;
            if (!C18U.A06(c06090Tz, userSession, 2342156261917591397L)) {
                return null;
            }
            C1QT A00 = C1QS.A00(userSession);
            final C3D7 A002 = A00(A00, c3d6);
            if (A002 == null) {
                switch (num.intValue()) {
                    case 0:
                        str = "COLD";
                        break;
                    case 1:
                        str = "WARM";
                        break;
                    case 2:
                        str = AbstractC43591JPw.A00(272);
                        break;
                    default:
                        str = "HOT";
                        break;
                }
                long flowStartForMarker = A00.flowStartForMarker(974466465, str, false);
                ReelStore A04 = C1OU.A04(userSession);
                Reel reel = (Reel) A04.A0D.get(A04.A09.userId);
                if (reel != null) {
                    str2 = reel.getId();
                }
                A002 = new C3D7(str2, flowStartForMarker);
                A00.flowAnnotate(flowStartForMarker, "EXISTING_TRAY_SIZE", A04.A0U(false).size());
                A00.flowAnnotate(flowStartForMarker, "START_TYPE", str);
                c3d6.A04.postDelayed(new Runnable() { // from class: X.3D8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3D6.A03(A002, c3d6);
                    }
                }, C18U.A01(c06090Tz, userSession, 36594727680542539L) * 1000);
                c3d6.A01 = A002;
            }
            return A002;
        }
    }

    public static final synchronized void A03(C3D7 c3d7, C3D6 c3d6) {
        synchronized (c3d6) {
            C1QT A00 = C1QS.A00(c3d6.A03);
            C3D7 A002 = A00(A00, c3d6);
            if (A002 != null && A002.equals(c3d7)) {
                long j = A002.A05;
                A00.flowAnnotate(j, "DEBUG_REMAINING_COMPONENTS", A002.A07.toString());
                if (A002.A04 == 2) {
                    A00.flowEndSuccess(j);
                } else {
                    A00.flowEndTimeout(j);
                }
                c3d6.A01 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0017, B:12:0x001b, B:14:0x0021, B:15:0x0023, B:17:0x0029, B:19:0x002f, B:21:0x0039, B:22:0x0040, B:24:0x0046, B:25:0x004d, B:27:0x0055, B:29:0x005d, B:31:0x0067, B:33:0x0071), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0017, B:12:0x001b, B:14:0x0021, B:15:0x0023, B:17:0x0029, B:19:0x002f, B:21:0x0039, B:22:0x0040, B:24:0x0046, B:25:0x004d, B:27:0x0055, B:29:0x005d, B:31:0x0067, B:33:0x0071), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A05(X.C1OP r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            X.C14360o3.A0B(r7, r0)     // Catch: java.lang.Throwable -> L78
            com.instagram.common.session.UserSession r0 = r6.A03     // Catch: java.lang.Throwable -> L78
            X.1QT r3 = X.C1QS.A00(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r2 = X.C05F.A00     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r1 = r7.A04     // Catch: java.lang.Throwable -> L78
            if (r2 == r1) goto L1b
            boolean r0 = r7.A00()     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L1b
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L76
        L1b:
            boolean r0 = r7.A00()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6f
            java.lang.Integer r2 = X.C05F.A0C     // Catch: java.lang.Throwable -> L78
        L23:
            X.3D7 r4 = A01(r6, r2)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L76
            java.lang.Integer r1 = r7.A03     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L78
            if (r1 != r0) goto L5d
            java.util.HashSet r5 = r4.A07     // Catch: java.lang.Throwable -> L78
            X.3D9 r0 = X.C3D9.A02     // Catch: java.lang.Throwable -> L78
            boolean r0 = r5.add(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5d
            long r0 = r4.A05     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "CACHED_TRAY_DELIVERY_START"
            r3.flowMarkPoint(r0, r2)     // Catch: java.lang.Throwable -> L78
        L40:
            boolean r0 = r7.A00()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L4d
            long r1 = r4.A05     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "USER_REFRESHED"
            r3.flowMarkPoint(r1, r0)     // Catch: java.lang.Throwable -> L78
        L4d:
            X.3D9 r0 = X.C3D9.A06     // Catch: java.lang.Throwable -> L78
            boolean r0 = r5.add(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L76
            long r1 = r4.A05     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "TRAY_LOAD_START"
            r3.flowMarkPoint(r1, r0)     // Catch: java.lang.Throwable -> L78
            goto L76
        L5d:
            java.util.HashSet r5 = r4.A07     // Catch: java.lang.Throwable -> L78
            X.3D9 r0 = X.C3D9.A03     // Catch: java.lang.Throwable -> L78
            boolean r0 = r5.add(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L40
            long r1 = r4.A05     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "NETWORK_TRAY_DELIVERY_START"
            r3.flowMarkPoint(r1, r0)     // Catch: java.lang.Throwable -> L78
            goto L40
        L6f:
            if (r2 == r1) goto L23
            java.lang.Integer r2 = X.C05F.A01     // Catch: java.lang.Throwable -> L78
            if (r2 != r1) goto L76
            goto L23
        L76:
            monitor-exit(r6)
            return
        L78:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3D6.A05(X.1OP):void");
    }

    public final synchronized void A06(Integer num) {
        String str;
        C1QT A00 = C1QS.A00(this.A03);
        C3D7 A002 = A00(A00, this);
        if (A002 != null) {
            long j = A002.A05;
            switch (num.intValue()) {
                case 1:
                    str = "APP_BACKGROUNDED";
                    break;
                case 2:
                    str = "EXIT_SURFACE";
                    break;
                case 3:
                    str = "FRAGMENT_NOT_VISIBLE";
                    break;
                default:
                    str = "ENTER_VIEWER";
                    break;
            }
            A00.flowAnnotate(j, "CANCEL_REASON", str);
            A00.flowEndCancel(j, str);
            this.A01 = null;
        }
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        C1QT A00 = C1QS.A00(this.A03);
        C3D7 A002 = A00(A00, this);
        if (A002 != null) {
            long j = A002.A05;
            A00.flowAnnotate(j, "CANCEL_REASON", "SESSION_ENDING");
            A00.flowEndCancel(j, "SESSION_ENDING");
            this.A01 = null;
        }
    }

    public static final String A02(Throwable th) {
        StringBuilder sb;
        int i;
        if (th instanceof C53093Ne6) {
            sb = new StringBuilder();
            sb.append("parse_http_status_code: ");
            i = ((C53093Ne6) th).A00;
        } else if (th instanceof C58485PwB) {
            sb = new StringBuilder();
            sb.append("empty_http_status_code: ");
            i = ((C58485PwB) th).A00;
        } else {
            boolean z = th instanceof IOException;
            String obj = th.toString();
            String str = null;
            if (AbstractC001900j.A0a(obj, "Unexpcted", false)) {
                str = "Parsing";
            } else if (AbstractC001900j.A0a(obj, "no content", false)) {
                str = "EmptyCacheResponse";
            } else {
                String lowerCase = obj.toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                if (new C11L("asyncsocketexception | network | connect").A07(lowerCase)) {
                    str = "NetworkConnection";
                }
            }
            if (z) {
                if (str != null) {
                    return str;
                }
                return MSV.A00(41);
            }
            if (str != null) {
                return str;
            }
            return "Other";
        }
        sb.append(i);
        return sb.toString();
    }

    public static final void A04(C3D7 c3d7, C3D6 c3d6, C1OP c1op) {
        C1CA c1ca;
        C77383dO c77383dO = C77383dO.A00;
        UserSession userSession = c3d6.A03;
        if (C226218q.A01(AbstractC12960li.A00).A0W()) {
            c1ca = C1CA.A05;
        } else if (C05F.A00 == c1op.A04) {
            c1ca = C1CA.A03;
        } else {
            c1ca = C1CA.A06;
        }
        Integer num = C05F.A01;
        List A0a = AbstractC001800i.A0a(c3d7.A03);
        c77383dO.A01(userSession, c1ca, num, c3d7.A01, c3d7.A02, A0a);
    }
}
