package X;

import android.app.Activity;
import android.content.Context;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ewj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33819Ewj {
    public static final LinkedHashMap A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        String str;
        AbstractCollection abstractCollection = (AbstractCollection) c6fw.A01();
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Map map = FEP.A00;
            Context context = c6fg.A00;
            C14360o3.A0B(abstractCollection, 1);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            boolean z = context instanceof Activity;
            Iterator A13 = AbstractC166997dE.A13(abstractCollection);
            if (!z) {
                while (A13.hasNext()) {
                    A1I.put(AbstractC166997dE.A0l(A13), "UNKNOWN");
                }
            } else {
                while (A13.hasNext()) {
                    Object A0l = AbstractC166997dE.A0l(A13);
                    Activity activity = (Activity) context;
                    String A1A = AbstractC166987dD.A1A(A0l, FEP.A00);
                    if (A1A == null) {
                        num = C05F.A0N;
                    } else if (activity.checkSelfPermission(A1A) == 0) {
                        num = C05F.A00;
                    } else if (!(!AbstractC31171DnF.A0Q().A05(A1A)) && !activity.shouldShowRequestPermissionRationale(A1A)) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A01;
                    }
                    switch (num.intValue()) {
                        case 0:
                            str = "GRANTED";
                            break;
                        case 1:
                            str = "DENIED";
                            break;
                        case 2:
                            str = "PERMANENTLY_DENIED";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    A1I.put(A0l, str);
                }
            }
            return A1I;
        }
        throw AbstractC166997dE.A0g();
    }
}
