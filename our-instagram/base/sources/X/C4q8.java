package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.4q8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4q8 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.4q9] */
    public static C105954q9 parseFromJson(C16L c16l) {
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
                String str = null;
                if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A05 = str;
                } else if ("payload".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A03 = str;
                } else if ("is_default".equals(A0q)) {
                    obj.A00 = Boolean.valueOf(c16l.A0d());
                } else if ("vertical".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A06 = str;
                } else if ("subvertical".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A04 = str;
                } else if ("ib_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A02 = str;
                } else if ("ib_cta_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A01 = str;
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

    public static void A00(AnonymousClass182 anonymousClass182, C105954q9 c105954q9) {
        anonymousClass182.A0d();
        String str = c105954q9.A05;
        if (str != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str);
        }
        String str2 = c105954q9.A03;
        if (str2 != null) {
            anonymousClass182.A0S("payload", str2);
        }
        Boolean bool = c105954q9.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_default", bool.booleanValue());
        }
        String str3 = c105954q9.A06;
        if (str3 != null) {
            anonymousClass182.A0S("vertical", str3);
        }
        String str4 = c105954q9.A04;
        if (str4 != null) {
            anonymousClass182.A0S("subvertical", str4);
        }
        String str5 = c105954q9.A02;
        if (str5 != null) {
            anonymousClass182.A0S("ib_id", str5);
        }
        String str6 = c105954q9.A01;
        if (str6 != null) {
            anonymousClass182.A0S("ib_cta_type", str6);
        }
        anonymousClass182.A0a();
    }
}
