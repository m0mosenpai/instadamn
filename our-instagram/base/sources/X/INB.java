package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class INB {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public final FragmentActivity A08;
    public final UserSession A09;
    public final String A0A;

    public final void A00() {
        long seconds = TimeUnit.MINUTES.toSeconds(10L);
        C12L c12l = C12L.A00;
        FragmentActivity fragmentActivity = this.A08;
        IJV ijv = new IJV(fragmentActivity);
        String str = this.A0A;
        Map map = ijv.A05;
        map.put(AbstractC111324zv.A00(209), str);
        ijv.A02.set(0);
        map.put("ad_id", this.A00);
        map.put("first_entry_point", this.A01);
        AbstractC37300Gc1.A18(this.A02, map);
        List list = this.A07;
        if (list != null && !list.isEmpty()) {
            map.put("pinned_product_ids", list);
        }
        map.put("prior_module", this.A03);
        map.put("shopping_session_id", this.A04);
        map.put("tracking_token", this.A06);
        map.put("layout_format", "MOBILE");
        AbstractC23641Du.A05(c12l.CPG(1759633843, 3), new C43164J6c(ijv, this, null, 3, seconds), C07Y.A00(fragmentActivity));
    }

    public final void A01(String str) {
        if (str != null) {
            this.A07 = AbstractC001900j.A0Q(str, new char[]{','}, 0);
        }
    }

    public INB(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A08 = fragmentActivity;
        this.A09 = userSession;
        this.A0A = str;
    }
}
