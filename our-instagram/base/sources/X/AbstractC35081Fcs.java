package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fcs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35081Fcs {
    public static void A01(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setTextSize(0, textView.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
            textView.setTypeface(textView.getTypeface(), 1);
        }
    }

    public static boolean A02(Bundle bundle, UserSession userSession) {
        if ((bundle != null && bundle.getString(AbstractC111324zv.A00(625)) != null) || C18U.A06(C06090Tz.A05, userSession, 36325158352335663L)) {
            return true;
        }
        return false;
    }

    public static void A00(TextView textView, Context context) {
        C35251Fgk.A03(new TextView[]{textView}[0], AbstractC53242c7.A06(context));
    }
}
