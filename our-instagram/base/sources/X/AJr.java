package X;

import android.text.Editable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class AJr {
    public static final C11L A00 = new C11L(" ");

    public static final List A00(Editable editable) {
        C22928A8y[] c22928A8yArr;
        int length;
        if (editable != null && (c22928A8yArr = (C22928A8y[]) editable.getSpans(0, editable.length(), C22928A8y.class)) != null && (length = c22928A8yArr.length) != 0) {
            ArrayList A1E = AbstractC166987dD.A1E();
            int i = 0;
            do {
                C22928A8y c22928A8y = c22928A8yArr[i];
                A1E.add(new C51753Mtc(c22928A8y.A01, Math.max(0, editable.getSpanStart(c22928A8y))));
                i++;
            } while (i < length);
            return A1E;
        }
        return C16930sl.A00;
    }

    public static final boolean A01(UserSession userSession, C2EE c2ee, String str) {
        String A11 = AnonymousClass001.A11(".*(@", "\u200d", "(", "everyone", ")).*");
        C14360o3.A07(A11);
        Matcher matcher = Pattern.compile(A11, 2).matcher(str);
        C14360o3.A07(matcher);
        if (!matcher.matches() || !AbstractC159107Bw.A00(userSession, c2ee)) {
            return false;
        }
        return true;
    }
}
