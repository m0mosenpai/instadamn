package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VTN {
    public static C69353Vlz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69353Vlz c69353Vlz = new C69353Vlz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("color".equals(A0s)) {
                    c69353Vlz.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("logging_token".equals(A0s)) {
                    c69353Vlz.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("document_element_type".equals(A0s)) {
                    EnumHelper.A00(c16l.A1Q(), EnumC72406Xct.A06);
                } else if ("element_descriptor".equals(A0s)) {
                    c69353Vlz.A00 = AbstractC68495VTa.parseFromJson(c16l);
                } else if ("element_text".equals(A0s)) {
                    c69353Vlz.A01 = AbstractC68498VTd.parseFromJson(c16l);
                } else if ("style_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            EnumC72381XcH enumC72381XcH = (EnumC72381XcH) EnumHelper.A00(c16l.A1Q(), EnumC72381XcH.A02);
                            if (enumC72381XcH != null) {
                                arrayList.add(enumC72381XcH);
                            }
                        }
                    }
                    c69353Vlz.A05 = arrayList;
                } else if ("android_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69230Vjy parseFromJson = VTM.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69353Vlz.A04 = arrayList;
                }
                c16l.A0z();
            }
            return c69353Vlz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
