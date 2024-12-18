package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.EyZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33933EyZ {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String obj = c6fw.A01().toString();
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A04 instanceof BusinessConversionActivity) {
            Intent A042 = AbstractC31171DnF.A04();
            A042.putExtra("EXTRA_SCREEN_ID", obj);
            AbstractC31180DnO.A0y(A04, A042);
            return null;
        }
        AbstractC10360h2 A05 = C6BQ.A05(c6fq);
        if (A05 == null) {
            return null;
        }
        A05.A0x(obj, 1);
        return null;
    }
}
