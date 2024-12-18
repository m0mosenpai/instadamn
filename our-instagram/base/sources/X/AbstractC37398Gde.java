package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gde, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37398Gde {
    public static Map A00(InterfaceC39271s5 interfaceC39271s5) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC39271s5.AaI() != null) {
            A1I.put("adtaxon_i18n_top1_l7_prediction", interfaceC39271s5.AaI());
        }
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (interfaceC39271s5.B5h() != null) {
            InterfaceC106394qt B5h = interfaceC39271s5.B5h();
            if (B5h != null) {
                treeUpdaterJNI4 = B5h.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("feed_dwell_afi_info", treeUpdaterJNI4);
        }
        if (interfaceC39271s5.B5r() != null) {
            InterfaceC106394qt B5r = interfaceC39271s5.B5r();
            if (B5r != null) {
                treeUpdaterJNI3 = B5r.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("feed_post_click_afi_info", treeUpdaterJNI3);
        }
        if (interfaceC39271s5.B5x() != null) {
            C5FS B5x = interfaceC39271s5.B5x();
            if (B5x != null) {
                treeUpdaterJNI2 = B5x.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("feed_repetition_info", treeUpdaterJNI2);
        }
        if (interfaceC39271s5.BJ2() != null) {
            C5FT BJ2 = interfaceC39271s5.BJ2();
            if (BJ2 != null) {
                treeUpdaterJNI = BJ2.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("interests_reco_info", treeUpdaterJNI);
        }
        if (interfaceC39271s5.CUf() != null) {
            A1I.put("is_feed_dwell_afi_eligible", interfaceC39271s5.CUf());
        }
        if (interfaceC39271s5.CUi() != null) {
            A1I.put("is_feed_post_click_afi_eligible", interfaceC39271s5.CUi());
        }
        if (interfaceC39271s5.Cbh() != null) {
            A1I.put("is_reels_dwell_afi_eligible", interfaceC39271s5.Cbh());
        }
        if (interfaceC39271s5.C1P() != null) {
            C5FU C1P = interfaceC39271s5.C1P();
            if (C1P != null) {
                treeUpdaterJNI5 = C1P.F7o();
            }
            A1I.put("story_dwell_ini_info", treeUpdaterJNI5);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
