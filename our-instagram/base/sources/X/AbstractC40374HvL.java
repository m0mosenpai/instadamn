package X;

import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HvL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40374HvL {
    public static Map A00(JMZ jmz) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (jmz.Ac6() != null) {
            List<InterfaceC43563JLx> Ac6 = jmz.Ac6();
            if (Ac6 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43563JLx interfaceC43563JLx : Ac6) {
                    if (interfaceC43563JLx != null) {
                        arrayList.add(interfaceC43563JLx.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("answers", arrayList);
        }
        if (jmz.AyE() != null) {
            A1I.put("disclaimer_text", jmz.AyE());
        }
        if (jmz.getId() != null) {
            AbstractC37300Gc1.A12(jmz.getId(), A1I);
        }
        if (jmz.BX4() != null) {
            A1I.put("next_question_id_on_skip", jmz.BX4());
        }
        if (jmz.Bdb() != null) {
            A1I.put("placeholder", jmz.Bdb());
        }
        if (jmz.C3K() != null) {
            A1I.put("submit_optional", jmz.C3K());
        }
        if (jmz.C3M() != null) {
            A1I.put("submit_text", jmz.C3M());
        }
        if (jmz.getTitle() != null) {
            AbstractC37300Gc1.A17(jmz.getTitle(), A1I);
        }
        if (jmz.CBV() != null) {
            INLINE_SURVEY_QUESTION_TYPES CBV = jmz.CBV();
            if (CBV != null) {
                str = CBV.A00;
            }
            AbstractC37300Gc1.A16(str, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
