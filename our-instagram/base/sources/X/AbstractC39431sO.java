package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39431sO {
    public static C38211qB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("cross_surface".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C39511sW parseFromJson = AbstractC39441sP.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("local_surface".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C39511sW parseFromJson2 = AbstractC39441sP.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("meta_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList3.add(A1P);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                c16l.A0z();
            }
            return new C38211qB(arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38211qB c38211qB) {
        anonymousClass182.A0d();
        List<C39511sW> list = c38211qB.A00;
        if (list != null) {
            C16V.A03(anonymousClass182, "cross_surface");
            for (C39511sW c39511sW : list) {
                if (c39511sW != null) {
                    AbstractC39441sP.A00(anonymousClass182, c39511sW);
                }
            }
            anonymousClass182.A0Z();
        }
        List<C39511sW> list2 = c38211qB.A01;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "local_surface");
            for (C39511sW c39511sW2 : list2) {
                if (c39511sW2 != null) {
                    AbstractC39441sP.A00(anonymousClass182, c39511sW2);
                }
            }
            anonymousClass182.A0Z();
        }
        List<String> list3 = c38211qB.A02;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "meta_ids");
            for (String str : list3) {
                if (str != null) {
                    anonymousClass182.A0u(str);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
