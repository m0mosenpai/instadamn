package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class S1G {
    public static final AbstractC62427SBc A00(Context context, Intent intent) {
        C0LG A01 = AbstractC08470cB.A01(context, intent, null, DexStore.DAYS_TO_MS_FACTOR, 0L);
        if (A01 == null) {
            EnumC61130Rfk enumC61130Rfk = EnumC61130Rfk.A04;
            C16930sl c16930sl = C16930sl.A00;
            return new R7D(enumC61130Rfk, c16930sl, c16930sl);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        String str = A01.A01;
        if (str != null) {
            A1E.add(str);
        }
        return new R7C(intent, A1E);
    }
}
