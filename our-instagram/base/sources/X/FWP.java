package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FWP {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FN1] */
    public static FN1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attempts".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("remaining_steps".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34954Fae parseFromJson = AbstractC34274F9u.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                } else if ("is_exposed".equals(A0s)) {
                    obj.A02 = AbstractC166997dE.A0d(c16l);
                } else if ("flow_type".equals(A0s)) {
                    obj.A01 = AbstractC34347FCp.A00(c16l.A1Q());
                } else if ("position".equals(A0s)) {
                    obj.A03 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static String A00(FN1 fn1) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        A0S.A0Q("attempts", fn1.A00);
        if (fn1.A04 != null) {
            C16V.A03(A0S, "remaining_steps");
            for (C34954Fae c34954Fae : fn1.A04) {
                if (c34954Fae != null) {
                    A0S.A0d();
                    String str = c34954Fae.A03;
                    if (str != null) {
                        A0S.A0S("title_text", str);
                    }
                    String str2 = c34954Fae.A01;
                    if (str2 != null) {
                        A0S.A0S("content_text", str2);
                    }
                    EnumC33522Erv enumC33522Erv = c34954Fae.A00;
                    if (enumC33522Erv != null) {
                        A0S.A0S(OptSvcAnalyticsStore.LOGGING_KEY_STEP, enumC33522Erv.name());
                    }
                    String str3 = c34954Fae.A02;
                    if (str3 != null) {
                        A0S.A0S("qualifying_value", str3);
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        Boolean bool = fn1.A02;
        if (bool != null) {
            A0S.A0T("is_exposed", bool.booleanValue());
        }
        EnumC33445EqI enumC33445EqI = fn1.A01;
        if (enumC33445EqI != null) {
            A0S.A0S("flow_type", enumC33445EqI.A00);
        }
        Integer num = fn1.A03;
        if (num != null) {
            A0S.A0Q("position", num.intValue());
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
