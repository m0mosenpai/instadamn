package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.5by, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120005by implements InterfaceC13050lr {
    public static final int A01;
    public static final int A02;
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(int r7) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120005by.A01(int):void");
    }

    public static final void A02(int i, String str, String str2) {
        TraceLogger.log(null, i, null, 83, str, str2, 0, null);
    }

    public static final void A03(String str, List list, int i, int i2, int i3) {
        TraceLogger.log(null, i, null, i2, str, null, i3, list);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        TraceLogger.removeConfig(1);
        TraceLogger.removeConfig(4);
        TraceLogger.removeConfig(13);
        TraceLogger.removeConfig(15);
        TraceLogger.removeConfig(17);
        TraceLogger.removeConfig(14);
        TraceLogger.removeConfig(19);
        TraceLogger.removeConfig(74);
        TraceLogger.removeConfig(0);
        TraceLogger.removeConfig(403);
        TraceLogger.removeConfig(401);
        TraceLogger.removeConfig(406);
        TraceLogger.removeConfig(402);
        TraceLogger.removeConfig(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A01 = (int) timeUnit.toMillis(2L);
        A02 = (int) timeUnit.toMillis(10L);
    }

    public static C120005by A00(final UserSession userSession) {
        return (C120005by) userSession.A01(C120005by.class, new InterfaceC16820sZ() { // from class: X.5bz
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C120005by(UserSession.this);
            }
        });
    }

    public final void A04(List list, int i, String str) {
        PrivacyContext newPrivacyContextWithTransportKeyNative;
        String A00 = AbstractC43591JPw.A00(255);
        String A002 = AbstractC43591JPw.A00(105);
        if (i != 10 && i != 13 && i != 15) {
            if (i != 4 && i != 5) {
                throw new UnsupportedOperationException("no privacy context defined for trace type");
            }
            newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(null, A00);
        } else {
            newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(null, A002);
        }
        TraceLogger.log(newPrivacyContextWithTransportKeyNative, i, null, 80, str, null, 0, list);
    }

    public C120005by(UserSession userSession) {
        this.A00 = userSession;
        A01(1);
        A01(4);
        A01(13);
        A01(15);
        A01(17);
        A01(14);
        A01(19);
        A01(0);
        A01(74);
        A01(403);
        A01(401);
        A01(406);
        A01(402);
        A01(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
    }
}
