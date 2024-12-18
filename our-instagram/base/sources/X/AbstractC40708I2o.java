package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I2o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40708I2o {
    public static Map A00(C47N c47n) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c47n.getAlgorithm() != null) {
            A1I.put("algorithm", c47n.getAlgorithm());
        }
        if (c47n.Af0() != null) {
            A1I.put("background_image_url", c47n.Af0());
        }
        if (c47n.Alc() != null) {
            A1I.put("caption", c47n.Alc());
        }
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (c47n.AvM() != null) {
            C47F AvM = c47n.AvM();
            if (AvM != null) {
                treeUpdaterJNI3 = AvM.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("custom_profile_pic_url", treeUpdaterJNI3);
        }
        if (c47n.B7Q() != null) {
            A1I.put("followed_by", c47n.B7Q());
        }
        if (c47n.BCj() != null) {
            A1I.put("has_stories", c47n.BCj());
        }
        if (c47n.BEi() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c47n.BEi());
        }
        if (c47n.BIz() != null) {
            A1I.put("interest_topic", c47n.BIz());
        }
        if (c47n.CZO() != null) {
            A1I.put("is_new_suggestion", c47n.CZO());
        }
        if (c47n.BL9() != null) {
            A1I.put("large_urls", c47n.BL9());
        }
        if (c47n.BQb() != null) {
            A1I.put("media_count", c47n.BQb());
        }
        if (c47n.BR1() != null) {
            A1I.put("media_ids", c47n.BR1());
        }
        List BR6 = c47n.BR6();
        if (BR6 != null) {
            ArrayList A0i = AbstractC167007dF.A0i(BR6);
            Iterator it = BR6.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0i, it);
            }
            A1I.put("media_infos", A0i);
        }
        if (c47n.Bfs() != null) {
            InterfaceC115885Me Bfs = c47n.Bfs();
            if (Bfs != null) {
                treeUpdaterJNI2 = Bfs.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("preview_media", treeUpdaterJNI2);
        }
        if (c47n.Blg() != null) {
            A1I.put("reel_media_id", c47n.Blg());
        }
        if (c47n.Bqj() != null) {
            A1I.put("score", AbstractC166997dE.A0f(c47n.Bqj()));
        }
        if (c47n.ByJ() != null) {
            A1I.put("social_context", c47n.ByJ());
        }
        List ByM = c47n.ByM();
        if (ByM != null) {
            ArrayList A0i2 = AbstractC167007dF.A0i(ByM);
            Iterator it2 = ByM.iterator();
            while (it2.hasNext()) {
                AbstractC31178DnM.A1U(A0i2, it2);
            }
            A1I.put("social_context_facepile_users", A0i2);
        }
        if (c47n.C8C() != null) {
            A1I.put("thumbnail_urls", c47n.C8C());
        }
        if (c47n.CDJ() != null) {
            C54N CDJ = c47n.CDJ();
            if (CDJ != null) {
                treeUpdaterJNI = CDJ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("upsell_invite_card", treeUpdaterJNI);
        }
        AbstractC37302Gc3.A1T(c47n.CDj(), A1I);
        if (c47n.CE5() != null) {
            InterfaceC115905Mg CE5 = c47n.CE5();
            if (CE5 != null) {
                treeUpdaterJNI4 = CE5.F7o();
            }
            A1I.put("user_story", treeUpdaterJNI4);
        }
        if (c47n.CEI() != null) {
            A1I.put("uuid", c47n.CEI());
        }
        if (c47n.CER() != null) {
            A1I.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, AbstractC166997dE.A0f(c47n.CER()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
