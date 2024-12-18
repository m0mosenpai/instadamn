package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HwB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40420HwB {
    public static Map A00(InterfaceC38711r3 interfaceC38711r3) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38711r3.Atb() != null) {
            A1I.put("cta_dest", interfaceC38711r3.Atb());
        }
        if (interfaceC38711r3.getCtaText() != null) {
            A1I.put("cta_text", interfaceC38711r3.getCtaText());
        }
        if (interfaceC38711r3.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC38711r3.getId(), A1I);
        }
        List BQh = interfaceC38711r3.BQh();
        if (BQh != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BQh);
            Iterator it = BQh.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it);
            }
            A1I.put("media_dicts", A0q);
        }
        if (interfaceC38711r3.BWb() != null) {
            A1I.put("netego_title", interfaceC38711r3.BWb());
        }
        if (interfaceC38711r3.Bjj() != null) {
            A1I.put("quick_promotion_id", interfaceC38711r3.Bjj());
        }
        if (interfaceC38711r3.C96() != null) {
            A1I.put("toast_text", interfaceC38711r3.C96());
        }
        if (interfaceC38711r3.CAR() != null) {
            A1I.put("tracking_token", interfaceC38711r3.CAR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
