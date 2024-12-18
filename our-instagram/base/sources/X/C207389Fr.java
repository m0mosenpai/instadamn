package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9Fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207389Fr extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207389Fr(String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 2:
                List A0R = AbstractC001900j.A0R(this.A01, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                ArrayList<List> arrayList = new ArrayList(AbstractC06950Ym.A1E(A0R, 10));
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC001900j.A0R(AbstractC001900j.A0B((String) it.next()).toString(), new String[]{"=>"}, 0));
                }
                int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                for (List list : arrayList) {
                    linkedHashMap.put(AbstractC001900j.A0B((String) list.get(0)).toString(), Long.valueOf(Long.parseLong((String) list.get(1))));
                }
                return linkedHashMap;
            case 3:
                List A0R2 = AbstractC001900j.A0R(this.A01, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                ArrayList<List> arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0R2, 10));
                Iterator it2 = A0R2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC001900j.A0R(AbstractC001900j.A0B((String) it2.next()).toString(), new String[]{"=>"}, 0));
                }
                int A0L2 = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList2, 10));
                if (A0L2 < 16) {
                    A0L2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L2);
                for (List list2 : arrayList2) {
                    linkedHashMap2.put(Integer.valueOf(Integer.parseInt(AbstractC001900j.A0B((String) list2.get(0)).toString())), Long.valueOf(Long.parseLong(AbstractC001900j.A0B((String) list2.get(1)).toString())));
                }
                return linkedHashMap2;
            default:
                return this.A01;
        }
    }
}
