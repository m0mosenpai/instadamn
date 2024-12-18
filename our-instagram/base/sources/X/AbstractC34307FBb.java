package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FBb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34307FBb {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FJk] */
    public static C34524FJk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sections".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34526FJm parseFromJson = AbstractC34310FBe.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("policy_link".equals(A0s)) {
                    obj.A00 = AbstractC34308FBc.parseFromJson(c16l);
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
