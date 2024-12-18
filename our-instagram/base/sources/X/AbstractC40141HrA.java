package X;

import com.instagram.api.schemas.PhraseIntf;
import com.instagram.api.schemas.WordOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HrA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40141HrA {
    public static Map A00(PhraseIntf phraseIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (phraseIntf.B26() != null) {
            A1I.put(AbstractC111324zv.A00(915), phraseIntf.B26());
        }
        if (phraseIntf.Bd1() != null) {
            A1I.put("phrase", phraseIntf.Bd1());
        }
        if (phraseIntf.Bzl() != null) {
            A1I.put("start_time_in_ms", phraseIntf.Bzl());
        }
        if (phraseIntf.CHp() != null) {
            List<WordOffset> CHp = phraseIntf.CHp();
            ArrayList arrayList = null;
            if (CHp != null) {
                arrayList = AbstractC166987dD.A1E();
                for (WordOffset wordOffset : CHp) {
                    if (wordOffset != null) {
                        arrayList.add(wordOffset.F7o());
                    }
                }
            }
            A1I.put("word_offsets", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
