package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VSW {
    public static C66646URk parseFromJson(C16L c16l) {
        VES ves;
        C14360o3.A0B(c16l, 0);
        try {
            C66646URk c66646URk = new C66646URk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("tokens".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            US9 parseFromJson = AbstractC69932Vxx.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c66646URk.A07 = arrayList;
                } else if ("duration".equals(A0s)) {
                    c66646URk.A01 = c16l.A1D();
                } else if ("karaoke_sticker_display_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    Map map = VES.A03;
                    if (map.containsKey(A1Q)) {
                        Object obj = map.get(A1Q);
                        C14360o3.A0A(obj);
                        ves = (VES) obj;
                    } else {
                        ves = VES.A07;
                    }
                    C14360o3.A0B(ves, 0);
                    c66646URk.A02 = ves;
                } else if ("color".equals(A0s)) {
                    c66646URk.A00 = c16l.A1D();
                } else if ("karaoke_sticker_emphasis_state".equals(A0s)) {
                    c66646URk.A03 = A2Y.A00(c16l.A1Q());
                } else if ("sticker_id".equals(A0s)) {
                    c66646URk.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("is_clips_v2_media".equals(A0s)) {
                    c66646URk.A08 = c16l.A0d();
                } else if ("text_color".equals(A0s)) {
                    c66646URk.A05 = AbstractC166997dE.A0h(c16l);
                } else if ("background_color".equals(A0s)) {
                    c66646URk.A04 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return c66646URk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
