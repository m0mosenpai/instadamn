package X;

import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49112Nh {
    public final boolean A00(CallerContext callerContext, String str) {
        C40921uz c40921uz = ((C2Ne) this).A00;
        C41061vE c41061vE = c40921uz.A07;
        String str2 = callerContext.A02;
        C14360o3.A07(str2);
        c41061vE.A01(str, str2);
        c40921uz.A07();
        c40921uz.A08();
        c40921uz.A09();
        c40921uz.A0H(str, c40921uz.A06());
        Map A06 = c40921uz.A06();
        boolean A02 = AbstractC41611wB.A02(c40921uz.A06);
        boolean A0C = c40921uz.A0C();
        c41061vE.A06(str, A06, c40921uz.A0F(), c40921uz.A0D(), A02, A0C);
        List list = c40921uz.A01.A02;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((FxCalAccount) it.next()).A04.equalsIgnoreCase("FACEBOOK")) {
                return true;
            }
        }
        return false;
    }
}
