package X;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class R8V extends SBi {
    public final Integer A00 = C05F.A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public static final SpannableString A00(String str, List list) {
        SpannableString spannableString = new SpannableString(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17v c17v = (C17v) it.next();
            spannableString.setSpan(new StyleSpan(1), c17v.A00, c17v.A01 + 1, 33);
        }
        return spannableString;
    }

    public R8V(String str, String str2, List list, List list2) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = list;
        this.A03 = list2;
    }
}
