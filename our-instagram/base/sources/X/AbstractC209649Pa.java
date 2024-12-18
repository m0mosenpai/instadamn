package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9Pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209649Pa {
    public static C9PL parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            C9PL c9pl = new C9PL(null);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_saved_instagram_story".equals(A0q)) {
                    c9pl.A0B = c16l.A0d();
                } else if ("iso_sensitivity".equals(A0q)) {
                    c9pl.A04 = Integer.valueOf(c16l.A1D());
                } else if ("exposure_time".equals(A0q)) {
                    c9pl.A05 = Long.valueOf(c16l.A0y());
                } else if ("aperture".equals(A0q)) {
                    c9pl.A01 = new Float(c16l.A0U());
                } else if ("focal_length".equals(A0q)) {
                    c9pl.A02 = new Float(c16l.A0U());
                } else if ("awb_mode".equals(A0q)) {
                    c9pl.A03 = Integer.valueOf(c16l.A1D());
                } else {
                    String str = null;
                    String str2 = null;
                    ArrayList arrayList = null;
                    String str3 = null;
                    ArrayList arrayList2 = null;
                    if ("effect_persisted_metadata".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c9pl.A07 = str2;
                    } else if ("camera_tools".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                    arrayList.add(A1P2);
                                }
                            }
                        }
                        c9pl.A09 = arrayList;
                    } else if ("capture_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c9pl.A06 = str3;
                    } else if ("product_info".equals(A0q)) {
                        c9pl.A00 = AEB.parseFromJson(c16l);
                    } else if ("effect_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList2.add(A1P);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList2, 0);
                        c9pl.A0A = arrayList2;
                    } else if ("file_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c9pl.A08 = str;
                    }
                }
                c16l.A0z();
            }
            return c9pl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C9PL c9pl) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        A0S.A0T("is_saved_instagram_story", c9pl.A0B);
        Integer num = c9pl.A04;
        if (num != null) {
            A0S.A0Q("iso_sensitivity", num.intValue());
        }
        Long l = c9pl.A05;
        if (l != null) {
            A0S.A0R("exposure_time", l.longValue());
        }
        Float f = c9pl.A01;
        if (f != null) {
            A0S.A0P("aperture", f.floatValue());
        }
        Float f2 = c9pl.A02;
        if (f2 != null) {
            A0S.A0P("focal_length", f2.floatValue());
        }
        Integer num2 = c9pl.A03;
        if (num2 != null) {
            A0S.A0Q("awb_mode", num2.intValue());
        }
        String str = c9pl.A07;
        if (str != null) {
            A0S.A0S("effect_persisted_metadata", str);
        }
        if (c9pl.A09 != null) {
            C16V.A03(A0S, "camera_tools");
            Iterator it = c9pl.A09.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(A0S, it);
            }
            A0S.A0Z();
        }
        String str2 = c9pl.A06;
        if (str2 != null) {
            A0S.A0S("capture_type", str2);
        }
        if (c9pl.A00 != null) {
            A0S.A0r("product_info");
            AEB.A00(A0S, c9pl.A00);
        }
        c9pl.A00();
        C16V.A03(A0S, "effect_ids");
        Iterator it2 = c9pl.A00().iterator();
        while (it2.hasNext()) {
            AbstractC167017dG.A1F(A0S, it2);
        }
        A0S.A0Z();
        String str3 = c9pl.A08;
        if (str3 != null) {
            A0S.A0S("file_path", str3);
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
