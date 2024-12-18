package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3Vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74353Vr {
    public static C74433Vz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Integer num = null;
            ArrayList arrayList3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("image_hints".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ExtendedImageUrl parseFromJson = C17Y.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C74413Vx parseFromJson2 = AbstractC74363Vs.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("version".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("video_hints".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                            if (A0C != null) {
                                arrayList3.add(A0C);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                c16l.A0z();
            }
            return new C74433Vz(num, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
