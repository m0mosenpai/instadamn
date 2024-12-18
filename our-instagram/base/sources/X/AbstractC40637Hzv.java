package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.feed.audio.AudioIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hzv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40637Hzv {
    public static Map A00(AudioIntf audioIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (audioIntf.Ae1() != null) {
            A1I.put("audio_src", audioIntf.Ae1());
        }
        if (audioIntf.Ae2() != null) {
            A1I.put("audio_src_expiration_timestamp_us", audioIntf.Ae2());
        }
        if (audioIntf.Azh() != null) {
            A1I.put("duration", audioIntf.Azh());
        }
        ArrayList arrayList = null;
        if (audioIntf.B4D() != null) {
            DirectAudioFallbackUrl B4D = audioIntf.B4D();
            if (B4D != null) {
                treeUpdaterJNI = B4D.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("fallback", treeUpdaterJNI);
        }
        if (audioIntf.CHJ() != null) {
            List CHJ = audioIntf.CHJ();
            if (CHJ != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = CHJ.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1X(arrayList, it);
                }
            }
            A1I.put(AbstractC43591JPw.A00(494), arrayList);
        }
        if (audioIntf.CHK() != null) {
            A1I.put(MSV.A00(1722), audioIntf.CHK());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
