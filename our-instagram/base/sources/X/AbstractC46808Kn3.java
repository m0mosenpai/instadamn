package X;

import android.content.res.Resources;
import android.text.SpannableString;

/* renamed from: X.Kn3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46808Kn3 {
    public static final SpannableString A00(Resources resources, C105824pt c105824pt, boolean z) {
        String A0r;
        AbstractC167017dG.A1N(resources, c105824pt);
        EnumC109104va enumC109104va = c105824pt.A06;
        if (enumC109104va == null) {
            enumC109104va = EnumC109104va.A0E;
        }
        if (enumC109104va != EnumC109104va.A08 && enumC109104va.A00()) {
            int i = 2131959770;
            if (z) {
                i = 2131959772;
            }
            A0r = resources.getString(i);
        } else {
            int i2 = 2131959768;
            if (z) {
                i2 = 2131959771;
            }
            A0r = AbstractC166997dE.A0r(resources, c105824pt.A03().getUsername(), i2);
        }
        return AbstractC43592JPx.A07(A0r);
    }
}
