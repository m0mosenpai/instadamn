package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V44 extends U7H {
    public final /* synthetic */ U79 A00;

    public V44(U79 u79) {
        this.A00 = u79;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        U79 u79 = this.A00;
        u79.A08.A02();
        FragmentActivity fragmentActivity = u79.A03;
        C14360o3.A0C(fragmentActivity, MSV.A00(11));
        String str = u79.A0A;
        Map map = u79.A0C;
        C14360o3.A0C(map, MSV.A00(21));
        AbstractC191798eb.A00(fragmentActivity, new C191778eZ(u79.A06), str, null, map, 0L).A9b(new C42220In6(u79, 2));
    }
}
