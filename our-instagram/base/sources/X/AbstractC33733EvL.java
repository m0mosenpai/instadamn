package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EvL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33733EvL {
    public static Map A00(C43K c43k) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c43k.Avr() != null) {
            A1I.put("days", c43k.Avr());
        }
        if (c43k.B23() != null) {
            A1I.put("end_time", c43k.B23());
        }
        if (c43k.BKx() != null) {
            A1I.put("label", c43k.BKx());
        }
        if (c43k.Bzj() != null) {
            A1I.put(TraceFieldType.StartTime, c43k.Bzj());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
