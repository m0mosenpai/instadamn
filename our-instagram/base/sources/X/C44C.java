package X;

import java.io.IOException;

/* renamed from: X.44C, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C44C {
    public static C44J parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C44H c44h = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("consumption_sheet_config".equals(A0q)) {
                    c44h = C44D.parseFromJson(c16l);
                } else if ("has_active_fundraiser".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_facebook_onboarded_charity".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("pk", "FundraiserDonateActionButtonModelImpl");
                throw C00O.createAndThrow();
            }
            return new C44J(c44h, bool, bool2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C44J c44j) {
        anonymousClass182.A0d();
        C44I c44i = c44j.A00;
        if (c44i != null) {
            anonymousClass182.A0r("consumption_sheet_config");
            C44D.A00(anonymousClass182, c44i.F55());
        }
        Boolean bool = c44j.A01;
        if (bool != null) {
            anonymousClass182.A0T("has_active_fundraiser", bool.booleanValue());
        }
        Boolean bool2 = c44j.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("is_facebook_onboarded_charity", bool2.booleanValue());
        }
        String str = c44j.A03;
        if (str != null) {
            anonymousClass182.A0S("pk", str);
        }
        anonymousClass182.A0a();
    }
}
