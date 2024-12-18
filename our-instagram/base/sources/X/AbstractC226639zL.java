package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226639zL {
    public static C198938qt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C198938qt c198938qt = new C198938qt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sticker_index".equals(A0s)) {
                    c198938qt.A02 = c16l.A1D();
                } else if ("sticker_color_index".equals(A0s)) {
                    c198938qt.A01 = c16l.A1D();
                } else if ("sticker_color_id".equals(A0s)) {
                    c198938qt.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("sticker_emphasis_status".equals(A0s)) {
                        c198938qt.A03 = A2Y.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("edit_recycler_view_models".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C211859aC parseFromJson = AbstractC226609zI.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c198938qt.A07 = arrayList;
                    } else if ("edit_recycler_view_center_index".equals(A0s)) {
                        c198938qt.A04 = AbstractC166997dE.A0h(c16l);
                    } else if ("tokens".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                US9 parseFromJson2 = AbstractC69932Vxx.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c198938qt.A08 = arrayList;
                    } else if ("editing_token_index".equals(A0s)) {
                        c198938qt.A05 = AbstractC166997dE.A0h(c16l);
                    } else if ("original_file_path".equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        c198938qt.A06 = A0m;
                    }
                }
                c16l.A0z();
            }
            return c198938qt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
