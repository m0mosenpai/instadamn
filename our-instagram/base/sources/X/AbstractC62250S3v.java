package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;
import java.util.List;

/* renamed from: X.S3v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62250S3v {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        String A0s = AbstractC31173DnH.A0s(list, 1);
        InterfaceC103384lE A00 = C1344465q.A00(c6fw.A00());
        InterfaceC103384lE A002 = C1344465q.A00(c6fw.A03(3));
        try {
            FragmentActivity A04 = C6BQ.A04(c6fq);
            if (obj != null) {
                String obj2 = AbstractC31174DnI.A0B(AbstractC31175DnJ.A04((String) obj), AbstractC31581Du9.A00(), A0s).toString();
                Intent A08 = MSW.A08(A04, IGShopPayCustomTabsActivity.class);
                A08.putExtra("extra_url", obj2);
                C6BQ.A0K(c6fq, new C60929Rbj(1, A002, A00, c6fq));
                C12260kU.A06(C6BQ.A01(c6fq), A08, 1);
                return null;
            }
            throw AbstractC166987dD.A15(String.valueOf("Cannot parse a null url"));
        } catch (IllegalArgumentException | NullPointerException unused) {
            C6BQ.A0E(c6fq, C1344465q.A00(c6fw.A03(4)), new Object[0]);
            return null;
        }
    }
}
