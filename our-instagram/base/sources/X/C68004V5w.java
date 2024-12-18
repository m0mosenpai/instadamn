package X;

import android.content.Context;
import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import java.util.Collections;
import java.util.List;

/* renamed from: X.V5w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68004V5w extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C68004V5w(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        String str;
        if (this.A00 != 0) {
            C68819Vca c68819Vca = (C68819Vca) this.A01;
            Reel reel = (Reel) this.A03;
            C70997WmD c70997WmD = (C70997WmD) this.A02;
            C3G2 c3g2 = C3G2.A1K;
            List singletonList = Collections.singletonList(reel);
            V7m v7m = c68819Vca.A00;
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C38E c38e = v7m.A05;
            c38e.A0C = v7m.A06;
            c38e.A05 = new C31559Dtj(((V8M) v7m).A00.getActivity(), c70997WmD.A07, (InterfaceC63982vJ) null);
            c38e.A06(reel, c3g2, c70997WmD, singletonList, singletonList, singletonList);
            V1B v1b = v7m.A04.A00;
            WDE wde = v1b.A0C;
            String str2 = v1b.A0I;
            Venue venue = v1b.A0G;
            if (venue != null) {
                str = venue.A04();
            } else {
                str = null;
            }
            wde.A02(null, null, "location_page", "tap_reel", null, str2, str, reel.getId(), null);
            return true;
        }
        C69159Vio c69159Vio = (C69159Vio) this.A03;
        boolean z = !c69159Vio.A00;
        c69159Vio.A00 = z;
        C69222Vjp c69222Vjp = (C69222Vjp) this.A01;
        View view2 = c69222Vjp.A01;
        view2.setSelected(z);
        W98 w98 = ((C68739VbI) this.A02).A00;
        W98.A01(w98);
        w98.A02.A00(AbstractC69981Vyz.A00(w98.A04));
        boolean z2 = c69159Vio.A00;
        Context context = c69222Vjp.A00;
        int i2 = 2131970042;
        if (z2) {
            i2 = 2131970038;
        }
        AbstractC37302Gc3.A0o(context, view2, c69159Vio.A01, i2);
        return true;
    }
}
