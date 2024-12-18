package X;

import android.content.Context;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* loaded from: classes10.dex */
public final class SKT {
    public Integer A00;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.3V1, java.lang.Object] */
    public final C3V1 A00(Context context, C74103Uo c74103Uo) {
        C4N8 A0V = AbstractC58319PtB.A0V(context, c74103Uo, AbstractC43591JPw.A00(202));
        if (A0V.contains("DELIVERY_RETRY_INTERVAL")) {
            this.A00 = Integer.valueOf(A0V.getInt("DELIVERY_RETRY_INTERVAL", DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD));
        }
        Integer num = this.A00;
        ?? obj = new Object();
        obj.A03 = null;
        obj.A00 = 0L;
        obj.A01 = null;
        obj.A02 = num;
        return obj;
    }
}
