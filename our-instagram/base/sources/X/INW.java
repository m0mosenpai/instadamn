package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class INW {
    public static C38962HDo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38962HDo c38962HDo = new C38962HDo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1W(A0s)) {
                    c38962HDo.A02 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("last_item_timestamp".equals(A0s)) {
                        AbstractC31178DnM.A1I(c16l);
                    } else if ("clips_ads_items".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C38252Grv parseFromJson = AbstractC38251Gru.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c38962HDo.A01 = arrayList;
                    } else if (AbstractC37300Gc1.A1S(A0s)) {
                        c38962HDo.A00 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C37410Gdq.A00(c16l, c38962HDo, A0s);
                    }
                }
                c16l.A0z();
            }
            c38962HDo.A01();
            return c38962HDo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
