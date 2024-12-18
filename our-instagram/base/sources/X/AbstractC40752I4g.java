package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I4g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40752I4g {
    public static Map A00(InterfaceC38621qt interfaceC38621qt) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38621qt.AYk() != null) {
            A1I.put("action_type", interfaceC38621qt.AYk());
        }
        ArrayList arrayList2 = null;
        if (interfaceC38621qt.AZF() != null) {
            List AZF = interfaceC38621qt.AZF();
            if (AZF != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = AZF.iterator();
                while (it.hasNext()) {
                    String url = ((ImageUrl) it.next()).getUrl();
                    if (url != null) {
                        arrayList.add(url);
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("ad_images", arrayList);
        }
        if (interfaceC38621qt.Ahe() != null) {
            A1I.put("bottomsheet_variant", interfaceC38621qt.Ahe());
        }
        if (interfaceC38621qt.Aip() != null) {
            A1I.put("business_name", interfaceC38621qt.Aip());
        }
        if (interfaceC38621qt.Aj7() != null) {
            A1I.put("button_text", interfaceC38621qt.Aj7());
        }
        if (interfaceC38621qt.Atc() != null) {
            A1I.put("cta_destination", interfaceC38621qt.Atc());
        }
        if (interfaceC38621qt.AyQ() != null) {
            A1I.put("dismiss_text", interfaceC38621qt.AyQ());
        }
        if (interfaceC38621qt.B3q() != null) {
            A1I.put("extra_data_token", interfaceC38621qt.B3q());
        }
        if (interfaceC38621qt.B3t() != null) {
            A1I.put("extra_logging_info", interfaceC38621qt.B3t());
        }
        if (interfaceC38621qt.BA3() != null) {
            A1I.put("global_position", interfaceC38621qt.BA3());
        }
        if (interfaceC38621qt.BBS() != null) {
            A1I.put("has_dismiss", interfaceC38621qt.BBS());
        }
        if (interfaceC38621qt.BEx() != null) {
            ImageUrl BEx = interfaceC38621qt.BEx();
            if (BEx != null) {
                str = BEx.getUrl();
            } else {
                str = null;
            }
            A1I.put("icon_url", str);
        }
        if (interfaceC38621qt.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC38621qt.getId(), A1I);
        }
        if (interfaceC38621qt.BJz() != null) {
            InterfaceC39571se BJz = interfaceC38621qt.BJz();
            if (BJz != null) {
                treeUpdaterJNI = BJz.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("item_client_gap_rules", treeUpdaterJNI);
        }
        if (interfaceC38621qt.BSZ() != null) {
            A1I.put("merchant_id", interfaceC38621qt.BSZ());
        }
        if (interfaceC38621qt.getMessage() != null) {
            A1I.put(DialogModule.KEY_MESSAGE, interfaceC38621qt.getMessage());
        }
        if (interfaceC38621qt.BWf() != null) {
            A1I.put("netego_variant", interfaceC38621qt.BWf());
        }
        if (interfaceC38621qt.getProductId() != null) {
            A1I.put("product_id", interfaceC38621qt.getProductId());
        }
        if (interfaceC38621qt.BkL() != null) {
            A1I.put(AbstractC111324zv.A00(511), interfaceC38621qt.BkL());
        }
        if (interfaceC38621qt.BkN() != null) {
            A1I.put("rating_and_review_type", interfaceC38621qt.BkN());
        }
        if (interfaceC38621qt.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC38621qt.getTitle(), A1I);
        }
        if (interfaceC38621qt.C9d() != null) {
            List C9d = interfaceC38621qt.C9d();
            if (C9d != null) {
                arrayList2 = AbstractC166987dD.A1E();
                Iterator it2 = C9d.iterator();
                while (it2.hasNext()) {
                    String url2 = ((ImageUrl) it2.next()).getUrl();
                    if (url2 != null) {
                        arrayList2.add(url2);
                    }
                }
            }
            A1I.put("topic_images", arrayList2);
        }
        if (interfaceC38621qt.CAR() != null) {
            A1I.put("tracking_token", interfaceC38621qt.CAR());
        }
        if (interfaceC38621qt.CFs() != null) {
            A1I.put("view_state_item_type", interfaceC38621qt.CFs());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
