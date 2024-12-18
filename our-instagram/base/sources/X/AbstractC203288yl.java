package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203288yl {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.8ym] */
    public static C203298ym parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("overlay_drawable_data".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C203318yo parseFromJson = AbstractC203308yn.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("overlay_asset_data".equals(A0q)) {
                    obj.A02 = C5QC.A00(c16l);
                } else if ("karaoke_sticker_edits".equals(A0q)) {
                    obj.A01 = AbstractC226639zL.parseFromJson(c16l);
                } else if ("drawables_max_z".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
