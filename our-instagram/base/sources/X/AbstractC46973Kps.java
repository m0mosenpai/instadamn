package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kps, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46973Kps {
    public static C29761br parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29761br c29761br = new C29761br();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("rooms_link_share".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C910143t parseFromJson = AbstractC910043s.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c29761br.A05 = arrayList;
                } else if ("link".equals(A0s)) {
                    c29761br.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("room_name".equals(A0s)) {
                    c29761br.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("is_audio_only_call".equals(A0s)) {
                    c29761br.A06 = c16l.A0d();
                } else if ("link_hash".equals(A0s)) {
                    c29761br.A03 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(607).equals(A0s)) {
                    c29761br.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c29761br.A00 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29761br, A0s);
                }
                c16l.A0z();
            }
            return c29761br;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
