package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SLU {
    public final List A00;
    public final C51u A01;
    public final C51u A02;

    public SLU(C51u c51u, C51u c51u2) {
        AbstractC167017dG.A1P(c51u, c51u2);
        this.A02 = c51u;
        this.A01 = c51u2;
        this.A00 = AbstractC166987dD.A1E();
    }

    public final ArrayList A00(Integer num, boolean z, boolean z2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        List<C09530e4> list = this.A00;
        if (!z) {
            list = AbstractC001800i.A0Y(list);
        }
        for (C09530e4 c09530e4 : list) {
            if ((num == C05F.A01 && C14360o3.A0K(((Rg5) c09530e4.A00).A00, "encrypted_report")) || ((num == C05F.A00 && C14360o3.A0K(((Rg5) c09530e4.A00).A00, "match_key")) || num == C05F.A0C)) {
                int i = 0;
                do {
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    byte[] bArr = (byte[]) AbstractC09570e8.A00((C51u) c09530e4.A01).get(i);
                    A0q.put("public_key", AbstractC09570e8.A00(this.A02).get(i));
                    A0q.put("helper_domain", AbstractC09570e8.A00(this.A01).get(i));
                    String str = ((Rg5) c09530e4.A00).A00;
                    C14360o3.A0B(bArr, 0);
                    A0q.put(str, AbstractC009903n.A08("", C65038TcT.A00, bArr));
                    if (z2) {
                        A0q.put("operating_system", "Android");
                    }
                    A1E.add(A0q);
                    i++;
                } while (i < 3);
                if (!z) {
                    break;
                }
            }
        }
        return A1E;
    }
}
