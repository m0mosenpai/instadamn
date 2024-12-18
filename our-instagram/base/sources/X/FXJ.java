package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FXJ {
    public static C33135Eje parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33135Eje c33135Eje = new C33135Eje();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("tabs".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            FHN parseFromJson = FB9.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c33135Eje.A05 = arrayList;
                } else if ("save_media_response".equals(A0s)) {
                    c33135Eje.A03 = FXI.parseFromJson(c16l);
                } else if ("save_igtv_response".equals(A0s)) {
                    c33135Eje.A02 = C41314IQk.parseFromJson(c16l);
                } else if ("save_clips_response".equals(A0s)) {
                    c33135Eje.A00 = C37410Gdq.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2082).equals(A0s)) {
                    c33135Eje.A04 = C70139W6r.parseFromJson(c16l);
                } else if ("story_sticker_media".equals(A0s)) {
                    c33135Eje.A01 = AbstractC31176DnK.A0Y(c16l);
                } else {
                    FB4.A00(c16l, c33135Eje, A0s);
                }
                c16l.A0z();
            }
            return c33135Eje;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
