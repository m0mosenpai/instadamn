package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;

/* renamed from: X.EwS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33802EwS {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        if (c6fw.A00.size() >= 1) {
            Object A03 = c6fw.A03(0);
            AbstractC25225BEi.A1S(A03);
            String str = (String) A03;
            C14360o3.A0B(str, 0);
            String replace = str.replace('_', '-');
            C14360o3.A07(replace);
            if (!TextUtils.isEmpty(replace)) {
                Iterator it = AbstractC35114FeG.A01.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C32110E9i c32110E9i = (C32110E9i) it.next();
                    if (c32110E9i.A02.equals(replace)) {
                        AbstractC35114FeG.A01(C1LZ.A00().A00, c32110E9i);
                        break;
                    }
                }
            }
            FragmentActivity A04 = C6BQ.A04(c6fq);
            Intent A042 = AbstractC31171DnF.A04();
            A042.setClassName(A04, "com.instagram.nux.activity.BloksSignedOutFragmentActivity");
            A042.setFlags(67108864);
            C12260kU.A0C(A04, A042);
        }
        return null;
    }
}
