package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class IQc {
    public static final void A01(Context context, InterfaceC58152PqH interfaceC58152PqH, Integer num, String str, String str2) {
        int i;
        C14360o3.A0B(str, 1);
        Drawable A02 = AbstractC65877Tvg.A02(context, str2);
        if (A02 != null) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = R.attr.igds_color_active_badge;
            }
            A00(context, A02, interfaceC58152PqH, str, null, null, AbstractC53242c7.A0H(context, i), AbstractC31372Dqc.A00(), true);
        }
    }

    public static final void A00(Context context, Drawable drawable, InterfaceC58152PqH interfaceC58152PqH, String str, String str2, String str3, int i, int i2, boolean z) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A01 = i2;
        A0K.A0D = str;
        A0K.A0I = str2;
        A0K.A02();
        A0K.A0L = true;
        A0K.A0R = z;
        if (str3 == null) {
            str3 = AbstractC166997dE.A0p(context, 2131976066);
        }
        A0K.A0G = str3;
        A0K.A0A = interfaceC58152PqH;
        A0K.A08(drawable, context.getColor(i));
        AbstractC31178DnM.A1N(c41451vu, A0K);
    }
}
