package X;

import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.F9l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34265F9l {
    public static final void A00(Fragment fragment, String str, boolean z) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s", str);
        Resources A0N = AbstractC166997dE.A0N(fragment);
        int i = 2131973716;
        if (z) {
            i = 2131973711;
        }
        String string = A0N.getString(i, str, formatStrLocaleSafe);
        C14360o3.A0A(string);
        Intent A04 = AbstractC31171DnF.A04();
        A04.setAction("android.intent.action.SEND");
        A04.putExtra("android.intent.extra.TEXT", string);
        A04.setType("text/plain");
        C12260kU.A07(fragment, Intent.createChooser(A04, null), 7384567);
    }
}
