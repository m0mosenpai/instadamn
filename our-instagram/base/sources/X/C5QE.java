package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5QE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QE {
    public final List A00 = new ArrayList();

    public final CharSequence A01(Resources resources) {
        C14360o3.A0B(resources, 0);
        CharSequence A02 = A02(resources);
        List list = this.A00;
        if (!list.isEmpty()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A02);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                spannableStringBuilder.setSpan(((C27820COj) it.next()).A00, 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        return A02;
    }

    public abstract CharSequence A02(Resources resources);
}
