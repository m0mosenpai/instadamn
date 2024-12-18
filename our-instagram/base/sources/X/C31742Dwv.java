package X;

import android.content.Context;
import android.text.SpannableString;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dwv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31742Dwv extends SpannableString {
    public C31742Dwv(Context context, List list, int i, int i2, int i3) {
        super(AbstractC31175DnJ.A0a(AbstractC002300n.A0c("\n", i3), list));
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int A0A = AbstractC167007dF.A0A(AbstractC166987dD.A1B(it));
            setSpan(new C28587CjS(context, i, i2), i4, i4 + A0A, 33);
            i4 += A0A + i3;
        }
    }
}
