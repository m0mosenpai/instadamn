package X;

import android.text.Html;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Nwe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54142Nwe {
    public static final CharSequence A00(List list, int i) {
        String str = "";
        if (list == null) {
            return "";
        }
        CharSequence charSequence = str;
        if (i < list.size()) {
            User user = (User) list.get(i);
            String str2 = str;
            if (user != null) {
                str2 = user.getUsername();
            }
            String[] strArr = {Html.escapeHtml(new String[]{str2}[0])};
            C14360o3.A0B(strArr, 0);
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("<b>%s</b>", strArr[0]);
            if (formatStrLocaleSafe == null) {
                formatStrLocaleSafe = "";
            }
            CharSequence fromHtml = Html.fromHtml(formatStrLocaleSafe);
            C14360o3.A0A(fromHtml);
            charSequence = fromHtml;
        }
        return charSequence;
    }
}
