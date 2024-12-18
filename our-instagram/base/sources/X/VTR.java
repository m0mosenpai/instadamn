package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VTR {
    public static C69298Vl6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69298Vl6 c69298Vl6 = new C69298Vl6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("show_see_more_chrome".equals(A0s)) {
                    c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("background_color".equals(A0s)) {
                        c69298Vl6.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("tracking_token".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("analytics".equals(A0s)) {
                        c69298Vl6.A00 = VTL.parseFromJson(c16l);
                    } else if ("document_body_elements".equals(A0s)) {
                        c69298Vl6.A01 = VTQ.parseFromJson(c16l);
                    } else if ("third_party_logging_urls".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c69298Vl6.A04 = arrayList;
                    } else if ("style_list".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                EnumC72387XcN enumC72387XcN = (EnumC72387XcN) EnumHelper.A00(c16l.A1Q(), EnumC72387XcN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                if (enumC72387XcN != null) {
                                    arrayList.add(enumC72387XcN);
                                }
                            }
                        }
                        c69298Vl6.A03 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c69298Vl6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
