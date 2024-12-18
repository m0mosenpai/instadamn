package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HoQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39985HoQ {
    public static Map A00(InterfaceC108024tl interfaceC108024tl) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC108024tl.Aqc() != null) {
            List<JLQ> Aqc = interfaceC108024tl.Aqc();
            ArrayList arrayList = null;
            if (Aqc != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JLQ jlq : Aqc) {
                    if (jlq != null) {
                        arrayList.add(jlq.F7o());
                    }
                }
            }
            A1I.put(AbstractC111324zv.A00(4172), arrayList);
        }
        if (interfaceC108024tl.getCtaText() != null) {
            A1I.put("cta_text", interfaceC108024tl.getCtaText());
        }
        if (interfaceC108024tl.B0C() != null) {
            A1I.put("early_form_submission_eligible", interfaceC108024tl.B0C());
        }
        if (interfaceC108024tl.BKx() != null) {
            A1I.put("label", interfaceC108024tl.BKx());
        }
        if (interfaceC108024tl.BZN() != null) {
            A1I.put("options", interfaceC108024tl.BZN());
        }
        if (interfaceC108024tl.Bjg() != null) {
            A1I.put("question_type", interfaceC108024tl.Bjg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
