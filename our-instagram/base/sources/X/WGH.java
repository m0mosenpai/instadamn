package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public abstract class WGH {
    public static final void A01(Activity activity) {
        A04(activity, null, null, null, null, null, null, 2131974429, false, false);
    }

    public static final void A02(Activity activity, int i) {
        C14360o3.A0B(activity, 0);
        A03(activity, i);
    }

    public static final void A03(Activity activity, int i) {
        A04(activity, null, null, null, null, null, null, i, false, false);
    }

    public static final void A04(Activity activity, Drawable drawable, InterfaceC71983XDs interfaceC71983XDs, Integer num, Integer num2, Integer num3, Integer num4, int i, boolean z, boolean z2) {
        int i2;
        C14360o3.A0B(activity, 0);
        Resources resources = activity.getResources();
        String A0r = AbstractC166997dE.A0r(resources, AbstractC166997dE.A0q(resources, i), 2131975122);
        C14360o3.A07(A0r);
        C193328hC c193328hC = new C193328hC(activity);
        c193328hC.A0r(A0r);
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            i2 = 2131975120;
        }
        c193328hC.A0J(new WHj(2, activity, interfaceC71983XDs, num4), i2);
        c193328hC.A0t(z2);
        c193328hC.A0C(new WHF(interfaceC71983XDs, 2));
        c193328hC.A0g(new WI7(interfaceC71983XDs, 4));
        c193328hC.A0h(new WIG(interfaceC71983XDs, 7));
        if (z) {
            c193328hC.A0D(new WHP(interfaceC71983XDs, 51));
        }
        if (num != null) {
            c193328hC.A05 = resources.getString(num.intValue());
        }
        if (num2 != null) {
            c193328hC.A0r(resources.getString(num2.intValue()));
        }
        if (drawable != null) {
            c193328hC.A0k(drawable);
        }
        AbstractC166987dD.A1W(c193328hC);
    }

    public static final void A06(Activity activity, Integer num) {
        C14360o3.A0B(activity, 0);
        A07(activity, num, AbstractC58317Pt9.A00(18));
    }

    public static final Dialog A00(Activity activity, InterfaceC71983XDs interfaceC71983XDs, int i, boolean z) {
        Resources resources = activity.getResources();
        String A0r = AbstractC166997dE.A0r(resources, AbstractC166997dE.A0q(resources, i), 2131975122);
        C14360o3.A07(A0r);
        C193328hC c193328hC = new C193328hC(activity);
        c193328hC.A0r(A0r);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC70206WHe(13, activity, interfaceC71983XDs), 2131975120);
        c193328hC.A0s(z);
        c193328hC.A0t(z);
        c193328hC.A0C(new WHF(interfaceC71983XDs, 1));
        c193328hC.A0g(new WI7(interfaceC71983XDs, 3));
        c193328hC.A0h(new WIG(interfaceC71983XDs, 6));
        return c193328hC.A02();
    }

    public static final void A05(Activity activity, InterfaceC71983XDs interfaceC71983XDs) {
        C14360o3.A0B(activity, 0);
        A04(activity, null, interfaceC71983XDs, null, null, null, null, 2131965675, false, false);
    }

    public static final void A07(Activity activity, Integer num, String str) {
        android.net.Uri A03 = AbstractC08820cl.A03(AnonymousClass001.A0R(AbstractC43591JPw.A00(88), activity.getPackageName()));
        C14360o3.A07(A03);
        Intent intent = new Intent(str);
        intent.setData(A03);
        if (num != null) {
            C12260kU.A09(activity, intent, num.intValue());
        } else {
            C12260kU.A0E(activity, intent);
        }
    }
}
