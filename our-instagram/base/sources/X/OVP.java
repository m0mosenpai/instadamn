package X;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class OVP {
    public static final OVP A00 = new Object();
    public static final List A01 = Arrays.asList("StellaDirectMessagingService");

    public final EnumC53275NhD A00(Context context, Intent intent, C08610cP c08610cP) {
        C14360o3.A0B(c08610cP, 0);
        if (!c08610cP.A03(context, intent, null)) {
            return EnumC53275NhD.A0G;
        }
        if (AbstractC31171DnF.A0F(context) instanceof C07270a1) {
            return EnumC53275NhD.A07;
        }
        return EnumC53275NhD.A0N;
    }
}
