package X;

import com.instagram.api.schemas.TextEntityType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IPR {
    public static C38801H6q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("entities".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38795H6k parseFromJson = AbstractC40403Hvq.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "TextWithEntities");
                throw C00O.createAndThrow();
            }
            return new C38801H6q(arrayList, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38801H6q c38801H6q) {
        anonymousClass182.A0d();
        List list = c38801H6q.A01;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "entities", list);
            while (A0q.hasNext()) {
                C38795H6k c38795H6k = (C38795H6k) A0q.next();
                if (c38795H6k != null) {
                    anonymousClass182.A0d();
                    C38794H6j c38794H6j = c38795H6k.A01;
                    if (c38794H6j != null) {
                        anonymousClass182.A0r("entity");
                        anonymousClass182.A0d();
                        String str = c38794H6j.A01;
                        if (str != null) {
                            anonymousClass182.A0S("display_text", str);
                        }
                        TextEntityType textEntityType = c38794H6j.A00;
                        if (textEntityType != null) {
                            anonymousClass182.A0S("entity_type", textEntityType.A00);
                        }
                        AbstractC37301Gc2.A1D(anonymousClass182, c38794H6j.A02);
                        String str2 = c38794H6j.A03;
                        if (str2 != null) {
                            anonymousClass182.A0S("url", str2);
                        }
                        anonymousClass182.A0a();
                    }
                    Integer num = c38795H6k.A02;
                    if (num != null) {
                        anonymousClass182.A0Q("length", num.intValue());
                    }
                    anonymousClass182.A0Q("offset", c38795H6k.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c38801H6q.A00);
        anonymousClass182.A0a();
    }
}
