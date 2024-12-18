package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.PLo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56869PLo implements Runnable {
    public final /* synthetic */ MXD A00;

    public RunnableC56869PLo(MXD mxd) {
        this.A00 = mxd;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.7wv] */
    @Override // java.lang.Runnable
    public final void run() {
        MXD mxd = this.A00;
        C178577wV c178577wV = mxd.A00;
        if (c178577wV == null) {
            Context context = mxd.A01;
            UserSession userSession = mxd.A04;
            c178577wV = AbstractC23039ADv.A01(context, new Object(), mxd.A03, userSession, "instagram_feed_post_capture", "MediaCaptureRenderService", null, true, C18U.A06(C06090Tz.A05, userSession, 36315451727809782L));
            mxd.A00 = c178577wV;
        }
        if (c178577wV != null) {
            c178577wV.A03();
        }
    }
}
