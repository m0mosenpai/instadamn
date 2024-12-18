package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I1P {
    public static C51760Mtj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fromVersion".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("toVersion".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("mediaUpdates".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51757Mtg parseFromJson = F8I.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new C51760Mtj(num, num2, arrayList, 43);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
