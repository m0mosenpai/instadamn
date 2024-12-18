package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OSu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54964OSu {
    public final C44S A00 = new C44S();

    public static final void A00(AbstractC911344p abstractC911344p, AbstractC911344p abstractC911344p2, C54964OSu c54964OSu, String str, Map map) {
        String A0T;
        String A0T2;
        String str2 = "new";
        if (abstractC911344p != null) {
            if (abstractC911344p2 != null) {
                if (abstractC911344p.A0B() && abstractC911344p2.A0B()) {
                    Iterator A09 = abstractC911344p.A09();
                    C14360o3.A07(A09);
                    List A02 = AbstractC224517h.A02(AbstractC224717j.A0A(A09));
                    Iterator A092 = abstractC911344p2.A09();
                    C14360o3.A07(A092);
                    List A022 = AbstractC224517h.A02(AbstractC224717j.A0A(A092));
                    List A0a = AbstractC001800i.A0a(AbstractC001800i.A0l(A02, A022));
                    List A0W = AbstractC001800i.A0W(AbstractC001800i.A0S(A022, A02));
                    Iterator it = A0a.iterator();
                    while (it.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(it);
                        if (str.length() == 0) {
                            A0T2 = A1B;
                        } else {
                            A0T2 = AnonymousClass001.A0T(str, A1B, '.');
                        }
                        AbstractC911344p A04 = abstractC911344p.A04(A1B);
                        AbstractC911344p A042 = abstractC911344p2.A04(A1B);
                        C14360o3.A0A(A0T2);
                        A00(A04, A042, c54964OSu, A0T2, map);
                    }
                    Iterator it2 = A0W.iterator();
                    while (it2.hasNext()) {
                        String A1B2 = AbstractC166987dD.A1B(it2);
                        if (str.length() == 0) {
                            A0T = A1B2;
                        } else {
                            A0T = AnonymousClass001.A0T(str, A1B2, '.');
                        }
                        if (!A0a.contains(A1B2)) {
                            if (A02.contains(A1B2)) {
                                C14360o3.A0A(A0T);
                                map.put(A0T, "skipped");
                            } else if (A022.contains(A1B2)) {
                                C14360o3.A0A(A0T);
                                map.put(A0T, "new");
                            }
                        }
                    }
                    return;
                }
                if (abstractC911344p.equals(abstractC911344p2)) {
                    str2 = "same";
                } else {
                    str2 = "different";
                }
            } else {
                map.put(str, "skipped");
                return;
            }
        } else if (abstractC911344p2 == null) {
            return;
        }
        map.put(str, str2);
    }
}
