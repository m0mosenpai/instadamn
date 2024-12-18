package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F7a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34202F7a {
    /* JADX WARN: Type inference failed for: r6v1, types: [X.EtO, java.lang.Object] */
    public static C33612EtO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C33600EtC c33600EtC = null;
            C33559EsX c33559EsX = null;
            ArrayList arrayList = null;
            C33589Et1 c33589Et1 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("token".equals(A0s)) {
                    c33600EtC = AbstractC34206F7e.parseFromJson(c16l);
                } else if ("token_account".equals(A0s)) {
                    c33559EsX = AbstractC34205F7d.parseFromJson(c16l);
                } else if ("connected_accounts".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34554FKo parseFromJson = AbstractC34203F7b.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("continue_button".equals(A0s)) {
                    c33589Et1 = AbstractC34204F7c.parseFromJson(c16l);
                } else if ("error".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A01 = c33600EtC;
            obj.A02 = c33559EsX;
            obj.A03 = arrayList;
            obj.A00 = c33589Et1;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
