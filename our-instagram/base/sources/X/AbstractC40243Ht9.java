package X;

import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ht9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40243Ht9 {
    public static H5B parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ShowreelNativeClientName showreelNativeClientName = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("animation_payload".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("assets".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("assets_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H5C parseFromJson = AbstractC40245HtB.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("client_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    showreelNativeClientName = (ShowreelNativeClientName) ShowreelNativeClientName.A01.get(A1P);
                    if (showreelNativeClientName == null) {
                        showreelNativeClientName = ShowreelNativeClientName.A0l;
                    }
                } else if ("content".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("logging_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("template_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, IgReactMediaPickerNativeModule.WIDTH);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("animation_payload", c16l, "ShowreelNativeAnimationImpl");
            } else if (showreelNativeClientName != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("content", c16l, "ShowreelNativeAnimationImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("template_name", c16l, "ShowreelNativeAnimationImpl");
                } else {
                    return new H5B(showreelNativeClientName, num, num2, str, str2, str3, str4, arrayList, arrayList2);
                }
            } else {
                AbstractC166997dE.A1V("client_name", c16l, "ShowreelNativeAnimationImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
