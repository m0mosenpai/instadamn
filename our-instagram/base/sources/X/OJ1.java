package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJ1 {
    public final Context A00;
    public final SparseArray A01;
    public final C54823OLg A02;
    public final OHG A03;

    public /* synthetic */ OJ1(Context context, UserSession userSession) {
        OHG ohg = new OHG(userSession);
        C54823OLg c54823OLg = new C54823OLg(userSession);
        this.A00 = context;
        this.A03 = ohg;
        this.A02 = c54823OLg;
        this.A01 = C8M6.A00(userSession);
    }

    public final C88X A00(Integer num) {
        if (num == null) {
            C88X c88x = C88X.A0T;
            C14360o3.A08(c88x);
            return c88x;
        }
        SparseArray sparseArray = this.A01;
        int intValue = num.intValue();
        return new C88X(new C189128Zd(this.A00.getDrawable(((C8M7) sparseArray.get(intValue)).A01), null, C88Z.A0J, null, null, null, ((C8M7) sparseArray.get(intValue)).A04, num.toString()));
    }
}
