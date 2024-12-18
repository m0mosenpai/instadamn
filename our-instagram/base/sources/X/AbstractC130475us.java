package X;

import com.instagram.discovery.related.model.RelatedItem;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130475us {
    public static C130485ut parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C130485ut c130485ut = new C130485ut();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("full_item".equals(A0q)) {
                    c130485ut.A03 = AbstractC130495uu.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("fill_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C130505uv parseFromJson = AbstractC130495uu.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c130485ut.A0D = arrayList;
                    } else if ("medias".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C130505uv parseFromJson2 = AbstractC130495uu.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c130485ut.A0E = arrayList;
                    } else if ("one_by_two_item".equals(A0q)) {
                        c130485ut.A04 = AbstractC130495uu.parseFromJson(c16l);
                    } else if ("one_by_two_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C130505uv parseFromJson3 = AbstractC130495uu.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c130485ut.A0G = arrayList;
                    } else if ("two_by_two_ad_item".equals(A0q)) {
                        c130485ut.A08 = AbstractC130495uu.parseFromJson(c16l);
                    } else if ("fallback_section".equals(A0q)) {
                        c130485ut.A0A = AbstractC130445up.parseFromJson(c16l);
                    } else if ("two_by_two_item".equals(A0q)) {
                        c130485ut.A09 = AbstractC130495uu.parseFromJson(c16l);
                    } else if ("three_by_four_item".equals(A0q)) {
                        c130485ut.A05 = AbstractC130495uu.parseFromJson(c16l);
                    } else if ("tray_item".equals(A0q)) {
                        c130485ut.A06 = AbstractC130495uu.parseFromJson(c16l);
                    } else if ("tabs_info".equals(A0q)) {
                        c130485ut.A01 = AbstractC68479VSk.parseFromJson(c16l);
                    } else if ("contextual_item".equals(A0q)) {
                        c130485ut.A02 = AbstractC130495uu.parseFromJson(c16l);
                    } else if ("nested_sections".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C130455uq parseFromJson4 = AbstractC130445up.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList.add(parseFromJson4);
                                }
                            }
                        }
                        c130485ut.A0F = arrayList;
                    } else if ("related".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                RelatedItem parseFromJson5 = VT7.parseFromJson(c16l);
                                if (parseFromJson5 != null) {
                                    arrayList.add(parseFromJson5);
                                }
                            }
                        }
                        c130485ut.A0H = arrayList;
                    } else if ("related_style".equals(A0q)) {
                        c130485ut.A0B = (EnumC132745yx) EnumC132745yx.A01.get(c16l.A1Q());
                    } else if ("two_by_three_item".equals(A0q)) {
                        c130485ut.A07 = AbstractC130495uu.parseFromJson(c16l);
                    } else if ("ad_item".equals(A0q)) {
                        c130485ut.A00 = AbstractC123765iq.parseFromJson(c16l);
                    } else if ("ad_position".equals(A0q)) {
                        c130485ut.A0C = Integer.valueOf(c16l.A1D());
                    }
                }
                c16l.A0z();
            }
            return c130485ut;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
