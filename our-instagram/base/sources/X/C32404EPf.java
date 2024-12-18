package X;

import android.content.Context;
import com.instagram.business.fragment.CategorySearchFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32404EPf extends C7E1 {
    public final Context A00;
    public final ER4 A01;
    public final CategorySearchFragment A02;
    public final C31545DtV A03;

    public static final void A00(C32404EPf c32404EPf, C36213FyR c36213FyR, List list) {
        String str;
        if (c36213FyR != null) {
            str = c36213FyR.A01;
        } else {
            str = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36213FyR c36213FyR2 = (C36213FyR) it.next();
            String str2 = c36213FyR2.A01;
            if (str2.length() != 0) {
                String str3 = c36213FyR2.A02;
                if (str3.length() != 0) {
                    boolean equals = str2.equals(str);
                    FLO flo = new FLO(str3, new ViewOnClickListenerC35683FpI(10, c36213FyR2, c32404EPf));
                    flo.A00 = equals;
                    c32404EPf.A08(c32404EPf.A01, flo);
                }
            }
        }
    }

    public C32404EPf(Context context, CategorySearchFragment categorySearchFragment) {
        this.A00 = context;
        this.A02 = categorySearchFragment;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A03 = c31545DtV;
        ER4 er4 = new ER4(context, categorySearchFragment);
        this.A01 = er4;
        A0B(c31545DtV, er4);
    }
}
