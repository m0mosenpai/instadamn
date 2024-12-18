package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.IQk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41314IQk {
    public static C38900HAw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38900HAw c38900HAw = new C38900HAw();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0q = c16l.A0q();
                HashMap hashMap = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c38900HAw.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1E(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    EnumC39587Hdx enumC39587Hdx = (EnumC39587Hdx) EnumC39587Hdx.A01.get(A1Q);
                    if (enumC39587Hdx == null) {
                        enumC39587Hdx = EnumC39587Hdx.A0K;
                    }
                    c38900HAw.A00 = enumC39587Hdx;
                } else if (AbstractC31171DnF.A1a(A0q)) {
                    c38900HAw.A08 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1Q(A0q)) {
                    c38900HAw.A05 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    }
                    c38900HAw.A0A = arrayList;
                } else if ("live_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C105824pt parseFromJson = C41655Ibn.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c38900HAw.A0B = arrayList2;
                } else if ("max_id".equals(A0q)) {
                    c38900HAw.A06 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1W(A0q)) {
                    c38900HAw.A0D = c16l.A0d();
                } else if (MSV.A00(1150).equals(A0q)) {
                    c38900HAw.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("user_dict".equals(A0q)) {
                    c38900HAw.A02 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("seen_state".equals(A0q)) {
                    if (c16l.A11() == c16r) {
                        HashMap A1G = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                A1G.put(A1P, null);
                            } else {
                                C39684HjG parseFromJson2 = I1Y.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    A1G.put(A1P, parseFromJson2);
                                }
                            }
                        }
                        hashMap = A1G;
                    }
                    c38900HAw.A09 = hashMap;
                } else if ("has_post_live_on_profile".equals(A0q)) {
                    c38900HAw.A0C = c16l.A0d();
                } else if ("destination_client_configs".equals(A0q)) {
                    c38900HAw.A01 = I1U.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c38900HAw, A0q);
                }
                c16l.A0z();
            }
            Iterator it = c38900HAw.A0A.iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                if (!C38900HAw.A00(A0i)) {
                    it.remove();
                } else {
                    c38900HAw.A0F.put(A0i.getId(), A0i);
                    C39684HjG c39684HjG = (C39684HjG) c38900HAw.A09.get(A0i.A38());
                    if (c39684HjG != null) {
                        AbstractC37301Gc2.A1T(A0i.A38(), IBG.A00, c39684HjG.A00);
                    }
                }
            }
            List list = c38900HAw.A0B;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C105824pt c105824pt = (C105824pt) it2.next();
                    if (c105824pt.A02() == null) {
                        String str = c105824pt.A0X;
                        str.getClass();
                        C0w9.A03("InvalidLiveBroadcastInIGTVFeed", AnonymousClass001.A0R("id: ", str));
                        it2.remove();
                    } else {
                        Map map = c38900HAw.A0E;
                        String str2 = c105824pt.A0X;
                        str2.getClass();
                        map.put(str2, c105824pt);
                    }
                }
                return c38900HAw;
            }
            return c38900HAw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
