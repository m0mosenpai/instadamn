package X;

import android.view.ViewGroup;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import java.util.HashMap;

/* renamed from: X.HDb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38949HDb extends AbstractC193088go {
    public final int A00;
    public final Object A01;

    public C38949HDb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C1338462s c1338462s = (C1338462s) obj;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c1338462s, 0);
                RecentAdActivityFragment recentAdActivityFragment = ((IEA) this.A01).A00.A00;
                recentAdActivityFragment.A02 = c1338462s;
                HEK hek = recentAdActivityFragment.A00;
                if (hek == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                hek.A0C();
                return;
            case 1:
                HashMap A1G = AbstractC166987dD.A1G();
                HDM hdm = (HDM) this.A01;
                A1G.put("abc", hdm.A03);
                C126545np c126545np = new C126545np(hdm.requireContext());
                c126545np.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                hdm.A00.addView(c126545np);
                C6T8 A00 = C6T7.A00(hdm.requireContext(), c1338462s, hdm.A01);
                A00.A01 = A1G;
                C6T7 A002 = A00.A00();
                hdm.A02 = A002;
                A002.A07(c126545np);
                return;
            case 2:
                C14360o3.A0B(c1338462s, 0);
                HH8 hh8 = ((HH0) this.A01).A03.A00;
                hh8.A00 = c1338462s;
                hh8.A01.D9J(c1338462s);
                return;
            case 3:
                C14360o3.A0B(c1338462s, 0);
                C39049HGz c39049HGz = ((HH2) this.A01).A03.A00;
                c39049HGz.A00 = c1338462s;
                c39049HGz.A02.DWH(c1338462s);
                return;
            default:
                C14360o3.A0B(c1338462s, 0);
                ((HHA) this.A01).A00.Czo(c1338462s);
                return;
        }
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
    }
}
