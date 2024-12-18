package X;

import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.PhraseIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hph, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40055Hph {
    public static Map A00(LyricsIntf lyricsIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (lyricsIntf.Bd4() != null) {
            List<PhraseIntf> Bd4 = lyricsIntf.Bd4();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (PhraseIntf phraseIntf : Bd4) {
                if (phraseIntf != null) {
                    A1E.add(phraseIntf.F7o());
                }
            }
            A1I.put("phrases", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
