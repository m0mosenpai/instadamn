package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87693vd {
    public static C87703ve parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ad_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("position".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(new Float(c16l.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C87703ve(str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C87703ve c87703ve) {
        anonymousClass182.A0d();
        String str = c87703ve.A00;
        if (str != null) {
            anonymousClass182.A0S("ad_id", str);
        }
        List<Number> list = c87703ve.A03;
        if (list != null) {
            C16V.A03(anonymousClass182, "position");
            for (Number number : list) {
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
        }
        String str2 = c87703ve.A01;
        if (str2 != null) {
            anonymousClass182.A0S("subtitle", str2);
        }
        String str3 = c87703ve.A02;
        if (str3 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str3);
        }
        anonymousClass182.A0a();
    }
}
