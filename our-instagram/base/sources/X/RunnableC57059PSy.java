package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.PSy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57059PSy implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public RunnableC57059PSy(UserSession userSession, Context context, String str) {
        this.A02 = str;
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BitSet bitSet = new BitSet(1);
        A1I.put("encrypted_subno", this.A02);
        bitSet.set(0);
        A1I.put("feature_key", "zero_balance_detection");
        if (bitSet.nextClearBit(0) >= 1) {
            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.screen_query.BloksCMonInterstitialScreenQuery", null, null, AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E(), 719983200, 0L, true);
            Context context = this.A00;
            AnonymousClass637 A00 = VRA.A00(this.A01, false);
            WTZ wtz = new WTZ(null, null, null, null, 1.0f, false, false, false, true);
            C14360o3.A0B(context, 0);
            C14360o3.A0B(A00, 1);
            c63719SsZ.E2V(context, wtz, A00);
            return;
        }
        throw AbstractC166987dD.A14("Missing required params");
    }
}
