package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hv4 {
    public static Map A00(C47H c47h) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c47h.getAlgorithm() != null) {
            A1I.put("algorithm", c47h.getAlgorithm());
        }
        if (c47h.Af0() != null) {
            A1I.put("background_image_url", c47h.Af0());
        }
        if (c47h.Alc() != null) {
            A1I.put("caption", c47h.Alc());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (c47h.AvM() != null) {
            C47F AvM = c47h.AvM();
            if (AvM != null) {
                treeUpdaterJNI = AvM.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("custom_profile_pic_url", treeUpdaterJNI);
        }
        if (c47h.B7Q() != null) {
            A1I.put("followed_by", c47h.B7Q());
        }
        if (c47h.BCj() != null) {
            A1I.put("has_stories", c47h.BCj());
        }
        if (c47h.BEi() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c47h.BEi());
        }
        if (c47h.CZO() != null) {
            A1I.put("is_new_suggestion", c47h.CZO());
        }
        if (c47h.BL9() != null) {
            A1I.put("large_urls", c47h.BL9());
        }
        if (c47h.BQb() != null) {
            A1I.put("media_count", c47h.BQb());
        }
        if (c47h.BR1() != null) {
            A1I.put("media_ids", c47h.BR1());
        }
        List BR6 = c47h.BR6();
        if (BR6 != null) {
            ArrayList A0i = AbstractC167007dF.A0i(BR6);
            Iterator it = BR6.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0i, it);
            }
            A1I.put("media_infos", A0i);
        }
        if (c47h.Bfs() != null) {
            InterfaceC115885Me Bfs = c47h.Bfs();
            if (Bfs != null) {
                treeUpdaterJNI2 = Bfs.F7o();
            }
            A1I.put("preview_media", treeUpdaterJNI2);
        }
        if (c47h.Bqj() != null) {
            A1I.put("score", AbstractC166997dE.A0f(c47h.Bqj()));
        }
        if (c47h.ByJ() != null) {
            A1I.put("social_context", c47h.ByJ());
        }
        List ByM = c47h.ByM();
        if (ByM != null) {
            ArrayList A0i2 = AbstractC167007dF.A0i(ByM);
            Iterator it2 = ByM.iterator();
            while (it2.hasNext()) {
                AbstractC31178DnM.A1U(A0i2, it2);
            }
            A1I.put("social_context_facepile_users", A0i2);
        }
        if (c47h.C8C() != null) {
            A1I.put("thumbnail_urls", c47h.C8C());
        }
        if (c47h.CDj() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c47h.CDj().A07());
        }
        if (c47h.CEI() != null) {
            A1I.put("uuid", c47h.CEI());
        }
        if (c47h.CER() != null) {
            A1I.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, AbstractC166997dE.A0f(c47h.CER()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
