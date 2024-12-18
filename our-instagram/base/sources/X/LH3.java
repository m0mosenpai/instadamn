package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class LH3 {
    public static final void A01(Activity activity, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i) {
        C49490Lu3 c49490Lu3;
        C14360o3.A0B(str, 2);
        AbstractC166987dD.A1T(C18950wb.A01, str, 245701013);
        if (interfaceC16820sZ != null) {
            c49490Lu3 = new C49490Lu3(interfaceC16820sZ, 0);
        } else {
            c49490Lu3 = null;
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            A00(activity, c49490Lu3, Integer.valueOf(i), str2, 2131974295);
        }
    }

    public static final void A02(Context context) {
        C14360o3.A0B(context, 0);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A05 = "Error";
        A0I.A0r("Failed to create cutout video sticker");
        A0I.A0d(null, AbstractC166997dE.A0q(context.getResources(), 2131968948));
        AbstractC166987dD.A1W(A0I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.PqH] */
    public static final void A00(Activity activity, InterfaceC58152PqH interfaceC58152PqH, Integer num, String str, int i) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = str;
        AbstractC25226BEj.A1N(activity, A0j, i);
        A0j.A0A(new Object());
        A0j.A04 = activity.getDrawable(R.drawable.instagram_error_pano_outline_24);
        if (num != null) {
            AbstractC31175DnJ.A0l(activity, A0j, num.intValue());
            A0j.A0L = true;
            if (interfaceC58152PqH != null) {
                A0j.A0A = interfaceC58152PqH;
            }
        }
        AbstractC31178DnM.A1N(c41451vu, A0j);
    }
}
