package X;

import java.io.IOException;

/* renamed from: X.VOt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68385VOt {
    public static UPT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            C69211Vje c69211Vje = null;
            Float f4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_nearby".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("map_response".equals(A0s)) {
                    c69211Vje = VO1.parseFromJson(c16l);
                } else if ("mapview_bottom_lat".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("mapview_display_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("mapview_left_lng".equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                } else if ("mapview_query_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("mapview_query_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("mapview_right_lng".equals(A0s)) {
                    f3 = AbstractC167007dF.A0b(c16l);
                } else if ("mapview_top_lat".equals(A0s)) {
                    f4 = AbstractC167007dF.A0b(c16l);
                } else if ("typecode".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_nearby", c16l, "PlacesHCMData");
            } else if (c69211Vje != null || !(c16l instanceof C07950bF)) {
                if (f == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("mapview_bottom_lat", c16l, "PlacesHCMData");
                } else if (f2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("mapview_left_lng", c16l, "PlacesHCMData");
                } else if (f3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("mapview_right_lng", c16l, "PlacesHCMData");
                } else if (f4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("mapview_top_lat", c16l, "PlacesHCMData");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("typecode", c16l, "PlacesHCMData");
                } else {
                    return new UPT(c69211Vje, str, str2, str3, str4, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("map_response", c16l, "PlacesHCMData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
