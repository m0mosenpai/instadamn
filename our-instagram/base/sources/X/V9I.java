package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;

/* loaded from: classes11.dex */
public final class V9I extends VK6 {
    public static final boolean A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC23451Ch.A05(activity, AbstractC111324zv.A00(171));
        }
        return false;
    }

    @Override // X.VK6
    public final C4IC A01(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return super.A01(context);
        }
        if (AbstractC14480oK.A01(context)) {
            return C4IC.A06;
        }
        return C4IC.A05;
    }

    @Override // X.VK6
    public final void A02(Activity activity, C69090Vhg c69090Vhg) {
        if (Build.VERSION.SDK_INT >= 33) {
            super.A02(activity, c69090Vhg);
            return;
        }
        InterfaceC103384lE interfaceC103384lE = c69090Vhg.A01;
        C6FX c6fx = new C6FX();
        c6fx.A01(MSV.A00(522));
        C131845xK.A00(c69090Vhg.A00, c6fx.A00(), interfaceC103384lE);
    }
}
