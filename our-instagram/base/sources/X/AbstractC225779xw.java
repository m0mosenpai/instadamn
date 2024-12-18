package X;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225779xw {
    public static final String A00(C23031Ai c23031Ai, long j) {
        List list;
        Integer A0i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMdd", Locale.getDefault());
        Object obj = null;
        String string = c23031Ai.A01.getString("last_saved_draft_date_and_count", null);
        int i = 0;
        String str = null;
        if (string != null) {
            list = AbstractC167007dF.A0m(string, "-", 0);
        } else {
            list = null;
        }
        if (-1 == j) {
            j = System.currentTimeMillis();
        }
        String format = simpleDateFormat.format(Long.valueOf(j));
        if (list != null) {
            obj = AbstractC001800i.A0O(list, 0);
            str = (String) AbstractC001800i.A0O(list, 1);
        }
        if (C14360o3.A0K(obj, format)) {
            if (str != null && (A0i = AbstractC003100w.A0i(str)) != null) {
                i = A0i.intValue();
            }
            return AnonymousClass001.A0G(format, '-', i + 1);
        }
        C14360o3.A0A(format);
        return format;
    }
}
