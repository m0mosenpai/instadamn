package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.79w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1586179w {
    public final Context A00;

    public C1586179w(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    public final Spannable A00(Spannable spannable, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(spannable, 0);
        C14360o3.A0B(userSession, 1);
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
            Context context = this.A00;
            String string = context.getString(2131959903);
            C14360o3.A07(string);
            String string2 = context.getString(2131964621, "", string);
            C14360o3.A07(string2);
            if (str != null && str2 != null) {
                AbstractC46705KlO.A00(userSession).A00(str, str2);
            }
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) string2);
            C14360o3.A07(append);
            return append;
        }
        return spannable;
    }
}
