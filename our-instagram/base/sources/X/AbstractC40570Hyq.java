package X;

import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.RangeIntf;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hyq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40570Hyq {
    public static Map A00(TextWithEntitiesIntf textWithEntitiesIntf) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList3 = null;
        if (textWithEntitiesIntf.ApN() != null) {
            List<ColorAtTextRangeDictIntf> ApN = textWithEntitiesIntf.ApN();
            if (ApN != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (ColorAtTextRangeDictIntf colorAtTextRangeDictIntf : ApN) {
                    if (colorAtTextRangeDictIntf != null) {
                        arrayList2.add(colorAtTextRangeDictIntf.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put(AbstractC58317Pt9.A00(94), arrayList2);
        }
        if (textWithEntitiesIntf.BHs() != null) {
            List<InlineStyleAtRangeDictIntf> BHs = textWithEntitiesIntf.BHs();
            if (BHs != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InlineStyleAtRangeDictIntf inlineStyleAtRangeDictIntf : BHs) {
                    if (inlineStyleAtRangeDictIntf != null) {
                        arrayList.add(inlineStyleAtRangeDictIntf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC58317Pt9.A00(111), arrayList);
        }
        if (textWithEntitiesIntf.BNM() != null) {
            LinkAction BNM = textWithEntitiesIntf.BNM();
            if (BNM != null) {
                str = BNM.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC58317Pt9.A00(115), str);
        }
        if (textWithEntitiesIntf.Bk5() != null) {
            List<RangeIntf> Bk5 = textWithEntitiesIntf.Bk5();
            if (Bk5 != null) {
                arrayList3 = AbstractC166987dD.A1E();
                for (RangeIntf rangeIntf : Bk5) {
                    if (rangeIntf != null) {
                        arrayList3.add(rangeIntf.F7o());
                    }
                }
            }
            A1I.put("ranges", arrayList3);
        }
        if (textWithEntitiesIntf.getText() != null) {
            AbstractC37300Gc1.A15(textWithEntitiesIntf.getText(), A1I);
        }
        if (textWithEntitiesIntf.C8e() != null) {
            A1I.put("timestamp", textWithEntitiesIntf.C8e());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
