package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.quickpromotion.model.FilterType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4Na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC94484Na {
    public static C94494Nb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C94494Nb c94494Nb = new C94494Nb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("filter_type".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    FilterType filterType = (FilterType) FilterType.A01.get(A1Q);
                    if (filterType == null) {
                        filterType = FilterType.A19;
                    }
                    c94494Nb.A00 = filterType;
                } else {
                    ArrayList arrayList = null;
                    String str = null;
                    if ("unknown_action".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c94494Nb.A02 = str;
                    } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                        c94494Nb.A01 = AbstractC94504Nd.parseFromJson(c16l);
                    } else if ("extra_datas".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C94514Ne parseFromJson = AbstractC94504Nd.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c94494Nb.A03 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c94494Nb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
