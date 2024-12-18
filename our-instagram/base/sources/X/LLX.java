package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class LLX {
    public static final C25621Ms A00(UserSession userSession, AbstractC47211Ktk abstractC47211Ktk, C44996Jvm c44996Jvm, DirectThreadKey directThreadKey, JSONObject jSONObject) {
        C14360o3.A0B(directThreadKey, 1);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("direct_v2/threads/broadcast/generic_share/");
        A0A(A0c, directThreadKey);
        String str = c44996Jvm.A01;
        String str2 = c44996Jvm.A02;
        boolean z = c44996Jvm.A04;
        A05(A0c, c44996Jvm.A00, str, str2, c44996Jvm.A03, null, z, c44996Jvm.A06, c44996Jvm.A05);
        A06(A0c, abstractC47211Ktk, jSONObject);
        return A0c;
    }

    public static final List A02(List list) {
        C14360o3.A0B(list, 0);
        List A0X = AbstractC001800i.A0X(list);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0X) {
            String str = (String) obj;
            if (AbstractC25225BEi.A1Y(str) && !C14360o3.A0K(str, "0")) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Deprecated(message = "Please use addThreadKeyParams and addSendItemParams instead.")
    public static final void A04(C25621Ms c25621Ms, L1W l1w, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(directThreadKey, 1);
        A0A(c25621Ms, directThreadKey);
        A05(c25621Ms, l1w, str, str2, str3, str4, z, z2, z3);
    }

    public static final void A07(C25621Ms c25621Ms, List list) {
        C14360o3.A0B(list, 1);
        List A02 = A02(list);
        if (AbstractC166987dD.A1b(A02)) {
            c25621Ms.A9s("horizon_world_ids", A01(A02));
        }
    }

    public static final void A08(C25621Ms c25621Ms, List list) {
        C14360o3.A0B(list, 0);
        List A0X = AbstractC001800i.A0X(list);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0X) {
            AbstractC25228BEl.A1Q(obj, A1E, AbstractC001900j.A0T((String) obj) ? 1 : 0);
        }
        if (AbstractC166987dD.A1b(A1E)) {
            c25621Ms.A9s("meta_gallery_media_ids", A01(A1E));
        }
    }

    public static final void A09(C25621Ms c25621Ms, List list) {
        boolean z;
        ArrayList A12 = AbstractC166997dE.A12(list, 1);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            MediaUploadMetadata mediaUploadMetadata = (MediaUploadMetadata) obj;
            String str = mediaUploadMetadata.A08;
            if (str != null && !AbstractC001900j.A0T(str)) {
                JSONObject A0q = AbstractC31171DnF.A0q();
                A0q.put("attachment_index", i);
                A0q.put(AbstractC111324zv.A00(2722), mediaUploadMetadata.A08);
                ImmersiveMediaFields immersiveMediaFields = mediaUploadMetadata.A00;
                if (immersiveMediaFields != null) {
                    z = immersiveMediaFields.A01;
                } else {
                    z = false;
                }
                A0q.put("is_3d", z);
                A12.add(A0q);
            }
            i = i2;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        c25621Ms.A9s("meta_gallery_media_info", jSONArray.toString());
    }

    public static String A01(Iterable iterable) {
        return AnonymousClass001.A0E(C71473Il.A00(',').A02(iterable), '[', ']');
    }

    public static final void A03(C25621Ms c25621Ms, L1W l1w) {
        if (l1w != null) {
            Long l = l1w.A01;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    c25621Ms.A0E("ephemeral_duration_sec", longValue);
                }
            }
            Long l2 = l1w.A02;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (longValue2 >= 0) {
                    c25621Ms.A0E("ephemeral_view_duration_sec", longValue2);
                }
            }
        }
    }

    @Deprecated(message = "Please use SendItemParams instead.", replaceWith = @ReplaceWith(expression = "sendItemParams(threadKey, params)", imports = {}))
    public static final void A05(C25621Ms c25621Ms, L1W l1w, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        c25621Ms.A9s("offline_threading_id", str);
        c25621Ms.A9s("client_context", str);
        c25621Ms.A9s("action", "send_item");
        String A00 = C16030qx.A00(AbstractC12290kX.A00);
        C14360o3.A07(A00);
        c25621Ms.A9s(AbstractC31688Dvt.A01(), A00);
        if (str2 != null) {
            c25621Ms.A9s("mutation_token", str2);
        }
        if (str3 != null) {
            c25621Ms.A9s("send_attribution", str3);
        }
        if (z) {
            c25621Ms.A9s("sampled", "true");
        }
        if (z3) {
            c25621Ms.A9s("send_silently", "true");
        }
        C1QN c1qn = C1QM.A00;
        C14360o3.A07(c1qn);
        String str5 = c1qn.A02.A02;
        if (str5 != null) {
            c25621Ms.A9s("nav_chain", str5);
        }
        if (str4 != null && str4.length() > 0) {
            c25621Ms.A9s("reshared_ad_id", str4);
        }
        A03(c25621Ms, l1w);
        c25621Ms.A0J("is_shh_mode", z2);
    }

    @Deprecated(message = "Please  use createGenericShareBuilder instead.")
    public static final void A06(C25621Ms c25621Ms, AbstractC47211Ktk abstractC47211Ktk, JSONObject jSONObject) {
        String str;
        int i;
        boolean z = abstractC47211Ktk instanceof KVV;
        if (z) {
            str = "share_type";
        } else {
            str = "embedded_ent_type";
        }
        if (z) {
            i = ((KVV) abstractC47211Ktk).A00;
        } else if (abstractC47211Ktk instanceof KVU) {
            i = ((KVU) abstractC47211Ktk).A00;
        } else {
            throw B4Z.A00();
        }
        c25621Ms.A0D(str, i);
        c25621Ms.A9s("json_params", jSONObject.toString());
    }

    public static final void A0A(C25621Ms c25621Ms, DirectThreadKey... directThreadKeyArr) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        DirectThreadKey directThreadKey = directThreadKeyArr[0];
        if (directThreadKey.A00 != null) {
            A1E.add(directThreadKey);
        } else {
            A1E2.add(directThreadKey);
        }
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            String str = ((DirectThreadKey) it.next()).A00;
            if (str != null) {
                A1E3.add(str);
            }
        }
        ArrayList A1E4 = AbstractC166987dD.A1E();
        Iterator it2 = A1E2.iterator();
        while (it2.hasNext()) {
            List list = ((DirectThreadKey) it2.next()).A02;
            if (list != null) {
                A1E4.add(list);
            }
        }
        if (AbstractC166987dD.A1b(A1E3)) {
            c25621Ms.A9s("thread_ids", A01(A1E3));
        }
        if (AbstractC166987dD.A1b(A1E4)) {
            ArrayList A0q = AbstractC167017dG.A0q(A1E4);
            Iterator it3 = A1E4.iterator();
            while (it3.hasNext()) {
                A0q.add(A01((Iterable) it3.next()));
            }
            c25621Ms.A9s("recipient_users", A01(A0q));
        }
    }
}
