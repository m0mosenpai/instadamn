package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LdN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48525LdN implements InterfaceC13050lr {
    public HandlerC25861Nt A00;
    public final Context A01;
    public final C18920wW A02;
    public final UserSession A04;
    public final Map A05 = AbstractC166987dD.A1G();
    public final InterfaceC41501vz A03 = new C44288Jhe(this, 12);

    public static final C116155Nu A00(C48525LdN c48525LdN, String str) {
        Map map = c48525LdN.A05;
        C116155Nu c116155Nu = (C116155Nu) map.remove(str);
        if (map.isEmpty()) {
            AbstractC25651Mw.A00(c48525LdN.A04).A02(c48525LdN.A03, C2Io.class);
        }
        return c116155Nu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d0, code lost:
    
        if (r14 != null) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0117  */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.instagram.common.typedurl.ImageUrl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C116155Nu r34, X.C83403nh r35, X.C48525LdN r36) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48525LdN.A01(X.5Nu, X.3nh, X.LdN):void");
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        AbstractC25651Mw.A00(this.A04).A02(this.A03, C2Io.class);
    }

    public C48525LdN(Context context, C18920wW c18920wW, UserSession userSession) {
        this.A01 = context;
        this.A04 = userSession;
        this.A02 = c18920wW;
        HandlerThread handlerThread = new HandlerThread("StellaMessageNotificationHandler");
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        C14360o3.A07(looper);
        this.A00 = new HandlerC25861Nt(looper);
    }
}
