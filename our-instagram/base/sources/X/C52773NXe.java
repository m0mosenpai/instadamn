package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.NXe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52773NXe extends AbstractC53625NnW {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C51138Mih A04;
    public Integer A05;
    public final UserSession A08;
    public final ReelMoreOptionsFragment A0A;
    public final String A0B;
    public List A06 = Collections.emptyList();
    public final O4G A09 = new O4G();
    public final C1P1 A07 = new C50689MZh(this, 22);

    public static void A00(C52773NXe c52773NXe) {
        C51138Mih c51138Mih = c52773NXe.A04;
        if (!c51138Mih.A01.isEmpty()) {
            String str = ((O7A) c51138Mih.A01.get(c51138Mih.A00)).A01;
            ReelMoreOptionsFragment reelMoreOptionsFragment = c52773NXe.A0A;
            C183938Du c183938Du = new C183938Du(reelMoreOptionsFragment.A03);
            c183938Du.A0A = str;
            reelMoreOptionsFragment.A03 = c183938Du.A01();
            ReelMoreOptionsFragment.A0A(reelMoreOptionsFragment);
        }
    }

    public static void A01(C52773NXe c52773NXe, Integer num, boolean z) {
        Boolean bool;
        c52773NXe.A05 = num;
        ReelMoreOptionsFragment reelMoreOptionsFragment = c52773NXe.A0A;
        Integer num2 = C05F.A0N;
        if (num2.equals(reelMoreOptionsFragment.A0C) && ((bool = reelMoreOptionsFragment.A0B) == null || z != bool.booleanValue())) {
            reelMoreOptionsFragment.A0B = Boolean.valueOf(z);
            GHX ghx = reelMoreOptionsFragment.A08;
            ghx.getClass();
            ReelMoreOptionsFragment.A02(reelMoreOptionsFragment.A0Z, reelMoreOptionsFragment.A0Y, ghx, reelMoreOptionsFragment, true);
            if (!reelMoreOptionsFragment.getScrollingViewProxy().CXX() && reelMoreOptionsFragment.getRecyclerView().A1D()) {
                reelMoreOptionsFragment.getRecyclerView().post(new PPB(reelMoreOptionsFragment));
            } else {
                ReelMoreOptionsFragment.A0B(reelMoreOptionsFragment, num2);
            }
        }
        boolean equals = C05F.A00.equals(num);
        int i = 0;
        View view = c52773NXe.A02;
        if (equals) {
            view.setVisibility(0);
            c52773NXe.A03.setVisibility(8);
            c52773NXe.A01.setVisibility(8);
            c52773NXe.A00.setVisibility(8);
            return;
        }
        view.setVisibility(8);
        c52773NXe.A03.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        View view2 = c52773NXe.A01;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        view2.setVisibility(i2);
        View view3 = c52773NXe.A00;
        if (z) {
            i = 8;
        }
        view3.setVisibility(i);
    }

    public C52773NXe(UserSession userSession, ReelMoreOptionsFragment reelMoreOptionsFragment, String str) {
        this.A08 = userSession;
        this.A0B = str;
        this.A0A = reelMoreOptionsFragment;
    }
}
