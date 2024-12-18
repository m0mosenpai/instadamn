package X;

import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203408yx {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8qz, java.lang.Object] */
    public static C198998qz parseFromJson(C16L c16l) {
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
                boolean z = true;
                if ("free_transform_edits".equals(A0q)) {
                    C203428yz parseFromJson = AbstractC203418yy.parseFromJson(c16l);
                    if (parseFromJson == null) {
                        z = false;
                        parseFromJson = null;
                    }
                    obj.A04 = new C198988qy(z, parseFromJson);
                } else if ("filter_id".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                } else if ("post_capture_ar_effect".equals(A0q)) {
                    obj.A01 = AbstractC120315cU.parseFromJson(c16l);
                } else if ("visual_info".equals(A0q)) {
                    obj.A05 = AbstractC203438z0.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("transform_matrix_configs".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                TransformMatrixConfig parseFromJson2 = C55Y.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A09 = arrayList;
                    } else if ("transform_matrix_config".equals(A0q)) {
                        obj.A03 = C55Y.parseFromJson(c16l);
                    } else if ("crop_info".equals(A0q)) {
                        obj.A02 = AbstractC203458z2.parseFromJson(c16l);
                    } else if ("should_render_drawables_in_unified_layer".equals(A0q)) {
                        obj.A0A = c16l.A0d();
                    } else if ("ai_filter_colors".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        obj.A08 = arrayList;
                    }
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
