package X;

import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FVc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34800FVc {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDH, X.1um, X.1ul] */
    public static EDH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("action".equals(A0s)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("uri".equals(A0s)) {
                    c40791um.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("render_type".equals(A0s)) {
                    c16l.A1D();
                } else if ("bloks_action".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("uid".equals(A0s)) {
                    c40791um.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("nonce".equals(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("cni".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("challenge_context".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("dialog_title".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("dialog_message".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("accounts".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AssistAccountRecoveryResponse$UhlAccount parseFromJson = F8R.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A09 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
