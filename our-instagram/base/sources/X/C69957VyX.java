package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VyX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69957VyX {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.UzT, X.1um, X.1ul] */
    public static C67848UzT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(45).equals(A0s)) {
                    c40791um.A08 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("next_media_ids".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c40791um.A05 = arrayList;
                    } else if ("next_page".equals(A0s)) {
                        c40791um.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("persistent_sections".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C130455uq parseFromJson = AbstractC130445up.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A06 = arrayList;
                    } else if ("sections".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C130455uq parseFromJson2 = AbstractC130445up.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c40791um.A07 = arrayList;
                    } else if ("content_advisory".equals(A0s)) {
                        c40791um.A00 = AbstractC68480VSl.parseFromJson(c16l);
                    } else if (MSV.A00(1720).equals(A0s)) {
                        c40791um.A01 = AbstractC40607HzR.parseFromJson(c16l);
                    } else if ("null_state".equals(A0s)) {
                        c40791um.A02 = AbstractC40613HzX.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
