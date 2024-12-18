package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hle, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39830Hle {
    public static Map A00(InterfaceC43505JJr interfaceC43505JJr) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43505JJr.CFe() != null) {
            List CFe = interfaceC43505JJr.CFe();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = CFe.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1W(A1E, it);
            }
            A1I.put("video_versions", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
