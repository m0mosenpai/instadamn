package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vwi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69857Vwi {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.UyX, X.1um, X.1ul] */
    public static C67798UyX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fb_gift_count".equals(A0s)) {
                    c40791um.A04 = AbstractC31173DnH.A0h(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("filters".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C45055Jwk parseFromJson = AbstractC46587KjQ.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A05 = arrayList;
                    } else if ("gift_transactions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C45039JwU parseFromJson2 = VO9.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c40791um.A06 = arrayList;
                    } else if ("has_non_recorded_transactions".equals(A0s)) {
                        c40791um.A02 = AbstractC166997dE.A0d(c16l);
                    } else if ("is_creator_onboarded".equals(A0s)) {
                        c40791um.A03 = AbstractC166997dE.A0d(c16l);
                    } else if ("page_info".equals(A0s)) {
                        c40791um.A01 = AbstractC68384VOs.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            Long l = c40791um.A04;
            List list = c40791um.A05;
            C14360o3.A0A(list);
            List list2 = c40791um.A06;
            C14360o3.A0A(list2);
            Boolean bool = c40791um.A02;
            C14360o3.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = c40791um.A03;
            C14360o3.A0A(bool2);
            c40791um.A00 = new C45047Jwc(c40791um.A01, l, list, list2, booleanValue, bool2.booleanValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
