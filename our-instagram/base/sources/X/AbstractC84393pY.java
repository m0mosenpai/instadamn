package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.Phrase;
import com.instagram.api.schemas.WordOffset;
import com.instagram.api.schemas.WordOffsetImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3pY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84393pY {
    public static Lyrics parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("phrases".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Phrase parseFromJson = AbstractC40142HrB.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("phrases", "Lyrics");
                throw C00O.createAndThrow();
            }
            return new Lyrics(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, Lyrics lyrics) {
        anonymousClass182.A0d();
        List<Phrase> list = lyrics.A00;
        if (list != null) {
            C16V.A03(anonymousClass182, "phrases");
            for (Phrase phrase : list) {
                if (phrase != null) {
                    anonymousClass182.A0d();
                    Integer num = phrase.A00;
                    if (num != null) {
                        anonymousClass182.A0Q(AbstractC111324zv.A00(915), num.intValue());
                    }
                    String str = phrase.A02;
                    if (str != null) {
                        anonymousClass182.A0S("phrase", str);
                    }
                    Integer num2 = phrase.A01;
                    if (num2 != null) {
                        anonymousClass182.A0Q("start_time_in_ms", num2.intValue());
                    }
                    List<WordOffset> list2 = phrase.A03;
                    if (list2 != null) {
                        C16V.A03(anonymousClass182, AbstractC111324zv.A00(5590));
                        for (WordOffset wordOffset : list2) {
                            if (wordOffset != null) {
                                WordOffsetImpl F3z = wordOffset.F3z();
                                anonymousClass182.A0d();
                                anonymousClass182.A0Q("end_index", F3z.A00);
                                anonymousClass182.A0Q(AbstractC111324zv.A00(4377), F3z.A01);
                                anonymousClass182.A0Q("start_index", F3z.A02);
                                anonymousClass182.A0Q(AbstractC111324zv.A00(5397), F3z.A03);
                                anonymousClass182.A0T(AbstractC111324zv.A00(5504), F3z.A04);
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
