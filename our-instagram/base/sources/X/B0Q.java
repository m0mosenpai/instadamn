package X;

import android.text.Spannable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class B0Q implements Comparator {
    public final /* synthetic */ Spannable A00;

    public B0Q(Spannable spannable) {
        this.A00 = spannable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Spannable spannable = this.A00;
        return C2BS.A00(Integer.valueOf(spannable.getSpanStart(obj)), Integer.valueOf(spannable.getSpanStart(obj2)));
    }
}
