package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40266HtW {
    public static Map A00(JMM jmm) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmm.AcD() != null) {
            A1I.put(AbstractC43591JPw.A00(66), jmm.AcD());
        }
        if (jmm.AcG() != null) {
            A1I.put(AbstractC43591JPw.A00(67), jmm.AcG());
        }
        if (jmm.getContentUrl() != null) {
            A1I.put("content_url", jmm.getContentUrl());
        }
        if (jmm.getId() != null) {
            AbstractC37300Gc1.A12(jmm.getId(), A1I);
        }
        if (jmm.BNL() != null) {
            A1I.put("link", jmm.BNL());
        }
        if (jmm.getName() != null) {
            AbstractC37300Gc1.A14(jmm.getName(), A1I);
        }
        if (jmm.Bfx() != null) {
            A1I.put(AbstractC111324zv.A00(255), jmm.Bfx());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
