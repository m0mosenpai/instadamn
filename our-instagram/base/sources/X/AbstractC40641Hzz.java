package X;

import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hzz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40641Hzz {
    public static C38644Gyl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C38011pl c38011pl = null;
            String str = null;
            String str2 = null;
            ContextualAdResponseExtrasImpl contextualAdResponseExtrasImpl = null;
            ArrayList arrayList2 = null;
            Boolean bool = null;
            H4K h4k = null;
            Long l = null;
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category_hash_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long A0h = AbstractC31173DnH.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("client_gap_rules".equals(A0s)) {
                    c38011pl = AbstractC38761r8.parseFromJson(c16l);
                } else if ("container_module".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("contextual_ads_category".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (Location.EXTRAS.equals(A0s)) {
                    contextualAdResponseExtrasImpl = AbstractC39850Hly.parseFromJson(c16l);
                } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList2.add(C3XG.A00(c16l));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC37300Gc1.A1W(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("multi_ads_info".equals(A0s)) {
                    h4k = AbstractC40094HqL.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1S(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (AbstractC111324zv.A00(1159).equals(A0s)) {
                    contextualAdResponseOrganicInfoImpl = AbstractC39851Hlz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38644Gyl(contextualAdResponseExtrasImpl, contextualAdResponseOrganicInfoImpl, h4k, c38011pl, bool, l, str, str2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
