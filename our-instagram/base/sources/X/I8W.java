package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I8W {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Irl, java.lang.Object] */
    public static C42506Irl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("catalog_source".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    num = I8X.A00(A1P);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("catalogs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IH8 parseFromJson = I8Z.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("more_available".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1S(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("catalog_source", c16l, "CatalogSection");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("catalogs", c16l, "CatalogSection");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("more_available", c16l, "CatalogSection");
                } else {
                    boolean booleanValue = bool.booleanValue();
                    ?? obj = new Object();
                    obj.A01 = C05F.A00;
                    obj.A04 = AbstractC166987dD.A1E();
                    obj.A00 = C05F.A0C;
                    obj.A01 = num;
                    obj.A03 = str;
                    obj.A04 = arrayList;
                    obj.A05 = booleanValue;
                    obj.A02 = str2;
                    return obj;
                }
            } else {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "CatalogSection");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
