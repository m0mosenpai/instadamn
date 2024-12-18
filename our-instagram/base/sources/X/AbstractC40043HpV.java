package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ListeningNowResponseInfoIntf;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.MusicInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40043HpV {
    public static Map A00(ListeningNowResponseInfoIntf listeningNowResponseInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (listeningNowResponseInfoIntf.Cdb() != null) {
            A1I.put("is_spotify_save_eligible", listeningNowResponseInfoIntf.Cdb());
        }
        if (listeningNowResponseInfoIntf.BNq() != null) {
            ListeningNowState BNq = listeningNowResponseInfoIntf.BNq();
            C14360o3.A0B(BNq, 0);
            A1I.put(AbstractC43591JPw.A00(82), BNq.A00);
        }
        if (listeningNowResponseInfoIntf.BVc() != null) {
            MusicInfo BVc = listeningNowResponseInfoIntf.BVc();
            if (BVc != null) {
                treeUpdaterJNI = BVc.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("music_info", treeUpdaterJNI);
        }
        if (listeningNowResponseInfoIntf.BY2() != null) {
            A1I.put("num_spotify_saves", listeningNowResponseInfoIntf.BY2());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
