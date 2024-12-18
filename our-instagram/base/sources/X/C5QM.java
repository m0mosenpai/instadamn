package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5QM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QM {
    public static C5QL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5QL c5ql = new C5QL(null);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                if ("span_metadata".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C5QO parseFromJson = C5QN.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c5ql.A01 = arrayList;
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5ql.A00 = str;
                }
                c16l.A0z();
            }
            return c5ql;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5QL c5ql) {
        anonymousClass182.A0d();
        C16V.A03(anonymousClass182, "span_metadata");
        for (C5QO c5qo : c5ql.A01) {
            if (c5qo != null) {
                anonymousClass182.A0d();
                anonymousClass182.A0Q("span_start", c5qo.A02);
                anonymousClass182.A0Q("span_end", c5qo.A00);
                anonymousClass182.A0Q("span_flags", c5qo.A01);
                String str = c5qo.A04;
                if (str != null) {
                    anonymousClass182.A0S("metadata_model", str);
                    c5qo.A00();
                    anonymousClass182.A0S("metadata_model_type", C5QP.A00(c5qo.A00()));
                    anonymousClass182.A0a();
                } else {
                    C14360o3.A0F("metadataModelJson");
                    throw C00O.createAndThrow();
                }
            }
        }
        anonymousClass182.A0Z();
        String str2 = c5ql.A00;
        if (str2 != null) {
            anonymousClass182.A0S("text", str2);
        }
        anonymousClass182.A0a();
    }
}
