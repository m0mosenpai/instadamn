package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.Phrase;
import com.instagram.api.schemas.WordOffset;
import com.instagram.music.common.model.LyricsPhrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Iap, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41601Iap {
    /* JADX WARN: Type inference failed for: r0v11, types: [com.instagram.music.common.model.WordOffset, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Gom, java.lang.Object] */
    public final C38059Gom A01(Lyrics lyrics) {
        ArrayList arrayList;
        List<Phrase> list = lyrics.A00;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        for (Phrase phrase : list) {
            C14360o3.A0B(phrase, 0);
            int A0K = AbstractC167017dG.A0K(phrase.A01);
            String str = phrase.A02;
            if (str == null) {
                str = "";
            }
            List<WordOffset> list2 = phrase.A03;
            if (list2 != null) {
                arrayList = AbstractC167007dF.A0i(list2);
                for (WordOffset wordOffset : list2) {
                    C14360o3.A0B(wordOffset, 0);
                    int Bzc = wordOffset.Bzc();
                    int endIndex = wordOffset.getEndIndex();
                    int Bzf = wordOffset.Bzf();
                    int B1x = wordOffset.B1x();
                    boolean CAT = wordOffset.CAT();
                    ?? obj = new Object();
                    obj.A02 = Bzc;
                    obj.A00 = endIndex;
                    obj.A03 = Bzf;
                    obj.A01 = B1x;
                    obj.A04 = CAT;
                    arrayList.add(obj);
                }
            } else {
                arrayList = null;
            }
            A0i.add(new LyricsPhrase(arrayList, A0K, str));
        }
        ArrayList A0U = AbstractC001800i.A0U(A00(A0i));
        C14360o3.A0B(A0U, 1);
        ?? obj2 = new Object();
        obj2.A00 = A0U;
        return obj2;
    }

    public static final ArrayList A00(List list) {
        ArrayList A17 = AbstractC25225BEi.A17(list.size() + 1);
        A17.add(0, new LyricsPhrase(null, 0, "…"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LyricsPhrase lyricsPhrase = (LyricsPhrase) it.next();
            String str = lyricsPhrase.A01;
            if (str != null && str.length() != 0) {
                A17.add(lyricsPhrase);
            } else {
                A17.add(new LyricsPhrase(null, lyricsPhrase.A00, "…"));
            }
        }
        int size = A17.size() - 1;
        if (!C14360o3.A0K(((LyricsPhrase) A17.get(size)).A01, "…")) {
            Object obj = A17.get(size);
            C14360o3.A07(obj);
            A17.add(new LyricsPhrase(null, ((LyricsPhrase) obj).A00 + 3000, "…"));
        }
        return A17;
    }
}
