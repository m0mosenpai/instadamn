package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.DqN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31358DqN {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IGe] */
    public static C41061IGe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("header".equals(A0q)) {
                    obj.A00 = F9I.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("action_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C38669GzA parseFromJson = F9H.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A01 = arrayList;
                    } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C47O parseFromJson2 = AbstractC31357DqM.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A02 = arrayList;
                    }
                }
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
