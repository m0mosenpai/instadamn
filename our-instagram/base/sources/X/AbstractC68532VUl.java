package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68532VUl {
    public static C69300Vl8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69300Vl8 c69300Vl8 = new C69300Vl8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c69300Vl8.A01 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    c69300Vl8.A00 = (EnumC53284NhM) EnumHelper.A00(c16l.A1Q(), EnumC53284NhM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("int_values".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC65702TsY.A1L(c16l, arrayList);
                        }
                    }
                    c69300Vl8.A03 = arrayList;
                } else if ("float_values".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Double valueOf = Double.valueOf(c16l.A0U());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    }
                    c69300Vl8.A02 = arrayList;
                } else if ("string_values".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c69300Vl8.A04 = arrayList;
                }
                c16l.A0z();
            }
            return c69300Vl8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
