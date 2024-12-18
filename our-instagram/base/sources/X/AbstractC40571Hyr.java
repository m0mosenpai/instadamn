package X;

import com.instagram.api.schemas.ColorAtTextRangeDict;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.Range;
import com.instagram.common.textwithentities.model.TextWithEntities;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hyr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40571Hyr {
    public static TextWithEntities parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            LinkAction linkAction = null;
            ArrayList arrayList3 = null;
            String str = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC58317Pt9.A00(94).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ColorAtTextRangeDict parseFromJson = AbstractC39838Hlm.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC58317Pt9.A00(111).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            InlineStyleAtRangeDict parseFromJson2 = AbstractC40031HpI.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC58317Pt9.A00(115).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    linkAction = (LinkAction) LinkAction.A01.get(A1P);
                    if (linkAction == null) {
                        linkAction = LinkAction.A04;
                    }
                } else if ("ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Range parseFromJson3 = AbstractC40202HsR.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    l = AbstractC37303Gc4.A0O(c16l, l, A0s, "timestamp");
                }
                c16l.A0z();
            }
            return new TextWithEntities(linkAction, l, str, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
