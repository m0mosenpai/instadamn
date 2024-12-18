package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class LC6 {
    public static DirectAREffectShare parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            DirectAREffectShare directAREffectShare = new DirectAREffectShare();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("effect_id".equals(A0s)) {
                    directAREffectShare.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("effect_title".equals(A0s)) {
                    directAREffectShare.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("icon_url".equals(A0s)) {
                    directAREffectShare.A01 = AbstractC222616c.A00(c16l);
                } else if ("attribution_user_name".equals(A0s)) {
                    directAREffectShare.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("attribution_user_id".equals(A0s)) {
                    directAREffectShare.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("attribution_profile_picture_url".equals(A0s)) {
                    directAREffectShare.A00 = AbstractC222616c.A00(c16l);
                } else if ("data".equals(A0s)) {
                    directAREffectShare.A02 = AbstractC47049Kr6.parseFromJson(c16l);
                } else if ("preview_video".equals(A0s)) {
                    directAREffectShare.A03 = AbstractC38741r6.parseFromJson(c16l);
                } else if ("primary_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    directAREffectShare.A09 = arrayList;
                } else if ("secondary_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    directAREffectShare.A0A = arrayList;
                } else if ("shopping_info".equals(A0s)) {
                    directAREffectShare.A04 = AbstractC47070KrR.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return directAREffectShare;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DirectAREffectShare directAREffectShare) {
        anonymousClass182.A0d();
        String str = directAREffectShare.A07;
        if (str != null) {
            anonymousClass182.A0S("effect_id", str);
        }
        String str2 = directAREffectShare.A08;
        if (str2 != null) {
            anonymousClass182.A0S("effect_title", str2);
        }
        if (directAREffectShare.A01 != null) {
            anonymousClass182.A0r("icon_url");
            AbstractC222616c.A01(anonymousClass182, directAREffectShare.A01);
        }
        String str3 = directAREffectShare.A06;
        if (str3 != null) {
            anonymousClass182.A0S("attribution_user_name", str3);
        }
        String str4 = directAREffectShare.A05;
        if (str4 != null) {
            anonymousClass182.A0S("attribution_user_id", str4);
        }
        if (directAREffectShare.A00 != null) {
            anonymousClass182.A0r("attribution_profile_picture_url");
            AbstractC222616c.A01(anonymousClass182, directAREffectShare.A00);
        }
        if (directAREffectShare.A02 != null) {
            anonymousClass182.A0r("data");
            C45555KEu c45555KEu = directAREffectShare.A02;
            anonymousClass182.A0d();
            if (c45555KEu.A00 != null) {
                anonymousClass182.A0r("instagram_direct_effects");
                C47455Kxk c47455Kxk = c45555KEu.A00;
                anonymousClass182.A0d();
                if (c47455Kxk.A00 != null) {
                    anonymousClass182.A0r("target_effect_preview");
                    C47697L4e c47697L4e = c47455Kxk.A00;
                    anonymousClass182.A0d();
                    String str5 = c47697L4e.A05;
                    if (str5 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
                    }
                    String str6 = c47697L4e.A06;
                    if (str6 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str6);
                    }
                    EnumC223179sw enumC223179sw = c47697L4e.A04;
                    if (enumC223179sw != null) {
                        anonymousClass182.A0S("device_position", enumC223179sw.toString());
                    }
                    if (c47697L4e.A00 != null) {
                        anonymousClass182.A0r("attribution_user");
                        C47636L1v c47636L1v = c47697L4e.A00;
                        anonymousClass182.A0d();
                        String str7 = c47636L1v.A01;
                        if (str7 != null) {
                            anonymousClass182.A0S("instagram_user_id", str7);
                        }
                        String str8 = c47636L1v.A02;
                        if (str8 != null) {
                            anonymousClass182.A0S(AbstractC34875FYk.A00(30, 8, 0), str8);
                        }
                        if (c47636L1v.A00 != null) {
                            anonymousClass182.A0r("profile_picture");
                            C47453Kxi c47453Kxi = c47636L1v.A00;
                            anonymousClass182.A0d();
                            String str9 = c47453Kxi.A00;
                            if (str9 != null) {
                                anonymousClass182.A0S("uri", str9);
                            }
                            anonymousClass182.A0a();
                        }
                        anonymousClass182.A0a();
                    }
                    if (c47697L4e.A01 != null) {
                        anonymousClass182.A0r("effect_action_sheet");
                        L0D l0d = c47697L4e.A01;
                        anonymousClass182.A0d();
                        if (l0d.A00 != null) {
                            C16V.A03(anonymousClass182, "primary_actions");
                            for (Object obj : l0d.A00) {
                                if (obj != null) {
                                    anonymousClass182.A0u(obj.toString());
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        if (l0d.A01 != null) {
                            C16V.A03(anonymousClass182, "secondary_actions");
                            for (Object obj2 : l0d.A01) {
                                if (obj2 != null) {
                                    anonymousClass182.A0u(obj2.toString());
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        anonymousClass182.A0a();
                    }
                    if (c47697L4e.A02 != null) {
                        anonymousClass182.A0r("fan_club");
                        L0E l0e = c47697L4e.A02;
                        anonymousClass182.A0d();
                        String str10 = l0e.A00;
                        if (str10 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str10);
                        }
                        String str11 = l0e.A01;
                        if (str11 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str11);
                        }
                        anonymousClass182.A0a();
                    }
                    if (c47697L4e.A03 != null) {
                        anonymousClass182.A0r("thumbnail_image");
                        C47454Kxj c47454Kxj = c47697L4e.A03;
                        anonymousClass182.A0d();
                        String str12 = c47454Kxj.A00;
                        if (str12 != null) {
                            anonymousClass182.A0S("uri", str12);
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (directAREffectShare.A03 != null) {
            anonymousClass182.A0r("preview_video");
            AbstractC38741r6.A00(anonymousClass182, directAREffectShare.A03);
        }
        if (directAREffectShare.A09 != null) {
            C16V.A03(anonymousClass182, "primary_actions");
            Iterator it = directAREffectShare.A09.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        if (directAREffectShare.A0A != null) {
            C16V.A03(anonymousClass182, "secondary_actions");
            Iterator it2 = directAREffectShare.A0A.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it2);
            }
            anonymousClass182.A0Z();
        }
        if (directAREffectShare.A04 != null) {
            anonymousClass182.A0r("shopping_info");
            ProductAREffectContainer productAREffectContainer = directAREffectShare.A04;
            anonymousClass182.A0d();
            if (productAREffectContainer.A00 != null) {
                anonymousClass182.A0r("effect_product");
                IR9.A00(anonymousClass182, productAREffectContainer.A00);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
