package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public abstract class XNW {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, C37905Gm2 c37905Gm2, String str) {
        Long l;
        ArrayList arrayList;
        ArrayList arrayList2;
        Double d;
        Double d2;
        Long l2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_media_tap");
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            String str2 = "";
            if (A0R == null) {
                A0R = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R);
            AbstractC37301Gc2.A0y(A0f, AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A5c, A01)));
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A9R, A01);
            if (A0R2 != null) {
                str2 = A0R2;
            }
            AbstractC72047XLn.A1V(A0f, A01, "tracking_token", str2);
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            A0f.A7v("is_ad", true);
            AbstractC72047XLn.A0W(A0f, A01);
            String A0R3 = AbstractC37300Gc1.A0R(C5I8.A5g, A01);
            Long l3 = null;
            if (A0R3 != null) {
                l = C4SX.A00(A0R3).A00;
            } else {
                l = null;
            }
            A0f.A9K("merchant_id", l);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    C14360o3.A0B(str3, 0);
                    Long A0k = AbstractC003100w.A0k(10, str3);
                    if (A0k != null) {
                        A1E.add(A0k);
                    }
                }
                arrayList = AbstractC001800i.A0U(A1E);
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            AbstractC72047XLn.A1R(A0f, A01, C05F.A0j);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                arrayList2 = AbstractC167017dG.A0q(A0e);
                Iterator it2 = A0e.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C4SX.A00((String) it2.next()).A00);
                }
            } else {
                arrayList2 = null;
            }
            A0f.AAk("tagged_user_ids", arrayList2);
            AbstractC72047XLn.A0M(A0f, A01);
            if (c37905Gm2 != null) {
                d = Double.valueOf(c37905Gm2.A04);
            } else {
                d = null;
            }
            A0f.A8I("tap_x_position", d);
            if (c37905Gm2 != null) {
                d2 = Double.valueOf(c37905Gm2.A05);
            } else {
                d2 = null;
            }
            A0f.A8I("tap_y_position", d2);
            if (c37905Gm2 != null) {
                l2 = AbstractC31171DnF.A0V(c37905Gm2.A06);
            } else {
                l2 = null;
            }
            A0f.A9K("media_width", l2);
            if (c37905Gm2 != null) {
                l3 = AbstractC31171DnF.A0V(c37905Gm2.A07);
            }
            A0f.A9K("media_height", l3);
            if (str != null) {
                A0f.AAP("destination", str);
            }
            Boolean A0S = AbstractC72046XLm.A0S(C5I8.A4v, A01);
            if (A0S != null) {
                A0f.A7v("tap_to_reels_chain_enabled", A0S);
            }
            A0f.AAP("interactivity_type", "single_tap");
            A0f.Cht();
        }
    }
}
