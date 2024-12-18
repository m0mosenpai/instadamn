package X;

import com.instagram.api.schemas.WordOffset;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40455Hwk {
    public static Map A00(WordOffset wordOffset) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        wordOffset.getEndIndex();
        A1I.put("end_index", Integer.valueOf(wordOffset.getEndIndex()));
        wordOffset.B1x();
        A1I.put("end_offset_ms", Integer.valueOf(wordOffset.B1x()));
        wordOffset.Bzc();
        A1I.put("start_index", Integer.valueOf(wordOffset.Bzc()));
        wordOffset.Bzf();
        A1I.put("start_offset_ms", Integer.valueOf(wordOffset.Bzf()));
        wordOffset.CAT();
        return AbstractC37301Gc2.A0r("trailing_space", Boolean.valueOf(wordOffset.CAT()), A1I);
    }
}
