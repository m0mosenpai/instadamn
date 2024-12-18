package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class SZB {
    public String A01;
    public String A02;
    public String A03;
    public final String A04;
    public Integer A00 = null;
    public final java.util.Set A05 = AbstractC166987dD.A1H();
    public final java.util.Set A07 = AbstractC166987dD.A1H();
    public final java.util.Set A06 = AbstractC166987dD.A1H();

    public final String toString() {
        ArrayList A1F = AbstractC166987dD.A1F(this.A07);
        ArrayList A1F2 = AbstractC166987dD.A1F(this.A05);
        Collections.sort(A1F);
        Collections.sort(A1F2);
        return TextUtils.join(";", new String[]{this.A04, this.A01, this.A02, this.A03, TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1F), TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1F2)});
    }

    public SZB(String str) {
        this.A04 = str;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.SAv] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.SAw] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.SIx, java.lang.Object] */
    public static ArrayList A00(List list) {
        String str;
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SZB szb = (SZB) it.next();
            java.util.Set set = szb.A07;
            ArrayList A17 = AbstractC25225BEi.A17(set.size());
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it2);
                ?? obj = new Object();
                obj.A00 = A1B;
                A17.add(obj);
            }
            java.util.Set set2 = szb.A05;
            ArrayList A172 = AbstractC25225BEi.A17(set2.size());
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                String A1B2 = AbstractC166987dD.A1B(it3);
                ?? obj2 = new Object();
                obj2.A00 = A1B2;
                A172.add(obj2);
            }
            String A00 = STN.A00(szb.toString());
            A00.getClass();
            ?? obj3 = new Object();
            obj3.A04 = szb.A04;
            Integer num = szb.A00;
            if (num == null) {
                str = null;
            } else {
                switch (num.intValue()) {
                    case 1:
                        str = "REMOVE";
                        break;
                    case 2:
                        str = "UPDATE";
                        break;
                    default:
                        str = "ADD";
                        break;
                }
            }
            obj3.A03 = str;
            obj3.A00 = szb.A02;
            obj3.A01 = szb.A03;
            obj3.A06 = A17;
            obj3.A05 = A172;
            obj3.A02 = A00;
            A0q.add(obj3);
        }
        return A0q;
    }
}
