package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.refinement.model.Refinement;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VyC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69941VyC {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.UzD, X.1um, X.1ul] */
    public static C67840UzD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("refinements".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Refinement parseFromJson = AbstractC40619Hzd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else if ("display_text".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("pins".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            MediaMapPin parseFromJson2 = VT3.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("guides".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C41012IEh parseFromJson3 = I1F.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if ("focus_pin_index".equals(A0s)) {
                    c40791um.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("list_type".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("query_token".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("guides_index".equals(A0s)) {
                    c16l.A1D();
                } else if ("needs_story_fetch".equals(A0s)) {
                    c40791um.A07 = c16l.A0d();
                } else if ("needs_profile_fetch".equals(A0s)) {
                    c40791um.A06 = c16l.A0d();
                } else if ("needs_guides_fetch".equals(A0s)) {
                    c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
