package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes9.dex */
public final class OJQ {
    public final C54585O9m A00;
    public final String A01;
    public final C8NS A02;
    public final OR5 A03;
    public final java.util.Set A04;
    public final boolean A05;

    public final C55070OaQ A00(C58647PzK c58647PzK, OLV olv, U7W u7w, C66036TyY c66036TyY, String str) {
        C69439VnO c69439VnO;
        AbstractC25233BEq.A0w(2, str, c58647PzK, u7w);
        C54585O9m c54585O9m = this.A00;
        C55097Ob8 c55097Ob8 = new C55097Ob8(olv, c54585O9m.A00, c54585O9m.A01, c54585O9m.A02);
        ThreadPoolExecutor A02 = c58647PzK.A02(C05F.A07, null);
        if (this.A05) {
            c69439VnO = new C69439VnO(olv, c55097Ob8, str, A02);
        } else {
            c69439VnO = null;
        }
        return new C55070OaQ(this.A02, this.A03, olv, c55097Ob8, c69439VnO, u7w, c66036TyY, str, this.A04, A02);
    }

    public OJQ(C8NS c8ns, OR5 or5, File file, String str, String str2, Map map, boolean z) {
        Object A1D;
        AbstractC167017dG.A1Q(file, str2);
        C14360o3.A0B(or5, 6);
        this.A01 = str2;
        this.A02 = c8ns;
        this.A03 = or5;
        this.A05 = z;
        this.A00 = new C54585O9m(file, str2, map);
        try {
            List A0R = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                Long A0j = AbstractC166997dE.A0j(AbstractC25228BEl.A1A(AbstractC166987dD.A1B(it)));
                if (A0j != null) {
                    A1E.add(A0j);
                }
            }
            A1D = (Long[]) A1E.toArray(new Long[0]);
            if (A1D == null) {
                A1D = new Long[0];
            }
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Long[] lArr = (Long[]) (A1D instanceof C09540e5 ? null : A1D);
        lArr = lArr == null ? new Long[0] : lArr;
        HashSet hashSet = new HashSet(AbstractC16850sd.A0L(lArr.length));
        AbstractC009903n.A0M(hashSet, lArr);
        this.A04 = hashSet;
    }
}
