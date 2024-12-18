package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KrM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47065KrM {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.7Q5, java.lang.Object] */
    public static C7Q5 parseFromJson(C16L c16l) {
        C55h c55h;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("mediaType".equals(A0s)) {
                    obj.A01 = AbstractC47866LCm.A00(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("photo_path".equals(A0s)) {
                        obj.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("video_path".equals(A0s)) {
                        obj.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("aspectPostCrop".equals(A0s)) {
                        obj.A00 = (float) c16l.A0U();
                    } else if (AbstractC111324zv.A00(3208).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C84823qW parseFromJson = AbstractC1123155i.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A07 = arrayList;
                    } else if ("is_awaiting_burn_in".equals(A0s)) {
                        obj.A08 = c16l.A0d();
                    } else if ("view_mode".equals(A0s)) {
                        obj.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("pending_media".equals(A0s)) {
                        obj.A02 = C47Y.parseFromJson(c16l);
                    } else if ("pending_media_key".equals(A0s)) {
                        obj.A03 = AbstractC167017dG.A0m(c16l);
                    }
                }
                c16l.A0z();
            }
            C47Z c47z = obj.A02;
            if (c47z != null) {
                if (obj.A03 == null) {
                    obj.A03 = c47z.A35;
                }
                if (obj.A07 == null) {
                    obj.A07 = c47z.A4b;
                }
                if (obj.A06 == null && (c55h = c47z.A1R) != null) {
                    obj.A06 = c55h.A02;
                }
                obj.A02 = null;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
