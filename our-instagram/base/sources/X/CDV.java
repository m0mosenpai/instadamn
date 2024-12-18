package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDV {
    public static Map A00(InterfaceC128105qe interfaceC128105qe) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC128105qe.BAH();
        A1I.put("graduation_year", Integer.valueOf(interfaceC128105qe.BAH()));
        if (interfaceC128105qe.Bqd() != null) {
            A1I.put("school_name", interfaceC128105qe.Bqd());
        }
        if (interfaceC128105qe.Bqe() != null) {
            A1I.put("school_name_abbreviation", interfaceC128105qe.Bqe());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
