package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes9.dex */
public final class POB implements Runnable {
    public final /* synthetic */ NTX A00;

    public POB(NTX ntx) {
        this.A00 = ntx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        NTX ntx = this.A00;
        ((Dialog) ntx.A0L.getValue()).hide();
        UserSession userSession = ntx.A0B;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36310323535347728L)) {
            String str = ntx.A06;
            if (str != null && (bitmap = ntx.A02) != null) {
                Context context = ntx.A0A;
                C1GJ.A06(new C121275eQ(new PUP(context, bitmap, null, new OyS(ntx, str), false, false), 473), 1601186431, 1, true, false);
                ntx.A0D.A05(new PDY(AbstractC166997dE.A0p(context, 2131969604), AbstractC166997dE.A0p(context, 2131952155), new C57259Pbh(str, ntx, 13)));
                return;
            }
            return;
        }
        if (C18U.A06(c06090Tz, userSession, 2342153332749369363L)) {
            String str2 = ntx.A06;
            if (str2 == null) {
                return;
            }
            ntx.A0D.A03(new C56614PBk(userSession, ntx.A09, str2));
            ntx.A0F.A00.A00(new C56558P9e(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING));
            return;
        }
        Bitmap bitmap2 = ntx.A02;
        C14360o3.A0A(bitmap2);
        ntx.A0J(new C51892Mwa(bitmap2, C05F.A00, false, true));
    }
}
