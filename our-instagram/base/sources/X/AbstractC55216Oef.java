package X;

import android.graphics.PointF;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Oef, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55216Oef {
    public static final Pair A00(List list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (((MediaSuggestedProductTag) it.next()).A01 == EnumC53230NgS.A05) {
                    i++;
                } else {
                    i2++;
                }
            }
            return MSY.A0D(Integer.valueOf(i), i2);
        }
        return new Pair(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A09(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, List list) {
        AbstractCollection A1E;
        C14360o3.A0B(list, 4);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_suggested_tags_publish_post");
        HashMap A1G = AbstractC166987dD.A1G();
        if (!(list instanceof ArrayList) || (A1E = (AbstractCollection) list) == null) {
            A1E = AbstractC166987dD.A1E();
        }
        if (AbstractC25226BEj.A1b(A1E)) {
            A1G.put(A02(userSession.userId, str2), A1E);
        }
        JSONObject jSONObject = new JSONObject(AbstractC06930Yk.A0B(A1G));
        A0f.AAP("upload_key", A02(userSession.userId, str));
        MSY.A18(A0f, false);
        A0f.A9K("final_people_tags_count", 0L);
        A0f.A9K("final_product_tags_count", AbstractC31171DnF.A0V(list.size()));
        A0f.AAP("final_tagged_products", jSONObject.toString());
        AbstractC50522MSa.A1D(A0f, AbstractC50523MSb.A0T(A0f, userSession, str));
        A0f.AAP("media_format", "reels");
        A0f.Cht();
    }

    public static InterfaceC02590Ai A01(C18920wW c18920wW, UserSession userSession, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("upload_key", A02(userSession.userId, str2));
        return A00;
    }

    public static final String A02(String str, String str2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (str2 != null) {
            A1C.append(str);
            A1C.append('_');
            A1C.append(str2);
        }
        return AbstractC166987dD.A19(A1C);
    }

    public static final HashMap A03(List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductTag productTag = (ProductTag) it.next();
            String str = AbstractC38048Gob.A01(productTag.A02).A0H;
            PointF pointF = ((com.instagram.tagging.model.Tag) productTag).A00;
            StringBuilder A1C = AbstractC166987dD.A1C();
            if (pointF != null) {
                A1C.append(pointF.x);
                A1C.append(", ");
                A1C.append(pointF.y);
            }
            A1G.put(str, AbstractC166987dD.A19(A1C));
        }
        return A1G;
    }

    public static final HashMap A04(List list) {
        int i;
        int i2;
        HashMap A1G = AbstractC166987dD.A1G();
        int i3 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                EnumC53230NgS enumC53230NgS = ((MediaSuggestedProductTag) it.next()).A01;
                if (enumC53230NgS == EnumC53230NgS.A05) {
                    i3++;
                } else if (enumC53230NgS == EnumC53230NgS.A04) {
                    i++;
                } else {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        A1G.put("high_confidence_count", Integer.valueOf(i3));
        A1G.put("medium_confidence_count", Integer.valueOf(i));
        A1G.put("low_confidence_count", Integer.valueOf(i2));
        return A1G;
    }

    public static final void A05(PointF pointF, C51415MnN c51415MnN, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC53230NgS enumC53230NgS, Float f, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        Long l;
        AbstractC167027dH.A12(userSession, interfaceC11380iw, str);
        InterfaceC02590Ai A01 = A01(AbstractC12220kQ.A01(interfaceC11380iw, userSession), userSession, "ig_suggested_tags_tag_action", str);
        A01.AAP("tag_action_type", str2);
        AbstractC50522MSa.A1D(A01, AbstractC50523MSb.A0T(A01, userSession, str));
        A01.AAP("user_tag_type", str7);
        MSY.A18(A01, z);
        AbstractC25230BEn.A1C(A01, i);
        A01.AAP("tag_mode", enumC53230NgS.A00);
        A01.AAP("original_suggested_product_id", str3);
        A01.AAP("selected_product_id", str4);
        Double d = null;
        if (num != null) {
            l = AbstractC25229BEm.A0n(num);
        } else {
            l = null;
        }
        A01.A9K("selected_product_id_rank", l);
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (pointF != null) {
            A1C.append(pointF.x);
            A1C.append(", ");
            A1C.append(pointF.y);
        }
        A01.AAP("original_coordinates", AbstractC166987dD.A19(A1C));
        if (f != null) {
            d = Double.valueOf(f.floatValue());
        }
        A01.A8I("confidence_level", d);
        A01.AAQ(c51415MnN, "suggested_tags_info");
        A01.AAP("media_format", str6);
        A01.AAP("prior_submodule", str5);
        A01.Cht();
    }

    public static final void A06(Pair pair, C51415MnN c51415MnN, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, boolean z, boolean z2) {
        InterfaceC02590Ai A01 = A01(AbstractC12220kQ.A01(interfaceC11380iw, userSession), userSession, "ig_suggested_tags_view_cta", str);
        AbstractC50522MSa.A1D(A01, AbstractC50523MSb.A0T(A01, userSession, str));
        MSY.A18(A01, z);
        A01.A9K("high_confidence_suggestions_count", AbstractC25229BEm.A0n((Number) pair.first));
        A01.A9K("low_confidence_suggestions_count", AbstractC25229BEm.A0n((Number) pair.second));
        A01.AAQ(c51415MnN, "suggested_tags_info");
        A01.A7v("is_suggestion_row_shown", Boolean.valueOf(z2));
        A01.A9K("suggestion_row_product_count", AbstractC31171DnF.A0V(i));
        A01.Cht();
    }

    public static final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Float f, String str, String str2, String str3, String str4, String str5, int i) {
        Double d;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_suggested_tags_product_suggestion_cell_tap");
        if (A0f.isSampled()) {
            A0f.AAP("upload_key", A02(userSession.userId, str));
            AbstractC50522MSa.A1D(A0f, AbstractC50523MSb.A0T(A0f, userSession, str));
            A0f.AAP("selected_product_id", str2);
            A0f.AAP("merchant_id", str3);
            A0f.A9K("suggestion_row_index", AbstractC31171DnF.A0V(i));
            if (f != null) {
                d = Double.valueOf(f.floatValue());
            } else {
                d = null;
            }
            A0f.A8I("confidence_level", d);
            A0f.AAP("media_format", str4);
            A0f.AAP("user_tag_type", str5);
            A0f.Cht();
        }
    }

    public static final void A08(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, long j, boolean z) {
        InterfaceC02590Ai A01 = A01(AbstractC37302Gc3.A0I(interfaceC11380iw, userSession), userSession, "ig_suggested_tags_request_error", str);
        AbstractC50522MSa.A1D(A01, AbstractC50523MSb.A0T(A01, userSession, str));
        AbstractC43593JPy.A1F(A01, j);
        MSY.A18(A01, z);
        Long A0d = AbstractC167007dF.A0d();
        A01.A9K("high_confidence_suggestions_count", A0d);
        A01.A9K("low_confidence_suggestions_count", A0d);
        A01.AAP("error_message", str2);
        A01.Cht();
    }
}
