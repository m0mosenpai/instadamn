package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vy6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69935Vy6 {
    public static C67640Utv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image_metadata".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C67642Utx parseFromJson = AbstractC68475VSg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("image_contents".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C67641Utw parseFromJson2 = AbstractC68474VSf.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            return new C67640Utv(arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C67640Utv c67640Utv) {
        anonymousClass182.A0d();
        List list = c67640Utv.A01;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "image_metadata", list);
            while (A0q.hasNext()) {
                C67642Utx c67642Utx = (C67642Utx) A0q.next();
                if (c67642Utx != null) {
                    anonymousClass182.A0d();
                    Integer num = c67642Utx.A01;
                    if (num != null) {
                        anonymousClass182.A0Q("start_position", num.intValue());
                    }
                    Integer num2 = c67642Utx.A00;
                    if (num2 != null) {
                        anonymousClass182.A0Q("length", num2.intValue());
                    }
                    String str = c67642Utx.A02;
                    if (str != null) {
                        anonymousClass182.A0S("image_id", str);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List list2 = c67640Utv.A00;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "image_contents", list2);
            while (A0q2.hasNext()) {
                C67641Utw c67641Utw = (C67641Utw) A0q2.next();
                if (c67641Utw != null) {
                    anonymousClass182.A0d();
                    String str2 = c67641Utw.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("image_id", str2);
                    }
                    String str3 = c67641Utw.A00;
                    if (str3 != null) {
                        anonymousClass182.A0S("fallback_text", str3);
                    }
                    String str4 = c67641Utw.A01;
                    if (str4 != null) {
                        anonymousClass182.A0S("image_binary_base64", str4);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
