package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VTd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68498VTd {
    public static C69233Vk1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69233Vk1 c69233Vk1 = new C69233Vk1();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("__typename".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("depth".equals(A0s)) {
                    c69233Vk1.A00 = c16l.A1D();
                } else if ("text".equals(A0s)) {
                    c69233Vk1.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("block_type".equals(A0s)) {
                    c69233Vk1.A01 = (EnumC68173VEr) EnumHelper.A00(c16l.A1Q(), EnumC68173VEr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("inline_style_ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69120ViA parseFromJson = AbstractC68497VTc.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69233Vk1.A03 = arrayList;
                }
                c16l.A0z();
            }
            return c69233Vk1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
