package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes7.dex */
public abstract class Hx6 {
    public static final boolean A00(Context context, String str) {
        Intent data = new Intent("android.intent.action.VIEW").setFlags(268435456).setData(AbstractC08820cl.A01(AbstractC31175DnJ.A0B(), str));
        C14360o3.A07(data);
        if ((AbstractC002300n.A0h(str, "market://", false) || AbstractC002300n.A0h(str, "https://play.google.com/", false)) && AbstractC14490oL.A0F(context)) {
            data.setPackage("com.android.vending");
        }
        return C12260kU.A0A(context, data);
    }
}
