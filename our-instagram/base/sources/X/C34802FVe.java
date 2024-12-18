package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FVe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34802FVe {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.ECr, X.EfV, X.1um] */
    public static EfV parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE.equals(A0s)) {
                        c40791um.A00 = c16l.A1D();
                    } else if (!AbstractC31171DnF.A1Z(A0s) && !"logged_in_user".equals(A0s) && !"created_user".equals(A0s)) {
                        C34935FaL c34935FaL = null;
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = null;
                        c34935FaL = null;
                        if ("token".equals(A0s)) {
                            c40791um.A0C = AbstractC167017dG.A0m(c16l);
                        } else if ("dryrun_passed".equals(A0s)) {
                            c40791um.A0G = c16l.A0d();
                        } else if ("username_suggestions".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList);
                                }
                            }
                            c40791um.A0E = arrayList;
                        } else if ("username_suggestions_with_metadata".equals(A0s)) {
                            c40791um.A04 = AbstractC34295FAp.parseFromJson(c16l);
                        } else if ("buttons".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList2 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    FM7 parseFromJson = F8X.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        arrayList2.add(parseFromJson);
                                    }
                                }
                            }
                            c40791um.A0F = arrayList2;
                        } else if ("fb_access_token".equals(A0s)) {
                            c40791um.A07 = AbstractC167017dG.A0m(c16l);
                        } else if ("new_account_nux".equals(A0s)) {
                            c40791um.A02 = F8V.parseFromJson(c16l);
                        } else if ("errors".equals(A0s)) {
                            C16R A112 = c16l.A11();
                            if (A112 == c16r) {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                StringBuilder A1C2 = AbstractC166987dD.A1C();
                                while (c16l.A1J() != c16r2) {
                                    if (A1C.length() > 0) {
                                        A1C.append(',');
                                    }
                                    A1C.append(c16l.A0q());
                                    c16l.A1J();
                                    while (c16l.A1J() != C16R.A08) {
                                        if (c16l.A11() == c16r) {
                                            C34446FGk parseFromJson2 = F8S.parseFromJson(c16l);
                                            if (A1C2.length() > 0) {
                                                A1C2.append('\n');
                                            }
                                            A1P = parseFromJson2.A00;
                                        } else {
                                            if (A1C2.length() > 0) {
                                                A1C2.append('\n');
                                            }
                                            A1P = c16l.A1P();
                                        }
                                        A1C2.append(A1P);
                                    }
                                }
                                c34935FaL = new C34935FaL(A1C.toString(), A1C2.toString());
                            } else if (A112 == C16R.A0C) {
                                c16l.A0z();
                            }
                            c40791um.A01 = c34935FaL;
                        } else if ("force_qe_sync".equals(A0s)) {
                            c40791um.A0H = c16l.A0d();
                        } else if ("tos_version".equals(A0s)) {
                            c40791um.A0B = AbstractC167017dG.A0m(c16l);
                        } else if ("mac_login_nonce".equals(A0s)) {
                            c40791um.A0A = AbstractC167017dG.A0m(c16l);
                        } else if (AbstractC31182DnR.A01().equals(A0s)) {
                            c40791um.A0D = AbstractC167017dG.A0m(c16l);
                        } else if ("content".equals(A0s)) {
                            c40791um.A03 = AbstractC34262F9i.parseFromJson(c16l);
                        } else if ("help_url".equals(A0s)) {
                            c40791um.A08 = AbstractC167017dG.A0m(c16l);
                        } else if ("help_url_text".equals(A0s)) {
                            c40791um.A09 = AbstractC167017dG.A0m(c16l);
                        } else if ("bolded_text".equals(A0s)) {
                            c40791um.A06 = AbstractC167017dG.A0m(c16l);
                        } else {
                            AbstractC34814FVq.A00(c16l, c40791um, A0s);
                        }
                    } else {
                        c40791um.A05 = AbstractC31171DnF.A0S(c16l, false);
                    }
                    c16l.A0z();
                } else {
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
