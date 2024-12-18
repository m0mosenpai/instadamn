package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SQm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62770SQm {
    public static final String A00(SYH syh) {
        AutofillData autofillData;
        List list = null;
        if (syh != null && (autofillData = syh.A00) != null) {
            list = AbstractC166987dD.A1J(autofillData);
        }
        java.util.Set A01 = A01(list);
        if (syh != null && syh.A01 != null) {
            return AbstractC61723Rse.A00(AnonymousClass090.A00(C63269SgT.A0C, A01));
        }
        return AbstractC61723Rse.A00(A01);
    }

    public static final java.util.Set A01(List list) {
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass016.A16(AbstractC58320PtC.A1C(it.next()), A1E);
            }
            return AbstractC001800i.A0k(A1E);
        }
        return C16910sj.A00;
    }
}
