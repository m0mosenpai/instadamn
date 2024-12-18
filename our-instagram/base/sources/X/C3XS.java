package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObjImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3XS, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XS {
    public static BrandSafetyContentBlocklistBitmapQLObjImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("bitmap_array".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Integer valueOf = Integer.valueOf(c16l.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new BrandSafetyContentBlocklistBitmapQLObjImpl(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
