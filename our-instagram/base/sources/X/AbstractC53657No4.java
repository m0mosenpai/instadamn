package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Locale;

/* renamed from: X.No4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53657No4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.6cX, java.lang.Object] */
    public static final void A00(Context context, C102884kP c102884kP, IgdsMediaButton igdsMediaButton) {
        EnumC53232NgU enumC53232NgU;
        String A0G;
        Drawable A02;
        C102884kP A08 = c102884kP.A08(46);
        C102884kP A082 = c102884kP.A08(45);
        if (A08 != null && (A0G = A08.A0G()) != null && (A02 = AbstractC65877Tvg.A02(context, A0G)) != null) {
            ?? obj = new Object();
            obj.A01 = A02;
            igdsMediaButton.setStartAddOn(obj, null);
        }
        if (A082 != null) {
            if (c102884kP.A0K() != null) {
                String A0G2 = A082.A0G();
                if (A0G2 != null) {
                    String A1I = AbstractC25226BEj.A1I(AbstractC001900j.A0R(A0G2, new String[]{"_"}, 3), 0);
                    Locale locale = Locale.ROOT;
                    C14360o3.A08(locale);
                    String A10 = AbstractC166997dE.A10(locale, A1I);
                    if (A10.equals("CHEVRON")) {
                        enumC53232NgU = EnumC53232NgU.A04;
                    } else if (!A10.equals("CREATION-ARROW")) {
                        return;
                    } else {
                        enumC53232NgU = EnumC53232NgU.A05;
                    }
                    igdsMediaButton.setEndAddOn(enumC53232NgU);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A18("Cannot pass in only end icon when button has no text");
        }
    }
}
