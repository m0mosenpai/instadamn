package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9IZ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9IZ {
    public static C9IV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9IV c9iv = new C9IV(false);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("clips_voiceover_segments".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C24239Ap6 parseFromJson = AbstractC226989zu.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c9iv.A05 = arrayList;
                } else if ("video_volume".equals(A0q)) {
                    c9iv.A03 = (float) c16l.A0U();
                } else if ("audio_overlay_volume".equals(A0q)) {
                    c9iv.A00 = (float) c16l.A0U();
                } else if ("voiceover_volume".equals(A0q)) {
                    c9iv.A04 = (float) c16l.A0U();
                } else if ("sound_effects_volume".equals(A0q)) {
                    c9iv.A01 = (float) c16l.A0U();
                } else if ("sticker_volume".equals(A0q)) {
                    c9iv.A02 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c9iv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
