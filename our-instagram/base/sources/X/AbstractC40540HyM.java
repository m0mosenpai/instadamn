package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HyM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40540HyM {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IBj, java.lang.Object] */
    public static C40936IBj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                r4 = null;
                r4 = null;
                r4 = null;
                String A1P = null;
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        A1P = c16l.A1P();
                    }
                } else if (DialogModule.KEY_MESSAGE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        A1P = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1E(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        A1P = c16l.A1P();
                    }
                } else if ("ad_account_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        A1P = c16l.A1P();
                    }
                } else {
                    if ("admined_pages".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C38671GzC parseFromJson = AbstractC39726Hjw.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A00 = arrayList;
                    } else if ("payment_method_id".equals(A0q)) {
                        AbstractC31178DnM.A1I(c16l);
                    }
                    c16l.A0z();
                }
                C14360o3.A0B(A1P, 0);
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
