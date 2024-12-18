package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HoG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39978HoG {
    public static Map A00(InterfaceC43534JKu interfaceC43534JKu) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (interfaceC43534JKu.AyC() != null) {
            List<InterfaceC43535JKv> AyC = interfaceC43534JKu.AyC();
            if (AyC != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43535JKv interfaceC43535JKv : AyC) {
                    if (interfaceC43535JKv != null) {
                        arrayList.add(interfaceC43535JKv.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("disclaimerBodyRanges", arrayList);
        }
        if (interfaceC43534JKu.AyE() != null) {
            A1I.put("disclaimerText", interfaceC43534JKu.AyE());
        }
        if (interfaceC43534JKu.B14() != null) {
            IGPostClickEligibleExperienceTypes B14 = interfaceC43534JKu.B14();
            if (B14 != null) {
                str = B14.A00;
            }
            A1I.put("eligibleExperienceType", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
