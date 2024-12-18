package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ks6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47111Ks6 {
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.KiI] */
    public static C46519KiI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("giphy".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AA7 parseFromJson = A14.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("giphy_gifs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AA7 parseFromJson2 = A14.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("stickers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C148276lx parseFromJson3 = AbstractC201078up.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList4.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("avatar_stickers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C148286ly parseFromJson4 = AbstractC201088uq.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList5.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("cutout_stickers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C148286ly parseFromJson5 = AbstractC201088uq.parseFromJson(c16l);
                            if (parseFromJson5 != null) {
                                arrayList6.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A03 = arrayList;
            obj.A05 = arrayList2;
            obj.A04 = arrayList3;
            obj.A06 = arrayList4;
            obj.A00 = arrayList5;
            obj.A01 = arrayList6;
            if (arrayList != null) {
                obj.A02 = AbstractC166987dD.A1E();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    obj.A02.add(C168157fA.A01(AbstractC166987dD.A1B(it)));
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
