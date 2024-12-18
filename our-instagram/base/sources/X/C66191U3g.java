package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.U3g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66191U3g {
    public static C66192U3h parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C66192U3h c66192U3h = new C66192U3h();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fps_override".equals(A0q)) {
                    c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("additional_parts".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69002Vfe parseFromJson = AbstractC68541VUu.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c66192U3h.A00 = arrayList;
                    } else if ("documents".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C66193U3j parseFromJson2 = U3i.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c66192U3h.A01 = arrayList;
                    } else if ("interactions".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                U3X parseFromJson3 = AbstractC66189U3e.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c66192U3h.A02 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c66192U3h;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
