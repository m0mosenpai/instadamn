package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HuY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40328HuY {
    public static Map A00(JMC jmc) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmc.getId() != null) {
            AbstractC37300Gc1.A12(jmc.getId(), A1I);
        }
        if (jmc.BSS() != null) {
            List BSS = jmc.BSS();
            ArrayList A0q = AbstractC167017dG.A0q(BSS);
            Iterator it = BSS.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("mentioned_users", A0q);
        }
        if (jmc.C0g() != null) {
            A1I.put("sticker_style", jmc.C0g());
        }
        if (jmc.getText() != null) {
            AbstractC37300Gc1.A15(jmc.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
