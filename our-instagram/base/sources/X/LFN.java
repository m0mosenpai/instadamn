package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes8.dex */
public final class LFN {
    public static final LFN A00 = new Object();

    public final CompletableFuture A00(UserSession userSession) {
        String str;
        C6CF A002 = C6CE.A00(userSession);
        CompletableFuture completableFuture = new CompletableFuture();
        if (!C6CB.A02(A002.A00, 2342158937690148668L)) {
            C19U A01 = C11830jh.A04.A01(userSession).A01(C19T.A1d);
            if (A01 == null || (str = A01.A01) == null) {
                str = "uniqueDeviceId";
            }
        } else {
            C0K8.A0D("EncryptedBackupsDeviceIdUtil", "getDeviceId() start");
            C11830jh A012 = C11830jh.A04.A01(userSession);
            C19T c19t = C19T.A1d;
            C19U A013 = A012.A01(c19t);
            if (A013 != null && (str = A013.A01) != null) {
                C0K8.A0D("EncryptedBackupsDeviceIdUtil", AnonymousClass001.A0R("getDeviceId() device id already available, ", str));
            } else {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                C14120nc.A00().ATO(new C45715KLs(C11820jg.A00(context, c19t, userSession), completableFuture));
                return completableFuture;
            }
        }
        completableFuture.complete(str);
        return completableFuture;
    }
}
