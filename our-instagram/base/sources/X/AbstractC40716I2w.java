package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I2w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40716I2w {
    public static Map A00(JMP jmp) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmp.AZD() != null) {
            A1I.put("ad_id", jmp.AZD());
        }
        if (jmp.Alz() != null) {
            A1I.put("card_modifier_label", jmp.Alz());
        }
        if (jmp.AtX() != null) {
            A1I.put("cta", jmp.AtX().F7o());
        }
        if (jmp.BTe() != null) {
            A1I.put("micro_product", jmp.BTe().F7o());
        }
        if (jmp.Bgv() != null) {
            A1I.put("product_context", jmp.Bgv());
        }
        if (jmp.Buf() != null) {
            List<JLU> Buf = jmp.Buf();
            ArrayList arrayList = null;
            if (Buf != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JLU jlu : Buf) {
                    if (jlu != null) {
                        arrayList.add(jlu.F7o());
                    }
                }
            }
            A1I.put("shoppable_media", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
