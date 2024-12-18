package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.47z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC916447z {
    public static C47s parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47s c47s = new C47s();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                if ("video_frame_List".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C51580MqY parseFromJson = AbstractC54084Nvi.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c47s.A06 = arrayList;
                } else if ("compare_video_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c47s.A04 = str2;
                } else if ("frame_width".equals(A0q)) {
                    c47s.A02 = c16l.A1D();
                } else if ("frame_height".equals(A0q)) {
                    c47s.A01 = c16l.A1D();
                } else if ("render_block_time_ms".equals(A0q)) {
                    c47s.A03 = c16l.A0y();
                } else if ("ssim_disabled".equals(A0q)) {
                    c47s.A07 = c16l.A0d();
                } else if ("uumos_cs".equals(A0q)) {
                    c47s.A00 = c16l.A0U();
                } else if ("target_video_codec".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c47s.A05 = str;
                }
                c16l.A0z();
            }
            List unmodifiableList = Collections.unmodifiableList(c47s.A06);
            C14360o3.A07(unmodifiableList);
            c47s.A06 = unmodifiableList;
            return c47s;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
