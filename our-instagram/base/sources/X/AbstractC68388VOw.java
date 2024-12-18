package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DayOfTheWeek;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VOw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68388VOw {
    public static Map A00(XG6 xg6) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xg6.Avr() != null) {
            List<DayOfTheWeek> Avr = xg6.Avr();
            if (Avr != null) {
                arrayList = AbstractC167017dG.A0q(Avr);
                for (DayOfTheWeek dayOfTheWeek : Avr) {
                    C14360o3.A0B(dayOfTheWeek, 0);
                    arrayList.add(dayOfTheWeek.A00);
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("days", arrayList);
        }
        if (xg6.B23() != null) {
            linkedHashMap.put("end_time", xg6.B23());
        }
        if (xg6.BKx() != null) {
            linkedHashMap.put("label", xg6.BKx());
        }
        if (xg6.Bzj() != null) {
            linkedHashMap.put(TraceFieldType.StartTime, xg6.Bzj());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
