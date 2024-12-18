package X;

import com.instagram.api.schemas.MapListType;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VO1 {
    public static C69211Vje parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            ArrayList arrayList = null;
            Boolean bool3 = null;
            MapListType mapListType = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            ArrayList arrayList3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("focus_pin_index".equals(A0s)) {
                    c16l.A1D();
                } else if ("guides".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C51757Mtg parseFromJson = AbstractC39953Hni.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("guides_index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("list_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mapListType = (MapListType) MapListType.A01.get(A1P);
                    if (mapListType == null) {
                        mapListType = MapListType.A05;
                    }
                } else if ("needs_guides_fetch".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("needs_profile_fetch".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("needs_story_fetch".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("pins".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            MediaMapPin parseFromJson2 = VT3.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("query_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("refinements".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C45127Jxw parseFromJson3 = AbstractC40058Hpk.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("guides_index", c16l, "BoundingBoxPinResponse");
            } else if (mapListType != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("needs_guides_fetch", c16l, "BoundingBoxPinResponse");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("needs_profile_fetch", c16l, "BoundingBoxPinResponse");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("needs_story_fetch", c16l, "BoundingBoxPinResponse");
                } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("pins", c16l, "BoundingBoxPinResponse");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("query_token", c16l, "BoundingBoxPinResponse");
                } else if (arrayList3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("refinements", c16l, "BoundingBoxPinResponse");
                } else {
                    return new C69211Vje(mapListType, str, str2, arrayList, arrayList2, arrayList3);
                }
            } else {
                AbstractC166997dE.A1V("list_type", c16l, "BoundingBoxPinResponse");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
